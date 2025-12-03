package com.oddinstitute.companionobject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity()
{
    // More about this lesson will come later

    // If you need to write a function that can be called without
    // having a class instance but needs access to the internals
    // of a class, you can write it as a member of a companion
    // object declaration inside that class.

    // The companion object is a singleton, and its members can
    // be accessed directly via the name of the containing class
    // (although you can also insert the name of the companion object
    // if you want to be explicit about accessing the companion object):


    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun setScore(v: View)
    {
        val myObj = SomeClass()
        myObj.changeScore(12)

        // or
        // setting the score in this class
        SomeClass.score = 15

        Toast.makeText(this,
                       "${myObj.getScoreValue()}",
                       Toast.LENGTH_LONG).show()
    }
}

class SomeClass
{
    companion object
    {
        // score is the one we care about
        var score: Int = 0
    }

    fun getScoreValue () : Int
    {
        return score
    }

    fun changeScore(toVal: Int)
    {
        score = toVal
    }
}




// you an lso have global methods that belong to the module
fun myGlobalFunc()
{

}
