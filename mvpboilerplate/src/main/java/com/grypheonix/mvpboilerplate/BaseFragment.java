package com.grypheonix.mvpboilerplate;


import android.support.v4.app.Fragment;

/**
 * Created at Appinventiv on 23/1/18 at IST 7:13 PM
 * Project MVP_Architecture_Boiler_Plate
 * @author appinventiv
 * @version 1.0
 * @since 1.0
 *
 */

public class BaseFragment extends Fragment implements BaseView {

    @Override
    public void showNoNetworkError() {
        ((BaseActivity) getActivity()).showNoNetworkError();
    }

    @Override
    public void showToastLong(String message) {
        ((BaseActivity) getActivity()).showToastLong(message);
    }

    @Override
    public void showSpecificError(String failureResponse) {

    }

    @Override
    public void showProgressDialog() {
        ((BaseActivity) getActivity()).showProgressDialog();
    }

    @Override
    public void hideProgressDialog() {
        ((BaseActivity) getActivity()).hideProgressDialog();
    }
}
