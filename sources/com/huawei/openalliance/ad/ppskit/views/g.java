package com.huawei.openalliance.ad.ppskit.views;

import android.view.animation.Animation;
import android.widget.ImageView;

/* loaded from: classes2.dex */
public final class g implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MaskingView f23427a;

    public g(MaskingView maskingView) {
        this.f23427a = maskingView;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        MaskingView maskingView = this.f23427a;
        ImageView imageView = maskingView.f23135x;
        if (imageView != null) {
            imageView.startAnimation(maskingView.f23133v);
        }
        ImageView imageView2 = maskingView.f23134w;
        if (imageView2 != null) {
            imageView2.startAnimation(maskingView.f23130s);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        ImageView imageView = this.f23427a.f23135x;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}
