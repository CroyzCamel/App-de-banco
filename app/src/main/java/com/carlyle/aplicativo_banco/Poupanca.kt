package com.carlyle.aplicativo_banco

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.carlyle.aplicativo_banco.databinding.ActivityPoupancaBinding

class Poupanca : AppCompatActivity() {
    private lateinit var binding: ActivityPoupancaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPoupancaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar!!.hide()
        actionNavegationToolbar()


    }
    private fun actionNavegationToolbar (){
        val toolbar = binding.toolbarPoupanca

        toolbar.title = "Poupança"
        toolbar.setTitleTextColor(getColor(R.color.white))
        toolbar.setTitleMargin(250,0,0,0)
        toolbar.navigationIcon = getDrawable(R.drawable.ic_voltar)
        toolbar.setNavigationOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }
    }
}