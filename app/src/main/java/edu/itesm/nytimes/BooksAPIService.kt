package edu.itesm.nytimes

import retrofit2.Response
import retrofit2.http.GET


interface APIService {
    @GET("hardcover-fiction.json?api-key=E8MIDB9NM3B8VEdXSlsKEKRsdAdraODV")
    suspend fun getBooks() : Response<Results>
}