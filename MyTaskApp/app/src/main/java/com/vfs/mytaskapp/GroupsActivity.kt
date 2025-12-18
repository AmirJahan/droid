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
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.groups_layout)

        AppData.initialize()

        val groupsRv = findViewById<RecyclerView>(R.id.groupsRv_id)
        groupsRv.layoutManager = LinearLayoutManager(this)
        groupsRv.adapter = GroupsAdapter()

    }
}

class GroupsViewHolder (rootView: LinearLayout): RecyclerView.ViewHolder(rootView)
{
    lateinit var groupNameTextView: TextView
    lateinit var groupCountTextView: TextView
    lateinit var dividerView: View

    init
    {
        groupNameTextView = itemView.findViewById<TextView>(R.id.groupNameTextView_id)
        groupCountTextView = itemView.findViewById<TextView>(R.id.groupCountTextView_id)
        dividerView = itemView.findViewById<View>(R.id.dividerView_id)
    }

    fun bind (group: Group, hideDivider: Boolean = false)
    {
        groupNameTextView.text = group.name
        groupCountTextView.text = "${group.tasks.count()} tasks"

        if (hideDivider)
            dividerView.visibility = View.GONE
    }
}

class GroupsAdapter () : RecyclerView.Adapter <GroupsViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): GroupsViewHolder
    {
        val rootLinearLayout = LayoutInflater.from(parent.context)
                            .inflate(R.layout.group_row,
                                     parent,
                                     false) as LinearLayout
        return GroupsViewHolder (rootLinearLayout)
    }

    override fun onBindViewHolder(holder: GroupsViewHolder, position: Int)
    {
        val thisGroup = AppData.groups[position]

        holder.bind(thisGroup, position == AppData.groups.count() - 1)
    }

    override fun getItemCount(): Int = AppData.groups.count()
}














