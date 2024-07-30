package com.anythink.expressad.foundation.h;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f10173a = true;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f10174b = true;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f10175c = true;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f10176d = true;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f10177e = true;
    public static boolean f = false;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f10178g = true;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f10179h = false;

    /* renamed from: i, reason: collision with root package name */
    private static final String f10180i = "anythink_";

    static {
        if (!com.anythink.expressad.a.f6552a) {
            f10173a = false;
            f10174b = false;
            f10175c = false;
            f10176d = false;
            f10177e = false;
            f = false;
            f10178g = false;
            f10179h = false;
        }
    }

    private o() {
    }

    public static void a(String str, String str2) {
        if (!f10174b || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.d(a(str), str2);
    }

    public static void b(String str, String str2) {
        if (!f10175c || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.i(a(str), str2);
    }

    private static void c(String str, String str2, Throwable th) {
        if (!f10173a || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.v(a(str), str2, th);
    }

    private static void d(String str, String str2, Throwable th) {
        if (!f10175c || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.i(a(str), str2, th);
    }

    private static void e(String str, String str2) {
        if (!f10173a || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.v(a(str), str2);
    }

    public static void a(String str, String str2, Throwable th) {
        if (!f10174b || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.d(a(str), str2, th);
    }

    public static void b(String str, String str2, Throwable th) {
        if (!f10177e || str2 == null) {
            return;
        }
        Log.e(a(str), str2, th);
    }

    public static void c(String str, String str2) {
        if (!f10176d || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.w(a(str), str2);
    }

    public static void d(String str, String str2) {
        if (!f10177e || str2 == null) {
            return;
        }
        Log.e(a(str), str2);
    }

    private static void e(String str, String str2, Throwable th) {
        if (!f10176d || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.w(a(str), str2, th);
    }

    private static void a(String str, Throwable th) {
        if (!f10176d || th == null) {
            return;
        }
        Log.w(a(str), th);
    }

    private static void a(Context context, String str) {
        if (f) {
            Toast.makeText(context, str, 1).show();
        }
    }

    private static String a(String str) {
        return !TextUtils.isEmpty(str) ? f10180i.concat(String.valueOf(str)) : str;
    }
}
