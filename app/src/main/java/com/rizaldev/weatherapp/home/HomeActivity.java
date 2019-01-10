package com.rizaldev.weatherapp.home;

import com.rizaldev.weatherapp.R;
import com.rizaldev.weatherapp.base.BaseActivity;
import com.rizaldev.weatherapp.di.components.DaggerHomeComponent;
import com.rizaldev.weatherapp.di.components.HomeComponent;
import com.rizaldev.weatherapp.di.modules.HomeModule;

import android.widget.TextView;

import javax.inject.Inject;

import butterknife.BindView;

public class HomeActivity extends BaseActivity implements HomeContract.View {

    @Inject
    HomePresenter homePresenter;

    @BindView(R.id.textInfo)
    TextView textInfo;

    private HomeComponent homeComponent;

    @Override
    public int getLayout() {
        return R.layout.activity_home;
    }

    @Override
    public void init() {
        initComponent();
        registerPresenter(homePresenter);
        homePresenter.getWeatherInfo();
    }

    private void initComponent() {
        if (homeComponent == null) {
            homeComponent = DaggerHomeComponent.builder()
                .applicationComponent(getApplicationComponent()).
                    homeModule(new HomeModule(this))
                .build();
        }
        homeComponent.inject(this);
    }

    @Override
    public void showWeatherInfo(String weatherInfo) {
        textInfo.setText(weatherInfo);
    }
}
