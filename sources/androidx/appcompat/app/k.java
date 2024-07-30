package androidx.appcompat.app;

import android.view.View;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;

/* compiled from: AppCompatDelegateImpl.java */
/* loaded from: classes.dex */
public final class k extends a0.a {
    public final /* synthetic */ AppCompatDelegateImpl I0;

    public k(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.I0 = appCompatDelegateImpl;
    }

    @Override // n0.m0
    public final void a() {
        AppCompatDelegateImpl appCompatDelegateImpl = this.I0;
        appCompatDelegateImpl.N.setAlpha(1.0f);
        appCompatDelegateImpl.Q.d(null);
        appCompatDelegateImpl.Q = null;
    }

    @Override // a0.a, n0.m0
    public final void c() {
        AppCompatDelegateImpl appCompatDelegateImpl = this.I0;
        appCompatDelegateImpl.N.setVisibility(0);
        if (appCompatDelegateImpl.N.getParent() instanceof View) {
            View view = (View) appCompatDelegateImpl.N.getParent();
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            c0.h.c(view);
        }
    }
}
