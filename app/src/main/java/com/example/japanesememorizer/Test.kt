package com.example.japanesememorizer

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.lang.Exception
import kotlin.random.Random

class Test : AppCompatActivity() {
    data class Hiragana (
        val syllable: String,
        val roman: String
    )

    val chosen: MutableList<Hiragana> = mutableListOf()
    var possible: MutableList<Hiragana> = mutableListOf()

    var choiceS = ""
    var choiceR = ""

    var choice1S = ""
    var choice1R = ""

    var choice2S = ""
    var choice2R = ""

    var choice3S = ""
    var choice3R = ""

    var choice4S = ""
    var choice4R = ""

    var ran = 0
    var score = 0
    var total = 0
    var lives = 3
    var number = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        val guess = findViewById<TextView>(R.id.test_guess)
        val guess1 = findViewById<Button>(R.id.test_guess1)
        val guess2 = findViewById<Button>(R.id.test_guess2)
        val guess3 = findViewById<Button>(R.id.test_guess3)
        val guess4 = findViewById<Button>(R.id.test_guess4)

        val finalScore = findViewById<TextView>(R.id.textView)
        val back = findViewById<TextView>(R.id.button3)

        guess.visibility = View.VISIBLE
        guess1.visibility = View.VISIBLE
        guess2.visibility = View.VISIBLE
        guess3.visibility = View.VISIBLE
        guess4.visibility = View.VISIBLE

        finalScore.visibility = View.INVISIBLE
        back.visibility = View.INVISIBLE
        possible.clear()
        chosen.clear()

        val roman = intent.getStringArrayExtra("roman")
        val syllable = intent.getStringArrayExtra("syllable")

        if (roman != null && syllable != null && roman.size == syllable.size) {
            for(i in roman.indices){
                chosen.add(Hiragana(syllable[i], roman[i]))
            }
        }

        possible.addAll(chosen)
        possible.shuffle()

