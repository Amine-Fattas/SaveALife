package com.impression.savealife.services

import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface AuthenticationService {
    @POST("authenticate")
    fun authenticate(@Body authenticationRequest: AuthenticationRequest): Call<JsonObject>

//    same as base url
    @GET(".")
    fun welcome(): Call<String>
}


class AuthenticationRequest(var username: String?, var password: String?){}
