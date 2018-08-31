package bg.o.sim

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id

data class Person(
        @Id var id : ObjectId?,
        val firstName: String,
        val lastName: String
)