package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class TR implements InterfaceC1410a6<IJ, IO> {
    public TO A00;

    public TR(TO to) {
        this.A00 = to;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.a3 != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC1410a6
    public final void A5H(C1407a3<IJ, IO> c1407a3, InterfaceC1396Zs interfaceC1396Zs) {
        int i10 = IH.A00[interfaceC1396Zs.A7m(c1407a3).ordinal()];
        if (i10 != 1 && i10 != 2) {
            return;
        }
        this.A00.A02(c1407a3, interfaceC1396Zs);
    }
}
