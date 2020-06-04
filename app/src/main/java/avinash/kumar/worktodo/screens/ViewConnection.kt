package avinash.kumar.worktodo.screens

import avinash.kumar.worktodo.modelstodo.ModelToDo

interface ViewConnection {
    interface Views {
        fun setupView()
        fun setupListeners()
        fun getWork(): ModelToDo
        fun addWorkToDatabase(items: ModelToDo)
        fun deleteWorkFromDatabase(items: ModelToDo)
        fun getAllWorkFromDatabase(): List<ModelToDo>
        fun addWorkToList(list: ArrayList<ModelToDo>)
        fun addWorkRecyclerView(items: ModelToDo)
    }

    interface Actions {
        fun initScreen()
        fun addWorkToRecyclerView()
        fun addWorkToDatabase()
        fun fetchAllWorkFromDatabase()

    }
}

