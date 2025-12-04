package com.oddinstitute.generics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

// this is an intro, we'll see more of this in the future

// Generics are the powerful features that allow us to define classes,
// methods and properties which are accessible using different data
// types while keeping a check of the compile-time type safety.


// type parameters
// T” stands for template, you can use whatever you like

class Dog (val age: Int)
class Cat (val age: Int)

class GenericsClass<T>(input: T)
{
    init
    {
        println("I am getting called with the value $input")

        if (input is String)
        {

        }

    }
}

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var object1 = GenericsClass<String>("Kotlin")
        var object2 = GenericsClass<Int>(10)


        println ("Object is: $object1")
        println ("-----------//////////-----------")
        println ("Object is: $object2")


        val roxy = Dog (10)
        val foxy = Cat (5)
        var pet1 = GenericsClass(roxy)
        var pet2 = GenericsClass(foxy)


    }

}

// Another Example
class Person<T>(age: T)
{
    var age: T = age
    init {
        this.age= age
        println(age)
    }
}
fun main(args: Array<String>){
    var ageInt: Person<Int> = Person<Int>(30)
    var ageString: Person<String> = Person<String>("40")
}

