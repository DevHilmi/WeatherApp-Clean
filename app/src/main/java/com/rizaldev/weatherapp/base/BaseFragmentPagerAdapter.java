package com.rizaldev.weatherapp.base;

import java.util.List;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

/**
 * Created by hilmi.rizaldi (hilmi.rizaldi@dana.id)
 * created on 10/01/19
 */
public class BaseFragmentPagerAdapter extends FragmentStatePagerAdapter {

    private List<BaseFragment> fragments;

    public BaseFragmentPagerAdapter(FragmentManager fragmentManager, List<BaseFragment> fragments) {
        super(fragmentManager);
        setFragments(fragments);
    }

    public void setFragments(List<BaseFragment> fragments) {
        this.fragments = fragments;
    }

    @Override
    public BaseFragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}