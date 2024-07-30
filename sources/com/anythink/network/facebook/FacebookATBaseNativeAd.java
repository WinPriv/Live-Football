package com.anythink.network.facebook;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.anythink.nativead.api.ATNativePrepareInfo;
import com.anythink.nativead.unitgroup.api.CustomNativeAd;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.AdSDKNotificationListener;
import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class FacebookATBaseNativeAd<T extends NativeAdBase> extends CustomNativeAd implements NativeAdListener {

    /* renamed from: a, reason: collision with root package name */
    T f12651a;

    /* renamed from: b, reason: collision with root package name */
    Context f12652b;

    /* renamed from: c, reason: collision with root package name */
    boolean f12653c;

    /* renamed from: d, reason: collision with root package name */
    a f12654d;

    /* renamed from: e, reason: collision with root package name */
    Map<String, Object> f12655e;
    NativeAdLayout f;

    /* renamed from: g, reason: collision with root package name */
    MediaView f12656g;

    /* renamed from: h, reason: collision with root package name */
    MediaView f12657h;

    /* renamed from: i, reason: collision with root package name */
    private final String f12658i = "FacebookATBaseNativeAd";

    /* loaded from: classes.dex */
    public interface a {
        void onLoadFail(String str, String str2);

        void onLoadSuccess();
    }

    public FacebookATBaseNativeAd(Context context, T t10, boolean z10) {
        this.f12652b = context.getApplicationContext();
        this.f12651a = t10;
        this.f12653c = z10;
    }

    private void a(View view, FrameLayout.LayoutParams layoutParams) {
        AdOptionsView adOptionsView = new AdOptionsView(view.getContext(), this.f12651a, this.f);
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 53;
        }
        if (layoutParams.height > 0) {
            adOptionsView.setIconSizeDp((int) ((layoutParams.height / this.f12652b.getResources().getDisplayMetrics().density) + 0.5f));
        }
        this.f.addView(adOptionsView, layoutParams);
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a
    public void clear(View view) {
        T t10 = this.f12651a;
        if (t10 != null) {
            t10.unregisterView();
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public void destroy() {
        T t10 = this.f12651a;
        if (t10 != null) {
            t10.unregisterView();
            this.f12651a.destroy();
            this.f12651a = null;
        }
        MediaView mediaView = this.f12656g;
        if (mediaView != null) {
            mediaView.setListener(null);
            this.f12656g.destroy();
            this.f12656g = null;
        }
        this.f12652b = null;
        MediaView mediaView2 = this.f12657h;
        if (mediaView2 != null) {
            mediaView2.destroy();
            this.f12657h = null;
        }
        this.f = null;
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.IATThirdPartyMaterial
    public String getAdFrom() {
        T t10;
        if (this.f12653c || (t10 = this.f12651a) == null) {
            return "";
        }
        return t10.getSponsoredTranslation();
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a, com.anythink.core.api.IATThirdPartyMaterial
    public View getAdIconView() {
        if (this.f12653c) {
            return null;
        }
        try {
            MediaView mediaView = this.f12657h;
            if (mediaView != null) {
                mediaView.destroy();
                this.f12657h = null;
            }
            MediaView mediaView2 = new MediaView(this.f12652b);
            this.f12657h = mediaView2;
            return mediaView2;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a, com.anythink.core.api.IATThirdPartyMaterial
    public View getAdMediaView(Object... objArr) {
        try {
            if (this.f12656g == null) {
                MediaView mediaView = new MediaView(this.f12652b);
                this.f12656g = mediaView;
                mediaView.setListener(new MediaViewListener() { // from class: com.anythink.network.facebook.FacebookATBaseNativeAd.1
                    @Override // com.facebook.ads.MediaViewListener
                    public final void onComplete(MediaView mediaView2) {
                        FacebookATBaseNativeAd.this.notifyAdVideoEnd();
                    }

                    @Override // com.facebook.ads.MediaViewListener
                    public final void onEnterFullscreen(MediaView mediaView2) {
                    }

                    @Override // com.facebook.ads.MediaViewListener
                    public final void onExitFullscreen(MediaView mediaView2) {
                    }

                    @Override // com.facebook.ads.MediaViewListener
                    public final void onFullscreenBackground(MediaView mediaView2) {
                    }

                    @Override // com.facebook.ads.MediaViewListener
                    public final void onFullscreenForeground(MediaView mediaView2) {
                    }

                    @Override // com.facebook.ads.MediaViewListener
                    public final void onPause(MediaView mediaView2) {
                    }

                    @Override // com.facebook.ads.MediaViewListener
                    public final void onPlay(MediaView mediaView2) {
                    }

                    @Override // com.facebook.ads.MediaViewListener
                    public final void onVolumeChange(MediaView mediaView2, float f) {
                    }
                });
            }
            return this.f12656g;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.IATThirdPartyMaterial
    public String getAdvertiserName() {
        T t10;
        if (this.f12653c || (t10 = this.f12651a) == null) {
            return "";
        }
        return t10.getAdvertiserName();
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.IATThirdPartyMaterial
    public String getCallToActionText() {
        T t10;
        if (this.f12653c || (t10 = this.f12651a) == null) {
            return "";
        }
        return t10.getAdCallToAction();
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public ViewGroup getCustomAdContainer() {
        if (this.f12653c) {
            return null;
        }
        NativeAdLayout nativeAdLayout = new NativeAdLayout(this.f12652b);
        this.f = nativeAdLayout;
        return nativeAdLayout;
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.IATThirdPartyMaterial
    public String getDescriptionText() {
        T t10;
        if (this.f12653c || (t10 = this.f12651a) == null) {
            return "";
        }
        return t10.getAdBodyText();
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.IATThirdPartyMaterial
    public int getMainImageHeight() {
        T t10;
        NativeAdBase.Image adCoverImage;
        if (this.f12653c || (t10 = this.f12651a) == null || (adCoverImage = t10.getAdCoverImage()) == null) {
            return 0;
        }
        return adCoverImage.getHeight();
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.IATThirdPartyMaterial
    public int getMainImageWidth() {
        T t10;
        NativeAdBase.Image adCoverImage;
        if (this.f12653c || (t10 = this.f12651a) == null || (adCoverImage = t10.getAdCoverImage()) == null) {
            return 0;
        }
        return adCoverImage.getWidth();
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.IATThirdPartyMaterial
    public String getTitle() {
        T t10;
        if (this.f12653c || (t10 = this.f12651a) == null) {
            return "";
        }
        return t10.getAdHeadline();
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a
    public boolean isNativeExpress() {
        return this.f12653c;
    }

    public void loadAd(String str, a aVar) {
        this.f12654d = aVar;
        if (TextUtils.isEmpty(str)) {
            this.f12651a.loadAd(this.f12651a.buildLoadAdConfig().withAdListener(this).build());
            return;
        }
        HashMap hashMap = new HashMap();
        this.f12655e = hashMap;
        FacebookATInitManager.getInstance();
        hashMap.put(AdSDKNotificationListener.ENCRYPTED_CPM_KEY, FacebookATInitManager.a(str));
        setNetworkInfoMap(this.f12655e);
        this.f12651a.loadAd(this.f12651a.buildLoadAdConfig().withAdListener(this).withBid(str).build());
    }

    @Override // com.facebook.ads.AdListener
    public void onAdClicked(Ad ad2) {
        notifyAdClicked();
    }

    @Override // com.facebook.ads.AdListener
    public void onAdLoaded(Ad ad2) {
        a aVar = this.f12654d;
        if (aVar != null) {
            aVar.onLoadSuccess();
        }
        this.f12654d = null;
    }

    @Override // com.facebook.ads.AdListener
    public void onError(Ad ad2, AdError adError) {
        a aVar = this.f12654d;
        if (aVar != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(adError.getErrorCode());
            aVar.onLoadFail(sb2.toString(), adError.getErrorMessage());
        }
        this.f12654d = null;
    }

    @Override // com.facebook.ads.AdListener
    public void onLoggingImpression(Ad ad2) {
        notifyAdImpression();
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a
    public void prepare(View view, ATNativePrepareInfo aTNativePrepareInfo) {
        if (this.f12653c || view == null) {
            return;
        }
        try {
            List<View> clickViewList = aTNativePrepareInfo.getClickViewList();
            FrameLayout.LayoutParams choiceViewLayoutParams = aTNativePrepareInfo.getChoiceViewLayoutParams();
            T t10 = this.f12651a;
            if (t10 instanceof NativeAd) {
                NativeAd nativeAd = (NativeAd) t10;
                if (clickViewList != null && clickViewList.size() > 0) {
                    NativeAdLayout nativeAdLayout = this.f;
                    if (nativeAdLayout != null) {
                        nativeAd.registerViewForInteraction(nativeAdLayout, this.f12656g, this.f12657h, clickViewList);
                    } else {
                        nativeAd.registerViewForInteraction(view, this.f12656g, this.f12657h, clickViewList);
                    }
                } else {
                    NativeAdLayout nativeAdLayout2 = this.f;
                    if (nativeAdLayout2 != null) {
                        nativeAd.registerViewForInteraction(nativeAdLayout2, this.f12656g, this.f12657h);
                    } else {
                        nativeAd.registerViewForInteraction(view, this.f12656g, this.f12657h);
                    }
                }
            } else if (t10 instanceof NativeBannerAd) {
                NativeBannerAd nativeBannerAd = (NativeBannerAd) t10;
                if (clickViewList != null && clickViewList.size() > 0) {
                    NativeAdLayout nativeAdLayout3 = this.f;
                    if (nativeAdLayout3 != null) {
                        nativeBannerAd.registerViewForInteraction(nativeAdLayout3, this.f12657h, clickViewList);
                    } else {
                        nativeBannerAd.registerViewForInteraction(view, this.f12657h, clickViewList);
                    }
                } else {
                    NativeAdLayout nativeAdLayout4 = this.f;
                    if (nativeAdLayout4 != null) {
                        nativeBannerAd.registerViewForInteraction(nativeAdLayout4, this.f12657h);
                    } else {
                        nativeBannerAd.registerViewForInteraction(view, this.f12657h);
                    }
                }
            }
            AdOptionsView adOptionsView = new AdOptionsView(view.getContext(), this.f12651a, this.f);
            if (choiceViewLayoutParams == null) {
                choiceViewLayoutParams = new FrameLayout.LayoutParams(-2, -2);
                choiceViewLayoutParams.gravity = 53;
            }
            if (choiceViewLayoutParams.height > 0) {
                adOptionsView.setIconSizeDp((int) ((choiceViewLayoutParams.height / this.f12652b.getResources().getDisplayMetrics().density) + 0.5f));
            }
            this.f.addView(adOptionsView, choiceViewLayoutParams);
        } catch (Throwable unused) {
        }
    }

    @Override // com.facebook.ads.NativeAdListener
    public void onMediaDownloaded(Ad ad2) {
    }
}
