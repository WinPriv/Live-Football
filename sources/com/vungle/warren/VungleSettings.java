package com.vungle.warren;

import com.vungle.warren.model.SessionData;
import com.vungle.warren.session.SessionAttribute;
import com.vungle.warren.session.SessionEvent;

/* loaded from: classes2.dex */
public final class VungleSettings {
    private static final long MEGABYTE = 1048576;
    private final boolean androidIdOptedOut;
    private final boolean disableRefresh;
    private final long maximumStorageForCleverCache;
    private final long minimumSpaceForAd;
    private final long minimumSpaceForInit;
    private final String priorityPlacement;

    /* loaded from: classes2.dex */
    public static class Builder {
        private boolean androidIdOptedOut;
        private boolean disableRefresh;
        private long minimumSpaceForInit = 53477376;
        private long minimumSpaceForAd = 52428800;
        private long maximumStorageForCleverCache = 104857600;
        private String priorityPlacement = null;

        public VungleSettings build() {
            return new VungleSettings(this);
        }

        public Builder disableBannerRefresh() {
            this.disableRefresh = true;
            return this;
        }

        public Builder setAndroidIdOptOut(boolean z10) {
            this.androidIdOptedOut = z10;
            SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.ANDROID_ID).addData(SessionAttribute.USED, !z10).build());
            return this;
        }

        public Builder setMaximumStorageForCleverCache(long j10) {
            this.maximumStorageForCleverCache = j10;
            return this;
        }

        public Builder setMinimumSpaceForAd(long j10) {
            this.minimumSpaceForAd = j10;
            return this;
        }

        public Builder setMinimumSpaceForInit(long j10) {
            this.minimumSpaceForInit = j10;
            return this;
        }

        public Builder setPriorityPlacement(String str) {
            this.priorityPlacement = str;
            return this;
        }
    }

    public boolean getAndroidIdOptOut() {
        return this.androidIdOptedOut;
    }

    public boolean getBannerRefreshDisabled() {
        return this.disableRefresh;
    }

    public long getMaximumStorageForCleverCache() {
        return this.maximumStorageForCleverCache;
    }

    public long getMinimumSpaceForAd() {
        return this.minimumSpaceForAd;
    }

    public long getMinimumSpaceForInit() {
        return this.minimumSpaceForInit;
    }

    public String getPriorityPlacement() {
        return this.priorityPlacement;
    }

    private VungleSettings(Builder builder) {
        this.minimumSpaceForAd = builder.minimumSpaceForAd;
        this.minimumSpaceForInit = builder.minimumSpaceForInit;
        this.androidIdOptedOut = builder.androidIdOptedOut;
        this.disableRefresh = builder.disableRefresh;
        this.maximumStorageForCleverCache = builder.maximumStorageForCleverCache;
        this.priorityPlacement = builder.priorityPlacement;
    }
}
