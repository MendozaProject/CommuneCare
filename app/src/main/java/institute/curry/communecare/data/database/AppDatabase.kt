package institute.curry.communecare.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import institute.curry.communecare.data.dao.TaskInstanceDao

@Database(entities = arrayOf(TaskInstanceDao::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun taskInstanceDao(): TaskInstanceDao
}