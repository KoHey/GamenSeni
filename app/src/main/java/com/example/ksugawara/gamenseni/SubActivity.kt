package com.example.ksugawara.gamenseni

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

import org.w3c.dom.Text

class SubActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        val intent = intent
        val data = intent.getStringExtra("DATA")

        val text = findViewById(R.id.textView2) as TextView
        text.text = data
    }
}
