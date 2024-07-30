package com.vungle.warren;

import com.vungle.warren.error.VungleException;

/* loaded from: classes2.dex */
public interface PlayAdCallback {
    void creativeId(String str);

    void onAdClick(String str);

    void onAdEnd(String str);

    @Deprecated
    void onAdEnd(String str, boolean z10, boolean z11);

    void onAdLeftApplication(String str);

    void onAdRewarded(String str);

    void onAdStart(String str);

    void onAdViewed(String str);

    void onError(String str, VungleException vungleException);
}
