package com.rizaldev.domain.weather.interactor;

import com.rizaldev.domain.PostExecutionThread;
import com.rizaldev.domain.ThreadExecutor;
import com.rizaldev.domain.UseCase;
import com.rizaldev.domain.weather.CurrentWeatherResponse;
import com.rizaldev.domain.weather.repository.WeatherRepository;

import javax.inject.Inject;

import io.reactivex.Observable;

/**
 * Created by hilmi.rizaldi (hilmi.rizaldi@dana.id)
 * created on 10/01/19
 */
public class GetCurrentWeather extends UseCase<CurrentWeatherResponse, GetCurrentWeather.Params> {

    private final WeatherRepository weatherRepository;

    @Inject
    public GetCurrentWeather(ThreadExecutor threadExecutor, PostExecutionThread postExecutionThread,
        WeatherRepository weatherRepository) {
        super(threadExecutor, postExecutionThread);
        this.weatherRepository = weatherRepository;
    }

    @Override
    protected Observable<CurrentWeatherResponse> buildUseCaseObservable(Params params) {
        return weatherRepository.getCurrentWeather(params.cityName);
    }

    public static class Params {

        private String cityName;

        private Params(String cityName) {
            this.cityName = cityName;
        }

        public static Params forGetCurrentWeather(String cityName) {
            return new Params(cityName);
        }
    }
}
