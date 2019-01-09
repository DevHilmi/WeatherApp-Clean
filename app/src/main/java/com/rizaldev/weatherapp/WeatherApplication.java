package com.rizaldev.weatherapp;

import com.rizaldev.weatherapp.di.ComponentHolder;
import com.rizaldev.weatherapp.di.components.ApplicationComponent;
import com.rizaldev.weatherapp.di.components.DaggerApplicationComponent;
import com.rizaldev.weatherapp.di.modules.ApplicationModule;

import android.app.Application;

/**
 * Created by hilmi.rizaldi (hilmi.rizaldi@dana.id)
 * created on 09/01/19
 */
public class WeatherApplication extends Application {

    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        initInjector();
    }

    private void initInjector() {
        if (applicationComponent == null) {
            applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        }
        applicationComponent.inject(this);

        ComponentHolder.set(applicationComponent);
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}
