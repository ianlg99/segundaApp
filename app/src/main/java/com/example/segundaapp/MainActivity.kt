package com.example.segundaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import androidx.lifecycle.lifecycleScope
import com.example.segundaapp.databinding.ActivityMainBinding
import kotlinx.coroutines.delay

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        lifecycleScope.launchWhenStarted {
            binding.animacionProgreso.isVisible = true
            delay(3000)
            binding.animacionProgreso.isVisible= false
            binding.tv1.text = "Bienvenido"
        }

        lifecycleScope.launchWhenStarted {
            binding.animacionProgreso.isVisible=true
            delay(3000)
            binding.animacionProgreso.isVisible=false
            binding.tv1.text ="Welcome"
            delay(3000)
            startActivity(Intent(this@MainActivity,SegundaActivity::class.java)
            )
        }
    }
}