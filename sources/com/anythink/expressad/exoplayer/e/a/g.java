package com.anythink.expressad.exoplayer.e.a;

import com.anythink.expressad.exoplayer.e.a.a;
import com.anythink.expressad.exoplayer.e.a.b;
import com.anythink.expressad.exoplayer.e.k;
import com.anythink.expressad.exoplayer.k.af;
import com.anythink.expressad.exoplayer.k.p;
import com.anythink.expressad.exoplayer.k.s;
import com.anythink.expressad.exoplayer.t;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g implements com.anythink.expressad.exoplayer.e.e, com.anythink.expressad.exoplayer.e.k {

    /* renamed from: e, reason: collision with root package name */
    public static final int f7860e = 1;
    private static final int f = 0;

    /* renamed from: g, reason: collision with root package name */
    private static final int f7861g = 1;

    /* renamed from: h, reason: collision with root package name */
    private static final int f7862h = 2;

    /* renamed from: j, reason: collision with root package name */
    private static final long f7864j = 262144;

    /* renamed from: k, reason: collision with root package name */
    private static final long f7865k = 10485760;
    private long[][] A;
    private int B;
    private long C;
    private boolean D;

    /* renamed from: l, reason: collision with root package name */
    private final int f7866l;

    /* renamed from: m, reason: collision with root package name */
    private final s f7867m;

    /* renamed from: n, reason: collision with root package name */
    private final s f7868n;
    private final s o;

    /* renamed from: p, reason: collision with root package name */
    private final ArrayDeque<a.C0101a> f7869p;

    /* renamed from: q, reason: collision with root package name */
    private int f7870q;

    /* renamed from: r, reason: collision with root package name */
    private int f7871r;

    /* renamed from: s, reason: collision with root package name */
    private long f7872s;

    /* renamed from: t, reason: collision with root package name */
    private int f7873t;

    /* renamed from: u, reason: collision with root package name */
    private s f7874u;

    /* renamed from: v, reason: collision with root package name */
    private int f7875v;

    /* renamed from: w, reason: collision with root package name */
    private int f7876w;

    /* renamed from: x, reason: collision with root package name */
    private int f7877x;
    private com.anythink.expressad.exoplayer.e.g y;

    /* renamed from: z, reason: collision with root package name */
    private b[] f7878z;

    /* renamed from: d, reason: collision with root package name */
    public static final com.anythink.expressad.exoplayer.e.h f7859d = new com.anythink.expressad.exoplayer.e.h() { // from class: com.anythink.expressad.exoplayer.e.a.g.1
        @Override // com.anythink.expressad.exoplayer.e.h
        public final com.anythink.expressad.exoplayer.e.e[] a() {
            return new com.anythink.expressad.exoplayer.e.e[]{new g()};
        }
    };

    /* renamed from: i, reason: collision with root package name */
    private static final int f7863i = af.f("qt  ");

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface a {
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final j f7879a;

        /* renamed from: b, reason: collision with root package name */
        public final m f7880b;

        /* renamed from: c, reason: collision with root package name */
        public final com.anythink.expressad.exoplayer.e.m f7881c;

        /* renamed from: d, reason: collision with root package name */
        public int f7882d;

        public b(j jVar, m mVar, com.anythink.expressad.exoplayer.e.m mVar2) {
            this.f7879a = jVar;
            this.f7880b = mVar;
            this.f7881c = mVar2;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface c {
    }

    public g() {
        this(0);
    }

    private void d() {
        this.f7870q = 0;
        this.f7873t = 0;
    }

    @Override // com.anythink.expressad.exoplayer.e.k
    public final boolean a() {
        return true;
    }

    @Override // com.anythink.expressad.exoplayer.e.k
    public final long b() {
        return this.C;
    }

    @Override // com.anythink.expressad.exoplayer.e.e
    public final void c() {
    }

    public g(int i10) {
        this.f7866l = i10;
        this.o = new s(16);
        this.f7869p = new ArrayDeque<>();
        this.f7867m = new s(p.f9094a);
        this.f7868n = new s(4);
        this.f7875v = -1;
    }

    private boolean b(com.anythink.expressad.exoplayer.e.f fVar) {
        if (this.f7873t == 0) {
            if (!fVar.a(this.o.f9123a, 0, 8, true)) {
                return false;
            }
            this.f7873t = 8;
            this.o.c(0);
            this.f7872s = this.o.h();
            this.f7871r = this.o.i();
        }
        long j10 = this.f7872s;
        if (j10 == 1) {
            fVar.b(this.o.f9123a, 8, 8);
            this.f7873t += 8;
            this.f7872s = this.o.n();
        } else if (j10 == 0) {
            long d10 = fVar.d();
            if (d10 == -1 && !this.f7869p.isEmpty()) {
                d10 = this.f7869p.peek().aV;
            }
            if (d10 != -1) {
                this.f7872s = (d10 - fVar.c()) + this.f7873t;
            }
        }
        long j11 = this.f7872s;
        int i10 = this.f7873t;
        if (j11 >= i10) {
            int i11 = this.f7871r;
            if (i11 == com.anythink.expressad.exoplayer.e.a.a.G || i11 == com.anythink.expressad.exoplayer.e.a.a.I || i11 == com.anythink.expressad.exoplayer.e.a.a.J || i11 == com.anythink.expressad.exoplayer.e.a.a.K || i11 == com.anythink.expressad.exoplayer.e.a.a.L || i11 == com.anythink.expressad.exoplayer.e.a.a.U) {
                long c10 = (fVar.c() + this.f7872s) - this.f7873t;
                this.f7869p.push(new a.C0101a(this.f7871r, c10));
                if (this.f7872s == this.f7873t) {
                    b(c10);
                } else {
                    d();
                }
            } else {
                if (i11 == com.anythink.expressad.exoplayer.e.a.a.W || i11 == com.anythink.expressad.exoplayer.e.a.a.H || i11 == com.anythink.expressad.exoplayer.e.a.a.X || i11 == com.anythink.expressad.exoplayer.e.a.a.Y || i11 == com.anythink.expressad.exoplayer.e.a.a.ar || i11 == com.anythink.expressad.exoplayer.e.a.a.as || i11 == com.anythink.expressad.exoplayer.e.a.a.at || i11 == com.anythink.expressad.exoplayer.e.a.a.V || i11 == com.anythink.expressad.exoplayer.e.a.a.au || i11 == com.anythink.expressad.exoplayer.e.a.a.av || i11 == com.anythink.expressad.exoplayer.e.a.a.aw || i11 == com.anythink.expressad.exoplayer.e.a.a.ax || i11 == com.anythink.expressad.exoplayer.e.a.a.ay || i11 == com.anythink.expressad.exoplayer.e.a.a.T || i11 == com.anythink.expressad.exoplayer.e.a.a.f || i11 == com.anythink.expressad.exoplayer.e.a.a.aF) {
                    com.anythink.expressad.exoplayer.k.a.b(i10 == 8);
                    com.anythink.expressad.exoplayer.k.a.b(this.f7872s <= 2147483647L);
                    s sVar = new s((int) this.f7872s);
                    this.f7874u = sVar;
                    System.arraycopy(this.o.f9123a, 0, sVar.f9123a, 0, 8);
                    this.f7870q = 1;
                } else {
                    this.f7874u = null;
                    this.f7870q = 1;
                }
            }
            return true;
        }
        throw new t("Atom size less than header length (unsupported).");
    }

    private int c(com.anythink.expressad.exoplayer.e.f fVar, com.anythink.expressad.exoplayer.e.j jVar) {
        int i10;
        com.anythink.expressad.exoplayer.e.j jVar2;
        long c10 = fVar.c();
        if (this.f7875v == -1) {
            int i11 = -1;
            int i12 = -1;
            int i13 = 0;
            boolean z10 = true;
            long j10 = Long.MAX_VALUE;
            boolean z11 = true;
            long j11 = Long.MAX_VALUE;
            long j12 = Long.MAX_VALUE;
            while (true) {
                b[] bVarArr = this.f7878z;
                if (i13 >= bVarArr.length) {
                    break;
                }
                b bVar = bVarArr[i13];
                int i14 = bVar.f7882d;
                m mVar = bVar.f7880b;
                if (i14 != mVar.f7924b) {
                    long j13 = mVar.f7925c[i14];
                    long j14 = this.A[i13][i14];
                    long j15 = j13 - c10;
                    boolean z12 = j15 < 0 || j15 >= f7864j;
                    if ((!z12 && z10) || (z12 == z10 && j15 < j12)) {
                        i12 = i13;
                        z10 = z12;
                        j12 = j15;
                        j11 = j14;
                    }
                    if (j14 < j10) {
                        i11 = i13;
                        z11 = z12;
                        j10 = j14;
                    }
                }
                i13++;
            }
            int i15 = (j10 == Long.MAX_VALUE || !z11 || j11 < j10 + f7865k) ? i12 : i11;
            this.f7875v = i15;
            if (i15 == -1) {
                return -1;
            }
        }
        b bVar2 = this.f7878z[this.f7875v];
        com.anythink.expressad.exoplayer.e.m mVar2 = bVar2.f7881c;
        int i16 = bVar2.f7882d;
        m mVar3 = bVar2.f7880b;
        long j16 = mVar3.f7925c[i16];
        int i17 = mVar3.f7926d[i16];
        long j17 = (j16 - c10) + this.f7876w;
        if (j17 < 0) {
            i10 = 1;
            jVar2 = jVar;
        } else {
            if (j17 < f7864j) {
                if (bVar2.f7879a.f7896i == 1) {
                    j17 += 8;
                    i17 -= 8;
                }
                fVar.c((int) j17);
                int i18 = bVar2.f7879a.f7899l;
                if (i18 == 0) {
                    while (true) {
                        int i19 = this.f7876w;
                        if (i19 >= i17) {
                            break;
                        }
                        int a10 = mVar2.a(fVar, i17 - i19, false);
                        this.f7876w += a10;
                        this.f7877x -= a10;
                    }
                } else {
                    byte[] bArr = this.f7868n.f9123a;
                    bArr[0] = 0;
                    bArr[1] = 0;
                    bArr[2] = 0;
                    int i20 = 4 - i18;
                    while (this.f7876w < i17) {
                        int i21 = this.f7877x;
                        if (i21 == 0) {
                            fVar.b(this.f7868n.f9123a, i20, i18);
                            this.f7868n.c(0);
                            this.f7877x = this.f7868n.m();
                            this.f7867m.c(0);
                            mVar2.a(this.f7867m, 4);
                            this.f7876w += 4;
                            i17 += i20;
                        } else {
                            int a11 = mVar2.a(fVar, i21, false);
                            this.f7876w += a11;
                            this.f7877x -= a11;
                        }
                    }
                }
                m mVar4 = bVar2.f7880b;
                mVar2.a(mVar4.f[i16], mVar4.f7928g[i16], i17, 0, null);
                bVar2.f7882d++;
                this.f7875v = -1;
                this.f7876w = 0;
                this.f7877x = 0;
                return 0;
            }
            jVar2 = jVar;
            i10 = 1;
        }
        jVar2.f7950a = j16;
        return i10;
    }

    @Override // com.anythink.expressad.exoplayer.e.e
    public final boolean a(com.anythink.expressad.exoplayer.e.f fVar) {
        return i.b(fVar);
    }

    private void d(long j10) {
        for (b bVar : this.f7878z) {
            m mVar = bVar.f7880b;
            int a10 = mVar.a(j10);
            if (a10 == -1) {
                a10 = mVar.b(j10);
            }
            bVar.f7882d = a10;
        }
    }

    @Override // com.anythink.expressad.exoplayer.e.e
    public final void a(com.anythink.expressad.exoplayer.e.g gVar) {
        this.y = gVar;
    }

    @Override // com.anythink.expressad.exoplayer.e.e
    public final void a(long j10, long j11) {
        this.f7869p.clear();
        this.f7873t = 0;
        this.f7875v = -1;
        this.f7876w = 0;
        this.f7877x = 0;
        if (j10 == 0) {
            d();
            return;
        }
        b[] bVarArr = this.f7878z;
        if (bVarArr != null) {
            for (b bVar : bVarArr) {
                m mVar = bVar.f7880b;
                int a10 = mVar.a(j11);
                if (a10 == -1) {
                    a10 = mVar.b(j11);
                }
                bVar.f7882d = a10;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x01ef A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0337 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0006 A[SYNTHETIC] */
    @Override // com.anythink.expressad.exoplayer.e.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(com.anythink.expressad.exoplayer.e.f r31, com.anythink.expressad.exoplayer.e.j r32) {
        /*
            Method dump skipped, instructions count: 833
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.e.a.g.a(com.anythink.expressad.exoplayer.e.f, com.anythink.expressad.exoplayer.e.j):int");
    }

    private boolean b(com.anythink.expressad.exoplayer.e.f fVar, com.anythink.expressad.exoplayer.e.j jVar) {
        boolean z10;
        boolean z11;
        long j10 = this.f7872s - this.f7873t;
        long c10 = fVar.c() + j10;
        s sVar = this.f7874u;
        if (sVar != null) {
            fVar.b(sVar.f9123a, this.f7873t, (int) j10);
            if (this.f7871r == com.anythink.expressad.exoplayer.e.a.a.f) {
                s sVar2 = this.f7874u;
                sVar2.c(8);
                if (sVar2.i() != f7863i) {
                    sVar2.d(4);
                    while (sVar2.a() > 0) {
                        if (sVar2.i() == f7863i) {
                        }
                    }
                    z11 = false;
                    this.D = z11;
                }
                z11 = true;
                this.D = z11;
            } else if (!this.f7869p.isEmpty()) {
                this.f7869p.peek().a(new a.b(this.f7871r, this.f7874u));
            }
        } else if (j10 < f7864j) {
            fVar.c((int) j10);
        } else {
            jVar.f7950a = fVar.c() + j10;
            z10 = true;
            b(c10);
            return (z10 || this.f7870q == 2) ? false : true;
        }
        z10 = false;
        b(c10);
        if (z10) {
        }
    }

    private int c(long j10) {
        int i10 = -1;
        int i11 = -1;
        int i12 = 0;
        long j11 = Long.MAX_VALUE;
        boolean z10 = true;
        long j12 = Long.MAX_VALUE;
        boolean z11 = true;
        long j13 = Long.MAX_VALUE;
        while (true) {
            b[] bVarArr = this.f7878z;
            if (i12 >= bVarArr.length) {
                break;
            }
            b bVar = bVarArr[i12];
            int i13 = bVar.f7882d;
            m mVar = bVar.f7880b;
            if (i13 != mVar.f7924b) {
                long j14 = mVar.f7925c[i13];
                long j15 = this.A[i12][i13];
                long j16 = j14 - j10;
                boolean z12 = j16 < 0 || j16 >= f7864j;
                if ((!z12 && z11) || (z12 == z11 && j16 < j13)) {
                    z11 = z12;
                    j13 = j16;
                    i11 = i12;
                    j12 = j15;
                }
                if (j15 < j11) {
                    z10 = z12;
                    i10 = i12;
                    j11 = j15;
                }
            }
            i12++;
        }
        return (j11 == Long.MAX_VALUE || !z10 || j12 < j11 + f7865k) ? i11 : i10;
    }

    private void b(long j10) {
        while (!this.f7869p.isEmpty() && this.f7869p.peek().aV == j10) {
            a.C0101a pop = this.f7869p.pop();
            if (pop.aU == com.anythink.expressad.exoplayer.e.a.a.G) {
                a(pop);
                this.f7869p.clear();
                this.f7870q = 2;
            } else if (!this.f7869p.isEmpty()) {
                this.f7869p.peek().a(pop);
            }
        }
        if (this.f7870q != 2) {
            d();
        }
    }

    private static boolean b(int i10) {
        return i10 == com.anythink.expressad.exoplayer.e.a.a.G || i10 == com.anythink.expressad.exoplayer.e.a.a.I || i10 == com.anythink.expressad.exoplayer.e.a.a.J || i10 == com.anythink.expressad.exoplayer.e.a.a.K || i10 == com.anythink.expressad.exoplayer.e.a.a.L || i10 == com.anythink.expressad.exoplayer.e.a.a.U;
    }

    @Override // com.anythink.expressad.exoplayer.e.k
    public final k.a a(long j10) {
        long j11;
        long j12;
        int b10;
        b[] bVarArr = this.f7878z;
        if (bVarArr.length == 0) {
            return new k.a(com.anythink.expressad.exoplayer.e.l.f7955a);
        }
        int i10 = this.B;
        long j13 = -1;
        if (i10 != -1) {
            m mVar = bVarArr[i10].f7880b;
            int a10 = a(mVar, j10);
            if (a10 == -1) {
                return new k.a(com.anythink.expressad.exoplayer.e.l.f7955a);
            }
            long j14 = mVar.f[a10];
            j11 = mVar.f7925c[a10];
            if (j14 >= j10 || a10 >= mVar.f7924b - 1 || (b10 = mVar.b(j10)) == -1 || b10 == a10) {
                j12 = -9223372036854775807L;
            } else {
                j12 = mVar.f[b10];
                j13 = mVar.f7925c[b10];
            }
            j10 = j14;
        } else {
            j11 = Long.MAX_VALUE;
            j12 = -9223372036854775807L;
        }
        int i11 = 0;
        while (true) {
            b[] bVarArr2 = this.f7878z;
            if (i11 >= bVarArr2.length) {
                break;
            }
            if (i11 != this.B) {
                m mVar2 = bVarArr2[i11].f7880b;
                long a11 = a(mVar2, j10, j11);
                if (j12 != com.anythink.expressad.exoplayer.b.f7291b) {
                    j13 = a(mVar2, j12, j13);
                }
                j11 = a11;
            }
            i11++;
        }
        com.anythink.expressad.exoplayer.e.l lVar = new com.anythink.expressad.exoplayer.e.l(j10, j11);
        if (j12 == com.anythink.expressad.exoplayer.b.f7291b) {
            return new k.a(lVar);
        }
        return new k.a(lVar, new com.anythink.expressad.exoplayer.e.l(j12, j13));
    }

    private void a(a.C0101a c0101a) {
        com.anythink.expressad.exoplayer.g.a aVar;
        ArrayList<m> a10;
        ArrayList arrayList = new ArrayList();
        com.anythink.expressad.exoplayer.e.i iVar = new com.anythink.expressad.exoplayer.e.i();
        a.b d10 = c0101a.d(com.anythink.expressad.exoplayer.e.a.a.aF);
        if (d10 != null) {
            aVar = com.anythink.expressad.exoplayer.e.a.b.a(d10, this.D);
            if (aVar != null) {
                iVar.a(aVar);
            }
        } else {
            aVar = null;
        }
        int i10 = 1;
        int i11 = 0;
        try {
            a10 = a(c0101a, iVar, (this.f7866l & 1) != 0);
        } catch (b.g unused) {
            iVar = new com.anythink.expressad.exoplayer.e.i();
            a10 = a(c0101a, iVar, true);
        }
        int size = a10.size();
        int i12 = -1;
        long j10 = com.anythink.expressad.exoplayer.b.f7291b;
        while (i11 < size) {
            m mVar = a10.get(i11);
            j jVar = mVar.f7923a;
            b bVar = new b(jVar, mVar, this.y.a(i11, jVar.f7892d));
            com.anythink.expressad.exoplayer.m a11 = jVar.f7895h.a(mVar.f7927e + 30);
            if (jVar.f7892d == i10) {
                if (iVar.a()) {
                    a11 = a11.a(iVar.f7948b, iVar.f7949c);
                }
                if (aVar != null) {
                    a11 = a11.a(aVar);
                }
            }
            bVar.f7881c.a(a11);
            long j11 = jVar.f7894g;
            if (j11 == com.anythink.expressad.exoplayer.b.f7291b) {
                j11 = mVar.f7929h;
            }
            j10 = Math.max(j10, j11);
            if (jVar.f7892d == 2 && i12 == -1) {
                i12 = arrayList.size();
            }
            arrayList.add(bVar);
            i11++;
            i10 = 1;
        }
        this.B = i12;
        this.C = j10;
        b[] bVarArr = (b[]) arrayList.toArray(new b[arrayList.size()]);
        this.f7878z = bVarArr;
        this.A = a(bVarArr);
        this.y.c_();
        this.y.a(this);
    }

    private ArrayList<m> a(a.C0101a c0101a, com.anythink.expressad.exoplayer.e.i iVar, boolean z10) {
        j a10;
        ArrayList<m> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < c0101a.aX.size(); i10++) {
            a.C0101a c0101a2 = c0101a.aX.get(i10);
            if (c0101a2.aU == com.anythink.expressad.exoplayer.e.a.a.I && (a10 = com.anythink.expressad.exoplayer.e.a.b.a(c0101a2, c0101a.d(com.anythink.expressad.exoplayer.e.a.a.H), com.anythink.expressad.exoplayer.b.f7291b, (com.anythink.expressad.exoplayer.d.e) null, z10, this.D)) != null) {
                m a11 = com.anythink.expressad.exoplayer.e.a.b.a(a10, c0101a2.e(com.anythink.expressad.exoplayer.e.a.a.J).e(com.anythink.expressad.exoplayer.e.a.a.K).e(com.anythink.expressad.exoplayer.e.a.a.L), iVar);
                if (a11.f7924b != 0) {
                    arrayList.add(a11);
                }
            }
        }
        return arrayList;
    }

    private static long[][] a(b[] bVarArr) {
        long[][] jArr = new long[bVarArr.length];
        int[] iArr = new int[bVarArr.length];
        long[] jArr2 = new long[bVarArr.length];
        boolean[] zArr = new boolean[bVarArr.length];
        for (int i10 = 0; i10 < bVarArr.length; i10++) {
            jArr[i10] = new long[bVarArr[i10].f7880b.f7924b];
            jArr2[i10] = bVarArr[i10].f7880b.f[0];
        }
        long j10 = 0;
        int i11 = 0;
        while (i11 < bVarArr.length) {
            long j11 = Long.MAX_VALUE;
            int i12 = -1;
            for (int i13 = 0; i13 < bVarArr.length; i13++) {
                if (!zArr[i13]) {
                    long j12 = jArr2[i13];
                    if (j12 <= j11) {
                        i12 = i13;
                        j11 = j12;
                    }
                }
            }
            int i14 = iArr[i12];
            long[] jArr3 = jArr[i12];
            jArr3[i14] = j10;
            m mVar = bVarArr[i12].f7880b;
            j10 += mVar.f7926d[i14];
            int i15 = i14 + 1;
            iArr[i12] = i15;
            if (i15 < jArr3.length) {
                jArr2[i12] = mVar.f[i15];
            } else {
                zArr[i12] = true;
                i11++;
            }
        }
        return jArr;
    }

    private static long a(m mVar, long j10, long j11) {
        int a10 = a(mVar, j10);
        return a10 == -1 ? j11 : Math.min(mVar.f7925c[a10], j11);
    }

    private static int a(m mVar, long j10) {
        int a10 = mVar.a(j10);
        return a10 == -1 ? mVar.b(j10) : a10;
    }

    private static boolean a(s sVar) {
        sVar.c(8);
        if (sVar.i() == f7863i) {
            return true;
        }
        sVar.d(4);
        while (sVar.a() > 0) {
            if (sVar.i() == f7863i) {
                return true;
            }
        }
        return false;
    }

    private static boolean a(int i10) {
        return i10 == com.anythink.expressad.exoplayer.e.a.a.W || i10 == com.anythink.expressad.exoplayer.e.a.a.H || i10 == com.anythink.expressad.exoplayer.e.a.a.X || i10 == com.anythink.expressad.exoplayer.e.a.a.Y || i10 == com.anythink.expressad.exoplayer.e.a.a.ar || i10 == com.anythink.expressad.exoplayer.e.a.a.as || i10 == com.anythink.expressad.exoplayer.e.a.a.at || i10 == com.anythink.expressad.exoplayer.e.a.a.V || i10 == com.anythink.expressad.exoplayer.e.a.a.au || i10 == com.anythink.expressad.exoplayer.e.a.a.av || i10 == com.anythink.expressad.exoplayer.e.a.a.aw || i10 == com.anythink.expressad.exoplayer.e.a.a.ax || i10 == com.anythink.expressad.exoplayer.e.a.a.ay || i10 == com.anythink.expressad.exoplayer.e.a.a.T || i10 == com.anythink.expressad.exoplayer.e.a.a.f || i10 == com.anythink.expressad.exoplayer.e.a.a.aF;
    }
}
