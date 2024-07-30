package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.s;
import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.m;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Iterator;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;
import q.h;

/* loaded from: classes.dex */
public abstract class FragmentStateAdapter extends RecyclerView.g<f> implements g {

    /* renamed from: i, reason: collision with root package name */
    public final i f2519i;

    /* renamed from: j, reason: collision with root package name */
    public final FragmentManager f2520j;

    /* renamed from: k, reason: collision with root package name */
    public final q.f<Fragment> f2521k;

    /* renamed from: l, reason: collision with root package name */
    public final q.f<Fragment.SavedState> f2522l;

    /* renamed from: m, reason: collision with root package name */
    public final q.f<Integer> f2523m;

    /* renamed from: n, reason: collision with root package name */
    public b f2524n;
    public boolean o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2525p;

    /* loaded from: classes.dex */
    public static abstract class a extends RecyclerView.i {
        public a(int i10) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeChanged(int i10, int i11) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeInserted(int i10, int i11) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeMoved(int i10, int i11, int i12) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeRemoved(int i10, int i11) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeChanged(int i10, int i11, Object obj) {
            onChanged();
        }
    }

    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a, reason: collision with root package name */
        public d f2531a;

        /* renamed from: b, reason: collision with root package name */
        public e f2532b;

        /* renamed from: c, reason: collision with root package name */
        public k f2533c;

        /* renamed from: d, reason: collision with root package name */
        public ViewPager2 f2534d;

        /* renamed from: e, reason: collision with root package name */
        public long f2535e = -1;

        public b() {
        }

        public static ViewPager2 a(RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        public final void b(boolean z10) {
            boolean z11;
            int currentItem;
            boolean z12;
            FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
            if (fragmentStateAdapter.f2520j.K() || this.f2534d.getScrollState() != 0) {
                return;
            }
            q.f<Fragment> fVar = fragmentStateAdapter.f2521k;
            if (fVar.h() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 || fragmentStateAdapter.getItemCount() == 0 || (currentItem = this.f2534d.getCurrentItem()) >= fragmentStateAdapter.getItemCount()) {
                return;
            }
            long j10 = currentItem;
            if (j10 == this.f2535e && !z10) {
                return;
            }
            Fragment fragment = null;
            Fragment fragment2 = (Fragment) fVar.d(j10, null);
            if (fragment2 != null && fragment2.isAdded()) {
                this.f2535e = j10;
                FragmentManager fragmentManager = fragmentStateAdapter.f2520j;
                fragmentManager.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
                for (int i10 = 0; i10 < fVar.h(); i10++) {
                    long e10 = fVar.e(i10);
                    Fragment i11 = fVar.i(i10);
                    if (i11.isAdded()) {
                        if (e10 != this.f2535e) {
                            aVar.j(i11, i.c.STARTED);
                        } else {
                            fragment = i11;
                        }
                        if (e10 == this.f2535e) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        i11.setMenuVisibility(z12);
                    }
                }
                if (fragment != null) {
                    aVar.j(fragment, i.c.RESUMED);
                }
                if (!aVar.f1890a.isEmpty()) {
                    if (!aVar.f1895g) {
                        aVar.f1776p.x(aVar, false);
                        return;
                    }
                    throw new IllegalStateException("This transaction is already being added to the back stack");
                }
            }
        }
    }

    public FragmentStateAdapter(FragmentActivity fragmentActivity) {
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        i lifecycle = fragmentActivity.getLifecycle();
        this.f2521k = new q.f<>();
        this.f2522l = new q.f<>();
        this.f2523m = new q.f<>();
        this.o = false;
        this.f2525p = false;
        this.f2520j = supportFragmentManager;
        this.f2519i = lifecycle;
        super.setHasStableIds(true);
    }

