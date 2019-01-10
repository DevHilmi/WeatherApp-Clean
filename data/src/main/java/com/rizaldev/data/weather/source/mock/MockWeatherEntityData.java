package com.rizaldev.data.weather.source.mock;

import com.rizaldev.data.weather.source.WeatherEntityData;
import com.rizaldev.data.weather.source.model.Main;
import com.rizaldev.data.weather.source.model.Weather;
import com.rizaldev.data.weather.source.model.result.CurrentWeatherResult;
import com.rizaldev.data.weather.source.model.result.UvIndexResult;
import com.rizaldev.data.weather.source.model.result.WeeklyWeatherResult;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;

/**
 * Created by hilmi.rizaldi (hilmi.rizaldi@dana.id)
 * created on 10/01/19
 */
public class MockWeatherEntityData implements WeatherEntityData {

    @Override
    public Observable<CurrentWeatherResult> getCurrentWeather(String cityName) {
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

    private CurrentWeatherResult dummyCurrentWeatherResult() {
        CurrentWeatherResult currentWeatherResult = new CurrentWeatherResult();
        Main main = new Main();
        main.setTemp(19.2);
        currentWeatherResult.setMain(main);
        Weather weather1 = new Weather();
        weather1.setMain("Mist");
        List<Weather> weathers = new ArrayList<>();
        weathers.add(weather1);
        currentWeatherResult.setWeather(weathers);
        return currentWeatherResult;
    }

}
