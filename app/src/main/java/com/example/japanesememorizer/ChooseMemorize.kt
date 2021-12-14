package com.example.japanesememorizer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Switch


class ChooseMemorize : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_memorize)
    }

    fun toMemorizeFromHiragana(view: View){
        val button = findViewById<Button>(R.id.mem_hiragana)
        val message = "hiragana"
        val switch = findViewById<Switch>(R.id.switch2)
        val message2 = switch.text.toString()
        val intent = Intent(this,ChooseHiragana::class.java).apply {
            putExtra("choice", message)
            putExtra("switch", message2)
        }
        startActivity(intent)
    }

    fun toMemorizeFromKatakana(view: View){
        val button = findViewById<Button>(R.id.mem_katakana)
        val message = "katakana"
        val switch = findViewById<Switch>(R.id.switch2)
        val message2 = switch.text.toString()
        val intent = Intent(this,ChooseKatakana::class.java).apply{
            putExtra("choice", message)
            putExtra("switch", message2)
        }
        startActivity(intent)
    }

    fun switchLogic(view: View){
        val switch = findViewById<Switch>(R.id.switch2)
        if(switch.isChecked){
            switch.text = "J->E"
        }
        else{
            switch.text = "E->J"
        }
    }

}