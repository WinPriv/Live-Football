package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.dynamicloading.DynamicLoader;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* loaded from: assets/audience_network.dex */
public class WV extends AbstractRunnableC0997Ju {
    public final /* synthetic */ C1315Wi A00;

    public WV(C1315Wi c1315Wi) {
        this.A00 = c1315Wi;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0997Ju
    public final void A06() {
        DynamicLoader dynamicLoader = DynamicLoaderFactory.getDynamicLoader();
        if (dynamicLoader != null) {
            dynamicLoader.createBidderTokenProviderApi().getBidderToken(this.A00);
        }
    }
}
