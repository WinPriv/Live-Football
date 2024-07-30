package com.applovin.exoplayer2.a;

import com.applovin.exoplayer2.a.b;
import com.applovin.exoplayer2.an;
import com.applovin.exoplayer2.l.p;
import d6.o;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements p.a, o.a {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f12985s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f12986t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f12987u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f12988v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f12989w;

    public /* synthetic */ p(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f12985s = i11;
        this.f12987u = obj;
        this.f12986t = i10;
        this.f12988v = obj2;
        this.f12989w = obj3;
    }

    @Override // com.applovin.exoplayer2.l.p.a
    public final void invoke(Object obj) {
        int i10 = this.f12985s;
        int i11 = this.f12986t;
        switch (i10) {
            case 0:
                a.a((b.a) this.f12987u, i11, (an.e) this.f12988v, (an.e) this.f12989w, (b) obj);
                return;
            default:
                l4.b bVar = (l4.b) obj;
                bVar.getClass();
                bVar.onPositionDiscontinuity(i11);
                return;
        }
    }
}
