package com.vfs.recyclerviewwithitemtouch

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), ItemListener
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val myRv = findViewById<RecyclerView>(R.id.myRv_id)
        myRv.layoutManager = LinearLayoutManager(this)
        myRv.adapter = MyAdapter(this)
    }

    override fun itemClicked(index: Int)
    {
        Toast.makeText(this,
                       "Object at index $index clicked",
                       Toast.LENGTH_LONG).show()
    }
}


class MyViewHolder (val textView: TextView): RecyclerView.ViewHolder (textView)
class MyAdapter (var listener: ItemListener): RecyclerView.Adapter<MyViewHolder> ()
{
    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): MyViewHolder // On Create View
    {
        val txtView = LayoutInflater.from(parent.context)
            .inflate(R.layout.my_row,
                     parent,
                     false) as TextView
        return MyViewHolder (txtView)
    }

    override fun onBindViewHolder(holder: MyViewHolder,
                                  position: Int) // on Attach
    {
        holder.textView.text = "Name $position"

        holder.itemView.setOnClickListener {
            // somehow, we have send a message to that listener
            listener.itemClicked(position)
        }

        holder.itemView.setOnLongClickListener {

            true
        }
    }

    override fun getItemCount(): Int = 20 //
}

interface ItemListener
{
    fun itemClicked(index: Int)
}

// sender / receiver














