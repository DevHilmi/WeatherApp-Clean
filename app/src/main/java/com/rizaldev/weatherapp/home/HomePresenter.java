package com.rizaldev.weatherapp.home;

import com.rizaldev.domain.DefaultObserver;
import com.rizaldev.domain.weather.CurrentWeatherResponse;
import com.rizaldev.domain.weather.interactor.GetCurrentWeather;

import javax.inject.Inject;

/**
 * Created by hilmi.rizaldi (hilmi.rizaldi@dana.id)
 * created on 09/01/19
 */
public class HomePresenter implements HomeContract.Presenter {

    private final GetCurrentWeather getCurrentWeather;

    private final HomeContract.View view;

    private DefaultObserver<CurrentWeatherResponse> weatherResponseDefaultObserver;

    @Inject
    public HomePresenter(GetCurrentWeather getCurrentWeather,
        HomeContract.View view) {
        this.getCurrentWeather = getCurrentWeather;
        this.view = view;
    }

    @Override
    public void getWeatherInfo() {
        getCurrentWeather.execute(getWeatherResponseDefaultObserver());
    }

    private DefaultObserver<CurrentWeatherResponse> getWeatherResponseDefaultObserver() {
        if (weatherResponseDefaultObserver == null) {
            weatherResponseDefaultObserver = new DefaultObserver<CurrentWeatherResponse>() {
                @Override
                public void onNext(CurrentWeatherResponse currentWeatherResponse) {
                    view.showWeatherInfo(currentWeatherResponse.dummy);
                }

                @Override
                public void onError(Throwable e) {

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
