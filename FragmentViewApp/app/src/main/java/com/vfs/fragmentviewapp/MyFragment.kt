package com.vfs.fragmentviewapp

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

// class MyClass

interface OnFragmentInteractionsListener
{
    fun detachButtonTapped () // a send, receive
}

class MyFragment: Fragment()
{
    lateinit var listener: OnFragmentInteractionsListener

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View?
    {
        val fragView = inflater.inflate(R.layout.my_fragment_layout,
                                        container,
                                        false)

        val detachButton = fragView.findViewById<Button>(R.id.detachFragButton_id)
        detachButton.setOnClickListener {
            listener.detachButtonTapped()
        }

        return fragView
    }

    override fun onAttach(context: Context)
    {
        super.onAttach(context)
        if (context is OnFragmentInteractionsListener)
        {
            listener = context // mainActivity
        }
    }

    override fun onDetach()
    {
        super.onDetach()
    }
}