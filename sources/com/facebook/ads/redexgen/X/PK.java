package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* loaded from: assets/audience_network.dex */
public class PK extends AnimatorListenerAdapter {
    public final /* synthetic */ HS A00;

    public PK(HS hs) {
        this.A00 = hs;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        boolean z10;
        View view;
        ViewPropertyAnimator viewPropertyAnimator;
        ViewPropertyAnimator viewPropertyAnimator2;
        View view2;
        z10 = this.A00.A04;
        if (z10) {
            view2 = this.A00.A03;
            LE.A0L(view2);
        }
        view = this.A00.A03;
        view.setAlpha(1.0f);
        this.A00.A01 = PE.A03;
        viewPropertyAnimator = this.A00.A00;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator2 = this.A00.A00;
            viewPropertyAnimator2.setListener(null);
            this.A00.A00 = null;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        ViewPropertyAnimator viewPropertyAnimator;
        ViewPropertyAnimator viewPropertyAnimator2;
        View view;
        z10 = this.A00.A04;
        if (z10) {
            view = this.A00.A03;
            LE.A0H(view);
        }
        this.A00.A01 = PE.A05;
        viewPropertyAnimator = this.A00.A00;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator2 = this.A00.A00;
            viewPropertyAnimator2.setListener(null);
            this.A00.A00 = null;
        }
    }
}
