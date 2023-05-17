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

                LoginUserApi.User obj = userResponse.getUser();
                List<LoginUserApi.UserRole> userRole = userResponse.getUserRole();

                obj.getUserType();


                String content = "";

                for (LoginUserApi.UserRole uRole : userRole) {
                    content += "Role Name:  "+uRole.getRoleName() + "\n" +
                            "-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -\n";
                    content += "Menu Name:  "+uRole.getMenuName() + "\n" +
                            "-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -\n";
                    content += "App Icon:  "+uRole.getAppIcon() + "\n" +
                            "-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -\n";
                    content += "Mobile Action:  "+uRole.getMobileAction() + "\n" +
                            "-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -\n";
                    content += "Web Action:  "+uRole.getWebAction() + "\n" +
                            "-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -\n";
                    textView.append(content);
                }


                content += "Response Code:  " + response.code() + "\n" +
                        "-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -\n";
                assert userResponse != null;
                content += "Password: " + userResponse.getResult() + "\n" +
                        "-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -\n";
                content += "Login Status:  " + userResponse.getMessage() + "\n" +
                        "-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -\n";
                /*
                content += "Token:  " + userResponse.getToken() + "\n" +
                        "-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -\n";
                 */
                content += "User Name:  " +obj.getUserName()+ "\n" +
                        "-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -\n";
                content += "User Email:  " + obj.getUserEmail() + "\n" +
                        "-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -\n";
                content += "User Type:  " + obj.getUserType() + "\n" +
                        "-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -\n";
                content += "Mobile No:  " + obj.getUserPhone() + "\n" +
                        "-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -\n";
                content += "Created At:  " + obj.getCreatedAt() + "\n" +
                        "-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -\n";
                content += "Password:  " +obj.getPassword() + "\n" +
                        "-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -\n";
                textView.setText(content);

            }

            @Override
            public void onFailure(Call<LoginUserApi> call, Throwable t) {
                textView.setText(t.getMessage());
            }
        });

    }

}