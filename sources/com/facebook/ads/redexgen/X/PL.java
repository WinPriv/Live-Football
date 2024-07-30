package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.ValueAnimator;

/* loaded from: assets/audience_network.dex */
public class PL implements Animator.AnimatorListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ HK A02;

    public PL(HK hk, int i10, int i11) {
        this.A02 = hk;
        this.A01 = i10;
        this.A00 = i11;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        this.A02.A07(this.A00, this.A01, false);
        valueAnimator = this.A02.A00;
        if (valueAnimator != null) {
            valueAnimator2 = this.A02.A00;
            valueAnimator2.removeAllListeners();
            this.A02.A00 = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10;
        PE pe;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        HK hk = this.A02;
        int i11 = this.A01;
        i10 = hk.A04;
        if (i11 == i10) {
            pe = PE.A03;
        } else {
            pe = PE.A05;
        }
        hk.A01 = pe;
        valueAnimator = this.A02.A00;
        if (valueAnimator != null) {
            valueAnimator2 = this.A02.A00;
            valueAnimator2.removeAllListeners();
            this.A02.A00 = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
