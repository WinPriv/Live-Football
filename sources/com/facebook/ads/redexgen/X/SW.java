package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;

/* loaded from: assets/audience_network.dex */
public class SW extends LD {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ScaleAnimation A01;

    public SW(View view, ScaleAnimation scaleAnimation) {
        this.A00 = view;
        this.A01 = scaleAnimation;
    }

    @Override // com.facebook.ads.redexgen.X.LD, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.A00.startAnimation(this.A01);
    }
}
