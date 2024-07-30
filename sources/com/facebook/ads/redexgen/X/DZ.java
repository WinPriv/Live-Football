package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;

/* loaded from: assets/audience_network.dex */
public final class DZ extends XB {
    public InterfaceC1110Oh A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A04(NativeAdLayout nativeAdLayout, C1316Wj c1316Wj, NativeAd nativeAd, C0972It c0972It) {
        NI ni = new NI(c1316Wj);
        MediaView mediaView = new MediaView(c1316Wj);
        AdOptionsView adOptionsView = new AdOptionsView(c1316Wj, nativeAd, nativeAdLayout);
        c0972It.A09(adOptionsView, 28);
        this.A00 = new C1156Qb(c1316Wj, nativeAd, c0972It, C1228Sw.A0L(nativeAd.getInternalNativeAd()).A17(), ni, mediaView, adOptionsView);
        LE.A0M(nativeAdLayout, c0972It.A00());
        nativeAd.registerViewForInteraction(nativeAdLayout, mediaView, ni, this.A00.getViewsForInteraction());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        nativeAdLayout.addView(this.A00.getView(), layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.C5E, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00.unregisterView();
    }
}
