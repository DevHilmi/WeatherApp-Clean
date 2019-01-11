package com.rizaldev.weatherapp.home;

import com.google.android.material.tabs.TabLayout;

import com.rizaldev.weatherapp.R;
import com.rizaldev.weatherapp.base.BaseActivityViewPager;

import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;

public class HomeTabActivity extends BaseActivityViewPager {

    @BindView(R.id.tabLayout)
    TabLayout tabLayout;

    @BindView(R.id.viewPager)
    ViewPager viewPager;

    @Override
    public int getLayout() {
        return R.layout.activity_home_tab;
    }

    @Override
    public void init() {
        registerViewPagerWithTabLayout(viewPager, tabLayout,
            HomeFragmentPagerAdapter.build(getSupportFragmentManager()));
    }

}
