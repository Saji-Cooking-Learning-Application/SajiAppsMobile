package com.dicoding.sajiapps.retrofit

import com.dicoding.sajiapps.response.LoginResponse
import com.dicoding.sajiapps.response.RegisterResponse
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface ApiService {
    @FormUrlEncoded
    @POST("login")
    suspend fun login(
        @Field("username") username: String,
        @Field("password") password: String
    ): LoginResponse

    @FormUrlEncoded
    @POST("register")
    suspend fun register(
        @Field("username") username: String,
        @Field("password") password: String,
        @Field("nama") nama: String,
        @Field("email") email: String,
        @Field("hp") hp: String,
    ): RegisterResponse
}