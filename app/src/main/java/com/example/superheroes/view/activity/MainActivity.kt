package com.example.superheroes.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.superheroes.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_container)
    }
}