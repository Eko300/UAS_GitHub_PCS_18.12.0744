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
    @Headers("Authorization: token  9fd0f0e8b0c9804792ed6004694817d2aaff0574")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token  9fd0f0e8b0c9804792ed6004694817d2aaff0574")
    fun getUserDetail(
        @Path("username") username : String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token  9fd0f0e8b0c9804792ed6004694817d2aaff0574")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token  9fd0f0e8b0c9804792ed6004694817d2aaff0574")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}