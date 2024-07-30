package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.j0;
import androidx.fragment.app.k;

/* compiled from: DefaultSpecialEffectsController.java */
/* loaded from: classes.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1792a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f1793b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f1794c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0.b f1795d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k.a f1796e;

    public c(ViewGroup viewGroup, View view, boolean z10, j0.b bVar, k.a aVar) {
        this.f1792a = viewGroup;
        this.f1793b = view;
        this.f1794c = z10;
        this.f1795d = bVar;
        this.f1796e = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f1792a;
        View view = this.f1793b;
        viewGroup.endViewTransition(view);
        if (this.f1794c) {
            a3.l.a(this.f1795d.f1834a, view);
        }
        this.f1796e.a();
    }
}
