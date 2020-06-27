package com.lea.proj.model;

public class Users {
    private Long id;

    private String userName;

    private String password;

    public Users(Long id, String userName, String password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
    }

    public Users() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}