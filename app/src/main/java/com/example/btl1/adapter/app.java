package com.example.btl1.adapter;

import android.graphics.drawable.Drawable;

public class app {
    private String appName;
    private int appImg;
    private String appDes;
    private String appPrice;
    private int bgImg;

    public app(String appName, int appImg, String appDes, String appPrice, int bgImg) {
        this.appName = appName;
        this.appImg = appImg;
        this.appDes = appDes;
        this.appPrice = appPrice;
        this.bgImg = bgImg;
    }

    public int getBgImg() {
        return bgImg;
    }

    public void setBgImg(int bgImg) {
        this.bgImg = bgImg;
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