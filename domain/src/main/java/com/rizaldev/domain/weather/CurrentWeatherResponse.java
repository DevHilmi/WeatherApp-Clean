package com.rizaldev.domain.weather;

import com.rizaldev.domain.weather.model.WeatherInfo;

import java.util.List;

/**
 * Created by hilmi.rizaldi (hilmi.rizaldi@dana.id)
 * created on 10/01/19
 */
public class CurrentWeatherResponse {

    private Double temperature;

    private List<WeatherInfo> weathersInfo;

    public CurrentWeatherResponse() {
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public List<WeatherInfo> getWeathersInfo() {
        return weathersInfo;
    }

    public void setWeatherInfoDescription(List<WeatherInfo> weatherInfoDescription) {
        this.weathersInfo = weatherInfoDescription;
    }
}
