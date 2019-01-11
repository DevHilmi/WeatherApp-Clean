package com.rizaldev.weatherapp.di.modules;

import com.rizaldev.weatherapp.di.PerActivity;
import com.rizaldev.weatherapp.weatherinfo.WeatherInfoContract;
import com.rizaldev.weatherapp.weatherinfo.WeatherInfoPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by hilmi.rizaldi (hilmi.rizaldi@dana.id)
 * created on 09/01/19
 */
@Module
public class WeatherModule {

    private WeatherInfoContract.View view;

    public WeatherModule(WeatherInfoContract.View view) {
        this.view = view;
    }

    @Provides
    @PerActivity
    WeatherInfoContract.View provideView() {
        return this.view;
    }

    @Provides
    @PerActivity
    WeatherInfoContract.Presenter providePresenter(WeatherInfoPresenter presenter) {
        return presenter;
    }
}
