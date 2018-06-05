package com.grypheonix.mvp_architecture_boiler_plate.utils;

import com.grypheonix.mvp_architecture_boiler_plate.BaseActivity;

/**
 * Created at Appinventiv on 5/6/18 at IST 7:19 PM
 * Project MVP_Architecture_Boiler_Plate
 *
 * @author appinventiv
 * @version 1.0
 * @since 1.0
 */

public class AppUtility {

    private static final AppUtility instance = new AppUtility();
    public static AppUtility getInstance() {
        return instance;
    }


    public int getStatusBarHeight(BaseActivity baseActivity) {
        return 0;
    }
}
