package androidx.fragment.app;

import androidx.lifecycle.i;

/* compiled from: FragmentViewLifecycleOwner.java */
/* loaded from: classes.dex */
public final class f0 implements androidx.lifecycle.g, i1.d, androidx.lifecycle.j0 {

    /* renamed from: s, reason: collision with root package name */
    public final androidx.lifecycle.i0 f1811s;

    /* renamed from: t, reason: collision with root package name */
    public androidx.lifecycle.n f1812t = null;

    /* renamed from: u, reason: collision with root package name */
    public i1.c f1813u = null;

    public f0(androidx.lifecycle.i0 i0Var) {
        this.f1811s = i0Var;
    }

    public final void a(i.b bVar) {
        this.f1812t.f(bVar);
    }

    public final void b() {
        if (this.f1812t == null) {
            this.f1812t = new androidx.lifecycle.n(this);
            this.f1813u = new i1.c(this);
        }
    }

    @Override // androidx.lifecycle.m
    public final androidx.lifecycle.i getLifecycle() {
        b();
        return this.f1812t;
    }

    @Override // i1.d
    public final i1.b getSavedStateRegistry() {
        b();
        return this.f1813u.f29034b;
    }

    @Override // androidx.lifecycle.j0
    public final androidx.lifecycle.i0 getViewModelStore() {
        b();
        return this.f1811s;
    }
}
