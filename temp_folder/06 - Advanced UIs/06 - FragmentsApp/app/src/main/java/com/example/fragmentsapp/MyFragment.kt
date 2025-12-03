package com.example.fragmentsapp

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

// Section 2
// interface to communicate/delegate a task to another activity
interface OnButtonTapListener
{
    fun onButtonTapped()
}


class MyFragment : Fragment()
{
    // Section 2: an instance of the listener
    private lateinit var myListener: OnButtonTapListener

    // singleton to make sure only one fragment is shared
    companion object
    {
        fun newInstance(): MyFragment
        {
            return MyFragment()
        }
    }


    // Section 1 : Create the Fragment on CreateView
    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View?
    {
        // Inflate the layout for this fragment
        val fragView = inflater.inflate(R.layout.fragment_my,
                                        container,
                                        false)
        view?.requestLayout()
        val myTextView = fragView.findViewById<TextView>(R.id.fragTextViewId)
        myTextView.text = "Hi from Fragment"
        myTextView.textSize = 32F

        // Section 2:
        val myButton = fragView.findViewById<Button>(R.id.fragButonId)
        myButton.setOnClickListener {

            // 3 implement the interface
            myListener.onButtonTapped()
        }

        return fragView
    }



    override fun onAttach(context: Context)
    {
        super.onAttach(context)


        // Section 2:
        if (context is OnButtonTapListener)
        {
            myListener = context
        } else
        {
            throw ClassCastException("$context must implement OnButtonTapped.")
        }
    }

    override fun onDetach()
    {
        super.onDetach()
    }
}
