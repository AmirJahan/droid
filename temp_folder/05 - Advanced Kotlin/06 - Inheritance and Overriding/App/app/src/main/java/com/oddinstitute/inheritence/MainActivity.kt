package com.oddinstitute.inheritence

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val unit_10 : Rentals = Rentals()
        unit_10.rent = 1500
        unit_10.address = "734 14th"

        val unit_2 : Sales = Sales()
        unit_2.price = 1500000
        unit_2.address = "714 14th"
    }
}

// if your class doesn't have primary argument, you don't need to have the parenthesis
// The open keyword means “open for extension
// By default, all classes in Kotlin are final
open class Property
{
    var address: String = ""
    open fun setOpenHouse () { } // this function can be overridden
    final fun listAgain () { } // final functions are final and un-overridable

    open fun someFunction() { } // this function can be called using super

    // even properties if they are open, they can be overridden to
    // set a different initial value
    open var ready: Boolean = true

}

class Rentals () : Property ()
{
    var rent: Int = 0

    // Ctrl + O

    override fun setOpenHouse() {}
    override var ready = false

    override fun someFunction() {
        super.someFunction()    // you can call the super to call the
                                // function from super class
    }
}

class Sales () : Property ()
{
    var price: Int = 0
    override fun setOpenHouse() {}
}