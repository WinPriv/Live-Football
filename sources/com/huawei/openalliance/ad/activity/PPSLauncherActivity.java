package com.huawei.openalliance.ad.activity;

import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.huawei.hms.ads.ex;
import com.huawei.openalliance.ad.constant.w;
import j7.r;

/* loaded from: classes2.dex */
public class PPSLauncherActivity extends c {
    public static boolean a(Context context) {
        ComponentName componentName;
        ComponentName componentName2;
        int i10;
        for (ActivityManager.RunningTaskInfo runningTaskInfo : ((ActivityManager) context.getSystemService("activity")).getRunningTasks(10)) {
            componentName = runningTaskInfo.topActivity;
            if (componentName.getClassName().equalsIgnoreCase(PPSLauncherActivity.class.getName())) {
                i10 = runningTaskInfo.numActivities;
                if (i10 < 2) {
                    return false;
                }
            }
            componentName2 = runningTaskInfo.topActivity;
            if (componentName2.getPackageName().equals(context.getPackageName())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.huawei.openalliance.ad.activity.c, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Intent launchIntentForPackage;
        ClipData clipData;
        try {
            super.onCreate(bundle);
            if (a(this)) {
                ex.V("PPSLauncherActivity", "app is active.");
                launchIntentForPackage = new Intent();
                launchIntentForPackage.setComponent(new ComponentName(getPackageName(), PPSBridgeActivity.class.getName()));
                launchIntentForPackage.setFlags(268435456);
                clipData = w.cH;
            } else {
                ex.V("PPSLauncherActivity", " app is not active. start launch app");
                launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
                clipData = w.cH;
            }
            launchIntentForPackage.setClipData(clipData);
            startActivity(launchIntentForPackage);
            r.f(this, "69", null, null, null);
        } finally {
            try {
                finish();
            } catch (Throwable th) {
            }
        }
        try {
            finish();
        } catch (Throwable th2) {
            ex.V("PPSLauncherActivity", "finish activity error:".concat(th2.getClass().getName()));
        }
    }
}
