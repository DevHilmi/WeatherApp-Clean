package com.rizaldev.weatherapp.di.components;

import com.rizaldev.weatherapp.WeatherApplication;
import com.rizaldev.weatherapp.base.BaseActivity;
import com.rizaldev.weatherapp.di.modules.ApplicationModule;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by hilmi.rizaldi (hilmi.rizaldi@dana.id)
 * created on 09/01/19
 */

@Singleton
@Component(modules = {
    ApplicationModule.class
})
public interface ApplicationComponent {

    void inject(WeatherApplication danaApplication);

    void inject(BaseActivity baseActivity);

    Context context();

    Application application();
}
