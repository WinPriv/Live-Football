package com.huawei.hms.ads;

import com.huawei.hms.ads.inter.data.IInterstitialAd;

/* loaded from: classes2.dex */
public abstract class f {
    private static final byte[] I = new byte[0];
    private static IInterstitialAd V;

    public static IInterstitialAd Code() {
        IInterstitialAd iInterstitialAd;
        synchronized (I) {
            iInterstitialAd = V;
        }
        return iInterstitialAd;
    }

    public static void Code(IInterstitialAd iInterstitialAd) {
        synchronized (I) {
            if (iInterstitialAd == null) {
                ex.Code("InterstitialGlobalDataShare", "set interstitial ad null");
                V = null;
            } else {
                V = iInterstitialAd;
            }
        }
    }
}
