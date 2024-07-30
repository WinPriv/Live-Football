package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class P4 extends AnimatorListenerAdapter {
    public final /* synthetic */ JG A00;

    public P4(JG jg) {
        this.A00 = jg;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view;
        view = this.A00.A00;
        view.setVisibility(8);
    }
}
