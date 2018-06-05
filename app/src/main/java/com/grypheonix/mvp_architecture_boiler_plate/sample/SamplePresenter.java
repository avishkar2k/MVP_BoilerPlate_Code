package com.grypheonix.mvp_architecture_boiler_plate.sample;

import com.grypheonix.mvpboilerplate.BasePresenter;

/**
 * Created at Appinventiv on 6/6/18 at IST 1:16 AM
 * Project MVP_Architecture_Boiler_Plate
 *
 * @author appinventiv
 * @version 1.0
 * @since 1.0
 */

public class SamplePresenter extends BasePresenter<SampleView> implements SampleModelListener {

    public SamplePresenter(SampleView view) {
        super(view);
    }

    @Override
    protected void setModel() {

    }

    @Override
    protected void destroy() {

    }

    @Override
    protected void initView() {

    }
}
