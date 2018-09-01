package bg.o.sim.annotation

import bg.o.sim.web.BaseEntity
import com.google.auto.service.AutoService

import javax.annotation.processing.AbstractProcessor
import javax.annotation.processing.Processor
import javax.annotation.processing.RoundEnvironment
import javax.lang.model.element.Element
import javax.lang.model.element.ElementKind
import javax.lang.model.element.TypeElement
import javax.tools.Diagnostic
import java.util.Collections

@AutoService(Processor::class)
class ApiGenerator : AbstractProcessor() {

    override fun getSupportedAnnotationTypes(): Set<String> {
        return setOf(ExposedModel::class.java.canonicalName)
    }

    override fun process(annotations: Set<TypeElement>, roundEnv: RoundEnvironment): Boolean {

        for (element in roundEnv.getElementsAnnotatedWith(ExposedModel::class.java)) {
            if (element.kind != ElementKind.CLASS) {
                val error = ExposedModel::class.java.toString() + " can only be applied to classes! " +
                        "Failed for [" + element.simpleName + "]"
                processingEnv.messager.printMessage(Diagnostic.Kind.ERROR, error)
                return true
            }

            if (!elementIsBaseEntity(element)) {
                val error = ExposedModel::class.java.toString() + " can only be applied to bg.o.sim.web.BaseEntity subclasses! " +
                        "Failed for [" + element.simpleName + "]"
                processingEnv.messager.printMessage(Diagnostic.Kind.ERROR, error)
                return true
            }
        }


        return true
    }

    private fun elementIsBaseEntity(element: Element): Boolean {
        return processingEnv
                .typeUtils
                .isSubtype(
                        element.asType(),
                        processingEnv.elementUtils.getTypeElement(BaseEntity::class.java.name).asType()
                )
    }


}
