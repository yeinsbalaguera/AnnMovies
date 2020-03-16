package com.example.annmovies.domain.usecase.category

import com.example.annmovies.domain.model.Category

/**
 * Created by anahi.salgado on 15/03/2020
 */
interface GetCategory {
    fun getCategories(callback: Callback)

    interface Callback {
        fun onError()
        fun onMoviesLoaded(movies: List<Category>)
    }
}