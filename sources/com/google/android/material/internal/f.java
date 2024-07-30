package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* compiled from: StateListAnimator.java */
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<b> f20859a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    public ValueAnimator f20860b = null;

    /* renamed from: c, reason: collision with root package name */
    public final a f20861c = new a();

    /* compiled from: StateListAnimator.java */
    /* loaded from: classes2.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            f fVar = f.this;
            if (fVar.f20860b == animator) {
                fVar.f20860b = null;
            }
        }
    }

    /* compiled from: StateListAnimator.java */
    /* loaded from: classes2.dex */
    public static class b {
        public b(int[] iArr, ValueAnimator valueAnimator) {
        }
    }

    public final void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f20861c);
        this.f20859a.add(bVar);
    }
}
