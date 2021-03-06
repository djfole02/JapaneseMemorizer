package com.example.japanesememorizer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox

class ChooseKatakana : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_katakana)
    }
    fun chosen(view: View){
        data class Hiragana (
            val syllable: String,
            val roman: String
        )
        val choice = intent.getStringExtra("choice")
        var num = 0
        val chosen: MutableList<Hiragana> = mutableListOf()

        val checkk_ = findViewById<CheckBox>(R.id.k_)
        val checkk_K = findViewById<CheckBox>(R.id.k_K)
        val checkk_S = findViewById<CheckBox>(R.id.k_S)
        val checkk_T = findViewById<CheckBox>(R.id.k_T)
        val checkk_H = findViewById<CheckBox>(R.id.k_H)
        val checkk_M = findViewById<CheckBox>(R.id.k_M)
        val checkk_R = findViewById<CheckBox>(R.id.k_R)
        val checkk_N = findViewById<CheckBox>(R.id.k_N)
        val checkk_KY = findViewById<CheckBox>(R.id.k_KY)
        val checkk_GY = findViewById<CheckBox>(R.id.k_GY)
        val checkk_SH = findViewById<CheckBox>(R.id.k_SH)
        val checkk_J = findViewById<CheckBox>(R.id.k_J)
        val checkk_CH = findViewById<CheckBox>(R.id.k_CH)
        val checkk_RY = findViewById<CheckBox>(R.id.k_RY)
        val checkk_G = findViewById<CheckBox>(R.id.k_G)
        val checkk_Z = findViewById<CheckBox>(R.id.k_Z)
        val checkk_D = findViewById<CheckBox>(R.id.k_D)
        val checkk_B = findViewById<CheckBox>(R.id.k_B)
        val checkk_P = findViewById<CheckBox>(R.id.k_P)
        val checkk_Y = findViewById<CheckBox>(R.id.k_Y)
        val checkk_W = findViewById<CheckBox>(R.id.k_W)
        val checkk_NO = findViewById<CheckBox>(R.id.k_NO)
        val checkk_NY = findViewById<CheckBox>(R.id.k_NY)
        val checkk_HY = findViewById<CheckBox>(R.id.k_HY)
        val checkk_BY = findViewById<CheckBox>(R.id.k_BY)
        val checkk_MY = findViewById<CheckBox>(R.id.k_MY)
        val checkk_PY = findViewById<CheckBox>(R.id.k_PY)

        if(checkk_.isChecked){
            chosen.add(Hiragana("???", "A"))
            chosen.add(Hiragana("???", "I"))
            chosen.add(Hiragana("???", "U"))
            chosen.add(Hiragana("???", "E"))
            chosen.add(Hiragana("???", "O"))
            num++
        }

        if(checkk_K.isChecked){
            chosen.add(Hiragana("???", "KA"))
            chosen.add(Hiragana("???", "KI"))
            chosen.add(Hiragana("???", "KU"))
            chosen.add(Hiragana("???", "KE"))
            chosen.add(Hiragana("???", "KO"))
            num++
        }

        if(checkk_S.isChecked){
            chosen.add(Hiragana("???", "SA"))
            chosen.add(Hiragana("???", "SHI"))
            chosen.add(Hiragana("???", "SU"))
            chosen.add(Hiragana("???", "SE"))
            chosen.add(Hiragana("???", "SO"))
            num++
        }

        if(checkk_T.isChecked){
            chosen.add(Hiragana("???", "TA"))
            chosen.add(Hiragana("???", "CHI"))
            chosen.add(Hiragana("???", "TSU"))
            chosen.add(Hiragana("???", "TE"))
            chosen.add(Hiragana("???", "TO"))
            num++
        }

        if(checkk_H.isChecked){
            chosen.add(Hiragana("???", "HA"))
            chosen.add(Hiragana("???", "HI"))
            chosen.add(Hiragana("???", "FU"))
            chosen.add(Hiragana("???", "HE"))
            chosen.add(Hiragana("???", "HO"))
            num++
        }

        if(checkk_M.isChecked){
            chosen.add(Hiragana("???", "MA"))
            chosen.add(Hiragana("???", "MI"))
            chosen.add(Hiragana("???", "MU"))
            chosen.add(Hiragana("???", "ME"))
            chosen.add(Hiragana("???", "MO"))
            num++
        }

        if(checkk_R.isChecked){
            chosen.add(Hiragana("???", "RA"))
            chosen.add(Hiragana("???", "RI"))
            chosen.add(Hiragana("???", "RU"))
            chosen.add(Hiragana("???", "RE"))
            chosen.add(Hiragana("???", "RO"))
            num++
        }

        if(checkk_N.isChecked){
            chosen.add(Hiragana("???", "NA"))
            chosen.add(Hiragana("???", "NI"))
            chosen.add(Hiragana("???", "NU"))
            chosen.add(Hiragana("???", "NE"))
            chosen.add(Hiragana("???", "NO"))
            num++
        }

        if(checkk_KY.isChecked){
            chosen.add(Hiragana("??????", "KYA"))
            chosen.add(Hiragana("??????", "KYU"))
            chosen.add(Hiragana("??????", "KYO"))
            num++
        }

        if(checkk_GY.isChecked){
            chosen.add(Hiragana("??????", "GYA"))
            chosen.add(Hiragana("??????", "GYU"))
            chosen.add(Hiragana("??????", "GYO"))
            num++
        }

        if(checkk_SH.isChecked){
            chosen.add(Hiragana("??????", "SHA"))
            chosen.add(Hiragana("??????", "SHU"))
            chosen.add(Hiragana("??????", "SHO"))
            num++
        }

        if(checkk_J.isChecked){
            chosen.add(Hiragana("??????", "JA"))
            chosen.add(Hiragana("??????", "JU"))
            chosen.add(Hiragana("??????", "JO"))
            num++
        }

        if(checkk_CH.isChecked){
            chosen.add(Hiragana("??????", "CHA"))
            chosen.add(Hiragana("??????", "CHU"))
            chosen.add(Hiragana("??????", "CHO"))
            num++
        }

        if(checkk_RY.isChecked){
            chosen.add(Hiragana("??????", "RYA"))
            chosen.add(Hiragana("??????", "RYU"))
            chosen.add(Hiragana("??????", "RYO"))
            num++
        }

        if(checkk_G.isChecked){
            chosen.add(Hiragana("???", "GA"))
            chosen.add(Hiragana("???", "GI"))
            chosen.add(Hiragana("???", "GU"))
            chosen.add(Hiragana("???", "GE"))
            chosen.add(Hiragana("???", "GO"))
            num++
        }

        if(checkk_Z.isChecked){
            chosen.add(Hiragana("???", "ZA"))
            chosen.add(Hiragana("???", "JI"))
            chosen.add(Hiragana("???", "ZU"))
            chosen.add(Hiragana("???", "ZE"))
            chosen.add(Hiragana("???", "ZO"))
            num++
        }

        if(checkk_D.isChecked){
            chosen.add(Hiragana("???", "DA"))
            chosen.add(Hiragana("???", "DZI"))
            chosen.add(Hiragana("???", "DZU"))
            chosen.add(Hiragana("???", "DE"))
            chosen.add(Hiragana("???","DO"))
            num++
        }

        if(checkk_B.isChecked){
            chosen.add(Hiragana("???", "BA"))
            chosen.add(Hiragana("???", "BI"))
            chosen.add(Hiragana("???", "BU"))
            chosen.add(Hiragana("???", "BE"))
            chosen.add(Hiragana("???", "BO"))
            num++
        }

        if(checkk_P.isChecked){
            chosen.add(Hiragana("???", "PA"))
            chosen.add(Hiragana("???", "PI"))
            chosen.add(Hiragana("???", "PU"))
            chosen.add(Hiragana("???", "PE"))
            chosen.add(Hiragana("???", "PO"))
            num++
        }

        if(checkk_Y.isChecked){
            chosen.add(Hiragana("???", "YA"))
            chosen.add(Hiragana("???", "YU"))
            chosen.add(Hiragana("???", "YO"))
            num++
        }

        if(checkk_W.isChecked){
            chosen.add(Hiragana("???", "WA"))
            chosen.add(Hiragana("???", "WO"))
            num++
        }

        if(checkk_NO.isChecked){
            chosen.add(Hiragana("???", "N"))
            num++
        }

        if(checkk_NY.isChecked){
            chosen.add(Hiragana("??????", "NYA"))
            chosen.add(Hiragana("??????", "NYU"))
            chosen.add(Hiragana("??????", "NYO"))
            num++
        }

        if(checkk_HY.isChecked){
            chosen.add(Hiragana("??????", "HYA"))
            chosen.add(Hiragana("??????", "HYU"))
            chosen.add(Hiragana("??????", "HYO"))
            num++
        }

        if(checkk_BY.isChecked){
            chosen.add(Hiragana("??????", "BYA"))
            chosen.add(Hiragana("??????", "BYU"))
            chosen.add(Hiragana("??????", "BYO"))
            num++
        }

        if(checkk_MY.isChecked){
            chosen.add(Hiragana("??????", "MYA"))
            chosen.add(Hiragana("??????", "MYU"))
            chosen.add(Hiragana("??????", "MYO"))
            num++
        }

        if(checkk_PY.isChecked) {
            chosen.add(Hiragana("??????", "PYA"))
            chosen.add(Hiragana("??????", "PYU"))
            chosen.add(Hiragana("??????", "PYO"))
            num++
        }
        val list1: MutableList<String> = mutableListOf()
        val list2: MutableList<String> = mutableListOf()

        for(i in chosen){
            list1.add(i.syllable)
            list2.add(i.roman)
        }
        val arr1: Array<String> = list1.toTypedArray()
        val arr2: Array<String> = list2.toTypedArray()
        val toFrom = intent.getStringExtra("switch")
        val intent = Intent(this,Memorize::class.java).apply {
            putExtra("syllable", arr1)
            putExtra("roman", arr2)
            putExtra("num", num)
            putExtra("choice", choice)
            putExtra("switch", toFrom)
        }
        startActivity(intent)
    }
}