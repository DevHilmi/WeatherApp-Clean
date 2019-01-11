package com.rizaldev.weatherapp.weekly;

import com.rizaldev.weatherapp.R;
import com.rizaldev.weatherapp.base.BaseFragment;

import androidx.fragment.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link WeeklyFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class WeeklyFragment extends BaseFragment {

    public static WeeklyFragment newInstance() {
        return new WeeklyFragment();
    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_weekly;
    }

    @Override
    protected void init() {

    }

}
