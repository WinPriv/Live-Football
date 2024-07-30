package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.RewardedInterstitialAd;
import com.facebook.ads.internal.api.AdCompanionView;
import com.facebook.ads.internal.api.RewardedInterstitialAdApi;
import com.facebook.ads.internal.context.Repairable;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.5X, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C5X implements RewardedInterstitialAdApi, Repairable {
    public static byte[] A01;
    public static String[] A02 = {"3NmEwDZbIt", "O8AdKP", "F3ALGhsyO3", "0MHUDKJg5DuGWh7rPRyim2f5Q3jzHAIy", "HXUpQ47Mk3E2sR2m", "8jXe5NRPzLqsvVidOiIerBtc23OceItu", "2ZUtk7q5pb8vSbqEv1qAEyjXWKkByt40", "lRwzP9ChqND6LzN"};
    public final C06455b A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 126);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {70, Ascii.NAK, Ascii.SYN, Ascii.NAK, 67, 66, 76, 71, 120, 121, 40, 46, 45, 114, 41, 125, Ascii.VT, 93, Ascii.SO, 93, 94, 9, 94, 9, 49, 48, 97, 99, 99, 98, 97, 49, 36, 19, 1, Ascii.ETB, 4, Ascii.DC2, 19, Ascii.DC2, 86, Ascii.US, Ascii.CAN, 2, 19, 4, 5, 2, Ascii.US, 2, Ascii.US, Ascii.ETB, Ascii.SUB, 86, Ascii.ETB, Ascii.DC2, 86, Ascii.DC2, 19, 5, 2, 4, Ascii.EM, Ascii.SI, 19, Ascii.DC2, 6, 49, 35, 53, 38, 48, 49, 48, 116, 61, 58, 32, 49, 38, 39, 32, 61, 32, 61, 53, 56, 116, 53, 48, 116, 56, 59, 53, 48, 116, 38, 49, 37, 33, 49, 39, 32, 49, 48, 36, 19, 1, Ascii.ETB, 4, Ascii.DC2, 19, Ascii.DC2, 86, Ascii.US, Ascii.CAN, 2, 19, 4, 5, 2, Ascii.US, 2, Ascii.US, Ascii.ETB, Ascii.SUB, 86, Ascii.ETB, Ascii.DC2, 86, 5, Ascii.RS, Ascii.EM, 1, 86, Ascii.NAK, Ascii.ETB, Ascii.SUB, Ascii.SUB, 19, Ascii.DC2, 73, 72, 94, 89, 95, 66, 84, 50, 49, 63, 58, Ascii.US, 58, 6, Ascii.GS, Ascii.SUB, 2};
        if (A02[4].length() == 1) {
            throw new RuntimeException();
        }
        A02[7] = "xXnNwnRRjThYq22";
        A01 = bArr;
    }

    static {
        A01();
    }

    public C5X(Context context, String str, RewardedInterstitialAd rewardedInterstitialAd) {
        this.A00 = new C06455b(context, str, rewardedInterstitialAd);
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi, com.facebook.ads.FullScreenAd
    public final RewardedInterstitialAd.RewardedInterstitialAdLoadConfigBuilder buildLoadAdConfig() {
        return new C5Z(this.A00.buildLoadAdConfig());
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi, com.facebook.ads.FullScreenAd
    public final RewardedInterstitialAd.RewardedInterstitialAdShowConfigBuilder buildShowAdConfig() {
        return new C06445a(this.A00.buildShowAdConfig());
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi, com.facebook.ads.Ad
    public final void destroy() {
        JH.A05(A00(141, 7, 83), A00(32, 34, 8), A00(8, 8, 53));
        this.A00.A04();
    }

    public final void finalize() {
        this.A00.finalize();
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi, com.facebook.ads.Ad
    public final String getPlacementId() {
        return this.A00.getPlacementId();
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi
    public final int getVideoDuration() {
        return this.A00.getVideoDuration();
    }

    @Override // com.facebook.ads.Ad
    public final boolean isAdInvalidated() {
        return this.A00.isAdInvalidated();
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi
    public final boolean isAdLoaded() {
        return this.A00.isAdLoaded();
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi, com.facebook.ads.Ad
    public final void loadAd() {
        JH.A05(A00(148, 6, 32), A00(66, 39, 42), A00(24, 8, 121));
        this.A00.A07(null, AdExperienceType.AD_EXPERIENCE_TYPE_REWARDED_INTERSTITIAL, true, false);
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi
    public final void loadAd(RewardedInterstitialAd.RewardedInterstitialLoadAdConfig rewardedInterstitialLoadAdConfig) {
        ((C5Z) rewardedInterstitialLoadAdConfig).A00();
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi
    public final void registerAdCompanionView(AdCompanionView adCompanionView) {
        this.A00.registerAdCompanionView(adCompanionView);
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(Throwable th) {
        this.A00.repair(th);
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi, com.facebook.ads.Ad
    @SuppressLint({"DeprecatedMethod"})
    @Deprecated
    public final void setExtraHints(ExtraHints extraHints) {
        this.A00.setExtraHints(extraHints);
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi, com.facebook.ads.FullScreenAd
    public final boolean show() {
        JH.A05(A00(154, 4, 11), A00(105, 36, 8), A00(16, 8, 65));
        return this.A00.A08(new C06475d().withAppOrientation(-1).build());
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi
    public final boolean show(RewardedInterstitialAd.RewardedInterstitialShowAdConfig rewardedInterstitialShowAdConfig) {
        JH.A05(A00(154, 4, 11), A00(105, 36, 8), A00(0, 8, 10));
        return this.A00.A08(((C06445a) rewardedInterstitialShowAdConfig).A00());
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi
    public final void unregisterAdCompanionView() {
        this.A00.unregisterAdCompanionView();
    }
}
