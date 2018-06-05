package com.grypheonix.mvpboilerplate;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.grypheonix.mvp_architecture_boiler_plate.databinding.ActivityBaseBinding;
import com.grypheonix.mvp_architecture_boiler_plate.utils.AppUtility;

/**
 * Created at Appinventiv on 23/1/18 at IST 1:36 PM
 * Project Android
 *
 * @author appinventiv
 * @version 1.0
 * @since 1.0
 */

public abstract class BaseActivity extends AppCompatActivity implements BaseView {

    private FrameLayout baseContainer;

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(newBase);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityBaseBinding dataBinding = DataBindingUtil
                .setContentView(this, R.layout.activity_base);
        initView(dataBinding);
        setLayout();

        //set status bar height padding to the container
        setLayoutHeightPadding();

        //sets navigation bars transparent
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow(); // in Activity's onCreate() for instance
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                    WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }
    }

    /**
     * Method to initialize the views
     * @param dataBinding {@link ActivityBaseBinding}
     */
    private void initView(ActivityBaseBinding dataBinding) {
        baseContainer = dataBinding.baseContainer;
    }

    /**
     * Method to add the padding top to the container layout equivalent to status bar height
     */
    private void setLayoutHeightPadding() {
        baseContainer.setPadding(0,
                AppUtility.getInstance().getStatusBarHeight(this),
                0,
                0);
    }

    private void setLayout() {
        if (getResourceId() != -1) {
            removeLayout();
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout
                    .LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,
                    RelativeLayout.LayoutParams.MATCH_PARENT);
            LayoutInflater inflater = (LayoutInflater) this.getSystemService(LAYOUT_INFLATER_SERVICE);
            if (inflater != null) {
                View view = inflater.inflate(getResourceId(), null);
                baseContainer.addView(view, layoutParams);
            }
        }
    }

    private void removeLayout() {
        if (baseContainer.getChildCount() >= 1)
            baseContainer.removeAllViews();
    }

    public void addFragment(int layoutResId, BaseFragment fragment, String tag) {
        if (getSupportFragmentManager().findFragmentByTag(tag) == null)
            getSupportFragmentManager().beginTransaction()
                    .add(layoutResId, fragment, tag)
                    .commit();
    }

    public void addFragmentWithBackstack(int layoutResId, BaseFragment fragment, String tag) {
        getSupportFragmentManager().beginTransaction()
                .add(layoutResId, fragment, tag)
                .addToBackStack(tag)
                .commit();
    }

    protected abstract int getResourceId();

    @Override
    public void showToastLong(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showProgressDialog() {

    }

    @Override
    public void hideProgressDialog() {

    }
}
