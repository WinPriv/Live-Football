package com.facebook.ads.redexgen.X;

import com.facebook.ads.NativeAd;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public class X6 implements AnonymousClass68 {
    public final List<Z9> A00;
    public final /* synthetic */ X5 A01;

    public X6(X5 x52, List<Z9> list) {
        this.A01 = x52;
        this.A00 = list;
    }

    private void A00() {
        C5Q c5q;
        C5Q c5q2;
        C5Q c5q3;
        C1316Wj c1316Wj;
        C5Q c5q4;
        C5Q c5q5;
        C1316Wj c1316Wj2;
        c5q = this.A01.A00;
        c5q.A05(true);
        c5q2 = this.A01.A00;
        c5q2.A02();
        c5q3 = this.A01.A00;
        c5q3.A03(0);
        for (Z9 z92 : this.A00) {
            c1316Wj = this.A01.A01;
            InterfaceC0969Iq A0K = C1228Sw.A0K();
            c5q4 = this.A01.A00;
            C1228Sw c1228Sw = new C1228Sw(c1316Wj, z92, null, A0K, c5q4.A01());
            if (c1228Sw.A0y() != null && c1228Sw.A0y().A0F() != null) {
                ((YW) c1228Sw.A0y().A0F()).A00(c1228Sw);
            }
            c5q5 = this.A01.A00;
            c1316Wj2 = this.A01.A01;
            c5q5.A04(new NativeAd(c1316Wj2, c1228Sw));
        }
        C0989Jl.A00(new X7(this));
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass68
    public final void AAB() {
        A00();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass68
    public final void AAI() {
        A00();
    }
}
