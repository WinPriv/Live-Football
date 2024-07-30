package com.applovin.exoplayer2.a;

import com.applovin.exoplayer2.a.b;
import com.applovin.exoplayer2.l.p;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements p.a {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f12926s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b.a f12927t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ com.applovin.exoplayer2.c.e f12928u;

    public /* synthetic */ b0(b.a aVar, int i10, com.applovin.exoplayer2.c.e eVar) {
        this.f12926s = i10;
        this.f12927t = aVar;
        this.f12928u = eVar;
    }

    @Override // com.applovin.exoplayer2.l.p.a
    public final void invoke(Object obj) {
        int i10 = this.f12926s;
        b.a aVar = this.f12927t;
        com.applovin.exoplayer2.c.e eVar = this.f12928u;
        switch (i10) {
            case 0:
                a.a(aVar, eVar, (b) obj);
                return;
            case 1:
                a.d(aVar, eVar, (b) obj);
                return;
            default:
                a.c(aVar, eVar, (b) obj);
                return;
        }
    }
}
