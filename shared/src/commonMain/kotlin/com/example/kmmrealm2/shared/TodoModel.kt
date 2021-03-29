package com.example.kmmrealm2.shared

import io.realm.RealmConfiguration


import io.realm.Realm

class TodoModel {
    private val realm: Realm by lazy {
        val configuration = RealmConfiguration.Builder()
            .schema(Entities())
            .build()

        Realm.open(configuration)
    }

    fun addTodo(title: String): Todo {
        realm.beginTransaction()
        var presitedTodo = realm.create(Todo::class).apply {
            this.title = title
        }
        realm.commitTransaction()
        return presitedTodo
    }

    fun deleteTodo(todo: Todo) {
        realm.beginTransaction()
        Realm.delete(todo)
        realm.commitTransaction()
    }

    fun fetchTodos(): List<Todo> {
        return realm.objects(Todo::class)
    }

    // FIXME Android compile error
    fun todo2titleString(todo: Todo): String {
        return todo.title
    }

}