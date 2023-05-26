package com.example.ticketease.DataClasses.Person

import com.fasterxml.jackson.annotation.JsonProperty
import kotlinx.serialization.Serializable

@Serializable
data class BuyerRequest(
    @JsonProperty("login")
    val login: String="",
    @JsonProperty("password" )
    val password: String=""
    )
@Serializable
data class BuyerResponse(
    @JsonProperty("token")
    var token : String=""
    )

@Serializable
data class Buyer(
    @JsonProperty("id")
    var id: Long? = null,
    @JsonProperty("name")
    var name: String = "",
    @JsonProperty("surname")
    var surname: String = "",
    @JsonProperty("login")
    var login: String = "",
    @JsonProperty("password")
    var password: String = "",
    @JsonProperty("email")
    var email: String = "",
    @JsonProperty("mobile")
    var mobile: String = "",
    @JsonProperty("city")
    var city: Cities? = null
)

@Serializable
data class BuyerWithoutPswd(
    @JsonProperty("name")
    val name : String="",
    @JsonProperty("surname")
    val surname: String="",
    @JsonProperty("email")
    val email: String="",
    @JsonProperty("mobile")
    val mobile: String? = null,
    @JsonProperty("token")
    val token: String=""
    )

@Serializable
data class BuyerUpdateCity(
    @JsonProperty ("token")
    val token: String="",
    @JsonProperty("city")
    val city: Cities? =null
    )
//добавить еще сущностей для личного кабинета и тд. Для остальных можно не следить. Пароль 1 раз!!!!!!!!!!!!!!!!
//