package com.onesignal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.onesignal.e5;

/* compiled from: InAppMessageView.java */
/* loaded from: classes2.dex */
public final class z extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e5.e f27208a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f27209b;

    public z(w wVar, e5.e eVar) {
        this.f27209b = wVar;
        this.f27208a = eVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        w.a(this.f27209b);
        e5.e eVar = this.f27208a;
        if (eVar != null) {
            eVar.onComplete();
        }
    }
}
