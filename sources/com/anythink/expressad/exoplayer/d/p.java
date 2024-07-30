package com.anythink.expressad.exoplayer.d;

import android.util.Pair;
import java.util.Map;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final String f7725a = "LicenseDurationRemaining";

    /* renamed from: b, reason: collision with root package name */
    public static final String f7726b = "PlaybackDurationRemaining";

    private p() {
    }

    public static Pair<Long, Long> a(f<?> fVar) {
        Map<String, String> h10 = fVar.h();
        if (h10 == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(a(h10, f7725a)), Long.valueOf(a(h10, f7726b)));
    }

    private static long a(Map<String, String> map, String str) {
        if (map == null) {
            return com.anythink.expressad.exoplayer.b.f7291b;
        }
        try {
            String str2 = map.get(str);
            return str2 != null ? Long.parseLong(str2) : com.anythink.expressad.exoplayer.b.f7291b;
        } catch (NumberFormatException unused) {
            return com.anythink.expressad.exoplayer.b.f7291b;
        }
    }
}
