package bg.o.sim.application.web

import org.springframework.data.annotation.Id

/**
 * Contains an ID member that will be used by the underlining MongoDB instance for indexing, fetching and identifying records.
 *
 * All items that are to be persisted *MUST* extend (directly or not) from BaseEntity!
 *
 * That also applies to *ALL* classes annotated with [ExposedModel][bg.o.sim.annotations.ExposedModel]!
 *
 * @since v0.1.0
 *
 * @author Simo Andreev <github.com/simo-andreev | simeon.zlatanov.andreev@gmail.com>
 */
abstract class BaseEntity {
    @Id
    var id: String? = null
}