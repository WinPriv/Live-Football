package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ViewInfoStore.java */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final q.i<RecyclerView.c0, a> f2259a = new q.i<>();

    /* renamed from: b, reason: collision with root package name */
    public final q.f<RecyclerView.c0> f2260b = new q.f<>();

    /* compiled from: ViewInfoStore.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: d, reason: collision with root package name */
        public static final s.d f2261d = new s.d(20, 1);

        /* renamed from: a, reason: collision with root package name */
        public int f2262a;

        /* renamed from: b, reason: collision with root package name */
        public RecyclerView.l.c f2263b;

        /* renamed from: c, reason: collision with root package name */
        public RecyclerView.l.c f2264c;

        public static a a() {
            a aVar = (a) f2261d.b();
            if (aVar == null) {
                return new a();
            }
            return aVar;
        }
    }

    /* compiled from: ViewInfoStore.java */
    /* loaded from: classes.dex */
    public interface b {
    }

    public final void a(RecyclerView.c0 c0Var, RecyclerView.l.c cVar) {
        q.i<RecyclerView.c0, a> iVar = this.f2259a;
        a orDefault = iVar.getOrDefault(c0Var, null);
        if (orDefault == null) {
            orDefault = a.a();
            iVar.put(c0Var, orDefault);
        }
        orDefault.f2264c = cVar;
        orDefault.f2262a |= 8;
    }

    public final RecyclerView.l.c b(RecyclerView.c0 c0Var, int i10) {
        a l10;
        RecyclerView.l.c cVar;
        q.i<RecyclerView.c0, a> iVar = this.f2259a;
        int e10 = iVar.e(c0Var);
        if (e10 >= 0 && (l10 = iVar.l(e10)) != null) {
            int i11 = l10.f2262a;
            if ((i11 & i10) != 0) {
                int i12 = i11 & (~i10);
                l10.f2262a = i12;
                if (i10 == 4) {
                    cVar = l10.f2263b;
                } else if (i10 == 8) {
                    cVar = l10.f2264c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i12 & 12) == 0) {
                    iVar.j(e10);
                    l10.f2262a = 0;
                    l10.f2263b = null;
                    l10.f2264c = null;
                    a.f2261d.a(l10);
                }
                return cVar;
            }
        }
        return null;
    }

    public final void c(RecyclerView.c0 c0Var) {
        a orDefault = this.f2259a.getOrDefault(c0Var, null);
        if (orDefault == null) {
            return;
        }
        orDefault.f2262a &= -2;
    }

    public final void d(RecyclerView.c0 c0Var) {
        q.f<RecyclerView.c0> fVar = this.f2260b;
        int h10 = fVar.h() - 1;
        while (true) {
            if (h10 < 0) {
                break;
            }
            if (c0Var == fVar.i(h10)) {
                Object[] objArr = fVar.f34525u;
                Object obj = objArr[h10];
                Object obj2 = q.f.f34522w;
                if (obj != obj2) {
                    objArr[h10] = obj2;
                    fVar.f34523s = true;
                }
            } else {
                h10--;
            }
        }
        a remove = this.f2259a.remove(c0Var);
        if (remove != null) {
            remove.f2262a = 0;
            remove.f2263b = null;
            remove.f2264c = null;
            a.f2261d.a(remove);
        }
    }
}
