package com.oddinstitute.dataclasses

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myUser = DataUser("Amir", 50)
        var newUser = myUser.copy(name = "Steve")
    }
}


// We frequently create classes whose main purpose is to hold data.
// for such situations, we use a data class
// in data class, all parameters must be marked with val or var
// primary constructor must have at least 1 parameter
// Data classes cannot be abstract, open, sealed or inner
// you can think of these as a struct
data class DataUser (val name: String, val age: Int)
{

    // data classes have built in copy such as:
    // fun copy (name: String = this.name, age: Int = this.age) = User(name, age)
}

