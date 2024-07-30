package com.google.android.material.transformation;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: FabTransformationBehavior.java */
/* loaded from: classes2.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f21257a;

    public a(View view) {
        this.f21257a = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f21257a.invalidate();
    }
}
