package com.example.annmovies.domain.usecase.movie

import com.example.annmovies.domain.model.Movie

/**
 * Created by anahi.salgado on 15/03/2020
 */
interface GetMovie {
    fun getMovies(callback: Callback)

    interface Callback {
        fun onError()
        fun onMoviesLoaded(movies: List<Movie>)
    }
}