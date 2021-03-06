package com.etc.entity;

public class User {
    private int userId;
    private String userName;
    private String userPass;
    private String userTel;
    private String userRealName;

    public User() {
    }

    public User(String userName, String userPass, String userTel, String userRealName) {
        this.userName = userName;
        this.userPass = userPass;
        this.userTel = userTel;
        this.userRealName = userRealName;
    }

    public User(int userId, String userName, String userPass, String userTel, String userRealName) {
        this.userId = userId;
        this.userName = userName;
        this.userPass = userPass;
        this.userTel = userTel;
        this.userRealName = userRealName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPass='" + userPass + '\'' +
                ", userTel='" + userTel + '\'' +
                ", userRealName='" + userRealName + '\'' +
                '}';
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getUserRealName() {
        return userRealName;
    }

    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName;
    }
}
