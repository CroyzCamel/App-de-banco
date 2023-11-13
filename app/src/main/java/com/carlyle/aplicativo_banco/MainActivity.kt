package com.carlyle.aplicativo_banco

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.carlyle.aplicativo_banco.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imgSaldo.setOnClickListener {
            startActivity(Intent(this@MainActivity, Saldo::class.java))
        }

        binding.imgFatura.setOnClickListener {
            startActivity(Intent(this@MainActivity, Faturas::class.java))
        }

        binding.imgTansferencia.setOnClickListener {
            startActivity(Intent(this@MainActivity, Transferencia::class.java))
        }

        binding.imgPoupanca.setOnClickListener {
            startActivity(Intent(this@MainActivity, Poupanca::class.java))
        }


    }
}