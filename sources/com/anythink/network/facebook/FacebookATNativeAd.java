package com.anythink.network.facebook;

import android.content.Context;
import com.facebook.ads.Ad;
import com.facebook.ads.NativeAd;

/* loaded from: classes.dex */
public class FacebookATNativeAd extends FacebookATBaseNativeAd<NativeAd> {

    /* renamed from: i, reason: collision with root package name */
    private final String f12677i;

    public FacebookATNativeAd(Context context, NativeAd nativeAd) {
        super(context, nativeAd, false);
        this.f12677i = "FacebookATNativeAd";
    }

    @Override // com.anythink.network.facebook.FacebookATBaseNativeAd, com.facebook.ads.AdListener
    public void onAdLoaded(Ad ad2) {
        T t10 = this.f12651a;
        if (t10 != 0 && (t10 instanceof NativeAd)) {
            NativeAd nativeAd = (NativeAd) t10;
            if (nativeAd.getAdCreativeType() == NativeAd.AdCreativeType.VIDEO) {
                this.mAdSourceType = "1";
            } else if (nativeAd.getAdCreativeType() == NativeAd.AdCreativeType.IMAGE) {
                this.mAdSourceType = "2";
            }
        }
        super.onAdLoaded(ad2);
    }
}
