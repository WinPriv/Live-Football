package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;

/* loaded from: assets/audience_network.dex */
public class YU extends AbstractRunnableC0997Ju {
    public final /* synthetic */ C0854Eb A00;
    public final /* synthetic */ C05591q A01;
    public final /* synthetic */ E8 A02;

    public YU(E8 e82, C05591q c05591q, C0854Eb c0854Eb) {
        this.A02 = e82;
        this.A01 = c05591q;
        this.A00 = c0854Eb;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0997Ju
    public final void A06() {
        this.A02.A0N(this.A01);
        this.A02.A0K(this.A00);
        this.A02.A00 = null;
        AdErrorType adErrorType = AdErrorType.RV_AD_TIMEOUT;
        this.A02.A0B.A0D().A4Z(adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
        this.A02.A06.A0G(new J3(adErrorType, ""));
    }
}
