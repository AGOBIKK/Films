package com.agobikk.films.models

/***
 * Главная модель а в себе она уже содержит List<Result>, в адаптаре используем Result
 */

data class MoviesModel(
    val page: Int, // номер нашей странички
    val results: List<Result>, // листом лежит сам один фильм
    val total_pages: Int,
    val total_results: Int
)