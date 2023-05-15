package com.user.testuserapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    JsonPlaceHolderApi jsonPlaceHolderApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.tv_result);

        Retrofit retrofit = new Retrofit.Builder()
                //.baseUrl("https://jsonplaceholder.typicode.com/") //User base url
                .baseUrl("https://sampoorn.poorakhindia.com/") //LoginUserApi base url
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        jsonPlaceHolderApi = retrofit.create(JsonPlaceHolderApi.class);

        //user();
        loginUserApi();

    }
    
    /*
        private void user() {

            User user = new User(1,"abcd","rgrgrtg");
            Call<User> call = jsonPlaceHolderApi.fakePostApiTest(user);
            call.enqueue(new Callback<User>() {
                @Override
                public void onResponse(Call<User> call, Response<User> response) {
                    if (!response.isSuccessful()) {

                        textView.setText("" + response);
                        return;
                    }

                    User userResponse = response.body();

                    String content = "";
                    content += "Response Code" + response.code() + "\n";
                    content += "User Id: " + userResponse.getUserId() + "\n";
                    content += "Id: " + userResponse.getId() + "\n";
                    content += "Title: " + userResponse.getTitle() + "\n";
                    content += "Text: " + userResponse.getText() + "\n\n\n";

                    textView.setText(content);
                }

                @Override
                public void onFailure(Call<User> call, Throwable t) {
                    textView.setText(t.getMessage());
                }
            });
        } */

    private void loginUserApi() {
        LoginUserApi loginUserApi = new LoginUserApi("abcd","abc@gmail.com","mmaskdm@34",1234567890,"unkown");
        Call<LoginUserApi> call = jsonPlaceHolderApi.loginUserApi(loginUserApi);

        call.enqueue(new Callback<LoginUserApi>() {
            @Override
            public void onResponse(Call<LoginUserApi> call, Response<LoginUserApi> response) {
                if (!response.isSuccessful()) {

                    textView.setText("" + response);
                    return;
                }

                LoginUserApi userResponse = response.body();

                String content = "";
                content += "Response Code" + response.code() + "\n";
                content += "Id: " + userResponse.getId() + "\n";
                content += "User_name: " + userResponse.getUser_name() + "\n";
                content += "User_email: " + userResponse.getUser_email() + "\n";
                content += "Password: " + userResponse.getPassword() + "\n";
                content += "User_phone: " + userResponse.getUser_phone() + "\n";
                content += "User_type: " + userResponse.getUser_type() + "\n";
                content += "User_Role_Id: " + userResponse.getRole_id() + "\n";
                content += "Status: " + userResponse.getStatus() + "\n";
                content += "Create_By: " + userResponse.getCreate_by() + "\n";

                textView.setText(content);
            }

            @Override
            public void onFailure(Call<LoginUserApi> call, Throwable t) {
                textView.setText(t.getMessage());
            }
        });

    }

}