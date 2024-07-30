package com.huawei.openalliance.ad.ppskit.views;

import android.view.animation.Animation;
import android.widget.ImageView;

/* loaded from: classes2.dex */
public final class h implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MaskingView f23439a;

    public h(MaskingView maskingView) {
        this.f23439a = maskingView;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        ImageView imageView = this.f23439a.f23135x;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
