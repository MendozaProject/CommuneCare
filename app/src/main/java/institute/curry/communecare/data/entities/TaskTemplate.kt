package institute.curry.communecare.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class TaskTemplate(
    @PrimaryKey val id: Long,
    @ColumnInfo(name = "task_name") val taskName: String,
    @ColumnInfo(name = "task_description") val taskDescription: String,
    @ColumnInfo(name = "weight") val weight: Int
) {
    val WEIGHT_DAILY = 1
    val WEIGHT_EVERY_OTHER_DAY = 2
    val WEIGHT_WEEKLY = 3
}