package com.vfs.mytaskapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

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
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.groups_layout)

    }
}