package com.example.kmmrealm2.androidApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.kmmrealm2.shared.Greeting
import android.widget.TextView
import com.example.kmmrealm2.shared.TodoModel

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)
        tv.text = greet()

        val todoModel = TodoModel()
        todoModel.addTodo("きなこもち")

        val todos = todoModel.fetchTodos()
        Log.d("aaaaa", todoModel.todo2titleString(todos.first()))

    }
}
