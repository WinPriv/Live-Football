package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import com.hamkho.livefoot.R;
import com.huawei.hms.ads.gl;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import n0.c0;

/* compiled from: SpecialEffectsController.java */
/* loaded from: classes.dex */
public abstract class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f1828a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<b> f1829b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList<b> f1830c = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    public boolean f1831d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1832e = false;

    /* compiled from: SpecialEffectsController.java */
    /* loaded from: classes.dex */
    public static class a extends b {

        /* renamed from: h, reason: collision with root package name */
        public final w f1833h;

        public a(int i10, int i11, w wVar, j0.d dVar) {
            super(i10, i11, wVar.f1883c, dVar);
            this.f1833h = wVar;
        }

        @Override // androidx.fragment.app.j0.b
        public final void b() {
            super.b();
            this.f1833h.k();
        }

        @Override // androidx.fragment.app.j0.b
        public final void d() {
            if (this.f1835b == 2) {
                w wVar = this.f1833h;
                Fragment fragment = wVar.f1883c;
                View findFocus = fragment.mView.findFocus();
                if (findFocus != null) {
                    fragment.setFocusedView(findFocus);
                    if (FragmentManager.H(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + fragment);
                    }
                }
                View requireView = this.f1836c.requireView();
                if (requireView.getParent() == null) {
                    wVar.b();
                    requireView.setAlpha(gl.Code);
                }
                if (requireView.getAlpha() == gl.Code && requireView.getVisibility() == 0) {
                    requireView.setVisibility(4);
                }
                requireView.setAlpha(fragment.getPostOnViewCreatedAlpha());
            }
        }
    }

    public j0(ViewGroup viewGroup) {
        this.f1828a = viewGroup;
    }

    public static j0 f(ViewGroup viewGroup, FragmentManager fragmentManager) {
        return g(viewGroup, fragmentManager.F());
    }

    public static j0 g(ViewGroup viewGroup, l0 l0Var) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof j0) {
            return (j0) tag;
        }
        ((FragmentManager.f) l0Var).getClass();
        k kVar = new k(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, kVar);
        return kVar;
    }

    public final void a(int i10, int i11, w wVar) {
        synchronized (this.f1829b) {
            j0.d dVar = new j0.d();
            b d10 = d(wVar.f1883c);
            if (d10 != null) {
                d10.c(i10, i11);
                return;
            }
            a aVar = new a(i10, i11, wVar, dVar);
            this.f1829b.add(aVar);
            aVar.f1837d.add(new h0(this, aVar));
            aVar.f1837d.add(new i0(this, aVar));
        }
    }

    public abstract void b(ArrayList arrayList, boolean z10);

    public final void c() {
        if (this.f1832e) {
            return;
        }
        ViewGroup viewGroup = this.f1828a;
        WeakHashMap<View, n0.l0> weakHashMap = n0.c0.f33054a;
        if (!c0.g.b(viewGroup)) {
            e();
            this.f1831d = false;
            return;
        }
        synchronized (this.f1829b) {
            if (!this.f1829b.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.f1830c);
                this.f1830c.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    b bVar = (b) it.next();
                    if (FragmentManager.H(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + bVar);
                    }
                    bVar.a();
                    if (!bVar.f1839g) {
                        this.f1830c.add(bVar);
                    }
                }
                i();
                ArrayList arrayList2 = new ArrayList(this.f1829b);
                this.f1829b.clear();
                this.f1830c.addAll(arrayList2);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((b) it2.next()).d();
                }
                b(arrayList2, this.f1831d);
                this.f1831d = false;
            }
        }
    }

    public final b d(Fragment fragment) {
        Iterator<b> it = this.f1829b.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.f1836c.equals(fragment) && !next.f) {
                return next;
            }
        }
        return null;
    }

    public final void e() {
        String str;
        String str2;
        ViewGroup viewGroup = this.f1828a;
        WeakHashMap<View, n0.l0> weakHashMap = n0.c0.f33054a;
        boolean b10 = c0.g.b(viewGroup);
        synchronized (this.f1829b) {
            i();
            Iterator<b> it = this.f1829b.iterator();
            while (it.hasNext()) {
                it.next().d();
            }
            Iterator it2 = new ArrayList(this.f1830c).iterator();
            while (it2.hasNext()) {
                b bVar = (b) it2.next();
                if (FragmentManager.H(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (b10) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.f1828a + " is not attached to window. ";
                    }
                    sb2.append(str2);
                    sb2.append("Cancelling running operation ");
                    sb2.append(bVar);
                    Log.v("FragmentManager", sb2.toString());
                }
                bVar.a();
            }
            Iterator it3 = new ArrayList(this.f1829b).iterator();
            while (it3.hasNext()) {
                b bVar2 = (b) it3.next();
                if (FragmentManager.H(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("SpecialEffectsController: ");
                    if (b10) {
                        str = "";
                    } else {
                        str = "Container " + this.f1828a + " is not attached to window. ";
                    }
                    sb3.append(str);
                    sb3.append("Cancelling pending operation ");
                    sb3.append(bVar2);
                    Log.v("FragmentManager", sb3.toString());
                }
                bVar2.a();
            }
        }
    }

    public final void h() {
        synchronized (this.f1829b) {
            i();
            this.f1832e = false;
            int size = this.f1829b.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                b bVar = this.f1829b.get(size);
                int c10 = a3.l.c(bVar.f1836c.mView);
                if (bVar.f1834a == 2 && c10 != 2) {
                    this.f1832e = bVar.f1836c.isPostponed();
                    break;
                }
            }
        }
    }

    public final void i() {
        Iterator<b> it = this.f1829b.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.f1835b == 2) {
                next.c(a3.l.b(next.f1836c.requireView().getVisibility()), 1);
            }
        }
    }

    /* compiled from: SpecialEffectsController.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f1834a;

        /* renamed from: b, reason: collision with root package name */
        public int f1835b;

        /* renamed from: c, reason: collision with root package name */
        public final Fragment f1836c;

        /* renamed from: d, reason: collision with root package name */
        public final ArrayList f1837d = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        public final HashSet<j0.d> f1838e = new HashSet<>();
        public boolean f = false;

        /* renamed from: g, reason: collision with root package name */
        public boolean f1839g = false;

        public b(int i10, int i11, Fragment fragment, j0.d dVar) {
            this.f1834a = i10;
            this.f1835b = i11;
            this.f1836c = fragment;
            dVar.b(new k0(this));
        }

        public final void a() {
            if (this.f) {
                return;
            }
            this.f = true;
            HashSet<j0.d> hashSet = this.f1838e;
            if (hashSet.isEmpty()) {
                b();
                return;
            }
            Iterator it = new ArrayList(hashSet).iterator();
            while (it.hasNext()) {
                ((j0.d) it.next()).a();
            }
        }

        public void b() {
            if (this.f1839g) {
                return;
            }
            if (FragmentManager.H(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f1839g = true;
            Iterator it = this.f1837d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void c(int i10, int i11) {
            if (i11 != 0) {
                int i12 = i11 - 1;
                Fragment fragment = this.f1836c;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            if (FragmentManager.H(2)) {
                                Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = " + a3.l.F(this.f1834a) + " -> REMOVED. mLifecycleImpact  = " + a3.k.C(this.f1835b) + " to REMOVING.");
                            }
                            this.f1834a = 1;
                            this.f1835b = 3;
                            return;
                        }
                        return;
                    }
                    if (this.f1834a == 1) {
                        if (FragmentManager.H(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + a3.k.C(this.f1835b) + " to ADDING.");
                        }
                        this.f1834a = 2;
                        this.f1835b = 2;
                        return;
                    }
                    return;
                }
                if (this.f1834a != 1) {
                    if (FragmentManager.H(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = " + a3.l.F(this.f1834a) + " -> " + a3.l.F(i10) + ". ");
                    }
                    this.f1834a = i10;
                    return;
                }
                return;
            }
            throw null;
        }

        public final String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + a3.l.F(this.f1834a) + "} {mLifecycleImpact = " + a3.k.C(this.f1835b) + "} {mFragment = " + this.f1836c + "}";
        }

        public void d() {
        }
    }
}
