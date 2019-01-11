package com.rizaldev.weatherapp.weatherinfo;

import com.bumptech.glide.Glide;
import com.rizaldev.weatherapp.R;
import com.rizaldev.weatherapp.base.BaseFragment;
import com.rizaldev.weatherapp.di.components.DaggerWeatherComponent;
import com.rizaldev.weatherapp.di.components.WeatherComponent;
import com.rizaldev.weatherapp.di.modules.WeatherModule;

import android.widget.ImageView;
import android.widget.TextView;

import javax.inject.Inject;

import butterknife.BindView;

public class WeatherInfoFragment extends BaseFragment implements WeatherInfoContract.View {

    @BindView(R.id.imageInfo)
    ImageView imageInfo;

    @BindView(R.id.textInfo)
    TextView textInfo;

    @Inject
    WeatherInfoPresenter weatherInfoPresenter;

    private WeatherComponent weatherComponent;

    public static WeatherInfoFragment newInstance() {
        return new WeatherInfoFragment();
    }

    @Override
    public int getLayout() {
        return R.layout.fragment_home;
    }

    @Override
    public void init() {
        initComponent();
        registerPresenter(weatherInfoPresenter);
        weatherInfoPresenter.getWeatherInfo();
    }

    private void initComponent() {
        if (weatherComponent == null) {
            weatherComponent = DaggerWeatherComponent.builder()
                .applicationComponent(getApplicationComponent()).
                    weatherModule(new WeatherModule(this))
                .build();
        }
        weatherComponent.inject(this);
    }

    @Override
    public void showWeatherInfo(String weatherInfo) {
        textInfo.setText(weatherInfo);
    }

    @Override
    public void showWeatherImages(String imageUrl) {
        Glide.with(this).load(imageUrl).into(imageInfo);
    }

    @Override
    public void showError(String error) {
        showToast(error);
    }
}
