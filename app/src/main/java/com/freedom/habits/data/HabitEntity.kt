package com.freedom.habits.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "habits")
data class HabitEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val name: String,
    val isActive: Boolean = true,
    val createdAtEpochDay: Long,
    val reminderHour: Int? = null,
    val reminderMinute: Int? = null,
)
