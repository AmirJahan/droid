package com.vfs.interfacepattern

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


// an interface is a pattern where one object becomes the listener
// and another one is the sender

interface ExampleListener
{
    fun doSomething()
}

class Car // that over;aying activity
{
    lateinit var listener: ExampleListener
}

class MainAtcivity : AppCompatActivity(), ExampleListener
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val ford = Car()

        ford.listener = this
        ford.listener.doSomething() // this calls the function from the assignment

    }

    override fun doSomething()
    {
        // do whatever is in this function
    }
}