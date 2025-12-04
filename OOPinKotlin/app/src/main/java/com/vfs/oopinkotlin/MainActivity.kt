package com.vfs.oopinkotlin

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


// default class type is final, cannot be extended
open class Property
{
    val address: String = ""
    open fun setOpenHouse () { } // open functions can be overriden

    open var ready: Boolean = false
}

class Sales () : Property ()
{
    override var ready: Boolean = false
    override fun setOpenHouse()
    {
        super.setOpenHouse()
    }
}

class Rentals () : Property ()
{
    override var ready: Boolean = true
    override fun setOpenHouse()
    {
        super.setOpenHouse()
    }
}














class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
    }
}