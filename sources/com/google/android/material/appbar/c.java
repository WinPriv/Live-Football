package com.google.android.material.appbar;

import android.view.View;
import o0.k;

/* compiled from: AppBarLayout.java */
/* loaded from: classes2.dex */
public final class c implements k {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f20468s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f20469t;

    public c(AppBarLayout appBarLayout, boolean z10) {
        this.f20468s = appBarLayout;
        this.f20469t = z10;
    }

    @Override // o0.k
    public final boolean a(View view) {
        this.f20468s.setExpanded(this.f20469t);
        return true;
    }
}
