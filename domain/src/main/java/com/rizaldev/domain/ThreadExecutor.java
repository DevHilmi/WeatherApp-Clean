package com.rizaldev.domain;

import java.util.concurrent.Executor;

/**
 * Created by hilmi.rizaldi (hilmi.rizaldi@dana.id)
 * created on 10/01/19
 */
/**
 * Executor implementation can be based on different frameworks or techniques of asynchronous
 * execution, but every implementation will execute the
 * {@link com.rizaldev.domain.UseCase} out of the UI thread.
 */
public interface ThreadExecutor extends Executor {}
