package com.example.newsapplication.models

import org.junit.Assert.*
import org.junit.Test

internal class SourceTest {
    val src = Source("id", "name")
    @Test
    fun checkSource(){
        assertEquals("idas", src.id)
        assertEquals("name", src.name)
    }
}