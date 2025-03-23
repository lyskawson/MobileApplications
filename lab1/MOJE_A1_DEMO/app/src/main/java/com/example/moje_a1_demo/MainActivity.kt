package com.example.moje_a1_demo

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)


    }
    fun buttonYellowClicked(view: View) {

        val layout :View = findViewById(R.id.main)
        val currentColor = (layout.background as ColorDrawable).color
        if(currentColor != Color.YELLOW) {
            layout.setBackgroundColor(Color.YELLOW)
        }
        val textView = findViewById<TextView>(R.id.textViewColor)
        textView.text = "YELLOW"
        textView.setTextColor(Color.BLUE)
    }

    fun buttonBlueClicked(view: View) {

        val layout :View = findViewById(R.id.main)
        val currentColor = (layout.background as ColorDrawable).color
        if(currentColor != Color.BLUE) {
            layout.setBackgroundColor(Color.BLUE)
        }
        val textView = findViewById<TextView>(R.id.textViewColor)
        textView.text = "BLUE"
        textView.setTextColor(Color.GREEN)
    }

    fun buttonGreenClicked(view: View) {

        val layout :View = findViewById(R.id.main)
        val currentColor = (layout.background as ColorDrawable).color
        if(currentColor != Color.GREEN) {
            layout.setBackgroundColor(Color.GREEN)
        }
        val textView = findViewById<TextView>(R.id.textViewColor)
        textView.text = "GREEN"
        textView.setTextColor(Color.YELLOW)
    }





}







