package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: DefaultItemAnimator.java */
/* loaded from: classes.dex */
public final class f extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.c0 f2276a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2277b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2278c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f2279d;

    public f(View view, ViewPropertyAnimator viewPropertyAnimator, k kVar, RecyclerView.c0 c0Var) {
        this.f2279d = kVar;
        this.f2276a = c0Var;
        this.f2277b = viewPropertyAnimator;
        this.f2278c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2277b.setListener(null);
        this.f2278c.setAlpha(1.0f);
        k kVar = this.f2279d;
        RecyclerView.c0 c0Var = this.f2276a;
        kVar.c(c0Var);
        kVar.f2306q.remove(c0Var);
        kVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f2279d.getClass();
    }
}
