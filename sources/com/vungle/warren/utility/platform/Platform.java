package com.vungle.warren.utility.platform;

import com.vungle.warren.model.AdvertisingInfo;
import m0.a;

/* loaded from: classes2.dex */
public interface Platform {
    public static final String MANUFACTURER_AMAZON = "Amazon";

    AdvertisingInfo getAdvertisingInfo();

    String getAndroidId();

    String getAppSetId();

    boolean getIsBatterySaverEnabled();

    boolean getIsSDCardPresent();

    boolean getIsSideloaded();

    boolean getIsSoundEnabled();

    String getUserAgent();

    void getUserAgentLazy(a<String> aVar);

    double getVolumeLevel();

    boolean isAtLeastMinimumSDK();

    void setAndroidIdFallbackDisabled(boolean z10);
}
