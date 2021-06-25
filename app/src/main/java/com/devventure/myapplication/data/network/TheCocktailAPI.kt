package com.devventure.myapplication.data.network

import com.devventure.myapplication.data.DrinkListRemoteEntity
import retrofit2.http.GET

interface TheCocktailAPI {
    @GET("filter.php?a=Alcoholic")
    suspend fun getDrinks(): DrinkListRemoteEntity
}