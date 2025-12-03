package com.example.recyclerviewitemtouch

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView





// you could add the context or use the Context
class MySimpleAdapter(private val myDataset: Array<String>,
                      private val myContext: Context) :
        RecyclerView.Adapter<MySimpleAdapter.MyViewHolder>()
{
    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder.
    // Each data item is just a string in this case that is shown in a TextView.
    class MyViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): MyViewHolder
    {
        // create a new view
        val textView = LayoutInflater.from(parent.context)
                .inflate(R.layout.row_item,
                         parent,
                         false) as TextView

        return MyViewHolder(textView)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(holder: MyViewHolder,
                                  position: Int)
    {
        // - get element from your data-set at this position
        // - replace the contents of the view with that element
        holder.textView.text = myDataset[position]

        holder.itemView.setOnClickListener {

            Log.i("myTag",
                  "This items number $position was clicked")
            // exercise, make it call an interface

            Toast.makeText(myContext,
                           "$position is: ${myDataset[position]}",
                           Toast.LENGTH_LONG).show()
        }
    }

    // Return the size of your data-set (invoked by the layout manager)
    override fun getItemCount() = myDataset.size
}