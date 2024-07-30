package com.huawei.openalliance.ad.views;

import android.animation.ValueAnimator;
import com.huawei.hms.ads.ex;

/* loaded from: classes2.dex */
public final class o implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ScanningRelativeLayout f24151s;

    public o(ScanningRelativeLayout scanningRelativeLayout) {
        this.f24151s = scanningRelativeLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ScanningRelativeLayout scanningRelativeLayout = this.f24151s;
        try {
            ValueAnimator valueAnimator = scanningRelativeLayout.f24078j0;
            if (valueAnimator == null) {
                scanningRelativeLayout.S();
            } else if (valueAnimator.isRunning()) {
                scanningRelativeLayout.f24078j0.cancel();
            }
            scanningRelativeLayout.f24078j0.start();
        } catch (Throwable th) {
            ex.I("ScanningRelativeLayout", "start scan exception: %s", th.getClass().getSimpleName());
        }
    }
}
