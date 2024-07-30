package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: Transition.java */
/* loaded from: classes.dex */
public final class k extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f2477a;

    public k(i iVar) {
        this.f2477a = iVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2477a.m();
        animator.removeListener(this);
    }
}
