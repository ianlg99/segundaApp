package com.example.segundaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.segundaapp.databinding.ActivityMainBinding
import com.example.segundaapp.databinding.ActivityTerceraBinding

class TerceraActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTerceraBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding=ActivityTerceraBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_tercera)

        intent.extras?.let {
            binding.lastActivity.text = it.getString("last")
        }
    }
}