package com.rizaldev.weatherapp.uv;

import com.rizaldev.weatherapp.R;
import com.rizaldev.weatherapp.base.BaseFragment;

import androidx.fragment.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link UvFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class UvFragment extends BaseFragment {

    public static UvFragment newInstance() {
        UvFragment fragment = new UvFragment();
        return fragment;
    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_uv;
    }

    @Override
    protected void init() {

    }

}
