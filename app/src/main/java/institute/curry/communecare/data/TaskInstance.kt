package institute.curry.communecare.data

import java.util.*

data class TaskInstance(
    val id: Long,
    val assignedUserId: Long,
    val dateTimeAssigned: Date,
    val taskDone: Boolean
)