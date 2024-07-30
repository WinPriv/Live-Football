package com.huawei.openalliance.ad.ppskit.views;

import android.view.animation.Animation;
import android.widget.ImageView;

/* loaded from: classes2.dex */
public final class f implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MaskingView f23425a;

    public f(MaskingView maskingView) {
        this.f23425a = maskingView;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        MaskingView maskingView = this.f23425a;
        ImageView imageView = maskingView.f23135x;
        if (imageView != null) {
            imageView.startAnimation(maskingView.f23132u);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
