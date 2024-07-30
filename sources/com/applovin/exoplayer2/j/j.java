package com.applovin.exoplayer2.j;

import com.applovin.exoplayer2.as;
import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.h.ad;
import com.applovin.exoplayer2.h.p;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    private a f16019a;

    /* renamed from: b, reason: collision with root package name */
    private com.applovin.exoplayer2.k.d f16020b;

    /* loaded from: classes.dex */
    public interface a {
    }

    public abstract k a(as[] asVarArr, ad adVar, p.a aVar, ba baVar) throws com.applovin.exoplayer2.p;

    public abstract void a(Object obj);

    public boolean a() {
        return false;
    }

    public final com.applovin.exoplayer2.k.d d() {
        return (com.applovin.exoplayer2.k.d) com.applovin.exoplayer2.l.a.b(this.f16020b);
    }

    public final void a(a aVar, com.applovin.exoplayer2.k.d dVar) {
        this.f16019a = aVar;
        this.f16020b = dVar;
    }
}
