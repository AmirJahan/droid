package com.vfs.myrecyclerviewapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val countries = arrayOf(
        "Afghanistan", "Albania", "Algeria", "Andorra",
        "Angola", "Antigua and Barbuda", "Argentina", "Armenia",
        "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain",
        "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize",
        "Benin", "Bhutan", "Bolivia", "Bosnia and Herzegovina",
        "Botswana", "Brazil", "Brunei", "Bulgaria", "Burkina Faso",
        "Burundi", "Cabo Verde", "Cambodia", "Cameroon", "Canada",
        "Central African Republic"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val rv = findViewById<RecyclerView>(R.id.recyclerView_id)
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = MySimpleAdapter(countries)
    }
}


class MyViewHolder (val rootView: TextView) : RecyclerView.ViewHolder(rootView)

class MySimpleAdapter (val data: Array<String>) : RecyclerView.Adapter<MyViewHolder>()
{
    override fun getItemCount(): Int = data.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val thatTextView = LayoutInflater.from(parent.context)
                                                .inflate(R.layout.row_item,
                                                    parent,
                                                    false) as TextView
        return MyViewHolder(thatTextView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.rootView.text = data[position]
    }
}















