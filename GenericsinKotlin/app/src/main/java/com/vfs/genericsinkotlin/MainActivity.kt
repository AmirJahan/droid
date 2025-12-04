package com.vfs.genericsinkotlin

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Dog (val age: Int)
class Cat (val age: Int)


class Vet<T> (input: T)
{
    init
    {
        if (input is String)
        {

        }
        else if (input == Dog::class.java)
        {

        }
    }
}

fun test ()
{
    val obj1 = Vet<String>("")
    val obj2 = Vet<Dog>(Dog(1))
    val obj3 = Vet<Cat>(Cat(1))

}





class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}