package com.rizaldev.weatherapp.weatherinfo;

import com.rizaldev.domain.DefaultObserver;
import com.rizaldev.domain.weather.CurrentWeatherResponse;
import com.rizaldev.domain.weather.interactor.GetCurrentWeather;
import com.rizaldev.weatherapp.BuildConfig;

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
        // TODO (hilmi.rizaldi) : enable user to set current city weather.
        getCurrentWeather.execute(getWeatherResponseDefaultObserver(),
            GetCurrentWeather.Params.forGetCurrentWeather("Jakarta"));
    }

    private DefaultObserver<CurrentWeatherResponse> getWeatherResponseDefaultObserver() {
        if (weatherResponseDefaultObserver == null) {
            weatherResponseDefaultObserver = new DefaultObserver<CurrentWeatherResponse>() {
                @Override
                public void onNext(CurrentWeatherResponse currentWeatherResponse) {
                    view.showWeatherInfo(currentWeatherResponse.getWeathersInfo().get(0).getInfo());
                    view.showWeatherImages(
                        BuildConfig.BASE_URL + "img/w/" + currentWeatherResponse.getWeathersInfo()
                            .get(0)
                            .getImg() + ".png");
                }

                @Override
                public void onError(Throwable e) {
                    // TODO (hilmi.rizaldi) : configure timber for better logger.
                    Log.d("Test", e.getMessage());
                    view.showError("Error take data");
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
