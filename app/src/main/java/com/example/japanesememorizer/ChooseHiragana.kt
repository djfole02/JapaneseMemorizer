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
            chosen.add(Hiragana("あ", "A"))
            chosen.add(Hiragana("い", "I"))
            chosen.add(Hiragana("う", "U"))
            chosen.add(Hiragana("え", "E"))
            chosen.add(Hiragana("お", "O"))
            num++
        }

        if(checkh_K.isChecked){
            chosen.add(Hiragana("か", "KA"))
            chosen.add(Hiragana("き", "KI"))
            chosen.add(Hiragana("く", "KU"))
            chosen.add(Hiragana("け", "KE"))
            chosen.add(Hiragana("こ", "KO"))
            num++
        }

        if(checkh_S.isChecked){
            chosen.add(Hiragana("さ", "SA"))
            chosen.add(Hiragana("し", "SHI"))
            chosen.add(Hiragana("す", "SU"))
            chosen.add(Hiragana("せ", "SE"))
            chosen.add(Hiragana("そ", "SO"))
            num++
        }

        if(checkh_T.isChecked){
            chosen.add(Hiragana("た", "TA"))
            chosen.add(Hiragana("ち", "CHI"))
            chosen.add(Hiragana("つ", "TSU"))
            chosen.add(Hiragana("て", "TE"))
            chosen.add(Hiragana("と", "TO"))
            num++
        }

        if(checkh_H.isChecked){
            chosen.add(Hiragana("は", "HA"))
            chosen.add(Hiragana("ひ", "HI"))
            chosen.add(Hiragana("ふ", "FU"))
            chosen.add(Hiragana("へ", "HE"))
            chosen.add(Hiragana("ほ", "HO"))
            num++
        }

        if(checkh_M.isChecked){
            chosen.add(Hiragana("ま", "MA"))
            chosen.add(Hiragana("み", "MI"))
            chosen.add(Hiragana("む", "MU"))
            chosen.add(Hiragana("め", "ME"))
            chosen.add(Hiragana("も", "MO"))
            num++
        }

        if(checkh_R.isChecked){
            chosen.add(Hiragana("ら", "RA"))
            chosen.add(Hiragana("り", "RI"))
            chosen.add(Hiragana("る", "RU"))
            chosen.add(Hiragana("れ", "RE"))
            chosen.add(Hiragana("ろ", "RO"))
            num++
        }

        if(checkh_N.isChecked){
            chosen.add(Hiragana("な", "NA"))
            chosen.add(Hiragana("に", "NI"))
            chosen.add(Hiragana("ぬ", "NU"))
            chosen.add(Hiragana("ね", "NE"))
            chosen.add(Hiragana("の", "NO"))
            num++
        }

        if(checkh_KY.isChecked){
            chosen.add(Hiragana("きゃ", "KYA"))
            chosen.add(Hiragana("きゅ", "KYU"))
            chosen.add(Hiragana("きょ", "KYO"))
            num++
        }

        if(checkh_GY.isChecked){
            chosen.add(Hiragana("ぎゃ", "GYA"))
            chosen.add(Hiragana("ぎゅ", "GYU"))
            chosen.add(Hiragana("ぎょ", "GYO"))
            num++
        }

        if(checkh_SH.isChecked){
            chosen.add(Hiragana("しゃ", "SHA"))
            chosen.add(Hiragana("しゅ", "SHU"))
            chosen.add(Hiragana("しょ", "SHO"))
            num++
        }

        if(checkh_J.isChecked){
            chosen.add(Hiragana("じゃ", "JA"))
            chosen.add(Hiragana("じゅ", "JU"))
            chosen.add(Hiragana("じょ", "JO"))
            num++
        }

        if(checkh_CH.isChecked){
            chosen.add(Hiragana("ちゃ", "CHA"))
            chosen.add(Hiragana("ちゅ", "CHU"))
            chosen.add(Hiragana("ちょ", "CHO"))
            num++
        }

        if(checkh_RY.isChecked){
            chosen.add(Hiragana("りゃ", "RYA"))
            chosen.add(Hiragana("りゅ", "RYU"))
            chosen.add(Hiragana("りょ", "RYO"))
            num++
        }

        if(checkh_G.isChecked){
            chosen.add(Hiragana("が", "GA"))
            chosen.add(Hiragana("ぎ", "GI"))
            chosen.add(Hiragana("ぐ", "GU"))
            chosen.add(Hiragana("げ", "GE"))
            chosen.add(Hiragana("ご", "GO"))
            num++
        }

        if(checkh_Z.isChecked){
            chosen.add(Hiragana("ざ", "ZA"))
            chosen.add(Hiragana("じ", "JI"))
            chosen.add(Hiragana("ず", "ZU"))
            chosen.add(Hiragana("ぜ", "ZE"))
            chosen.add(Hiragana("ぞ", "ZO"))
            num++
        }

        if(checkh_D.isChecked){
            chosen.add(Hiragana("だ", "DA"))
            chosen.add(Hiragana("ぢ", "DZI"))
            chosen.add(Hiragana("づ", "DZU"))
            chosen.add(Hiragana("で", "DE"))
            chosen.add(Hiragana("ど","DO"))
            num++
        }

        if(checkh_B.isChecked){
            chosen.add(Hiragana("ば", "BA"))
            chosen.add(Hiragana("び", "BI"))
            chosen.add(Hiragana("ぶ", "BU"))
            chosen.add(Hiragana("べ", "BE"))
            chosen.add(Hiragana("ぼ", "BO"))
            num++
        }

        if(checkh_P.isChecked){
            chosen.add(Hiragana("ぱ", "PA"))
            chosen.add(Hiragana("ぴ", "PI"))
            chosen.add(Hiragana("ぷ", "PU"))
            chosen.add(Hiragana("ぺ", "PE"))
            chosen.add(Hiragana("ぽ", "PO"))
            num++
        }

        if(checkh_Y.isChecked){
            chosen.add(Hiragana("や", "YA"))
            chosen.add(Hiragana("ゆ", "YU"))
            chosen.add(Hiragana("よ", "YO"))
            num++
        }

        if(checkh_W.isChecked){
            chosen.add(Hiragana("わ", "WA"))
            chosen.add(Hiragana("を", "WO"))
            num++
        }

        if(checkh_NO.isChecked){
            chosen.add(Hiragana("ん", "N"))
            num++
        }

        if(checkh_NY.isChecked){
            chosen.add(Hiragana("にゃ", "NYA"))
            chosen.add(Hiragana("にゅ", "NYU"))
            chosen.add(Hiragana("にょ", "NYO"))
            num++
        }

        if(checkh_HY.isChecked){
            chosen.add(Hiragana("ひゃ", "HYA"))
            chosen.add(Hiragana("ひゅ", "HYU"))
            chosen.add(Hiragana("ひょ", "HYO"))
            num++
        }

        if(checkh_BY.isChecked){
            chosen.add(Hiragana("びゃ", "BYA"))
            chosen.add(Hiragana("びゅ", "BYU"))
            chosen.add(Hiragana("びょ", "BYO"))
            num++
        }

        if(checkh_MY.isChecked){
            chosen.add(Hiragana("みゃ", "MYA"))
            chosen.add(Hiragana("みゅ", "MYU"))
            chosen.add(Hiragana("みょ", "MYO"))
            num++
        }

        if(checkh_PY.isChecked) {
            chosen.add(Hiragana("ぴゃ", "PYA"))
            chosen.add(Hiragana("ぴゅ", "PYU"))
            chosen.add(Hiragana("ぴょ", "PYO"))
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