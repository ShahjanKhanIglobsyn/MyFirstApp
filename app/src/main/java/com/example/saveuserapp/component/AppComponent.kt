package com.example.saveuserapp.component

import android.content.Context
import com.example.saveuserapp.auth.AuthActivity
import com.example.saveuserapp.retrofit.RetrofitClient
import com.example.saveuserapp.viewmodal.AuthViewModel
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [RetrofitClient::class])
interface AppComponent {
    fun getInject(viewModel: AuthViewModel)

    fun inject(authActivity: AuthActivity)

    @Component.Factory
    interface Factor{
        fun create(@BindsInstance context: Context) : AppComponent
    }
}