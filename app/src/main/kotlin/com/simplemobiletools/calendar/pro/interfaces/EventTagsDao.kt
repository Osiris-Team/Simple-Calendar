package com.simplemobiletools.calendar.pro.interfaces

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.simplemobiletools.calendar.pro.helpers.*
import com.simplemobiletools.calendar.pro.models.Event
import com.simplemobiletools.calendar.pro.models.EventTag

@Dao
interface EventTagsDao {
    @Query("SELECT * FROM event_tags")
    fun getAll(): List<EventTag>

    @Query("SELECT * FROM event_tags WHERE id = :id")
    fun getById(id: Long): EventTag?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertOrUpdate(event: EventTag): Long

    @Query("DELETE FROM event_tags WHERE id IN (:ids)")
    fun delete(ids: List<Long>)
}
