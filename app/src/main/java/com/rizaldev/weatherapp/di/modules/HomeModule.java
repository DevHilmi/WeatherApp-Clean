package com.rizaldev.weatherapp.di.modules;

import com.rizaldev.weatherapp.di.PerActivity;
import com.rizaldev.weatherapp.home.HomeContract;
import com.rizaldev.weatherapp.home.HomePresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by hilmi.rizaldi (hilmi.rizaldi@dana.id)
 * created on 09/01/19
 */
@Module
public class HomeModule {

    private HomeContract.View view;

    public HomeModule(HomeContract.View view) {
        this.view = view;
    }

    @Provides
    @PerActivity
    HomeContract.View provideView() {
        return this.view;
    }

    @Provides
    @PerActivity
    HomeContract.Presenter providePresenter(HomePresenter presenter) {
        return presenter;
    }
}
