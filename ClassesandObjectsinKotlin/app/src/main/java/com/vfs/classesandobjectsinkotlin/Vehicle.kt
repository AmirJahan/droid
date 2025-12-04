package com.vfs.classesandobjectsinkotlin

import java.util.UUID

class Vehicle () // no args constructor
{
    private var name = ""
    private var color = ""
    private var tires = 0
    private var cylinders = 0
    var horsePower = 0

    init
    {
        // this happens immediately when the construction happens
        name = "test"
    }

    init
    {
        // this build upon the previous one
    }

    constructor(name: String, c: String) : this()
    {
        this.name = name
        color = c
    }

    constructor(data: HashMap<String, Any>) : this()
    {
        this.name = (data["name"] ?: "") as String
        this.color = (data["color"] ?: "") as String
        this.tires = (data["tires"] ?: 0) as Int
        cylinders = (data["cylinders"] ?: 0) as Int
        horsePower = (data["horsePower"] ?: 0) as Int
    }
}


