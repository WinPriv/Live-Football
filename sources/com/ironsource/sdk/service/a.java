package com.ironsource.sdk.service;

import java.util.HashMap;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f26546a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap<String, Long> f26547b = new HashMap<>();

    private a() {
    }

    public static long a(String str) {
        zc.d.d(str, "instance");
        Long l10 = f26547b.get(str);
        if (l10 == null) {
            return -1L;
        }
        return l10.longValue();
    }

    public static boolean b(String str) {
        zc.d.d(str, "instance");
        HashMap<String, Long> hashMap = f26547b;
        if (hashMap.get(str) != null) {
            hashMap.remove(str);
            return true;
        }
        return false;
    }

    public static long c(String str) {
        zc.d.d(str, "instance");
        Long l10 = f26547b.get(str);
        if (l10 == null) {
            return -1L;
        }
        return System.currentTimeMillis() - l10.longValue();
    }

    public static boolean a(String str, long j10) {
        zc.d.d(str, "instance");
        if (!(str.length() == 0)) {
            HashMap<String, Long> hashMap = f26547b;
            if (!hashMap.containsKey(str)) {
                hashMap.put(str, Long.valueOf(j10));
                return true;
            }
        }
        return false;
    }
}
