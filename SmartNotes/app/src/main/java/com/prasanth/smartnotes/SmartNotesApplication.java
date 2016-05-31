package com.prasanth.smartnotes;

import android.app.Application;

import com.prasanth.smartnotes.data.FirebaseHelper;

/**
 * Created by prasanth on 31/05/16.
 */

public class SmartNotesApplication extends Application {
    @Override
    public void onCreate() {
        FirebaseHelper.getInstance().init();
        super.onCreate();
    }
}
