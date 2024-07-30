package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: FragmentLifecycleCallbacksDispatcher.java */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList<a> f1871a = new CopyOnWriteArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    public final FragmentManager f1872b;

    /* compiled from: FragmentLifecycleCallbacksDispatcher.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final FragmentManager.k f1873a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f1874b;

        public a(FragmentManager.k kVar, boolean z10) {
            this.f1873a = kVar;
            this.f1874b = z10;
        }
    }

    public s(FragmentManager fragmentManager) {
        this.f1872b = fragmentManager;
    }

    public final void a(boolean z10) {
        Fragment fragment = this.f1872b.f1739r;
        if (fragment != null) {
            fragment.getParentFragmentManager().f1735m.a(true);
        }
        Iterator<a> it = this.f1871a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f1874b) {
                next.f1873a.getClass();
            }
        }
    }

    public final void b(boolean z10) {
        FragmentManager fragmentManager = this.f1872b;
        Context context = fragmentManager.f1737p.f1865t;
        Fragment fragment = fragmentManager.f1739r;
        if (fragment != null) {
            fragment.getParentFragmentManager().f1735m.b(true);
        }
        Iterator<a> it = this.f1871a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f1874b) {
                next.f1873a.getClass();
            }
        }
    }

    public final void c(boolean z10) {
        Fragment fragment = this.f1872b.f1739r;
        if (fragment != null) {
            fragment.getParentFragmentManager().f1735m.c(true);
        }
        Iterator<a> it = this.f1871a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f1874b) {
                next.f1873a.getClass();
            }
        }
    }

    public final void d(boolean z10) {
        Fragment fragment = this.f1872b.f1739r;
        if (fragment != null) {
            fragment.getParentFragmentManager().f1735m.d(true);
        }
        Iterator<a> it = this.f1871a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f1874b) {
                next.f1873a.getClass();
            }
        }
    }

    public final void e(Fragment fragment, boolean z10) {
        Fragment fragment2 = this.f1872b.f1739r;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f1735m.e(fragment, true);
        }
        Iterator<a> it = this.f1871a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f1874b) {
                next.f1873a.a(fragment);
            }
        }
    }

    public final void f(boolean z10) {
        Fragment fragment = this.f1872b.f1739r;
        if (fragment != null) {
            fragment.getParentFragmentManager().f1735m.f(true);
        }
        Iterator<a> it = this.f1871a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f1874b) {
                next.f1873a.getClass();
            }
        }
    }

    public final void g(boolean z10) {
        FragmentManager fragmentManager = this.f1872b;
        Context context = fragmentManager.f1737p.f1865t;
        Fragment fragment = fragmentManager.f1739r;
        if (fragment != null) {
            fragment.getParentFragmentManager().f1735m.g(true);
        }
        Iterator<a> it = this.f1871a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f1874b) {
                next.f1873a.getClass();
            }
        }
    }

    public final void h(boolean z10) {
        Fragment fragment = this.f1872b.f1739r;
        if (fragment != null) {
            fragment.getParentFragmentManager().f1735m.h(true);
        }
        Iterator<a> it = this.f1871a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f1874b) {
                next.f1873a.getClass();
            }
        }
    }

    public final void i(boolean z10) {
        Fragment fragment = this.f1872b.f1739r;
        if (fragment != null) {
            fragment.getParentFragmentManager().f1735m.i(true);
        }
        Iterator<a> it = this.f1871a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f1874b) {
                next.f1873a.getClass();
            }
        }
    }

    public final void j(boolean z10) {
        Fragment fragment = this.f1872b.f1739r;
        if (fragment != null) {
            fragment.getParentFragmentManager().f1735m.j(true);
        }
        Iterator<a> it = this.f1871a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f1874b) {
                next.f1873a.getClass();
            }
        }
    }

    public final void k(boolean z10) {
        Fragment fragment = this.f1872b.f1739r;
        if (fragment != null) {
            fragment.getParentFragmentManager().f1735m.k(true);
        }
        Iterator<a> it = this.f1871a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f1874b) {
                next.f1873a.getClass();
            }
        }
    }

    public final void l(boolean z10) {
        Fragment fragment = this.f1872b.f1739r;
        if (fragment != null) {
            fragment.getParentFragmentManager().f1735m.l(true);
        }
        Iterator<a> it = this.f1871a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f1874b) {
                next.f1873a.getClass();
            }
        }
    }

    public final void m(Fragment fragment, View view, Bundle bundle, boolean z10) {
        FragmentManager fragmentManager = this.f1872b;
        Fragment fragment2 = fragmentManager.f1739r;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f1735m.m(fragment, view, bundle, true);
        }
        Iterator<a> it = this.f1871a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f1874b) {
                next.f1873a.b(fragmentManager, fragment, view);
            }
        }
    }

    public final void n(boolean z10) {
        Fragment fragment = this.f1872b.f1739r;
        if (fragment != null) {
            fragment.getParentFragmentManager().f1735m.n(true);
        }
        Iterator<a> it = this.f1871a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f1874b) {
                next.f1873a.getClass();
            }
        }
    }
}
