package com.vungle.warren.utility;

import com.vungle.warren.LoadAdCallback;
import com.vungle.warren.error.VungleException;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class WeakLoadAdCallback implements LoadAdCallback {
    private WeakReference<LoadAdCallback> weak;

    public WeakLoadAdCallback(LoadAdCallback loadAdCallback) {
        this.weak = new WeakReference<>(loadAdCallback);
    }

    @Override // com.vungle.warren.LoadAdCallback
    public void onAdLoad(String str) {
        LoadAdCallback loadAdCallback = this.weak.get();
        if (loadAdCallback != null) {
            loadAdCallback.onAdLoad(str);
        }
    }

    @Override // com.vungle.warren.LoadAdCallback
    public void onError(String str, VungleException vungleException) {
        LoadAdCallback loadAdCallback = this.weak.get();
        if (loadAdCallback != null) {
            loadAdCallback.onError(str, vungleException);
        }
    }
}
