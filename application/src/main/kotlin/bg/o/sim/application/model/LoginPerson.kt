package bg.o.sim.application.model

import bg.o.sim.annotations.ExposedModel
import bg.o.sim.application.web.BaseEntity

@ExposedModel("login")
data class LoginPerson(
        val loanApplicationCount: Int,
        val loanCount: Int,
        val accountCount: Int,
        val tasks: Array<Task>
) : BaseEntity()

@ExposedModel("task")
data class Task(
        val status: String,
        val type: TaskType,
        val client: Client
) : BaseEntity()

@ExposedModel("client")
data class Client(
        val firstName: String,
        val lastName: String,
        val phoneNumber: String
) : BaseEntity()

enum class TaskType {
    LoanApplication, Loan, Account
}