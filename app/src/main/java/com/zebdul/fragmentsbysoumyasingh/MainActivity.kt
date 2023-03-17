package com.zebdul.fragmentsbysoumyasingh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.zebdul.fragmentsbysoumyasingh.ui.login.LoginFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*
        1. make a linear layout, A heading text view, add a linear layout horizontal,add a view ,
        and add a frameLayout
        2. add buttons in the horizontal linear layout
        3. create fragments manually -> layout -> new layout resource file
            A. design your fragments
        4. create a kotlin class -> main folder -> new class
            A. Extend with help of Fragment class
        5. create 2 more fragments copy 3 or 4
        6. main.kt -> initialize all buttons
        7. call setOnClickListener -> use replace function
            A. replaceFrameWithFragment(fragment_name())
        8. in function call fragment manager give them support set property for begin transaction
            call replace function for change them commit for call
         */
        val btnTime = findViewById<Button>(R.id.btnTime)
        val btnImage = findViewById<Button>(R.id.btnImage)
        val btnLogin = findViewById<Button>(R.id.btnLogin)

        btnTime.setOnClickListener {
            replaceTheFrame(Fragment_clock())
        }
        btnImage.setOnClickListener {
            replaceTheFrame(Fragment_image())
        }
        btnLogin.setOnClickListener {
            replaceTheFrame(LoginFragment())
        }

    }

    private fun replaceTheFrame(frag: Fragment) {
        val fragManager = supportFragmentManager
        val fragTransition = fragManager.beginTransaction()
        fragTransition.replace(R.id.frameLayout, frag)
        fragTransition.commit()
    }
}