package com.applovin.sdk;

import java.util.List;

/* loaded from: classes.dex */
public interface AppLovinSdkConfiguration {

    @Deprecated
    /* loaded from: classes.dex */
    public enum ConsentDialogState {
        UNKNOWN,
        APPLIES,
        DOES_NOT_APPLY
    }

    @Deprecated
    ConsentDialogState getConsentDialogState();

    String getCountryCode();

    List<String> getEnabledAmazonAdUnitIds();
}
