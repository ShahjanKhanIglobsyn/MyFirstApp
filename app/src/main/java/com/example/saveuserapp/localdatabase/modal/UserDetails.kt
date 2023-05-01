package com.example.saveuserapp.localdatabase.modal

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "userDetails")
class UserDetails(
@ColumnInfo(name = "side")val userSide : String,
@ColumnInfo(name = "email") val userEmail : String,
@ColumnInfo(name = "password") val userPassword : String
){
@PrimaryKey(autoGenerate = true)
var id = 0
}