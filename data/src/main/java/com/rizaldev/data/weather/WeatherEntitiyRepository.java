package com.rizaldev.data.weather;

import com.rizaldev.data.Source;
import com.rizaldev.data.weather.source.WeatherEntityData;
import com.rizaldev.data.weather.source.WeatherEntityDataFactory;
import com.rizaldev.data.weather.source.model.Weather;
import com.rizaldev.data.weather.source.model.result.CurrentWeatherResult;
import com.rizaldev.domain.weather.CurrentWeatherResponse;
import com.rizaldev.domain.weather.UvIndexResponse;
import com.rizaldev.domain.weather.WeeklyWeatherResponse;
import com.rizaldev.domain.weather.model.WeatherInfo;
import com.rizaldev.domain.weather.repository.WeatherRepository;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;

/**
 * Created by hilmi.rizaldi (hilmi.rizaldi@dana.id)
 * created on 10/01/19
 */
@Singleton
public class WeatherEntitiyRepository implements WeatherRepository {

    private final WeatherEntityDataFactory weatherEntityDataFactory;

    @Inject
    public WeatherEntitiyRepository(
        WeatherEntityDataFactory weatherEntityDataFactory) {
        this.weatherEntityDataFactory = weatherEntityDataFactory;
    }

    @Override
    public Observable<CurrentWeatherResponse> getCurrentWeather(String cityName) {
        return createWeatherData().getCurrentWeather(cityName).flatMap(
            (Function<CurrentWeatherResult, ObservableSource<CurrentWeatherResponse>>)
                currentWeatherResult -> {
                    CurrentWeatherResponse currentWeatherResponse = new CurrentWeatherResponse();
                    List<WeatherInfo> weatherInfoDescription = new ArrayList<>();
                    for (int i = 0; i < currentWeatherResult.getWeather().size(); i++) {
                        Weather weather = currentWeatherResult.getWeather().get(i);
                        weatherInfoDescription.add(
                            new WeatherInfo(weather.getMain(),
                                weather.getIcon()));
                    }
                    currentWeatherResponse.setWeatherInfoDescription(weatherInfoDescription);
                    return Observable.just(currentWeatherResponse);
                });
    }

    private WeatherEntityData createWeatherData() {
        return weatherEntityDataFactory.createData(Source.NETWORK);
    }

    @Override
    public Observable<WeeklyWeatherResponse> getWeeklyWeather() {
        return null;
    }

    @Override
    public Observable<UvIndexResponse> getUvIndex() {
        return null;
    }
}
