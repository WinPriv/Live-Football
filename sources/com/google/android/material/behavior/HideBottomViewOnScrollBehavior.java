package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.hamkho.livefoot.R;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet<b> f20489a;

    /* renamed from: b, reason: collision with root package name */
    public int f20490b;

    /* renamed from: c, reason: collision with root package name */
    public int f20491c;

    /* renamed from: d, reason: collision with root package name */
    public TimeInterpolator f20492d;

    /* renamed from: e, reason: collision with root package name */
    public TimeInterpolator f20493e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f20494g;

    /* renamed from: h, reason: collision with root package name */
    public int f20495h;

    /* renamed from: i, reason: collision with root package name */
    public ViewPropertyAnimator f20496i;

    /* loaded from: classes2.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f20496i = null;
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a();
    }

    public HideBottomViewOnScrollBehavior() {
        this.f20489a = new LinkedHashSet<>();
        this.f = 0;
        this.f20494g = 2;
        this.f20495h = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean h(CoordinatorLayout coordinatorLayout, V v3, int i10) {
        this.f = v3.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v3.getLayoutParams()).bottomMargin;
        this.f20490b = w6.a.c(v3.getContext(), R.attr.motionDurationLong2, 225);
        this.f20491c = w6.a.c(v3.getContext(), R.attr.motionDurationMedium4, 175);
        this.f20492d = w6.a.d(v3.getContext(), R.attr.motionEasingEmphasizedInterpolator, h6.a.f28771d);
        this.f20493e = w6.a.d(v3.getContext(), R.attr.motionEasingEmphasizedInterpolator, h6.a.f28770c);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void l(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
        LinkedHashSet<b> linkedHashSet = this.f20489a;
        boolean z10 = false;
        if (i10 > 0) {
            if (this.f20494g == 1) {
                z10 = true;
            }
            if (!z10) {
                ViewPropertyAnimator viewPropertyAnimator = this.f20496i;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    view.clearAnimation();
                }
                this.f20494g = 1;
                Iterator<b> it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
                s(view, this.f + this.f20495h, this.f20491c, this.f20493e);
                return;
            }
            return;
        }
        if (i10 < 0) {
            if (this.f20494g == 2) {
                z10 = true;
            }
            if (!z10) {
                ViewPropertyAnimator viewPropertyAnimator2 = this.f20496i;
                if (viewPropertyAnimator2 != null) {
                    viewPropertyAnimator2.cancel();
                    view.clearAnimation();
                }
                this.f20494g = 2;
                Iterator<b> it2 = linkedHashSet.iterator();
                while (it2.hasNext()) {
                    it2.next().a();
                }
                s(view, 0, this.f20490b, this.f20492d);
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, V v3, View view, View view2, int i10, int i11) {
        if (i10 == 2) {
            return true;
        }
        return false;
    }

    public final void s(V v3, int i10, long j10, TimeInterpolator timeInterpolator) {
        this.f20496i = v3.animate().translationY(i10).setInterpolator(timeInterpolator).setDuration(j10).setListener(new a());
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20489a = new LinkedHashSet<>();
        this.f = 0;
        this.f20494g = 2;
        this.f20495h = 0;
    }
}
