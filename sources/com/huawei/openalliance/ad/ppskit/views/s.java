package com.huawei.openalliance.ad.ppskit.views;

import android.animation.ObjectAnimator;

/* loaded from: classes2.dex */
public final class s implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PPSFullScreenNotifyView f23545s;

    public s(PPSFullScreenNotifyView pPSFullScreenNotifyView) {
        this.f23545s = pPSFullScreenNotifyView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PPSFullScreenNotifyView pPSFullScreenNotifyView = this.f23545s;
        ObjectAnimator objectAnimator = pPSFullScreenNotifyView.F;
        if (objectAnimator != null) {
            objectAnimator.start();
            pPSFullScreenNotifyView.setVisibility(0);
        }
    }
}
