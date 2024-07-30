package com.anythink.expressad.exoplayer.h.b;

import com.anythink.expressad.exoplayer.j.k;
import com.anythink.expressad.exoplayer.m;

/* loaded from: classes.dex */
public abstract class a extends i {

    /* renamed from: a, reason: collision with root package name */
    public final long f8260a;

    /* renamed from: k, reason: collision with root package name */
    private b f8261k;

    /* renamed from: l, reason: collision with root package name */
    private int[] f8262l;

    public a(com.anythink.expressad.exoplayer.j.h hVar, k kVar, m mVar, int i10, Object obj, long j10, long j11, long j12, long j13) {
        super(hVar, kVar, mVar, i10, obj, j10, j11, j13);
        this.f8260a = j12;
    }

    public final void a(b bVar) {
        this.f8261k = bVar;
        this.f8262l = bVar.a();
    }

    public final b c() {
        return this.f8261k;
    }

    public final int a(int i10) {
        return this.f8262l[i10];
    }
}
