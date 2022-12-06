package com.example.segundaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay

class LaunchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch)

        lifecycleScope.launchWhenStarted {
            delay(300)
            startActivity(Intent(this@LaunchActivity,MainActivity::class.java))
            finish()
        }
    }
}