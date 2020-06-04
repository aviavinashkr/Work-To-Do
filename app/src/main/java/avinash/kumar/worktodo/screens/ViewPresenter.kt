package avinash.kumar.worktodo.screens

import android.util.Log
import avinash.kumar.worktodo.modelstodo.ModelToDo

class ViewPresenter(var _views: ViewConnection.Views?) : ViewConnection.Actions {
    init {
        initScreen()
    }

    override fun initScreen() {
        _views?.setupView()
        _views?.setupListeners()

        fetchAllWorkFromDatabase()

    }

    override fun addWorkToRecyclerView() {
        Log.e("AXE", "+ => ${_views?.getWork()}")
        val m2do: ModelToDo = _views?.getWork()!!
        _views?.addWorkRecyclerView(m2do)
    }

    override fun addWorkToDatabase() {
        val m2do: ModelToDo = _views?.getWork()!!
        _views?.addWorkToDatabase(m2do)

    }


    override fun fetchAllWorkFromDatabase() {
        Log.e("AXE", "fetch all work  ==> ${_views?.getAllWorkFromDatabase() as ArrayList}")

        _views?.addWorkToList(_views?.getAllWorkFromDatabase() as ArrayList)

    }
}