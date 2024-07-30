package com.huawei.openalliance.ad.views;

import android.animation.ValueAnimator;
import com.huawei.hms.ads.ed;
import com.huawei.hms.ads.gl;

/* loaded from: classes2.dex */
public final class r implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ScanningView f24154s;

    public r(ScanningView scanningView) {
        this.f24154s = scanningView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ScanningView scanningView = this.f24154s;
        ValueAnimator valueAnimator = scanningView.B;
        if (valueAnimator == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(scanningView.f24087z, scanningView.A);
            scanningView.B = ofFloat;
            ofFloat.setInterpolator(new ed(0.33f, gl.Code, 0.67f, 1.0f));
            scanningView.B.setDuration(2500L);
            scanningView.B.addUpdateListener(new p(scanningView));
            scanningView.B.addListener(new q(scanningView));
        } else if (valueAnimator.isRunning()) {
            scanningView.B.cancel();
        }
        scanningView.B.start();
    }
}
