package com.example.jackson_layouts

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class terceiratela : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.terceiratela)
    }

    fun proximoquartatela(view : View){
        startActivity(Intent(this,quartatela::class.java ).apply {})
    }

    fun voltar2(view : View){
        finish()
    }
}