package com.applovin.exoplayer2.a;

import com.applovin.exoplayer2.a.b;
import com.applovin.exoplayer2.l.p;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements p.a {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f12971s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b.a f12972t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f12973u;

    public /* synthetic */ k(b.a aVar, boolean z10, int i10) {
        this.f12971s = i10;
        this.f12972t = aVar;
        this.f12973u = z10;
    }

    @Override // com.applovin.exoplayer2.l.p.a
    public final void invoke(Object obj) {
        int i10 = this.f12971s;
        b.a aVar = this.f12972t;
        boolean z10 = this.f12973u;
        switch (i10) {
            case 0:
                ((b) obj).b(aVar, z10);
                return;
            default:
                ((b) obj).a(aVar, z10);
                return;
        }
    }
}
