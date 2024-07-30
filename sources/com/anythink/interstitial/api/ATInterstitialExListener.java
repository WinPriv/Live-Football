package com.anythink.interstitial.api;

import android.content.Context;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATNetworkConfirmInfo;

/* loaded from: classes.dex */
public interface ATInterstitialExListener extends ATInterstitialListener {
    void onDeeplinkCallback(ATAdInfo aTAdInfo, boolean z10);

    void onDownloadConfirm(Context context, ATAdInfo aTAdInfo, ATNetworkConfirmInfo aTNetworkConfirmInfo);
}
