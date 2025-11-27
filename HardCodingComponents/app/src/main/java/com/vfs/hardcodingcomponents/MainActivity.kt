package com.vfs.hardcodingcomponents

import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.setPadding

class MainActivity : AppCompatActivity()
{
    lateinit var myRootLayout: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        myRootLayout = findViewById(R.id.myRootLayout_id)

        addNewTextView()
    }

    fun addNewTextView()
    {
        val newTextView = TextView(this)

        val myParam = ConstraintLayout.LayoutParams (ViewGroup.LayoutParams.MATCH_PARENT,
                                                     ViewGroup.LayoutParams.WRAP_CONTENT)
        myParam.setMargins(20, 60, 20, 0)

        newTextView.layoutParams = myParam// the most important one

        newTextView.setPadding(20, 20, 20, 20)
        newTextView.text = "Hello Vancouver"
        newTextView.textSize = 24F
        newTextView.setTextColor(Color.RED)
        newTextView.setBackgroundColor(Color.BLACK)
        newTextView.gravity = Gravity.CENTER

        myRootLayout.addView(newTextView)
    }
}