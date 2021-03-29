package com.example.kmmrealm2.shared

import io.realm.RealmModule
import io.realm.RealmObject

class Todo: RealmObject {
    var title: String = "no title"
//    var isDone: Boolean = false
}

@RealmModule(Todo::class)
class Entities