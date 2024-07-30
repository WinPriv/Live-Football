package com.applovin.exoplayer2.m;

import com.applovin.exoplayer2.c.i;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class j extends com.applovin.exoplayer2.c.i {

    /* renamed from: c, reason: collision with root package name */
    public int f16508c;

    /* renamed from: d, reason: collision with root package name */
    public int f16509d;

    /* renamed from: e, reason: collision with root package name */
    public ByteBuffer[] f16510e;
    public int[] f;

    /* renamed from: g, reason: collision with root package name */
    public int f16511g;

    /* renamed from: h, reason: collision with root package name */
    private final i.a<j> f16512h;

    @Override // com.applovin.exoplayer2.c.i
    public void f() {
        this.f16512h.releaseOutputBuffer(this);
    }
}
