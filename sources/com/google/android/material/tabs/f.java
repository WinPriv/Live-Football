package com.google.android.material.tabs;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.huawei.hms.ads.gl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: TabLayoutMediator.java */
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final TabLayout f21074a;

    /* renamed from: b, reason: collision with root package name */
    public final ViewPager2 f21075b;

    /* renamed from: c, reason: collision with root package name */
    public final b f21076c;

    /* renamed from: d, reason: collision with root package name */
    public RecyclerView.g<?> f21077d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f21078e;

    /* compiled from: TabLayoutMediator.java */
    /* loaded from: classes2.dex */
    public class a extends RecyclerView.i {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onChanged() {
            f.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeChanged(int i10, int i11) {
            f.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeInserted(int i10, int i11) {
            f.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeMoved(int i10, int i11, int i12) {
            f.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeRemoved(int i10, int i11) {
            f.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeChanged(int i10, int i11, Object obj) {
            f.this.b();
        }
    }

    /* compiled from: TabLayoutMediator.java */
    /* loaded from: classes2.dex */
    public interface b {
        void a(TabLayout.f fVar, int i10);
    }

    /* compiled from: TabLayoutMediator.java */
    /* loaded from: classes2.dex */
    public static class c extends ViewPager2.e {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<TabLayout> f21080a;

        /* renamed from: c, reason: collision with root package name */
        public int f21082c = 0;

        /* renamed from: b, reason: collision with root package name */
        public int f21081b = 0;

        public c(TabLayout tabLayout) {
            this.f21080a = new WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public final void a(int i10) {
            this.f21081b = this.f21082c;
            this.f21082c = i10;
            TabLayout tabLayout = this.f21080a.get();
            if (tabLayout != null) {
                tabLayout.f21034r0 = this.f21082c;
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public final void b(float f, int i10, int i11) {
            boolean z10;
            TabLayout tabLayout = this.f21080a.get();
            if (tabLayout != null) {
                int i12 = this.f21082c;
                boolean z11 = false;
                if (i12 == 2 && this.f21081b != 1) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (i12 != 2 || this.f21081b != 0) {
                    z11 = true;
                }
                tabLayout.m(i10, f, z10, z11);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public final void c(int i10) {
            boolean z10;
            TabLayout tabLayout = this.f21080a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i10 && i10 < tabLayout.getTabCount()) {
                int i11 = this.f21082c;
                if (i11 != 0 && (i11 != 2 || this.f21081b != 0)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                tabLayout.k(tabLayout.g(i10), z10);
            }
        }
    }

    public f(TabLayout tabLayout, ViewPager2 viewPager2, b bVar) {
        this.f21074a = tabLayout;
        this.f21075b = viewPager2;
        this.f21076c = bVar;
    }

    public final void a() {
        if (!this.f21078e) {
            ViewPager2 viewPager2 = this.f21075b;
            RecyclerView.g<?> adapter = viewPager2.getAdapter();
            this.f21077d = adapter;
            if (adapter != null) {
                this.f21078e = true;
                TabLayout tabLayout = this.f21074a;
                viewPager2.f2548u.f2568a.add(new c(tabLayout));
                d dVar = new d(viewPager2, true);
                ArrayList<TabLayout.c> arrayList = tabLayout.f21025i0;
                if (!arrayList.contains(dVar)) {
                    arrayList.add(dVar);
                }
                this.f21077d.registerAdapterDataObserver(new a());
                b();
                tabLayout.m(viewPager2.getCurrentItem(), gl.Code, true, true);
                return;
            }
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        throw new IllegalStateException("TabLayoutMediator is already attached");
    }

    public final void b() {
        TabLayout tabLayout = this.f21074a;
        tabLayout.j();
        RecyclerView.g<?> gVar = this.f21077d;
        if (gVar != null) {
            int itemCount = gVar.getItemCount();
            for (int i10 = 0; i10 < itemCount; i10++) {
                TabLayout.f h10 = tabLayout.h();
                this.f21076c.a(h10, i10);
                tabLayout.a(h10, false);
            }
            if (itemCount > 0) {
                int min = Math.min(this.f21075b.getCurrentItem(), tabLayout.getTabCount() - 1);
                if (min != tabLayout.getSelectedTabPosition()) {
                    tabLayout.k(tabLayout.g(min), true);
                }
            }
        }
    }

    /* compiled from: TabLayoutMediator.java */
    /* loaded from: classes2.dex */
    public static class d implements TabLayout.d {

        /* renamed from: a, reason: collision with root package name */
        public final ViewPager2 f21083a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f21084b;

        public d(ViewPager2 viewPager2, boolean z10) {
            this.f21083a = viewPager2;
            this.f21084b = z10;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void b(TabLayout.f fVar) {
            this.f21083a.b(fVar.f21060d, this.f21084b);
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void c() {
        }
    }
}
