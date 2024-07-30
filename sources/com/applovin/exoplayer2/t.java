package com.applovin.exoplayer2;

import android.os.Build;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final String f16669a = a3.l.p(new StringBuilder("ExoPlayerLib/2.15.1 (Linux; Android "), Build.VERSION.RELEASE, ") ExoPlayerLib/2.15.1");

    /* renamed from: b, reason: collision with root package name */
    private static final HashSet<String> f16670b = new HashSet<>();

    /* renamed from: c, reason: collision with root package name */
    private static String f16671c = "goog.exo.core";

    public static synchronized String a() {
        String str;
        synchronized (t.class) {
            str = f16671c;
        }
        return str;
    }

    public static synchronized void a(String str) {
        synchronized (t.class) {
            if (f16670b.add(str)) {
                f16671c += ", " + str;
            }
        }
    }
}
