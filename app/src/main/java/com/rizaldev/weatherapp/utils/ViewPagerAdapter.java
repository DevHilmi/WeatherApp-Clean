package com.rizaldev.weatherapp.utils;

import com.rizaldev.weatherapp.base.BaseFragment;
import com.rizaldev.weatherapp.base.BaseFragmentPagerAdapter;

import androidx.viewpager.widget.ViewPager;

/**
 * Created by hilmi.rizaldi (hilmi.rizaldi@dana.id)
 * created on 10/01/19
 */
public class ViewPagerAdapter {

    private BaseFragmentPagerAdapter fragmentPagerAdapter;

    private ViewPager viewPager;

    private ViewPagerAdapter(ViewPager viewPager,
        BaseFragmentPagerAdapter fragmentPagerAdapter) {
        viewPager.setAdapter(fragmentPagerAdapter);

        this.viewPager = viewPager;
        this.fragmentPagerAdapter = fragmentPagerAdapter;
    }

    public static ViewPagerAdapter register(ViewPager viewPager,
        BaseFragmentPagerAdapter fragmentPagerAdapter) {
        return new ViewPagerAdapter(viewPager, fragmentPagerAdapter);
    }

    public BaseFragment getCurrentFragment() {
        return fragmentPagerAdapter.getItem(getCurrentPosition());
    }

    public int getCurrentPosition() {
        return viewPager.getCurrentItem();
    }

    public void setCurrentPosition(int newPosition) {
        viewPager.setCurrentItem(newPosition);
    }

    public BaseFragment getFragment(int position) {
        return fragmentPagerAdapter.getItem(position);
    }

    public int getChildCount() {
        return fragmentPagerAdapter.getCount();
    }

    public void clear() {
        if (viewPager != null) {
            viewPager.removeAllViews();
        }
    }

    public boolean onBackPressed() {
        BaseFragment baseFragment = fragmentPagerAdapter.getItem(viewPager.getCurrentItem());
        return baseFragment.onBackPressed();
    }

}
