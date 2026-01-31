package com.freedom.habits.data

import android.content.Context
import androidx.room.Room

object DbProvider {
    @Volatile private var instance: AppDatabase? = null

    fun get(context: Context): AppDatabase {
        return instance ?: synchronized(this) {
            instance ?: Room.databaseBuilder(
                context.applicationContext,
                AppDatabase::class.java,
                "habits.db"
            ).build().also { instance = it }
        }
    }
}
