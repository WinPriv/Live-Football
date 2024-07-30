package com.huawei.hms.framework.common;

import android.app.ActivityManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.anythink.expressad.foundation.g.b.b;
import java.util.List;

/* loaded from: classes2.dex */
public class ActivityUtil {
    private static final String TAG = "ActivityUtil";

    public static PendingIntent getActivities(Context context, int i10, Intent[] intentArr, int i11) {
        if (context == null) {
            Logger.w(TAG, b.f9831a);
            return null;
        }
        try {
            return PendingIntent.getActivities(context, i10, intentArr, i11);
        } catch (RuntimeException e10) {
            Logger.e(TAG, "dealType rethrowFromSystemServer:", e10);
            return null;
        }
    }

    public static boolean isForeground(Context context) {
        ActivityManager activityManager;
        List<ActivityManager.RunningAppProcessInfo> list;
        if (context != null && (activityManager = (ActivityManager) ContextCompat.getSystemService(context, "activity")) != null) {
            try {
                list = activityManager.getRunningAppProcesses();
            } catch (RuntimeException e10) {
                Logger.w(TAG, "activityManager getRunningAppProcesses occur exception: ", e10);
                list = null;
            }
            if (list != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : list) {
                    String str = runningAppProcessInfo.processName;
                    if (str != null && str.equals(context.getPackageName()) && runningAppProcessInfo.importance == 100) {
                        Logger.v(TAG, "isForeground true");
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
