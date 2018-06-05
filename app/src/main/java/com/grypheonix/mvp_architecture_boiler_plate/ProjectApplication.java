package com.grypheonix.mvp_architecture_boiler_plate;

import android.annotation.SuppressLint;
import android.support.multidex.MultiDexApplication;


@SuppressLint("Registered")
public class ProjectApplication extends MultiDexApplication {
    public static String TAG = ProjectApplication.class.getSimpleName();

    public static String appName;

    @Override
    public void onCreate() {
        super.onCreate();
        appName = getResources().getString(R.string.app_name);
    }

}