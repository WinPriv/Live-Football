package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.bridge.gms.AdvertisingId;

/* loaded from: assets/audience_network.dex */
public class WL implements C7K {
    public final /* synthetic */ AdvertisingId A00;
    public final /* synthetic */ WK A01;

    public WL(WK wk, AdvertisingId advertisingId) {
        this.A01 = wk;
        this.A00 = advertisingId;
    }

    @Override // com.facebook.ads.redexgen.X.C7K
    public final boolean A8V() {
        return this.A00.isLimitAdTracking();
    }

    @Override // com.facebook.ads.redexgen.X.C7K
    public final String getId() {
        return this.A00.getId();
    }
}
