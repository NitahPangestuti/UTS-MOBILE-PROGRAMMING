package com.nitahpangestuti

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_calculator.setOnClickListener {
            val proIntent = Intent(this, CalcutorActivity::class.java)
            startActivity(proIntent)
        }
        btn_tentang.setOnClickListener {
            val proIntent = Intent(this, ProfilkuActivity::class.java)
            startActivity(proIntent)
        }
        btn_keluar.setOnClickListener {
            finish();

        }
    }
}