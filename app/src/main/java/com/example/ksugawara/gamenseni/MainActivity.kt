package com.example.ksugawara.gamenseni

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
//    private val editText: EditText by lazy {
//        findViewById(R.id.editText) as EditText
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.text = "aiueo"//kotlin-android-extensionsすごい

        button.setOnClickListener{ onClick() }
        button2.setOnClickListener{ onClickToInput() }
    }

    fun onClick() {
        val intent = Intent(applicationContext, SubActivity::class.java)
        intent.putExtra("DATA", editText.text.toString())
        startActivity(intent)
    }

    fun onClickToInput() {
        val intent = Intent(applicationContext, InputActivity::class.java)
        startActivity(intent)
    }

}
