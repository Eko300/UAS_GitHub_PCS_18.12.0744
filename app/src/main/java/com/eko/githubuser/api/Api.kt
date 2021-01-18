package com.eko.githubuser.api


import com.eko.githubuser.data.model.DetailUserResponse
import com.eko.githubuser.data.model.User
import com.eko.githubuser.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token   04fb55d2ef964d4b61d112569a5c7b0972d9b7de")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token   04fb55d2ef964d4b61d112569a5c7b0972d9b7de")
    fun getUserDetail(
        @Path("username") username : String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token   04fb55d2ef964d4b61d112569a5c7b0972d9b7de")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token   04fb55d2ef964d4b61d112569a5c7b0972d9b7de")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}