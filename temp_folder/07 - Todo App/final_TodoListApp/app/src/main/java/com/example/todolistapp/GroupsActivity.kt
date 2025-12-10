package com.example.todolistapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class GroupsActivity : AppCompatActivity(), OnGroupClickListener
{
    private var groupsAdapter: GroupsAdapter? = null


    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.groups)

        val groupsRecyclerView = findViewById<RecyclerView>(R.id.groupsRecyclerView)

        groupsRecyclerView.layoutManager = LinearLayoutManager(this)

        AppData.initialize()
        groupsAdapter = GroupsAdapter(AppData.groups, this)

        // in case, we wanted to use the laternative approach
        //        groupsAdapter = GroupsAdapter (AppData.groups, this.onGroupClickListener())
        groupsRecyclerView.adapter = groupsAdapter
    }


    override fun onResume()
    {
        super.onResume()

        // refreshing groups
        groupsAdapter!!.notifyDataSetChanged()
    }


    fun createNewGroup(v: View)
    {
        val builder = AlertDialog.Builder(this)

        builder.setTitle("New Group")
        builder.setMessage("Please enter a name for your new group")

        val myInput = EditText(this)
        myInput.inputType = InputType.TYPE_CLASS_TEXT
        builder.setView(myInput)

        builder.setPositiveButton("Save")
        { _, _ ->
            val groupName: String = myInput.text.toString()
            val newGroup = Group(groupName, mutableListOf())

            AppData.groups.add(newGroup)
            groupsAdapter!!.notifyItemInserted(AppData.groups.count())
        }

        builder.setNegativeButton("Cancel")
        { _, _ ->

        }

        val dialogue: AlertDialog = builder.create()
        dialogue.show()
    }


    override fun groupClicked(index: Int)
    {
        val intent = Intent(this, ItemsActivity::class.java)

        intent.putExtra("groupIndex", index)

        startActivity(intent)


        overridePendingTransition(R.anim.slide_in_right,
                                  R.anim.slide_out_left)
    }

    override fun groupLongClicked(index: Int)
    {
        AppData.groups.removeAt(index)

        groupsAdapter!!.notifyItemRemoved(index)
        groupsAdapter!!.notifyItemRangeChanged(index, AppData.groups.count())
    }
}

// instead of the previous two, we can use the following
//fun GroupsActivity.onGroupClickListener() = object : OnGroupClickListener {
//    override fun groupClicked(index: Int)
//    {
//        val intent = Intent(this, ItemsActivity::class.java)
//
//        intent.putExtra("groupIndex", index)
//
//        startActivity(intent)
//
//
//        overridePendingTransition(R.anim.slide_in_right,
//                                  R.anim.slide_out_left)
//    }
//
//    override fun groupLongClicked(index: Int)
//    {
//        AppData.groups.removeAt(index)
//
//        //        notifyItemRemoved(position);
//        //        notifyItemRangeChanged(position,list.size());
//
//        groupsAdapter!!.notifyItemRemoved(index)
//        groupsAdapter!!.notifyItemRangeChanged(index, AppData.groups.count())
//    }
//
//}