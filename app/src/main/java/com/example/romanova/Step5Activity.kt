package com.example.romanova

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Step5Activity : AppCompatActivity() {
    var score=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_step5)
        val intent = this.intent
        score = intent.getIntExtra("SCORE", 0)
    }

    fun Good(view: View) {

        val intent = Intent ( this,Step6Activity::class.java)
        intent.putExtra("SCORE", score)
        startActivity(intent)
    }
    fun Bad(view: View) {
        score++
        val intent = Intent ( this,Step6Activity::class.java)
        intent.putExtra("SCORE", score)
        startActivity(intent)
    }
}