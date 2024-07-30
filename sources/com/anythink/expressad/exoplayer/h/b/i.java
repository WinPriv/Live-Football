package com.anythink.expressad.exoplayer.h.b;

import com.anythink.expressad.exoplayer.j.k;
import com.anythink.expressad.exoplayer.m;

/* loaded from: classes.dex */
public abstract class i extends c {

    /* renamed from: j, reason: collision with root package name */
    public final long f8317j;

    public i(com.anythink.expressad.exoplayer.j.h hVar, k kVar, m mVar, int i10, Object obj, long j10, long j11, long j12) {
        super(hVar, kVar, mVar, i10, obj, j10, j11);
        com.anythink.expressad.exoplayer.k.a.a(mVar);
        this.f8317j = j12;
    }

    public long e() {
        long j10 = this.f8317j;
        if (j10 == -1) {
            return -1L;
        }
        return j10 + 1;
    }

    public abstract boolean f();
}
