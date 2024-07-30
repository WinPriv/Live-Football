package com.google.android.material.appbar;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import o0.k;

/* compiled from: AppBarLayout.java */
/* loaded from: classes2.dex */
public final class b implements k {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f20463s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f20464t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ View f20465u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f20466v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f20467w;

    public b(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
        this.f20467w = baseBehavior;
        this.f20463s = coordinatorLayout;
        this.f20464t = appBarLayout;
        this.f20465u = view;
        this.f20466v = i10;
    }

    @Override // o0.k
    public final boolean a(View view) {
        this.f20467w.E(this.f20463s, this.f20464t, this.f20465u, this.f20466v, new int[]{0, 0});
        return true;
    }
}
