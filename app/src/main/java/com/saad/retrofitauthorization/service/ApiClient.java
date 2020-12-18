package com.saad.retrofitauthorization.service;

import android.util.Log;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class ApiClient {

    public static String token = "";

    public ApiClient() {

    }

    static OkHttpClient client = new OkHttpClient.Builder().addInterceptor(chain -> {
        Request newRequest  = chain.request().newBuilder()
                .addHeader("Authorization", "Bearer " + token)
                .build();
        Log.d("Authorization", "Bearer " + token);
        return chain.proceed(newRequest);
    }).build();

    public static final String BASE_URL = "https://recruitment.fisdev.com";
    private static Retrofit retrofit = null;


    public static Retrofit getClient(){
        if (retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit;
    }

}
