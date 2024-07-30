package com.anythink.network.facebook;

import android.content.Context;
import android.view.View;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdView;

/* loaded from: classes.dex */
public class FacebookATNativeExpressAd extends FacebookATBaseNativeAd<NativeAd> {

    /* renamed from: i, reason: collision with root package name */
    View f12682i;

    /* renamed from: j, reason: collision with root package name */
    private final String f12683j;

    public FacebookATNativeExpressAd(Context context, NativeAd nativeAd) {
        super(context, nativeAd, true);
        this.f12683j = "FacebookATNativeExpressAd";
    }

    @Override // com.anythink.network.facebook.FacebookATBaseNativeAd, com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a, com.anythink.core.api.IATThirdPartyMaterial
    public View getAdMediaView(Object... objArr) {
        T t10;
        try {
            if (this.f12653c && (t10 = this.f12651a) != 0 && (t10 instanceof NativeAd)) {
                if (this.f12682i == null) {
                    this.f12682i = NativeAdView.render(this.f12652b, (NativeAd) t10);
                }
                return this.f12682i;
            }
            return null;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
