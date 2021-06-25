package com.devventure.myapplication.data

import com.google.gson.annotations.SerializedName

data class DrinkListRemoteEntity(
    @SerializedName("drinks")
    val drinksList: List<DrinkRemoteEntity>
)