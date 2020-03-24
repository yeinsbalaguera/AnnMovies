package com.example.annmovies.domain.repository.category

import com.example.annmovies.domain.model.Category
import io.reactivex.rxjava3.core.Single

/**
 * Created by anahi.salgado on 23/03/2020
 */
interface CategoryRepository {
    fun getCategories(): Single<List<Category>>
}