package com.rizaldev.weatherapp.base;

/**
 * Created by hilmi.rizaldi (hilmi.rizaldi@dana.id)
 * created on 09/01/19
 */
public interface AbstractContract {

    interface AbstractView {

        void showProgress();

        void dismissProgress();

        void onError(String errorMessage);

    }

    interface AuthenticatedAbstractView extends AbstractView {

        void onSessionExpired();

    }

    interface AbstractPresenter {

        void onDestroy();

    }
}
