package com.oddinstitute.functions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // Simple Function
    fun myFunc ()
    {

    }

    // override function Ctrl + O


    fun myInpFunc (i: Int) : Unit
    {

    }


    fun myRetFunc () : Int
    {
        return 2
    }

    fun myInpAndRetFunc (i: Int) : Int
    {
        return  i * 3
    }

}

class User (name: String)
{
    val name = name

    fun run ()
    {

    }
}

