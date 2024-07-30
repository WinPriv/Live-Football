package com.onesignal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;

/* compiled from: BadgeCountUpdater.java */
/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static int f26839a = -1;

    public static boolean a(Context context) {
        int i10;
        int i11 = f26839a;
        if (i11 != -1) {
            if (i11 != 1) {
                return false;
            }
            return true;
        }
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle != null) {
                if ("DISABLE".equals(bundle.getString("com.onesignal.BadgeCount"))) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                f26839a = i10;
            } else {
                f26839a = 1;
            }
        } catch (PackageManager.NameNotFoundException e10) {
            f26839a = 0;
            e3.b(3, "Error reading meta-data tag 'com.onesignal.BadgeCount'. Disabling badge setting.", e10);
        }
        if (f26839a != 1) {
            return false;
        }
        return true;
    }

    public static void b(Context context) {
        boolean z10;
        boolean z11;
        if (a(context) && OSUtils.a()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        int i10 = 0;
        for (StatusBarNotification statusBarNotification : q3.a(context)) {
            String str = h0.f26840a;
            if ((statusBarNotification.getNotification().flags & 512) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                i10++;
            }
        }
        if (a(context)) {
            try {
                fc.c.a(i10, context);
            } catch (fc.b unused) {
            }
        }
    }
}
