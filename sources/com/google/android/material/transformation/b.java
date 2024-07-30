package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;

/* compiled from: FabTransformationBehavior.java */
/* loaded from: classes2.dex */
public final class b extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.circularreveal.b f21258a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Drawable f21259b;

    public b(com.google.android.material.circularreveal.b bVar, Drawable drawable) {
        this.f21258a = bVar;
        this.f21259b = drawable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f21258a.setCircularRevealOverlayDrawable(null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f21258a.setCircularRevealOverlayDrawable(this.f21259b);
    }
}
