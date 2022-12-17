package com.example.newsapplication.models

import org.junit.Assert.*
import org.junit.Test

internal class NewsResponseTest {
    val src1 = Source("id1", "name2")
    val src2 = Source("id2", "name2")

    val article1 = Article(
        1,
        "author",
        "content",
        "description",
        "published",
        src1,
        "title",
        "url",
        "urlToImage"
    )
    val article2 = Article(
        2,
        "author",
        "content",
        "description",
        "published",
        src2,
        "title",
        "url",
        "urlToImage"
    )

    val mList: MutableList<Article> = mutableListOf(article1, article2)
    val newsResponse = NewsResponse(mList, "status", 1)

    @Test
    fun checkNewsResponse(){
        assertEquals("status", newsResponse.status)
        assertEquals(1, newsResponse.totalResults)
    }

    @Test
    fun checkArticleLists() {
        assertEquals(2, newsResponse.articles.size)
    }
    @Test
    fun checkArticle() {
        assertEquals(2, newsResponse.articles[1].id)
    }

}