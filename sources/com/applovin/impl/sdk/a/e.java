package com.applovin.impl.sdk.a;

import android.webkit.WebView;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.y;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.CreativeType;
import com.iab.omid.library.applovin.adsession.ImpressionType;
import com.iab.omid.library.applovin.adsession.Owner;

/* loaded from: classes.dex */
public class e extends b {
    public e(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        super(appLovinNativeAdImpl);
    }

    @Override // com.applovin.impl.sdk.a.b
    public AdSessionContext a(WebView webView) {
        try {
            return AdSessionContext.createNativeAdSessionContext(this.f18488b.ag().d(), this.f18488b.ag().e(), this.f18487a.getOpenMeasurementVerificationScriptResources(), this.f18487a.getOpenMeasurementContentUrl(), this.f18487a.getOpenMeasurementCustomReferenceData());
        } catch (Throwable th) {
            if (y.a()) {
                this.f18489c.b(this.f18490d, "Failed to create ad session context", th);
            }
            return null;
        }
    }

    @Override // com.applovin.impl.sdk.a.b
    public AdSessionConfiguration a() {
        try {
            return AdSessionConfiguration.createAdSessionConfiguration(CreativeType.NATIVE_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false);
        } catch (Throwable th) {
            if (y.a()) {
                this.f18489c.b(this.f18490d, "Failed to create ad session configuration", th);
            }
            return null;
        }
    }
}
