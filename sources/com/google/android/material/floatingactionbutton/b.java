package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.d;

/* compiled from: FloatingActionButtonImpl.java */
/* loaded from: classes2.dex */
public final class b extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f20764a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f20765b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d.g f20766c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f20767d;

    public b(d dVar, boolean z10, a aVar) {
        this.f20767d = dVar;
        this.f20765b = z10;
        this.f20766c = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f20764a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10;
        d dVar = this.f20767d;
        dVar.f20784m = 0;
        dVar.f20778g = null;
        if (!this.f20764a) {
            boolean z10 = this.f20765b;
            if (z10) {
                i10 = 8;
            } else {
                i10 = 4;
            }
            dVar.f20787q.b(i10, z10);
            d.g gVar = this.f20766c;
            if (gVar != null) {
                a aVar = (a) gVar;
                aVar.f20762a.a(aVar.f20763b);
            }
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        d dVar = this.f20767d;
        dVar.f20787q.b(0, this.f20765b);
        dVar.f20784m = 1;
        dVar.f20778g = animator;
        this.f20764a = false;
    }
}
