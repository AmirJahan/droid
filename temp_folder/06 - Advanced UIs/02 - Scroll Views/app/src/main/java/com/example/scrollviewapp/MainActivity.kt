package com.example.scrollviewapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    lateinit var linearLayout: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        linearLayout = findViewById<LinearLayout>(R.id.myLinearLayout)

        // The ScrollView itself can only hold one child,
        // That layout can hold multiple views
    }
    /*
    Application of a list of todo items
    // go to the bank, buy milk, call mom, get a hiarcut
    x, y, z, w, v, h, n,
    // add all of the items right at beginning
     */




    fun addNewTextView(v: View)
    {
        val newTextView = TextView(this)

        val myParams = LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT)
        myParams.setMargins(0,20,0,20)
        newTextView.layoutParams = myParams
        newTextView.setPadding(20, 20, 20, 20)
        newTextView.gravity = Gravity.CENTER
        newTextView.textSize = 24F
        newTextView.text = "This is new"
        newTextView.setBackgroundColor(Color.GRAY)
        newTextView.setTextColor(Color.WHITE)
        linearLayout.addView(newTextView)
    }
}
