package com.vfs.classesandobjectsinkotlin

import java.util.UUID

// void printName() { }

// you put a data in front of the class
// a data class is similar to a struct in C++
data class User2 (var displayName: String, val email: String, val id: UUID)

