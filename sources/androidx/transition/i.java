package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;

/* compiled from: Transition.java */
/* loaded from: classes.dex */
public abstract class i implements Cloneable {
    public static final int[] M = {2, 1, 3, 4};
    public static final a N = new a();
    public static final ThreadLocal<q.b<Animator, b>> O = new ThreadLocal<>();
    public ArrayList<q> C;
    public ArrayList<q> D;
    public c K;

    /* renamed from: s, reason: collision with root package name */
    public final String f2463s = getClass().getName();

    /* renamed from: t, reason: collision with root package name */
    public long f2464t = -1;

    /* renamed from: u, reason: collision with root package name */
    public long f2465u = -1;

    /* renamed from: v, reason: collision with root package name */
    public TimeInterpolator f2466v = null;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList<Integer> f2467w = new ArrayList<>();

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList<View> f2468x = new ArrayList<>();
    public y1.g y = new y1.g();

    /* renamed from: z, reason: collision with root package name */
    public y1.g f2469z = new y1.g();
    public o A = null;
    public final int[] B = M;
    public final ArrayList<Animator> E = new ArrayList<>();
    public int F = 0;
    public boolean G = false;
    public boolean H = false;
    public ArrayList<d> I = null;
    public ArrayList<Animator> J = new ArrayList<>();
    public c5.e L = N;

    /* compiled from: Transition.java */
    /* loaded from: classes.dex */
    public static class a extends c5.e {
        @Override // c5.e
        public final Path h(float f, float f10, float f11, float f12) {
            Path path = new Path();
            path.moveTo(f, f10);
            path.lineTo(f11, f12);
            return path;
        }
    }

    /* compiled from: Transition.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final View f2470a;

        /* renamed from: b, reason: collision with root package name */
        public final String f2471b;

        /* renamed from: c, reason: collision with root package name */
        public final q f2472c;

        /* renamed from: d, reason: collision with root package name */
        public final d0 f2473d;

        /* renamed from: e, reason: collision with root package name */
        public final i f2474e;

