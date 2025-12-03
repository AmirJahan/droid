package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity()
{
    // when you add a recycler view to the Layout
    // implementation 'androidx.recyclerview:recyclerview:1.0.0'
    // will be added to the build.gradle Module

    /*
    Recycler View needs the following
        Data Set
    Adapter
    Individual View
    ViewHolder that populates UI from the individual View
     */

    var myItems = arrayOf<String>()



    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        makeArray()


        findViewById<RecyclerView>(R.id.myRv).layoutManager = LinearLayoutManager(this)

        // You can use GridLayoutManager if you want multiple columns.
        // Enter the number of columns as a parameter.
        // myRv.layoutManager = GridLayoutManager(this, 2)

        val thisAdapter = MyAdapter(myItems)
        findViewById<RecyclerView>(R.id.myRv).adapter = thisAdapter
    }
}





