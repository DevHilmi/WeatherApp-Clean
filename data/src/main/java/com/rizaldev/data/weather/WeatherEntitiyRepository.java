package com.rizaldev.data.weather;

import com.rizaldev.data.Source;
import com.rizaldev.data.weather.mapper.CurrentWeatherMapper;
import com.rizaldev.data.weather.source.WeatherEntityData;
import com.rizaldev.data.weather.source.WeatherEntityDataFactory;
import com.rizaldev.domain.weather.CurrentWeatherResponse;
import com.rizaldev.domain.weather.UvIndexResponse;
import com.rizaldev.domain.weather.WeeklyWeatherResponse;
import com.rizaldev.domain.weather.repository.WeatherRepository;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Observable;

/**
 * Created by hilmi.rizaldi (hilmi.rizaldi@dana.id)
 * created on 10/01/19
 */
@Singleton
public class WeatherEntitiyRepository implements WeatherRepository {

    private final CurrentWeatherMapper mapper;

    private final WeatherEntityDataFactory weatherEntityDataFactory;

    @Inject
    WeatherEntitiyRepository(
        WeatherEntityDataFactory weatherEntityDataFactory, CurrentWeatherMapper mapper) {
        this.weatherEntityDataFactory = weatherEntityDataFactory;
        this.mapper = mapper;
    }

    @Override
    public Observable<CurrentWeatherResponse> getCurrentWeather(String cityName) {
        return createWeatherData().getCurrentWeather(cityName).flatMap(
            currentWeatherResult -> Observable.just(mapper.transform(currentWeatherResult)));
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
