package com.applovin.exoplayer2.i;

import com.applovin.exoplayer2.c.i;

/* loaded from: classes.dex */
final class e extends k {

    /* renamed from: c, reason: collision with root package name */
    private final i.a<k> f15698c;

    public e(i.a<k> aVar) {
        this.f15698c = aVar;
    }

    @Override // com.applovin.exoplayer2.c.i
    public final void f() {
        this.f15698c.releaseOutputBuffer(this);
    }
}
