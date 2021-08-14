package com.example.my_country_app

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button= findViewById<button>(R.id.button)
        button.setOnClickListener{it: View!
            val intent = Intent(this, activity_country::class.java)
            startActivity(intent)
        }
        /*fun sendMessage(view: View) {
            // Do something in response to button click
            val intent = Intent(this, activity_country::class.java)
            startActivity(intent)
        }*/
    }

}