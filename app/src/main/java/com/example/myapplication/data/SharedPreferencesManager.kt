package com.example.myapplication.data

import android.content.Context
import android.content.SharedPreferences


class SharedPreferencesManager(private var context:Context) {
private  val dataBase="ME-DATA-BASE"
    private val sharedPreferences: SharedPreferences by lazy {
        context.getSharedPreferences(dataBase,Context.MODE_PRIVATE)
    }




    fun savedUser(user:String){
        val editar=sharedPreferences.edit()
        editar.putString("keyUserPrey",user)
        editar.apply()

    }

fun getUser():String{
    return sharepreferences.getStrinng("keyUser","Empty").toString
}
}