package com.example.jackson_layouts

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class quartatela : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.quartatela)
    }

    fun proximoquintatela(view: View) {
        startActivity(Intent(this, quintatela::class.java).apply {})
    }

    fun voltar3(view: View) {
        finish()
    }

    fun proximosextatela(view: View) {}
}