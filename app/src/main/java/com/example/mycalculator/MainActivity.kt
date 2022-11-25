package com.example.mycalculator

import android.icu.number.IntegerWidth
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var solution: TextView = findViewById<TextView>(R.id.solution_tv)

        var one: Button = findViewById<Button>(R.id.button_one)

        one.setOnClickListener {
            solution.text = null
        }

        var two: Button = findViewById<Button>(R.id.button_one)

        one.setOnClickListener {
            solution.text = null
        }



//        two.setOnClickListener { }
//        three.setOnClickListener { }
//        four.setOnClickListener { }
//        five.setOnClickListener { }
//        six.setOnClickListener { }
//        seven.setOnClickListener { }
//        eight.setOnClickListener { }
//        nine.setOnClickListener { }
//        zero.setOnClickListener { }
//
//        open_bracket.setOnClickListener { }
//        close_bracket.setOnClickListener { }
//        divide.setOnClickListener { }
//        multiply.setOnClickListener { }
//        substract.setOnClickListener { }
//        addition.setOnClickListener { }
//
//        c.setOnClickListener { }
//        ac.setOnClickListener { }
//        dot.setOnClickListener { }
//        equal.setOnClickListener { }
//
//    }
//    fun appendOnExpression(string: String, canClear:Boolean){
//        if (tvResult.text.isNotEmpty()){
//            tvExpression.text = ""
//        }
    }
}