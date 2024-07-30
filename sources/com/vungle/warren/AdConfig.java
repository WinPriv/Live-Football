package com.vungle.warren;

import androidx.annotation.Keep;
import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.anythink.expressad.foundation.g.a.f;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.vungle.warren.model.ReportDBAdapter;
import n8.b;

/* loaded from: classes2.dex */
public class AdConfig extends BaseAdConfig {
    public static final int AUTO_ROTATE = 2;
    public static final int BOTTOM_LEFT = 2;
    public static final int BOTTOM_RIGHT = 3;
    public static final int IMMEDIATE_BACK = 2;
    public static final int IMMERSIVE = 4;
    public static final int LANDSCAPE = 1;
    public static final int MATCH_VIDEO = 3;
    public static final int PORTRAIT = 0;
    public static final int TOP_LEFT = 0;
    public static final int TOP_RIGHT = 1;
    public static final int TRANSITION_ANIMATE = 8;

    @AdOptionsPosition
    private int adOptionsPosition;

    @Orientation
    @b("adOrientation")
    private int adOrientation;

    @b(ReportDBAdapter.ReportColumns.COLUMN_ORDINAL)
    private int ordinal;
    protected boolean orientationChangedByApi;

    /* loaded from: classes2.dex */
    public @interface AdOptionsPosition {
    }

    @Keep
    /* loaded from: classes2.dex */
    public enum AdSize {
        VUNGLE_MREC("mrec", 300, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED),
        VUNGLE_DEFAULT(CallMraidJS.f, -1, -1),
        BANNER(f.f9817e, 320, 50),
        BANNER_SHORT("banner_short", 300, 50),
        BANNER_LEADERBOARD("banner_leaderboard", 728, 90);

        private final int height;
        private final String name;
        private final int width;

        AdSize(String str, int i10, int i11) {
            this.width = i10;
            this.height = i11;
            this.name = str;
        }

        public static AdSize fromName(String str) {
            for (AdSize adSize : values()) {
                if (adSize.name.equals(str)) {
                    return adSize;
                }
            }
            return VUNGLE_DEFAULT;
        }

        public static boolean isBannerAdSize(AdSize adSize) {
            if (adSize != BANNER && adSize != BANNER_LEADERBOARD && adSize != BANNER_SHORT && adSize != VUNGLE_MREC) {
                return false;
            }
            return true;
        }

        public static boolean isDefaultAdSize(AdSize adSize) {
            if (adSize != VUNGLE_DEFAULT && adSize != VUNGLE_MREC) {
                return false;
            }
            return true;
        }

        public static boolean isNonMrecBannerAdSize(AdSize adSize) {
            if (adSize != VUNGLE_MREC && isBannerAdSize(adSize)) {
                return true;
            }
            return false;
        }

        public int getHeight() {
            return this.height;
        }

        public String getName() {
            return this.name;
        }

        public int getWidth() {
            return this.width;
        }
    }

    /* loaded from: classes2.dex */
    public @interface Orientation {
    }

    /* loaded from: classes2.dex */
    public @interface Settings {
    }

    public AdConfig() {
        this.adOrientation = 2;
        this.adOptionsPosition = 1;
    }

    @AdOptionsPosition
    public int getAdOptionsPosition() {
        return this.adOptionsPosition;
    }

    @Orientation
    public int getAdOrientation() {
        return this.adOrientation;
    }

    @Override // com.vungle.warren.BaseAdConfig
    public /* bridge */ /* synthetic */ AdSize getAdSize() {
        return super.getAdSize();
    }

    public int getOrdinal() {
        return this.ordinal;
    }

    @Override // com.vungle.warren.BaseAdConfig
    public /* bridge */ /* synthetic */ int getSettings() {
        return super.getSettings();
    }

    public void setAdOptionsPosition(@AdOptionsPosition int i10) {
        this.adOptionsPosition = i10;
    }

    public void setAdOrientation(@Orientation int i10) {
        this.adOrientation = i10;
        this.orientationChangedByApi = true;
    }

    @Override // com.vungle.warren.BaseAdConfig
    public /* bridge */ /* synthetic */ void setAdSize(AdSize adSize) {
        super.setAdSize(adSize);
    }

    public void setBackButtonImmediatelyEnabled(boolean z10) {
        if (z10) {
            this.settings |= 2;
        } else {
            this.settings &= -3;
        }
    }

    public void setImmersiveMode(boolean z10) {
        if (z10) {
            this.settings |= 4;
        } else {
            this.settings &= -5;
        }
    }

    @Override // com.vungle.warren.BaseAdConfig
    public /* bridge */ /* synthetic */ void setMuted(boolean z10) {
        super.setMuted(z10);
    }

    public void setOrdinal(int i10) {
        this.ordinal = i10;
    }

    public void setTransitionAnimationEnabled(boolean z10) {
        if (z10) {
            this.settings |= 8;
        } else {
            this.settings &= -9;
        }
    }

    public AdConfig(AdSize adSize) {
        super(adSize);
        this.adOrientation = 2;
        this.adOptionsPosition = 1;
    }

    public AdConfig(BaseAdConfig baseAdConfig) {
        super(baseAdConfig);
        this.adOrientation = 2;
        this.adOptionsPosition = 1;
    }
}
