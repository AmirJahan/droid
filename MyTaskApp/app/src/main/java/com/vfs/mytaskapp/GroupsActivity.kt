package com.vfs.mytaskapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

// There's the Home Page ~ Launcher
    // This is called GroupsActivity
    // Home page is a list of Groups
    // I can add enw groups
    // I can delete groups
    // I can click on a Group and go to the items of that group
// There's the Individual Group Page
    // this is called ItemsActivity
    // it lists the items in the group
    // I can add new Items
    // I can delete Items
    // I can stroke off an item
    // I can go back to the Home page

class GroupsActivity : AppCompatActivity()
{
    lateinit var groupAdapter: GroupsAdapter
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.groups_layout)

        AppData.initialize()

        val groupsRv = findViewById<RecyclerView>(R.id.groupsRv_id)
        groupsRv.layoutManager = LinearLayoutManager(this)

        groupAdapter = GroupsAdapter()
        groupsRv.adapter = groupAdapter
    }

    fun addNewGroup(v: View)
    {
        val name = "test"

        val newGroup = Group (name, mutableListOf())
        AppData.groups.add(newGroup)
        groupAdapter.notifyDataSetChanged()

    }
}









