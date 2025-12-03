package com.oddinstitute.classesandobjects

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // MainActivity Class is and what is inheritence.

        val myUser: User = User("Amir",
            "amir.j@oddinstitute.com",
            34765)

        // inpemail can be accesse3s because it is marked as var
        myUser.inpEmail = "ss"

        Toast.makeText(this,
            "name is: ${myUser.name}",
            Toast.LENGTH_LONG).show()
    }
}


// if class parameters are marked with Val, var,
// they can be accesses, such as the inpEmail


class User (inpName: String?, var inpEmail: String, inpID: Int?)
{
    val name = inpName
    val email = inpEmail
    val ID = inpID
}

// if your class doesn't have primary argument, you don't need to have the parenthesis
class OtherClass
{
    
}



