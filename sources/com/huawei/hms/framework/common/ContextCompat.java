package com.huawei.hms.framework.common;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Process;
import com.anythink.expressad.foundation.g.b.b;

/* loaded from: classes2.dex */
public class ContextCompat {
    private static final String TAG = "ContextCompat";

    public static boolean checkSelfPermission(Context context, String str) {
        if (context != null && str != null) {
            try {
                if (context.checkPermission(str, Process.myPid(), Process.myUid()) != 0) {
                    return false;
                }
                return true;
            } catch (RuntimeException e10) {
                Logger.e(TAG, "dealType rethrowFromSystemServer:", e10);
                return false;
            }
        }
        Logger.w(TAG, "param is null");
        return false;
    }

    public static Context getProtectedStorageContext(Context context) {
        if (context == null) {
            Logger.w(TAG, b.f9831a);
            return null;
        }
        return context.createDeviceProtectedStorageContext();
    }

    public static Object getSystemService(Context context, String str) {
        if (context == null) {
            Logger.w(TAG, b.f9831a);
            return null;
        }
        try {
            return context.getSystemService(str);
        } catch (RuntimeException e10) {
            Logger.e(TAG, "SystemServer error:", e10);
            return null;
        }
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (context == null) {
            Logger.w(TAG, b.f9831a);
            return null;
        }
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (RuntimeException e10) {
            Logger.e(TAG, "dealType rethrowFromSystemServer:", e10);
            return null;
        }
    }

    public static ComponentName startService(Context context, Intent intent) {
        if (context == null) {
            Logger.w(TAG, b.f9831a);
            return null;
        }
        try {
            return context.startService(intent);
        } catch (RuntimeException e10) {
            Logger.e(TAG, "SystemServer error:", e10);
            return null;
        }
    }

    public static void unregisterReceiver(Context context, BroadcastReceiver broadcastReceiver) {
        if (context == null) {
            Logger.w(TAG, b.f9831a);
            return;
        }
        try {
            context.unregisterReceiver(broadcastReceiver);
        } catch (RuntimeException e10) {
            Logger.e(TAG, "SystemServer error:", e10);
        }
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler) {
        if (context == null) {
            Logger.w(TAG, b.f9831a);
            return null;
        }
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler);
        } catch (RuntimeException e10) {
            Logger.e(TAG, "dealType rethrowFromSystemServer:", e10);
            return null;
        }
    }
}
