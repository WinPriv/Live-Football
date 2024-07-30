package com.applovin.exoplayer2.a;

import com.applovin.exoplayer2.a.b;
import com.applovin.exoplayer2.l.p;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements p.a {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f12944s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b.a f12945t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Exception f12946u;

    public /* synthetic */ e0(b.a aVar, Exception exc, int i10) {
        this.f12944s = i10;
        this.f12945t = aVar;
        this.f12946u = exc;
    }

    @Override // com.applovin.exoplayer2.l.p.a
    public final void invoke(Object obj) {
        int i10 = this.f12944s;
        b.a aVar = this.f12945t;
        Exception exc = this.f12946u;
        switch (i10) {
            case 0:
                a.o(aVar, exc, (b) obj);
                return;
            default:
                a.T(aVar, exc, (b) obj);
                return;
        }
    }
}
