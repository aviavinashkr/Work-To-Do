package avinash.kumar.worktodo.modelstodo

import android.os.SystemClock
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "WorkToDo_table")
data class ModelToDo(
    @PrimaryKey
    var Key: Long,

    @ColumnInfo(name = "work")
    var work: String
)
