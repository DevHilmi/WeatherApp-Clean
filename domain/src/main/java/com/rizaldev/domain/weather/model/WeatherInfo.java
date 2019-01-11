package com.rizaldev.domain.weather.model;

/**
 * Created by hilmi.rizaldi (hilmi.rizaldi@dana.id)
 * created on 11/01/19
 */
public class WeatherInfo {

    String img;

    String info;

    public WeatherInfo(String info, String img) {
        this.info = info;
        this.img = img;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
