package com.onesignal;

import android.content.Context;
import android.service.notification.StatusBarNotification;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: NotificationLimitManager.java */
/* loaded from: classes2.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f26840a = Integer.toString(49);

    public static void a(int i10, Context context) throws Throwable {
        boolean z10;
        StatusBarNotification[] a10 = q3.a(context);
        int length = (a10.length - 49) + i10;
        if (length < 1) {
            return;
        }
        TreeMap treeMap = new TreeMap();
        for (StatusBarNotification statusBarNotification : a10) {
            if ((statusBarNotification.getNotification().flags & 512) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                treeMap.put(Long.valueOf(statusBarNotification.getNotification().when), Integer.valueOf(statusBarNotification.getId()));
            }
        }
        Iterator it = treeMap.entrySet().iterator();
        while (it.hasNext()) {
            e3.J(((Integer) ((Map.Entry) it.next()).getValue()).intValue());
            length--;
            if (length <= 0) {
                return;
            }
        }
    }
}
