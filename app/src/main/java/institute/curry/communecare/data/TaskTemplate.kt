package institute.curry.communecare.data

data class TaskTemplate(
    val id: Long,
    val taskName: String,
    val taskDescription: String,
    val weight: Int
)
