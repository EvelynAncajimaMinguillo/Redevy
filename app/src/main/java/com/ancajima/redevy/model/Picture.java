package com.ancajima.redevy.model;

/**
 * Created by USUARIO on 13/06/2017.
 */

public class Picture {

    private String picture;
    private String userName;
    private String time;
    private String like_number = "0" ;

    public Picture(String picture, String userName, String time, String like_number) {
        this.picture = picture;
        this.userName = userName;
        this.time = time;
        this.like_number = like_number;
    }

    public String getPicture() {
        return picture;
    }

    public String getUserName() {
        return userName;
    }

    public String getTime() {
        return time;
    }

    public String getLike_number() {
        return like_number;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setLike_number(String like_number) {
        this.like_number = like_number;
    }
}
