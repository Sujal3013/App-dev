package com.example.kotlintodolist.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlintodolist.R
import com.example.kotlintodolist.models.Todo
import org.w3c.dom.Text

class TodoAdapter(val todos : ArrayList<Todo>): RecyclerView.Adapter<TodoAdapter.TodoViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        val li: LayoutInflater= parent?.context?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val itemView =li.inflate(R.layout.list_item,parent,false)
        return TodoViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
         holder?.tvtodo?.text = todos[position].task
    }

    override fun getItemCount(): Int {
        return todos.size
    }
    class TodoViewHolder(val item: View) : RecyclerView.ViewHolder(item){
        val tvtodo =item.findViewById<TextView>(R.id.tv_task)

    }
}