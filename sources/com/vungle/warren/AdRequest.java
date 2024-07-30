package com.vungle.warren;

import com.vungle.warren.model.admarkup.AdMarkup;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class AdRequest implements Serializable {
    private final long adCount;
    private final AdMarkup adMarkup;
    private final boolean isExplicit;
    private final String placementId;
    public AtomicLong timeStamp;

    @Type
    private final int type;

    /* loaded from: classes2.dex */
    public @interface Type {
        public static final int NORMAL = 0;
        public static final int NO_ASSETS = 1;
        public static final int SINGLE_HBP = 2;
    }

    public AdRequest(String str, @Type int i10, long j10, boolean z10) {
        this.timeStamp = new AtomicLong(0L);
        this.placementId = str;
        this.adMarkup = null;
        this.type = i10;
        this.adCount = j10;
        this.isExplicit = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AdRequest.class != obj.getClass()) {
            return false;
        }
        AdRequest adRequest = (AdRequest) obj;
        if (this.type != adRequest.type || !this.placementId.equals(adRequest.placementId)) {
            return false;
        }
        AdMarkup adMarkup = this.adMarkup;
        AdMarkup adMarkup2 = adRequest.adMarkup;
        if (adMarkup != null) {
            return adMarkup.equals(adMarkup2);
        }
        if (adMarkup2 == null) {
            return true;
        }
        return false;
    }

    public long getAdCount() {
        return this.adCount;
    }

    public AdMarkup getAdMarkup() {
        return this.adMarkup;
    }

    public String getEventId() {
        AdMarkup adMarkup = this.adMarkup;
        if (adMarkup == null) {
            return null;
        }
        return adMarkup.getEventId();
    }

    public String[] getImpression() {
        if (getAdMarkup() != null) {
            return getAdMarkup().getImpressions();
        }
        return null;
    }

    public boolean getIsExplicit() {
        return this.isExplicit;
    }

    public String getPlacementId() {
        return this.placementId;
    }

    @Type
    public int getType() {
        return this.type;
    }

    public int hashCode() {
        int i10;
        int hashCode = this.placementId.hashCode() * 31;
        AdMarkup adMarkup = this.adMarkup;
        if (adMarkup != null) {
            i10 = adMarkup.hashCode();
        } else {
            i10 = 0;
        }
        return ((hashCode + i10) * 31) + this.type;
    }

    public String toString() {
        return "AdRequest{placementId='" + this.placementId + "', adMarkup=" + this.adMarkup + ", type=" + this.type + ", adCount=" + this.adCount + ", isExplicit=" + this.isExplicit + '}';
    }

    public AdRequest(String str, AdMarkup adMarkup, boolean z10) {
        this.timeStamp = new AtomicLong(0L);
        this.placementId = str;
        this.adMarkup = adMarkup;
        this.type = 0;
        this.adCount = 1L;
        this.isExplicit = z10;
    }

    public AdRequest(String str, boolean z10) {
        this(str, null, z10);
    }
}
