package br.edu.bookstore.models

data class Stories(
    val available: String,
    val collectionURI: String,
    val items: List<ItemXXX>,
    val returned: String
)