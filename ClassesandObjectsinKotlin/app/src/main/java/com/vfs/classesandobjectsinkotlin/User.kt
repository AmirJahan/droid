package com.vfs.classesandobjectsinkotlin

import android.util.Log
import java.util.UUID


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