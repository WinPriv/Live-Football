package com.vungle.warren;

import com.vungle.warren.error.VungleException;

/* loaded from: classes2.dex */
public interface InitCallback {
    void onAutoCacheAdAvailable(String str);

    void onError(VungleException vungleException);

    void onSuccess();
}
