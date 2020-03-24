package com.example.annmovies.domain.usecase.movie

import com.example.annmovies.domain.repository.movie.MovieRepository

/**
 * Created by anahi.salgado on 15/03/2020
 */
class GetMovieImpl(private val movieRepository: MovieRepository): GetMovie {
    override fun getPopularMovies() = movieRepository.getPopularMovies()

    override fun getTopRatedMovies() = movieRepository.getTopRatedMovies()

    override fun getUpcomingMovies() = movieRepository.getUpcomingMovies()
}
