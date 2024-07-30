package com.anythink.core.api;

/* loaded from: classes.dex */
public class ATCustomAdapterConfig {
    private long adCacheTime;
    private boolean realTimeBidSwitch;

    /* loaded from: classes.dex */
    public static class Builder {
        private boolean realTimeBidSwitch = false;
        private long adCacheTime = 1800000;

        public Builder adCacheTime(long j10) {
            this.adCacheTime = j10;
            return this;
        }

        public ATCustomAdapterConfig build() {
            ATCustomAdapterConfig aTCustomAdapterConfig = new ATCustomAdapterConfig();
            aTCustomAdapterConfig.realTimeBidSwitch = this.realTimeBidSwitch;
            aTCustomAdapterConfig.adCacheTime = this.adCacheTime;
            return aTCustomAdapterConfig;
        }

        public Builder realTimeBidSwitch(boolean z10) {
            this.realTimeBidSwitch = z10;
            return this;
        }
    }

    public long getAdCacheTime() {
        return this.adCacheTime;
    }

    public boolean isRealTimeBidSwitch() {
        return this.realTimeBidSwitch;
    }

    private ATCustomAdapterConfig() {
    }
}
