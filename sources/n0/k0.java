package n0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: ViewPropertyAnimatorCompat.java */
/* loaded from: classes.dex */
public final class k0 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m0 f33090a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f33091b;

    public k0(m0 m0Var, View view) {
        this.f33090a = m0Var;
        this.f33091b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f33090a.b(this.f33091b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f33090a.a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f33090a.c();
    }
}
