package com.example.newsapplication.models

import com.example.newsapplication.models.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)