package com.vfs.fragmentviewapp

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class MyFragment: Fragment()
{
    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View?
    {
        val fragView = inflater.inflate(R.layout.my_fragment_layout,
                                        container,
                                        false)

        return fragView
    }

    override fun onAttach(context: Context)
    {
        super.onAttach(context)
    }

    override fun onDetach()
    {
        super.onDetach()
    }
}