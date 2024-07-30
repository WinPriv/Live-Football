package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: DefaultItemAnimator.java */
/* loaded from: classes.dex */
public final class g extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.c0 f2280a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f2281b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2282c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f2283d;

    public g(View view, ViewPropertyAnimator viewPropertyAnimator, k kVar, RecyclerView.c0 c0Var) {
        this.f2283d = kVar;
        this.f2280a = c0Var;
        this.f2281b = view;
        this.f2282c = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f2281b.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2282c.setListener(null);
        k kVar = this.f2283d;
        RecyclerView.c0 c0Var = this.f2280a;
        kVar.c(c0Var);
        kVar.o.remove(c0Var);
        kVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f2283d.getClass();
    }
}
