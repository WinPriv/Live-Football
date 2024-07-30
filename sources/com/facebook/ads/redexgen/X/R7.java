package com.facebook.ads.redexgen.X;

import android.view.animation.Animation;

/* loaded from: assets/audience_network.dex */
public class R7 extends LD {
    public final /* synthetic */ R6 A00;

    public R7(R6 r62) {
        this.A00 = r62;
    }

    @Override // com.facebook.ads.redexgen.X.LD, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        LE.A0H(this.A00.A01);
        this.A00.A00.AB4();
    }
}
