package com.example.viewpagerapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.Button
import android.widget.Toast
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager


class MainActivity : AppCompatActivity()
{
    private val myViews: Array<Int> = arrayOf(R.layout.layout_one,
                                              R.layout.layout_two,
                                              R.layout.layout_three)

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<ViewPager>(R.id.myViewPager).adapter = MyAdapter(myViews,
                                        this@MainActivity)
    }
}


// Sample
class SimpleAdapter () : PagerAdapter()
{
    override fun isViewFromObject(view: View, `object`: Any): Boolean { return view === `object` }
    override fun getCount(): Int { return 0 }
}


class MyAdapter(private val inputViews: Array<Int>,
                private val theContext: Context) : PagerAdapter()
{
    // default method
    override fun isViewFromObject(view: View,
                                  `object`: Any): Boolean
    {
        return view === `object`

        /*
        Some of the Kotlin keywords are valid identifiers in Java:
        in, object, is, etc.
        If a Java library uses a Kotlin keyword for a method,
        you can still call the method escaping it with the backtick (`)
        character
         */
    }

    // default method
    override fun getCount(): Int = inputViews.size

    // default method
    override fun instantiateItem(container: ViewGroup,
                                 position: Int): Any
    {
        val thisView = inputViews[position]
        val inflater = LayoutInflater.from(theContext)
        val layout = inflater.inflate(thisView,
                                      container,
                                      false) as ViewGroup
        // Section 2
        if (position == 0)
        {
            val myButton = layout.findViewById<Button>(R.id.theButton)
            myButton.setOnClickListener {
                Toast.makeText(theContext,
                               "This is Tapped",
                               Toast.LENGTH_LONG).show()
            }
        }

        container.addView(layout)
        return layout
    }

    //
    override fun destroyItem(container: ViewGroup,
                             position: Int,
                             view: Any)
    {
        container.removeView(view as View)
    }
}