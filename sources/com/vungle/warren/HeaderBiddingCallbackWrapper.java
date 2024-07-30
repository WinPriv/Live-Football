package com.vungle.warren;

import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public class HeaderBiddingCallbackWrapper implements HeaderBiddingCallback {
    private final HeaderBiddingCallback callback;
    private final ExecutorService executorService;

    public HeaderBiddingCallbackWrapper(ExecutorService executorService, HeaderBiddingCallback headerBiddingCallback) {
        this.callback = headerBiddingCallback;
        this.executorService = executorService;
    }

    @Override // com.vungle.warren.HeaderBiddingCallback
    public void adAvailableForBidToken(final String str, final String str2) {
        if (this.callback == null) {
            return;
        }
        this.executorService.execute(new Runnable() { // from class: com.vungle.warren.HeaderBiddingCallbackWrapper.2
            @Override // java.lang.Runnable
            public void run() {
                HeaderBiddingCallbackWrapper.this.callback.adAvailableForBidToken(str, str2);
            }
        });
    }

    @Override // com.vungle.warren.HeaderBiddingCallback
    public void onBidTokenAvailable(final String str, final String str2) {
        if (this.callback == null) {
            return;
        }
        this.executorService.execute(new Runnable() { // from class: com.vungle.warren.HeaderBiddingCallbackWrapper.1
            @Override // java.lang.Runnable
            public void run() {
                HeaderBiddingCallbackWrapper.this.callback.onBidTokenAvailable(str, str2);
            }
        });
    }
}
