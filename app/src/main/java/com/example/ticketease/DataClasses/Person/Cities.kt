package com.example.ticketease.DataClasses.Person

import com.fasterxml.jackson.annotation.JsonProperty
import kotlinx.serialization.Serializable

enum class Cities (val city : String) {
    Воронеж("Воронеж"),
    Москва("Москва"),
    Санкт_Петербург("Санкт-Петербург")


}
@Serializable
data class City(
    @JsonProperty("city")
    val city: String
)