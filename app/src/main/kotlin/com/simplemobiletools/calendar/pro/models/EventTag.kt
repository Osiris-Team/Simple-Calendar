package com.simplemobiletools.calendar.pro.models

import androidx.room.*
import java.io.Serializable

@Entity(tableName = "event_tags", indices = [(Index(value = ["id"], unique = true))])
data class EventTag(
    @PrimaryKey(autoGenerate = true) var id: Long?,
    @ColumnInfo(name = "name") var name: String = "",
) : Serializable
