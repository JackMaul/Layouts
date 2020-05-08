package com.example.jackson_layouts

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class segundatela : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.segundatela)
    }

    fun proximoterceiratela(view : View){
        startActivity(Intent(this,terceiratela::class.java ).apply {})
    }

    fun voltar1(view : View){
        finish()
    }
}