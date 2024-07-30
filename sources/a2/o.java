package a2;

/* compiled from: WorkSpec.java */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public String f56a;

    /* renamed from: b, reason: collision with root package name */
    public r1.l f57b;

    /* renamed from: c, reason: collision with root package name */
    public String f58c;

    /* renamed from: d, reason: collision with root package name */
    public String f59d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.work.b f60e;
    public androidx.work.b f;

    /* renamed from: g, reason: collision with root package name */
    public long f61g;

    /* renamed from: h, reason: collision with root package name */
    public long f62h;

    /* renamed from: i, reason: collision with root package name */
    public long f63i;

    /* renamed from: j, reason: collision with root package name */
    public r1.b f64j;

    /* renamed from: k, reason: collision with root package name */
    public int f65k;

    /* renamed from: l, reason: collision with root package name */
    public int f66l;

    /* renamed from: m, reason: collision with root package name */
    public long f67m;

    /* renamed from: n, reason: collision with root package name */
    public long f68n;
    public long o;

    /* renamed from: p, reason: collision with root package name */
    public long f69p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f70q;

    /* renamed from: r, reason: collision with root package name */
    public int f71r;

    /* compiled from: WorkSpec.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f72a;

        /* renamed from: b, reason: collision with root package name */
        public r1.l f73b;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f73b != aVar.f73b) {
                return false;
            }
            return this.f72a.equals(aVar.f72a);
        }

        public final int hashCode() {
            return this.f73b.hashCode() + (this.f72a.hashCode() * 31);
        }
    }

    static {
        r1.h.e("WorkSpec");
    }

    public o(String str, String str2) {
        this.f57b = r1.l.ENQUEUED;
        androidx.work.b bVar = androidx.work.b.f2614c;
        this.f60e = bVar;
        this.f = bVar;
        this.f64j = r1.b.f34800i;
        this.f66l = 1;
        this.f67m = 30000L;
        this.f69p = -1L;
        this.f71r = 1;
        this.f56a = str;
        this.f58c = str2;
    }

    public final long a() {
        boolean z10;
        long j10;
        long j11;
        long scalb;
        boolean z11 = true;
        boolean z12 = false;
        if (this.f57b == r1.l.ENQUEUED && this.f65k > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (this.f66l == 2) {
                z12 = true;
            }
            if (z12) {
                scalb = this.f67m * this.f65k;
            } else {
                scalb = Math.scalb((float) this.f67m, this.f65k - 1);
            }
            j11 = this.f68n;
            j10 = Math.min(18000000L, scalb);
        } else {
            long j12 = 0;
            if (c()) {
                long currentTimeMillis = System.currentTimeMillis();
                long j13 = this.f68n;
                if (j13 == 0) {
                    j13 = this.f61g + currentTimeMillis;
                }
                long j14 = this.f63i;
                long j15 = this.f62h;
                if (j14 == j15) {
                    z11 = false;
                }
                if (z11) {
                    if (j13 == 0) {
                        j12 = j14 * (-1);
                    }
                    return j13 + j15 + j12;
                }
                if (j13 != 0) {
                    j12 = j15;
                }
                return j13 + j12;
            }
            j10 = this.f68n;
            if (j10 == 0) {
                j10 = System.currentTimeMillis();
            }
            j11 = this.f61g;
        }
        return j10 + j11;
    }

    public final boolean b() {
        return !r1.b.f34800i.equals(this.f64j);
    }

    public final boolean c() {
        if (this.f62h != 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f61g != oVar.f61g || this.f62h != oVar.f62h || this.f63i != oVar.f63i || this.f65k != oVar.f65k || this.f67m != oVar.f67m || this.f68n != oVar.f68n || this.o != oVar.o || this.f69p != oVar.f69p || this.f70q != oVar.f70q || !this.f56a.equals(oVar.f56a) || this.f57b != oVar.f57b || !this.f58c.equals(oVar.f58c)) {
            return false;
        }
        String str = this.f59d;
        if (str == null ? oVar.f59d != null : !str.equals(oVar.f59d)) {
            return false;
        }
        if (this.f60e.equals(oVar.f60e) && this.f.equals(oVar.f) && this.f64j.equals(oVar.f64j) && this.f66l == oVar.f66l && this.f71r == oVar.f71r) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int b10 = e0.i.b(this.f58c, (this.f57b.hashCode() + (this.f56a.hashCode() * 31)) * 31, 31);
        String str = this.f59d;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode = (this.f.hashCode() + ((this.f60e.hashCode() + ((b10 + i10) * 31)) * 31)) * 31;
        long j10 = this.f61g;
        int i11 = (hashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f62h;
        int i12 = (i11 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f63i;
        int c10 = (s.f.c(this.f66l) + ((((this.f64j.hashCode() + ((i12 + ((int) (j12 ^ (j12 >>> 32)))) * 31)) * 31) + this.f65k) * 31)) * 31;
        long j13 = this.f67m;
        int i13 = (c10 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f68n;
        int i14 = (i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31;
        long j15 = this.o;
        int i15 = (i14 + ((int) (j15 ^ (j15 >>> 32)))) * 31;
        long j16 = this.f69p;
        return s.f.c(this.f71r) + ((((i15 + ((int) (j16 ^ (j16 >>> 32)))) * 31) + (this.f70q ? 1 : 0)) * 31);
    }

    public final String toString() {
        return a3.l.p(new StringBuilder("{WorkSpec: "), this.f56a, "}");
    }

    public o(o oVar) {
        this.f57b = r1.l.ENQUEUED;
        androidx.work.b bVar = androidx.work.b.f2614c;
        this.f60e = bVar;
        this.f = bVar;
        this.f64j = r1.b.f34800i;
        this.f66l = 1;
        this.f67m = 30000L;
        this.f69p = -1L;
        this.f71r = 1;
        this.f56a = oVar.f56a;
        this.f58c = oVar.f58c;
        this.f57b = oVar.f57b;
        this.f59d = oVar.f59d;
        this.f60e = new androidx.work.b(oVar.f60e);
        this.f = new androidx.work.b(oVar.f);
        this.f61g = oVar.f61g;
        this.f62h = oVar.f62h;
        this.f63i = oVar.f63i;
        this.f64j = new r1.b(oVar.f64j);
        this.f65k = oVar.f65k;
        this.f66l = oVar.f66l;
        this.f67m = oVar.f67m;
        this.f68n = oVar.f68n;
        this.o = oVar.o;
        this.f69p = oVar.f69p;
        this.f70q = oVar.f70q;
        this.f71r = oVar.f71r;
    }
}
