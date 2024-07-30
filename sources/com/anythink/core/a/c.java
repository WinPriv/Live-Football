package com.anythink.core.a;

import a3.l;
import android.content.Context;
import com.anythink.core.c.d;
import com.anythink.core.common.b.g;
import com.anythink.core.common.b.n;
import com.anythink.core.common.e.ai;
import com.anythink.core.common.k.p;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static c f4512a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4513b = "pacing_";

    public static c a() {
        if (f4512a == null) {
            f4512a = new c();
        }
        return f4512a;
    }

    public static void a(String str) {
        try {
            p.a(n.a().g(), g.o, "pacing_".concat(String.valueOf(str)), System.currentTimeMillis());
        } catch (Exception unused) {
        }
    }

    public static boolean a(String str, d dVar) {
        if (dVar == null) {
            return true;
        }
        if (dVar.ad() == -1) {
            return false;
        }
        long longValue = p.a(n.a().g(), g.o, "pacing_".concat(String.valueOf(str)), (Long) 0L).longValue();
        if (System.currentTimeMillis() - longValue >= 0) {
            return System.currentTimeMillis() - longValue < dVar.ad();
        }
        a(str);
        return false;
    }

    public final void a(final String str, final String str2) {
        com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.core.a.c.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    p.a(n.a().g(), g.o, "pacing_" + str + "_" + str2, System.currentTimeMillis());
                } catch (Exception unused) {
                }
            }
        });
    }

    public final boolean a(String str, ai aiVar) {
        if (aiVar == null) {
            return true;
        }
        if (aiVar.s() == -1) {
            return false;
        }
        Context g6 = n.a().g();
        StringBuilder s10 = l.s("pacing_", str, "_");
        s10.append(aiVar.t());
        long longValue = p.a(g6, g.o, s10.toString(), (Long) 0L).longValue();
        if (System.currentTimeMillis() - longValue >= 0) {
            return System.currentTimeMillis() - longValue < aiVar.s();
        }
        a(str, aiVar.t());
        return false;
    }
}
