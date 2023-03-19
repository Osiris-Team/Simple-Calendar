package com.simplemobiletools.calendar.pro.models

import androidx.room.TypeConverter

class ListLongConverter {
    @TypeConverter
    fun fromDB(dbValue: String): MutableList<Long> {
        val list: MutableList<Long> = ArrayList()
        for (s in dbValue.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()) {
            list.add(s.toLong())
        }
        return list
    }

    @TypeConverter
    fun toDB(memValue: MutableList<Long?>): String {
        var value = ""
        for (num in memValue) value += "$num "
        return value
    }
}
