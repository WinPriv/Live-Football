package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Qm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1167Qm extends AbstractC1136Ph {
    public final /* synthetic */ AnonymousClass77 A00;

    public C1167Qm(AnonymousClass77 anonymousClass77) {
        this.A00 = anonymousClass77;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1136Ph
    public final void A02() {
        L6 l62;
        L6 l63;
        String str;
        C1137Pi c1137Pi;
        L6 l64;
        C1375Ys c1375Ys;
        IT it;
        String str2;
        C1316Wj c1316Wj;
        C1375Ys c1375Ys2;
        l62 = this.A00.A0D;
        if (!l62.A07()) {
            AnonymousClass77 anonymousClass77 = this.A00;
            l63 = anonymousClass77.A0D;
            anonymousClass77.setImpressionRecordingFlag(l63);
            str = this.A00.A0A;
            if (!TextUtils.isEmpty(str)) {
                N2 n22 = new N2();
                c1137Pi = this.A00.A09;
                N2 A03 = n22.A03(c1137Pi);
                l64 = this.A00.A0D;
                N2 A02 = A03.A02(l64);
                c1375Ys = ((SH) ((SH) this.A00)).A08;
                Map<String, String> A05 = A02.A04(c1375Ys.A0X()).A05();
                it = ((SH) ((SH) this.A00)).A0A;
                str2 = this.A00.A0A;
                it.A8z(str2, A05);
                c1316Wj = this.A00.A0C;
                c1316Wj.A0D().A2Y();
                c1375Ys2 = this.A00.A03;
                AnonymousClass29.A00(c1375Ys2.A0W());
            }
        }
    }
}
