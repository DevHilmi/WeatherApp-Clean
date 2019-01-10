package com.rizaldev.domain.weather.repository;

import com.rizaldev.domain.weather.CurrentWeatherResponse;
import com.rizaldev.domain.weather.UvIndexResponse;
import com.rizaldev.domain.weather.WeeklyWeatherResponse;

import io.reactivex.Observable;

/**
 * Created by hilmi.rizaldi (hilmi.rizaldi@dana.id)
 * created on 10/01/19
 */
public interface WeatherRepository {

    Observable<CurrentWeatherResponse> getCurrentWeather(String cityName);

    Observable<WeeklyWeatherResponse> getWeeklyWeather();

    Observable<UvIndexResponse> getUvIndex();

}
