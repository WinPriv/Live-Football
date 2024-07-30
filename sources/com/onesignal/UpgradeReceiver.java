package com.onesignal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* loaded from: classes2.dex */
public class UpgradeReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT == 24) {
            return;
        }
        OSNotificationRestoreWorkManager.a(context, true);
    }
}
