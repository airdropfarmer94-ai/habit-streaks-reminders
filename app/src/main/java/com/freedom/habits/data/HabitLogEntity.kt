package com.freedom.habits.data

import androidx.room.Entity
import androidx.room.Index

@Entity(
    tableName = "habit_logs",
    primaryKeys = ["habitId", "epochDay"],
    indices = [Index(value = ["habitId"])],
)
data class HabitLogEntity(
    val habitId: Long,
    val epochDay: Long,
    val completed: Boolean,
)
