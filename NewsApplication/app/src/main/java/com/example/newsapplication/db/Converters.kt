package com.example.newsapplication.db

import androidx.room.TypeConverter
import com.example.newsapplication.models.Source

// Class to convert custom types of our Database
class Converters {
    @TypeConverter
    fun fromSource(source: Source) : String {
        return source.name
    }

    @TypeConverter
    fun toSource(name: String) : Source {
        return Source(name, name)
    }
}