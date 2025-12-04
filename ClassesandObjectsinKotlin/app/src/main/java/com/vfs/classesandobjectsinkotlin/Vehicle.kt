package com.vfs.classesandobjectsinkotlin

import java.util.UUID

class Vehicle () // no args constructor
{
    private var name = ""
    private var color = ""
    private var tires = 0
    private var cylinders = 0
    private var horsePower = 0

    init {
        // this happens immediately when the construction happens
        name = "test"
    }

    init {
        // this build upon the previous one
    }

    constructor(n: String, c: String) : this()
    {
        name = n
        color = c
    }

    constructor(data: HashMap<String, Any>): this ()
    {
        name = (data["name"] ?: "") as String
        color = (data["color"] ?: "") as String
        tires = (data["tires"] ?: 0) as Int
        cylinders = (data["cylinders"] ?: 0) as Int
        horsePower = (data["horsePower"] ?: 0) as Int
    }
}


fun test ()
{
    val v1 = Vehicle() // construction
    val v2 = Vehicle("Ford", "Red")


    // let's assume we read data from a server
    val data: HashMap<String, Any> = hashMapOf("name" to "Ford",
                                               "color" to "Red",
                                               "tires" to 6,
                                                "cylinders" to 4,
                                                "horsePower" to 200)


    val v3 = Vehicle(data)







}