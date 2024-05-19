package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_first)

        val btnStart = findViewById<AppCompatButton>(R.id.btnStart)

        val etName = findViewById<AppCompatEditText>(R.id.etText)

        //cuando se pulsa el boton se hace lo de ahi adentro
        btnStart.setOnClickListener{
            val name = etName.text.toString()

            if(name.isNotEmpty()){
                //contexto y que pantalla se lanza
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("EXTRA_NAME",name)
                startActivity(intent)

            }

        }


    }
}