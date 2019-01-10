package com.rizaldev.domain.weather;

import java.util.List;

/**
 * Created by hilmi.rizaldi (hilmi.rizaldi@dana.id)
 * created on 10/01/19
 */
public class CurrentWeatherResponse {

    private Double temperature;

    private List<String> weatherDescription;

    public CurrentWeatherResponse() {
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public List<String> getWeatherDescription() {
        return weatherDescription;
    }

    public void setWeatherDescription(List<String> weatherDescription) {
        this.weatherDescription = weatherDescription;
    }
}
