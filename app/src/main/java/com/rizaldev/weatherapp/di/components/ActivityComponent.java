package com.rizaldev.weatherapp.di.components;

import com.rizaldev.weatherapp.base.BaseActivity;
import com.rizaldev.weatherapp.di.PerActivity;
import com.rizaldev.weatherapp.di.modules.ActivityModule;

import dagger.Component;

/**
 * Created by hilmi.rizaldi (hilmi.rizaldi@dana.id)
 * created on 09/01/19
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = {ActivityModule.class})
public interface ActivityComponent {

    BaseActivity activity();
}
