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
            chosen.add(Hiragana("ア", "A"))
            chosen.add(Hiragana("イ", "I"))
            chosen.add(Hiragana("ウ", "U"))
            chosen.add(Hiragana("エ", "E"))
            chosen.add(Hiragana("オ", "O"))
            num++
        }

        if(checkk_K.isChecked){
            chosen.add(Hiragana("カ", "KA"))
            chosen.add(Hiragana("キ", "KI"))
            chosen.add(Hiragana("ク", "KU"))
            chosen.add(Hiragana("ケ", "KE"))
            chosen.add(Hiragana("コ", "KO"))
            num++
        }

        if(checkk_S.isChecked){
            chosen.add(Hiragana("サ", "SA"))
            chosen.add(Hiragana("シ", "SHI"))
            chosen.add(Hiragana("ス", "SU"))
            chosen.add(Hiragana("セ", "SE"))
            chosen.add(Hiragana("ソ", "SO"))
            num++
        }

        if(checkk_T.isChecked){
            chosen.add(Hiragana("タ", "TA"))
            chosen.add(Hiragana("チ", "CHI"))
            chosen.add(Hiragana("ツ", "TSU"))
            chosen.add(Hiragana("テ", "TE"))
            chosen.add(Hiragana("ト", "TO"))
            num++
        }

        if(checkk_H.isChecked){
            chosen.add(Hiragana("ハ", "HA"))
            chosen.add(Hiragana("ヒ", "HI"))
            chosen.add(Hiragana("フ", "FU"))
            chosen.add(Hiragana("ヘ", "HE"))
            chosen.add(Hiragana("ホ", "HO"))
            num++
        }

        if(checkk_M.isChecked){
            chosen.add(Hiragana("マ", "MA"))
            chosen.add(Hiragana("ミ", "MI"))
            chosen.add(Hiragana("ム", "MU"))
            chosen.add(Hiragana("メ", "ME"))
            chosen.add(Hiragana("モ", "MO"))
            num++
        }

        if(checkk_R.isChecked){
            chosen.add(Hiragana("ラ", "RA"))
            chosen.add(Hiragana("リ", "RI"))
            chosen.add(Hiragana("ル", "RU"))
            chosen.add(Hiragana("レ", "RE"))
            chosen.add(Hiragana("ロ", "RO"))
            num++
        }

        if(checkk_N.isChecked){
            chosen.add(Hiragana("ナ", "NA"))
            chosen.add(Hiragana("ニ", "NI"))
            chosen.add(Hiragana("ヌ", "NU"))
            chosen.add(Hiragana("ネ", "NE"))
            chosen.add(Hiragana("ノ", "NO"))
            num++
        }

        if(checkk_KY.isChecked){
            chosen.add(Hiragana("キャ", "KYA"))
            chosen.add(Hiragana("キュ", "KYU"))
            chosen.add(Hiragana("キョ", "KYO"))
            num++
        }

        if(checkk_GY.isChecked){
            chosen.add(Hiragana("ギャ", "GYA"))
            chosen.add(Hiragana("ギュ", "GYU"))
            chosen.add(Hiragana("ギョ", "GYO"))
            num++
        }

        if(checkk_SH.isChecked){
            chosen.add(Hiragana("シャ", "SHA"))
            chosen.add(Hiragana("シュ", "SHU"))
            chosen.add(Hiragana("ショ", "SHO"))
            num++
        }

        if(checkk_J.isChecked){
            chosen.add(Hiragana("ジャ", "JA"))
            chosen.add(Hiragana("ジュ", "JU"))
            chosen.add(Hiragana("ジョ", "JO"))
            num++
        }

        if(checkk_CH.isChecked){
            chosen.add(Hiragana("チャ", "CHA"))
            chosen.add(Hiragana("チュ", "CHU"))
            chosen.add(Hiragana("チョ", "CHO"))
            num++
        }

        if(checkk_RY.isChecked){
            chosen.add(Hiragana("リャ", "RYA"))
            chosen.add(Hiragana("リュ", "RYU"))
            chosen.add(Hiragana("リョ", "RYO"))
            num++
        }

        if(checkk_G.isChecked){
            chosen.add(Hiragana("ガ", "GA"))
            chosen.add(Hiragana("ギ", "GI"))
            chosen.add(Hiragana("グ", "GU"))
            chosen.add(Hiragana("ゲ", "GE"))
            chosen.add(Hiragana("ゴ", "GO"))
            num++
        }

        if(checkk_Z.isChecked){
            chosen.add(Hiragana("ザ", "ZA"))
            chosen.add(Hiragana("ジ", "JI"))
            chosen.add(Hiragana("ズ", "ZU"))
            chosen.add(Hiragana("ゼ", "ZE"))
            chosen.add(Hiragana("ゾ", "ZO"))
            num++
        }

        if(checkk_D.isChecked){
            chosen.add(Hiragana("ダ", "DA"))
            chosen.add(Hiragana("ヂ", "DZI"))
            chosen.add(Hiragana("ヅ", "DZU"))
            chosen.add(Hiragana("デ", "DE"))
            chosen.add(Hiragana("ド","DO"))
            num++
        }

        if(checkk_B.isChecked){
            chosen.add(Hiragana("バ", "BA"))
            chosen.add(Hiragana("ビ", "BI"))
            chosen.add(Hiragana("ブ", "BU"))
            chosen.add(Hiragana("ベ", "BE"))
            chosen.add(Hiragana("ボ", "BO"))
            num++
        }

        if(checkk_P.isChecked){
            chosen.add(Hiragana("パ", "PA"))
            chosen.add(Hiragana("ピ", "PI"))
            chosen.add(Hiragana("プ", "PU"))
            chosen.add(Hiragana("ペ", "PE"))
            chosen.add(Hiragana("ポ", "PO"))
            num++
        }

        if(checkk_Y.isChecked){
            chosen.add(Hiragana("ヤ", "YA"))
            chosen.add(Hiragana("ユ", "YU"))
            chosen.add(Hiragana("ヨ", "YO"))
            num++
        }

        if(checkk_W.isChecked){
            chosen.add(Hiragana("ワ", "WA"))
            chosen.add(Hiragana("ヲ", "WO"))
            num++
        }

        if(checkk_NO.isChecked){
            chosen.add(Hiragana("ン", "N"))
            num++
        }

        if(checkk_NY.isChecked){
            chosen.add(Hiragana("ニャ", "NYA"))
            chosen.add(Hiragana("ニュ", "NYU"))
            chosen.add(Hiragana("ニョ", "NYO"))
            num++
        }

        if(checkk_HY.isChecked){
            chosen.add(Hiragana("ヒャ", "HYA"))
            chosen.add(Hiragana("ヒュ", "HYU"))
            chosen.add(Hiragana("ヒョ", "HYO"))
            num++
        }

        if(checkk_BY.isChecked){
            chosen.add(Hiragana("ビャ", "BYA"))
            chosen.add(Hiragana("ビュ", "BYU"))
            chosen.add(Hiragana("ビョ", "BYO"))
            num++
        }

        if(checkk_MY.isChecked){
            chosen.add(Hiragana("ミャ", "MYA"))
            chosen.add(Hiragana("ミュ", "MYU"))
            chosen.add(Hiragana("ミョ", "MYO"))
            num++
        }

        if(checkk_PY.isChecked) {
            chosen.add(Hiragana("ピャ", "PYA"))
            chosen.add(Hiragana("ピュ", "PYU"))
            chosen.add(Hiragana("ピョ", "PYO"))
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