package com.applovin.mediation.nativeAds;

import android.view.View;

/* loaded from: classes.dex */
public class MaxNativeAdViewBinder {
    protected final int advertiserTextViewId;
    protected final int bodyTextViewId;
    protected final int callToActionButtonId;
    protected final int iconContentViewId;
    protected final int iconImageViewId;
    protected final int layoutResourceId;
    protected final View mainView;
    protected final int mediaContentFrameLayoutId;
    protected final int mediaContentViewGroupId;
    protected final int optionsContentFrameLayoutId;
    protected final int optionsContentViewGroupId;
    protected final int starRatingContentViewGroupId;
    protected final String templateType;
    protected final int titleTextViewId;

    /* loaded from: classes.dex */
    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final View f19647a;

        /* renamed from: b, reason: collision with root package name */
        private final int f19648b;

        /* renamed from: c, reason: collision with root package name */
        private int f19649c;

        /* renamed from: d, reason: collision with root package name */
        private int f19650d;

        /* renamed from: e, reason: collision with root package name */
        private int f19651e;
        private int f;

        /* renamed from: g, reason: collision with root package name */
        private int f19652g;

        /* renamed from: h, reason: collision with root package name */
        private int f19653h;

        /* renamed from: i, reason: collision with root package name */
        private int f19654i;

        /* renamed from: j, reason: collision with root package name */
        private int f19655j;

        /* renamed from: k, reason: collision with root package name */
        private int f19656k;

        /* renamed from: l, reason: collision with root package name */
        private int f19657l;

        /* renamed from: m, reason: collision with root package name */
        private int f19658m;

        /* renamed from: n, reason: collision with root package name */
        private String f19659n;

        public Builder(View view) {
            this(-1, view);
        }

        public MaxNativeAdViewBinder build() {
            return new MaxNativeAdViewBinder(this.f19647a, this.f19648b, this.f19649c, this.f19650d, this.f19651e, this.f, this.f19652g, this.f19655j, this.f19653h, this.f19654i, this.f19656k, this.f19657l, this.f19658m, this.f19659n);
        }

        public Builder setAdvertiserTextViewId(int i10) {
            this.f19650d = i10;
            return this;
        }

        public Builder setBodyTextViewId(int i10) {
            this.f19651e = i10;
            return this;
        }

        public Builder setCallToActionButtonId(int i10) {
            this.f19658m = i10;
            return this;
        }

        @Deprecated
        public Builder setIconContentViewId(int i10) {
            this.f19652g = i10;
            return this;
        }

        public Builder setIconImageViewId(int i10) {
            this.f = i10;
            return this;
        }

        @Deprecated
        public Builder setMediaContentFrameLayoutId(int i10) {
            this.f19657l = i10;
            return this;
        }

        public Builder setMediaContentViewGroupId(int i10) {
            this.f19656k = i10;
            return this;
        }

        @Deprecated
        public Builder setOptionsContentFrameLayoutId(int i10) {
            this.f19654i = i10;
            return this;
        }

        public Builder setOptionsContentViewGroupId(int i10) {
            this.f19653h = i10;
            return this;
        }

        public Builder setStarRatingContentViewGroupId(int i10) {
            this.f19655j = i10;
            return this;
        }

        public Builder setTemplateType(String str) {
            this.f19659n = str;
            return this;
        }

        public Builder setTitleTextViewId(int i10) {
            this.f19649c = i10;
            return this;
        }

        public Builder(int i10) {
            this(i10, null);
        }

        private Builder(int i10, View view) {
            this.f19649c = -1;
            this.f19650d = -1;
            this.f19651e = -1;
            this.f = -1;
            this.f19652g = -1;
            this.f19653h = -1;
            this.f19654i = -1;
            this.f19655j = -1;
            this.f19656k = -1;
            this.f19657l = -1;
            this.f19658m = -1;
            this.f19648b = i10;
            this.f19647a = view;
        }
    }

    private MaxNativeAdViewBinder(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, String str) {
        this.mainView = view;
        this.layoutResourceId = i10;
        this.titleTextViewId = i11;
        this.advertiserTextViewId = i12;
        this.bodyTextViewId = i13;
        this.iconImageViewId = i14;
        this.iconContentViewId = i15;
        this.starRatingContentViewGroupId = i16;
        this.optionsContentViewGroupId = i17;
        this.optionsContentFrameLayoutId = i18;
        this.mediaContentViewGroupId = i19;
        this.mediaContentFrameLayoutId = i20;
        this.callToActionButtonId = i21;
        this.templateType = str;
    }
}
