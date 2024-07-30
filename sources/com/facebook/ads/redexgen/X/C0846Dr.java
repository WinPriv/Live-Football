package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.j.a.c;

/* renamed from: com.facebook.ads.redexgen.X.Dr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0846Dr {
    public final GN A00;
    public final GP A01;
    public final GP A02;
    public final InterfaceC0919Gq A03;
    public final HZ A04;

    public C0846Dr(InterfaceC0919Gq interfaceC0919Gq, GP gp) {
        this(interfaceC0919Gq, gp, null, null, null);
    }

    public C0846Dr(InterfaceC0919Gq interfaceC0919Gq, GP gp, @Nullable GP gp2, @Nullable GN gn, @Nullable HZ hz) {
        H6.A01(gp);
        this.A03 = interfaceC0919Gq;
        this.A02 = gp;
        this.A01 = gp2;
        this.A00 = gn;
        this.A04 = hz;
    }

    public final InterfaceC0919Gq A00() {
        return this.A03;
    }

    public final C1233Tb A01(boolean z10) {
        GQ c1246To;
        GO c1234Tc;
        GP gp = this.A01;
        if (gp != null) {
            c1246To = gp.A4E();
        } else {
            c1246To = new C1246To();
        }
        if (z10) {
            return new C1233Tb(this.A03, C1247Tp.A02, c1246To, null, 1, null);
        }
        GN gn = this.A00;
        if (gn != null) {
            c1234Tc = gn.createDataSink();
        } else {
            c1234Tc = new C1234Tc(this.A03, c.f8719a);
        }
        GQ A4E = this.A02.A4E();
        HZ hz = this.A04;
        if (hz != null) {
            A4E = new C1238Tg(A4E, hz, -1000);
        }
        GQ upstream = c1246To;
        return new C1233Tb(this.A03, A4E, upstream, c1234Tc, 1, null);
    }

    public final HZ A02() {
        HZ hz = this.A04;
        return hz != null ? hz : new HZ();
    }
}
