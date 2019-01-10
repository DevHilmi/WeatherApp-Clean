package com.rizaldev.data.weather.source.mock;

import com.rizaldev.data.weather.source.WeatherEntityData;
import com.rizaldev.data.weather.source.network.result.CurrentWeatherResult;
import com.rizaldev.data.weather.source.network.result.UvIndexResult;
import com.rizaldev.data.weather.source.network.result.WeeklyWeatherResult;

import io.reactivex.Observable;

/**
 * Created by hilmi.rizaldi (hilmi.rizaldi@dana.id)
 * created on 10/01/19
 */
public class MockWeatherEntityData implements WeatherEntityData {

    @Override
    public Observable<CurrentWeatherResult> getCurrentWeather() {
        return Observable.just(dummyCurrentWeatherResult());
    }

    @Override
    public Observable<WeeklyWeatherResult> getWeeklyWeather() {
        return null;
    }

    @Override
    public Observable<UvIndexResult> getUvIndex() {
        return null;
    }

    public CurrentWeatherResult dummyCurrentWeatherResult() {
        CurrentWeatherResult currentWeatherResult = new CurrentWeatherResult();
        currentWeatherResult.dummy = "Dummy Weather";
        return currentWeatherResult;
    }

}