        public b(View view, String str, i iVar, c0 c0Var, q qVar) {
            this.f2470a = view;
            this.f2471b = str;
            this.f2472c = qVar;
            this.f2473d = c0Var;
            this.f2474e = iVar;
        }
    }

    /* compiled from: Transition.java */
    /* loaded from: classes.dex */
    public static abstract class c {
    }

    /* compiled from: Transition.java */
    /* loaded from: classes.dex */
    public interface d {
        void a();

        void b();

        void c(i iVar);

        void d();

        void e();
    }

    public static void c(y1.g gVar, View view, q qVar) {
        ((q.b) gVar.f36544t).put(view, qVar);
        int id2 = view.getId();
        if (id2 >= 0) {
            SparseArray sparseArray = (SparseArray) gVar.f36545u;
            if (sparseArray.indexOfKey(id2) >= 0) {
                sparseArray.put(id2, null);
            } else {
                sparseArray.put(id2, view);
            }
        }
        WeakHashMap<View, l0> weakHashMap = n0.c0.f33054a;
        String k10 = c0.i.k(view);
        if (k10 != null) {
            q.b bVar = (q.b) gVar.f36547w;
            if (bVar.containsKey(k10)) {
                bVar.put(k10, null);
            } else {
                bVar.put(k10, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                q.f fVar = (q.f) gVar.f36546v;
                if (fVar.f34523s) {
                    fVar.c();
                }
                if (q.e.e(fVar.f34524t, fVar.f34526v, itemIdAtPosition) >= 0) {
                    View view2 = (View) fVar.d(itemIdAtPosition, null);
                    if (view2 != null) {
                        c0.d.r(view2, false);
                        fVar.f(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                c0.d.r(view, true);
                fVar.f(itemIdAtPosition, view);
            }
        }
    }

    public static q.b<Animator, b> o() {
        ThreadLocal<q.b<Animator, b>> threadLocal = O;
        q.b<Animator, b> bVar = threadLocal.get();
        if (bVar == null) {
            q.b<Animator, b> bVar2 = new q.b<>();
            threadLocal.set(bVar2);
            return bVar2;
        }
        return bVar;
    }

    public static boolean t(q qVar, q qVar2, String str) {
        Object obj = qVar.f2490a.get(str);
        Object obj2 = qVar2.f2490a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(c cVar) {
        this.K = cVar;
    }

    public void B(TimeInterpolator timeInterpolator) {
        this.f2466v = timeInterpolator;
    }

    public void C(c5.e eVar) {
        if (eVar == null) {
            this.L = N;
        } else {
            this.L = eVar;
        }
    }

    public void E(long j10) {
        this.f2464t = j10;
    }

    public final void F() {
        if (this.F == 0) {
            ArrayList<d> arrayList = this.I;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.I.clone();
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((d) arrayList2.get(i10)).d();
                }
            }
            this.H = false;
        }
        this.F++;
    }

    public String G(String str) {
        StringBuilder j10 = com.ironsource.adapters.facebook.a.j(str);
        j10.append(getClass().getSimpleName());
        j10.append("@");
        j10.append(Integer.toHexString(hashCode()));
        j10.append(": ");
        String sb2 = j10.toString();
        if (this.f2465u != -1) {
            sb2 = a3.l.n(com.ironsource.adapters.facebook.a.l(sb2, "dur("), this.f2465u, ") ");
        }
        if (this.f2464t != -1) {
            sb2 = a3.l.n(com.ironsource.adapters.facebook.a.l(sb2, "dly("), this.f2464t, ") ");
        }
        if (this.f2466v != null) {
            StringBuilder l10 = com.ironsource.adapters.facebook.a.l(sb2, "interp(");
            l10.append(this.f2466v);
            l10.append(") ");
            sb2 = l10.toString();
        }
        ArrayList<Integer> arrayList = this.f2467w;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.f2468x;
        if (size > 0 || arrayList2.size() > 0) {
            String h10 = com.ironsource.adapters.facebook.a.h(sb2, "tgts(");
            if (arrayList.size() > 0) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (i10 > 0) {
                        h10 = com.ironsource.adapters.facebook.a.h(h10, ", ");
                    }
                    StringBuilder j11 = com.ironsource.adapters.facebook.a.j(h10);
                    j11.append(arrayList.get(i10));
                    h10 = j11.toString();
                }
            }
            if (arrayList2.size() > 0) {
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    if (i11 > 0) {
                        h10 = com.ironsource.adapters.facebook.a.h(h10, ", ");
                    }
                    StringBuilder j12 = com.ironsource.adapters.facebook.a.j(h10);
                    j12.append(arrayList2.get(i11));
                    h10 = j12.toString();
                }
            }
            return com.ironsource.adapters.facebook.a.h(h10, ")");
        }
        return sb2;
    }

    public void a(d dVar) {
        if (this.I == null) {
            this.I = new ArrayList<>();
        }
        this.I.add(dVar);
    }

    public void b(View view) {
        this.f2468x.add(view);
    }

    public abstract void d(q qVar);

    public final void e(View view, boolean z10) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            q qVar = new q(view);
            if (z10) {
                g(qVar);
            } else {
                d(qVar);
            }
            qVar.f2492c.add(this);
            f(qVar);
            if (z10) {
                c(this.y, view, qVar);
            } else {
                c(this.f2469z, view, qVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                e(viewGroup.getChildAt(i10), z10);
            }
        }
    }

    public abstract void g(q qVar);

    public final void h(ViewGroup viewGroup, boolean z10) {
        i(z10);
        ArrayList<Integer> arrayList = this.f2467w;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.f2468x;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(viewGroup, z10);
            return;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            View findViewById = viewGroup.findViewById(arrayList.get(i10).intValue());
            if (findViewById != null) {
                q qVar = new q(findViewById);
                if (z10) {
                    g(qVar);
                } else {
                    d(qVar);
                }
                qVar.f2492c.add(this);
                f(qVar);
                if (z10) {
                    c(this.y, findViewById, qVar);
                } else {
                    c(this.f2469z, findViewById, qVar);
                }
            }
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            View view = arrayList2.get(i11);
            q qVar2 = new q(view);
            if (z10) {
                g(qVar2);
            } else {
                d(qVar2);
            }
            qVar2.f2492c.add(this);
            f(qVar2);
            if (z10) {
                c(this.y, view, qVar2);
            } else {
                c(this.f2469z, view, qVar2);
            }
        }
    }

    public final void i(boolean z10) {
        if (z10) {
            ((q.b) this.y.f36544t).clear();
            ((SparseArray) this.y.f36545u).clear();
            ((q.f) this.y.f36546v).a();
        } else {
            ((q.b) this.f2469z.f36544t).clear();
            ((SparseArray) this.f2469z.f36545u).clear();
            ((q.f) this.f2469z.f36546v).a();
        }
    }

    @Override // 
    /* renamed from: j */
    public i clone() {
        try {
            i iVar = (i) super.clone();
            iVar.J = new ArrayList<>();
            iVar.y = new y1.g();
            iVar.f2469z = new y1.g();
            iVar.C = null;
            iVar.D = null;
            return iVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator k(ViewGroup viewGroup, q qVar, q qVar2) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void l(ViewGroup viewGroup, y1.g gVar, y1.g gVar2, ArrayList<q> arrayList, ArrayList<q> arrayList2) {
        boolean z10;
        Animator k10;
        View view;
        Animator animator;
        q qVar;
        Animator animator2;
        q qVar2;
        ViewGroup viewGroup2 = viewGroup;
        q.b<Animator, b> o = o();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            q qVar3 = arrayList.get(i10);
            q qVar4 = arrayList2.get(i10);
            if (qVar3 != null && !qVar3.f2492c.contains(this)) {
                qVar3 = null;
            }
            if (qVar4 != null && !qVar4.f2492c.contains(this)) {
                qVar4 = null;
            }
            if (qVar3 != null || qVar4 != null) {
                if (qVar3 != null && qVar4 != null && !r(qVar3, qVar4)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10 && (k10 = k(viewGroup2, qVar3, qVar4)) != null) {
                    if (qVar4 != null) {
                        String[] p10 = p();
                        view = qVar4.f2491b;
                        if (p10 != null && p10.length > 0) {
                            qVar2 = new q(view);
                            q qVar5 = (q) ((q.b) gVar2.f36544t).getOrDefault(view, null);
                            if (qVar5 != null) {
                                int i11 = 0;
                                while (i11 < p10.length) {
                                    HashMap hashMap = qVar2.f2490a;
                                    Animator animator3 = k10;
                                    String str = p10[i11];
                                    hashMap.put(str, qVar5.f2490a.get(str));
                                    i11++;
                                    k10 = animator3;
                                    p10 = p10;
                                }
                            }
                            Animator animator4 = k10;
                            int i12 = o.f34547u;
                            int i13 = 0;
                            while (true) {
                                if (i13 < i12) {
                                    b orDefault = o.getOrDefault(o.h(i13), null);
                                    if (orDefault.f2472c != null && orDefault.f2470a == view && orDefault.f2471b.equals(this.f2463s) && orDefault.f2472c.equals(qVar2)) {
                                        animator2 = null;
                                        break;
                                    }
                                    i13++;
                                } else {
                                    animator2 = animator4;
                                    break;
                                }
                            }
                        } else {
                            animator2 = k10;
                            qVar2 = null;
                        }
                        animator = animator2;
                        qVar = qVar2;
                    } else {
                        view = qVar3.f2491b;
                        animator = k10;
                        qVar = null;
                    }
                    if (animator != null) {
                        String str2 = this.f2463s;
                        y yVar = u.f2496a;
                        o.put(animator, new b(view, str2, this, new c0(viewGroup2), qVar));
                        this.J.add(animator);
                    }
                    i10++;
                    viewGroup2 = viewGroup;
                }
            }
            i10++;
            viewGroup2 = viewGroup;
        }
        if (sparseIntArray.size() != 0) {
            for (int i14 = 0; i14 < sparseIntArray.size(); i14++) {
                Animator animator5 = this.J.get(sparseIntArray.keyAt(i14));
                animator5.setStartDelay(animator5.getStartDelay() + (sparseIntArray.valueAt(i14) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i10 = this.F - 1;
        this.F = i10;
        if (i10 == 0) {
            ArrayList<d> arrayList = this.I;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.I.clone();
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((d) arrayList2.get(i11)).c(this);
                }
            }
            for (int i12 = 0; i12 < ((q.f) this.y.f36546v).h(); i12++) {
                View view = (View) ((q.f) this.y.f36546v).i(i12);
                if (view != null) {
                    WeakHashMap<View, l0> weakHashMap = n0.c0.f33054a;
                    c0.d.r(view, false);
                }
            }
            for (int i13 = 0; i13 < ((q.f) this.f2469z.f36546v).h(); i13++) {
                View view2 = (View) ((q.f) this.f2469z.f36546v).i(i13);
                if (view2 != null) {
                    WeakHashMap<View, l0> weakHashMap2 = n0.c0.f33054a;
                    c0.d.r(view2, false);
                }
            }
            this.H = true;
        }
    }

    public final q n(View view, boolean z10) {
        ArrayList<q> arrayList;
        ArrayList<q> arrayList2;
        o oVar = this.A;
        if (oVar != null) {
            return oVar.n(view, z10);
        }
        if (z10) {
            arrayList = this.C;
        } else {
            arrayList = this.D;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                q qVar = arrayList.get(i10);
                if (qVar == null) {
                    return null;
                }
                if (qVar.f2491b == view) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 < 0) {
            return null;
        }
        if (z10) {
            arrayList2 = this.D;
        } else {
            arrayList2 = this.C;
        }
        return arrayList2.get(i10);
    }

    public String[] p() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final q q(View view, boolean z10) {
        y1.g gVar;
        o oVar = this.A;
        if (oVar != null) {
            return oVar.q(view, z10);
        }
        if (z10) {
            gVar = this.y;
        } else {
            gVar = this.f2469z;
        }
        return (q) ((q.b) gVar.f36544t).getOrDefault(view, null);
    }

    public boolean r(q qVar, q qVar2) {
        if (qVar == null || qVar2 == null) {
            return false;
        }
        String[] p10 = p();
        if (p10 != null) {
            for (String str : p10) {
                if (!t(qVar, qVar2, str)) {
                }
            }
            return false;
        }
        Iterator it = qVar.f2490a.keySet().iterator();
        while (it.hasNext()) {
            if (t(qVar, qVar2, (String) it.next())) {
            }
        }
        return false;
        return true;
    }

    public final boolean s(View view) {
        int id2 = view.getId();
        ArrayList<Integer> arrayList = this.f2467w;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.f2468x;
        if ((size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id2)) || arrayList2.contains(view)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return G("");
    }

    public void u(View view) {
        int i10;
        if (!this.H) {
            q.b<Animator, b> o = o();
            int i11 = o.f34547u;
            y yVar = u.f2496a;
            WindowId windowId = view.getWindowId();
            int i12 = i11 - 1;
            while (true) {
                i10 = 0;
                if (i12 < 0) {
                    break;
                }
                b l10 = o.l(i12);
                if (l10.f2470a != null) {
                    d0 d0Var = l10.f2473d;
                    if ((d0Var instanceof c0) && ((c0) d0Var).f2451a.equals(windowId)) {
                        i10 = 1;
                    }
                    if (i10 != 0) {
                        o.h(i12).pause();
                    }
                }
                i12--;
            }
            ArrayList<d> arrayList = this.I;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.I.clone();
                int size = arrayList2.size();
                while (i10 < size) {
                    ((d) arrayList2.get(i10)).a();
                    i10++;
                }
            }
            this.G = true;
        }
    }

    public void v(d dVar) {
        ArrayList<d> arrayList = this.I;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(dVar);
        if (this.I.size() == 0) {
            this.I = null;
        }
    }

    public void w(View view) {
        this.f2468x.remove(view);
    }

    public void x(ViewGroup viewGroup) {
        boolean z10;
        if (this.G) {
            if (!this.H) {
                q.b<Animator, b> o = o();
                int i10 = o.f34547u;
                y yVar = u.f2496a;
                WindowId windowId = viewGroup.getWindowId();
                for (int i11 = i10 - 1; i11 >= 0; i11--) {
                    b l10 = o.l(i11);
                    if (l10.f2470a != null) {
                        d0 d0Var = l10.f2473d;
                        if ((d0Var instanceof c0) && ((c0) d0Var).f2451a.equals(windowId)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            o.h(i11).resume();
                        }
                    }
                }
                ArrayList<d> arrayList = this.I;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.I.clone();
                    int size = arrayList2.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        ((d) arrayList2.get(i12)).e();
                    }
                }
            }
            this.G = false;
        }
    }

    public void y() {
        F();
        q.b<Animator, b> o = o();
        Iterator<Animator> it = this.J.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (o.containsKey(next)) {
                F();
                if (next != null) {
                    next.addListener(new j(this, o));
                    long j10 = this.f2465u;
                    if (j10 >= 0) {
                        next.setDuration(j10);
                    }
                    long j11 = this.f2464t;
                    if (j11 >= 0) {
                        next.setStartDelay(next.getStartDelay() + j11);
                    }
                    TimeInterpolator timeInterpolator = this.f2466v;
                    if (timeInterpolator != null) {
                        next.setInterpolator(timeInterpolator);
                    }
                    next.addListener(new k(this));
                    next.start();
                }
            }
        }
        this.J.clear();
        m();
    }

    public void z(long j10) {
        this.f2465u = j10;
    }

    public void D() {
    }

    public void f(q qVar) {
    }
}
