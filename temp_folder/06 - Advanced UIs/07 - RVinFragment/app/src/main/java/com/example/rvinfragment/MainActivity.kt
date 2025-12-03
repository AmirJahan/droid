package com.example.rvinfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity()
{

    // frame layout is designed to hold on to a single object

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener {

            supportFragmentManager
                .beginTransaction()
                .add(R.id.fragmentContainer,
                     ColorPickerFragment.newInstance(),
                     "myRv").commit()
        }
    }
}
