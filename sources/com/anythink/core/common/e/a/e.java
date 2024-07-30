package com.anythink.core.common.e.a;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.anythink.core.api.ATAdAppInfo;
import com.anythink.core.api.ATCustomVideo;
import com.anythink.core.api.ATShakeViewListener;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.b.l;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class e extends BaseAd implements a, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private int f5410a;

    /* renamed from: b, reason: collision with root package name */
    private int f5411b;

    /* renamed from: c, reason: collision with root package name */
    private int f5412c;

    /* renamed from: d, reason: collision with root package name */
    private int f5413d;

    /* renamed from: e, reason: collision with root package name */
    private int f5414e;
    private BaseAd f;

    /* renamed from: g, reason: collision with root package name */
    private Map<String, Object> f5415g;

    public e(BaseAd baseAd, Map<String, Object> map) {
        this.f5410a = 1;
        this.f5411b = 5;
        this.f5412c = 1;
        this.f5414e = 5;
        this.f = baseAd;
        this.f5415g = map;
        Object obj = map.get("orientation");
        if (obj != null) {
            this.f5410a = Integer.parseInt(obj.toString());
        }
        Object obj2 = map.get("countdown");
        if (obj2 != null) {
            this.f5411b = Integer.parseInt(obj2.toString());
        }
        Object obj3 = map.get("allows_skip");
        if (obj3 != null) {
            this.f5412c = Integer.parseInt(obj3.toString());
        }
        Object obj4 = map.get("button_type");
        if (obj4 != null) {
            this.f5413d = Integer.parseInt(obj4.toString());
        }
        Object obj5 = map.get("s_c_t");
        if (obj5 != null) {
            this.f5414e = Integer.parseInt(obj5.toString());
        }
    }

    private void a(Map<String, Object> map) {
        Object obj = map.get("orientation");
        if (obj != null) {
            this.f5410a = Integer.parseInt(obj.toString());
        }
        Object obj2 = map.get("countdown");
        if (obj2 != null) {
            this.f5411b = Integer.parseInt(obj2.toString());
        }
        Object obj3 = map.get("allows_skip");
        if (obj3 != null) {
            this.f5412c = Integer.parseInt(obj3.toString());
        }
        Object obj4 = map.get("button_type");
        if (obj4 != null) {
            this.f5413d = Integer.parseInt(obj4.toString());
        }
        Object obj5 = map.get("s_c_t");
        if (obj5 != null) {
            this.f5414e = Integer.parseInt(obj5.toString());
        }
    }

    @Override // com.anythink.core.common.e.a.a
    public final long b() {
        return this.f5411b;
    }

    @Override // com.anythink.core.common.e.a.a
    public final int c() {
        int i10 = this.f5412c;
        if (i10 == 1 || i10 != 0) {
            return 0;
        }
        return 1;
    }

    @Override // com.anythink.core.common.e.a.a
    public final int d() {
        int i10 = this.f5413d;
        if (i10 != 1) {
            if (i10 == 2) {
                return 1;
            }
            return 2;
        }
        return 0;
    }

    @Override // com.anythink.core.api.BaseAd
    public final void destroy() {
        this.f.destroy();
    }

    @Override // com.anythink.core.common.e.a.a
    public final int e() {
        return this.f5414e;
    }

    @Override // com.anythink.core.common.e.a.a
    public final int f() {
        Object obj;
        if (this.f.getDetail() == null || this.f.getDetail().H() != 8 || (obj = this.f5415g.get("video_muted")) == null) {
            return 0;
        }
        return TextUtils.equals(obj.toString(), "0") ? 1 : 0;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final ATAdAppInfo getAdAppInfo() {
        return this.f.getAdAppInfo();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getAdChoiceIconUrl() {
        return this.f.getAdChoiceIconUrl();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getAdFrom() {
        return this.f.getAdFrom();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final View getAdIconView() {
        return null;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final Bitmap getAdLogo() {
        return this.f.getAdLogo();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final View getAdLogoView() {
        return this.f.getAdLogoView();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final View getAdMediaView(Object... objArr) {
        return this.f.getAdMediaView(objArr);
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getAdType() {
        return this.f.getAdType();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getAdvertiserName() {
        return this.f.getAdvertiserName();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getAppCommentNum() {
        return this.f.getAppCommentNum();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final View getAppDownloadButton() {
        return this.f.getAppDownloadButton();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final double getAppPrice() {
        return this.f.getAppPrice();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getCallToActionText() {
        return this.f.getCallToActionText();
    }

    @Override // com.anythink.core.api.BaseAd
    public final ViewGroup getCustomAdContainer() {
        return this.f.getCustomAdContainer();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getDescriptionText() {
        return this.f.getDescriptionText();
    }

    @Override // com.anythink.core.api.BaseAd
    public final com.anythink.core.common.e.e getDetail() {
        return this.f.getDetail();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getDomain() {
        BaseAd baseAd = this.f;
        if (baseAd != null) {
            return baseAd.getDomain();
        }
        return "";
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getIconImageUrl() {
        return this.f.getIconImageUrl();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final List<String> getImageUrlList() {
        return this.f.getImageUrlList();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getMainImageHeight() {
        return this.f.getMainImageHeight();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getMainImageUrl() {
        return this.f.getMainImageUrl();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getMainImageWidth() {
        return this.f.getMainImageWidth();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getNativeAdInteractionType() {
        return this.f.getNativeAdInteractionType();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final ATCustomVideo getNativeCustomVideo() {
        return this.f.getNativeCustomVideo();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getNativeExpressHeight() {
        return this.f.getNativeExpressHeight();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getNativeExpressWidth() {
        return this.f.getNativeExpressWidth();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getNativeType() {
        return this.f.getNativeType();
    }

    @Override // com.anythink.core.api.BaseAd, com.anythink.core.api.IATThirdPartyMaterial
    public final Map<String, Object> getNetworkInfoMap() {
        return this.f.getNetworkInfoMap();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final View getShakeView(int i10, int i11, ATShakeViewListener aTShakeViewListener) {
        BaseAd baseAd = this.f;
        if (baseAd != null) {
            return baseAd.getShakeView(i10, i11, aTShakeViewListener);
        }
        return null;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final Double getStarRating() {
        return this.f.getStarRating();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getTitle() {
        return this.f.getTitle();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final double getVideoDuration() {
        return this.f.getVideoDuration();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getVideoHeight() {
        return this.f.getVideoHeight();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final double getVideoProgress() {
        return this.f.getVideoProgress();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getVideoUrl() {
        return this.f.getVideoUrl();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getVideoWidth() {
        return this.f.getVideoWidth();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getWarning() {
        BaseAd baseAd = this.f;
        if (baseAd != null) {
            return baseAd.getWarning();
        }
        return "";
    }

    @Override // com.anythink.core.api.BaseAd
    public final void registerListener(View view, List<View> list, FrameLayout.LayoutParams layoutParams) {
        this.f.registerListener(view, list, layoutParams);
    }

    @Override // com.anythink.core.api.BaseAd
    public final void setNativeEventListener(l lVar) {
        this.f.setNativeEventListener(lVar);
    }

    @Override // com.anythink.core.api.BaseAd
    public final void setNetworkInfoMap(Map<String, Object> map) {
        this.f.setNetworkInfoMap(map);
    }

    @Override // com.anythink.core.api.BaseAd
    public final void setTrackingInfo(com.anythink.core.common.e.e eVar) {
        this.f.setTrackingInfo(eVar);
    }

    @Override // com.anythink.core.api.BaseAd
    public final void setVideoMute(boolean z10) {
        this.f.setVideoMute(z10);
    }

    @Override // com.anythink.core.common.e.a.a
    public final int a() {
        return this.f5410a;
    }
}
