package androidx.transition;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.i;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TransitionSet.java */
/* loaded from: classes.dex */
public class o extends i {
    public int R;
    public ArrayList<i> P = new ArrayList<>();
    public boolean Q = true;
    public boolean S = false;
    public int T = 0;

    /* compiled from: TransitionSet.java */
    /* loaded from: classes.dex */
    public class a extends l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f2485a;

        public a(i iVar) {
            this.f2485a = iVar;
        }

        @Override // androidx.transition.i.d
        public final void c(i iVar) {
            this.f2485a.y();
            iVar.v(this);
        }
    }

    /* compiled from: TransitionSet.java */
    /* loaded from: classes.dex */
    public static class b extends l {

        /* renamed from: a, reason: collision with root package name */
        public final o f2486a;

        public b(o oVar) {
            this.f2486a = oVar;
        }

        @Override // androidx.transition.i.d
        public final void c(i iVar) {
            o oVar = this.f2486a;
            int i10 = oVar.R - 1;
            oVar.R = i10;
            if (i10 == 0) {
                oVar.S = false;
                oVar.m();
            }
            iVar.v(this);
        }

        @Override // androidx.transition.l, androidx.transition.i.d
        public final void d() {
            o oVar = this.f2486a;
            if (!oVar.S) {
                oVar.F();
                oVar.S = true;
            }
        }
    }

    @Override // androidx.transition.i
    public final void A(i.c cVar) {
        this.K = cVar;
        this.T |= 8;
        int size = this.P.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.P.get(i10).A(cVar);
        }
    }

    @Override // androidx.transition.i
    public final void C(c5.e eVar) {
        super.C(eVar);
        this.T |= 4;
        if (this.P != null) {
            for (int i10 = 0; i10 < this.P.size(); i10++) {
                this.P.get(i10).C(eVar);
            }
        }
    }

    @Override // androidx.transition.i
    public final void D() {
        this.T |= 2;
        int size = this.P.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.P.get(i10).D();
        }
    }

    @Override // androidx.transition.i
    public final void E(long j10) {
        this.f2464t = j10;
    }

    @Override // androidx.transition.i
    public final String G(String str) {
        String G = super.G(str);
        for (int i10 = 0; i10 < this.P.size(); i10++) {
            StringBuilder l10 = com.ironsource.adapters.facebook.a.l(G, "\n");
            l10.append(this.P.get(i10).G(str + "  "));
            G = l10.toString();
        }
        return G;
    }

    public final void H(i iVar) {
        this.P.add(iVar);
        iVar.A = this;
        long j10 = this.f2465u;
        if (j10 >= 0) {
            iVar.z(j10);
        }
        if ((this.T & 1) != 0) {
            iVar.B(this.f2466v);
        }
        if ((this.T & 2) != 0) {
            iVar.D();
        }
        if ((this.T & 4) != 0) {
            iVar.C(this.L);
        }
        if ((this.T & 8) != 0) {
            iVar.A(this.K);
        }
    }

    @Override // androidx.transition.i
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public final void z(long j10) {
        ArrayList<i> arrayList;
        this.f2465u = j10;
        if (j10 >= 0 && (arrayList = this.P) != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.P.get(i10).z(j10);
            }
        }
    }

    @Override // androidx.transition.i
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final void B(TimeInterpolator timeInterpolator) {
        this.T |= 1;
        ArrayList<i> arrayList = this.P;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.P.get(i10).B(timeInterpolator);
            }
        }
        this.f2466v = timeInterpolator;
    }

    public final void K(int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                this.Q = false;
                return;
            }
            throw new AndroidRuntimeException(a3.l.i("Invalid parameter for TransitionSet ordering: ", i10));
        }
        this.Q = true;
    }

    @Override // androidx.transition.i
    public final void a(i.d dVar) {
        super.a(dVar);
    }

    @Override // androidx.transition.i
    public final void b(View view) {
        for (int i10 = 0; i10 < this.P.size(); i10++) {
            this.P.get(i10).b(view);
        }
        this.f2468x.add(view);
    }

    @Override // androidx.transition.i
    public final void d(q qVar) {
        View view = qVar.f2491b;
        if (s(view)) {
            Iterator<i> it = this.P.iterator();
            while (it.hasNext()) {
                i next = it.next();
                if (next.s(view)) {
                    next.d(qVar);
                    qVar.f2492c.add(next);
                }
            }
        }
    }

    @Override // androidx.transition.i
    public final void f(q qVar) {
        int size = this.P.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.P.get(i10).f(qVar);
        }
    }

    @Override // androidx.transition.i
    public final void g(q qVar) {
        View view = qVar.f2491b;
        if (s(view)) {
            Iterator<i> it = this.P.iterator();
            while (it.hasNext()) {
                i next = it.next();
                if (next.s(view)) {
                    next.g(qVar);
                    qVar.f2492c.add(next);
                }
            }
        }
    }

    @Override // androidx.transition.i
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final i clone() {
        o oVar = (o) super.clone();
        oVar.P = new ArrayList<>();
        int size = this.P.size();
        for (int i10 = 0; i10 < size; i10++) {
            i clone = this.P.get(i10).clone();
            oVar.P.add(clone);
            clone.A = oVar;
        }
        return oVar;
    }

    @Override // androidx.transition.i
    public final void l(ViewGroup viewGroup, y1.g gVar, y1.g gVar2, ArrayList<q> arrayList, ArrayList<q> arrayList2) {
        long j10 = this.f2464t;
        int size = this.P.size();
        for (int i10 = 0; i10 < size; i10++) {
            i iVar = this.P.get(i10);
            if (j10 > 0 && (this.Q || i10 == 0)) {
                long j11 = iVar.f2464t;
                if (j11 > 0) {
                    iVar.E(j11 + j10);
                } else {
                    iVar.E(j10);
                }
            }
            iVar.l(viewGroup, gVar, gVar2, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.i
    public final void u(View view) {
        super.u(view);
        int size = this.P.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.P.get(i10).u(view);
        }
    }

    @Override // androidx.transition.i
    public final void v(i.d dVar) {
        super.v(dVar);
    }

    @Override // androidx.transition.i
    public final void w(View view) {
        for (int i10 = 0; i10 < this.P.size(); i10++) {
            this.P.get(i10).w(view);
        }
        this.f2468x.remove(view);
    }

    @Override // androidx.transition.i
    public final void x(ViewGroup viewGroup) {
        super.x(viewGroup);
        int size = this.P.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.P.get(i10).x(viewGroup);
        }
    }

    @Override // androidx.transition.i
    public final void y() {
        if (this.P.isEmpty()) {
            F();
            m();
            return;
        }
        b bVar = new b(this);
        Iterator<i> it = this.P.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
        this.R = this.P.size();
        if (!this.Q) {
            for (int i10 = 1; i10 < this.P.size(); i10++) {
                this.P.get(i10 - 1).a(new a(this.P.get(i10)));
            }
            i iVar = this.P.get(0);
            if (iVar != null) {
                iVar.y();
                return;
            }
            return;
        }
        Iterator<i> it2 = this.P.iterator();
        while (it2.hasNext()) {
            it2.next().y();
        }
    }
}
