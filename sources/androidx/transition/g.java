package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.e0;
import androidx.transition.i;
import java.util.ArrayList;

/* compiled from: FragmentTransitionSupport.java */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public class g extends e0 {

    /* compiled from: FragmentTransitionSupport.java */
    /* loaded from: classes.dex */
    public class b extends l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f2457a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f2458b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f2459c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ArrayList f2460d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Object f2461e;
        public final /* synthetic */ ArrayList f;

        public b(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f2457a = obj;
            this.f2458b = arrayList;
            this.f2459c = obj2;
            this.f2460d = arrayList2;
            this.f2461e = obj3;
            this.f = arrayList3;
        }

        @Override // androidx.transition.i.d
        public final void c(i iVar) {
            iVar.v(this);
        }

        @Override // androidx.transition.l, androidx.transition.i.d
        public final void d() {
            g gVar = g.this;
            Object obj = this.f2457a;
            if (obj != null) {
                gVar.u(obj, this.f2458b, null);
            }
            Object obj2 = this.f2459c;
            if (obj2 != null) {
                gVar.u(obj2, this.f2460d, null);
            }
            Object obj3 = this.f2461e;
            if (obj3 != null) {
                gVar.u(obj3, this.f, null);
            }
        }
    }

    /* compiled from: FragmentTransitionSupport.java */
    /* loaded from: classes.dex */
    public class c extends i.c {
    }

    @Override // androidx.fragment.app.e0
    public final void a(View view, Object obj) {
        if (obj != null) {
            ((i) obj).b(view);
        }
    }

    @Override // androidx.fragment.app.e0
    public final void b(Object obj, ArrayList<View> arrayList) {
        boolean z10;
        i iVar;
        i iVar2 = (i) obj;
        if (iVar2 == null) {
            return;
        }
        int i10 = 0;
        if (iVar2 instanceof o) {
            o oVar = (o) iVar2;
            int size = oVar.P.size();
            while (i10 < size) {
                if (i10 >= 0 && i10 < oVar.P.size()) {
                    iVar = oVar.P.get(i10);
                } else {
                    iVar = null;
                }
                b(iVar, arrayList);
                i10++;
            }
            return;
        }
        if (e0.h(iVar2.f2467w) && e0.h(null) && e0.h(null)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 && e0.h(iVar2.f2468x)) {
            int size2 = arrayList.size();
            while (i10 < size2) {
                iVar2.b(arrayList.get(i10));
                i10++;
            }
        }
    }

    @Override // androidx.fragment.app.e0
    public final void c(ViewGroup viewGroup, Object obj) {
        m.a(viewGroup, (i) obj);
    }

    @Override // androidx.fragment.app.e0
    public final boolean e(Object obj) {
        return obj instanceof i;
    }

    @Override // androidx.fragment.app.e0
    public final Object f(Object obj) {
        if (obj != null) {
            return ((i) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.e0
    public final Object i(Object obj, Object obj2, Object obj3) {
        i iVar = (i) obj;
        i iVar2 = (i) obj2;
        i iVar3 = (i) obj3;
        if (iVar != null && iVar2 != null) {
            o oVar = new o();
            oVar.H(iVar);
            oVar.H(iVar2);
            oVar.K(1);
            iVar = oVar;
        } else if (iVar == null) {
            if (iVar2 != null) {
                iVar = iVar2;
            } else {
                iVar = null;
            }
        }
        if (iVar3 != null) {
            o oVar2 = new o();
            if (iVar != null) {
                oVar2.H(iVar);
            }
            oVar2.H(iVar3);
            return oVar2;
        }
        return iVar;
    }

    @Override // androidx.fragment.app.e0
    public final Object j(Object obj, Object obj2, Object obj3) {
        o oVar = new o();
        if (obj != null) {
            oVar.H((i) obj);
        }
        if (obj2 != null) {
            oVar.H((i) obj2);
        }
        if (obj3 != null) {
            oVar.H((i) obj3);
        }
        return oVar;
    }

    @Override // androidx.fragment.app.e0
    public final void l(Object obj, View view, ArrayList<View> arrayList) {
        ((i) obj).a(new a(view, arrayList));
    }

    @Override // androidx.fragment.app.e0
    public final void m(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((i) obj).a(new b(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.e0
    public final void n(View view, Object obj) {
        if (view != null) {
            e0.g(view, new Rect());
            ((i) obj).A(new f());
        }
    }

    @Override // androidx.fragment.app.e0
    public final void o(Object obj, Rect rect) {
        if (obj != null) {
            ((i) obj).A(new c());
        }
    }

    @Override // androidx.fragment.app.e0
    public final void r(Object obj, View view, ArrayList<View> arrayList) {
        o oVar = (o) obj;
        ArrayList<View> arrayList2 = oVar.f2468x;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            e0.d(arrayList.get(i10), arrayList2);
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(oVar, arrayList);
    }

    @Override // androidx.fragment.app.e0
    public final void s(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        o oVar = (o) obj;
        if (oVar != null) {
            ArrayList<View> arrayList3 = oVar.f2468x;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            u(oVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.e0
    public final Object t(Object obj) {
        if (obj == null) {
            return null;
        }
        o oVar = new o();
        oVar.H((i) obj);
        return oVar;
    }

    public final void u(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        boolean z10;
        int size;
        i iVar;
        i iVar2 = (i) obj;
        int i10 = 0;
        if (iVar2 instanceof o) {
            o oVar = (o) iVar2;
            int size2 = oVar.P.size();
            while (i10 < size2) {
                if (i10 >= 0 && i10 < oVar.P.size()) {
                    iVar = oVar.P.get(i10);
                } else {
                    iVar = null;
                }
                u(iVar, arrayList, arrayList2);
                i10++;
            }
            return;
        }
        if (e0.h(iVar2.f2467w) && e0.h(null) && e0.h(null)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            ArrayList<View> arrayList3 = iVar2.f2468x;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                while (i10 < size) {
                    iVar2.b(arrayList2.get(i10));
                    i10++;
                }
                int size3 = arrayList.size();
                while (true) {
                    size3--;
                    if (size3 >= 0) {
                        iVar2.w(arrayList.get(size3));
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* compiled from: FragmentTransitionSupport.java */
    /* loaded from: classes.dex */
    public class a implements i.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f2455a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f2456b;

        public a(View view, ArrayList arrayList) {
            this.f2455a = view;
            this.f2456b = arrayList;
        }

        @Override // androidx.transition.i.d
        public final void c(i iVar) {
            iVar.v(this);
            this.f2455a.setVisibility(8);
            ArrayList arrayList = this.f2456b;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) arrayList.get(i10)).setVisibility(0);
            }
        }

        @Override // androidx.transition.i.d
        public final void a() {
        }

        @Override // androidx.transition.i.d
        public final void b() {
        }

        @Override // androidx.transition.i.d
        public final void d() {
        }

        @Override // androidx.transition.i.d
        public final void e() {
        }
    }
}
