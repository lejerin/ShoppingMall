package com.example.parayo.intro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.setContentView

class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val ui = IntroActivityUI()
        ui.setContentView(this)
    }
}