package com.example.saveuserapp.retrofit

import com.example.saveuserapp.consts.Consts
import com.example.saveuserapp.modal.LoginResponse
import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface ApiService {
    @FormUrlEncoded
    @POST(Consts.LOGIN)
    suspend fun getLogin(
        @Field("user_type") user_type : String,
        @Field("username") username : String,
        @Field("password") password : String
    ) : Response<LoginResponse>
}