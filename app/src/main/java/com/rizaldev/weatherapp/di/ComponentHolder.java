package com.rizaldev.weatherapp.di;

import com.rizaldev.weatherapp.di.components.ApplicationComponent;

/**
 * Created by hilmi.rizaldi (hilmi.rizaldi@dana.id)
 * created on 09/01/19
 */
public class ComponentHolder {

    private static ComponentHolder componentHolder;

    private final ApplicationComponent applicationComponent;

    private ComponentHolder(ApplicationComponent applicationComponent) {
        this.applicationComponent = applicationComponent;
    }

    public static void set(ApplicationComponent applicationComponent) {
        if (componentHolder == null) {
            componentHolder = new ComponentHolder(applicationComponent);
        }
    }

    public static ApplicationComponent provide() {
        if (componentHolder == null) throw new IllegalStateException(
            "Application components needs to be set in Application");

        return componentHolder.applicationComponent;
    }
}
