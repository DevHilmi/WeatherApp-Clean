package com.rizaldev.data.weather.source.network;

import com.rizaldev.data.weather.source.WeatherEntityData;
import com.rizaldev.data.weather.source.network.result.CurrentWeatherResult;
import com.rizaldev.data.weather.source.network.result.UvIndexResult;
import com.rizaldev.data.weather.source.network.result.WeeklyWeatherResult;

import io.reactivex.Observable;

/**
 * Created by hilmi.rizaldi (hilmi.rizaldi@dana.id)
 * created on 10/01/19
 */
public class NetworkWeatherEntityData implements WeatherEntityData {

    @Override
    public Observable<CurrentWeatherResult> getCurrentWeather() {
        return null;
    }

    @Override
    public Observable<WeeklyWeatherResult> getWeeklyWeather() {
        return null;
    }

    @Override
    public Observable<UvIndexResult> getUvIndex() {
        return null;
    }

}
