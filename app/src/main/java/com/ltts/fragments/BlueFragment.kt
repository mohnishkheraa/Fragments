package com.ltts.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.blue_fragment.view.*

class BlueFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var v = inflater.inflate(R.layout.blue_fragment,container,false)
        v.buttonBlueFrag.setOnClickListener {
            var redFrag= RedFragement()
            fragmentManager!!.beginTransaction().replace(R.id.yellow,redFrag).commit()
        }
        return v
    }

}