package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.6o, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C06806o extends K6 {
    public final /* synthetic */ JK A00;

    public C06806o(JK jk) {
        this.A00 = jk;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C8O
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(KV kv) {
        if (JK.A07(this.A00) && JK.A08(this.A00)) {
            JK.A0B(this.A00, false);
            if (JK.A0A(this.A00, PE.A04) || JK.A09(this.A00)) {
                JK.A0C(this.A00, false);
                JK.A01(this.A00).postDelayed(new JM(this), JK.A00(this.A00));
            } else {
                if (!JK.A0A(this.A00, PE.A03)) {
                    return;
                }
                JK.A04(this.A00);
                JK.A05(this.A00, true, true);
            }
        }
    }
}
