package com.huawei.hms.ads;

import android.content.Context;
import com.huawei.hms.ads.annotation.GlobalApi;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

@GlobalApi
/* loaded from: classes2.dex */
public class BannerAdSize extends AdSize {

    @GlobalApi
    public static final BannerAdSize BANNER_SIZE_360_57 = new BannerAdSize(360, 57);

    @GlobalApi
    public static final BannerAdSize BANNER_SIZE_360_144 = new BannerAdSize(360, 144);

    @GlobalApi
    public static final BannerAdSize BANNER_SIZE_320_50 = new BannerAdSize(320, 50);

    @GlobalApi
    public static final BannerAdSize BANNER_SIZE_DYNAMIC = new BannerAdSize(-3, -4);

    @GlobalApi
    public static final BannerAdSize BANNER_SIZE_468_60 = new BannerAdSize(468, 60);

    @GlobalApi
    public static final BannerAdSize BANNER_SIZE_INVALID = new BannerAdSize(0, 0);

    @GlobalApi
    public static final BannerAdSize BANNER_SIZE_320_100 = new BannerAdSize(320, 100);

    @GlobalApi
    public static final BannerAdSize BANNER_SIZE_728_90 = new BannerAdSize(728, 90);

    @GlobalApi
    public static final BannerAdSize BANNER_SIZE_300_250 = new BannerAdSize(300, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED);

    @GlobalApi
    public static final BannerAdSize BANNER_SIZE_SMART = new BannerAdSize(-1, -2);

    @GlobalApi
    public static final BannerAdSize BANNER_SIZE_160_600 = new BannerAdSize(160, 600);

    @GlobalApi
    public static final BannerAdSize BANNER_SIZE_ADVANCED = new BannerAdSize(-1, -5, 1);

    @GlobalApi
    public BannerAdSize(int i10, int i11) {
        super(i10, i11);
    }

    private static BannerAdSize Code(Context context, int i10, int i11) {
        int j10 = gb.z.j(i11, context);
        return j10 == 0 ? BANNER_SIZE_INVALID : new BannerAdSize(i10, gb.z.c(i10, j10), 1);
    }

    private boolean V() {
        if (this.C == 0 && this.S == 0) {
            return true;
        }
        return false;
    }

    @GlobalApi
    public static BannerAdSize getCurrentDirectionBannerSize(Context context, int i10) {
        return Code(context, i10, 0);
    }

    @GlobalApi
    public static BannerAdSize getLandscapeBannerSize(Context context, int i10) {
        return Code(context, i10, 2);
    }

    @GlobalApi
    public static BannerAdSize getPortraitBannerSize(Context context, int i10) {
        return Code(context, i10, 1);
    }

    @Override // com.huawei.hms.ads.AdSize
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.huawei.hms.ads.AdSize
    @GlobalApi
    public final int getHeight() {
        return super.getHeight();
    }

    @Override // com.huawei.hms.ads.AdSize
    @GlobalApi
    public final int getHeightPx(Context context) {
        return super.getHeightPx(context);
    }

    @Override // com.huawei.hms.ads.AdSize
    @GlobalApi
    public final int getWidth() {
        return super.getWidth();
    }

    @Override // com.huawei.hms.ads.AdSize
    @GlobalApi
    public final int getWidthPx(Context context) {
        return super.getWidthPx(context);
    }

    @Override // com.huawei.hms.ads.AdSize
    public final int hashCode() {
        return toString().hashCode();
    }

    @GlobalApi
    public final boolean isAutoHeightSize() {
        if (this.S == -2) {
            return true;
        }
        return false;
    }

    @GlobalApi
    public final boolean isDynamicSize() {
        if (this.C == -3 && this.S == -4) {
            return true;
        }
        return false;
    }

    @GlobalApi
    public final boolean isFullWidthSize() {
        if (this.C == -1) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String valueOf;
        String valueOf2;
        if (isDynamicSize()) {
            return "fluid";
        }
        if (Code()) {
            return "smart_banner";
        }
        if (V()) {
            return "invalid";
        }
        if (isFullWidthSize()) {
            valueOf = "FULL_WIDTH";
        } else {
            valueOf = String.valueOf(this.C);
        }
        if (isAutoHeightSize()) {
            valueOf2 = "AUTO_HEIGHT";
        } else {
            valueOf2 = String.valueOf(this.S);
        }
        return e0.i.f(valueOf, "x", valueOf2);
    }

    private BannerAdSize(int i10, int i11, int i12) {
        super(i10, i11);
        this.F = i12;
    }

    private boolean Code() {
        return this.C == -1 && this.S == -2;
    }
}
