package com.anythink.expressad.foundation.h;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final String f10222a = "H+tU+FeXHM==";

    /* renamed from: b, reason: collision with root package name */
    public static final String f10223b = "cv";

    /* renamed from: c, reason: collision with root package name */
    private static final String f10224c = "anythink_share_date";

    private static void a() {
        SharedPreferences.Editor edit = com.anythink.expressad.foundation.b.a.b().d().getApplicationContext().getSharedPreferences(f10223b, 0).edit();
        edit.clear();
        edit.commit();
    }

    public static Object b(Context context, String str, Object obj) {
        String str2;
        if (context == null) {
            return obj;
        }
        if (obj != null) {
            str2 = obj.getClass().getSimpleName();
        } else {
            str2 = "";
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(f10224c, 0);
        if ("String".equals(str2)) {
            return sharedPreferences.getString(str, (String) obj);
        }
        if ("Integer".equals(str2)) {
            return Integer.valueOf(sharedPreferences.getInt(str, ((Integer) obj).intValue()));
        }
        if ("Boolean".equals(str2)) {
            return Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) obj).booleanValue()));
        }
        if ("Float".equals(str2)) {
            return Float.valueOf(sharedPreferences.getFloat(str, ((Float) obj).floatValue()));
        }
        if ("Long".equals(str2)) {
            return Long.valueOf(sharedPreferences.getLong(str, ((Long) obj).longValue()));
        }
        return obj;
    }

    private static void c(Context context, String str, Object obj) {
        String simpleName = obj.getClass().getSimpleName();
        SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences(f10223b, 0).edit();
        if ("String".equals(simpleName)) {
            edit.putString(str, (String) obj);
        } else if ("Integer".equals(simpleName)) {
            edit.putInt(str, ((Integer) obj).intValue());
        } else if ("Boolean".equals(simpleName)) {
            edit.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if ("Float".equals(simpleName)) {
            edit.putFloat(str, ((Float) obj).floatValue());
        } else if ("Long".equals(simpleName)) {
            edit.putLong(str, ((Long) obj).longValue());
        }
        edit.apply();
    }

    private static Object d(Context context, String str, Object obj) {
        String str2;
        if (obj != null) {
            str2 = obj.getClass().getSimpleName();
        } else {
            str2 = "";
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(f10223b, 0);
        if ("String".equals(str2)) {
            return sharedPreferences.getString(str, (String) obj);
        }
        if ("Integer".equals(str2)) {
            return Integer.valueOf(sharedPreferences.getInt(str, ((Integer) obj).intValue()));
        }
        if ("Boolean".equals(str2)) {
            return Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) obj).booleanValue()));
        }
        if ("Float".equals(str2)) {
            return Float.valueOf(sharedPreferences.getFloat(str, ((Float) obj).floatValue()));
        }
        if ("Long".equals(str2)) {
            return Long.valueOf(sharedPreferences.getLong(str, ((Long) obj).longValue()));
        }
        return obj;
    }

    private static void a(String str) {
        SharedPreferences.Editor edit = com.anythink.expressad.foundation.b.a.b().d().getApplicationContext().getSharedPreferences(f10223b, 0).edit();
        edit.remove(str);
        edit.apply();
    }

    public static void a(Context context, String str, Object obj) {
        String simpleName = obj.getClass().getSimpleName();
        if (context == null) {
            return;
        }
        SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences(f10224c, 0).edit();
        if ("String".equals(simpleName)) {
            edit.putString(str, (String) obj);
        } else if ("Integer".equals(simpleName)) {
            edit.putInt(str, ((Integer) obj).intValue());
        } else if ("Boolean".equals(simpleName)) {
            edit.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if ("Float".equals(simpleName)) {
            edit.putFloat(str, ((Float) obj).floatValue());
        } else if ("Long".equals(simpleName)) {
            edit.putLong(str, ((Long) obj).longValue());
        }
        edit.apply();
    }

    private static void a(Context context, String str) {
        SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences(f10224c, 0).edit();
        edit.remove(str);
        edit.apply();
    }

    private static void a(Context context, String... strArr) {
        SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences(f10224c, 0).edit();
        for (String str : strArr) {
            edit.remove(str);
        }
        edit.apply();
    }
}
