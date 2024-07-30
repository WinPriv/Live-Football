package com.facebook.ads.redexgen.X;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import com.huawei.hms.ads.gl;

/* loaded from: assets/audience_network.dex */
public class R6 extends AbstractRunnableC0997Ju {
    public final /* synthetic */ OC A00;
    public final /* synthetic */ OD A01;

    public R6(OD od, OC oc2) {
        this.A01 = od;
        this.A00 = oc2;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0997Ju
    public final void A06() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, gl.Code);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setAnimationListener(new R7(this));
        this.A01.startAnimation(alphaAnimation);
    }
}
