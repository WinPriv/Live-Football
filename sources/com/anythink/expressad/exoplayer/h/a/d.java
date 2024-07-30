package com.anythink.expressad.exoplayer.h.a;

import com.anythink.expressad.exoplayer.ae;
import com.anythink.expressad.exoplayer.h.p;

/* loaded from: classes.dex */
final class d extends p {

    /* renamed from: c, reason: collision with root package name */
    private final a f8200c;

    public d(ae aeVar, a aVar) {
        super(aeVar);
        boolean z10;
        if (aeVar.c() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        com.anythink.expressad.exoplayer.k.a.b(z10);
        com.anythink.expressad.exoplayer.k.a.b(aeVar.b() == 1);
        this.f8200c = aVar;
    }

    @Override // com.anythink.expressad.exoplayer.h.p, com.anythink.expressad.exoplayer.ae
    public final ae.a a(int i10, ae.a aVar, boolean z10) {
        this.f8476b.a(i10, aVar, z10);
        aVar.a(aVar.f7272a, aVar.f7273b, aVar.f7274c, aVar.f7275d, aVar.b(), this.f8200c);
        return aVar;
    }

    @Override // com.anythink.expressad.exoplayer.h.p, com.anythink.expressad.exoplayer.ae
    public final ae.b a(int i10, ae.b bVar, boolean z10, long j10) {
        ae.b a10 = super.a(i10, bVar, z10, j10);
        if (a10.f7284i == com.anythink.expressad.exoplayer.b.f7291b) {
            a10.f7284i = this.f8200c.f8157k;
        }
        return a10;
    }
}
