package com.anythink.expressad.exoplayer;

import java.util.HashSet;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final String f9157a = "ExoPlayer";

    /* renamed from: b, reason: collision with root package name */
    public static final String f9158b = "2.8.4";

    /* renamed from: c, reason: collision with root package name */
    public static final String f9159c = "ExoPlayerLib/2.8.4";

    /* renamed from: d, reason: collision with root package name */
    public static final int f9160d = 2008004;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f9161e = true;
    public static final boolean f = true;

    /* renamed from: g, reason: collision with root package name */
    private static final HashSet<String> f9162g = new HashSet<>();

    /* renamed from: h, reason: collision with root package name */
    private static String f9163h = "goog.exo.core";

    private l() {
    }

    public static synchronized String a() {
        String str;
        synchronized (l.class) {
            str = f9163h;
        }
        return str;
    }

    private static synchronized void a(String str) {
        synchronized (l.class) {
            if (f9162g.add(str)) {
                f9163h += ", " + str;
            }
        }
    }
}
