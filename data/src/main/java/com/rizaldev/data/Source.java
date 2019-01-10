package com.rizaldev.data;

/**
 * Created by hilmi.rizaldi (hilmi.rizaldi@dana.id)
 * created on 10/01/19
 */

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import androidx.annotation.StringDef;

/**
 * Choices of data source
 * local = persistence data (example : shared prefference, local db, etc)
 * network = from BE
 * mock = mock data in app
 */

@StringDef({Source.LOCAL, Source.NETWORK, Source.MOCK})
@Retention(RetentionPolicy.SOURCE)
public @interface Source {

    String LOCAL = "local";

    String MOCK = "mock";

    String NETWORK = "network";
}
