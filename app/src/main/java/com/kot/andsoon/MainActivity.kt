package com.kot.andsoon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sign_in_button: Button =findViewById(R.id.sign_in_main_button)
        sign_in_button.setOnClickListener{
            setContentView(R.layout.activity_sign_in)
        }

    }
}