package com.user.testuserapi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    JsonPlaceHolderApi jsonPlaceHolderApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.tv_result);

        Retrofit retrofit = new Retrofit.Builder()

                .baseUrl("https://sampoorn.poorakhindia.com/api/") //LoginUserApi base url
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        jsonPlaceHolderApi = retrofit.create(JsonPlaceHolderApi.class);

        //user();
        loginUserApi();

    }

    private void loginUserApi() {
        Call<LoginUserApi> call = jsonPlaceHolderApi.loginUserApi("dealer@gmail.com", "123456");

        call.enqueue(new Callback<LoginUserApi>() {
            @Override
            public void onResponse(Call<LoginUserApi> call,Response<LoginUserApi> response) {
                if (!response.isSuccessful()) {

                    textView.setText("" + response);
                    return;
                }

                LoginUserApi userResponse = response.body();

                String content = "";
                content += "Response Code:  " + response.code() + "\n" +
                        "-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -\n";
                assert userResponse != null;
                content += "Password: " + userResponse.getResult() + "\n" +
                        "-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -\n";
                content += "Login Status:  " + userResponse.getMessage() + "\n" +
                        "-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -\n";
                content += "Token:  " + userResponse.getToken() + "\n" +
                        "-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -\n";
//                content += "User_Name:  " +userResponse.getUserName()+ "\n";
//                content += "User_type: " + userResponse.getUser_type() + "\n";
//                content += "User_Role_Id: " + userResponse.getRole_id() + "\n";
//                content += "Status: " + userResponse.getStatus() + "\n";
//                content += "Create_By: " + userResponse.getCreate_by() + "\n";

                textView.setText(content);
            }

            @Override
            public void onFailure(Call<LoginUserApi> call, Throwable t) {
                textView.setText(t.getMessage());
            }
        });

    }

}