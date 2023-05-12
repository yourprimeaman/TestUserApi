package com.user.testuserapi;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface JsonPlaceHolderApi {

//    @Headers({"email:dealer@gmail.com","password:123456"})
//    @POST("api/login")
//    Call<User>createUser(@Body User user);

//    @POST("api/login")
//    Call<User>createUser(
//            @Query("email") String email,
//            @Query("password") String String
//    );

    @Headers({"email:dealer@gmail.com","password:123456"})
    @POST("api/login")
    Call<User> createUser(
            @Field("user_name") String user_name,
            @Field("user_email") String user_email
    );


}
