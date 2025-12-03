package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


// Provide a reference to the views for each data item
// Complex data items may need more than one view per item, and
// you provide access to all the views for a data item in a view holder.
// Each data item is just a string in this case that is shown in a TextView.
class SimpleViewHolder(private val view: View) : RecyclerView.ViewHolder(view)

// you could add the context or use the Context
class SimpleAdapter () : RecyclerView.Adapter<SimpleViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): SimpleViewHolder
    {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int
    {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: SimpleViewHolder, position: Int)
    {
        TODO("Not yet implemented")
    }
}

class MyViewHolder(val textView: TextView) :
        RecyclerView.ViewHolder(textView)

class MyAdapter(private val inputArray: Array<String>) :
        RecyclerView.Adapter<MyViewHolder>()
{


    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): MyViewHolder
    {
        // create a new view
        val textView = LayoutInflater.from(parent.context)
                .inflate(R.layout.row_item,
                         parent,
                         false) as TextView

        val newViewHolder = MyViewHolder(textView)
        return newViewHolder
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(holder: MyViewHolder,
                                  position: Int)
    {
        // - get element from your data-set at this position
        // - replace the contents of the view with that element
        holder.textView.text = inputArray[position]
    }

    // Return the size of your data-set (invoked by the layout manager)
    override fun getItemCount() = inputArray.size

}