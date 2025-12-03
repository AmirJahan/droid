package com.oddinstitute.datatypeconversion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var value1 = 10
        val value2: Long = value1.toLong()

        /*
            toByte()
            toShort()
            toInt()
            toLong()
            toFloat()
            toDouble()
            toChar()
         */
    }

    fun myFun(x: Any) {
        if (x is String) {
            print(x.length) // x is automatically cast to String
        }


        // try to see what if it is an integer or a float
        // and if true, print it.

        // "Unsafe" cast operator | Usually, the operator
        // throws an exception if the cast is not possible

        val y: String = x as String

        // Safe Cast operation
        val z: String? = x as? String
    }
}
