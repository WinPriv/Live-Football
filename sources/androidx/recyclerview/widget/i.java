package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import com.huawei.hms.ads.gl;

/* compiled from: DefaultItemAnimator.java */
/* loaded from: classes.dex */
public final class i extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k.a f2289a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2290b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2291c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f2292d;

    public i(k kVar, k.a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2292d = kVar;
        this.f2289a = aVar;
        this.f2290b = viewPropertyAnimator;
        this.f2291c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2290b.setListener(null);
        View view = this.f2291c;
        view.setAlpha(1.0f);
        view.setTranslationX(gl.Code);
        view.setTranslationY(gl.Code);
        k.a aVar = this.f2289a;
        RecyclerView.c0 c0Var = aVar.f2308a;
        k kVar = this.f2292d;
        kVar.c(c0Var);
        kVar.f2307r.remove(aVar.f2308a);
        kVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        RecyclerView.c0 c0Var = this.f2289a.f2308a;
        this.f2292d.getClass();
    }
}
