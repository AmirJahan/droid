package com.example.scrollviewevents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ScrollView
import android.widget.Toast
import kotlin.math.abs


class MainActivity : AppCompatActivity()
{
    private var currentlyScrolling: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        findViewById<ScrollView>(R.id.myScrollView)
        .setOnScrollChangeListener { view,
                                                 curX,
                                                 curY,
                                                 oldX,
                                                 oldY ->

            Log.i("MyTag", "X: $curX, Y: $curY")


            this.currentlyScrolling = abs(curY - oldY) > 2

            print("It is: $currentlyScrolling")

            if (!currentlyScrolling)
                Toast.makeText(this@MainActivity,
                               "Ended",
                               Toast.LENGTH_LONG).show()
        }
    }
}
