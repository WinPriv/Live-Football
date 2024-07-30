package androidx.fragment.app;

import android.content.Context;
import android.transition.Transition;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.j0;
import androidx.fragment.app.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import n0.c0;
import q.h;

/* compiled from: DefaultSpecialEffectsController.java */
/* loaded from: classes.dex */
public final class k extends j0 {

    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: classes.dex */
    public static class a extends b {

        /* renamed from: c, reason: collision with root package name */
        public final boolean f1840c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f1841d;

        /* renamed from: e, reason: collision with root package name */
        public m.a f1842e;

        public a(j0.b bVar, j0.d dVar, boolean z10) {
            super(bVar, dVar);
            this.f1841d = false;
            this.f1840c = z10;
        }

        public final m.a c(Context context) {
            boolean z10;
            if (this.f1841d) {
                return this.f1842e;
            }
            j0.b bVar = this.f1843a;
            Fragment fragment = bVar.f1836c;
            if (bVar.f1834a == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            m.a a10 = m.a(context, fragment, z10, this.f1840c);
            this.f1842e = a10;
            this.f1841d = true;
            return a10;
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final j0.b f1843a;

        /* renamed from: b, reason: collision with root package name */
        public final j0.d f1844b;

        public b(j0.b bVar, j0.d dVar) {
            this.f1843a = bVar;
            this.f1844b = dVar;
        }

        public final void a() {
            j0.b bVar = this.f1843a;
            HashSet<j0.d> hashSet = bVar.f1838e;
            if (hashSet.remove(this.f1844b) && hashSet.isEmpty()) {
                bVar.b();
            }
        }

        public final boolean b() {
            j0.b bVar = this.f1843a;
            int c10 = a3.l.c(bVar.f1836c.mView);
            int i10 = bVar.f1834a;
            if (c10 != i10 && (c10 == 2 || i10 == 2)) {
                return false;
            }
            return true;
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: classes.dex */
    public static class c extends b {

        /* renamed from: c, reason: collision with root package name */
        public final Object f1845c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f1846d;

        /* renamed from: e, reason: collision with root package name */
        public final Object f1847e;

        public c(j0.b bVar, j0.d dVar, boolean z10, boolean z11) {
            super(bVar, dVar);
            Object exitTransition;
            Object enterTransition;
            boolean allowEnterTransitionOverlap;
            int i10 = bVar.f1834a;
            Fragment fragment = bVar.f1836c;
            if (i10 == 2) {
                if (z10) {
                    enterTransition = fragment.getReenterTransition();
                } else {
                    enterTransition = fragment.getEnterTransition();
                }
                this.f1845c = enterTransition;
                if (z10) {
                    allowEnterTransitionOverlap = fragment.getAllowReturnTransitionOverlap();
                } else {
                    allowEnterTransitionOverlap = fragment.getAllowEnterTransitionOverlap();
                }
                this.f1846d = allowEnterTransitionOverlap;
            } else {
                if (z10) {
                    exitTransition = fragment.getReturnTransition();
                } else {
                    exitTransition = fragment.getExitTransition();
                }
                this.f1845c = exitTransition;
                this.f1846d = true;
            }
            if (z11) {
                if (z10) {
                    this.f1847e = fragment.getSharedElementReturnTransition();
                    return;
                } else {
                    this.f1847e = fragment.getSharedElementEnterTransition();
                    return;
                }
            }
            this.f1847e = null;
        }

        public final e0 c(Object obj) {
            if (obj == null) {
                return null;
            }
            b0 b0Var = z.f1910a;
            if (b0Var != null && (obj instanceof Transition)) {
                return b0Var;
            }
            e0 e0Var = z.f1911b;
            if (e0Var != null && e0Var.e(obj)) {
                return e0Var;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f1843a.f1836c + " is not a valid framework Transition or AndroidX Transition");
        }
    }

    public k(ViewGroup viewGroup) {
        super(viewGroup);
    }

    public static void j(ArrayList arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (n0.h0.b(viewGroup)) {
                if (!arrayList.contains(view)) {
                    arrayList.add(viewGroup);
                    return;
                }
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    j(arrayList, childAt);
                }
            }
            return;
        }
        if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    public static void k(q.b bVar, View view) {
        WeakHashMap<View, n0.l0> weakHashMap = n0.c0.f33054a;
        String k10 = c0.i.k(view);
        if (k10 != null) {
            bVar.put(k10, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    k(bVar, childAt);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void l(q.b bVar, Collection collection) {
        Iterator it = ((h.b) bVar.entrySet()).iterator();
        while (true) {
            h.d dVar = (h.d) it;
            if (dVar.hasNext()) {
                dVar.next();
                View view = (View) dVar.getValue();
                WeakHashMap<View, n0.l0> weakHashMap = n0.c0.f33054a;
                if (!collection.contains(c0.i.k(view))) {
                    dVar.remove();
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0627 A[LOOP:6: B:151:0x0621->B:153:0x0627, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x04f2  */
    @Override // androidx.fragment.app.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.util.ArrayList r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 1595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.k.b(java.util.ArrayList, boolean):void");
    }
}
