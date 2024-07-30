package com.applovin.exoplayer2.a;

import com.applovin.exoplayer2.a.b;
import com.applovin.exoplayer2.l.p;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements p.a {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f13000s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b.a f13001t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f13002u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f13003v;

    public /* synthetic */ t(b.a aVar, boolean z10, int i10, int i11) {
        this.f13000s = i11;
        this.f13001t = aVar;
        this.f13002u = z10;
        this.f13003v = i10;
    }

    @Override // com.applovin.exoplayer2.l.p.a
    public final void invoke(Object obj) {
        int i10 = this.f13000s;
        boolean z10 = this.f13002u;
        b.a aVar = this.f13001t;
        int i11 = this.f13003v;
        switch (i10) {
            case 0:
                ((b) obj).b(aVar, z10, i11);
                return;
            default:
                ((b) obj).a(aVar, z10, i11);
                return;
        }
    }
}
