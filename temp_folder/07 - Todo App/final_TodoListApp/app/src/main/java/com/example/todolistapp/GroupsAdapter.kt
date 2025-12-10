package com.example.todolistapp

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class GroupsViewHolder(groupRootView: LinearLayout) :
        RecyclerView.ViewHolder(groupRootView)
{
    private var groupNameTextView: TextView? = null
    private var groupCountTextView: TextView? = null

    init
    {
        groupNameTextView = itemView.findViewById(R.id.groupNameTextView)
        groupCountTextView = itemView.findViewById(R.id.groupCountTextView)
    }

    fun bind (group: Group)
    {
        groupNameTextView!!.text = group.name
        groupCountTextView!!.text = "${group.items.count()} items"
    }
}


class GroupsAdapter (private val list: List<Group>,
                     listenerContext: OnGroupClickListener) :
        RecyclerView.Adapter<GroupsViewHolder>()
{
    private var myInterface: OnGroupClickListener = listenerContext

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): GroupsViewHolder
    {
        val groupRootView = LayoutInflater.from(parent.context)
            .inflate(R.layout.group_row,
                     parent,
                     false) as LinearLayout

        return GroupsViewHolder(groupRootView)
    }

    override fun getItemCount(): Int = list.size


    override fun onBindViewHolder(holder: GroupsViewHolder,
                                  position: Int)
    {
        val group = list[position]
        holder.bind(group)

        holder.itemView.setOnClickListener{
            myInterface.groupClicked(position)
        }

        holder.itemView.setOnLongClickListener {
            myInterface.groupLongClicked(position)
            true
        }
    }
}
