package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: Transition.java */
/* loaded from: classes.dex */
public final class j extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q.b f2475a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f2476b;

    public j(i iVar, q.b bVar) {
        this.f2476b = iVar;
        this.f2475a = bVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2475a.remove(animator);
        this.f2476b.E.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f2476b.E.add(animator);
    }
}
