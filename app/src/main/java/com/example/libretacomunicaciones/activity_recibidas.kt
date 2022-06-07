package com.example.libretacomunicaciones

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class activity_recibidas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recibidas)

        val btnToNotif = findViewById<TextView>(R.id.activity_recibidas_tv_notif_1)

        btnToNotif.setOnClickListener {
            val intent = Intent ( this, Notification::class.java)

            startActivity(intent)


        }
    }
}