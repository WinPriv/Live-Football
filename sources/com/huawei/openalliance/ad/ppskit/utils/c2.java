package com.huawei.openalliance.ad.ppskit.utils;

import java.util.concurrent.ConcurrentHashMap;
import ka.n7;

/* loaded from: classes2.dex */
public abstract class c2 {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f22829a = new ConcurrentHashMap();

    public static boolean a(String str) {
        return b(str, 60000L);
    }

    public static boolean b(String str, long j10) {
        boolean z10;
        ConcurrentHashMap concurrentHashMap = f22829a;
        Long l10 = (Long) concurrentHashMap.get(str);
        long currentTimeMillis = System.currentTimeMillis();
        if (l10 != null) {
            if (currentTimeMillis - l10.longValue() > j10) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                if (n7.d()) {
                    n7.c("TimeIntervalControl", "tag: %s isExpired %s", str, Boolean.valueOf(z10));
                }
                return z10;
            }
        } else {
            z10 = true;
        }
        if (n7.d()) {
            n7.c("TimeIntervalControl", "tag: %s isExpired %s", str, Boolean.valueOf(z10));
        }
        concurrentHashMap.put(str, Long.valueOf(currentTimeMillis));
        return z10;
    }
}
