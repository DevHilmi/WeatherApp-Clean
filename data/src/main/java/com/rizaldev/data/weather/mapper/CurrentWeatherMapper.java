package com.rizaldev.data.weather.mapper;

import com.rizaldev.data.weather.source.model.Weather;
import com.rizaldev.data.weather.source.model.result.CurrentWeatherResult;
import com.rizaldev.domain.weather.CurrentWeatherResponse;
import com.rizaldev.domain.weather.model.WeatherInfo;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by hilmi.rizaldi (hilmi.rizaldi@dana.id)
 * created on 11/01/19
 */
@Singleton
public class CurrentWeatherMapper {

    @Inject
    public CurrentWeatherMapper() {
    }

    public CurrentWeatherResponse transform(CurrentWeatherResult currentWeatherResult) {
        CurrentWeatherResponse currentWeatherResponse = new CurrentWeatherResponse();
        List<WeatherInfo> weatherInfoDescription = new ArrayList<>();
        for (int i = 0; i < currentWeatherResult.getWeather().size(); i++) {
            Weather weather = currentWeatherResult.getWeather().get(i);
            weatherInfoDescription.add(
                new WeatherInfo(weather.getMain(),
                    weather.getIcon()));
        }
        currentWeatherResponse.setWeatherInfoDescription(weatherInfoDescription);
        return currentWeatherResponse;
    }
}
