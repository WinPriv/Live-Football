package com.applovin.exoplayer2.a;

import com.applovin.exoplayer2.a.b;
import com.applovin.exoplayer2.ab;
import com.applovin.exoplayer2.l.p;
import d6.o;
import h4.b;
import k4.e1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements p.a, b.a, o.a {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f12996s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f12997t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f12998u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f12999v;

    public /* synthetic */ s(int i10, Object obj, Object obj2, int i11) {
        this.f12996s = i11;
        this.f12998u = obj;
        this.f12999v = obj2;
        this.f12997t = i10;
    }

    @Override // h4.b.a
    public final Object execute() {
        f4.h hVar = (f4.h) this.f12998u;
        hVar.f28092d.a((z3.s) this.f12999v, this.f12997t + 1);
        return null;
    }

    @Override // com.applovin.exoplayer2.l.p.a
    public final void invoke(Object obj) {
        int i10 = this.f12996s;
        int i11 = this.f12997t;
        Object obj2 = this.f12999v;
        Object obj3 = this.f12998u;
        switch (i10) {
            case 0:
                ((b) obj).a((b.a) obj3, (ab) obj2, i11);
                return;
            case 1:
            default:
                ((l4.b) obj).getClass();
                return;
            case 2:
                e1.c cVar = (e1.c) obj;
                int i12 = k4.a0.f30317l0;
                cVar.a0();
                cVar.f0(i11, (e1.d) obj3, (e1.d) obj2);
                return;
        }
    }

    public /* synthetic */ s(int i10, e1.d dVar, e1.d dVar2) {
        this.f12996s = 2;
        this.f12997t = i10;
        this.f12998u = dVar;
        this.f12999v = dVar2;
    }
}
