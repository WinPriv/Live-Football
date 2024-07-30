package androidx.viewpager2.adapter;

import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/* compiled from: FragmentStateAdapter.java */
/* loaded from: classes.dex */
public final class b extends FragmentManager.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fragment f2539a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f2540b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FragmentStateAdapter f2541c;

    public b(FragmentStateAdapter fragmentStateAdapter, Fragment fragment, FrameLayout frameLayout) {
        this.f2541c = fragmentStateAdapter;
        this.f2539a = fragment;
        this.f2540b = frameLayout;
    }

    @Override // androidx.fragment.app.FragmentManager.k
    public final void b(FragmentManager fragmentManager, Fragment fragment, View view) {
        if (fragment == this.f2539a) {
            fragmentManager.d0(this);
            this.f2541c.getClass();
            FragmentStateAdapter.c(view, this.f2540b);
        }
    }
}
