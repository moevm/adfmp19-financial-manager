package com.example.fm

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_home, container, false)


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        transactionButton.setOnClickListener {
            val intent = Intent(this@HomeFragment.context, AddTransactionActivity::class.java)
            startActivity(intent)

        }
    }
    }

 /*   (savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      // setContentView(R.layout.activity_main)

        // bottom_navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

     //   bottom_navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
     //   replaceFragment(HomeFragment())
         transactionButton.setOnClickListener {

             val intent = Intent(this@HomeFragment.context, AddTransactionActivity::class.java)
          startActivity(intent)


           }



    }*/
