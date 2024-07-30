package com.anythink.core.common.k;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;

/* loaded from: classes.dex */
public final class p {
    public static void a(Context context, String str, String str2) {
        if (context == null) {
            return;
        }
        try {
            context.getSharedPreferences(str, 0).edit().remove(str2).apply();
        } catch (Error | Exception unused) {
        }
    }

    private static void b(Context context, String str) {
        if (context == null) {
            return;
        }
        try {
            context.getSharedPreferences(str, 0).edit().clear().apply();
        } catch (Error | Exception unused) {
        }
    }

    public static void a(Context context, String str, String str2, long j10) {
        if (context == null) {
            return;
        }
        try {
            SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
            edit.putLong(str2, j10);
            edit.apply();
        } catch (Error | Exception unused) {
        }
    }

    public static int b(Context context, String str, String str2, int i10) {
        if (context == null) {
            return i10;
        }
        try {
            return context.getSharedPreferences(str, 0).getInt(str2, i10);
        } catch (Error | Exception unused) {
            return i10;
        }
    }

    public static String b(Context context, String str, String str2, String str3) {
        if (context == null) {
            return null;
        }
        try {
            return context.getSharedPreferences(str, 0).getString(str2, str3);
        } catch (Error | Exception unused) {
            return str3;
        }
    }

    public static void a(Context context, String str, String str2, String str3) {
        if (context == null) {
            return;
        }
        try {
            SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
            edit.putString(str2, String.valueOf(str3));
            edit.apply();
        } catch (Error | Exception unused) {
        }
    }

    private static boolean b(Context context, String str, String str2, boolean z10) {
        if (context == null) {
            return z10;
        }
        try {
            return context.getSharedPreferences(str, 0).getBoolean(str2, z10);
        } catch (Exception unused) {
            return z10;
        }
    }

    public static void a(Context context, String str, String str2, int i10) {
        if (context == null) {
            return;
        }
        try {
            SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
            edit.putInt(str2, i10);
            edit.apply();
        } catch (Error | Exception unused) {
        }
    }

    public static Long a(Context context, String str, String str2, Long l10) {
        if (context == null) {
            return 0L;
        }
        try {
            return Long.valueOf(context.getSharedPreferences(str, 0).getLong(str2, l10.longValue()));
        } catch (Error | Exception unused) {
            return l10;
        }
    }

    public static Map<String, ?> a(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            return context.getSharedPreferences(str, 0).getAll();
        } catch (Error | Exception unused) {
            return null;
        }
    }

    private static void a(Context context, String str, String str2, boolean z10) {
        if (context == null) {
            return;
        }
        try {
            SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
            edit.putBoolean(str2, z10);
            edit.apply();
        } catch (Exception unused) {
        }
    }
}
