package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.view.animation.Animation;

/* renamed from: com.facebook.ads.redexgen.X.Lj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class AnimationAnimationListenerC1036Lj implements Animation.AnimationListener {
    public final /* synthetic */ AnonymousClass59 A00;
    public final /* synthetic */ SH A01;
    public final /* synthetic */ SH A02;

    public AnimationAnimationListenerC1036Lj(SH sh, SH sh2, AnonymousClass59 anonymousClass59) {
        this.A01 = sh;
        this.A02 = sh2;
        this.A00 = anonymousClass59;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.A01.A04 = false;
        LE.A0H(this.A02);
        new Handler().postDelayed(new SK(this), 200L);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
