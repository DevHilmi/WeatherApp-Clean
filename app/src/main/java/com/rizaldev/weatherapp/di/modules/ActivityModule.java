package com.rizaldev.weatherapp.di.modules;

import com.rizaldev.weatherapp.base.BaseActivity;
import com.rizaldev.weatherapp.di.PerActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by hilmi.rizaldi (hilmi.rizaldi@dana.id)
 * created on 09/01/19
 */
@Module
public class ActivityModule {

    private final BaseActivity baseActivity;

    public ActivityModule(BaseActivity baseActivity) {
        this.baseActivity = baseActivity;
    }

    @Provides
    @PerActivity
    BaseActivity activity() {
        return baseActivity;
    }

}
