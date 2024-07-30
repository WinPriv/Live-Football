package com.anythink.expressad.exoplayer.k;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@SuppressLint({"InlinedApi"})
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final int f9114a = -1000;

    /* renamed from: b, reason: collision with root package name */
    public static final int f9115b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f9116c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f9117d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f9118e = 3;
    public static final int f = 4;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface a {
    }

    private q() {
    }

    private static void a(Context context, String str, int i10, int i11) {
        if (af.f8993a >= 26) {
            ((NotificationManager) context.getSystemService("notification")).createNotificationChannel(new NotificationChannel(str, context.getString(i10), i11));
        }
    }

    private static void a(Context context, int i10, Notification notification) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notification != null) {
            notificationManager.notify(i10, notification);
        } else {
            notificationManager.cancel(i10);
        }
    }
}
