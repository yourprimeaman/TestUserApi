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

    @FormUrlEncoded
    @POST("login")
    Call<LoginUserApi> loginUserApi(@Field("email") String email,
                                    @Field("password") String password);

}
