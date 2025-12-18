package com.example.todolistapp

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ItemsActivity : AppCompatActivity(), OnItemClickListener
{
    lateinit var thisGroup: Group
    var itemsAdapter: ItemsAdapter? = null

    override fun itemClicked(index: Int)
    {
        thisGroup.items[index].completed = !thisGroup.items[index].completed
        itemsAdapter!!.notifyDataSetChanged()
    }

    override fun itemLongClicked(index: Int)
    {
        thisGroup.items.removeAt(index)
        itemsAdapter!!.notifyItemRemoved(index)
    }


    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.items)


        val selectedIndex = intent.getIntExtra("groupIndex",
                                   0)
        thisGroup = AppData.groups[selectedIndex]

        findViewById<TextView>(R.id.toolbarTitle).text = thisGroup.name


        findViewById<RecyclerView>(R.id.itemsReyclerView).layoutManager = LinearLayoutManager(this)
        itemsAdapter = ItemsAdapter(thisGroup,
                             this)
        findViewById<RecyclerView>(R.id.itemsReyclerView).adapter = itemsAdapter


        val myToolbar: Toolbar = findViewById<Toolbar>(R.id.myToolbar)
        setSupportActionBar(myToolbar)
        supportActionBar?.let {
            it.setDisplayHomeAsUpEnabled(true)
            it.setDisplayShowTitleEnabled(false)
        }
        
        val newItemEditText = findViewById<EditText>(R.id.newItemEditText)

        newItemEditText.setOnKeyListener { view, keyCode, event ->
            if ( keyCode == KeyEvent.KEYCODE_ENTER)
            {
                if ( event.action == KeyEvent.ACTION_DOWN )
                {
                    val name: String = newItemEditText.text.toString()
                    val item = Item(name, false)
                    thisGroup.items.add(item)
                    itemsAdapter!!.notifyItemInserted(thisGroup.items.count())
                    newItemEditText.text.clear()



                    val inputManager =
                            getSystemService(Activity.INPUT_METHOD_SERVICE)
                                    as InputMethodManager
                    inputManager.hideSoftInputFromWindow(view.windowToken, 0)

                }
            }
            false
        }
    }

    override fun onSupportNavigateUp(): Boolean
    {
        onBackPressed()
        return true
    }

    override fun finish()
    {
        super.finish()
        overridePendingTransition(R.anim.slide_in_left,
                                 R.anim.slide_out_right)
    }


}
