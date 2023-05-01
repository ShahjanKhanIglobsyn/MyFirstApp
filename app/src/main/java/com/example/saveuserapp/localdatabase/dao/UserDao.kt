package com.example.saveuserapp.localdatabase.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.saveuserapp.localdatabase.modal.UserDetails

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addUser(userDetails: UserDetails)

//    @Query("Select * from userDetails")
//    suspend fun getAllDetails() : LiveData<List<UserDetails>>
}