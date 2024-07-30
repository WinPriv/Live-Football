package com.applovin.exoplayer2.a;

import com.applovin.exoplayer2.a.b;
import com.applovin.exoplayer2.l.p;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements p.a {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f12939s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b.a f12940t;

    public /* synthetic */ d0(b.a aVar, int i10) {
        this.f12939s = i10;
        this.f12940t = aVar;
    }

    @Override // com.applovin.exoplayer2.l.p.a
    public final void invoke(Object obj) {
        int i10 = this.f12939s;
        b.a aVar = this.f12940t;
        switch (i10) {
            case 0:
                a.h(aVar, (b) obj);
                return;
            default:
                a.m(aVar, (b) obj);
                return;
        }
    }
}
