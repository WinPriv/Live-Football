package com.applovin.exoplayer2.l;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private static int f16325a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f16326b = true;

    public static void a(String str, String str2) {
        if (f16325a == 0) {
            Log.d(str, str2);
        }
    }

    public static void b(String str, String str2) {
        if (f16325a <= 1) {
            Log.i(str, str2);
        }
    }

    public static void c(String str, String str2) {
        if (f16325a <= 2) {
            Log.w(str, str2);
        }
    }

    public static void d(String str, String str2) {
        if (f16325a <= 3) {
            Log.e(str, str2);
        }
    }

    public static void a(String str, String str2, Throwable th) {
        b(str, a(str2, th));
    }

    public static void b(String str, String str2, Throwable th) {
        c(str, a(str2, th));
    }

    public static void c(String str, String str2, Throwable th) {
        d(str, a(str2, th));
    }

    public static String a(Throwable th) {
        if (th == null) {
            return null;
        }
        if (b(th)) {
            return "UnknownHostException (no network)";
        }
        if (!f16326b) {
            return th.getMessage();
        }
        return Log.getStackTraceString(th).trim().replace("\t", "    ");
    }

    private static boolean b(Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    private static String a(String str, Throwable th) {
        String a10 = a(th);
        if (TextUtils.isEmpty(a10)) {
            return str;
        }
        StringBuilder l10 = com.ironsource.adapters.facebook.a.l(str, "\n  ");
        l10.append(a10.replace("\n", "\n  "));
        l10.append('\n');
        return l10.toString();
    }
}
