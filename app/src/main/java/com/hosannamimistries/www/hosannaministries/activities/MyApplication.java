package com.hosannamimistries.www.hosannaministries.activities;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.hosannamimistries.www.hosannaministries.R;
import com.hosannamimistries.www.hosannaministries.constants.Constants;

/**
 * Created by NARESH on 6/25/2016.
 */
public class MyApplication extends Application {
    private static MyApplication sInstance;
    private static SharedPreferences sharedPreferences;
    private static SharedPreferences.Editor editor;
    @Override
    public void onCreate() {
        super.onCreate();
        initializeSharedPreferences();//Initialize the SharedPreferences
    }
    public static MyApplication getInstance() {
        return sInstance;
    }

    public static Context getAppContext() {
        return sInstance.getApplicationContext();
    }
    private void initializeSharedPreferences(){
        sharedPreferences=this.getSharedPreferences(Constants.sharedPreferences, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }
    public static SharedPreferences getSharedPreferences(){
        return sharedPreferences;
    }
    public static SharedPreferences.Editor getEditor(){
        return editor;
    }
}
