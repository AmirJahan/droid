package com.vfs.classesandobjectsinkotlin

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.UUID


class CloudOps()
{
    fun fetchIms()
    {

    }
}


class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        AppData.score += 1

        Vehicle.mileage = 30_000


        val usr = User("Amir", "amir@gmail.com", UUID.randomUUID())

        Log.d("MainActivity", usr.email)

        fetchImages()

        val cld = CloudOps()
        cld.fetchIms()

    }
}















