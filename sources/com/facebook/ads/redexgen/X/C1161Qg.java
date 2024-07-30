package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Qg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1161Qg extends C4H<C1159Qe> {
    public final int A00;
    public final C1316Wj A01;
    public final List<String> A02;

    public C1161Qg(C1316Wj c1316Wj, List<String> screenshotUrls, int i10) {
        this.A02 = screenshotUrls;
        this.A00 = i10;
        this.A01 = c1316Wj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4H
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final C1159Qe A06(ViewGroup viewGroup, int i10) {
        return new C1159Qe(new C1160Qf(this.A01));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4H
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A0E(C1159Qe c1159Qe, int i10) {
        String str = this.A02.get(i10);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        int leftMargin = this.A00;
        int i11 = leftMargin * 4;
        if (i10 == 0) {
            leftMargin = i11;
        }
        marginLayoutParams.setMargins(leftMargin, 0, i10 >= A0D() + (-1) ? this.A00 * 4 : this.A00, 0);
        c1159Qe.A0l().setLayoutParams(marginLayoutParams);
        c1159Qe.A0l().A00(str);
    }

    @Override // com.facebook.ads.redexgen.X.C4H
    public final int A0D() {
        return this.A02.size();
    }
}
