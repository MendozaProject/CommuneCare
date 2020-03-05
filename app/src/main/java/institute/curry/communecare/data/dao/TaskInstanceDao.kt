package institute.curry.communecare.data.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import institute.curry.communecare.data.entities.TaskInstance
import java.util.*

@Dao
interface TaskInstanceDao {
    @Query("SELECT * FROM TaskInstance")
    fun getAll(): LiveData<List<TaskInstance>>

    @Query("SELECT * FROM TaskInstance WHERE id = (:id)")
    fun getById(id: Long): LiveData<TaskInstance>

    @Query("SELECT * FROM TaskInstance WHERE template_id = (:templateId)")
    fun getByTemplateId(templateId: Long): LiveData<List<TaskInstance>>

    @Query("Select * FROM TaskInstance WHERE date_time_assigned = (:taskDate)")
    fun getTask(taskDate: Date): LiveData<TaskInstance>

    @Insert
    fun insert(vararg taskInstance: TaskInstance)

    @Delete
    fun delete(taskInInstance: TaskInstance)
}