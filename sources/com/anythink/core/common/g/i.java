package com.anythink.core.common.g;

import com.anythink.core.api.AdError;

/* loaded from: classes.dex */
public interface i {
    void onLoadCanceled(int i10);

    void onLoadError(int i10, String str, AdError adError);

    void onLoadFinish(int i10, Object obj);

    void onLoadStart(int i10);
}
