package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;

/* loaded from: assets/audience_network.dex */
public class P3 extends AnimatorListenerAdapter {
    public final /* synthetic */ C06706b A00;

    public P3(C06706b c06706b) {
        this.A00 = c06706b;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Handler handler;
        handler = this.A00.A00.A04;
        handler.postDelayed(new JI(this), 2000L);
    }
}
