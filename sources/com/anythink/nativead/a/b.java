package com.anythink.nativead.a;

import android.graphics.Bitmap;
import android.view.View;
import com.anythink.core.api.ATAdAppInfo;
import com.anythink.core.api.ATCustomVideo;
import com.anythink.core.api.ATShakeViewListener;
import com.anythink.nativead.api.ATNativeMaterial;
import com.anythink.nativead.unitgroup.api.CustomNativeAd;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class b implements ATNativeMaterial {

    /* renamed from: a, reason: collision with root package name */
    CustomNativeAd f12595a;

    public b(CustomNativeAd customNativeAd) {
        this.f12595a = customNativeAd;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final ATAdAppInfo getAdAppInfo() {
        CustomNativeAd customNativeAd = this.f12595a;
        if (customNativeAd != null) {
            return customNativeAd.getAdAppInfo();
        }
        return null;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getAdChoiceIconUrl() {
        CustomNativeAd customNativeAd = this.f12595a;
        if (customNativeAd != null) {
            return customNativeAd.getAdChoiceIconUrl();
        }
        return "";
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getAdFrom() {
        CustomNativeAd customNativeAd = this.f12595a;
        if (customNativeAd != null) {
            return customNativeAd.getAdFrom();
        }
        return "";
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final View getAdIconView() {
        CustomNativeAd customNativeAd = this.f12595a;
        if (customNativeAd != null) {
            return customNativeAd.getAdIconView();
        }
        return null;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final Bitmap getAdLogo() {
        CustomNativeAd customNativeAd = this.f12595a;
        if (customNativeAd != null) {
            return customNativeAd.getAdLogo();
        }
        return null;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final View getAdLogoView() {
        CustomNativeAd customNativeAd = this.f12595a;
        if (customNativeAd != null) {
            return customNativeAd.getAdLogoView();
        }
        return null;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final View getAdMediaView(Object... objArr) {
        CustomNativeAd customNativeAd;
        if (this.f12595a.isNativeExpress() || (customNativeAd = this.f12595a) == null) {
            return null;
        }
        return customNativeAd.getAdMediaView(objArr);
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getAdType() {
        CustomNativeAd customNativeAd = this.f12595a;
        if (customNativeAd != null) {
            return customNativeAd.getAdType();
        }
        return "0";
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getAdvertiserName() {
        CustomNativeAd customNativeAd = this.f12595a;
        if (customNativeAd != null) {
            return customNativeAd.getAdvertiserName();
        }
        return "";
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getAppCommentNum() {
        CustomNativeAd customNativeAd = this.f12595a;
        if (customNativeAd != null) {
            return customNativeAd.getAppCommentNum();
        }
        return 0;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final View getAppDownloadButton() {
        CustomNativeAd customNativeAd = this.f12595a;
        if (customNativeAd != null) {
            return customNativeAd.getAppDownloadButton();
        }
        return null;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final double getAppPrice() {
        CustomNativeAd customNativeAd = this.f12595a;
        if (customNativeAd != null) {
            return customNativeAd.getAppPrice();
        }
        return 0.0d;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getCallToActionText() {
        CustomNativeAd customNativeAd = this.f12595a;
        if (customNativeAd != null) {
            return customNativeAd.getCallToActionText();
        }
        return "";
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getDescriptionText() {
        CustomNativeAd customNativeAd = this.f12595a;
        if (customNativeAd != null) {
            return customNativeAd.getDescriptionText();
        }
        return "";
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getDomain() {
        CustomNativeAd customNativeAd = this.f12595a;
        if (customNativeAd != null) {
            return customNativeAd.getDomain();
        }
        return "";
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getIconImageUrl() {
        CustomNativeAd customNativeAd = this.f12595a;
        if (customNativeAd != null) {
            return customNativeAd.getIconImageUrl();
        }
        return "";
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final List<String> getImageUrlList() {
        CustomNativeAd customNativeAd = this.f12595a;
        if (customNativeAd != null) {
            return customNativeAd.getImageUrlList();
        }
        return null;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getMainImageHeight() {
        CustomNativeAd customNativeAd = this.f12595a;
        if (customNativeAd != null) {
            return customNativeAd.getMainImageHeight();
        }
        return 0;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getMainImageUrl() {
        CustomNativeAd customNativeAd = this.f12595a;
        if (customNativeAd != null) {
            return customNativeAd.getMainImageUrl();
        }
        return "";
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getMainImageWidth() {
        CustomNativeAd customNativeAd = this.f12595a;
        if (customNativeAd != null) {
            return customNativeAd.getMainImageWidth();
        }
        return 0;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getNativeAdInteractionType() {
        CustomNativeAd customNativeAd = this.f12595a;
        if (customNativeAd != null) {
            return customNativeAd.getNativeAdInteractionType();
        }
        return 0;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final ATCustomVideo getNativeCustomVideo() {
        CustomNativeAd customNativeAd = this.f12595a;
        if (customNativeAd != null) {
            return customNativeAd.getNativeCustomVideo();
        }
        return null;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getNativeExpressHeight() {
        CustomNativeAd customNativeAd = this.f12595a;
        if (customNativeAd != null) {
            return customNativeAd.getNativeExpressHeight();
        }
        return 0;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getNativeExpressWidth() {
        CustomNativeAd customNativeAd = this.f12595a;
        if (customNativeAd != null) {
            return customNativeAd.getNativeExpressWidth();
        }
        return 0;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getNativeType() {
        CustomNativeAd customNativeAd = this.f12595a;
        if (customNativeAd != null) {
            return customNativeAd.getNativeType();
        }
        return 0;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final Map<String, Object> getNetworkInfoMap() {
        CustomNativeAd customNativeAd = this.f12595a;
        if (customNativeAd != null) {
            return customNativeAd.getNetworkInfoMap();
        }
        return null;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final View getShakeView(int i10, int i11, ATShakeViewListener aTShakeViewListener) {
        CustomNativeAd customNativeAd = this.f12595a;
        if (customNativeAd != null) {
            return customNativeAd.getShakeView(i10, i11, aTShakeViewListener);
        }
        return null;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final Double getStarRating() {
        CustomNativeAd customNativeAd = this.f12595a;
        double d10 = 0.0d;
        if (customNativeAd != null && customNativeAd.getStarRating() != null) {
            d10 = this.f12595a.getStarRating().doubleValue();
        }
        return Double.valueOf(d10);
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getTitle() {
        CustomNativeAd customNativeAd = this.f12595a;
        if (customNativeAd != null) {
            return customNativeAd.getTitle();
        }
        return "";
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final double getVideoDuration() {
        CustomNativeAd customNativeAd = this.f12595a;
        if (customNativeAd != null) {
            return customNativeAd.getVideoDuration();
        }
        return 0.0d;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getVideoHeight() {
        CustomNativeAd customNativeAd = this.f12595a;
        if (customNativeAd != null) {
            return customNativeAd.getVideoHeight();
        }
        return 0;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final double getVideoProgress() {
        return this.f12595a.getVideoProgress();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getVideoUrl() {
        CustomNativeAd customNativeAd = this.f12595a;
        if (customNativeAd != null) {
            return customNativeAd.getVideoUrl();
        }
        return "";
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getVideoWidth() {
        CustomNativeAd customNativeAd = this.f12595a;
        if (customNativeAd != null) {
            return customNativeAd.getVideoWidth();
        }
        return 0;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getWarning() {
        CustomNativeAd customNativeAd = this.f12595a;
        if (customNativeAd != null) {
            return customNativeAd.getWarning();
        }
        return "";
    }
}
