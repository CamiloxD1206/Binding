package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.myapplication.data.SharedPreferencesManager
import com.example.myapplication.databinding.ActivityMainBinding

class ActivityMain : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private lateinit var sharedPref:SharedPreferencesManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
        sharedPref=SharedPreferencesManager(this)


     initUi()


        }

    private fun initUi(){
        botonEnviar()
    }

    private fun botonEnviar(){
        binding.Enviar.setOnClickListener{

            val usuario=binding.nombre.text.toString()
            val  intent=Intent(this,ActivityMain2::class.java)
            intent.putExtra("user",usuario)
            sharedPref.savedUser(usuario)
            startActivity(intent)
        }
    }


}



