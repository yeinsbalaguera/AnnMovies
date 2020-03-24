package com.example.annmovies.domain.repository.movie

import com.example.annmovies.domain.model.Movie
import io.reactivex.rxjava3.core.Single

/**
 * Created by anahi.salgado on 23/03/2020
 */
interface MovieRepository {
    fun getPopularMovies(): Single<List<Movie>>
    fun getTopRatedMovies(): Single<List<Movie>>
    fun getUpcomingMovies(): Single<List<Movie>>
}