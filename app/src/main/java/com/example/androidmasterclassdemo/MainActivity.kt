package com.example.androidmasterclassdemo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn).setOnClickListener{showNext()}
    }

    private fun showNext() {
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }
}
