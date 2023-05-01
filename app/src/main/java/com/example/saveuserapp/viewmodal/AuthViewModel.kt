package com.example.saveuserapp.viewmodal

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.saveuserapp.application.MyApp
import com.example.saveuserapp.localdatabase.modal.UserDetails
import com.example.saveuserapp.modal.LoginResponse
import com.example.saveuserapp.networkcall.NetworkClass
import com.example.saveuserapp.repo.AuthRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

class AuthViewModel @Inject constructor(private val repository: AuthRepository) : ViewModel() {

    val isAthDone : LiveData<NetworkClass<LoginResponse>>
    get() =repository.isAuthComplete

    fun getLogin(user_type : String,username : String,password : String) = viewModelScope.launch(Dispatchers.IO) {
        repository.isAuthDone(user_type, username, password)
    }

    fun addUser(userDetails: UserDetails) = viewModelScope.launch(Dispatchers.IO) {
        repository.addUser(userDetails)
    }
}