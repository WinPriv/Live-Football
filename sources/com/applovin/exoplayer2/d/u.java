package com.applovin.exoplayer2.d;

import android.util.Pair;
import java.util.Map;

/* loaded from: classes.dex */
public final class u {
    public static Pair<Long, Long> a(f fVar) {
        Map<String, String> h10 = fVar.h();
        if (h10 == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(a(h10, com.anythink.expressad.exoplayer.d.p.f7725a)), Long.valueOf(a(h10, com.anythink.expressad.exoplayer.d.p.f7726b)));
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
