package com.huawei.openalliance.ad.ppskit.views;

import android.view.animation.Animation;
import android.widget.ImageView;

/* loaded from: classes2.dex */
public final class e implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MaskingView f23418a;

    public e(MaskingView maskingView) {
        this.f23418a = maskingView;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        MaskingView maskingView = this.f23418a;
        ImageView imageView = maskingView.f23134w;
        if (imageView != null) {
            imageView.startAnimation(maskingView.f23131t);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
