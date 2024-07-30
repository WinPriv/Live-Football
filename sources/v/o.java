package v;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: WidgetGroup.java */
/* loaded from: classes.dex */
public final class o {
    public static int f;

    /* renamed from: b, reason: collision with root package name */
    public final int f35891b;

    /* renamed from: c, reason: collision with root package name */
    public int f35892c;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<u.d> f35890a = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    public ArrayList<a> f35893d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f35894e = -1;

    /* compiled from: WidgetGroup.java */
    /* loaded from: classes.dex */
    public class a {
        public a(u.d dVar, s.c cVar) {
            new WeakReference(dVar);
            u.c cVar2 = dVar.K;
            cVar.getClass();
            s.c.n(cVar2);
            s.c.n(dVar.L);
            s.c.n(dVar.M);
            s.c.n(dVar.N);
            s.c.n(dVar.O);
        }
    }

    public o(int i10) {
        this.f35891b = -1;
        int i11 = f;
        f = i11 + 1;
        this.f35891b = i11;
        this.f35892c = i10;
    }

    public final void a(ArrayList<o> arrayList) {
        int size = this.f35890a.size();
        if (this.f35894e != -1 && size > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                o oVar = arrayList.get(i10);
                if (this.f35894e == oVar.f35891b) {
                    c(this.f35892c, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(s.c cVar, int i10) {
        int n10;
        int n11;
        ArrayList<u.d> arrayList = this.f35890a;
        if (arrayList.size() == 0) {
            return 0;
        }
        u.e eVar = (u.e) arrayList.get(0).W;
        cVar.t();
        eVar.c(cVar, false);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList.get(i11).c(cVar, false);
        }
        if (i10 == 0 && eVar.B0 > 0) {
            q.e.b(eVar, cVar, arrayList, 0);
        }
        if (i10 == 1 && eVar.C0 > 0) {
            q.e.b(eVar, cVar, arrayList, 1);
        }
        try {
            cVar.p();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        this.f35893d = new ArrayList<>();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            this.f35893d.add(new a(arrayList.get(i12), cVar));
        }
        if (i10 == 0) {
            n10 = s.c.n(eVar.K);
            n11 = s.c.n(eVar.M);
            cVar.t();
        } else {
            n10 = s.c.n(eVar.L);
            n11 = s.c.n(eVar.N);
            cVar.t();
        }
        return n11 - n10;
    }

    public final void c(int i10, o oVar) {
        Iterator<u.d> it = this.f35890a.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            int i11 = oVar.f35891b;
            if (hasNext) {
                u.d next = it.next();
                ArrayList<u.d> arrayList = oVar.f35890a;
                if (!arrayList.contains(next)) {
                    arrayList.add(next);
                }
                if (i10 == 0) {
                    next.f35660q0 = i11;
                } else {
                    next.f35662r0 = i11;
                }
            } else {
                this.f35894e = i11;
                return;
            }
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.f35892c;
        if (i10 == 0) {
            str = "Horizontal";
        } else if (i10 == 1) {
            str = "Vertical";
        } else if (i10 == 2) {
            str = "Both";
        } else {
            str = "Unknown";
        }
        sb2.append(str);
        sb2.append(" [");
        String i11 = com.ironsource.adapters.facebook.a.i(sb2, this.f35891b, "] <");
        Iterator<u.d> it = this.f35890a.iterator();
        while (it.hasNext()) {
            u.d next = it.next();
            StringBuilder l10 = com.ironsource.adapters.facebook.a.l(i11, " ");
            l10.append(next.f35649k0);
            i11 = l10.toString();
        }
        return com.ironsource.adapters.facebook.a.h(i11, " >");
    }
}
