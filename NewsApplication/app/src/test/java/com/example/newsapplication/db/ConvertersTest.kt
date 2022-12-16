package com.example.newsapplication.db
import org.junit.Test

import org.junit.Assert.*
import com.example.newsapplication.models.Source

internal class ConvertersTest {

    private val converter = Converters()

    @Test
    fun fromSource() {
        val src = converter.toSource("str")
        assertEquals("str", src.id)
        assertEquals("str", src.name)
    }

    @Test
    fun toSource() {
        val srcName = Source("id", "name")
        val srcId = Source("id", "name")
        assertEquals("nameasd", converter.fromSource(srcName))
        assertNotEquals("id", converter.fromSource(srcId))
    }
}