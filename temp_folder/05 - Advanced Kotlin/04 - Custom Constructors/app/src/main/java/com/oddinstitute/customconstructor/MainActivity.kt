package com.oddinstitute.classesandobjects

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.oddinstitute.customconstructor.R
import java.util.*
import kotlin.collections.HashMap

class MainActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataMap: HashMap<String, String> = hashMapOf("name" to "amir",
                                                       "email" to "someemail@gmail.com",
                                                        "id" to "sjkyhreq3o78fg")

        // it must follow one of the init methods
        val myUser: User = User(dataMap)
    }
}

// constructor parameter can be used as property
// we could use the following, but won't work cause when instantiating a new object
// you won't have the child
// class User(val inpName: String?, val inpEmail: String, var inpID: Int?, val child: User)

class User()
{
    private var name : String = ""
    private var email : String = ""
    private var id : String = ""

    init
    {
        println("First initializer happens first")
    }

    init
    {
        println("Second initializer happens in the same order it was made")
    }

    // Custom constructor
    constructor(inpMap: HashMap<String, String>) : this ( )
    {
        id = inpMap["id"]!!
        name = inpMap["name"]!!
        email = inpMap["email"]!!
    }
}



// new stuff in the class
class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val steve = User("Steve", "Blue", 235, 85f)
        val sarah = User("Sarah", "Brown")
        val john = User(180, 68f, UUID.randomUUID().toString())
        val adam = User()

        val eyeColor = steve.eyeColor

        Log.d(MainActivity::class.java.simpleName, "steve's eyeColor is: ")


    }
}

// arguments ~= attributes
// without var OR val, they are just arguments
// with var or val, they are attributes as well
class User(val id: String = UUID.randomUUID().toString())
{
    // constructor (arguments) : this (the default constructors paramters)
    var name: String = ""
    var eyeColor: String = ""
    var height: Int = 0
    var weight: Float = 0f

    init
    {

    }

    constructor(name: String, eyeColor: String, height: Int, weight: Float) : this()
    {
        this.name = name
        this.eyeColor = eyeColor
        this.height = height
        this.weight = weight
    }

    constructor(name: String, eyeColor: String) : this()
    {
        this.name = name
        this.eyeColor = eyeColor
    }

    constructor(height: Int, weight: Float, id: String) : this()
    {
        this.height = height
        this.weight = weight
    }

}
