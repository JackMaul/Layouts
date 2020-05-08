package com.example.jackson_layouts

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class sextatela : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sextatela)
    }


    fun voltar5(view : View){
        finish()
    }
}
