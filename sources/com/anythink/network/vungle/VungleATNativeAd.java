package com.anythink.network.vungle;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.anythink.nativead.api.ATNativePrepareInfo;
import com.anythink.nativead.unitgroup.api.CustomNativeAd;
import com.vungle.warren.AdConfig;
import com.vungle.warren.NativeAd;
import com.vungle.warren.NativeAdLayout;
import com.vungle.warren.NativeAdListener;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.ui.view.MediaView;
import java.util.List;

/* loaded from: classes.dex */
public class VungleATNativeAd extends CustomNativeAd implements NativeAdListener {

    /* renamed from: a, reason: collision with root package name */
    Context f12850a;

    /* renamed from: b, reason: collision with root package name */
    String f12851b;

    /* renamed from: c, reason: collision with root package name */
    AdConfig f12852c;

    /* renamed from: d, reason: collision with root package name */
    LoadCallbackListener f12853d;

    /* renamed from: e, reason: collision with root package name */
    NativeAd f12854e;
    NativeAdLayout f;

    /* renamed from: g, reason: collision with root package name */
    MediaView f12855g;

    /* renamed from: h, reason: collision with root package name */
    ImageView f12856h;

    /* loaded from: classes.dex */
    public interface LoadCallbackListener {
        void onFail(String str, String str2);

        void onSuccess(CustomNativeAd customNativeAd);
    }

    public VungleATNativeAd(Context context, String str, AdConfig adConfig, LoadCallbackListener loadCallbackListener) {
        this.f12850a = context.getApplicationContext();
        this.f12851b = str;
        this.f12852c = adConfig;
        this.f12853d = loadCallbackListener;
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a
    public void clear(View view) {
        NativeAd nativeAd = this.f12854e;
        if (nativeAd != null) {
            nativeAd.unregisterView();
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public void destroy() {
        NativeAd nativeAd = this.f12854e;
        if (nativeAd != null) {
            nativeAd.destroy();
        }
        this.f12854e = null;
        this.f12855g = null;
        this.f = null;
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a, com.anythink.core.api.IATThirdPartyMaterial
    public View getAdIconView() {
        if (this.f12856h == null) {
            this.f12856h = new ImageView(this.f12850a);
        }
        return this.f12856h;
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a, com.anythink.core.api.IATThirdPartyMaterial
    public View getAdMediaView(Object... objArr) {
        if (this.f12855g == null) {
            this.f12855g = new MediaView(this.f12850a);
        }
        return this.f12855g;
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public ViewGroup getCustomAdContainer() {
        if (this.f12854e != null) {
            this.f = new NativeAdLayout(this.f12850a);
        }
        return this.f;
    }

    @Override // com.vungle.warren.NativeAdListener
    public void onAdClick(String str) {
        notifyAdClicked();
    }

    @Override // com.vungle.warren.NativeAdListener
    public void onAdImpression(String str) {
        notifyAdImpression();
    }

    @Override // com.vungle.warren.NativeAdListener
    public void onAdLoadError(String str, VungleException vungleException) {
        LoadCallbackListener loadCallbackListener = this.f12853d;
        if (loadCallbackListener != null) {
            loadCallbackListener.onFail("", vungleException.toString());
            this.f12853d = null;
        }
    }

    @Override // com.vungle.warren.NativeAdListener
    public void onNativeAdLoaded(NativeAd nativeAd) {
        double doubleValue;
        if (nativeAd != null && nativeAd.canPlayAd()) {
            this.f12854e = nativeAd;
            setTitle(nativeAd.getAdTitle());
            setDescriptionText(this.f12854e.getAdBodyText());
            setCallToActionText(this.f12854e.getAdCallToActionText());
            if (this.f12854e.getAdStarRating() == null) {
                doubleValue = 5.0d;
            } else {
                doubleValue = this.f12854e.getAdStarRating().doubleValue();
            }
            setStarRating(Double.valueOf(doubleValue));
            setAdFrom(this.f12854e.getAdSponsoredText());
            LoadCallbackListener loadCallbackListener = this.f12853d;
            if (loadCallbackListener != null) {
                loadCallbackListener.onSuccess(this);
            } else {
                return;
            }
        } else {
            LoadCallbackListener loadCallbackListener2 = this.f12853d;
            if (loadCallbackListener2 != null) {
                if (nativeAd != null) {
                    loadCallbackListener2.onFail("", "Vungle onNativeAdLoaded but can't PlayAd");
                }
            } else {
                return;
            }
        }
        this.f12853d = null;
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a
    public void prepare(View view, ATNativePrepareInfo aTNativePrepareInfo) {
        NativeAdLayout nativeAdLayout;
        MediaView mediaView;
        List<View> clickViewList = aTNativePrepareInfo.getClickViewList();
        NativeAd nativeAd = this.f12854e;
        if (nativeAd != null && (nativeAdLayout = this.f) != null && (mediaView = this.f12855g) != null) {
            nativeAd.registerViewForInteraction(nativeAdLayout, mediaView, this.f12856h, clickViewList);
        }
    }

    public void startLoadAd() {
        new NativeAd(this.f12850a, this.f12851b).loadAd(this.f12852c, this);
    }

    @Override // com.vungle.warren.NativeAdListener
    public void creativeId(String str) {
    }

    @Override // com.vungle.warren.NativeAdListener
    public void onAdLeftApplication(String str) {
    }

    @Override // com.vungle.warren.NativeAdListener
    public void onAdPlayError(String str, VungleException vungleException) {
    }
}
