package com.applovin.exoplayer2.m;

import android.view.Surface;

/* loaded from: classes.dex */
public class g extends com.applovin.exoplayer2.f.h {

    /* renamed from: c, reason: collision with root package name */
    public final int f16464c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f16465d;

    public g(Throwable th, com.applovin.exoplayer2.f.i iVar, Surface surface) {
        super(th, iVar);
        boolean z10;
        this.f16464c = System.identityHashCode(surface);
        if (surface != null && !surface.isValid()) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f16465d = z10;
    }
}
