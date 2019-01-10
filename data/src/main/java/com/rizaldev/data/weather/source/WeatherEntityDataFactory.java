package com.rizaldev.data.weather.source;

import com.rizaldev.data.AbstractEntityDataFactory;
import com.rizaldev.data.Source;
import com.rizaldev.data.weather.source.mock.MockWeatherEntityData;
import com.rizaldev.data.weather.source.network.NetworkWeatherEntityData;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by hilmi.rizaldi (hilmi.rizaldi@dana.id)
 * created on 10/01/19
 */
@Singleton
public class WeatherEntityDataFactory extends AbstractEntityDataFactory<WeatherEntityData> {

    @Inject
    public WeatherEntityDataFactory() {

    }

    @Override
    public WeatherEntityData createData(String source) {
        switch (source) {
            case Source.MOCK:
                return new MockWeatherEntityData();
            case Source.NETWORK:
                return new NetworkWeatherEntityData();
            default:
                return null;
        }

    }
}
