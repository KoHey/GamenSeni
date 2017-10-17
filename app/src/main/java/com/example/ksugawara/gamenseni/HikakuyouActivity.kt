package com.example.ksugawara.gamenseni

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class HikakuyouActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hikakuyou)

        val button = findViewById(R.id.buttonToast).setOnClickListener {
            //ボタンが押された時の処理
            Toast.makeText(this, "ボタンが押された", Toast.LENGTH_LONG).show();
        }
    }
}
