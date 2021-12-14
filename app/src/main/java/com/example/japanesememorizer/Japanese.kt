package com.example.japanesememorizer

public class Japanese(score: Int, type: String, TorM: String) {

    private var id: Int = -1
    private val score: Int = score
    private val type: String = type
    private val TorM: String = TorM

    fun getID(): Int? {
        return id
    }

    fun getScore(): Int?{
        return score
    }

    fun getType(): String?{
        return type
    }

    fun getTorM(): String?{
        return TorM
    }

    fun setID(newId: Int) {
        id = newId
    }
}
