package com.google.android.material.tabs;

import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* compiled from: TabLayout.java */
/* loaded from: classes2.dex */
public final class d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f21069a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f21070b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TabLayout.SlidingTabIndicator f21071c;

    public d(TabLayout.SlidingTabIndicator slidingTabIndicator, View view, View view2) {
        this.f21071c = slidingTabIndicator;
        this.f21069a = view;
        this.f21070b = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        int i10 = TabLayout.SlidingTabIndicator.f21043u;
        this.f21071c.c(this.f21069a, animatedFraction, this.f21070b);
    }
}
