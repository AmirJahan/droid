package com.oddinstitute.exceptionhandling

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.lang.Integer.parseInt

class MainActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // you can use throw to remind yourself of something
//        throw IllegalArgumentException("Value must be positive")

//        throw Exception("Hi There!")

        println("Fun res is: ${divider(5, 0)}")
    }

    private fun divider(numerator: Int, denominator: Int): Int
    {
        return try
        {
            numerator / denominator
        } catch (e: ArithmeticException)
        {
            println(e)
            0
        } finally
        {
            // optional finally block
        }
        /*
        There may be zero or more catch blocks.
        finally block may be omitted.
        However at least one catch or finally block should be present.
         */
    }


}
