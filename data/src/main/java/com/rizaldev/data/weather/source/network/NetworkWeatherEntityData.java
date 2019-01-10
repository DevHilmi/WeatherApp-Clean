package com.rizaldev.data.weather.source.network;

import com.rizaldev.data.BuildConfig;
import com.rizaldev.data.weather.source.WeatherEntityData;
import com.rizaldev.data.weather.source.model.result.CurrentWeatherResult;
import com.rizaldev.data.weather.source.model.result.UvIndexResult;
import com.rizaldev.data.weather.source.model.result.WeeklyWeatherResult;

import io.reactivex.Observable;

/**
 * Created by hilmi.rizaldi (hilmi.rizaldi@dana.id)
 * created on 10/01/19
 */
public class NetworkWeatherEntityData implements WeatherEntityData {

    private final WeatherApi weatherApi;

    public NetworkWeatherEntityData(WeatherApi weatherApi) {
        this.weatherApi = weatherApi;
    }

    @Override
    public Observable<CurrentWeatherResult> getCurrentWeather(String cityName) {
        String key = BuildConfig.WEATHER_KEY;
        return weatherApi.getCurrentWeather(key, cityName).toObservable();
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
