package com.ironsource.sdk.utils;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.sdk.g.d;

/* loaded from: classes2.dex */
public class Logger {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f26554a;

    public static void d(String str, String str2) {
        if (f26554a) {
            Log.d(str, str2);
        }
    }

    public static void e(String str, String str2) {
        if (f26554a) {
            Log.e(str, str2);
        }
    }

    public static void enableLogging(int i10) {
        boolean z10;
        if (d.EnumC0343d.MODE_0.f26508d != i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        f26554a = z10;
    }

    public static void i(String str, String str2) {
        if (f26554a) {
            Log.i(str, str2);
        }
    }

    public static void v(String str, String str2) {
        if (f26554a) {
            Log.v(str, str2);
        }
    }

    public static void w(String str, String str2) {
        if (f26554a) {
            Log.w(str, str2);
        }
    }

    public static void d(String str, String str2, Throwable th) {
        if (f26554a) {
            Log.d(str, str2, th);
        }
    }

    public static void e(String str, String str2, Throwable th) {
        if (f26554a) {
            Log.e(str, str2, th);
        }
    }

    public static void i(String str, String str2, Throwable th) {
        if (!f26554a || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.i(str, str2, th);
    }

    public static void v(String str, String str2, Throwable th) {
        if (f26554a) {
            Log.v(str, str2, th);
        }
    }

    public static void w(String str, String str2, Throwable th) {
        if (f26554a) {
            Log.w(str, str2, th);
        }
    }
}
