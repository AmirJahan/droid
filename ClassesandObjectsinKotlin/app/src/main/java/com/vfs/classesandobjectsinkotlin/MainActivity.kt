package com.vfs.classesandobjectsinkotlin

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.UUID

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val usr = User ("Amir", "amir@gmail.com", UUID.randomUUID())

        Log.d("MainActivity", usr.email)
    }
}

// fun name (arg1; art1Type, arg2: arg2Type, ...): returnType { }

fun validateEmail (email: String): Boolean
{
    return email.contains("@")
}

fun validateEmailAndReturn (email: String): Pair<String, Boolean> // tuple
{
    return Pair(email,
                email.contains("@"))
}

class User (var displayName: String, val email: String, val id: UUID)
{
    fun printName ()
    {
        Log.d("User", displayName)
    }

    fun fetchEmail () : String
    {
        return email
    }
}

// void printName() { }











