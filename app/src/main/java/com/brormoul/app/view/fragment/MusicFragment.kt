package com.brormoul.app.view.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.brormoul.app.R

/**
 * A simple [Fragment] subclass.
 */
class MusicFragment : Fragment() {

    companion object {
        fun newInstance(): MusicFragment = MusicFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view  = inflater.inflate(R.layout.fragment_music, container, false)
        return view
    }
}
