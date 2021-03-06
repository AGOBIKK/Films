package com.agobikk.films.models

/***
 * Главная модель а в себе она уже содержит List<Result>, в адаптаре используем Result
 */

//Приходит целая страница и в себе содержит лист фильмов List<MovieItemModel> в адаптер мы должны положить не лист а фильмы
data class MoviesModel(
    val page: Int, // номер нашей странички
    val results: List<MovieItemModel>, // листом лежит сам один фильм
    val total_pages: Int,
    val total_results: Int
)