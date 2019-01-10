package com.rizaldev.data.weather.source;

import com.rizaldev.data.weather.source.model.result.CurrentWeatherResult;
import com.rizaldev.data.weather.source.model.result.UvIndexResult;
import com.rizaldev.data.weather.source.model.result.WeeklyWeatherResult;

import io.reactivex.Observable;

/**
 * Created by hilmi.rizaldi (hilmi.rizaldi@dana.id)
 * created on 10/01/19
 */
public interface WeatherEntityData {

    Observable<CurrentWeatherResult> getCurrentWeather(String cityName);

    Observable<WeeklyWeatherResult> getWeeklyWeather();

    Observable<UvIndexResult> getUvIndex();
}
