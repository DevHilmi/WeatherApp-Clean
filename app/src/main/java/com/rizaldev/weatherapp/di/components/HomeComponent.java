package com.rizaldev.weatherapp.di.components;

import com.rizaldev.weatherapp.di.PerActivity;
import com.rizaldev.weatherapp.di.modules.HomeModule;
import com.rizaldev.weatherapp.home.HomeActivity;

import dagger.Component;

/**
 * Created by hilmi.rizaldi (hilmi.rizaldi@dana.id)
 * created on 09/01/19
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = {HomeModule.class})
public interface HomeComponent {

    void inject(HomeActivity activity);
}
