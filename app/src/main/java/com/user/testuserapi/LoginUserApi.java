package com.user.testuserapi;

public class LoginUserApi {

    private Integer id;
    private String user_name;
    private String user_email;
    private String password;
    private int user_phone;
    private String user_type;
    private int role_id;
    private int status;
    private String create_by;

    public LoginUserApi(String user_name, String user_email, String password, int user_phone, String user_type) {
        this.user_name = user_name;
        this.user_email = user_email;
        this.password = password;
        this.user_phone = user_phone;
        this.user_type = user_type;
    }

    public Integer getId() {
        return id;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getUser_email() {
        return user_email;
    }

    public String getPassword() {
        return password;
    }

    public int getUser_phone() {
        return user_phone;
    }

    public String getUser_type() {
        return user_type;
    }

    public int getRole_id() {
        return role_id;
    }

    public int getStatus() {
        return status;
    }

    public String getCreate_by() {
        return create_by;
    }
}
