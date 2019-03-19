package com.example.fm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_home.*


class MainActivity : AppCompatActivity()  {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item->
        when(item.itemId){
            R.id.nav_home->{
                println("home selected")
                replaceFragment(HomeFragment())
                return@OnNavigationItemSelectedListener true
            }

            R.id.nav_reports->{
                println("report selected")
                replaceFragment(ReportFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_transaction_history->{
                println("history selected")
                replaceFragment(HistoryFragment())
                return@OnNavigationItemSelectedListener true
            }
        }
        false

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // bottom_navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

        bottom_navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        replaceFragment(HomeFragment())
   /*    addTransactionButton.setOnClickListener {

          val intent = Intent (this, AddTransactionActivity::class.java)
           startActivity(intent)


       }*/



        //   bottom_navigation.setupWithNavController(Navigation.findNavController(this, R.id.bottom_navigation))

    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_container, fragment)
        fragmentTransaction.commit()

    }








}
