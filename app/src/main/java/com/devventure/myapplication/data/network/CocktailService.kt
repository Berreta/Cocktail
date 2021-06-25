package com.devventure.myapplication.data.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private const val BASE_URL="https://www.thecocktaildb.com/api/json/v1/1/"
private val retrofit = Retrofit.Builder()
                               .baseUrl(BASE_URL)
                               .addConverterFactory(GsonConverterFactory.create())
                               .build()

object CocktailService {
    val service: TheCocktailAPI by lazy {
        retrofit.create(TheCocktailAPI::class.java)
    }
}