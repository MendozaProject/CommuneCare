package institute.curry.communecare.data.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import institute.curry.communecare.data.entities.TaskTemplate

@Dao
interface TaskTemplateDao {
    @Query("SELECT * FROM TaskTemplate")
    fun getAll(): LiveData<List<TaskTemplate>>

    @Query("SELECT * FROM TaskTemplate WHERE id = (:id)")
    fun getById(id: Long): LiveData<TaskTemplate>

    @Insert
    fun insert(vararg taskInstance: TaskTemplate)

    @Delete
    fun delete(taskInInstance: TaskTemplate)
}