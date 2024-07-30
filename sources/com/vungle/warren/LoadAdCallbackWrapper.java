package com.vungle.warren;

import com.vungle.warren.error.VungleException;
import com.vungle.warren.utility.ThreadUtil;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
class LoadAdCallbackWrapper implements LoadAdCallback {
    private final ExecutorService executorService;
    private final LoadAdCallback loadAdCallback;

    public LoadAdCallbackWrapper(ExecutorService executorService, LoadAdCallback loadAdCallback) {
        this.loadAdCallback = loadAdCallback;
        this.executorService = executorService;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LoadAdCallbackWrapper loadAdCallbackWrapper = (LoadAdCallbackWrapper) obj;
        LoadAdCallback loadAdCallback = this.loadAdCallback;
        if (loadAdCallback == null ? loadAdCallbackWrapper.loadAdCallback != null : !loadAdCallback.equals(loadAdCallbackWrapper.loadAdCallback)) {
            return false;
        }
        ExecutorService executorService = this.executorService;
        ExecutorService executorService2 = loadAdCallbackWrapper.executorService;
        if (executorService != null) {
            return executorService.equals(executorService2);
        }
        if (executorService2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        LoadAdCallback loadAdCallback = this.loadAdCallback;
        int i11 = 0;
        if (loadAdCallback != null) {
            i10 = loadAdCallback.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = i10 * 31;
        ExecutorService executorService = this.executorService;
        if (executorService != null) {
            i11 = executorService.hashCode();
        }
        return i12 + i11;
    }

    @Override // com.vungle.warren.LoadAdCallback
    public void onAdLoad(final String str) {
        if (this.loadAdCallback == null) {
            return;
        }
        if (ThreadUtil.isMainThread()) {
            this.loadAdCallback.onAdLoad(str);
        } else {
            this.executorService.execute(new Runnable() { // from class: com.vungle.warren.LoadAdCallbackWrapper.1
                @Override // java.lang.Runnable
                public void run() {
                    LoadAdCallbackWrapper.this.loadAdCallback.onAdLoad(str);
                }
            });
        }
    }

    @Override // com.vungle.warren.LoadAdCallback
    public void onError(final String str, final VungleException vungleException) {
        if (this.loadAdCallback == null) {
            return;
        }
        if (ThreadUtil.isMainThread()) {
            this.loadAdCallback.onError(str, vungleException);
        } else {
            this.executorService.execute(new Runnable() { // from class: com.vungle.warren.LoadAdCallbackWrapper.2
                @Override // java.lang.Runnable
                public void run() {
                    LoadAdCallbackWrapper.this.loadAdCallback.onError(str, vungleException);
                }
            });
        }
    }
}
