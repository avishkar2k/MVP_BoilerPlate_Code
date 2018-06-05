package com.grypheonix.mvpboilerplate;

import java.lang.ref.SoftReference;

/**
 * Created at Appinventiv on 23/1/18 at IST 7:00 PM
 * Project Android
 * @author appinventiv
 * @version 1.0
 * @since 1.0
 *
 */

public abstract class BasePresenter<T extends BaseView> implements BaseModelListener {

    private SoftReference<T> view;

    public BasePresenter(T view) {
        attachView(view);
        setModel();
    }

    public void attachView(T view) {
        this.view = new SoftReference<T>(view);
    }

    public T getView() {
        return (view == null) ? null : view.get();
    }

    public void detachView() {
        view = null;
        destroy();
    }

    protected abstract void setModel();

    protected abstract void destroy();

    protected abstract void initView();

    /**
     * Common place to receive noNetwork hook
     * this can be passed on to BaseFragment or BaseActivity to show common screen or error
     */

    @Override
    public void noNetworkError() {
        getView().showNoNetworkError();
    }

}
