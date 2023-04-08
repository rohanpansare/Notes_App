package com.rohan.notes_app.util

import androidx.room.TypeConverter
import java.util.*

class DateConverter {

        @TypeConverter
        fun fromTimestamp(value: Long?): Calendar? {
            return value?.let {
                val calendar = Calendar.getInstance()
                calendar.timeInMillis = it
                calendar
            }
        }

        @TypeConverter
        fun toTimestamp(calendar: Calendar?): Long? {
            return calendar?.timeInMillis
        }

}