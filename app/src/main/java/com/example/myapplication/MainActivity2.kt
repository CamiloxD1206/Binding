package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.myapplication.data.SharedPreferencesManager
import com.example.myapplication.databinding.ActivityMain2Binding
import com.example.myapplication.databinding.ActivityMainBinding

class  ActivityMain2: AppCompatActivity() {
    private lateinit var binding:ActivityMain2Binding
    private lateinit var sharedPref:SharedPreferencesManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMain2Binding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
        sharedPref= SharedPreferencesManager(this)









     val clave=intent.getStringExtra("user")
        val texto=binding.texto
        texto.text=clave



    }
}