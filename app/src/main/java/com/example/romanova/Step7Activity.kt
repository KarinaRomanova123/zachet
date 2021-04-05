package com.example.romanova

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Step7Activity : AppCompatActivity() {
    var score=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_step7)
        val intent=this.intent
        score=intent.getIntExtra("SCORE",0)
        val tView=findViewById<TextView>(R.id.textView)
        tView.text="Pезультат:"+score.toString()
    }
}