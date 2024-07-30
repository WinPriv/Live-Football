package com.vungle.warren;

import com.vungle.warren.error.VungleException;

/* loaded from: classes2.dex */
public interface NativeAdListener {
    void creativeId(String str);

    void onAdClick(String str);

    void onAdImpression(String str);

    void onAdLeftApplication(String str);

    void onAdLoadError(String str, VungleException vungleException);

    void onAdPlayError(String str, VungleException vungleException);

    void onNativeAdLoaded(NativeAd nativeAd);
}
