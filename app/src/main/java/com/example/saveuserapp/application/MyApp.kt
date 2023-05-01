package com.example.saveuserapp.application

import android.app.Application
import com.example.saveuserapp.component.AppComponent
import com.example.saveuserapp.component.DaggerAppComponent
import com.example.saveuserapp.retrofit.RetrofitClient

class MyApp : Application() {

    lateinit var myAppCom : AppComponent
    override fun onCreate() {
        super.onCreate()

         myAppCom = DaggerAppComponent.factory().create(this)

    }

    fun getRetroCom() : AppComponent{
        return myAppCom
    }
}