package com.example.winwinapp.network

import com.example.winwinapp.data.dataclasses.LoginBody
import com.example.winwinapp.data.dataclasses.LoginResponse
import com.example.winwinapp.data.dataclasses.SignUpBody
import com.squareup.okhttp.logging.HttpLoggingInterceptor
import okhttp3.OkHttpClient
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*

interface ApiService {
    @Headers("Content-Type:application/json")

    @POST("user/login")
    fun login(@Body info: LoginBody): Call<ResponseBody>

    @POST("user/create")
    fun registerUser(@Body info: SignUpBody): Call<LoginResponse>

}

class RetrofitInstance {

//    companion object {
//        private const val BASE_URL: String = "http://localhost:8080/"
//
//        val interceptor: HttpLoggingInterceptor = HttpLoggingInterceptor().apply {
//            this.level = HttpLoggingInterceptor.Level.BODY
//        }
//
//        val client: OkHttpClient = OkHttpClient.Builder().apply {
//            this.addInterceptor(interceptor)
//        }.build()
//
//        fun getRetrofitInstance(): Retrofit {
//            return Retrofit.Builder()
//                .baseUrl(BASE_URL)
//                .client(client)
//                .addConverterFactory(GsonConverterFactory.create())
//                .build()
//        }
//    }
}