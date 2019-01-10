package com.rizaldev.weatherapp.di.modules;

import com.rizaldev.JobExecutor;
import com.rizaldev.data.weather.WeatherEntitiyRepository;
import com.rizaldev.domain.PostExecutionThread;
import com.rizaldev.domain.ThreadExecutor;
import com.rizaldev.domain.weather.repository.WeatherRepository;
import com.rizaldev.weatherapp.UIThread;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by hilmi.rizaldi (hilmi.rizaldi@dana.id)
 * created on 09/01/19
 */
@Module
public class ApplicationModule {

    private final Application application;

    public ApplicationModule(Application application) {
        this.application = application;
    }

    @Provides
    @Singleton
    Context provideApplicationContext() {
        return application;
    }

    @Provides
    @Singleton
    Application provideApplication() {
        return application;
    }

    @Provides
    @Singleton
    ThreadExecutor provideThreadExecutor(JobExecutor jobExecutor) {
        return jobExecutor;
    }
    @Provides
    @Singleton
    PostExecutionThread providePostExecutionThread(UIThread uiThread) {
        return uiThread;
    }


    @Provides
    @Singleton
    WeatherRepository provideWeatherRepository(WeatherEntitiyRepository weatherEntitiyRepository) {
        return weatherEntitiyRepository;
    }
}
