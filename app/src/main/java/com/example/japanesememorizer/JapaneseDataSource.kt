package com.example.japanesememorizer

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.SQLException
import android.database.sqlite.SQLiteDatabase
import java.lang.Exception

class JapaneseDataSource(context: Context?) {
    private var database: SQLiteDatabase? = null
    private val dbHelper: JapaneseDBHelper

    @Throws(SQLException::class)
    fun open() {
        database = dbHelper.getWritableDatabase()
    }

    fun close() {
        dbHelper.close()
    }

    fun insertRestaurant(r: Japanese): Boolean {
        var didSucceed = false
        try {
            val initialValues = ContentValues()
            initialValues.put("Score", r.getScore())
            initialValues.put("Type", r.getType())
            initialValues.put("TorM", r.getTorM())

            didSucceed = database!!.insert("japanese", null, initialValues) > 0
        } catch (e: Exception) {
            //
        }
        return didSucceed
    }

    fun updateRestaurant(r: Japanese): Boolean {
        var didSucceed = false
        try {
            val rowId = r.getID()
            val updateValues = ContentValues()
            updateValues.put("Score", r.getScore())
            updateValues.put("Type", r.getType())
            updateValues.put("TorM", r.getTorM())
            didSucceed =
                database!!.update("japanese", updateValues, "JId=$rowId", null) > 0
        } catch (e: Exception) {
        }
        return didSucceed
    }
    fun getLastJId(): Int {
        var lastId = -1
        try {
            val query = "Select MAX(JId) from japanese"
            val cursor: Cursor = database!!.rawQuery(query, null)
            cursor.moveToFirst()
            lastId = cursor.getInt(0)
            cursor.close()
        } catch (e: Exception) {
            lastId = -1
        }
        return lastId
    }

    fun getHM(): Cursor? {
        open()
        val selection = "Type = ? and TorM = ?"
        val selectionArgs = arrayOf("hiragana", "M")
        val sortOrder = "Score DESC"
        val cursor = database?.query(
            "japanese",
            null,
            selection,
            selectionArgs,
            null,
            null,
            sortOrder
        )
        if (cursor != null) {
            if(cursor.getCount() > 0){
                return cursor
            }
        }
        return null
    }
    fun getKM(): Cursor?{
        open()
        val selection = "Type = ? and TorM = ?"
        val selectionArgs = arrayOf("katakana", "M")
        val sortOrder = "Score DESC"
        val cursor = database?.query(
            "japanese",
            null,
            selection,
            selectionArgs,
            null,
            null,
            sortOrder
        )
        if (cursor != null) {
            if(cursor.getCount() > 0){
                return cursor
            }
        }
        return null
    }
    fun getHT(): Cursor?{
        open()
        val selection = "Type = ? and TorM = ?"
        val selectionArgs = arrayOf("hiragana", "T")
        val sortOrder = "Score DESC"
        val cursor = database?.query(
            "japanese",
            null,
            selection,
            selectionArgs,
            null,
            null,
            sortOrder
        )
        if (cursor != null) {
            if(cursor.getCount() > 0){
                return cursor
            }
        }
        return null
    }
    fun getKT(): Cursor?{
        open()
        val selection = "Type = ? and TorM = ?"
        val selectionArgs = arrayOf("katakana", "T")
        val sortOrder = "Score DESC"
        val cursor = database?.query(
            "japanese",
            null,
            selection,
            selectionArgs,
            null,
            null,
            sortOrder
        )
        if (cursor != null) {
            if(cursor.getCount() > 0){
                return cursor
            }
        }
        return null
    }



    init {
        dbHelper = JapaneseDBHelper(context)
    }
}