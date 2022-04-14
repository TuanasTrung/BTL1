package com.example.btl1.adapter;

import android.graphics.drawable.Drawable;

import java.io.Serializable;

public class app implements Serializable {
    private int appImg;
    private String appName;
    private String appDes;
    private String appPrice;

    public app(String appName, int appImg, String appDes, String appPrice) {
        this.appName = appName;
        this.appImg = appImg;
        this.appDes = appDes;
        this.appPrice = appPrice;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public int getAppImg() {
        return appImg;
    }

    public void setAppImg(int appImg) {
        this.appImg = appImg;
    }

    public String getAppDes() {
        return appDes;
    }

    public void setAppDes(String appDes) {
        this.appDes = appDes;
    }

    public String getAppPrice() {
        return appPrice;
    }

    public void setAppPrice(String appPrice) {
        this.appPrice = appPrice;
    }

}