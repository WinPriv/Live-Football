package com.applovin.exoplayer2.d;

import com.applovin.exoplayer2.d.g;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public interface f {

    /* loaded from: classes.dex */
    public static class a extends IOException {

        /* renamed from: a, reason: collision with root package name */
        public final int f14029a;

        public a(Throwable th, int i10) {
            super(th);
            this.f14029a = i10;
        }
    }

    static void a(f fVar, f fVar2) {
        if (fVar == fVar2) {
            return;
        }
        if (fVar2 != null) {
            fVar2.a((g.a) null);
        }
        if (fVar != null) {
            fVar.b(null);
        }
    }

    void a(g.a aVar);

    boolean a(String str);

    void b(g.a aVar);

    int c();

    default boolean d() {
        return false;
    }

    a e();

    UUID f();

    com.applovin.exoplayer2.c.b g();

    Map<String, String> h();
}
