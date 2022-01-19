package com.survivalcoding.network_apps.feature_basic.data.datasource.remote

import com.survivalcoding.network_apps.feature_basic.data.datasource.remote.TodoURL.TODO_URL
import com.survivalcoding.network_apps.feature_basic.domain.model.TodoItem
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface TodoService {
    @GET("${TODO_URL}/{id}")
    suspend fun getTodo(@Path("id") id: Int): Response<TodoItem>
}