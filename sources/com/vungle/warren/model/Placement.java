package com.vungle.warren.model;

import com.vungle.warren.AdConfig;

/* loaded from: classes2.dex */
public class Placement {
    private static final String AD_SIZE = "ad_size";
    public static final int INVALID_INTEGER_VALUE = Integer.MIN_VALUE;
    private static final String SUPPORTED_TEMPLATE_TYPES = "supported_template_types";
    private static final String TAG = "Placement";
    public static final int TYPE_DEFAULT = 0;
    public static final int TYPE_DEPRECATED_TEMPLATE = 2;
    public static final int TYPE_VUNGLE_BANNER = 1;
    public static final int TYPE_VUNGLE_MREC = 3;
    public static final int TYPE_VUNGLE_NATIVE = 4;
    int adRefreshDuration;
    protected AdConfig.AdSize adSize;
    int autoCachePriority;
    boolean autoCached;
    boolean headerBidding;
    String identifier;
    boolean incentivized;
    boolean isValid;
    int maxHbCache;

    @PlacementAdType
    int placementAdType;
    protected AdConfig.AdSize recommendedAdSize;
    long wakeupTime;

    /* loaded from: classes2.dex */
    public @interface PlacementAdType {
    }

    public Placement(String str) {
        this.placementAdType = 0;
        this.recommendedAdSize = AdConfig.AdSize.VUNGLE_DEFAULT;
        this.identifier = str;
        this.autoCached = false;
        this.incentivized = false;
        this.headerBidding = false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Placement placement = (Placement) obj;
        String str = this.identifier;
        if (str == null ? placement.identifier != null : !str.equals(placement.identifier)) {
            return false;
        }
        if (this.placementAdType == placement.placementAdType && this.autoCached == placement.autoCached && this.incentivized == placement.incentivized && this.headerBidding == placement.headerBidding && this.isValid == placement.isValid) {
            return true;
        }
        return false;
    }

    public int getAdRefreshDuration() {
        int i10 = this.adRefreshDuration;
        if (i10 <= 0) {
            return 0;
        }
        return i10;
    }

    public AdConfig.AdSize getAdSize() {
        AdConfig.AdSize adSize = this.adSize;
        if (adSize == null) {
            return AdConfig.AdSize.VUNGLE_DEFAULT;
        }
        return adSize;
    }

    public int getAutoCachePriority() {
        return this.autoCachePriority;
    }

    public String getId() {
        return this.identifier;
    }

    public int getMaxHbCache() {
        return this.maxHbCache;
    }

    @PlacementAdType
    public int getPlacementAdType() {
        return this.placementAdType;
    }

    public AdConfig.AdSize getRecommendedAdSize() {
        return this.recommendedAdSize;
    }

    public long getWakeupTime() {
        return this.wakeupTime;
    }

    public int hashCode() {
        int i10;
        String str = this.identifier;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return (((((((((i10 * 31) + this.placementAdType) * 31) + (this.autoCached ? 1 : 0)) * 31) + (this.incentivized ? 1 : 0)) * 31) + (this.headerBidding ? 1 : 0)) * 31) + (this.isValid ? 1 : 0);
    }

    public boolean isAutoCached() {
        if (this.maxHbCache == 0 && this.headerBidding) {
            return false;
        }
        if (AdConfig.AdSize.isNonMrecBannerAdSize(this.adSize)) {
            return true;
        }
        return this.autoCached;
    }

    public boolean isHeaderBidding() {
        return this.headerBidding;
    }

    public boolean isIncentivized() {
        return this.incentivized;
    }

    public boolean isMultipleHBPEnabled() {
        if (this.headerBidding && this.maxHbCache > 0) {
            return true;
        }
        return false;
    }

    public boolean isSingleHBPEnabled() {
        if (this.headerBidding && this.maxHbCache == 1) {
            return true;
        }
        return false;
    }

    public boolean isValid() {
        return this.isValid;
    }

    public void setAdSize(AdConfig.AdSize adSize) {
        this.adSize = adSize;
    }

    public void setValid(boolean z10) {
        this.isValid = z10;
    }

    public void setWakeupTime(long j10) {
        this.wakeupTime = j10;
    }

    public void snooze(long j10) {
        this.wakeupTime = (j10 * 1000) + System.currentTimeMillis();
    }

    public String toString() {
        return "Placement{identifier='" + this.identifier + "', autoCached=" + this.autoCached + ", incentivized=" + this.incentivized + ", wakeupTime=" + this.wakeupTime + ", adRefreshDuration=" + this.adRefreshDuration + ", autoCachePriority=" + this.autoCachePriority + ", headerBidding=" + this.headerBidding + ", isValid=" + this.isValid + ", placementAdType=" + this.placementAdType + ", adSize=" + this.adSize + ", maxHbCache=" + this.maxHbCache + ", adSize=" + this.adSize + ", recommendedAdSize=" + this.recommendedAdSize + '}';
    }

    public Placement() {
        this.placementAdType = 0;
        this.recommendedAdSize = AdConfig.AdSize.VUNGLE_DEFAULT;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0178, code lost:
    
        if (r8.equals(com.anythink.expressad.foundation.g.a.f.f9817e) == false) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Placement(m8.q r8) throws java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.model.Placement.<init>(m8.q):void");
    }
}
