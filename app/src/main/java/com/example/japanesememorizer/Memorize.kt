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
import androidx.core.view.isVisible
import androidx.fragment.app.FragmentActivity
import kotlinx.coroutines.delay
import java.lang.Exception
import kotlin.random.Random

class Memorize : AppCompatActivity() {
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
    var lives = 3
    var number = 0
    var switchChoice = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memorize)

        val guess = findViewById<TextView>(R.id.mem_guess1)
        val guess1 = findViewById<Button>(R.id.mem_guess1)
        val guess2 = findViewById<Button>(R.id.mem_guess2)
        val guess3 = findViewById<Button>(R.id.mem_guess3)
        val guess4 = findViewById<Button>(R.id.mem_guess4)
        val theScore = findViewById<TextView>(R.id.score)
        val theLives = findViewById<TextView>(R.id.lives)
        val finalScore = findViewById<TextView>(R.id.textView5)
        val back = findViewById<TextView>(R.id.button4)

        guess.visibility = View.VISIBLE
        guess1.visibility = View.VISIBLE
        guess2.visibility = View.VISIBLE
        guess3.visibility = View.VISIBLE
        guess4.visibility = View.VISIBLE
        theScore.visibility = View.VISIBLE
        theLives.visibility = View.VISIBLE

        finalScore.visibility = View.INVISIBLE
        back.visibility = View.INVISIBLE
        possible.clear()
        chosen.clear()
        val toFrom = intent.getStringExtra("switch")
        val roman = intent.getStringArrayExtra("roman")
        val syllable = intent.getStringArrayExtra("syllable")
        val num = intent.getIntExtra("num", 1)
        number = num
        switchChoice = toFrom.toString()
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
        val guess1 = findViewById<Button>(R.id.mem_guess1)
        val guess2 = findViewById<Button>(R.id.mem_guess2)
        val guess3 = findViewById<Button>(R.id.mem_guess3)
        val guess4 = findViewById<Button>(R.id.mem_guess4)
        when (ran) {
            1 -> {
                score = (score + 1*(number/3) + 1)
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
        delayFunction({resetQuestion()}, 500)
    }

    fun answer2(view: View){
        val guess1 = findViewById<Button>(R.id.mem_guess1)
        val guess2 = findViewById<Button>(R.id.mem_guess2)
        val guess3 = findViewById<Button>(R.id.mem_guess3)
        val guess4 = findViewById<Button>(R.id.mem_guess4)
        when (ran) {
            1 -> {
                lives--
                guess1.setBackgroundColor(Color.parseColor("#35991F"))
            }
            2 -> {
                score = (score + 1*(number/3) + 1)
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
        delayFunction({resetQuestion()}, 500)
    }

    fun answer3(view: View) {
        val guess1 = findViewById<Button>(R.id.mem_guess1)
        val guess2 = findViewById<Button>(R.id.mem_guess2)
        val guess3 = findViewById<Button>(R.id.mem_guess3)
        val guess4 = findViewById<Button>(R.id.mem_guess4)
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
                score = (score + 1*(number/3) + 1)
                guess3.setBackgroundColor(Color.parseColor("#35991F"))
            }
            4 -> {
                lives--
                guess4.setBackgroundColor(Color.parseColor("#35991F"))
            }
        }
        delayFunction({resetQuestion()}, 500)
    }

    fun answer4(view: View) {
        val guess1 = findViewById<Button>(R.id.mem_guess1)
        val guess2 = findViewById<Button>(R.id.mem_guess2)
        val guess3 = findViewById<Button>(R.id.mem_guess3)
        val guess4 = findViewById<Button>(R.id.mem_guess4)
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
                score = (score + 1*(number/3) + 1)
                guess4.setBackgroundColor(Color.parseColor("#35991F"))
            }
        }
        delayFunction({resetQuestion()}, 500)
    }

    private fun setQuestion(){
        val guess = findViewById<TextView>(R.id.mem_guess)
        val guess1 = findViewById<Button>(R.id.mem_guess1)
        val guess2 = findViewById<Button>(R.id.mem_guess2)
        val guess3 = findViewById<Button>(R.id.mem_guess3)
        val guess4 = findViewById<Button>(R.id.mem_guess4)

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

        if(switchChoice == "J->E"){
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
        if(switchChoice == "E->J"){
            guess.text = choiceR

            when (ran) {
                1 -> {
                    guess1.text = choice1S
                    guess2.text = choice2S
                    guess3.text = choice3S
                    guess4.text = choice4S
                }
                2 -> {
                    guess1.text = choice4S
                    guess2.text = choice1S
                    guess3.text = choice2S
                    guess4.text = choice3S
                }
                3 -> {
                    guess1.text = choice3S
                    guess2.text = choice4S
                    guess3.text = choice1S
                    guess4.text = choice2S
                }
                4 -> {
                    guess1.text = choice2S
                    guess2.text = choice3S
                    guess3.text = choice4S
                    guess4.text = choice1S
                }
            }
        }

    }

    fun resetQuestion(){
        if(lives == 0){
            endGame()
        }
        val guess1 = findViewById<Button>(R.id.mem_guess1)
        val guess2 = findViewById<Button>(R.id.mem_guess2)
        val guess3 = findViewById<Button>(R.id.mem_guess3)
        val guess4 = findViewById<Button>(R.id.mem_guess4)
        val theScore = findViewById<TextView>(R.id.score)
        val theLives = findViewById<TextView>(R.id.lives)

        guess1.setBackgroundColor(Color.parseColor("#6200EE"))
        guess2.setBackgroundColor(Color.parseColor("#6200EE"))
        guess3.setBackgroundColor(Color.parseColor("#6200EE"))
        guess4.setBackgroundColor(Color.parseColor("#6200EE"))

        val scoreString = "Score: $score"
        theScore.text = scoreString
        val livesString = "Lives: $lives"
        theLives.text = livesString

        possible.removeLast()
        if (possible.size < 4){
            possible.clear()
            possible.addAll(chosen)
            possible.shuffle()
        }
        setQuestion()
    }

    fun endGame(){
        val guess = findViewById<TextView>(R.id.mem_guess)
        val guess1 = findViewById<Button>(R.id.mem_guess1)
        val guess2 = findViewById<Button>(R.id.mem_guess2)
        val guess3 = findViewById<Button>(R.id.mem_guess3)
        val guess4 = findViewById<Button>(R.id.mem_guess4)
        val theScore = findViewById<TextView>(R.id.score)
        val theLives = findViewById<TextView>(R.id.lives)
        val finalScore = findViewById<TextView>(R.id.textView5)
        val back = findViewById<TextView>(R.id.button4)

        guess.visibility = View.INVISIBLE
        guess1.visibility = View.INVISIBLE
        guess2.visibility = View.INVISIBLE
        guess3.visibility = View.INVISIBLE
        guess4.visibility = View.INVISIBLE
        theScore.visibility = View.INVISIBLE
        theLives.visibility = View.INVISIBLE

        finalScore.visibility = View.VISIBLE
        back.visibility = View.VISIBLE

        finalScore.text = "Score: $score"

    }

    fun backToMain(view: View){
        val choice = intent.getStringExtra("choice").toString()

        val currentJapanese: Japanese = Japanese(score, choice, "M")
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