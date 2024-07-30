package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: AppBarLayout.java */
/* loaded from: classes2.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f20460a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f20461b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f20462c;

    public a(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        this.f20462c = baseBehavior;
        this.f20460a = coordinatorLayout;
        this.f20461b = appBarLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f20462c.A(this.f20460a, this.f20461b, intValue);
    }
}
