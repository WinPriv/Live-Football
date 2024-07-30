package com.applovin.exoplayer2.a;

import com.applovin.exoplayer2.a.b;
import com.applovin.exoplayer2.l.p;
import d6.o;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements p.a, o.a {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f13007s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f13008t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f13009u;

    public /* synthetic */ v(int i10, int i11, Object obj) {
        this.f13007s = i11;
        this.f13008t = obj;
        this.f13009u = i10;
    }

    @Override // com.applovin.exoplayer2.l.p.a
    public final void invoke(Object obj) {
        int i10 = this.f13007s;
        int i11 = this.f13009u;
        Object obj2 = this.f13008t;
        switch (i10) {
            case 0:
                ((b) obj).c((b.a) obj2, i11);
                return;
            case 1:
                a.a((b.a) obj2, i11, (b) obj);
                return;
            default:
                ((l4.b) obj).getClass();
                return;
        }
    }
}
