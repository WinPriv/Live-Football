package com.vungle.warren;

import com.vungle.warren.AdConfig;
import n8.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class BaseAdConfig {
    public static final int MUTED = 1;

    @b("adSize")
    private AdConfig.AdSize adSize;
    protected boolean muteChangedByApi;

    @b("settings")
    protected int settings;

    public BaseAdConfig() {
    }

    public AdConfig.AdSize getAdSize() {
        AdConfig.AdSize adSize = this.adSize;
        if (adSize == null) {
            return AdConfig.AdSize.VUNGLE_DEFAULT;
        }
        return adSize;
    }

    public int getSettings() {
        return this.settings;
    }

    public void setAdSize(AdConfig.AdSize adSize) {
        this.adSize = adSize;
    }

    public void setMuted(boolean z10) {
        if (z10) {
            this.settings |= 1;
        } else {
            this.settings &= -2;
        }
        this.muteChangedByApi = true;
    }

    public BaseAdConfig(AdConfig.AdSize adSize) {
        this.adSize = adSize;
    }

    public BaseAdConfig(BaseAdConfig baseAdConfig) {
        this(baseAdConfig.getAdSize());
        this.settings = baseAdConfig.getSettings();
    }
}
