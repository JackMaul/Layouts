package com.example.jackson_layouts

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

@SuppressLint("Registered")
class quintatela : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.quintatela)
    }

    fun proximosextatela(view: View) {
        startActivity(Intent(this, sextatela::class.java).apply {})
    }

    fun voltar4(view: View) {
        finish()
    }
    }