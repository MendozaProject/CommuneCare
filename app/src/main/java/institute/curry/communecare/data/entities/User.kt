package institute.curry.communecare.data.entities

import android.graphics.Color
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User (
    @PrimaryKey val id: Long,
    @ColumnInfo(name = "user_name") val userName: String,
    @ColumnInfo(name = "color") val color: Color
)
