package com.facebook.ads.redexgen.X;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class NY implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ RX A00;

    public NY(RX rx) {
        this.A00 = rx;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view;
        View view2;
        Integer num = (Integer) valueAnimator.getAnimatedValue();
        view = this.A00.A06;
        view.getLayoutParams().height = num.intValue();
        view2 = this.A00.A06;
        view2.requestLayout();
    }
}
