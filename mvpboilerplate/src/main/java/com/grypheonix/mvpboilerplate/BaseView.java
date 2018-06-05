package com.grypheonix.mvpboilerplate;

/**
 * Created at Appinventiv on 23/1/18 at IST 7:12 PM
 * Project MVP_Architecture_Boiler_Plate
 * @author appinventiv
 * @version 1.0
 * @since 1.0
 *
 */

public interface BaseView {

    void showNoNetworkError();
    void showToastLong(String message);
    void showSpecificError(String failureResponse);
    void showProgressDialog();
    void hideProgressDialog();
}
