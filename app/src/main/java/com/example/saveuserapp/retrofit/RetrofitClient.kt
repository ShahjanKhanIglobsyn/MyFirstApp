package com.example.saveuserapp.retrofit

import android.content.Context
import androidx.room.Room
import com.example.saveuserapp.consts.Consts.BASE_URL
import com.example.saveuserapp.localdatabase.db.UserDatabase
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class RetrofitClient {

    @Singleton
    @Provides
    fun getApiService(retrofit: Retrofit): ApiService {
        return retrofit.create(ApiService::class.java)
    }


    @Singleton
    @Provides
    fun provideDb(context: Context) : UserDatabase {
        return Room.databaseBuilder(context, UserDatabase::class.java,"user_database").build()
    }


    @Singleton
    @Provides
    fun getInstance(): Retrofit {
        return Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}