package com.shiv.contacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView: RecyclerView = findViewById(R.id.myActiv)
        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
//        val userList : List<String> = listOf("p","l","k","j","b","t","r","c","a","n","a","a","a")

        val ContactNumbers : MutableList<User> = mutableListOf<User>()
        ContactNumbers.add(User("ram","+91 7025874196","asdfgih"))
        ContactNumbers.add(User("raj","+91 7025874196","asdfgih"))
        ContactNumbers.add(User("lkhn","+91 7025874196","asdfgih"))
        ContactNumbers.add(User("vishal","+91 7025874196","asdfgih"))
        ContactNumbers.add(User("praksh","+91 7025874196","asdfgih"))
        ContactNumbers.add(User("nitesh","+91 7025874196","asdfgih"))
        ContactNumbers.add(User("Prabhu","+91 7025874196","asdfgih"))
        ContactNumbers.add(User("Shiv","+91 7025874196","asdfgih"))
        ContactNumbers.add(User("Jay","+91 7025874196","asdfgih"))
        ContactNumbers.add(User("Kishan","+91 7025874196","asdfgih"))
        ContactNumbers.add(User("Kumar","+91 7025874196","asdfgih"))
        ContactNumbers.add(User("Mishra","+91 7025874196","asdfgih"))
        ContactNumbers.add(User("Rastogi","+91 7025874196","asdfgih"))

        myActiv.adapter = MyAdapter(ContactNumbers)
        myActiv.layoutManager= LinearLayoutManager(this)
    }
}