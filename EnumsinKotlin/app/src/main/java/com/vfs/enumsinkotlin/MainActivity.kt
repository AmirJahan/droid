package com.vfs.enumsinkotlin

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


enum class Keyboard (val dir: Int)
{
    LEFT (1),
    RIGHT (2),
    UP (3),
    DOWN (4)
}
fun test ()
{
    val k = Keyboard.LEFT
    val kDir: Int = k.dir

    val dir = Direction.NORTH

    if (dir == Direction.NORTH)
    {
        println("North")
    }
}

enum class Direction
{
    NORTH, SOUTH, EAST, WEST
}





class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}