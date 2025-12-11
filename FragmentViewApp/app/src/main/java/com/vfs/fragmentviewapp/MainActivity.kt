package com.vfs.fragmentviewapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val loadFragButton = findViewById<Button>(R.id.loadFragButton_id)
        loadFragButton.setOnClickListener {

            supportFragmentManager
                .beginTransaction()
                .add(R.id.fragmentViewContainer_id,
                     MyFragment(),
                     "myFragTag")
                .commit()
        }
    }

    fun removeFragment (v: View)
    {
        supportFragmentManager.findFragmentByTag("myFragTag")?.let {
            supportFragmentManager
                .beginTransaction()
                .remove(it)
                .commit()
        }
    }
}