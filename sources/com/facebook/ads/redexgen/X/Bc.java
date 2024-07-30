package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public abstract class Bc {
    public final InterfaceC0789Ba A00;

    public abstract void A0B(HV hv, long j10) throws C9R;

    public abstract boolean A0C(HV hv) throws C9R;

    public Bc(InterfaceC0789Ba interfaceC0789Ba) {
        this.A00 = interfaceC0789Ba;
    }

    public final void A00(HV hv, long j10) throws C9R {
        if (A0C(hv)) {
            A0B(hv, j10);
        }
    }
}
