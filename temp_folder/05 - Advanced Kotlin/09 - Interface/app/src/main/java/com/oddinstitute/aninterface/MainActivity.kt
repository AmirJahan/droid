package com.oddinstitute.aninterface

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ExampleListener
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val obj = ImplementingClass()
        obj.myListener = this
        obj.myListener.absMethod()
    }

    override var myVar = 5
    override fun absMethod(): String
    {
        return "g"
    }


    // make two activities, that you go from one to another
    // use an interface between them to send a message
    // calling a function on the first activity
    // should set a value on the next one
}

// interfaces can contain method implementation as well
// as abstract methods declaration.

// the interface method doesn't have a body
// our class has an instance of the interface
// somewhere in out class, we can call the function from the interface
// how do you intialize the interface
// where doe sthe body of the function come

interface ExampleListener
{
    var myVar: Int            // abstract property
    fun absMethod() : String    // abstract method

    fun hello()
    {
        println("Hello there")
    }
}
class ImplementingClass
{
    lateinit var myListener : ExampleListener
}


