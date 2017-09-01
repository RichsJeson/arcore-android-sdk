package com.google.ar.core.examples.java.helloar.utils;

import android.util.Log;

/**
 * Created by liuzhenhui on 2017/8/31.
 */

public class TLog {
    private static final String TAG = "lzh";

    private static boolean isDebug() {
        return true;
    }

    public static final void d(String msg) {
        if (isDebug()) {
            Log.d(TAG, TAG + "-->" + msg);
        }
    }
}