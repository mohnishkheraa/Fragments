package com.ltts.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonRed.setOnClickListener{

            supportFragmentManager.beginTransaction().replace(R.id.fragment_green,RedFragement()).commit()


        }
        buttonBlue.setOnClickListener{
            var blueFrag= BlueFragment()
            var myManager = supportFragmentManager
            var myTransaction= myManager.beginTransaction()
            myTransaction.replace(R.id.fragment_green,blueFrag)
            myTransaction.commit()
        }


    }
}