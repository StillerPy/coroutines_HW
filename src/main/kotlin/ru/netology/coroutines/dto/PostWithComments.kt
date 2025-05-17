package ru.netology.coroutines.dto

data class PostWithComments(
    val post: Post,
    val comments: List<Comment>,
) {
    fun print() {
        println("id: ${post.id}")
        println("author: ${post.author}")
        println("content: ${post.content}")
        for (comment in comments) {
            println("\tid: ${comment.id}")
            println("\tauthor: ${comment.author}")
            println("\tcontent: ${comment.content}")
        }
    }
}
