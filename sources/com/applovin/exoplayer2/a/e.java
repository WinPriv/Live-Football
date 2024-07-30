package com.applovin.exoplayer2.a;

import com.applovin.exoplayer2.a.b;
import com.applovin.exoplayer2.l.p;
import d6.o;
import k4.c1;
import k4.e1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements p.a, o.a {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f12941s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f12942t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f12943u;

    public /* synthetic */ e(int i10, int i11, Object obj) {
        this.f12941s = i11;
        this.f12943u = obj;
        this.f12942t = i10;
    }

    @Override // com.applovin.exoplayer2.l.p.a
    public final void invoke(Object obj) {
        int i10 = this.f12941s;
        int i11 = this.f12942t;
        Object obj2 = this.f12943u;
        switch (i10) {
            case 0:
                ((b) obj).b((b.a) obj2, i11);
                return;
            case 1:
                int i12 = k4.a0.f30317l0;
                ((e1.c) obj).D(i11, ((c1) obj2).f30392l);
                return;
            default:
                ((l4.b) obj).getClass();
                return;
        }
    }
}
