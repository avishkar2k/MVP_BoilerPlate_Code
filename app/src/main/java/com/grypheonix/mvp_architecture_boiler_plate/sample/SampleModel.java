package com.grypheonix.mvp_architecture_boiler_plate.sample;

import com.grypheonix.mvpboilerplate.BaseModel;

/**
 * Created at Appinventiv on 6/6/18 at IST 1:17 AM
 * Project MVP_Architecture_Boiler_Plate
 *
 * @author appinventiv
 * @version 1.0
 * @since 1.0
 */

public class SampleModel extends BaseModel<SampleModelListener> {
    public SampleModel(SampleModelListener listener) {
        super(listener);
    }

    @Override
    public void init() {

    }
}
