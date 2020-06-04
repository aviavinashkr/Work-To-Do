package avinash.kumar.worktodo.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import avinash.kumar.worktodo.dao.WorkToDoDao
import avinash.kumar.worktodo.modelstodo.ModelToDo
import java.security.AccessControlContext

@Database(entities = [ModelToDo::class], version = 1, exportSchema = false)
abstract class WorkToDoDatabase : RoomDatabase() {

    abstract val work2Do: WorkToDoDao

    companion object {

        val DATABASE_NAME = "WorkToDo_table"

        @Volatile
        var instance: WorkToDoDatabase? = null

        fun getInstance(contextView: Context): WorkToDoDatabase {
            synchronized(this) {
                if (instance == null) {
                    instance = Room.databaseBuilder(
                        contextView,
                        WorkToDoDatabase::class.java,
                        DATABASE_NAME
                    )
                        .allowMainThreadQueries()
                        .fallbackToDestructiveMigration()
                        .build()
                }
                return instance as WorkToDoDatabase
            }
        }
    }

}