package com.user.testuserapi;

import com.google.gson.annotations.SerializedName;

import retrofit2.http.Body;

public class User {

    private int userId;
    private Integer id;
    private String title;
    @SerializedName("body")
    private String text;

    public User(int userId, String title, String text) {
        this.userId = userId;
        this.title = title;
        this.text = text;
    }

    public int getUserId() {
        return userId;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}
