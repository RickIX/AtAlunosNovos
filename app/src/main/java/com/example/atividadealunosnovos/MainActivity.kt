package com.example.atividadealunosnovos

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun showToast(view: View?) {
        Toast.makeText(this, "Botão clicado!", Toast.LENGTH_SHORT).show()
    }

    fun openSecondActivity(view: View?) {
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }

}