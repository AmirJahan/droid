package com.oddinstitute.optionalsandnullsafety

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

abstract class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // explicitly declared and defined variable as nonnull
        var a: String = "abc"
        // cannot be null
        a = null // compilation error
        a = ""


        // nullable variable
        var b: String? = "abc"
        // it can be null
        b = null // ok


        val l1 = b.length // error: variable 'b' can be null

        val l2 = if (b != null) b.length else -1


        // null safety test
        val c: String? = "Kotlin"
        if (c != null && c.length > 0) {
            print("String of length ${c.length}")
        } else {
            print("Empty string")
        }



        val nonNullable = "Kotlin"
        val nullable: String? = null
        println(nullable?.length) // safe call
        println(nonNullable?.length) // Unnecessary safe call


        val listWithNulls: List<String?> = listOf("Kotlin", null, "Java")

        // in this for loop, the item assumes a nullable
        for (item in listWithNulls) {
            item?.let { println(it) } // prints Kotlin and ignores null
        }



        // elvis operator

        // the usual way
        val myVal1: Int = if (b != null) b.length else -1

        // or elvis operator
        val myVal2 = b?.length ?: -1

        // If the expression to the left of ?: is not null,
        // the elvis operator returns it,
        // otherwise it returns the expression to the right

        // The !! Operator - NOT NULL Operator
        val someVal = b!!.toString()
        // b must have a value or there will be an error
    }
}

