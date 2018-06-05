package com.grypheonix.mvpboilerplate;

import java.lang.ref.SoftReference;

/**
 * Created at Appinventiv on 23/1/18 at IST 7:13 PM
 * Project MVP_Architecture_Boiler_Plate
 * @author appinventiv
 * @version 1.0
 * @since 1.0
 *
 */

public abstract class BaseModel<T extends BaseModelListener>{

    private static final int NO_NETWORK = 999;
    private SoftReference<T> listener;

    public BaseModel(T listener) {
        this.listener = new SoftReference<>(listener);
    }

    public void attachListener(T listener) {
        this.listener = new SoftReference<>(listener);
    }

    public void detachListener() {
        this.listener = null;
    }

    public T getListener() {
        return (listener != null) ? listener.get() : null;
    }

    public abstract void init();

    private void noNetworkAvailableError() {
        getListener().noNetworkError();
    }

}
