package com.rizaldev.weatherapp.base;

import com.google.android.material.tabs.TabLayout;

import com.rizaldev.weatherapp.utils.ViewPagerAdapter;

import androidx.viewpager.widget.ViewPager;

/**
 * Created by hilmi.rizaldi (hilmi.rizaldi@dana.id)
 * created on 10/01/19
 */
public abstract class BaseActivityViewPager extends BaseActivity {

    private ViewPagerAdapter viewPagerAdapter;

    protected void registerViewPager(ViewPager viewPager,
        BaseFragmentPagerAdapter fragmentPagerAdapter) {
        viewPagerAdapter = ViewPagerAdapter.register(viewPager, fragmentPagerAdapter);
    }

    protected void registerViewPagerWithTabLayout(ViewPager viewPager, TabLayout tabLayout,
        BaseFragmentPagerAdapter fragmentPagerAdapter) {
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }

        });
        viewPagerAdapter = ViewPagerAdapter.register(viewPager, fragmentPagerAdapter);
    }

    protected int getCurrentPosition() {
        if (viewPagerAdapter == null) {
            return 0;
        }

        return viewPagerAdapter.getCurrentPosition();
    }

    protected void setCurrentPosition(int newPosition) {
        if (viewPagerAdapter != null) {
            viewPagerAdapter.setCurrentPosition(newPosition);
        }
    }

    protected BaseFragment getCurrentFragment() {
        if (viewPagerAdapter == null) {
            return null;
        }
        return viewPagerAdapter.getCurrentFragment();
    }

    protected BaseFragment getFragment(int position) {
        if (viewPagerAdapter == null) {
            return null;
        }
        return viewPagerAdapter.getFragment(position);
    }

    protected int getChildCount() {
        if (viewPagerAdapter == null) {
            return 0;
        }
        return viewPagerAdapter.getChildCount();
    }

    public ViewPagerAdapter getViewPagerAdapter() {
        return viewPagerAdapter;
    }

    @Override
    public void onBackPressed() {
        if (viewPagerAdapter == null || !viewPagerAdapter.onBackPressed()) {
            super.onBackPressed();
        }
    }

}
