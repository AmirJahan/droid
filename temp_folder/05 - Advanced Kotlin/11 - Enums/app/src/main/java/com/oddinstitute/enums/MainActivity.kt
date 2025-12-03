package com.oddinstitute.enums

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

enum class Direction
{
    NORTH, SOUTH, WEST, EAST
}

enum class ColorsEnum(val rgb: Long)
{
    RED(0xff0000),
    GREEN(0x00ff00),
    BLUE(0x0000ff)
}

// add an enum that shows three states of user being online
// being offline or never have been logged in

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val myDirection = Direction.EAST

        if ( myDirection == Direction.SOUTH )
        {

        }

        when (myDirection)
        {
            Direction.SOUTH ->
                println("South")

            Direction.NORTH ->
                println("North")

            else -> println("Another one")
        }


        val myColor = ColorsEnum.RED.rgb

    }
}
