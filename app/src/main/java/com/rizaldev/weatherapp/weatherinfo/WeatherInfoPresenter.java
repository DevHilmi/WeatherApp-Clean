package com.rizaldev.weatherapp.weatherinfo;

import com.rizaldev.domain.DefaultObserver;
import com.rizaldev.domain.weather.CurrentWeatherResponse;
import com.rizaldev.domain.weather.interactor.GetCurrentWeather;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by hilmi.rizaldi (hilmi.rizaldi@dana.id)
 * created on 09/01/19
 */
public class WeatherInfoPresenter implements WeatherInfoContract.Presenter {

    private final GetCurrentWeather getCurrentWeather;

    private final WeatherInfoContract.View view;

    private DefaultObserver<CurrentWeatherResponse> weatherResponseDefaultObserver;

    @Inject
    public WeatherInfoPresenter(GetCurrentWeather getCurrentWeather,
        WeatherInfoContract.View view) {
        this.getCurrentWeather = getCurrentWeather;
        this.view = view;
    }

    @Override
    public void getWeatherInfo() {
        getCurrentWeather.execute(getWeatherResponseDefaultObserver(),
            GetCurrentWeather.Params.forGetCurrentWeather("London"));
    }

    private DefaultObserver<CurrentWeatherResponse> getWeatherResponseDefaultObserver() {
        // TODO (hilmi.rizaldi) : Show error message if error.
        if (weatherResponseDefaultObserver == null) {
            weatherResponseDefaultObserver = new DefaultObserver<CurrentWeatherResponse>() {
                @Override
                public void onNext(CurrentWeatherResponse currentWeatherResponse) {
                    view.showWeatherInfo(String.valueOf(currentWeatherResponse.getTemperature()));
                }

                @Override
                public void onError(Throwable e) {
                    Log.d("Test", e.getMessage());
                }

                @Override
                public void onComplete() {

                }
            };
        }
        return weatherResponseDefaultObserver;
    }

    @Override
    public void unsubscribeObserver() {
        if (weatherResponseDefaultObserver != null) {
            weatherResponseDefaultObserver.dispose();
            weatherResponseDefaultObserver = null;
        }
    }

    @Override
    public void onDestroy() {
        getCurrentWeather.dispose();
    }
}