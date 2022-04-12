package com.example.btl1;

public class app {
    private String appName;
    private String appImg;
    private String appDes;

    public app(String appName, String appImg, String appDes){
        this.appName = appName;
        this.appImg = appImg;
        this.appDes = appDes;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(){
        this.appName = appName;
    }

    public String getAppImg() {
        return appImg;
    }

    public void setAppImg(){
        this.appImg = appImg;
    }

    public String getAppDes() {
        return appDes;
    }

    public void setAppDes(String appDes) {
        this.appDes = appDes;
    }

    @Override
    public String toString(){
        return this.appName+"(appDes:" + this.appDes + ")";
    }
}
