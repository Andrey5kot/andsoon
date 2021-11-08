package com.kot.andsoon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        val sign_up_textbutton: Button =findViewById(R.id.sign_up_textbutton)
        sign_up_textbutton.setOnClickListener{
            setContentView(R.layout.activity_sign_up)
        }

    }
}