package com.rizaldev.weatherapp.weatherinfo;

import com.rizaldev.weatherapp.base.AbstractContract;

/**
 * Created by hilmi.rizaldi (hilmi.rizaldi@dana.id)
 * created on 09/01/19
 */
public interface WeatherInfoContract {

    interface View {

        void showWeatherInfo(String weatherInfo);

        void showWeatherImages(String imageUrl);

        void showError(String error);

        void showProgress();

        void dismissProgress();
    }

    interface Presenter extends AbstractContract.AbstractPresenter {

        void getWeatherInfo();

        void unsubscribeObserver();
    }
}
