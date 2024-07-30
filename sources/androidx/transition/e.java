package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;

/* compiled from: Fade.java */
/* loaded from: classes.dex */
public final class e extends b0 {

    /* compiled from: Fade.java */
    /* loaded from: classes.dex */
    public static class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final View f2453a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f2454b = false;

        public a(View view) {
            this.f2453a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            y yVar = u.f2496a;
            View view = this.f2453a;
            yVar.a1(view, 1.0f);
            if (this.f2454b) {
                view.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            WeakHashMap<View, l0> weakHashMap = n0.c0.f33054a;
            View view = this.f2453a;
            if (c0.d.h(view) && view.getLayerType() == 0) {
                this.f2454b = true;
                view.setLayerType(2, null);
            }
        }
    }

    public e(int i10) {
        if ((i10 & (-4)) == 0) {
            this.P = i10;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    public final ObjectAnimator J(View view, float f, float f10) {
        if (f == f10) {
            return null;
        }
        u.f2496a.a1(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, u.f2497b, f10);
        ofFloat.addListener(new a(view));
        a(new d(view));
        return ofFloat;
    }

    @Override // androidx.transition.i
    public final void g(q qVar) {
        H(qVar);
        qVar.f2490a.put("android:fade:transitionAlpha", Float.valueOf(u.f2496a.Z0(qVar.f2491b)));
    }

    public e() {
    }
}
