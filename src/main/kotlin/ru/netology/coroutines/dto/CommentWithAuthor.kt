package ru.netology.coroutines.dto

data class CommentWithAuthor (
    val id: Long,
    val comment: Comment,
    val author: Author
)