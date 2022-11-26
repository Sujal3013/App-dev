package com.example.kotlintodolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlintodolist.adapters.TodoAdapter
import com.example.kotlintodolist.models.Todo
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    val todos: ArrayList<Todo> =ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_todo.layoutManager =LinearLayoutManager(this)
        val todoAdapter:TodoAdapter= TodoAdapter(todos)
        rv_todo.adapter=todoAdapter

        btnADD.setOnClickListener{
            val newTodo=etnew_todo.text.toString()
            todos.add(Todo(newTodo,false))
            todoAdapter.notifyDataSetChanged()
        }


    }
}