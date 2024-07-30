package com.facebook.ads.redexgen.X;

import android.R;

/* loaded from: assets/audience_network.dex */
public class SK extends AbstractRunnableC0997Ju {
    public final /* synthetic */ AnimationAnimationListenerC1036Lj A00;

    public SK(AnimationAnimationListenerC1036Lj animationAnimationListenerC1036Lj) {
        this.A00 = animationAnimationListenerC1036Lj;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0997Ju
    public final void A06() {
        this.A00.A00.finish(3);
        this.A00.A00.A0H().overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
}
