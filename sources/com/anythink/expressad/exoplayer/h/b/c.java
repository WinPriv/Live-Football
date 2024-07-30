package com.anythink.expressad.exoplayer.h.b;

import com.anythink.expressad.exoplayer.j.k;
import com.anythink.expressad.exoplayer.j.t;
import com.anythink.expressad.exoplayer.m;

/* loaded from: classes.dex */
public abstract class c implements t.c {

    /* renamed from: b, reason: collision with root package name */
    public final k f8266b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8267c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final m f8268d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8269e;
    public final Object f;

    /* renamed from: g, reason: collision with root package name */
    public final long f8270g;

    /* renamed from: h, reason: collision with root package name */
    public final long f8271h;

    /* renamed from: i, reason: collision with root package name */
    protected final com.anythink.expressad.exoplayer.j.h f8272i;

    public c(com.anythink.expressad.exoplayer.j.h hVar, k kVar, m mVar, int i10, Object obj, long j10, long j11) {
        this.f8272i = (com.anythink.expressad.exoplayer.j.h) com.anythink.expressad.exoplayer.k.a.a(hVar);
        this.f8266b = (k) com.anythink.expressad.exoplayer.k.a.a(kVar);
        this.f8268d = mVar;
        this.f8269e = i10;
        this.f = obj;
        this.f8270g = j10;
        this.f8271h = j11;
    }

    private long c() {
        return this.f8271h - this.f8270g;
    }

    public abstract long d();
}
