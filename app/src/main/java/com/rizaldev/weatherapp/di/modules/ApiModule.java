package com.rizaldev.weatherapp.di.modules;

import com.rizaldev.data.weather.source.network.WeatherApi;
import com.rizaldev.weatherapp.BuildConfig;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by hilmi.rizaldi (hilmi.rizaldi@dana.id)
 * created on 10/01/19
 */
@Module
public class ApiModule {

    @Provides
    @Singleton
    WeatherApi provideWeatherApi(Retrofit.Builder builder) {
        return builder
            .baseUrl(BuildConfig.BASE_URL)
            .build()
            .create(WeatherApi.class);
    }
}
