package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.ads.gl;

/* compiled from: DefaultItemAnimator.java */
/* loaded from: classes.dex */
public final class h extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.c0 f2284a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2285b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2286c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2287d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2288e;
    public final /* synthetic */ k f;

    public h(k kVar, RecyclerView.c0 c0Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
        this.f = kVar;
        this.f2284a = c0Var;
        this.f2285b = i10;
        this.f2286c = view;
        this.f2287d = i11;
        this.f2288e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i10 = this.f2285b;
        View view = this.f2286c;
        if (i10 != 0) {
            view.setTranslationX(gl.Code);
        }
        if (this.f2287d != 0) {
            view.setTranslationY(gl.Code);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2288e.setListener(null);
        k kVar = this.f;
        RecyclerView.c0 c0Var = this.f2284a;
        kVar.c(c0Var);
        kVar.f2305p.remove(c0Var);
        kVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f.getClass();
    }
}
