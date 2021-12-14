package com.example.japanesememorizer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun toChooseMemorize(view: View) {
        val intent = Intent(this,ChooseMemorize::class.java)
        startActivity(intent)
    }
    fun toTest(view: View){
        val intent = Intent(this,ChooseTest::class.java)
        startActivity(intent)
    }
    fun toProfile(view: View){
        val intent = Intent(this,Profile::class.java)
        startActivity(intent)
    }

}