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

        fun initialize ()
        {
            val task_1 = Task("Buy Food", false)
            val task_2 = Task("Fix the Car", true)
            val task_3 = Task("Balloons", false)
            val task_4 = Task("Book Flight", false)
            val task_5 = Task("Register Courses", false)
            val task_6 = Task("Finish Assignment", false)
            val task_7 = Task("Meet with Chris", false)
            val task_8 = Task("Buy Drinks", false)


            val group_1 = Group ("Home", mutableListOf(task_1, task_2))
            val group_2 = Group ("School", mutableListOf(task_6, task_7))
            val group_3 = Group ("Trip", mutableListOf(task_4))
            val group_4 = Group ("Party", mutableListOf(task_3, task_8))
            val group_5 = Group ("Summer", mutableListOf(task_5))

            groups = mutableListOf(group_1, group_2, group_3, group_4, group_5)
        }
    }
}










