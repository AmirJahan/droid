package com.example.alertdialogapp

import android.app.Dialog
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.InputType
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.constraintlayout.widget.ConstraintLayout


class MainActivity : AppCompatActivity()
{
    lateinit var rootLayout: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rootLayout= findViewById(R.id.rootLayout)
    }


    fun defaultDialogue(v: View)
    {
        val builder = AlertDialog.Builder(this@MainActivity)

        builder.setTitle("Changing BG Color")
        builder.setMessage("Enter Red, green or blue")

        val myInput = EditText(this)
        myInput.inputType = InputType.TYPE_CLASS_TEXT
        builder.setView(myInput)

        builder.setPositiveButton("Change")
        { dialog, which ->

            changeFun(myInput.text)
        }

        // Display a negative button on alert dialog
        builder.setNegativeButton("Cancel")
        { dialog, which ->
            Toast.makeText(applicationContext,
                           "Not Changing anything",
                           Toast.LENGTH_SHORT).show()
        }

        // Display a neutral button on alert dialog
        builder.setNeutralButton("Neutral")
        { _, _ ->

        }


        val dialog: AlertDialog = builder.create()

        dialog.show()
    }

    // Editbale is the interface for text whose content and markup can be changed
    // (as opposed to immutable text like Strings).
    fun changeFun(myEditable: Editable)
    {
        when (myEditable.toString().toLowerCase())
        {
            "red" -> rootLayout.setBackgroundColor(Color.RED)
            "blue" -> rootLayout.setBackgroundColor(Color.BLUE)
            else -> rootLayout.setBackgroundColor(Color.GREEN)
        }
    }






    // for a custom dialog, you'd need to have a layout
    lateinit var customDialog: Dialog

    fun customDialog(v: View)
    {
        customDialog = Dialog(this@MainActivity)
        customDialog.setContentView(R.layout.linear_layout_buttons)
        customDialog.show()
    }

    fun topButtonFun(v: View)
    {
        Toast.makeText(applicationContext,
                       "Tapped",
                       Toast.LENGTH_LONG).show()
        customDialog.dismiss()
    }
}