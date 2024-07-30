package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.e;
import java.io.IOException;
import java.util.UUID;

/* compiled from: DrmSession.java */
/* loaded from: classes2.dex */
public interface d {

    /* compiled from: DrmSession.java */
    /* loaded from: classes2.dex */
    public static class a extends IOException {

        /* renamed from: s, reason: collision with root package name */
        public final int f19976s;

        public a(Throwable th, int i10) {
            super(th);
            this.f19976s = i10;
        }
    }

    static void c(d dVar, d dVar2) {
        if (dVar == dVar2) {
            return;
        }
        if (dVar2 != null) {
            dVar2.a(null);
        }
        if (dVar != null) {
            dVar.b(null);
        }
    }

    void a(e.a aVar);

    void b(e.a aVar);

    UUID d();

    default boolean e() {
        return false;
    }

    boolean f(String str);

    n4.b g();

    a getError();

    int getState();
}
