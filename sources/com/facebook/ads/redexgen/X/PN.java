package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class PN implements Animator.AnimatorListener {
    public final /* synthetic */ HH A00;

    public PN(HH hh) {
        this.A00 = hh;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A00.A09(false);
        this.A00.A04();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view;
        this.A00.A01 = PE.A05;
        view = this.A00.A05;
        LE.A0H(view);
        this.A00.A04();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
