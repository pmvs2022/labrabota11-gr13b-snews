package com.example.newsapplication.models

import org.junit.Assert.*
import org.junit.Test

internal class ArticleTest {
    val src = Source("id", "name")
    val article = Article(
        1,
        "author",
        "content",
        "description",
        "published",
        src,
        "title",
        "url",
        "urlToImage"
    )
    @Test
    fun checkData(){
        assertEquals(1, article.id)
        assertEquals("author", article.author)
        assertEquals("content", article.content)
        assertEquals("description", article.description)
        assertEquals("published", article.publishedAt)
        assertEquals("name", article.source?.name)
        assertEquals("title", article.title)
        assertEquals("url", article.url)
        assertEquals("urlToImage", article.urlToImage)
    }
}