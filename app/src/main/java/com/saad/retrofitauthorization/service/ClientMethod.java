package com.saad.retrofitauthorization.service;

import com.saad.retrofitauthorization.module.Login;
import com.saad.retrofitauthorization.module.MainObjectClass;
import com.saad.retrofitauthorization.module.Token;
import com.saad.retrofitauthorization.resopnse.MainResponseObjectClass;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ClientMethod {

    @POST("api/login/")
     Call<Token>login(@Body Login login);

//    @POST("/api/v0/recruiting-entities/")
//    Call<MainResponseObjectClass> getValue(@Header("Authorization") String AutToken, @Body MainObjectClass mainObjectClass);
    @POST("/api/v0/recruiting-entities/")
    Call<MainResponseObjectClass> getValue(@Body MainObjectClass mainObjectClass);


}
