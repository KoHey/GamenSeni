package com.example.ksugawara.gamenseni

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private val editText: EditText by lazy {
        findViewById(R.id.editText) as EditText
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //editText = findViewById(R.id.editText) as EditText
        val button = findViewById(R.id.button) as Button
        button.setOnClickListener{onClick()}
    }
    fun onClick() {
//        val text = editText.text?.toString()
//        val intent = Intent(this, SubActivity::class.java)
//        intent.putExtra("extra_text", text)
//        startActivity(intent)
        val intent = Intent(applicationContext, SubActivity::class.java)
        intent.putExtra("DATA", editText.text.toString())
        startActivity(intent)
    }
}
