package com.example.japanesememorizer

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log

class JapaneseDBHelper(context: Context?) :
    SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {
    override fun onCreate(database: SQLiteDatabase) {
        database.execSQL(CREATE_TABLE_JAPANESE)

    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        Log.w(
            JapaneseDBHelper::class.java.name,
            "Upgrading database from version " + oldVersion + "to " + newVersion + ", which will destroy all old data"
        )
        db.execSQL("DROP TABLE IF EXISTS japanese")
        onCreate(db)
    }

    companion object {
        private const val DATABASE_NAME = "japanese.db"
        private const val DATABASE_VERSION = 1
        private const val CREATE_TABLE_JAPANESE =
            ("create table japanese (JId integer primary key autoincrement, "
                    + "Score text not null, Type text, TorM text);")

    }
}