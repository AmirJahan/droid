package com.vfs.companionanddualactivities

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity()
{
    fun refreshScore ()
    {
        findViewById<TextView>(R.id.curScoretextView_id).text = AppData.score.toString()
    }

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.home_layout)

        refreshScore()
    }

    override fun onResume()
    {
        super.onResume()
        refreshScore()
    }

    fun gotoScoreActivity(v: View)
    {
        startActivity(Intent(this, ScoreActivity::class.java))
    }
}