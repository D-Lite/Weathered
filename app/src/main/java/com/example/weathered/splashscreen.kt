package com.example.weathered

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout


class splashscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        supportActionBar?.hide()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)


          val continuebtn = findViewById<Button>(R.id.continueBtn)
          continuebtn.layoutParams =  LinearLayout.LayoutParams(400, 150)

        continuebtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

}
