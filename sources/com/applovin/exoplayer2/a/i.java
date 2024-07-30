package com.applovin.exoplayer2.a;

import com.applovin.exoplayer2.a.b;
import com.applovin.exoplayer2.l.p;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements p.a {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f12964s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b.a f12965t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f12966u;

    public /* synthetic */ i(b.a aVar, boolean z10, int i10) {
        this.f12964s = i10;
        this.f12965t = aVar;
        this.f12966u = z10;
    }

    @Override // com.applovin.exoplayer2.l.p.a
    public final void invoke(Object obj) {
        int i10 = this.f12964s;
        b.a aVar = this.f12965t;
        boolean z10 = this.f12966u;
        switch (i10) {
            case 0:
                ((b) obj).e(aVar, z10);
                return;
            default:
                a.c(aVar, z10, (b) obj);
                return;
        }
    }
}
