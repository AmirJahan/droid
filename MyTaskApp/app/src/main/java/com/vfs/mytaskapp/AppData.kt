package com.vfs.mytaskapp
data class Task (val name: String,
                 var completed: Boolean)

data class Group (val name: String,
                  var tasks: MutableList<Task>)

class AppData
{
    companion object
    {
        var groups: MutableList<Group> = mutableListOf()
    }
}