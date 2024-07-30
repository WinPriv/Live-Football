package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: DropdownMenuEndIconDelegate.java */
/* loaded from: classes2.dex */
public final class l extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f21167a;

    public l(m mVar) {
        this.f21167a = mVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m mVar = this.f21167a;
        mVar.q();
        mVar.f21179r.start();
    }
}
