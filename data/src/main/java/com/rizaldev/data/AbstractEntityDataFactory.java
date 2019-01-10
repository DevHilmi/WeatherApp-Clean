package com.rizaldev.data;

/**
 * Created by hilmi.rizaldi (hilmi.rizaldi@dana.id)
 * created on 10/01/19
 */
public abstract class AbstractEntityDataFactory<T> {

    public abstract T createData(@Source String source);
}