package com.example.saveuserapp.localdatabase.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.saveuserapp.localdatabase.dao.UserDao
import com.example.saveuserapp.localdatabase.modal.UserDetails

@Database(
    entities = [UserDetails::class],
    version = 1
)
abstract class UserDatabase : RoomDatabase() {

    abstract fun getUserDao(): UserDao

//    companion object {
//        @Volatile
//        private var instance: UserDatabase? = null
//        fun getDatabase(context: Context): UserDatabase {
//            return instance ?: synchronized(this) {
//                val newInstance = Room.databaseBuilder(
//                    context.applicationContext,
//                    UserDatabase::class.java,
//                    "user_database"
//                )
//                    .build()
//                instance = newInstance
//                newInstance
//            }
//
//        }
//    }
}