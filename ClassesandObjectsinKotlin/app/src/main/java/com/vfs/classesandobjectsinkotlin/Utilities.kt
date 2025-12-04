package com.vfs.classesandobjectsinkotlin

fun fetchImages(): Array<String>
{
    // the logic fod reading from the network lives here
    return arrayOf()
}

// fun name (arg1; art1Type, arg2: arg2Type, ...): returnType { }
fun validateEmail (email: String): Boolean
{
    return email.contains("@")
}

fun validateEmailAndReturn (email: String): Pair<String, Boolean> // tuple
{
    return Pair(email,
        email.contains("@"))
}


fun test ()
{
    val v1 = Vehicle() // construction
    val v2 = Vehicle("Ford", "Red")


    // let's assume we read data from a server
    val data: HashMap<String, Any?> = hashMapOf("name" to "Ford",
                                               "color" to "Red",
                                               "tires" to 6,
                                               "cylinders" to 4,
                                               "horsePower" to 200)

    val v3 = Vehicle(data)
}
