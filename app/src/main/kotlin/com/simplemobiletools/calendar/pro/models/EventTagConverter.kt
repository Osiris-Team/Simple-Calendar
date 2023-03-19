package com.simplemobiletools.calendar.pro.models

import androidx.room.TypeConverter
import com.google.gson.GsonBuilder

class EventTagConverter {
    @TypeConverter
    fun fromDB(dbValue: String): EventTag {
        return GsonBuilder().create().fromJson(dbValue, EventTag::class.java)
    }

    @TypeConverter
    fun toDB(memValue: EventTag?): String {
        return GsonBuilder().create().toJson(memValue, EventTag::class.java)
    }
}
