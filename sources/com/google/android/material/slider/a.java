package com.google.android.material.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.internal.n;

/* compiled from: BaseSlider.java */
/* loaded from: classes2.dex */
public final class a extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BaseSlider f21001a;

    public a(BaseSlider baseSlider) {
        this.f21001a = baseSlider;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        BaseSlider baseSlider = this.f21001a;
        n.d(baseSlider);
        int i10 = BaseSlider.W;
        baseSlider.getClass();
        throw null;
    }
}
