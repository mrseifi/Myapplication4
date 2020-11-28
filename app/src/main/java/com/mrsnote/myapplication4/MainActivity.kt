package com.mrsnote.myapplication4

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            textview.text = calculate().toString()
        }
    }

    fun calculate(): Any {
        val num1 = editText1.text.toString().toInt()
        val num2 = editText2.text.toString().toInt()
        val result = when (editText3.text.toString()) {
            "+" -> num1.plus(num2)
            "-" -> num1.minus(num2)
            "*" -> num1.times(num2)
            "/" -> num1.div(num2)
            else -> print("Oprand is not valid")
        }
        return result
    }
}

