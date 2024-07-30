package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.d;

/* compiled from: FloatingActionButtonImpl.java */
/* loaded from: classes2.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f20768a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d.g f20769b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f20770c;

    public c(d dVar, boolean z10, a aVar) {
        this.f20770c = dVar;
        this.f20768a = z10;
        this.f20769b = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        d dVar = this.f20770c;
        dVar.f20784m = 0;
        dVar.f20778g = null;
        d.g gVar = this.f20769b;
        if (gVar != null) {
            ((a) gVar).f20762a.b();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        d dVar = this.f20770c;
        dVar.f20787q.b(0, this.f20768a);
        dVar.f20784m = 2;
        dVar.f20778g = animator;
    }
}
