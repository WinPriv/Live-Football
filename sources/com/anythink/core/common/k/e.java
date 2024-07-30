package com.anythink.core.common.k;

import android.util.Log;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f6169a = false;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f6170b = false;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f6171c = false;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f6172d = false;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f6173e = false;
    private static boolean f = false;

    /* renamed from: g, reason: collision with root package name */
    private static boolean f6174g = false;

    /* renamed from: h, reason: collision with root package name */
    private static boolean f6175h = false;

    private e() {
    }

    private static void a(String str, String str2) {
        if (f6171c) {
            Log.v(str, str2);
        }
    }

    private static void b(String str, String str2) {
        if (f6172d) {
            Log.d(str, str2);
        }
    }

    private static void c(String str, String str2) {
        if (f6173e) {
            Log.i(str, str2);
        }
    }

    private static void d(String str, String str2) {
        if (f) {
            Log.w(str, str2);
        }
    }

    private static void e(String str, String str2) {
        if (f6174g) {
            Log.e(str, str2);
        }
    }

    private static void a(String str, String str2, Throwable th) {
        if (f6171c) {
            Log.v(str, str2, th);
        }
    }

    private static void b(String str, String str2, Throwable th) {
        if (f6172d) {
            Log.d(str, str2, th);
        }
    }

    private static void c(String str, String str2, Throwable th) {
        if (f6173e) {
            Log.i(str, str2, th);
        }
    }

    private static void d(String str, String str2, Throwable th) {
        if (f) {
            Log.w(str, str2, th);
        }
    }

    private static void e(String str, String str2, Throwable th) {
        if (f6174g) {
            Log.e(str, str2, th);
        }
    }

    private static void a(String str, Throwable th) {
        if (f) {
            Log.w(str, th);
        }
    }
}
