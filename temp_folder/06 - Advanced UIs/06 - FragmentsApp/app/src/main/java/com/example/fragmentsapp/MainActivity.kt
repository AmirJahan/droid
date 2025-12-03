package com.example.fragmentsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() , OnButtonTapListener
{
    override fun onButtonTapped()
    {
        Toast.makeText(this,
                       "Tapped",
                       Toast.LENGTH_SHORT).show()

        val myFrag = supportFragmentManager.findFragmentByTag("myTag")
        supportFragmentManager
            .beginTransaction()
            .remove(myFrag!!)
            .commit()
    }


    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Section 1 : Add fragment to the activity

        findViewById<Button>(R.id.addButton).setOnClickListener {

            if (savedInstanceState == null)
            {
                supportFragmentManager
                    .beginTransaction()
                    .add(R.id.fragmentContainer,
                         MyFragment.newInstance(),
                         "myTag")
                    .commit()
            }
        }
    }
}
