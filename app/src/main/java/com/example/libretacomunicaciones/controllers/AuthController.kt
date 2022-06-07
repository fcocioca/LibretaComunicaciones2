package com.example.libretacomunicaciones.controllers

import android.content.Context
import android.content.Intent
import android.widget.Toast
import com.example.libretacomunicaciones.LoginActivity
import com.example.libretacomunicaciones.activity_indx


class AuthController constructor(ctx: Context) {
    private val ctx = ctx

    fun login(email: String, password: String) {
        if (email == "ferfraxel@mandalorianos.cl" && password == "AFf+123456") {
            Toast.makeText(this.ctx, "Bienvenido", Toast.LENGTH_LONG).show()
            val intent = Intent(this.ctx, activity_indx::class.java)
            this.ctx.startActivity(intent)
        } else {
            Toast.makeText(this.ctx, "Usuario no existe. Intente nuevamente", Toast.LENGTH_LONG).show()
            val intent = Intent(this.ctx, LoginActivity::class.java)
            this.ctx.startActivity(intent)
        }
    }
}
