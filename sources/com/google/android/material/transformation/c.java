package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.circularreveal.b;

/* compiled from: FabTransformationBehavior.java */
/* loaded from: classes2.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.circularreveal.b f21260a;

    public c(com.google.android.material.circularreveal.b bVar) {
        this.f21260a = bVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        com.google.android.material.circularreveal.b bVar = this.f21260a;
        b.d revealInfo = bVar.getRevealInfo();
        revealInfo.f20643c = Float.MAX_VALUE;
        bVar.setRevealInfo(revealInfo);
    }
}
