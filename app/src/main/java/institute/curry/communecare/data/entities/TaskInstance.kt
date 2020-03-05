package institute.curry.communecare.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class TaskInstance(
    @PrimaryKey val id: Long,
    @ColumnInfo(name = "template_id") val templateId: Long,
    @ColumnInfo(name = "assigned_user_id") val assignedUserId: Long,
    @ColumnInfo(name = "date_time_assigned") val dateTimeAssigned: Date,
    @ColumnInfo(name = "is_task_done") val isTaskDone: Boolean
)