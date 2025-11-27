package com.vfs.alrtdialogeapp

import android.os.Bundle
import android.text.InputType
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
    }

    fun showAlert (v: View)
    {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Phone")
        builder.setMessage("Enter your Phone Number and hit Ok")

        val myInput = EditText(this)
        myInput.inputType = InputType.TYPE_CLASS_PHONE
        builder.setView(myInput)


        builder.setPositiveButton("Save") { dialog, which ->
            val phone = myInput.text.toString()
            savePhoneNumber(phone)
        }

        builder.setNegativeButton("Cancel") { dialog, which ->
        }

        builder.setNeutralButton("More Info") { dialog, which ->
            Toast.makeText(this,
                "We need your phone",
                Toast.LENGTH_LONG).show()
        }



        val dialog = builder.create()
        dialog.show()
    }

    fun savePhoneNumber (phone: String)
    {

    }

}