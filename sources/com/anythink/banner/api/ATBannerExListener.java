package com.anythink.banner.api;

import android.content.Context;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATNetworkConfirmInfo;

/* loaded from: classes.dex */
public interface ATBannerExListener extends ATBannerListener {
    void onDeeplinkCallback(boolean z10, ATAdInfo aTAdInfo, boolean z11);

    void onDownloadConfirm(Context context, ATAdInfo aTAdInfo, ATNetworkConfirmInfo aTNetworkConfirmInfo);
}
