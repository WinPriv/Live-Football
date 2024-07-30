package com.google.android.material.tabs;

import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* compiled from: TabLayout.java */
/* loaded from: classes2.dex */
public final class e implements View.OnLayoutChangeListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ View f21072s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ TabLayout.TabView f21073t;

    public e(TabLayout.TabView tabView, View view) {
        this.f21073t = tabView;
        this.f21072s = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        View view2 = this.f21072s;
        if (view2.getVisibility() == 0) {
            int i18 = TabLayout.TabView.D;
            this.f21073t.c(view2);
        }
    }
}
