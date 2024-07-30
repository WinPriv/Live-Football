package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* loaded from: classes2.dex */
public class ISBannerSize {

    /* renamed from: a, reason: collision with root package name */
    public final int f24802a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24803b;

    /* renamed from: c, reason: collision with root package name */
    public final String f24804c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f24805d;
    public static final ISBannerSize BANNER = new ISBannerSize("BANNER", 320, 50);
    public static final ISBannerSize LARGE = new ISBannerSize("LARGE", 320, 90);
    public static final ISBannerSize RECTANGLE = new ISBannerSize("RECTANGLE", 300, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED);

    /* renamed from: e, reason: collision with root package name */
    public static final ISBannerSize f24801e = new ISBannerSize("LEADERBOARD", 728, 90);
    public static final ISBannerSize SMART = new ISBannerSize("SMART", 0, 0);

    public ISBannerSize(int i10, int i11) {
        this("CUSTOM", i10, i11);
    }

    public String getDescription() {
        return this.f24804c;
    }

    public int getHeight() {
        return this.f24803b;
    }

    public int getWidth() {
        return this.f24802a;
    }

    public boolean isAdaptive() {
        return this.f24805d;
    }

    public boolean isSmart() {
        return this.f24804c.equals("SMART");
    }

    public void setAdaptive(boolean z10) {
        this.f24805d = z10;
    }

    public ISBannerSize(String str, int i10, int i11) {
        this.f24804c = str;
        this.f24802a = i10;
        this.f24803b = i11;
    }
}
