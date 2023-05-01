package com.example.saveuserapp.repo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.saveuserapp.localdatabase.db.UserDatabase
import com.example.saveuserapp.localdatabase.modal.UserDetails
import com.example.saveuserapp.modal.LoginResponse
import com.example.saveuserapp.networkcall.NetworkClass
import com.example.saveuserapp.retrofit.ApiService
import org.json.JSONObject
import javax.inject.Inject

class AuthRepository @Inject constructor(
    private var apiService: ApiService,
    private var db : UserDatabase
) {
    
    private val _isAuthComplete = MutableLiveData<NetworkClass<LoginResponse>>()

     val isAuthComplete : LiveData<NetworkClass<LoginResponse>>
    get() = _isAuthComplete

    suspend fun addUser(userDetails: UserDetails){
        db.getUserDao().addUser(userDetails)
    }

    suspend fun isAuthDone(user_type : String,username : String,password : String){
        _isAuthComplete.postValue(NetworkClass.IsLoading())
        val response =apiService.getLogin(user_type, username, password)
        if (response.isSuccessful && response.body() != null){
            _isAuthComplete.postValue(NetworkClass.OnSuccess(response.body()))
        }else if (response.code() == 0 ){
            val errorObject = JSONObject(response.errorBody()!!.charStream().readText())
            _isAuthComplete.postValue(NetworkClass.OnFailure(errorObject.getString("message")))
        }
    }

}