    public static void c(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() <= 1) {
            if (view.getParent() == frameLayout) {
                return;
            }
            if (frameLayout.getChildCount() > 0) {
                frameLayout.removeAllViews();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            frameLayout.addView(view);
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    @Override // androidx.viewpager2.adapter.g
    public final Bundle a() {
        q.f<Fragment> fVar = this.f2521k;
        int h10 = fVar.h();
        q.f<Fragment.SavedState> fVar2 = this.f2522l;
        Bundle bundle = new Bundle(fVar2.h() + h10);
        for (int i10 = 0; i10 < fVar.h(); i10++) {
            long e10 = fVar.e(i10);
            Fragment fragment = (Fragment) fVar.d(e10, null);
            if (fragment != null && fragment.isAdded()) {
                this.f2520j.P(bundle, a3.k.k("f#", e10), fragment);
            }
        }
        for (int i11 = 0; i11 < fVar2.h(); i11++) {
            long e11 = fVar2.e(i11);
            if (d(e11)) {
                bundle.putParcelable(a3.k.k("s#", e11), (Parcelable) fVar2.d(e11, null));
            }
        }
        return bundle;
    }

    @Override // androidx.viewpager2.adapter.g
    public final void b(Parcelable parcelable) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        q.f<Fragment.SavedState> fVar = this.f2522l;
        boolean z14 = false;
        if (fVar.h() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            q.f<Fragment> fVar2 = this.f2521k;
            if (fVar2.h() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                Bundle bundle = (Bundle) parcelable;
                if (bundle.getClassLoader() == null) {
                    bundle.setClassLoader(getClass().getClassLoader());
                }
                for (String str : bundle.keySet()) {
                    if (str.startsWith("f#") && str.length() > 2) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        long parseLong = Long.parseLong(str.substring(2));
                        FragmentManager fragmentManager = this.f2520j;
                        fragmentManager.getClass();
                        String string = bundle.getString(str);
                        Fragment fragment = null;
                        if (string != null) {
                            Fragment z15 = fragmentManager.z(string);
                            if (z15 != null) {
                                fragment = z15;
                            } else {
                                fragmentManager.c0(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
                                throw null;
                            }
                        }
                        fVar2.f(parseLong, fragment);
                    } else {
                        if (str.startsWith("s#") && str.length() > 2) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            long parseLong2 = Long.parseLong(str.substring(2));
                            Fragment.SavedState savedState = (Fragment.SavedState) bundle.getParcelable(str);
                            if (d(parseLong2)) {
                                fVar.f(parseLong2, savedState);
                            }
                        } else {
                            throw new IllegalArgumentException("Unexpected key in savedState: ".concat(str));
                        }
                    }
                }
                if (fVar2.h() == 0) {
                    z14 = true;
                }
                if (!z14) {
                    this.f2525p = true;
                    this.o = true;
                    f();
                    final Handler handler = new Handler(Looper.getMainLooper());
                    final c cVar = new c(this);
                    this.f2519i.a(new k() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.5
                        @Override // androidx.lifecycle.k
                        public final void c(m mVar, i.b bVar) {
                            if (bVar == i.b.ON_DESTROY) {
                                handler.removeCallbacks(cVar);
                                mVar.getLifecycle().c(this);
                            }
                        }
                    });
                    handler.postDelayed(cVar, 10000L);
                    return;
                }
                return;
            }
        }
        throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
    }

    public final boolean d(long j10) {
        if (j10 >= 0 && j10 < getItemCount()) {
            return true;
        }
        return false;
    }

    public abstract Fragment e(int i10);

    public final void f() {
        q.f<Fragment> fVar;
        q.f<Integer> fVar2;
        boolean z10;
        Fragment fragment;
        View view;
        if (this.f2525p && !this.f2520j.K()) {
            q.d dVar = new q.d();
            int i10 = 0;
            while (true) {
                fVar = this.f2521k;
                int h10 = fVar.h();
                fVar2 = this.f2523m;
                if (i10 >= h10) {
                    break;
                }
                long e10 = fVar.e(i10);
                if (!d(e10)) {
                    dVar.add(Long.valueOf(e10));
                    fVar2.g(e10);
                }
                i10++;
            }
            if (!this.o) {
                this.f2525p = false;
                for (int i11 = 0; i11 < fVar.h(); i11++) {
                    long e11 = fVar.e(i11);
                    if (fVar2.f34523s) {
                        fVar2.c();
                    }
                    boolean z11 = true;
                    if (q.e.e(fVar2.f34524t, fVar2.f34526v, e11) >= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10 && ((fragment = (Fragment) fVar.d(e11, null)) == null || (view = fragment.getView()) == null || view.getParent() == null)) {
                        z11 = false;
                    }
                    if (!z11) {
                        dVar.add(Long.valueOf(e11));
                    }
                }
            }
            Iterator it = dVar.iterator();
            while (true) {
                h.a aVar = (h.a) it;
                if (aVar.hasNext()) {
                    i(((Long) aVar.next()).longValue());
                } else {
                    return;
                }
            }
        }
    }

    public final Long g(int i10) {
        Long l10 = null;
        int i11 = 0;
        while (true) {
            q.f<Integer> fVar = this.f2523m;
            if (i11 < fVar.h()) {
                if (fVar.i(i11).intValue() == i10) {
                    if (l10 == null) {
                        l10 = Long.valueOf(fVar.e(i11));
                    } else {
                        throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                    }
                }
                i11++;
            } else {
                return l10;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final long getItemId(int i10) {
        return i10;
    }

    public final void h(final f fVar) {
        Fragment fragment = (Fragment) this.f2521k.d(fVar.getItemId(), null);
        if (fragment != null) {
            FrameLayout frameLayout = (FrameLayout) fVar.itemView;
            View view = fragment.getView();
            if (!fragment.isAdded() && view != null) {
                throw new IllegalStateException("Design assumption violated.");
            }
            boolean isAdded = fragment.isAdded();
            FragmentManager fragmentManager = this.f2520j;
            if (isAdded && view == null) {
                fragmentManager.f1735m.f1871a.add(new s.a(new androidx.viewpager2.adapter.b(this, fragment, frameLayout), false));
                return;
            }
            if (fragment.isAdded() && view.getParent() != null) {
                if (view.getParent() != frameLayout) {
                    c(view, frameLayout);
                    return;
                }
                return;
            }
            if (fragment.isAdded()) {
                c(view, frameLayout);
                return;
            }
            if (!fragmentManager.K()) {
                fragmentManager.f1735m.f1871a.add(new s.a(new androidx.viewpager2.adapter.b(this, fragment, frameLayout), false));
                fragmentManager.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
                aVar.c(0, fragment, "f" + fVar.getItemId(), 1);
                aVar.j(fragment, i.c.STARTED);
                if (!aVar.f1895g) {
                    aVar.f1776p.x(aVar, false);
                    this.f2524n.b(false);
                    return;
                }
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
            if (fragmentManager.C) {
                return;
            }
            this.f2519i.a(new k() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.2
                @Override // androidx.lifecycle.k
                public final void c(m mVar, i.b bVar) {
                    FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
                    if (fragmentStateAdapter.f2520j.K()) {
                        return;
                    }
                    mVar.getLifecycle().c(this);
                    f fVar2 = fVar;
                    FrameLayout frameLayout2 = (FrameLayout) fVar2.itemView;
                    WeakHashMap<View, l0> weakHashMap = c0.f33054a;
                    if (c0.g.b(frameLayout2)) {
                        fragmentStateAdapter.h(fVar2);
                    }
                }
            });
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    public final void i(long j10) {
        ViewParent parent;
        q.f<Fragment> fVar = this.f2521k;
        Fragment fragment = (Fragment) fVar.d(j10, null);
        if (fragment == null) {
            return;
        }
        if (fragment.getView() != null && (parent = fragment.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        boolean d10 = d(j10);
        q.f<Fragment.SavedState> fVar2 = this.f2522l;
        if (!d10) {
            fVar2.g(j10);
        }
        if (!fragment.isAdded()) {
            fVar.g(j10);
            return;
        }
        FragmentManager fragmentManager = this.f2520j;
        if (fragmentManager.K()) {
            this.f2525p = true;
            return;
        }
        if (fragment.isAdded() && d(j10)) {
            fVar2.f(j10, fragmentManager.U(fragment));
        }
        fragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
        aVar.i(fragment);
        if (!aVar.f1895g) {
            aVar.f1776p.x(aVar, false);
            fVar.g(j10);
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        boolean z10;
        if (this.f2524n == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            final b bVar = new b();
            this.f2524n = bVar;
            bVar.f2534d = b.a(recyclerView);
            d dVar = new d(bVar);
            bVar.f2531a = dVar;
            bVar.f2534d.f2548u.f2568a.add(dVar);
            e eVar = new e(bVar);
            bVar.f2532b = eVar;
            registerAdapterDataObserver(eVar);
            k kVar = new k() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3
                @Override // androidx.lifecycle.k
                public final void c(m mVar, i.b bVar2) {
                    FragmentStateAdapter.b.this.b(false);
                }
            };
            bVar.f2533c = kVar;
            this.f2519i.a(kVar);
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onBindViewHolder(f fVar, int i10) {
        boolean z10;
        f fVar2 = fVar;
        long itemId = fVar2.getItemId();
        int id2 = ((FrameLayout) fVar2.itemView).getId();
        Long g6 = g(id2);
        q.f<Integer> fVar3 = this.f2523m;
        if (g6 != null && g6.longValue() != itemId) {
            i(g6.longValue());
            fVar3.g(g6.longValue());
        }
        fVar3.f(itemId, Integer.valueOf(id2));
        long j10 = i10;
        q.f<Fragment> fVar4 = this.f2521k;
        if (fVar4.f34523s) {
            fVar4.c();
        }
        if (q.e.e(fVar4.f34524t, fVar4.f34526v, j10) >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            Fragment e10 = e(i10);
            e10.setInitialSavedState((Fragment.SavedState) this.f2522l.d(j10, null));
            fVar4.f(j10, e10);
        }
        FrameLayout frameLayout = (FrameLayout) fVar2.itemView;
        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
        if (c0.g.b(frameLayout)) {
            if (frameLayout.getParent() == null) {
                frameLayout.addOnLayoutChangeListener(new androidx.viewpager2.adapter.a(this, frameLayout, fVar2));
            } else {
                throw new IllegalStateException("Design assumption violated.");
            }
        }
        f();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final f onCreateViewHolder(ViewGroup viewGroup, int i10) {
        int i11 = f.f2545b;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
        frameLayout.setId(c0.e.a());
        frameLayout.setSaveEnabled(false);
        return new f(frameLayout);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        b bVar = this.f2524n;
        bVar.getClass();
        ViewPager2 a10 = b.a(recyclerView);
        a10.f2548u.f2568a.remove(bVar.f2531a);
        e eVar = bVar.f2532b;
        FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
        fragmentStateAdapter.unregisterAdapterDataObserver(eVar);
        fragmentStateAdapter.f2519i.c(bVar.f2533c);
        bVar.f2534d = null;
        this.f2524n = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final /* bridge */ /* synthetic */ boolean onFailedToRecycleView(f fVar) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onViewAttachedToWindow(f fVar) {
        h(fVar);
        f();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onViewRecycled(f fVar) {
        Long g6 = g(((FrameLayout) fVar.itemView).getId());
        if (g6 != null) {
            i(g6.longValue());
            this.f2523m.g(g6.longValue());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void setHasStableIds(boolean z10) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }
}
