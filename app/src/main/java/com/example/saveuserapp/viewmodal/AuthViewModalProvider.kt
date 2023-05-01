package com.example.saveuserapp.viewmodal

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.saveuserapp.repo.AuthRepository
import javax.inject.Inject

@Suppress("UNCHECKED_CAST")
class AuthViewModalProvider @Inject constructor(private val repository: AuthRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return AuthViewModel(repository) as T
    }
}