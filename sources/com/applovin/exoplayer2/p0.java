package com.applovin.exoplayer2;

import com.applovin.exoplayer2.an;
import com.applovin.exoplayer2.l.p;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class p0 implements p.a, p.b {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f16586s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f16587t;

    public /* synthetic */ p0(Object obj, int i10) {
        this.f16586s = i10;
        this.f16587t = obj;
    }

    @Override // com.applovin.exoplayer2.l.p.a
    public final void invoke(Object obj) {
        int i10 = this.f16586s;
        Object obj2 = this.f16587t;
        switch (i10) {
            case 0:
                r.c((al) obj2, (an.b) obj);
                return;
            default:
                r.d((al) obj2, (an.b) obj);
                return;
        }
    }

    @Override // com.applovin.exoplayer2.l.p.b
    public final void invoke(Object obj, com.applovin.exoplayer2.l.m mVar) {
        r.a((an) this.f16587t, (an.b) obj, mVar);
    }
}
