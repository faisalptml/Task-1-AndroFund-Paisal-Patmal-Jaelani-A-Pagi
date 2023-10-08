package com.paisal.latihan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import com.mila.latihan2.R

class IniFragment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ini_fragment)


        val fragmentManager : FragmentManager = supportFragmentManager
        val homeFragment = HomeFragment()
        val fragment = fragmentManager.findFragmentByTag(HomeFragment::class.java.simpleName)

        if (fragment !is HomeFragment){
            fragmentManager
                .beginTransaction()
                .add(R.id.container, homeFragment, HomeFragment::class.java.simpleName)
                .commit()
        }
    }
}