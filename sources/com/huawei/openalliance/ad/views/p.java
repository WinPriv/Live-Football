package com.huawei.openalliance.ad.views;

import android.animation.ValueAnimator;

/* loaded from: classes2.dex */
public final class p implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ScanningView f24152a;

    public p(ScanningView scanningView) {
        this.f24152a = scanningView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ScanningView scanningView = this.f24152a;
        scanningView.y = floatValue;
        scanningView.postInvalidate();
    }
}
