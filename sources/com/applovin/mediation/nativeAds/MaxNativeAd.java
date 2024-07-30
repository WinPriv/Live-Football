package com.applovin.mediation.nativeAds;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.applovin.impl.mediation.nativeAds.MaxNativeAdImpl;
import com.applovin.mediation.MaxAdFormat;
import java.util.List;

/* loaded from: classes.dex */
public class MaxNativeAd extends MaxNativeAdImpl {
    private static final float MINIMUM_STARS_TO_RENDER = 3.0f;
    private final String advertiser;
    private final String body;
    private final String callToAction;
    private final MaxAdFormat format;
    private final MaxNativeAdImage icon;
    private final View iconView;
    private boolean isExpired;
    private final MaxNativeAdImage mainImage;
    private final float mediaContentAspectRatio;
    private final View mediaView;
    private MaxNativeAdView nativeAdView;
    private final View optionsView;
    private final Double starRating;
    private final String title;

    /* loaded from: classes.dex */
    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private MaxAdFormat f19615a;

        /* renamed from: b, reason: collision with root package name */
        private String f19616b;

        /* renamed from: c, reason: collision with root package name */
        private String f19617c;

        /* renamed from: d, reason: collision with root package name */
        private String f19618d;

        /* renamed from: e, reason: collision with root package name */
        private String f19619e;
        private MaxNativeAdImage f;

        /* renamed from: g, reason: collision with root package name */
        private View f19620g;

        /* renamed from: h, reason: collision with root package name */
        private View f19621h;

        /* renamed from: i, reason: collision with root package name */
        private View f19622i;

        /* renamed from: j, reason: collision with root package name */
        private MaxNativeAdImage f19623j;

        /* renamed from: k, reason: collision with root package name */
        private float f19624k;

        /* renamed from: l, reason: collision with root package name */
        private Double f19625l;

        public MaxNativeAd build() {
            return new MaxNativeAd(this);
        }

        public Builder setAdFormat(MaxAdFormat maxAdFormat) {
            this.f19615a = maxAdFormat;
            return this;
        }

        public Builder setAdvertiser(String str) {
            this.f19617c = str;
            return this;
        }

        public Builder setBody(String str) {
            this.f19618d = str;
            return this;
        }

        public Builder setCallToAction(String str) {
            this.f19619e = str;
            return this;
        }

        public Builder setIcon(MaxNativeAdImage maxNativeAdImage) {
            this.f = maxNativeAdImage;
            return this;
        }

        public Builder setIconView(View view) {
            this.f19620g = view;
            return this;
        }

        public Builder setMainImage(MaxNativeAdImage maxNativeAdImage) {
            this.f19623j = maxNativeAdImage;
            return this;
        }

        public Builder setMediaContentAspectRatio(float f) {
            this.f19624k = f;
            return this;
        }

        public Builder setMediaView(View view) {
            this.f19622i = view;
            return this;
        }

        public Builder setOptionsView(View view) {
            this.f19621h = view;
            return this;
        }

        public Builder setStarRating(Double d10) {
            this.f19625l = d10;
            return this;
        }

        public Builder setTitle(String str) {
            this.f19616b = str;
            return this;
        }
    }

    public MaxNativeAd(Builder builder) {
        this.format = builder.f19615a;
        this.title = builder.f19616b;
        this.advertiser = builder.f19617c;
        this.body = builder.f19618d;
        this.callToAction = builder.f19619e;
        this.icon = builder.f;
        this.iconView = builder.f19620g;
        this.optionsView = builder.f19621h;
        this.mediaView = builder.f19622i;
        this.mainImage = builder.f19623j;
        this.mediaContentAspectRatio = builder.f19624k;
        Double d10 = builder.f19625l;
        this.starRating = (d10 == null || d10.doubleValue() < 3.0d) ? null : d10;
    }

    public final String getAdvertiser() {
        return this.advertiser;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getCallToAction() {
        return this.callToAction;
    }

    public final MaxAdFormat getFormat() {
        return this.format;
    }

    public final MaxNativeAdImage getIcon() {
        return this.icon;
    }

    public final View getIconView() {
        return this.iconView;
    }

    public final MaxNativeAdImage getMainImage() {
        return this.mainImage;
    }

    public final float getMediaContentAspectRatio() {
        return this.mediaContentAspectRatio;
    }

    public final View getMediaView() {
        return this.mediaView;
    }

    public final View getOptionsView() {
        return this.optionsView;
    }

    public final Double getStarRating() {
        return this.starRating;
    }

    public final String getTitle() {
        return this.title;
    }

    public boolean isContainerClickable() {
        return false;
    }

    public final boolean isExpired() {
        return this.isExpired;
    }

    public void performClick() {
        Button callToActionButton;
        MaxNativeAdView maxNativeAdView = this.nativeAdView;
        if (maxNativeAdView != null && (callToActionButton = maxNativeAdView.getCallToActionButton()) != null) {
            callToActionButton.performClick();
        }
    }

    public boolean prepareForInteraction(List<View> list, ViewGroup viewGroup) {
        return false;
    }

    public void setExpired() {
        this.isExpired = true;
    }

    public void setNativeAdView(MaxNativeAdView maxNativeAdView) {
        this.nativeAdView = maxNativeAdView;
    }

    public boolean shouldPrepareViewForInteractionOnMainThread() {
        return true;
    }

    /* loaded from: classes.dex */
    public static class MaxNativeAdImage {

        /* renamed from: a, reason: collision with root package name */
        private Drawable f19626a;

        /* renamed from: b, reason: collision with root package name */
        private Uri f19627b;

        public MaxNativeAdImage(Drawable drawable) {
            this.f19626a = drawable;
        }

        public Drawable getDrawable() {
            return this.f19626a;
        }

        public Uri getUri() {
            return this.f19627b;
        }

        public MaxNativeAdImage(Uri uri) {
            this.f19627b = uri;
        }
    }

    @Deprecated
    public void prepareViewForInteraction(MaxNativeAdView maxNativeAdView) {
    }
}
