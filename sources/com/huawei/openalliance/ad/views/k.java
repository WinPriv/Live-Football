package com.huawei.openalliance.ad.views;

import android.animation.Animator;
import android.animation.AnimatorSet;
import com.huawei.hms.ads.ex;

/* loaded from: classes2.dex */
public final class k implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PPSSplashProView f24146a;

    public k(PPSSplashProView pPSSplashProView) {
        this.f24146a = pPSSplashProView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        PPSSplashProView pPSSplashProView = this.f24146a;
        ex.V("PPSSplashProView", "upAndAlphaSet onAnimationEnd");
        try {
            ScanningRelativeLayout scanningRelativeLayout = pPSSplashProView.f23953t;
            scanningRelativeLayout.getClass();
            ex.V("ScanningRelativeLayout", "start");
            scanningRelativeLayout.post(new o(scanningRelativeLayout));
            AnimatorSet animatorSet = pPSSplashProView.C;
            if (animatorSet != null && pPSSplashProView.D != null) {
                animatorSet.start();
                pPSSplashProView.D.start();
            }
        } catch (Throwable th) {
            ex.I("PPSSplashProView", "scale err: %s", th.getClass().getSimpleName());
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        try {
            this.f24146a.f23953t.Code();
        } catch (Throwable th) {
            ex.I("PPSSplashProView", "prepare err: %s", th.getClass().getSimpleName());
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
