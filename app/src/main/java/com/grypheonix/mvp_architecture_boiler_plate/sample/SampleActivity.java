package com.grypheonix.mvp_architecture_boiler_plate.sample;

import android.os.Bundle;

import com.grypheonix.mvp_architecture_boiler_plate.R;
import com.grypheonix.mvpboilerplate.BaseActivity;

public class SampleActivity extends BaseActivity implements SampleView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected int getResourceId() {
        return 0;
    }

    @Override
    public void showNoNetworkError() {

    }

    @Override
    public void showSpecificError(String failureResponse) {

    }
}
