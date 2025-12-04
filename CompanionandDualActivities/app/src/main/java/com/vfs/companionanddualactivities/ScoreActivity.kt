package com.vfs.companionanddualactivities

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ScoreActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.score_layout)

    }

    fun done (v: View)
    {
        finish()
    }

    fun add (v: View)
    {
        AppData.score ++
    }

    fun sub (v: View)
    {
        AppData.score --
    }
}