package com.example.rvinfragment

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.PopupWindow
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView



class ColorPickerFragment  : Fragment()
{
    companion object
    {
        fun newInstance(): ColorPickerFragment
        {
            return ColorPickerFragment()
        }
    }


    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View?
    {
        val fragView = inflater.inflate(R.layout.fragment,
                                        container,
                                        false)


        val recyclerView: RecyclerView = fragView.findViewById(R.id.myReyclerView)
        recyclerView.layoutManager = LinearLayoutManager(activity as Context)

        val items = arrayOf("Canada", "USA", "Mexico", "Chile")

// theoratically you want the items to come from womehere else
        // make this an excerise
        recyclerView.adapter = MyAdapter(items)
        return fragView
    }


    // THESE ARE NEW IN THIS LESSON

    class RecyclerViewHolder(inflater: LayoutInflater,
                             parent: ViewGroup) :
            RecyclerView.ViewHolder(inflater.inflate(R.layout.row,
                                                     parent,
                                                     false))
    // this whole class doesn't need a body if you are to treat the Item View as Text view
    // on line 97
//    {
//        // you don't need the next line if you treat the item view as text view
////        val textView : TextView = itemView as TextView
//    }

    internal inner class MyAdapter(private val inputData: Array<String>) :
            RecyclerView.Adapter<RecyclerViewHolder>()
    {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder
        {
            val inflater = LayoutInflater.from(parent.context)
            return RecyclerViewHolder(inflater, parent)
        }

        override fun getItemCount(): Int = inputData.size

        override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int)
        {
            (holder.itemView as TextView).text = inputData[position]
        }
    }
}