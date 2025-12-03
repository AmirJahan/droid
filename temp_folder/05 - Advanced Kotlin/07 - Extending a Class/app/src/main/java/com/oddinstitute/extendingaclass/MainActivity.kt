package com.oddinstitute.extendingaclass

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myObj = MyClass()

        myObj.myFunction("Yo")
        myObj.myFunction("Hi" , "you")

        myObj.anotherFunction(12)

        toast(this, "Hi")
    }
}

// this is an example of using extensions
fun AppCompatActivity.toast (context: Context, message: String)
{
    Toast.makeText(context, message, Toast.LENGTH_LONG ).show()
}

