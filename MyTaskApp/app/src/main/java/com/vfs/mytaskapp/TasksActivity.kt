package com.vfs.mytaskapp

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class TasksActivity : AppCompatActivity(), TaskListener
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.tasks_layout)

        val index = intent.getIntExtra("index", 0)
        val thisGroup = AppData.groups[index]


        val grpTextView = findViewById<TextView>(R.id.grpNameTextView_id)
        grpTextView.text = thisGroup.name

        val tasksRv = findViewById<RecyclerView>(R.id.tasksRv_id)
        tasksRv.layoutManager = LinearLayoutManager(this)
        tasksRv.adapter = TasksAdapter (this, thisGroup)



    }

    override fun taskLongClicked(index: Int)
    {

    }

    override fun taskClicked(index: Int)
    {

    }
}