package com.rizaldev.weatherapp.home;

import com.rizaldev.weatherapp.base.BaseFragment;
import com.rizaldev.weatherapp.base.BaseFragmentPagerAdapter;
import com.rizaldev.weatherapp.uv.UvFragment;
import com.rizaldev.weatherapp.weatherinfo.WeatherInfoFragment;
import com.rizaldev.weatherapp.weekly.WeeklyFragment;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentManager;

/**
 * Created by hilmi.rizaldi (hilmi.rizaldi@dana.id)
 * created on 11/01/19
 */
public class HomeFragmentPagerAdapter extends BaseFragmentPagerAdapter {

    private String tabTitles[] = new String[]{"Current", "Weekly", "UV"};

    private HomeFragmentPagerAdapter(FragmentManager fragmentManager,
        List<BaseFragment> fragments) {
        super(fragmentManager, fragments);
    }

    public static HomeFragmentPagerAdapter build(FragmentManager fragmentManager) {
        // TODO (hilmi.rizaldi) : adding other fragment to this adapter
        List<BaseFragment> fragments = new ArrayList<>();
        fragments.add(WeatherInfoFragment.newInstance());
        fragments.add(WeeklyFragment.newInstance());
        fragments.add(UvFragment.newInstance());
        return new HomeFragmentPagerAdapter(fragmentManager, fragments);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
