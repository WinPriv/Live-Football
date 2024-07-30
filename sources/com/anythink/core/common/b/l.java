package com.anythink.core.common.b;

import android.content.Context;
import android.view.View;
import com.anythink.core.api.ATNetworkConfirmInfo;

/* loaded from: classes.dex */
public interface l {
    void onAdClicked(View view);

    void onAdDislikeButtonClick();

    void onAdImpressed();

    void onAdVideoEnd();

    void onAdVideoProgress(int i10);

    void onAdVideoStart();

    void onDeeplinkCallback(boolean z10);

    void onDownloadConfirmCallback(Context context, View view, ATNetworkConfirmInfo aTNetworkConfirmInfo);
}
