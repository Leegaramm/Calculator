package com.example.androidstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Calculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        var new = "0"
        var old = "0"

        val q1 : TextView = findViewById(R.id.q1)
        val q2 : TextView = findViewById(R.id.q2)
        val q3 : TextView = findViewById(R.id.q3)
        val q4 : TextView = findViewById(R.id.q4)
        val q5 : TextView = findViewById(R.id.q5)
        val q6 : TextView = findViewById(R.id.q6)
        val q7 : TextView = findViewById(R.id.q7)
        val q8 : TextView = findViewById(R.id.q8)
        val q9 : TextView = findViewById(R.id.q9)
        val q0 : TextView = findViewById(R.id.q0)
        val qCA : TextView = findViewById(R.id.qCA)
        val qPLUS : TextView = findViewById(R.id.qPLUS)
        val input : TextView = findViewById(R.id.inputbar)

        q1.setOnClickListener {
            new += "1"
            input.setText(new)
        }
        q2.setOnClickListener {
            new += "2"
            input.setText(new)
        }
        q3.setOnClickListener {
            new += "3"
            input.setText(new)
        }
        q4.setOnClickListener {
            new += "4"
            input.setText(new)
        }
        q5.setOnClickListener {
            new += "5"
            input.setText(new)
        }
        q6.setOnClickListener {
            new += "6"
            input.setText(new)
        }
        q7.setOnClickListener {
            new += "7"
            input.setText(new)
        }
        q8.setOnClickListener {
            new += "8"
            input.setText(new)
        }
        q9.setOnClickListener {
            new += "9"
            input.setText(new)
        }
        q0.setOnClickListener {
            new += "0"
            input.setText(new)
        }
        qPLUS.setOnClickListener {
            old = (old.toInt()+ new.toInt()).toString()
            new = "0"
            input.setText(old)
        }
        qCA.setOnClickListener {
            old = "0"
            new = "0"
            input.setText("0")
        }

    }










}