package com.huawei.openalliance.ad.ppskit.views;

import android.animation.ObjectAnimator;

/* loaded from: classes2.dex */
public final class n implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PPSFullScreenNotifyOptimizeView f23520s;

    public n(PPSFullScreenNotifyOptimizeView pPSFullScreenNotifyOptimizeView) {
        this.f23520s = pPSFullScreenNotifyOptimizeView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PPSFullScreenNotifyOptimizeView pPSFullScreenNotifyOptimizeView = this.f23520s;
        ObjectAnimator objectAnimator = pPSFullScreenNotifyOptimizeView.C;
        if (objectAnimator != null) {
            objectAnimator.start();
            pPSFullScreenNotifyOptimizeView.setVisibility(0);
        }
    }
}
