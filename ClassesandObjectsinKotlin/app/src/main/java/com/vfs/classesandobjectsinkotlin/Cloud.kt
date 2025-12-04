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
