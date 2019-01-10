package com.rizaldev.data.weather.source;

import com.rizaldev.data.weather.source.network.result.CurrentWeatherResult;
import com.rizaldev.data.weather.source.network.result.UvIndexResult;
import com.rizaldev.data.weather.source.network.result.WeeklyWeatherResult;

import io.reactivex.Observable;

/**
 * Created by hilmi.rizaldi (hilmi.rizaldi@dana.id)
 * created on 10/01/19
 */
public interface WeatherEntityData {

    Observable<CurrentWeatherResult> getCurrentWeather();

    Observable<WeeklyWeatherResult> getWeeklyWeather();

    Observable<UvIndexResult> getUvIndex();
}
