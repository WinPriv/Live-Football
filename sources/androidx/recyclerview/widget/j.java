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
public final class j extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k.a f2293a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2294b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2295c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f2296d;

    public j(k kVar, k.a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2296d = kVar;
        this.f2293a = aVar;
        this.f2294b = viewPropertyAnimator;
        this.f2295c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2294b.setListener(null);
        View view = this.f2295c;
        view.setAlpha(1.0f);
        view.setTranslationX(gl.Code);
        view.setTranslationY(gl.Code);
        k.a aVar = this.f2293a;
        RecyclerView.c0 c0Var = aVar.f2309b;
        k kVar = this.f2296d;
        kVar.c(c0Var);
        kVar.f2307r.remove(aVar.f2309b);
        kVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        RecyclerView.c0 c0Var = this.f2293a.f2309b;
        this.f2296d.getClass();
    }
}
