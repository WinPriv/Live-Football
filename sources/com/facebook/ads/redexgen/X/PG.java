package com.facebook.ads.redexgen.X;

import android.animation.Animator;

/* loaded from: assets/audience_network.dex */
public class PG implements Animator.AnimatorListener {
    public final /* synthetic */ HT A00;

    public PG(HT ht) {
        this.A00 = ht;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A00.A07(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.A01 = null;
        this.A00.A02 = PE.A03;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
