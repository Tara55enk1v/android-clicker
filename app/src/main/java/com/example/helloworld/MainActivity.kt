package com.example.helloworld

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val redButton = findViewById<TextView>(R.id.redBtn)
        val greenButton = findViewById<TextView>(R.id.greenBtn)
        val blueButton = findViewById<TextView>(R.id.blueBtn)
        val btnClicked = findViewById<TextView>(R.id.textView)

        redButton.setTextColor(Color.RED)
        greenButton.setTextColor(Color.GREEN)
        blueButton.setTextColor(Color.BLUE)

        redButton.setOnClickListener{
            btnClicked.text = "Red was clicked"
        }
        greenButton.setOnClickListener{
            btnClicked.text = "Green was clicked"
        }
        blueButton.setOnClickListener{
            btnClicked.text = "Blue was clicked"
        }
    }
}