package com.rizaldev.weatherapp.base;

import io.reactivex.disposables.Disposable;

/**
 * Created by hilmi.rizaldi (hilmi.rizaldi@dana.id)
 * created on 09/01/19
 */
public interface DisposeableHandler {
    void addDisposable(Disposable disposable);

    void dispose();

}
