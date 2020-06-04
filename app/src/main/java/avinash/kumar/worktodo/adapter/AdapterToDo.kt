package avinash.kumar.worktodo.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatImageButton
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import avinash.kumar.worktodo.R
import avinash.kumar.worktodo.ToDoListeners.OnItemClicked
import avinash.kumar.worktodo.modelstodo.ModelToDo
import java.util.Collections.list

class AdapterToDo(var context: Context, var itemClicked: OnItemClicked) :
    RecyclerView.Adapter<AdapterToDo.Holder>() {

    var list = arrayListOf<ModelToDo>()

    fun setItem(items: ArrayList<ModelToDo>) {
        this.list.clear()
        this.list.addAll(items)
        notifyDataSetChanged()
    }

    fun addItem(items: ModelToDo) {
        list.add(items)
        notifyDataSetChanged()
    }

    fun deleteItem(position: Int) {
        list.removeAt(position)
        notifyItemRemoved(position)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        return Holder(itemView)
    }

    override fun getItemCount(): Int {
        return this.list.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.edit_work.text = list[position].work

    }

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val edit_work = itemView.findViewById<AppCompatTextView>(R.id.textView)
        val btn_delete = itemView.findViewById<AppCompatImageButton>(R.id.btnDelete)

        init {
            btn_delete.setOnClickListener {
                itemClicked.onClickItem(adapterPosition)

            }
        }

    }

}