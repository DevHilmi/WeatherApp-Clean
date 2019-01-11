package com.rizaldev.weatherapp.di.components;

import com.rizaldev.weatherapp.di.PerActivity;
import com.rizaldev.weatherapp.di.modules.WeatherModule;
import com.rizaldev.weatherapp.weatherinfo.WeatherInfoFragment;

import dagger.Component;

/**
 * Created by hilmi.rizaldi (hilmi.rizaldi@dana.id)
 * created on 09/01/19
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = {WeatherModule.class})
public interface WeatherComponent {

    void inject(WeatherInfoFragment activity);
}
