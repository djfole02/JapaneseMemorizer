package com.example.japanesememorizer

import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.BaseColumns
import android.annotation.SuppressLint
import android.widget.CheckBox
import android.widget.TextView


class Profile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        val ds = JapaneseDataSource(this)
        val cursor: Cursor? = ds.getHM()
        val arr: MutableList<Int> = mutableListOf()
        if (cursor != null) {
            if(cursor.moveToFirst()){
                while(!cursor.isAfterLast){
                    @SuppressLint("Range") val score = cursor.getInt(cursor.getColumnIndex("Score"))
                    arr.add(score)
                    cursor.moveToNext()
                }
            }
        }
        else{
            arr.add(0)
        }
        val text_scoreHM = findViewById<TextView>(R.id.textView3)
        val string_scoreHM = "Best Memorize Score: " + arr[0].toString()
        text_scoreHM.text = string_scoreHM

        val cursor1: Cursor? = ds.getHT()
        val arr1: MutableList<Int> = mutableListOf()
        if (cursor1 != null) {
            if(cursor1.moveToFirst()){
                while(!cursor1.isAfterLast){
                    @SuppressLint("Range") val score = cursor1.getInt(cursor1.getColumnIndex("Score"))
                    arr1.add(score)
                    cursor1.moveToNext()
                }
            }
        }
        else{
            arr1.add(0)
        }
        val text_scoreHT = findViewById<TextView>(R.id.textView6)
        val string_scoreHT = "Best Test Score: " + arr1[0].toString()
        text_scoreHT.text = string_scoreHT

        val cursor2: Cursor? = ds.getKM()
        val arr2: MutableList<Int> = mutableListOf()
        if (cursor2 != null) {
            if(cursor2.moveToFirst()){
                while(!cursor2.isAfterLast){
                    @SuppressLint("Range") val score = cursor2.getInt(cursor2.getColumnIndex("Score"))
                    arr2.add(score)
                    cursor2.moveToNext()
                }
            }
        }
        else{
            arr2.add(0)
        }
        val text_scoreKM = findViewById<TextView>(R.id.textView7)
        val string_scoreKM = "Best Test Score: " + arr2[0].toString()
        text_scoreKM.text = string_scoreKM

        val cursor3: Cursor? = ds.getKT()
        val arr3: MutableList<Int> = mutableListOf()
        if (cursor3 != null) {
            if(cursor3.moveToFirst()){
                while(!cursor3.isAfterLast){
                    @SuppressLint("Range") val score = cursor3.getInt(cursor3.getColumnIndex("Score"))
                    arr3.add(score)
                    cursor3.moveToNext()
                }
            }
        }
        else{
            arr3.add(0)
        }
        val text_scoreKT = findViewById<TextView>(R.id.textView8)
        val string_scoreKT = "Best Test Score: " + arr3[0].toString()
        text_scoreKT.text = string_scoreKT

    }
}