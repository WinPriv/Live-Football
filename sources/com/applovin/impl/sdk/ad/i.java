package com.applovin.impl.sdk.ad;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.sdk.AppLovinAdLoadListener;

/* loaded from: classes.dex */
public interface i extends AppLovinAdLoadListener {
    void failedToReceiveAdV2(AppLovinError appLovinError);
}
