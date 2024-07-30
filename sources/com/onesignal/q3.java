package com.onesignal;

import android.app.NotificationManager;
import android.content.Context;
import android.database.Cursor;
import android.service.notification.StatusBarNotification;

/* compiled from: OneSignalNotificationManager.java */
/* loaded from: classes2.dex */
public final class q3 {
    public static StatusBarNotification[] a(Context context) {
        StatusBarNotification[] statusBarNotificationArr = new StatusBarNotification[0];
        try {
            return ((NotificationManager) context.getSystemService("notification")).getActiveNotifications();
        } catch (Throwable unused) {
            return statusBarNotificationArr;
        }
    }

    public static Integer b(p3 p3Var, String str, boolean z10) {
        String str2;
        String[] strArr;
        if (z10) {
            str2 = "group_id IS NULL";
        } else {
            str2 = "group_id = ?";
        }
        String concat = str2.concat(" AND dismissed = 0 AND opened = 0 AND is_summary = 0");
        if (z10) {
            strArr = null;
        } else {
            strArr = new String[]{str};
        }
        Cursor j10 = p3Var.j("notification", null, concat, strArr, "created_time DESC", "1");
        if (!j10.moveToFirst()) {
            j10.close();
            return null;
        }
        Integer valueOf = Integer.valueOf(j10.getInt(j10.getColumnIndex("android_notification_id")));
        j10.close();
        return valueOf;
    }
}
