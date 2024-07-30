package com.huawei.openalliance.ad.views;

import android.animation.Animator;
import android.animation.AnimatorSet;
import com.huawei.hms.ads.ex;

/* loaded from: classes2.dex */
public final class l implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PPSSplashProView f24147a;

    public l(PPSSplashProView pPSSplashProView) {
        this.f24147a = pPSSplashProView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        PPSSplashProView pPSSplashProView = this.f24147a;
        ex.V("PPSSplashProView", "scaleAnimationDown onAnimationEnd");
        try {
            pPSSplashProView.setVisibility(0);
            AnimatorSet animatorSet = pPSSplashProView.A;
            if (animatorSet != null) {
                animatorSet.start();
            }
        } catch (Throwable th) {
            ex.I("PPSSplashProView", "up and alpha err: %s", th.getClass().getSimpleName());
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
