package com.applovin.exoplayer2.a;

import c4.c;
import com.applovin.exoplayer2.a.b;
import com.applovin.exoplayer2.am;
import com.applovin.exoplayer2.an;
import com.applovin.exoplayer2.l.p;
import d6.o;
import h4.b;
import java.util.Iterator;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements p.a, b.a, o.a {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f12929s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f12930t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f12931u;

    public /* synthetic */ c(int i10, Object obj, Object obj2) {
        this.f12929s = i10;
        this.f12930t = obj;
        this.f12931u = obj2;
    }

    @Override // h4.b.a
    public final Object execute() {
        int i10 = this.f12929s;
        Object obj = this.f12931u;
        Object obj2 = this.f12930t;
        switch (i10) {
            case 5:
                return ((f4.h) obj2).f28091c.s((z3.s) obj);
            default:
                f4.h hVar = (f4.h) obj2;
                hVar.getClass();
                Iterator it = ((Map) obj).entrySet().iterator();
                while (it.hasNext()) {
                    hVar.f28096i.c(((Integer) r1.getValue()).intValue(), c.a.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
                }
                return null;
        }
    }

    @Override // com.applovin.exoplayer2.l.p.a
    public final void invoke(Object obj) {
        int i10 = this.f12929s;
        Object obj2 = this.f12931u;
        Object obj3 = this.f12930t;
        switch (i10) {
            case 0:
                ((b) obj).c((b.a) obj3, (Exception) obj2);
                return;
            case 1:
                ((b) obj).a((b.a) obj3, (com.applovin.exoplayer2.g.a) obj2);
                return;
            case 2:
                ((b) obj).a((b.a) obj3, (am) obj2);
                return;
            case 3:
                ((b) obj).a((b.a) obj3, (an.a) obj2);
                return;
            case 4:
                ((b) obj).a((b.a) obj3, (com.applovin.exoplayer2.h.m) obj2);
                return;
            case 5:
            case 6:
            default:
                e6.n nVar = (e6.n) obj2;
                ((l4.b) obj).a(nVar);
                int i11 = nVar.f27845s;
                return;
            case 7:
                ((l4.b) obj).getClass();
                return;
            case 8:
                ((l4.b) obj).getClass();
                return;
            case 9:
                ((l4.b) obj).getClass();
                return;
        }
    }
}
