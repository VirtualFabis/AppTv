package com.devexperto.movietrailerstv.domain

enum class Category(val id: String) {
    POPULAR("popularity.desc"),
    NUEVO("release_date.desc"),
    MASVOTADAS("vote_average.desc"),
    RENOVADAS("revenue.desc")
}