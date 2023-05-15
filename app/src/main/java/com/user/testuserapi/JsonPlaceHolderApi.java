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

    @POST("/posts")
    Call<User> fakePostApiTest(@Body User user);

    @POST("/api/login?email=dealer@gmail.com&password=123456")
    Call<LoginUserApi> loginUserApi(@Body LoginUserApi loginUserApi);

}
