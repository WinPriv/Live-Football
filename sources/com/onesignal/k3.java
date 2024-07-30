package com.onesignal;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.RelativeLayout;

/* compiled from: OneSignalAnimate.java */
/* loaded from: classes2.dex */
public final class k3 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f26889a;

    public k3(RelativeLayout relativeLayout) {
        this.f26889a = relativeLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f26889a.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
