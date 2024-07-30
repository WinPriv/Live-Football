package com.applovin.exoplayer2;

import android.os.Bundle;
import com.applovin.exoplayer2.an;
import com.applovin.exoplayer2.g;
import com.applovin.exoplayer2.l.p;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class k0 implements p.a, g.a {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f16242s;

    public /* synthetic */ k0(int i10) {
        this.f16242s = i10;
    }

    @Override // com.applovin.exoplayer2.g.a
    public final g fromBundle(Bundle bundle) {
        ac a10;
        switch (this.f16242s) {
            case 1:
                a10 = ac.a(bundle);
                return a10;
            case 2:
                return new ak(bundle);
            case 3:
                return aq.b(bundle);
            default:
                return az.c(bundle);
        }
    }

    @Override // com.applovin.exoplayer2.l.p.a
    public final void invoke(Object obj) {
        switch (this.f16242s) {
            case 0:
                r.J((an.b) obj);
                return;
            default:
                ((an.b) obj).b();
                return;
        }
    }
}
