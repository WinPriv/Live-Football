package com.vungle.warren;

import com.vungle.warren.error.VungleException;

/* loaded from: classes2.dex */
public interface LoadAdCallback {
    void onAdLoad(String str);

    void onError(String str, VungleException vungleException);
}
