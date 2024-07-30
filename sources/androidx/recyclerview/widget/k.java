package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.ads.gl;
import java.util.ArrayList;

/* compiled from: DefaultItemAnimator.java */
/* loaded from: classes.dex */
public final class k extends x {

    /* renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f2297s;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList<RecyclerView.c0> f2298h = new ArrayList<>();

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList<RecyclerView.c0> f2299i = new ArrayList<>();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList<b> f2300j = new ArrayList<>();

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList<a> f2301k = new ArrayList<>();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList<ArrayList<RecyclerView.c0>> f2302l = new ArrayList<>();

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList<ArrayList<b>> f2303m = new ArrayList<>();

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList<ArrayList<a>> f2304n = new ArrayList<>();
    public final ArrayList<RecyclerView.c0> o = new ArrayList<>();

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList<RecyclerView.c0> f2305p = new ArrayList<>();

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList<RecyclerView.c0> f2306q = new ArrayList<>();

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList<RecyclerView.c0> f2307r = new ArrayList<>();

    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView.c0 f2308a;

        /* renamed from: b, reason: collision with root package name */
        public RecyclerView.c0 f2309b;

        /* renamed from: c, reason: collision with root package name */
        public final int f2310c;

        /* renamed from: d, reason: collision with root package name */
        public final int f2311d;

        /* renamed from: e, reason: collision with root package name */
        public final int f2312e;
        public final int f;

        public a(RecyclerView.c0 c0Var, RecyclerView.c0 c0Var2, int i10, int i11, int i12, int i13) {
            this.f2308a = c0Var;
            this.f2309b = c0Var2;
            this.f2310c = i10;
            this.f2311d = i11;
            this.f2312e = i12;
            this.f = i13;
        }

        public final String toString() {
            return "ChangeInfo{oldHolder=" + this.f2308a + ", newHolder=" + this.f2309b + ", fromX=" + this.f2310c + ", fromY=" + this.f2311d + ", toX=" + this.f2312e + ", toY=" + this.f + '}';
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final RecyclerView.c0 f2313a;

        /* renamed from: b, reason: collision with root package name */
        public final int f2314b;

        /* renamed from: c, reason: collision with root package name */
        public final int f2315c;

        /* renamed from: d, reason: collision with root package name */
        public final int f2316d;

        /* renamed from: e, reason: collision with root package name */
        public final int f2317e;

        public b(RecyclerView.c0 c0Var, int i10, int i11, int i12, int i13) {
            this.f2313a = c0Var;
            this.f2314b = i10;
            this.f2315c = i11;
            this.f2316d = i12;
            this.f2317e = i13;
        }
    }

