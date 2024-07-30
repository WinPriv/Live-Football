package com.huawei.openalliance.ad.ppskit.utils;

import ka.n7;

/* loaded from: classes2.dex */
public final class f0 {

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f22843a = f0.a("ro.build.hw_emui_api_level");

        /* renamed from: b, reason: collision with root package name */
        public static final int f22844b = f0.a("ro.build.magic_api_level");
    }

    static {
        b("ro.build.version.emui");
    }

    public static int a(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Object invoke = cls.getDeclaredMethod("getInt", String.class, Integer.TYPE).invoke(cls, str, 0);
            if (invoke instanceof Integer) {
                return ((Integer) invoke).intValue();
            }
        } catch (Throwable unused) {
            n7.i("HwBuildEx", "An Throwable occurred while reading SystemProperties: ".concat(str));
        }
        return 0;
    }

    public static String b(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Object invoke = cls.getDeclaredMethod("get", String.class, String.class).invoke(cls, str, "");
            if (invoke instanceof String) {
                return (String) invoke;
            }
        } catch (Throwable unused) {
            n7.i("HwBuildEx", "An throwable occurred while reading SystemProperties: ".concat(str));
        }
        return "";
    }
}
