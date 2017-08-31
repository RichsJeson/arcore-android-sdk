package com.google.ar.core.examples.java.helloar.hack;

import android.os.Build;

import java.lang.reflect.Field;

/**
 * Created by liuzhenhui on 2017/8/31.
 */

public class HackDeviceInfo {
    public static final void hackBuildFingerprint() {
        TLog.d("HackDeviceInfo->hackBuildFingerprint 修改前" + Build.FINGERPRINT);
        try {
            Class<?> buildClass = Class.forName("android.os.Build");

            //获取Build.Fingerprint字段
            Field fingerprintField = buildClass.getDeclaredField("FINGERPRINT");
            fingerprintField.setAccessible(true);
            Object fingerprint = fingerprintField.get(null);
            TLog.d("HackDeviceInfo->hackBuildFingerprint 反射拿到的值" + fingerprint);

            String hackFingerprint = (String) fingerprint;
            hackFingerprint += "sailfish:7";
            TLog.d("HackDeviceInfo->hackBuildFingerprint 修改后的值" + hackFingerprint);
            fingerprintField.set(buildClass, hackFingerprint);
        } catch (Exception e) {
            TLog.d("HackDeviceInfo->hackBuildFingerprint " + e.getMessage());
            e.printStackTrace();
        }
    }
}
