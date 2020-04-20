package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnNext.setOnClickListener {
            loadFragment(firstFragment())
        }
        btnBack.setOnClickListener {
            loadFragment(secondFragment())
        }


    }

    private fun loadFragment(fragment:Fragment){
        val fragmentMangager = supportFragmentManager
        val fragmentTransaction = fragmentMangager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentMain,fragment)
        fragmentTransaction.commit()
    }
}
