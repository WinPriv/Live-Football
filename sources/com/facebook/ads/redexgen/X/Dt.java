package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeBannerAd;

/* loaded from: assets/audience_network.dex */
public final class Dt extends XB {
    public InterfaceC1110Oh A00;

    public final void A04(C1316Wj c1316Wj, NativeBannerAd nativeBannerAd, C0972It c0972It, NativeAdLayout nativeAdLayout) {
        MediaView mediaView = new MediaView(nativeAdLayout.getContext());
        AdOptionsView adOptionsView = new AdOptionsView(nativeAdLayout.getContext(), nativeBannerAd, nativeAdLayout);
        c0972It.A09(adOptionsView, 20);
        this.A00 = new C1157Qc(c1316Wj, nativeBannerAd, c0972It, C1228Sw.A0L(nativeBannerAd.getInternalNativeAd()).A17(), mediaView, adOptionsView);
        LE.A0M(nativeAdLayout, c0972It.A00());
        nativeBannerAd.registerViewForInteraction(nativeAdLayout, mediaView, this.A00.getViewsForInteraction());
        FrameLayout.LayoutParams contentParams = new FrameLayout.LayoutParams(-1, -1);
        contentParams.gravity = 17;
        nativeAdLayout.addView(this.A00.getView(), contentParams);
    }

    @Override // com.facebook.ads.redexgen.X.C5E, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00.unregisterView();
    }
}
