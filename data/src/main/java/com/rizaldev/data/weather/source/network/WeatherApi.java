package com.rizaldev.data.weather.source.network;

import com.rizaldev.data.weather.source.model.result.CurrentWeatherResult;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by hilmi.rizaldi (hilmi.rizaldi@dana.id)
 * created on 10/01/19
 */

public interface WeatherApi {

    @GET("weather")
    Single<CurrentWeatherResult> getCurrentWeather(@Query("APPID") String appId,
        @Query("q") String cityName);
}
