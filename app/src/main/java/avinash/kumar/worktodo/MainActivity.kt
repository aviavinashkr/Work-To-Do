package avinash.kumar.worktodo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import avinash.kumar.worktodo.ToDoListeners.OnItemClicked
import avinash.kumar.worktodo.adapter.AdapterToDo
import avinash.kumar.worktodo.database.WorkToDoDatabase
import avinash.kumar.worktodo.modelstodo.ModelToDo
import avinash.kumar.worktodo.screens.ViewConnection
import avinash.kumar.worktodo.screens.ViewPresenter
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity(), ViewConnection.Views {
    lateinit var presenter: ViewPresenter
    lateinit var Adapter: AdapterToDo
    lateinit var database: WorkToDoDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        database = WorkToDoDatabase.getInstance(this)
        Log.e("AXE", "====== > ${database.work2Do.getAllWorkFromDatabase()}")      // emT
        presenter = ViewPresenter(this)
        Log.e("AXE", "*****> ${presenter._views?.getWork()?.work}")          // emT

    }

    override fun setupView() {
        Adapter = AdapterToDo(this, object : OnItemClicked {
            override fun onClickItem(position: Int) {
                database.work2Do.deleteTask(Adapter.list[position])
                Adapter.deleteItem(position)
            }

        })
        recycler.apply {
            layoutManager = LinearLayoutManager(applicationContext)
            adapter = Adapter
        }

    }

    override fun setupListeners() {
        taskbtn.setOnClickListener {
            val work = editText.text.toString()
            if (work.equals("")) {
                Toast.makeText(this, "Write a Text", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            } else {
                presenter.addWorkToRecyclerView()
                presenter.addWorkToDatabase()
                editText.setText("")
            }
        }

        back_icon.setOnClickListener {
            System.exit(0);
        }

        about.setOnClickListener {
            val INTENT = Intent(this,AboutActivity::class.java)
            startActivity(INTENT)
        }

    }

    override fun getWork(): ModelToDo {
        return ModelToDo(
            Random.nextLong(), editText.text.toString()

        )
    }

    override fun addWorkToDatabase(items: ModelToDo) {
        Log.e("AXEP", "key : ${items.Key}")
        Log.e("AXEP", "work : ${items.work}")
        database.work2Do.addWork(items)
    }

    override fun deleteWorkFromDatabase(items: ModelToDo) {
        database.work2Do.deleteTask(items)
    }

    override fun getAllWorkFromDatabase(): List<ModelToDo> {
        return database.work2Do.getAllWorkFromDatabase()
    }

    override fun addWorkToList(list: ArrayList<ModelToDo>) {
        Adapter.setItem(list)
    }

    override fun addWorkRecyclerView(items: ModelToDo) {
        Adapter.addItem(items)
    }
}
