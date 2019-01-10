package com.rizaldev.data.weather.source.model.result;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import com.rizaldev.data.weather.source.model.Clouds;
import com.rizaldev.data.weather.source.model.Coord;
import com.rizaldev.data.weather.source.model.Main;
import com.rizaldev.data.weather.source.model.Sys;
import com.rizaldev.data.weather.source.model.Weather;
import com.rizaldev.data.weather.source.model.Wind;

import java.util.List;

/**
 * Created by hilmi.rizaldi (hilmi.rizaldi@dana.id)
 * created on 10/01/19
 */
public class CurrentWeatherResult {

    @SerializedName("base")
    @Expose
    private String base;

    @SerializedName("clouds")
    @Expose
    private Clouds clouds;

    @SerializedName("cod")
    @Expose
    private Integer cod;

    @SerializedName("coord")
    @Expose
    private Coord coord;

    @SerializedName("dt")
    @Expose
    private Integer dt;

    @SerializedName("id")
    @Expose
    private Integer id;

    @SerializedName("main")
    @Expose
    private Main main;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("sys")
    @Expose
    private Sys sys;

    @SerializedName("visibility")
    @Expose
    private Integer visibility;

    @SerializedName("weather")
    @Expose
    private List<Weather> weather = null;

    @SerializedName("wind")
    @Expose
    private Wind wind;

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public Integer getVisibility() {
        return visibility;
    }

    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public Integer getDt() {
        return dt;
    }

    public void setDt(Integer dt) {
        this.dt = dt;
    }

    public Sys getSys() {
        return sys;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

}

