package com.carlyle.aplicativo_banco

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.carlyle.aplicativo_banco.databinding.ActivityTransferenciaBinding

class Transferencia : AppCompatActivity() {
    private lateinit var binding: ActivityTransferenciaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTransferenciaBinding.inflate(layoutInflater)
        setContentView(binding.root
        )
        supportActionBar!!.hide()

        actionNavegationToolbar()

    }
    private fun actionNavegationToolbar (){
        val toolbar = binding.toolbarTransferencia

        toolbar.title = "Transferência"
        toolbar.setTitleTextColor(getColor(R.color.white))
        toolbar.setTitleMargin(200,0,0,0)
        toolbar.setBackgroundColor(getColor(R.color.light_blue))
        toolbar.setNavigationIcon(getDrawable(R.drawable.ic_voltar))
        toolbar.setNavigationOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }
    }
}