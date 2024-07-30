package com.applovin.exoplayer2;

import com.applovin.exoplayer2.an;
import com.applovin.exoplayer2.l.p;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class r0 implements p.a {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f16614s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f16615t;

    public /* synthetic */ r0(Object obj, int i10) {
        this.f16614s = i10;
        this.f16615t = obj;
    }

    @Override // com.applovin.exoplayer2.l.p.a
    public final void invoke(Object obj) {
        int i10 = this.f16614s;
        Object obj2 = this.f16615t;
        switch (i10) {
            case 0:
                r.a((al) obj2, (an.b) obj);
                return;
            case 1:
                r.h((al) obj2, (an.b) obj);
                return;
            case 2:
                r.f((al) obj2, (an.b) obj);
                return;
            default:
                ((r) obj2).d((an.b) obj);
                return;
        }
    }
}
