package avinash.kumar.worktodo.dao

import androidx.room.*
import avinash.kumar.worktodo.modelstodo.ModelToDo

@Dao
interface WorkToDoDao {
    @Query("select * from WorkToDo_table")
    fun getAllWorkFromDatabase(): List<ModelToDo>

    @Insert
    fun addWork(item: ModelToDo)

    @Delete
    fun deleteTask(item: ModelToDo)

}