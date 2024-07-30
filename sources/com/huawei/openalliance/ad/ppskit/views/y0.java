package com.huawei.openalliance.ad.ppskit.views;

import android.animation.ValueAnimator;
import ka.n7;

/* loaded from: classes2.dex */
public final class y0 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ParticleRelativeLayout f23610s;

    public y0(ParticleRelativeLayout particleRelativeLayout) {
        this.f23610s = particleRelativeLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ParticleRelativeLayout particleRelativeLayout = this.f23610s;
        try {
            ValueAnimator valueAnimator = particleRelativeLayout.B;
            if (valueAnimator == null) {
                particleRelativeLayout.getClass();
                try {
                    particleRelativeLayout.u();
                    particleRelativeLayout.g();
                } catch (Throwable th) {
                    n7.h("ParticleRelativeLayout", "init animator exception: %s", th.getClass().getSimpleName());
                }
            } else if (valueAnimator.isRunning()) {
                particleRelativeLayout.B.cancel();
            }
            particleRelativeLayout.B.start();
        } catch (Throwable th2) {
            n7.h("ParticleRelativeLayout", "start animator exception: %s", th2.getClass().getSimpleName());
        }
    }
}
