package com.example.annmovies.domain.usecase.movie

import com.example.annmovies.domain.model.Movie
import io.reactivex.rxjava3.core.Single

/**
 * Created by anahi.salgado on 15/03/2020
 */
class GetMovieImpl: GetMovie {
    override fun getPopularMovies(): Single<List<Movie>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getTopRatedMovies(): Single<List<Movie>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getUpcomingMovies(): Single<List<Movie>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}