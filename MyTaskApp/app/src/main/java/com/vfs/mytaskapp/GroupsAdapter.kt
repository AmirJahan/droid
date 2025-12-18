package com.vfs.mytaskapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


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