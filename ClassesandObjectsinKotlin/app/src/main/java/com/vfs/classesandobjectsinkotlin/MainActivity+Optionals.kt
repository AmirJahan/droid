package com.vfs.classesandobjectsinkotlin

import android.util.Log

fun MainActivity.optionals ()
{
    var a: String = "test" // non-nullable variable
    a = null // error
    a = ""


    // optional ~ nullable variable
    var imageFromCloud: String? = null

    var b: String? = "test" // there is a value in it
    b = null // ok

    val aLength: Int = a.length
    val bLength: Int = b.length // error

    val bLength2: Int = if (b != null) b.length else 0

    val bLength3: Int? = b?.length // error

    val listWithNulls: List<String?> = listOf("A", null, "Hello", "Dog", null, "Horse", "Turtle", "Chameleon")

    for (item: String? in listWithNulls)
    {
        if (item != null)
            Log.d ("tag", item)

        item?.let {
            Log.d("Tag", it)
        }

        Log.d("Tag", item!!) // force unwrap the nullable
    }

    for (item: String? in listWithNulls)

        Log.d ("tag", item ?: "")
    }











}