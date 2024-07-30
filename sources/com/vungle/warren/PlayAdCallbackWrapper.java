package com.vungle.warren;

import com.vungle.warren.error.VungleException;
import com.vungle.warren.utility.ThreadUtil;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
class PlayAdCallbackWrapper implements PlayAdCallback {
    private final ExecutorService executorService;
    private final PlayAdCallback playAdCallback;

    public PlayAdCallbackWrapper(ExecutorService executorService, PlayAdCallback playAdCallback) {
        this.playAdCallback = playAdCallback;
        this.executorService = executorService;
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void creativeId(final String str) {
        if (this.playAdCallback == null) {
            return;
        }
        if (ThreadUtil.isMainThread()) {
            this.playAdCallback.creativeId(str);
        } else {
            this.executorService.execute(new Runnable() { // from class: com.vungle.warren.PlayAdCallbackWrapper.1
                @Override // java.lang.Runnable
                public void run() {
                    PlayAdCallbackWrapper.this.playAdCallback.creativeId(str);
                }
            });
        }
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdClick(final String str) {
        if (this.playAdCallback == null) {
            return;
        }
        if (ThreadUtil.isMainThread()) {
            this.playAdCallback.onAdClick(str);
        } else {
            this.executorService.execute(new Runnable() { // from class: com.vungle.warren.PlayAdCallbackWrapper.5
                @Override // java.lang.Runnable
                public void run() {
                    PlayAdCallbackWrapper.this.playAdCallback.onAdClick(str);
                }
            });
        }
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdEnd(final String str, final boolean z10, final boolean z11) {
        if (this.playAdCallback == null) {
            return;
        }
        if (ThreadUtil.isMainThread()) {
            this.playAdCallback.onAdEnd(str, z10, z11);
        } else {
            this.executorService.execute(new Runnable() { // from class: com.vungle.warren.PlayAdCallbackWrapper.3
                @Override // java.lang.Runnable
                public void run() {
                    PlayAdCallbackWrapper.this.playAdCallback.onAdEnd(str, z10, z11);
                }
            });
        }
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdLeftApplication(final String str) {
        if (this.playAdCallback == null) {
            return;
        }
        if (ThreadUtil.isMainThread()) {
            this.playAdCallback.onAdLeftApplication(str);
        } else {
            this.executorService.execute(new Runnable() { // from class: com.vungle.warren.PlayAdCallbackWrapper.6
                @Override // java.lang.Runnable
                public void run() {
                    PlayAdCallbackWrapper.this.playAdCallback.onAdLeftApplication(str);
                }
            });
        }
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdRewarded(final String str) {
        if (this.playAdCallback == null) {
            return;
        }
        if (ThreadUtil.isMainThread()) {
            this.playAdCallback.onAdRewarded(str);
        } else {
            this.executorService.execute(new Runnable() { // from class: com.vungle.warren.PlayAdCallbackWrapper.7
                @Override // java.lang.Runnable
                public void run() {
                    PlayAdCallbackWrapper.this.playAdCallback.onAdRewarded(str);
                }
            });
        }
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdStart(final String str) {
        if (this.playAdCallback == null) {
            return;
        }
        if (ThreadUtil.isMainThread()) {
            this.playAdCallback.onAdStart(str);
        } else {
            this.executorService.execute(new Runnable() { // from class: com.vungle.warren.PlayAdCallbackWrapper.2
                @Override // java.lang.Runnable
                public void run() {
                    PlayAdCallbackWrapper.this.playAdCallback.onAdStart(str);
                }
            });
        }
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdViewed(final String str) {
        if (this.playAdCallback == null) {
            return;
        }
        if (ThreadUtil.isMainThread()) {
            this.playAdCallback.onAdViewed(str);
        } else {
            this.executorService.execute(new Runnable() { // from class: com.vungle.warren.PlayAdCallbackWrapper.9
                @Override // java.lang.Runnable
                public void run() {
                    PlayAdCallbackWrapper.this.playAdCallback.onAdViewed(str);
                }
            });
        }
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onError(final String str, final VungleException vungleException) {
        if (this.playAdCallback == null) {
            return;
        }
        if (ThreadUtil.isMainThread()) {
            this.playAdCallback.onError(str, vungleException);
        } else {
            this.executorService.execute(new Runnable() { // from class: com.vungle.warren.PlayAdCallbackWrapper.8
                @Override // java.lang.Runnable
                public void run() {
                    PlayAdCallbackWrapper.this.playAdCallback.onError(str, vungleException);
                }
            });
        }
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdEnd(final String str) {
        if (this.playAdCallback == null) {
            return;
        }
        if (ThreadUtil.isMainThread()) {
            this.playAdCallback.onAdEnd(str);
        } else {
            this.executorService.execute(new Runnable() { // from class: com.vungle.warren.PlayAdCallbackWrapper.4
                @Override // java.lang.Runnable
                public void run() {
                    PlayAdCallbackWrapper.this.playAdCallback.onAdEnd(str);
                }
            });
        }
    }
}
