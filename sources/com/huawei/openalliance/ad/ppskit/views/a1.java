package com.huawei.openalliance.ad.ppskit.views;

import android.animation.ValueAnimator;
import ka.n7;

/* loaded from: classes2.dex */
public final class a1 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ScanningRelativeLayout f23391s;

    public a1(ScanningRelativeLayout scanningRelativeLayout) {
        this.f23391s = scanningRelativeLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ScanningRelativeLayout scanningRelativeLayout = this.f23391s;
        try {
            ValueAnimator valueAnimator = scanningRelativeLayout.F;
            if (valueAnimator == null) {
                scanningRelativeLayout.g();
            } else if (valueAnimator.isRunning()) {
                scanningRelativeLayout.F.cancel();
            }
            scanningRelativeLayout.F.start();
        } catch (Throwable th) {
            n7.h("ScanningRelativeLayout", "start scan exception: %s", th.getClass().getSimpleName());
        }
    }
}
