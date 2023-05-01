package com.example.saveuserapp.networkcall

sealed class NetworkClass<T>(val data : T? = null,val message : String? = null) {
    class OnSuccess<T>(data: T?) : NetworkClass<T>(data)
    class OnFailure<T>(message: String?,data: T? = null) : NetworkClass<T>(data, message)
    class IsLoading<T>() : NetworkClass<T>()
}