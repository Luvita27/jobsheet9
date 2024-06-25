package com.example.jobsheet9

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
  

            val btnMhs: Button = findViewById(R.id.btnMhs)
            val btnSwu: Button = findViewById(R.id.btnSwu)

            btnMhs.setOnClickListener {
                val intent = Intent(this, activity_mahasiswa::class.java)
                startActivity(intent)
            }
            btnSwu.setOnClickListener{
                val intent= android.content.Intent(this, swuActivity::class.java)
                startActivity(intent)
            }
        }
    }

class Intent(mainActivity: MainActivity, java: Class<activity_mahasiswa>) : android.content.Intent() {

}
