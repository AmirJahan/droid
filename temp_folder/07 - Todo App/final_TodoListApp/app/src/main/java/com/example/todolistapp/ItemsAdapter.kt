package com.example.todolistapp

import android.graphics.Color
import android.graphics.Paint
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class ItemsViewHolder(rootLayout: LinearLayout) :
    RecyclerView.ViewHolder(rootLayout)
{
    private var itemNameTextView: TextView? = null
    private var itemCheckBox: CheckBox? = null


    init
    {
        itemNameTextView = itemView.findViewById(R.id.itemNameTextView)
        itemCheckBox = itemView.findViewById(R.id.itemCheckBox)
    }

    fun bind(item: Item)
    {
        itemNameTextView!!.text = item.name
        itemCheckBox!!.isChecked = item.completed

        if (item.completed)
        {
            itemNameTextView!!.paintFlags = itemNameTextView!!.paintFlags or
                    Paint.STRIKE_THRU_TEXT_FLAG
            itemView.setBackgroundColor(Color.LTGRAY)
        }
        else
        {
            itemNameTextView!!.paintFlags = itemNameTextView!!.paintFlags and
                    Paint.STRIKE_THRU_TEXT_FLAG.inv()
            itemView.setBackgroundColor(Color.TRANSPARENT)
        }
    }
}



class ItemsAdapter (private val group: Group,
                   listenerContext: OnItemClickListener) : RecyclerView.Adapter<ItemsViewHolder>()
{
    private var myInterface : OnItemClickListener = listenerContext


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemsViewHolder
    {
        val itemsRootView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_row,
                     parent,
                     false) as LinearLayout

        return ItemsViewHolder(itemsRootView)
    }

    override fun getItemCount(): Int = group.items.size

    override fun onBindViewHolder(holder: ItemsViewHolder, position: Int)
    {
        val item : Item = group.items[position]
        holder.bind(item)

        holder.itemView.setOnClickListener {
            myInterface.itemClicked(position)
        }

        holder.itemView.setOnLongClickListener {
            myInterface.itemLongClicked(position)
            true
        }

    }
}