package com.example.libretacomunicaciones

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.libretacomunicaciones.controllers.AuthController
import com.example.libretacomunicaciones.utils.TilValidator
import com.google.android.material.textfield.TextInputLayout

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)


        val btnHome = findViewById<Button>(R.id.activity_register_btn_home)
        val tilLogin = findViewById<TextView>(R.id.activity_register_til_login)
        val btnRegistrar = findViewById<Button>(R.id.activity_register_btn_register)
        val tilNombre = findViewById<TextInputLayout>(R.id.activity_register_til_nombre)
        val tilApellido = findViewById<TextInputLayout>(R.id.activity_register_til_ap_alumno)
        val tilCurso = findViewById<TextInputLayout>(R.id.activity_register_til_curso)
        val tilEmail = findViewById<TextInputLayout>(R.id.activity_register_til_email)
        val tilPassword = findViewById<TextInputLayout>(R.id.activity_register_til_password)
        val tilRepeatPassword = findViewById<TextInputLayout>(R.id.activity_register_til_repeat_password)
        btnHome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(intent)

        }

        tilLogin.setOnClickListener {
            val intent = Intent(this,LoginActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(intent)
        }

        btnRegistrar.setOnClickListener {


            val nombreValid = TilValidator(tilNombre)
                .required()
                .name()
                .isValid()
            val ApValid = TilValidator(tilApellido)
                .required()
                .name()
                .isValid()
            val cursoValid = TilValidator(tilCurso)
                .required()
                .curso()
                .isValid()
            val emailValid = TilValidator(tilEmail)
                .required()
                .email()
                .isValid()
            val passwordValid = TilValidator(tilPassword)
                .required().validatePassword()
            val rPassValid = TilValidator(tilRepeatPassword).required().rPass()

            if (nombreValid&&ApValid&&cursoValid&&emailValid&&passwordValid&&rPassValid) {

                val intent = Intent(this, activity_indx::class.java)

                startActivity(intent)
            } else {
                Toast.makeText(this, "Campos inválidos", Toast.LENGTH_SHORT).show()



            }
        }


    }


}