    public static void h(ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((RecyclerView.c0) arrayList.get(size)).itemView.animate().cancel();
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void d(RecyclerView.c0 c0Var) {
        View view = c0Var.itemView;
        view.animate().cancel();
        ArrayList<b> arrayList = this.f2300j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (arrayList.get(size).f2313a == c0Var) {
                view.setTranslationY(gl.Code);
                view.setTranslationX(gl.Code);
                c(c0Var);
                arrayList.remove(size);
            }
        }
        j(c0Var, this.f2301k);
        if (this.f2298h.remove(c0Var)) {
            view.setAlpha(1.0f);
            c(c0Var);
        }
        if (this.f2299i.remove(c0Var)) {
            view.setAlpha(1.0f);
            c(c0Var);
        }
        ArrayList<ArrayList<a>> arrayList2 = this.f2304n;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList<a> arrayList3 = arrayList2.get(size2);
            j(c0Var, arrayList3);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList<ArrayList<b>> arrayList4 = this.f2303m;
        int size3 = arrayList4.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList<b> arrayList5 = arrayList4.get(size3);
            int size4 = arrayList5.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                }
                if (arrayList5.get(size4).f2313a == c0Var) {
                    view.setTranslationY(gl.Code);
                    view.setTranslationX(gl.Code);
                    c(c0Var);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                }
            }
        }
        ArrayList<ArrayList<RecyclerView.c0>> arrayList6 = this.f2302l;
        int size5 = arrayList6.size();
        while (true) {
            size5--;
            if (size5 >= 0) {
                ArrayList<RecyclerView.c0> arrayList7 = arrayList6.get(size5);
                if (arrayList7.remove(c0Var)) {
                    view.setAlpha(1.0f);
                    c(c0Var);
                    if (arrayList7.isEmpty()) {
                        arrayList6.remove(size5);
                    }
                }
            } else {
                this.f2306q.remove(c0Var);
                this.o.remove(c0Var);
                this.f2307r.remove(c0Var);
                this.f2305p.remove(c0Var);
                i();
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void e() {
        ArrayList<b> arrayList = this.f2300j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            b bVar = arrayList.get(size);
            View view = bVar.f2313a.itemView;
            view.setTranslationY(gl.Code);
            view.setTranslationX(gl.Code);
            c(bVar.f2313a);
            arrayList.remove(size);
        }
        ArrayList<RecyclerView.c0> arrayList2 = this.f2298h;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            c(arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList<RecyclerView.c0> arrayList3 = this.f2299i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.c0 c0Var = arrayList3.get(size3);
            c0Var.itemView.setAlpha(1.0f);
            c(c0Var);
            arrayList3.remove(size3);
        }
        ArrayList<a> arrayList4 = this.f2301k;
        int size4 = arrayList4.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            a aVar = arrayList4.get(size4);
            RecyclerView.c0 c0Var2 = aVar.f2308a;
            if (c0Var2 != null) {
                k(aVar, c0Var2);
            }
            RecyclerView.c0 c0Var3 = aVar.f2309b;
            if (c0Var3 != null) {
                k(aVar, c0Var3);
            }
        }
        arrayList4.clear();
        if (!f()) {
            return;
        }
        ArrayList<ArrayList<b>> arrayList5 = this.f2303m;
        int size5 = arrayList5.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            ArrayList<b> arrayList6 = arrayList5.get(size5);
            int size6 = arrayList6.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    b bVar2 = arrayList6.get(size6);
                    View view2 = bVar2.f2313a.itemView;
                    view2.setTranslationY(gl.Code);
                    view2.setTranslationX(gl.Code);
                    c(bVar2.f2313a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
        }
        ArrayList<ArrayList<RecyclerView.c0>> arrayList7 = this.f2302l;
        int size7 = arrayList7.size();
        while (true) {
            size7--;
            if (size7 < 0) {
                break;
            }
            ArrayList<RecyclerView.c0> arrayList8 = arrayList7.get(size7);
            int size8 = arrayList8.size();
            while (true) {
                size8--;
                if (size8 >= 0) {
                    RecyclerView.c0 c0Var4 = arrayList8.get(size8);
                    c0Var4.itemView.setAlpha(1.0f);
                    c(c0Var4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
        }
        ArrayList<ArrayList<a>> arrayList9 = this.f2304n;
        int size9 = arrayList9.size();
        while (true) {
            size9--;
            if (size9 < 0) {
                break;
            }
            ArrayList<a> arrayList10 = arrayList9.get(size9);
            int size10 = arrayList10.size();
            while (true) {
                size10--;
                if (size10 >= 0) {
                    a aVar2 = arrayList10.get(size10);
                    RecyclerView.c0 c0Var5 = aVar2.f2308a;
                    if (c0Var5 != null) {
                        k(aVar2, c0Var5);
                    }
                    RecyclerView.c0 c0Var6 = aVar2.f2309b;
                    if (c0Var6 != null) {
                        k(aVar2, c0Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
        }
        h(this.f2306q);
        h(this.f2305p);
        h(this.o);
        h(this.f2307r);
        ArrayList<RecyclerView.l.a> arrayList11 = this.f2144b;
        int size11 = arrayList11.size();
        for (int i10 = 0; i10 < size11; i10++) {
            arrayList11.get(i10).a();
        }
        arrayList11.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean f() {
        if (this.f2299i.isEmpty() && this.f2301k.isEmpty() && this.f2300j.isEmpty() && this.f2298h.isEmpty() && this.f2305p.isEmpty() && this.f2306q.isEmpty() && this.o.isEmpty() && this.f2307r.isEmpty() && this.f2303m.isEmpty() && this.f2302l.isEmpty() && this.f2304n.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.x
    public final boolean g(RecyclerView.c0 c0Var, int i10, int i11, int i12, int i13) {
        View view = c0Var.itemView;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) c0Var.itemView.getTranslationY());
        l(c0Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            c(c0Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.f2300j.add(new b(c0Var, translationX, translationY, i12, i13));
        return true;
    }

    public final void i() {
        if (!f()) {
            ArrayList<RecyclerView.l.a> arrayList = this.f2144b;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.get(i10).a();
            }
            arrayList.clear();
        }
    }

    public final void j(RecyclerView.c0 c0Var, ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                a aVar = (a) arrayList.get(size);
                if (k(aVar, c0Var) && aVar.f2308a == null && aVar.f2309b == null) {
                    arrayList.remove(aVar);
                }
            } else {
                return;
            }
        }
    }

    public final boolean k(a aVar, RecyclerView.c0 c0Var) {
        if (aVar.f2309b == c0Var) {
            aVar.f2309b = null;
        } else if (aVar.f2308a == c0Var) {
            aVar.f2308a = null;
        } else {
            return false;
        }
        c0Var.itemView.setAlpha(1.0f);
        c0Var.itemView.setTranslationX(gl.Code);
        c0Var.itemView.setTranslationY(gl.Code);
        c(c0Var);
        return true;
    }

    public final void l(RecyclerView.c0 c0Var) {
        if (f2297s == null) {
            f2297s = new ValueAnimator().getInterpolator();
        }
        c0Var.itemView.animate().setInterpolator(f2297s);
        d(c0Var);
    }
}
