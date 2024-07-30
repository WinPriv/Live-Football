package com.applovin.exoplayer2.e.g;

import android.util.Pair;
import com.applovin.exoplayer2.common.base.Function;
import com.applovin.exoplayer2.e.g.a;
import com.applovin.exoplayer2.e.r;
import com.applovin.exoplayer2.e.u;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.e.w;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.g.a;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.v;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class g implements com.applovin.exoplayer2.e.h, v {

    /* renamed from: a */
    public static final com.applovin.exoplayer2.e.l f14400a = new com.applovin.exoplayer2.e.f.h(1);

    /* renamed from: b */
    private final int f14401b;

    /* renamed from: c */
    private final y f14402c;

    /* renamed from: d */
    private final y f14403d;

    /* renamed from: e */
    private final y f14404e;
    private final y f;

    /* renamed from: g */
    private final ArrayDeque<a.C0166a> f14405g;

    /* renamed from: h */
    private final i f14406h;

    /* renamed from: i */
    private final List<a.InterfaceC0172a> f14407i;

    /* renamed from: j */
    private int f14408j;

    /* renamed from: k */
    private int f14409k;

    /* renamed from: l */
    private long f14410l;

    /* renamed from: m */
    private int f14411m;

    /* renamed from: n */
    private y f14412n;
    private int o;

    /* renamed from: p */
    private int f14413p;

    /* renamed from: q */
    private int f14414q;

    /* renamed from: r */
    private int f14415r;

    /* renamed from: s */
    private com.applovin.exoplayer2.e.j f14416s;

    /* renamed from: t */
    private a[] f14417t;

    /* renamed from: u */
    private long[][] f14418u;

    /* renamed from: v */
    private int f14419v;

    /* renamed from: w */
    private long f14420w;

    /* renamed from: x */
    private int f14421x;
    private com.applovin.exoplayer2.g.f.b y;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final k f14422a;

        /* renamed from: b */
        public final n f14423b;

        /* renamed from: c */
        public final x f14424c;

        /* renamed from: d */
        public int f14425d;

        public a(k kVar, n nVar, x xVar) {
            this.f14422a = kVar;
            this.f14423b = nVar;
            this.f14424c = xVar;
        }
    }

    public g() {
        this(0);
    }

    private static int a(int i10) {
        if (i10 != 1751476579) {
            return i10 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private void d() {
        this.f14408j = 0;
        this.f14411m = 0;
    }

    private void e() {
        if (this.f14421x != 2 || (this.f14401b & 2) == 0) {
            return;
        }
        com.applovin.exoplayer2.e.j jVar = (com.applovin.exoplayer2.e.j) com.applovin.exoplayer2.l.a.b(this.f14416s);
        jVar.a(0, 4).a(new v.a().a(this.y == null ? null : new com.applovin.exoplayer2.g.a(this.y)).a());
        jVar.a();
        jVar.a(new v.b(com.anythink.expressad.exoplayer.b.f7291b));
    }

    public static /* synthetic */ com.applovin.exoplayer2.e.h[] f() {
        return new com.applovin.exoplayer2.e.h[]{new g()};
    }

    @Override // com.applovin.exoplayer2.e.h
    public void c() {
    }

    public g(int i10) {
        this.f14401b = i10;
        this.f14408j = (i10 & 4) != 0 ? 3 : 0;
        this.f14406h = new i();
        this.f14407i = new ArrayList();
        this.f = new y(16);
        this.f14405g = new ArrayDeque<>();
        this.f14402c = new y(com.applovin.exoplayer2.l.v.f16336a);
        this.f14403d = new y(4);
        this.f14404e = new y();
        this.o = -1;
    }

    public static /* synthetic */ k a(k kVar) {
        return kVar;
    }

    private static boolean b(int i10) {
        return i10 == 1835296868 || i10 == 1836476516 || i10 == 1751411826 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1937011571 || i10 == 1668576371 || i10 == 1701606260 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1953196132 || i10 == 1718909296 || i10 == 1969517665 || i10 == 1801812339 || i10 == 1768715124;
    }

    private static boolean c(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1701082227 || i10 == 1835365473;
    }

    private int c(com.applovin.exoplayer2.e.i iVar, u uVar) throws IOException {
        int a10 = this.f14406h.a(iVar, uVar, this.f14407i);
        if (a10 == 1 && uVar.f14937a == 0) {
            d();
        }
        return a10;
    }

    private int d(com.applovin.exoplayer2.e.i iVar, u uVar) throws IOException {
        long c10 = iVar.c();
        if (this.o == -1) {
            int c11 = c(c10);
            this.o = c11;
            if (c11 == -1) {
                return -1;
            }
        }
        a aVar = ((a[]) ai.a(this.f14417t))[this.o];
        x xVar = aVar.f14424c;
        int i10 = aVar.f14425d;
        n nVar = aVar.f14423b;
        long j10 = nVar.f14472c[i10];
        int i11 = nVar.f14473d[i10];
        long j11 = (j10 - c10) + this.f14413p;
        if (j11 >= 0 && j11 < 262144) {
            if (aVar.f14422a.f14443g == 1) {
                j11 += 8;
                i11 -= 8;
            }
            iVar.b((int) j11);
            k kVar = aVar.f14422a;
            if (kVar.f14446j != 0) {
                byte[] d10 = this.f14403d.d();
                d10[0] = 0;
                d10[1] = 0;
                d10[2] = 0;
                int i12 = aVar.f14422a.f14446j;
                int i13 = 4 - i12;
                while (this.f14414q < i11) {
                    int i14 = this.f14415r;
                    if (i14 == 0) {
                        iVar.b(d10, i13, i12);
                        this.f14413p += i12;
                        this.f14403d.d(0);
                        int q10 = this.f14403d.q();
                        if (q10 >= 0) {
                            this.f14415r = q10;
                            this.f14402c.d(0);
                            xVar.a(this.f14402c, 4);
                            this.f14414q += 4;
                            i11 += i13;
                        } else {
                            throw com.applovin.exoplayer2.ai.b("Invalid NAL length", null);
                        }
                    } else {
                        int a10 = xVar.a((com.applovin.exoplayer2.k.g) iVar, i14, false);
                        this.f14413p += a10;
                        this.f14414q += a10;
                        this.f14415r -= a10;
                    }
                }
            } else {
                if ("audio/ac4".equals(kVar.f.f16838l)) {
                    if (this.f14414q == 0) {
                        com.applovin.exoplayer2.b.c.a(i11, this.f14404e);
                        xVar.a(this.f14404e, 7);
                        this.f14414q += 7;
                    }
                    i11 += 7;
                }
                while (true) {
                    int i15 = this.f14414q;
                    if (i15 >= i11) {
                        break;
                    }
                    int a11 = xVar.a((com.applovin.exoplayer2.k.g) iVar, i11 - i15, false);
                    this.f14413p += a11;
                    this.f14414q += a11;
                    this.f14415r -= a11;
                }
            }
            n nVar2 = aVar.f14423b;
            xVar.a(nVar2.f[i10], nVar2.f14475g[i10], i11, 0, null);
            aVar.f14425d++;
            this.o = -1;
            this.f14413p = 0;
            this.f14414q = 0;
            this.f14415r = 0;
            return 0;
        }
        uVar.f14937a = j10;
        return 1;
    }

    @Override // com.applovin.exoplayer2.e.v
    public boolean a() {
        return true;
    }

    @Override // com.applovin.exoplayer2.e.v
    public long b() {
        return this.f14420w;
    }

    private boolean b(com.applovin.exoplayer2.e.i iVar) throws IOException {
        a.C0166a peek;
        if (this.f14411m == 0) {
            if (!iVar.a(this.f.d(), 0, 8, true)) {
                e();
                return false;
            }
            this.f14411m = 8;
            this.f.d(0);
            this.f14410l = this.f.o();
            this.f14409k = this.f.q();
        }
        long j10 = this.f14410l;
        if (j10 == 1) {
            iVar.b(this.f.d(), 8, 8);
            this.f14411m += 8;
            this.f14410l = this.f.y();
        } else if (j10 == 0) {
            long d10 = iVar.d();
            if (d10 == -1 && (peek = this.f14405g.peek()) != null) {
                d10 = peek.f14326b;
            }
            if (d10 != -1) {
                this.f14410l = (d10 - iVar.c()) + this.f14411m;
            }
        }
        if (this.f14410l >= this.f14411m) {
            if (c(this.f14409k)) {
                long c10 = iVar.c();
                long j11 = this.f14410l;
                int i10 = this.f14411m;
                long j12 = (c10 + j11) - i10;
                if (j11 != i10 && this.f14409k == 1835365473) {
                    c(iVar);
                }
                this.f14405g.push(new a.C0166a(this.f14409k, j12));
                if (this.f14410l == this.f14411m) {
                    b(j12);
                } else {
                    d();
                }
            } else if (b(this.f14409k)) {
                com.applovin.exoplayer2.l.a.b(this.f14411m == 8);
                com.applovin.exoplayer2.l.a.b(this.f14410l <= 2147483647L);
                y yVar = new y((int) this.f14410l);
                System.arraycopy(this.f.d(), 0, yVar.d(), 0, 8);
                this.f14412n = yVar;
                this.f14408j = 1;
            } else {
                e(iVar.c() - this.f14411m);
                this.f14412n = null;
                this.f14408j = 1;
            }
            return true;
        }
        throw com.applovin.exoplayer2.ai.a("Atom size less than header length (unsupported).");
    }

    @Override // com.applovin.exoplayer2.e.h
    public boolean a(com.applovin.exoplayer2.e.i iVar) throws IOException {
        return j.a(iVar, (this.f14401b & 2) != 0);
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(com.applovin.exoplayer2.e.j jVar) {
        this.f14416s = jVar;
    }

    private int c(long j10) {
        int i10 = -1;
        int i11 = -1;
        long j11 = Long.MAX_VALUE;
        boolean z10 = true;
        long j12 = Long.MAX_VALUE;
        boolean z11 = true;
        long j13 = Long.MAX_VALUE;
        for (int i12 = 0; i12 < ((a[]) ai.a(this.f14417t)).length; i12++) {
            a aVar = this.f14417t[i12];
            int i13 = aVar.f14425d;
            n nVar = aVar.f14423b;
            if (i13 != nVar.f14471b) {
                long j14 = nVar.f14472c[i13];
                long j15 = ((long[][]) ai.a(this.f14418u))[i12][i13];
                long j16 = j14 - j10;
                boolean z12 = j16 < 0 || j16 >= 262144;
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
        }
        return (j11 == Long.MAX_VALUE || !z10 || j12 < j11 + 10485760) ? i11 : i10;
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(long j10, long j11) {
        this.f14405g.clear();
        this.f14411m = 0;
        this.o = -1;
        this.f14413p = 0;
        this.f14414q = 0;
        this.f14415r = 0;
        if (j10 == 0) {
            if (this.f14408j != 3) {
                d();
                return;
            } else {
                this.f14406h.a();
                this.f14407i.clear();
                return;
            }
        }
        if (this.f14417t != null) {
            d(j11);
        }
    }

    private void e(long j10) {
        if (this.f14409k == 1836086884) {
            int i10 = this.f14411m;
            this.y = new com.applovin.exoplayer2.g.f.b(0L, j10, com.anythink.expressad.exoplayer.b.f7291b, j10 + i10, this.f14410l - i10);
        }
    }

    private void c(com.applovin.exoplayer2.e.i iVar) throws IOException {
        this.f14404e.a(8);
        iVar.d(this.f14404e.d(), 0, 8);
        b.a(this.f14404e);
        iVar.b(this.f14404e.c());
        iVar.a();
    }

    @Override // com.applovin.exoplayer2.e.h
    public int a(com.applovin.exoplayer2.e.i iVar, u uVar) throws IOException {
        while (true) {
            int i10 = this.f14408j;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        return d(iVar, uVar);
                    }
                    if (i10 == 3) {
                        return c(iVar, uVar);
                    }
                    throw new IllegalStateException();
                }
                if (b(iVar, uVar)) {
                    return 1;
                }
            } else if (!b(iVar)) {
                return -1;
            }
        }
    }

    @Override // com.applovin.exoplayer2.e.v
    public v.a a(long j10) {
        long j11;
        long j12;
        long j13;
        long j14;
        int b10;
        if (((a[]) com.applovin.exoplayer2.l.a.b(this.f14417t)).length == 0) {
            return new v.a(w.f14942a);
        }
        int i10 = this.f14419v;
        if (i10 != -1) {
            n nVar = this.f14417t[i10].f14423b;
            int a10 = a(nVar, j10);
            if (a10 == -1) {
                return new v.a(w.f14942a);
            }
            long j15 = nVar.f[a10];
            j11 = nVar.f14472c[a10];
            if (j15 >= j10 || a10 >= nVar.f14471b - 1 || (b10 = nVar.b(j10)) == -1 || b10 == a10) {
                j14 = -1;
                j13 = -9223372036854775807L;
            } else {
                j13 = nVar.f[b10];
                j14 = nVar.f14472c[b10];
            }
            j12 = j14;
            j10 = j15;
        } else {
            j11 = Long.MAX_VALUE;
            j12 = -1;
            j13 = -9223372036854775807L;
        }
        int i11 = 0;
        while (true) {
            a[] aVarArr = this.f14417t;
            if (i11 >= aVarArr.length) {
                break;
            }
            if (i11 != this.f14419v) {
                n nVar2 = aVarArr[i11].f14423b;
                long a11 = a(nVar2, j10, j11);
                if (j13 != com.anythink.expressad.exoplayer.b.f7291b) {
                    j12 = a(nVar2, j13, j12);
                }
                j11 = a11;
            }
            i11++;
        }
        w wVar = new w(j10, j11);
        if (j13 == com.anythink.expressad.exoplayer.b.f7291b) {
            return new v.a(wVar);
        }
        return new v.a(wVar, new w(j13, j12));
    }

    private boolean b(com.applovin.exoplayer2.e.i iVar, u uVar) throws IOException {
        boolean z10;
        long j10 = this.f14410l - this.f14411m;
        long c10 = iVar.c() + j10;
        y yVar = this.f14412n;
        if (yVar != null) {
            iVar.b(yVar.d(), this.f14411m, (int) j10);
            if (this.f14409k == 1718909296) {
                this.f14421x = a(yVar);
            } else if (!this.f14405g.isEmpty()) {
                this.f14405g.peek().a(new a.b(this.f14409k, yVar));
            }
        } else if (j10 < 262144) {
            iVar.b((int) j10);
        } else {
            uVar.f14937a = iVar.c() + j10;
            z10 = true;
            b(c10);
            return (z10 || this.f14408j == 2) ? false : true;
        }
        z10 = false;
        b(c10);
        if (z10) {
        }
    }

    private void a(a.C0166a c0166a) throws com.applovin.exoplayer2.ai {
        com.applovin.exoplayer2.g.a aVar;
        com.applovin.exoplayer2.g.a aVar2;
        ArrayList arrayList;
        List<n> list;
        int i10;
        int i11;
        ArrayList arrayList2 = new ArrayList();
        boolean z10 = this.f14421x == 1;
        r rVar = new r();
        a.b d10 = c0166a.d(1969517665);
        if (d10 != null) {
            Pair<com.applovin.exoplayer2.g.a, com.applovin.exoplayer2.g.a> a10 = b.a(d10);
            com.applovin.exoplayer2.g.a aVar3 = (com.applovin.exoplayer2.g.a) a10.first;
            com.applovin.exoplayer2.g.a aVar4 = (com.applovin.exoplayer2.g.a) a10.second;
            if (aVar3 != null) {
                rVar.a(aVar3);
            }
            aVar = aVar4;
            aVar2 = aVar3;
        } else {
            aVar = null;
            aVar2 = null;
        }
        a.C0166a e10 = c0166a.e(1835365473);
        com.applovin.exoplayer2.g.a a11 = e10 != null ? b.a(e10) : null;
        List<n> a12 = b.a(c0166a, rVar, com.anythink.expressad.exoplayer.b.f7291b, (com.applovin.exoplayer2.d.e) null, (this.f14401b & 1) != 0, z10, (Function<k, k>) new Function() { // from class: com.applovin.exoplayer2.e.g.p
            @Override // com.applovin.exoplayer2.common.base.Function
            public final Object apply(Object obj) {
                k a13;
                a13 = g.a((k) obj);
                return a13;
            }
        });
        com.applovin.exoplayer2.e.j jVar = (com.applovin.exoplayer2.e.j) com.applovin.exoplayer2.l.a.b(this.f14416s);
        int size = a12.size();
        int i12 = 0;
        int i13 = -1;
        long j10 = com.anythink.expressad.exoplayer.b.f7291b;
        while (i12 < size) {
            n nVar = a12.get(i12);
            if (nVar.f14471b == 0) {
                list = a12;
                i10 = size;
                arrayList = arrayList2;
            } else {
                k kVar = nVar.f14470a;
                int i14 = i13;
                arrayList = arrayList2;
                long j11 = kVar.f14442e;
                if (j11 == com.anythink.expressad.exoplayer.b.f7291b) {
                    j11 = nVar.f14476h;
                }
                long max = Math.max(j10, j11);
                list = a12;
                i10 = size;
                a aVar5 = new a(kVar, nVar, jVar.a(i12, kVar.f14439b));
                int i15 = nVar.f14474e + 30;
                v.a a13 = kVar.f.a();
                a13.f(i15);
                if (kVar.f14439b == 2 && j11 > 0 && (i11 = nVar.f14471b) > 1) {
                    a13.a(i11 / (((float) j11) / 1000000.0f));
                }
                f.a(kVar.f14439b, rVar, a13);
                int i16 = kVar.f14439b;
                com.applovin.exoplayer2.g.a[] aVarArr = new com.applovin.exoplayer2.g.a[2];
                aVarArr[0] = aVar;
                aVarArr[1] = this.f14407i.isEmpty() ? null : new com.applovin.exoplayer2.g.a(this.f14407i);
                f.a(i16, aVar2, a11, a13, aVarArr);
                aVar5.f14424c.a(a13.a());
                int i17 = i14;
                if (kVar.f14439b == 2 && i17 == -1) {
                    i17 = arrayList.size();
                }
                i13 = i17;
                arrayList.add(aVar5);
                j10 = max;
            }
            i12++;
            arrayList2 = arrayList;
            a12 = list;
            size = i10;
        }
        this.f14419v = i13;
        this.f14420w = j10;
        a[] aVarArr2 = (a[]) arrayList2.toArray(new a[0]);
        this.f14417t = aVarArr2;
        this.f14418u = a(aVarArr2);
        jVar.a();
        jVar.a(this);
    }

    private void b(long j10) throws com.applovin.exoplayer2.ai {
        while (!this.f14405g.isEmpty() && this.f14405g.peek().f14326b == j10) {
            a.C0166a pop = this.f14405g.pop();
            if (pop.f14325a == 1836019574) {
                a(pop);
                this.f14405g.clear();
                this.f14408j = 2;
            } else if (!this.f14405g.isEmpty()) {
                this.f14405g.peek().a(pop);
            }
        }
        if (this.f14408j != 2) {
            d();
        }
    }

    private void d(long j10) {
        for (a aVar : this.f14417t) {
            n nVar = aVar.f14423b;
            int a10 = nVar.a(j10);
            if (a10 == -1) {
                a10 = nVar.b(j10);
            }
            aVar.f14425d = a10;
        }
    }

    private static long[][] a(a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            jArr[i10] = new long[aVarArr[i10].f14423b.f14471b];
            jArr2[i10] = aVarArr[i10].f14423b.f[0];
        }
        long j10 = 0;
        int i11 = 0;
        while (i11 < aVarArr.length) {
            long j11 = Long.MAX_VALUE;
            int i12 = -1;
            for (int i13 = 0; i13 < aVarArr.length; i13++) {
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
            n nVar = aVarArr[i12].f14423b;
            j10 += nVar.f14473d[i14];
            int i15 = i14 + 1;
            iArr[i12] = i15;
            if (i15 < jArr3.length) {
                jArr2[i12] = nVar.f[i15];
            } else {
                zArr[i12] = true;
                i11++;
            }
        }
        return jArr;
    }

    private static long a(n nVar, long j10, long j11) {
        int a10 = a(nVar, j10);
        return a10 == -1 ? j11 : Math.min(nVar.f14472c[a10], j11);
    }

    private static int a(n nVar, long j10) {
        int a10 = nVar.a(j10);
        return a10 == -1 ? nVar.b(j10) : a10;
    }

    private static int a(y yVar) {
        yVar.d(8);
        int a10 = a(yVar.q());
        if (a10 != 0) {
            return a10;
        }
        yVar.e(4);
        while (yVar.a() > 0) {
            int a11 = a(yVar.q());
            if (a11 != 0) {
                return a11;
            }
        }
        return 0;
    }
}
