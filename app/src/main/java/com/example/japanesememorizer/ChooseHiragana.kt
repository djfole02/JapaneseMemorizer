package com.example.japanesememorizer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import java.io.Serializable

class ChooseHiragana : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_hiragana)

    }
    fun chosen(view: View){
        data class Hiragana (
            val syllable: String,
            val roman: String
        )
        val choice = intent.getStringExtra("choice")
        var num = 0
        val chosen: MutableList<Hiragana> = mutableListOf()

        val checkh_ = findViewById<CheckBox>(R.id.h_)
        val checkh_K = findViewById<CheckBox>(R.id.h_K)
        val checkh_S = findViewById<CheckBox>(R.id.h_S)
        val checkh_T = findViewById<CheckBox>(R.id.h_T)
        val checkh_H = findViewById<CheckBox>(R.id.h_H)
        val checkh_M = findViewById<CheckBox>(R.id.h_M)
        val checkh_R = findViewById<CheckBox>(R.id.h_R)
        val checkh_N = findViewById<CheckBox>(R.id.h_N)
        val checkh_KY = findViewById<CheckBox>(R.id.h_KY)
        val checkh_GY = findViewById<CheckBox>(R.id.h_GY)
        val checkh_SH = findViewById<CheckBox>(R.id.h_SH)
        val checkh_J = findViewById<CheckBox>(R.id.h_J)
        val checkh_CH = findViewById<CheckBox>(R.id.h_CH)
        val checkh_RY = findViewById<CheckBox>(R.id.h_RY)
        val checkh_G = findViewById<CheckBox>(R.id.h_G)
        val checkh_Z = findViewById<CheckBox>(R.id.h_Z)
        val checkh_D = findViewById<CheckBox>(R.id.h_D)
        val checkh_B = findViewById<CheckBox>(R.id.h_B)
        val checkh_P = findViewById<CheckBox>(R.id.h_P)
        val checkh_Y = findViewById<CheckBox>(R.id.h_Y)
        val checkh_W = findViewById<CheckBox>(R.id.h_W)
        val checkh_NO = findViewById<CheckBox>(R.id.h_NO)
        val checkh_NY = findViewById<CheckBox>(R.id.h_NY)
        val checkh_HY = findViewById<CheckBox>(R.id.h_HY)
        val checkh_BY = findViewById<CheckBox>(R.id.h_BY)
        val checkh_MY = findViewById<CheckBox>(R.id.h_MY)
        val checkh_PY = findViewById<CheckBox>(R.id.h_PY)

        if(checkh_.isChecked){
            chosen.add(Hiragana("???", "A"))
            chosen.add(Hiragana("???", "I"))
            chosen.add(Hiragana("???", "U"))
            chosen.add(Hiragana("???", "E"))
            chosen.add(Hiragana("???", "O"))
            num++
        }

        if(checkh_K.isChecked){
            chosen.add(Hiragana("???", "KA"))
            chosen.add(Hiragana("???", "KI"))
            chosen.add(Hiragana("???", "KU"))
            chosen.add(Hiragana("???", "KE"))
            chosen.add(Hiragana("???", "KO"))
            num++
        }

        if(checkh_S.isChecked){
            chosen.add(Hiragana("???", "SA"))
            chosen.add(Hiragana("???", "SHI"))
            chosen.add(Hiragana("???", "SU"))
            chosen.add(Hiragana("???", "SE"))
            chosen.add(Hiragana("???", "SO"))
            num++
        }

        if(checkh_T.isChecked){
            chosen.add(Hiragana("???", "TA"))
            chosen.add(Hiragana("???", "CHI"))
            chosen.add(Hiragana("???", "TSU"))
            chosen.add(Hiragana("???", "TE"))
            chosen.add(Hiragana("???", "TO"))
            num++
        }

        if(checkh_H.isChecked){
            chosen.add(Hiragana("???", "HA"))
            chosen.add(Hiragana("???", "HI"))
            chosen.add(Hiragana("???", "FU"))
            chosen.add(Hiragana("???", "HE"))
            chosen.add(Hiragana("???", "HO"))
            num++
        }

        if(checkh_M.isChecked){
            chosen.add(Hiragana("???", "MA"))
            chosen.add(Hiragana("???", "MI"))
            chosen.add(Hiragana("???", "MU"))
            chosen.add(Hiragana("???", "ME"))
            chosen.add(Hiragana("???", "MO"))
            num++
        }

        if(checkh_R.isChecked){
            chosen.add(Hiragana("???", "RA"))
            chosen.add(Hiragana("???", "RI"))
            chosen.add(Hiragana("???", "RU"))
            chosen.add(Hiragana("???", "RE"))
            chosen.add(Hiragana("???", "RO"))
            num++
        }

        if(checkh_N.isChecked){
            chosen.add(Hiragana("???", "NA"))
            chosen.add(Hiragana("???", "NI"))
            chosen.add(Hiragana("???", "NU"))
            chosen.add(Hiragana("???", "NE"))
            chosen.add(Hiragana("???", "NO"))
            num++
        }

        if(checkh_KY.isChecked){
            chosen.add(Hiragana("??????", "KYA"))
            chosen.add(Hiragana("??????", "KYU"))
            chosen.add(Hiragana("??????", "KYO"))
            num++
        }

        if(checkh_GY.isChecked){
            chosen.add(Hiragana("??????", "GYA"))
            chosen.add(Hiragana("??????", "GYU"))
            chosen.add(Hiragana("??????", "GYO"))
            num++
        }

        if(checkh_SH.isChecked){
            chosen.add(Hiragana("??????", "SHA"))
            chosen.add(Hiragana("??????", "SHU"))
            chosen.add(Hiragana("??????", "SHO"))
            num++
        }

        if(checkh_J.isChecked){
            chosen.add(Hiragana("??????", "JA"))
            chosen.add(Hiragana("??????", "JU"))
            chosen.add(Hiragana("??????", "JO"))
            num++
        }

        if(checkh_CH.isChecked){
            chosen.add(Hiragana("??????", "CHA"))
            chosen.add(Hiragana("??????", "CHU"))
            chosen.add(Hiragana("??????", "CHO"))
            num++
        }

        if(checkh_RY.isChecked){
            chosen.add(Hiragana("??????", "RYA"))
            chosen.add(Hiragana("??????", "RYU"))
            chosen.add(Hiragana("??????", "RYO"))
            num++
        }

        if(checkh_G.isChecked){
            chosen.add(Hiragana("???", "GA"))
            chosen.add(Hiragana("???", "GI"))
            chosen.add(Hiragana("???", "GU"))
            chosen.add(Hiragana("???", "GE"))
            chosen.add(Hiragana("???", "GO"))
            num++
        }

        if(checkh_Z.isChecked){
            chosen.add(Hiragana("???", "ZA"))
            chosen.add(Hiragana("???", "JI"))
            chosen.add(Hiragana("???", "ZU"))
            chosen.add(Hiragana("???", "ZE"))
            chosen.add(Hiragana("???", "ZO"))
            num++
        }

        if(checkh_D.isChecked){
            chosen.add(Hiragana("???", "DA"))
            chosen.add(Hiragana("???", "DZI"))
            chosen.add(Hiragana("???", "DZU"))
            chosen.add(Hiragana("???", "DE"))
            chosen.add(Hiragana("???","DO"))
            num++
        }

        if(checkh_B.isChecked){
            chosen.add(Hiragana("???", "BA"))
            chosen.add(Hiragana("???", "BI"))
            chosen.add(Hiragana("???", "BU"))
            chosen.add(Hiragana("???", "BE"))
            chosen.add(Hiragana("???", "BO"))
            num++
        }

        if(checkh_P.isChecked){
            chosen.add(Hiragana("???", "PA"))
            chosen.add(Hiragana("???", "PI"))
            chosen.add(Hiragana("???", "PU"))
            chosen.add(Hiragana("???", "PE"))
            chosen.add(Hiragana("???", "PO"))
            num++
        }

        if(checkh_Y.isChecked){
            chosen.add(Hiragana("???", "YA"))
            chosen.add(Hiragana("???", "YU"))
            chosen.add(Hiragana("???", "YO"))
            num++
        }

        if(checkh_W.isChecked){
            chosen.add(Hiragana("???", "WA"))
            chosen.add(Hiragana("???", "WO"))
            num++
        }

        if(checkh_NO.isChecked){
            chosen.add(Hiragana("???", "N"))
            num++
        }

        if(checkh_NY.isChecked){
            chosen.add(Hiragana("??????", "NYA"))
            chosen.add(Hiragana("??????", "NYU"))
            chosen.add(Hiragana("??????", "NYO"))
            num++
        }

        if(checkh_HY.isChecked){
            chosen.add(Hiragana("??????", "HYA"))
            chosen.add(Hiragana("??????", "HYU"))
            chosen.add(Hiragana("??????", "HYO"))
            num++
        }

        if(checkh_BY.isChecked){
            chosen.add(Hiragana("??????", "BYA"))
            chosen.add(Hiragana("??????", "BYU"))
            chosen.add(Hiragana("??????", "BYO"))
            num++
        }

        if(checkh_MY.isChecked){
            chosen.add(Hiragana("??????", "MYA"))
            chosen.add(Hiragana("??????", "MYU"))
            chosen.add(Hiragana("??????", "MYO"))
            num++
        }

        if(checkh_PY.isChecked) {
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