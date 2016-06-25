package com.hosannamimistries.www.hosannaministries.logs;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by NARESH on 6/25/2016.
 */
public class L {
    public static void v(String tag,String msg) {
        Log.v(tag, "" + msg);
    }
    public static void i(String tag,String msg) {
        Log.i(tag, "" + msg);
    }
    public static void d(String tag,String msg) {
        Log.d(tag, "" + msg);
    }
    public static void e(String tag,String msg) {
        Log.e(tag, "" + msg);
    }

    public static void t(Context context, String message) {
        Toast.makeText(context, message + "", Toast.LENGTH_SHORT).show();
    }
    public static void T(Context context, String message) {
        Toast.makeText(context, message + "", Toast.LENGTH_LONG).show();
    }


}
