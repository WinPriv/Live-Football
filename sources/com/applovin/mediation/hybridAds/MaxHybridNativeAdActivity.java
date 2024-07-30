package com.applovin.mediation.hybridAds;

import android.R;
import android.os.Bundle;
import android.view.ViewGroup;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.z;
import com.applovin.impl.sdk.p;
import com.applovin.mediation.adapter.listeners.MaxAdapterListener;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;

/* loaded from: classes.dex */
public class MaxHybridNativeAdActivity extends b {

    /* renamed from: c, reason: collision with root package name */
    private MaxNativeAdView f19599c;

    @Override // com.applovin.mediation.hybridAds.b, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((ViewGroup) findViewById(R.id.content)).addView(this.f19599c);
        this.f19603a.bringToFront();
    }

    public void a(com.applovin.impl.mediation.a.c cVar, final MaxNativeAd maxNativeAd, p pVar, MaxAdapterListener maxAdapterListener) {
        super.a(cVar, pVar, maxAdapterListener);
        MaxNativeAdView maxNativeAdView = new MaxNativeAdView(maxNativeAd, new MaxNativeAdViewBinder.Builder(com.applovin.sdk.R.layout.max_hybrid_native_ad_view).setTitleTextViewId(com.applovin.sdk.R.id.applovin_native_title_text_view).setBodyTextViewId(com.applovin.sdk.R.id.applovin_native_body_text_view).setAdvertiserTextViewId(com.applovin.sdk.R.id.applovin_native_advertiser_text_view).setIconImageViewId(com.applovin.sdk.R.id.applovin_native_icon_image_view).setMediaContentViewGroupId(com.applovin.sdk.R.id.applovin_native_media_content_view).setOptionsContentViewGroupId(com.applovin.sdk.R.id.applovin_native_options_view).setCallToActionButtonId(com.applovin.sdk.R.id.applovin_native_cta_button).build(), this);
        this.f19599c = maxNativeAdView;
        maxNativeAdView.renderCustomNativeAdView(maxNativeAd);
        Runnable runnable = new Runnable() { // from class: com.applovin.mediation.hybridAds.MaxHybridNativeAdActivity.1
            @Override // java.lang.Runnable
            public void run() {
                if (!maxNativeAd.prepareForInteraction(MaxHybridNativeAdActivity.this.f19599c.getClickableViews(), MaxHybridNativeAdActivity.this.f19599c)) {
                    maxNativeAd.prepareViewForInteraction(MaxHybridNativeAdActivity.this.f19599c);
                }
            }
        };
        if (maxNativeAd.shouldPrepareViewForInteractionOnMainThread()) {
            runOnUiThread(runnable);
        } else {
            pVar.M().a(new z(pVar, runnable), o.a.MEDIATION_MAIN);
        }
    }
}