        setQuestion()
    }

    fun answer1(view: View){
        val guess1 = findViewById<Button>(R.id.test_guess1)
        val guess2 = findViewById<Button>(R.id.test_guess2)
        val guess3 = findViewById<Button>(R.id.test_guess3)
        val guess4 = findViewById<Button>(R.id.test_guess4)
        when (ran) {
            1 -> {
                score++
                guess1.setBackgroundColor(Color.parseColor("#35991F"))
            }
            2 -> {
                lives--
                guess2.setBackgroundColor(Color.parseColor("#35991F"))
            }
            3 -> {
                lives--
                guess3.setBackgroundColor(Color.parseColor("#35991F"))
            }
            4 -> {
                lives--
                guess4.setBackgroundColor(Color.parseColor("#35991F"))
            }
        }
        total++
        delayFunction({resetQuestion()}, 500)
    }

    fun answer2(view: View){
        val guess1 = findViewById<Button>(R.id.test_guess1)
        val guess2 = findViewById<Button>(R.id.test_guess2)
        val guess3 = findViewById<Button>(R.id.test_guess3)
        val guess4 = findViewById<Button>(R.id.test_guess4)
        when (ran) {
            1 -> {
                lives--
                guess1.setBackgroundColor(Color.parseColor("#35991F"))
            }
            2 -> {
                score++
                guess2.setBackgroundColor(Color.parseColor("#35991F"))
            }
            3 -> {
                lives--
                guess3.setBackgroundColor(Color.parseColor("#35991F"))
            }
            4 -> {
                lives--
                guess4.setBackgroundColor(Color.parseColor("#35991F"))
            }
        }
        total++
        delayFunction({resetQuestion()}, 500)
    }

    fun answer3(view: View) {
        val guess1 = findViewById<Button>(R.id.test_guess1)
        val guess2 = findViewById<Button>(R.id.test_guess2)
        val guess3 = findViewById<Button>(R.id.test_guess3)
        val guess4 = findViewById<Button>(R.id.test_guess4)
        when (ran) {
            1 -> {
                lives--
                guess1.setBackgroundColor(Color.parseColor("#35991F"))
            }
            2 -> {
                lives--
                guess2.setBackgroundColor(Color.parseColor("#35991F"))
            }
            3 -> {
                score++
                guess3.setBackgroundColor(Color.parseColor("#35991F"))
            }
            4 -> {
                lives--
                guess4.setBackgroundColor(Color.parseColor("#35991F"))
            }
        }
        total++
        delayFunction({resetQuestion()}, 500)
    }

    fun answer4(view: View) {
        val guess1 = findViewById<Button>(R.id.test_guess1)
        val guess2 = findViewById<Button>(R.id.test_guess2)
        val guess3 = findViewById<Button>(R.id.test_guess3)
        val guess4 = findViewById<Button>(R.id.test_guess4)
        when (ran) {
            1 -> {
                lives--
                guess1.setBackgroundColor(Color.parseColor("#35991F"))
            }
            2 -> {
                lives--
                guess2.setBackgroundColor(Color.parseColor("#35991F"))
            }
            3 -> {
                lives--
                guess3.setBackgroundColor(Color.parseColor("#35991F"))
            }
            4 -> {
                score++
                guess4.setBackgroundColor(Color.parseColor("#35991F"))
            }
        }
        total++
        delayFunction({resetQuestion()}, 500)
    }

    private fun setQuestion(){
        val guess = findViewById<TextView>(R.id.test_guess)
        val guess1 = findViewById<Button>(R.id.test_guess1)
        val guess2 = findViewById<Button>(R.id.test_guess2)
        val guess3 = findViewById<Button>(R.id.test_guess3)
        val guess4 = findViewById<Button>(R.id.test_guess4)

        ran = Random.nextInt(1, 5)
        val num = Random.nextInt(2,possible.size - 1)

        choiceR = possible.last().roman
        choiceS = possible.last().syllable

        choice1R = possible.last().roman
        choice1S = possible.last().syllable

        choice2R = possible[num].roman
        choice2S = possible[num].syllable

        choice3R = possible[num-1].roman
        choice3S = possible[num-1].syllable

        choice4R = possible[num-2].roman
        choice4S = possible[num-2].syllable

        guess.text = choiceS

        when (ran) {
            1 -> {
                guess1.text = choice1R
                guess2.text = choice2R
                guess3.text = choice3R
                guess4.text = choice4R
            }
            2 -> {
                guess1.text = choice4R
                guess2.text = choice1R
                guess3.text = choice2R
                guess4.text = choice3R
            }
            3 -> {
                guess1.text = choice3R
                guess2.text = choice4R
                guess3.text = choice1R
                guess4.text = choice2R
            }
            4 -> {
                guess1.text = choice2R
                guess2.text = choice3R
                guess3.text = choice4R
                guess4.text = choice1R
            }
        }
    }

    fun resetQuestion(){
        if(total == 50){
            endGame()
        }

        val guess1 = findViewById<Button>(R.id.test_guess1)
        val guess2 = findViewById<Button>(R.id.test_guess2)
        val guess3 = findViewById<Button>(R.id.test_guess3)
        val guess4 = findViewById<Button>(R.id.test_guess4)

        guess1.setBackgroundColor(Color.parseColor("#6200EE"))
        guess2.setBackgroundColor(Color.parseColor("#6200EE"))
        guess3.setBackgroundColor(Color.parseColor("#6200EE"))
        guess4.setBackgroundColor(Color.parseColor("#6200EE"))

        possible.removeLast()
        if (possible.size < 4){
            possible.clear()
            possible.addAll(chosen)
            possible.shuffle()
        }
        setQuestion()
    }

    fun endGame(){
        val guess = findViewById<TextView>(R.id.test_guess)
        val guess1 = findViewById<Button>(R.id.test_guess1)
        val guess2 = findViewById<Button>(R.id.test_guess2)
        val guess3 = findViewById<Button>(R.id.test_guess3)
        val guess4 = findViewById<Button>(R.id.test_guess4)

        val finalScore = findViewById<TextView>(R.id.textView)
        val back = findViewById<TextView>(R.id.button3)

        guess.visibility = View.INVISIBLE
        guess1.visibility = View.INVISIBLE
        guess2.visibility = View.INVISIBLE
        guess3.visibility = View.INVISIBLE
        guess4.visibility = View.INVISIBLE

        finalScore.visibility = View.VISIBLE
        back.visibility = View.VISIBLE

        finalScore.text = "Score: $score / $total"

    }

    fun backToMain(view: View){
        val choice = intent.getStringExtra("choice").toString()

        val currentJapanese: Japanese = Japanese(score, choice, "T")
        var wasSuccessful: Boolean
        val ds = JapaneseDataSource(this)
        try {
            Log.d("Memorize", "About to insert")
            ds.open()
            if (currentJapanese.getID() === -1) {
                wasSuccessful = ds.insertRestaurant(currentJapanese)
                val newId: Int = ds.getLastJId()
                currentJapanese.setID(newId)
            } else {
                wasSuccessful = ds.updateRestaurant(currentJapanese)
            }
            ds.close()
        } catch (e: Exception) {
            wasSuccessful = false
        }
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)

    }
    fun delayFunction(function: ()-> Unit, delay: Long) {
        Handler().postDelayed(function, delay)
    }
}