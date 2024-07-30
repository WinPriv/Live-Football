package com.applovin.exoplayer2.a;

import com.applovin.exoplayer2.a.b;
import com.applovin.exoplayer2.l.p;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements p.a {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f12957s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b.a f12958t;

    public /* synthetic */ g0(b.a aVar, int i10) {
        this.f12957s = i10;
        this.f12958t = aVar;
    }

    @Override // com.applovin.exoplayer2.l.p.a
    public final void invoke(Object obj) {
        int i10 = this.f12957s;
        b.a aVar = this.f12958t;
        switch (i10) {
            case 0:
                ((b) obj).h(aVar);
                return;
            case 1:
                ((b) obj).b(aVar);
                return;
            default:
                ((b) obj).g(aVar);
                return;
        }
    }
}
