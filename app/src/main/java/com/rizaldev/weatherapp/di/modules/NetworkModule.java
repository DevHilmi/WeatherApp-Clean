package com.rizaldev.weatherapp.di.modules;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by hilmi.rizaldi (hilmi.rizaldi@dana.id)
 * created on 10/01/19
 */
@Module
public class NetworkModule {

    private static final String DATE_FORMAT = "yyyy-MM-dd'T'hh:mm:ssZ";

    @Provides
    @Singleton
    Gson provideGson() {
        return new GsonBuilder().setPrettyPrinting()
            .setDateFormat(DATE_FORMAT)
            .create();
    }

    @Provides
    @Singleton
    OkHttpClient provideOkHttpClient(Context context) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        return builder.build();
    }

    @Provides
    @Singleton
    Retrofit.Builder provideRetrofitBuilder(Gson gson, OkHttpClient okHttpClient) {
        return new Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create(gson))
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .client(okHttpClient);
    }
}
