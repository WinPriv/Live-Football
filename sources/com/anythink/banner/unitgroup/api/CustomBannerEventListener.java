package com.anythink.banner.unitgroup.api;

import android.content.Context;
import com.anythink.core.api.ATNetworkConfirmInfo;

/* loaded from: classes.dex */
public interface CustomBannerEventListener {
    void onBannerAdClicked();

    void onBannerAdClose();

    void onBannerAdShow();

    void onDeeplinkCallback(boolean z10);

    void onDownloadConfirm(Context context, ATNetworkConfirmInfo aTNetworkConfirmInfo);
}
