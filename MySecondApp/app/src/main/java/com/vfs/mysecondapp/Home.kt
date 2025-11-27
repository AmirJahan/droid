package com.vfs.mysecondapp

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout


// Activity ~ Page ~ Scene ~ Level
class Home : AppCompatActivity()
{
    override
    fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.home_layout)

        val userName: TextView = findViewById<TextView>(R.id.username_id)
        userName.text = "Toronto"
        userName.textSize = 60f

        findViewById<ConstraintLayout>(R.id.rootLayout_id).setBackgroundColor(Color.YELLOW)


        val nameEditText = findViewById<EditText>(R.id.nameEditText_id)

        val name = nameEditText.text.toString()


        findViewById<Button>(R.id.loginButton_id).setOnClickListener {

            if (name == "Amir")
                findViewById<TextView>(R.id.resultTextView_id).text = "Success"
            else
                findViewById<TextView>(R.id.resultTextView_id).text = "Failure"

                // login successful
        }
    }
}








