package com.example.annmovies.domain.usecase.category

import com.example.annmovies.domain.model.Category
import io.reactivex.rxjava3.core.Single

/**
 * Created by anahi.salgado on 15/03/2020
 */
interface GetCategory {
    fun getCategories(): Single<List<Category>>
}