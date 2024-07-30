package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.Ya, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1357Ya extends AbstractRunnableC0997Ju {
    public final /* synthetic */ ZB A00;
    public final /* synthetic */ C05591q A01;
    public final /* synthetic */ EC A02;

    public C1357Ya(EC ec2, C05591q c05591q, ZB zb2) {
        this.A02 = ec2;
        this.A01 = c05591q;
        this.A00 = zb2;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0997Ju
    public final void A06() {
        this.A02.A0N(this.A01);
        this.A02.A0K(this.A00);
        this.A02.A00 = null;
        J3 A00 = J3.A00(AdErrorType.INTERSTITIAL_AD_TIMEOUT);
        this.A02.A0B.A0D().A4Z(A00.A03().getErrorCode(), A00.A04());
        this.A02.A06.A0G(A00);
    }
}
