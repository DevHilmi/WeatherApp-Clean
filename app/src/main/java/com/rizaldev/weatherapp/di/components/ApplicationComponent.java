package com.rizaldev.weatherapp.di.components;

import com.rizaldev.domain.PostExecutionThread;
import com.rizaldev.domain.ThreadExecutor;
import com.rizaldev.domain.weather.repository.WeatherRepository;
import com.rizaldev.weatherapp.WeatherApplication;
import com.rizaldev.weatherapp.base.BaseActivity;
import com.rizaldev.weatherapp.di.modules.ApiModule;
import com.rizaldev.weatherapp.di.modules.ApplicationModule;
import com.rizaldev.weatherapp.di.modules.NetworkModule;

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
    ApplicationModule.class,
    NetworkModule.class,
    ApiModule.class
})
public interface ApplicationComponent {

    void inject(WeatherApplication danaApplication);

    void inject(BaseActivity baseActivity);

    Context context();

    Application application();

    ThreadExecutor threadExecutor();

    PostExecutionThread postExecutionThread();

    WeatherRepository weatherRepository();

}
