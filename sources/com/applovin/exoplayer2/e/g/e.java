package com.applovin.exoplayer2.e.g;

import android.util.Pair;
import android.util.SparseArray;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.common.base.Function;
import com.applovin.exoplayer2.d.e;
import com.applovin.exoplayer2.e.g.a;
import com.applovin.exoplayer2.e.r;
import com.applovin.exoplayer2.e.u;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.l.ag;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.v;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public class e implements com.applovin.exoplayer2.e.h {

    /* renamed from: a */
    public static final com.applovin.exoplayer2.e.l f14363a = new v2.a(2);

    /* renamed from: b */
    private static final byte[] f14364b = {-94, 57, 79, 82, 90, -101, 79, Ascii.DC4, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: c */
    private static final v f14365c = new v.a().f(com.anythink.expressad.exoplayer.k.o.ai).a();
    private long A;
    private long B;
    private b C;
    private int D;
    private int E;
    private int F;
    private boolean G;
    private com.applovin.exoplayer2.e.j H;
    private x[] I;
    private x[] J;
    private boolean K;

    /* renamed from: d */
    private final int f14366d;

    /* renamed from: e */
    private final k f14367e;
    private final List<v> f;

    /* renamed from: g */
    private final SparseArray<b> f14368g;

    /* renamed from: h */
    private final y f14369h;

    /* renamed from: i */
    private final y f14370i;

    /* renamed from: j */
    private final y f14371j;

    /* renamed from: k */
    private final byte[] f14372k;

    /* renamed from: l */
    private final y f14373l;

    /* renamed from: m */
    private final ag f14374m;

    /* renamed from: n */
    private final com.applovin.exoplayer2.g.b.c f14375n;
    private final y o;

    /* renamed from: p */
    private final ArrayDeque<a.C0166a> f14376p;

    /* renamed from: q */
    private final ArrayDeque<a> f14377q;

    /* renamed from: r */
    private final x f14378r;

    /* renamed from: s */
    private int f14379s;

    /* renamed from: t */
    private int f14380t;

    /* renamed from: u */
    private long f14381u;

    /* renamed from: v */
    private int f14382v;

    /* renamed from: w */
    private y f14383w;

    /* renamed from: x */
    private long f14384x;
    private int y;

    /* renamed from: z */
    private long f14385z;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final long f14386a;

        /* renamed from: b */
        public final int f14387b;

        public a(long j10, int i10) {
            this.f14386a = j10;
            this.f14387b = i10;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final x f14388a;

        /* renamed from: d */
        public n f14391d;

        /* renamed from: e */
        public c f14392e;
        public int f;

        /* renamed from: g */
        public int f14393g;

        /* renamed from: h */
        public int f14394h;

        /* renamed from: i */
        public int f14395i;

        /* renamed from: l */
        private boolean f14398l;

        /* renamed from: b */
        public final m f14389b = new m();

        /* renamed from: c */
        public final y f14390c = new y();

        /* renamed from: j */
        private final y f14396j = new y(1);

        /* renamed from: k */
        private final y f14397k = new y();

        public b(x xVar, n nVar, c cVar) {
            this.f14388a = xVar;
            this.f14391d = nVar;
            this.f14392e = cVar;
            a(nVar, cVar);
        }

        public long b() {
            if (!this.f14398l) {
                return this.f14391d.f[this.f];
            }
            return this.f14389b.b(this.f);
        }

        public long c() {
            if (!this.f14398l) {
                return this.f14391d.f14472c[this.f];
            }
            return this.f14389b.f14458g[this.f14394h];
        }

        public int d() {
            if (!this.f14398l) {
                return this.f14391d.f14473d[this.f];
            }
            return this.f14389b.f14460i[this.f];
        }

        public int e() {
            int i10;
            if (!this.f14398l) {
                i10 = this.f14391d.f14475g[this.f];
            } else if (this.f14389b.f14463l[this.f]) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (h() != null) {
                return i10 | 1073741824;
            }
            return i10;
        }

        public boolean f() {
            this.f++;
            if (!this.f14398l) {
                return false;
            }
            int i10 = this.f14393g + 1;
            this.f14393g = i10;
            int[] iArr = this.f14389b.f14459h;
            int i11 = this.f14394h;
            if (i10 != iArr[i11]) {
                return true;
            }
            this.f14394h = i11 + 1;
            this.f14393g = 0;
            return false;
        }

        public void g() {
            l h10 = h();
            if (h10 == null) {
                return;
            }
            y yVar = this.f14389b.f14466p;
            int i10 = h10.f14451d;
            if (i10 != 0) {
                yVar.e(i10);
            }
            if (this.f14389b.c(this.f)) {
                yVar.e(yVar.i() * 6);
            }
        }

        public l h() {
            if (!this.f14398l) {
                return null;
            }
            int i10 = ((c) ai.a(this.f14389b.f14453a)).f14354a;
            l lVar = this.f14389b.o;
            if (lVar == null) {
                lVar = this.f14391d.f14470a.a(i10);
            }
            if (lVar == null || !lVar.f14448a) {
                return null;
            }
            return lVar;
        }

        public void a(n nVar, c cVar) {
            this.f14391d = nVar;
            this.f14392e = cVar;
            this.f14388a.a(nVar.f14470a.f);
            a();
        }

        public void a(com.applovin.exoplayer2.d.e eVar) {
            l a10 = this.f14391d.f14470a.a(((c) ai.a(this.f14389b.f14453a)).f14354a);
            this.f14388a.a(this.f14391d.f14470a.f.a().a(eVar.a(a10 != null ? a10.f14449b : null)).a());
        }

        public void a() {
            this.f14389b.a();
            this.f = 0;
            this.f14394h = 0;
            this.f14393g = 0;
            this.f14395i = 0;
            this.f14398l = false;
        }

        public void a(long j10) {
            int i10 = this.f;
            while (true) {
                m mVar = this.f14389b;
                if (i10 >= mVar.f || mVar.b(i10) >= j10) {
                    return;
                }
                if (this.f14389b.f14463l[i10]) {
                    this.f14395i = i10;
                }
                i10++;
            }
        }

        public int a(int i10, int i11) {
            y yVar;
            l h10 = h();
            if (h10 == null) {
                return 0;
            }
            int i12 = h10.f14451d;
            if (i12 != 0) {
                yVar = this.f14389b.f14466p;
            } else {
                byte[] bArr = (byte[]) ai.a(h10.f14452e);
                this.f14397k.a(bArr, bArr.length);
                y yVar2 = this.f14397k;
                i12 = bArr.length;
                yVar = yVar2;
            }
            boolean c10 = this.f14389b.c(this.f);
            boolean z10 = c10 || i11 != 0;
            this.f14396j.d()[0] = (byte) ((z10 ? 128 : 0) | i12);
            this.f14396j.d(0);
            this.f14388a.a(this.f14396j, 1, 1);
            this.f14388a.a(yVar, i12, 1);
            if (!z10) {
                return i12 + 1;
            }
            if (!c10) {
                this.f14390c.a(8);
                byte[] d10 = this.f14390c.d();
                d10[0] = 0;
                d10[1] = 1;
                d10[2] = (byte) ((i11 >> 8) & com.anythink.expressad.exoplayer.k.p.f9095b);
                d10[3] = (byte) (i11 & com.anythink.expressad.exoplayer.k.p.f9095b);
                d10[4] = (byte) ((i10 >> 24) & com.anythink.expressad.exoplayer.k.p.f9095b);
                d10[5] = (byte) ((i10 >> 16) & com.anythink.expressad.exoplayer.k.p.f9095b);
                d10[6] = (byte) ((i10 >> 8) & com.anythink.expressad.exoplayer.k.p.f9095b);
                d10[7] = (byte) (i10 & com.anythink.expressad.exoplayer.k.p.f9095b);
                this.f14388a.a(this.f14390c, 8, 1);
                return i12 + 1 + 8;
            }
            y yVar3 = this.f14389b.f14466p;
            int i13 = yVar3.i();
            yVar3.e(-2);
            int i14 = (i13 * 6) + 2;
            if (i11 != 0) {
                this.f14390c.a(i14);
                byte[] d11 = this.f14390c.d();
                yVar3.a(d11, 0, i14);
                int i15 = (((d11[2] & DefaultClassResolver.NAME) << 8) | (d11[3] & DefaultClassResolver.NAME)) + i11;
                d11[2] = (byte) ((i15 >> 8) & com.anythink.expressad.exoplayer.k.p.f9095b);
                d11[3] = (byte) (i15 & com.anythink.expressad.exoplayer.k.p.f9095b);
                yVar3 = this.f14390c;
            }
            this.f14388a.a(yVar3, i14, 1);
            return i12 + 1 + i14;
        }
    }

    public e() {
        this(0);
    }

    private static boolean b(int i10) {
        return i10 == 1751411826 || i10 == 1835296868 || i10 == 1836476516 || i10 == 1936286840 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1668576371 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1937011571 || i10 == 1952867444 || i10 == 1952868452 || i10 == 1953196132 || i10 == 1953654136 || i10 == 1953658222 || i10 == 1886614376 || i10 == 1935763834 || i10 == 1935763823 || i10 == 1936027235 || i10 == 1970628964 || i10 == 1935828848 || i10 == 1936158820 || i10 == 1701606260 || i10 == 1835362404 || i10 == 1701671783;
    }

    public static /* synthetic */ com.applovin.exoplayer2.e.h[] d() {
        return new com.applovin.exoplayer2.e.h[]{new e()};
    }

    public k a(k kVar) {
        return kVar;
    }

    @Override // com.applovin.exoplayer2.e.h
    public void c() {
    }

    public e(int i10) {
        this(i10, null);
    }

    private boolean b(com.applovin.exoplayer2.e.i iVar) throws IOException {
        if (this.f14382v == 0) {
            if (!iVar.a(this.o.d(), 0, 8, true)) {
                return false;
            }
            this.f14382v = 8;
            this.o.d(0);
            this.f14381u = this.o.o();
            this.f14380t = this.o.q();
        }
        long j10 = this.f14381u;
        if (j10 == 1) {
            iVar.b(this.o.d(), 8, 8);
            this.f14382v += 8;
            this.f14381u = this.o.y();
        } else if (j10 == 0) {
            long d10 = iVar.d();
            if (d10 == -1 && !this.f14376p.isEmpty()) {
                d10 = this.f14376p.peek().f14326b;
            }
            if (d10 != -1) {
                this.f14381u = (d10 - iVar.c()) + this.f14382v;
            }
        }
        if (this.f14381u >= this.f14382v) {
            long c10 = iVar.c() - this.f14382v;
            int i10 = this.f14380t;
            if ((i10 == 1836019558 || i10 == 1835295092) && !this.K) {
                this.H.a(new v.b(this.A, c10));
                this.K = true;
            }
            if (this.f14380t == 1836019558) {
                int size = this.f14368g.size();
                for (int i11 = 0; i11 < size; i11++) {
                    m mVar = this.f14368g.valueAt(i11).f14389b;
                    mVar.f14454b = c10;
                    mVar.f14456d = c10;
                    mVar.f14455c = c10;
                }
            }
            int i12 = this.f14380t;
            if (i12 == 1835295092) {
                this.C = null;
                this.f14384x = c10 + this.f14381u;
                this.f14379s = 2;
                return true;
            }
            if (c(i12)) {
                long c11 = (iVar.c() + this.f14381u) - 8;
                this.f14376p.push(new a.C0166a(this.f14380t, c11));
                if (this.f14381u == this.f14382v) {
                    a(c11);
                } else {
                    a();
                }
            } else if (b(this.f14380t)) {
                if (this.f14382v == 8) {
                    long j11 = this.f14381u;
                    if (j11 <= 2147483647L) {
                        y yVar = new y((int) j11);
                        System.arraycopy(this.o.d(), 0, yVar.d(), 0, 8);
                        this.f14383w = yVar;
                        this.f14379s = 1;
                    } else {
                        throw com.applovin.exoplayer2.ai.a("Leaf atom with length > 2147483647 (unsupported).");
                    }
                } else {
                    throw com.applovin.exoplayer2.ai.a("Leaf atom defines extended atom size (unsupported).");
                }
            } else if (this.f14381u <= 2147483647L) {
                this.f14383w = null;
                this.f14379s = 1;
            } else {
                throw com.applovin.exoplayer2.ai.a("Skipping atom with length > 2147483647 (unsupported).");
            }
            return true;
        }
        throw com.applovin.exoplayer2.ai.a("Atom size less than header length (unsupported).");
    }

    private static boolean c(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1836019558 || i10 == 1953653094 || i10 == 1836475768 || i10 == 1701082227;
    }

    private static long d(y yVar) {
        yVar.d(8);
        return com.applovin.exoplayer2.e.g.a.a(yVar.q()) == 1 ? yVar.y() : yVar.o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean e(com.applovin.exoplayer2.e.i iVar) throws IOException {
        int a10;
        b bVar = this.C;
        Throwable th = null;
        if (bVar == null) {
            bVar = a(this.f14368g);
            if (bVar == null) {
                int c10 = (int) (this.f14384x - iVar.c());
                if (c10 >= 0) {
                    iVar.b(c10);
                    a();
                    return false;
                }
                throw com.applovin.exoplayer2.ai.b("Offset to end of mdat was negative.", null);
            }
            int c11 = (int) (bVar.c() - iVar.c());
            if (c11 < 0) {
                q.c("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                c11 = 0;
            }
            iVar.b(c11);
            this.C = bVar;
        }
        int i10 = 4;
        int i11 = 1;
        if (this.f14379s == 3) {
            int d10 = bVar.d();
            this.D = d10;
            if (bVar.f < bVar.f14395i) {
                iVar.b(d10);
                bVar.g();
                if (!bVar.f()) {
                    this.C = null;
                }
                this.f14379s = 3;
                return true;
            }
            if (bVar.f14391d.f14470a.f14443g == 1) {
                this.D = d10 - 8;
                iVar.b(8);
            }
            if ("audio/ac4".equals(bVar.f14391d.f14470a.f.f16838l)) {
                this.E = bVar.a(this.D, 7);
                com.applovin.exoplayer2.b.c.a(this.D, this.f14373l);
                bVar.f14388a.a(this.f14373l, 7);
                this.E += 7;
            } else {
                this.E = bVar.a(this.D, 0);
            }
            this.D += this.E;
            this.f14379s = 4;
            this.F = 0;
        }
        k kVar = bVar.f14391d.f14470a;
        x xVar = bVar.f14388a;
        long b10 = bVar.b();
        ag agVar = this.f14374m;
        if (agVar != null) {
            b10 = agVar.c(b10);
        }
        long j10 = b10;
        if (kVar.f14446j == 0) {
            while (true) {
                int i12 = this.E;
                int i13 = this.D;
                if (i12 >= i13) {
                    break;
                }
                this.E += xVar.a((com.applovin.exoplayer2.k.g) iVar, i13 - i12, false);
            }
        } else {
            byte[] d11 = this.f14370i.d();
            d11[0] = 0;
            d11[1] = 0;
            d11[2] = 0;
            int i14 = kVar.f14446j;
            int i15 = i14 + 1;
            int i16 = 4 - i14;
            while (this.E < this.D) {
                int i17 = this.F;
                if (i17 == 0) {
                    iVar.b(d11, i16, i15);
                    this.f14370i.d(0);
                    int q10 = this.f14370i.q();
                    if (q10 >= i11) {
                        this.F = q10 - 1;
                        this.f14369h.d(0);
                        xVar.a(this.f14369h, i10);
                        xVar.a(this.f14370i, i11);
                        this.G = (this.J.length <= 0 || !com.applovin.exoplayer2.l.v.a(kVar.f.f16838l, d11[i10])) ? 0 : i11;
                        this.E += 5;
                        this.D += i16;
                    } else {
                        throw com.applovin.exoplayer2.ai.b("Invalid NAL length", th);
                    }
                } else {
                    if (this.G) {
                        this.f14371j.a(i17);
                        iVar.b(this.f14371j.d(), 0, this.F);
                        xVar.a(this.f14371j, this.F);
                        a10 = this.F;
                        int a11 = com.applovin.exoplayer2.l.v.a(this.f14371j.d(), this.f14371j.b());
                        this.f14371j.d(com.anythink.expressad.exoplayer.k.o.f9075i.equals(kVar.f.f16838l) ? 1 : 0);
                        this.f14371j.c(a11);
                        com.applovin.exoplayer2.e.b.a(j10, this.f14371j, this.J);
                    } else {
                        a10 = xVar.a((com.applovin.exoplayer2.k.g) iVar, i17, false);
                    }
                    this.E += a10;
                    this.F -= a10;
                    th = null;
                    i10 = 4;
                    i11 = 1;
                }
            }
        }
        int e10 = bVar.e();
        l h10 = bVar.h();
        xVar.a(j10, e10, this.D, 0, h10 != null ? h10.f14450c : null);
        b(j10);
        if (!bVar.f()) {
            this.C = null;
        }
        this.f14379s = 3;
        return true;
    }

    @Override // com.applovin.exoplayer2.e.h
    public boolean a(com.applovin.exoplayer2.e.i iVar) throws IOException {
        return j.a(iVar);
    }

    public e(int i10, ag agVar) {
        this(i10, agVar, null, Collections.emptyList());
    }

    private void c(com.applovin.exoplayer2.e.i iVar) throws IOException {
        int i10 = ((int) this.f14381u) - this.f14382v;
        y yVar = this.f14383w;
        if (yVar != null) {
            iVar.b(yVar.d(), 8, i10);
            a(new a.b(this.f14380t, yVar), iVar.c());
        } else {
            iVar.b(i10);
        }
        a(iVar.c());
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(com.applovin.exoplayer2.e.j jVar) {
        this.H = jVar;
        a();
        b();
        k kVar = this.f14367e;
        if (kVar != null) {
            this.f14368g.put(0, new b(jVar.a(0, kVar.f14439b), new n(this.f14367e, new long[0], new int[0], 0, new long[0], new int[0], 0L), new c(0, 0, 0, 0)));
            this.H.a();
        }
    }

    public e(int i10, ag agVar, k kVar, List<com.applovin.exoplayer2.v> list) {
        this(i10, agVar, kVar, list, null);
    }

    public e(int i10, ag agVar, k kVar, List<com.applovin.exoplayer2.v> list, x xVar) {
        this.f14366d = i10;
        this.f14374m = agVar;
        this.f14367e = kVar;
        this.f = Collections.unmodifiableList(list);
        this.f14378r = xVar;
        this.f14375n = new com.applovin.exoplayer2.g.b.c();
        this.o = new y(16);
        this.f14369h = new y(com.applovin.exoplayer2.l.v.f16336a);
        this.f14370i = new y(5);
        this.f14371j = new y();
        byte[] bArr = new byte[16];
        this.f14372k = bArr;
        this.f14373l = new y(bArr);
        this.f14376p = new ArrayDeque<>();
        this.f14377q = new ArrayDeque<>();
        this.f14368g = new SparseArray<>();
        this.A = com.anythink.expressad.exoplayer.b.f7291b;
        this.f14385z = com.anythink.expressad.exoplayer.b.f7291b;
        this.B = com.anythink.expressad.exoplayer.b.f7291b;
        this.H = com.applovin.exoplayer2.e.j.f14871a;
        this.I = new x[0];
        this.J = new x[0];
    }

    private void d(com.applovin.exoplayer2.e.i iVar) throws IOException {
        int size = this.f14368g.size();
        long j10 = Long.MAX_VALUE;
        b bVar = null;
        for (int i10 = 0; i10 < size; i10++) {
            m mVar = this.f14368g.valueAt(i10).f14389b;
            if (mVar.f14467q) {
                long j11 = mVar.f14456d;
                if (j11 < j10) {
                    bVar = this.f14368g.valueAt(i10);
                    j10 = j11;
                }
            }
        }
        if (bVar == null) {
            this.f14379s = 3;
            return;
        }
        int c10 = (int) (j10 - iVar.c());
        if (c10 >= 0) {
            iVar.b(c10);
            bVar.f14389b.a(iVar);
            return;
        }
        throw com.applovin.exoplayer2.ai.b("Offset to encryption data was negative.", null);
    }

    private void c(a.C0166a c0166a) throws com.applovin.exoplayer2.ai {
        a(c0166a, this.f14368g, this.f14367e != null, this.f14366d, this.f14372k);
        com.applovin.exoplayer2.d.e a10 = a(c0166a.f14327c);
        if (a10 != null) {
            int size = this.f14368g.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f14368g.valueAt(i10).a(a10);
            }
        }
        if (this.f14385z != com.anythink.expressad.exoplayer.b.f7291b) {
            int size2 = this.f14368g.size();
            for (int i11 = 0; i11 < size2; i11++) {
                this.f14368g.valueAt(i11).a(this.f14385z);
            }
            this.f14385z = com.anythink.expressad.exoplayer.b.f7291b;
        }
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(long j10, long j11) {
        int size = this.f14368g.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f14368g.valueAt(i10).a();
        }
        this.f14377q.clear();
        this.y = 0;
        this.f14385z = j11;
        this.f14376p.clear();
        a();
    }

    private static long c(y yVar) {
        yVar.d(8);
        return com.applovin.exoplayer2.e.g.a.a(yVar.q()) == 0 ? yVar.o() : yVar.y();
    }

    @Override // com.applovin.exoplayer2.e.h
    public int a(com.applovin.exoplayer2.e.i iVar, u uVar) throws IOException {
        while (true) {
            int i10 = this.f14379s;
            if (i10 != 0) {
                if (i10 == 1) {
                    c(iVar);
                } else if (i10 != 2) {
                    if (e(iVar)) {
                        return 0;
                    }
                } else {
                    d(iVar);
                }
            } else if (!b(iVar)) {
                return -1;
            }
        }
    }

    private void a() {
        this.f14379s = 0;
        this.f14382v = 0;
    }

    private void a(long j10) throws com.applovin.exoplayer2.ai {
        while (!this.f14376p.isEmpty() && this.f14376p.peek().f14326b == j10) {
            a(this.f14376p.pop());
        }
        a();
    }

    private void a(a.b bVar, long j10) throws com.applovin.exoplayer2.ai {
        if (!this.f14376p.isEmpty()) {
            this.f14376p.peek().a(bVar);
            return;
        }
        int i10 = bVar.f14325a;
        if (i10 != 1936286840) {
            if (i10 == 1701671783) {
                a(bVar.f14329b);
            }
        } else {
            Pair<Long, com.applovin.exoplayer2.e.c> a10 = a(bVar.f14329b, j10);
            this.B = ((Long) a10.first).longValue();
            this.H.a((com.applovin.exoplayer2.e.v) a10.second);
            this.K = true;
        }
    }

    private void a(a.C0166a c0166a) throws com.applovin.exoplayer2.ai {
        int i10 = c0166a.f14325a;
        if (i10 == 1836019574) {
            b(c0166a);
        } else if (i10 == 1836019558) {
            c(c0166a);
        } else {
            if (this.f14376p.isEmpty()) {
                return;
            }
            this.f14376p.peek().a(c0166a);
        }
    }

    private c a(SparseArray<c> sparseArray, int i10) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return (c) com.applovin.exoplayer2.l.a.b(sparseArray.get(i10));
    }

    private void a(y yVar) {
        long d10;
        String str;
        long d11;
        String str2;
        long o;
        long j10;
        if (this.I.length == 0) {
            return;
        }
        yVar.d(8);
        int a10 = com.applovin.exoplayer2.e.g.a.a(yVar.q());
        if (a10 != 0) {
            if (a10 != 1) {
                a3.k.y("Skipping unsupported emsg version: ", a10, "FragmentedMp4Extractor");
                return;
            }
            long o6 = yVar.o();
            j10 = ai.d(yVar.y(), 1000000L, o6);
            long d12 = ai.d(yVar.o(), 1000L, o6);
            long o10 = yVar.o();
            str = (String) com.applovin.exoplayer2.l.a.b(yVar.B());
            d11 = d12;
            o = o10;
            str2 = (String) com.applovin.exoplayer2.l.a.b(yVar.B());
            d10 = -9223372036854775807L;
        } else {
            String str3 = (String) com.applovin.exoplayer2.l.a.b(yVar.B());
            String str4 = (String) com.applovin.exoplayer2.l.a.b(yVar.B());
            long o11 = yVar.o();
            d10 = ai.d(yVar.o(), 1000000L, o11);
            long j11 = this.B;
            long j12 = j11 != com.anythink.expressad.exoplayer.b.f7291b ? j11 + d10 : -9223372036854775807L;
            str = str3;
            d11 = ai.d(yVar.o(), 1000L, o11);
            str2 = str4;
            o = yVar.o();
            j10 = j12;
        }
        byte[] bArr = new byte[yVar.a()];
        yVar.a(bArr, 0, yVar.a());
        y yVar2 = new y(this.f14375n.a(new com.applovin.exoplayer2.g.b.a(str, str2, d11, o, bArr)));
        int a11 = yVar2.a();
        for (x xVar : this.I) {
            yVar2.d(0);
            xVar.a(yVar2, a11);
        }
        if (j10 == com.anythink.expressad.exoplayer.b.f7291b) {
            this.f14377q.addLast(new a(d10, a11));
            this.y += a11;
            return;
        }
        ag agVar = this.f14374m;
        if (agVar != null) {
            j10 = agVar.c(j10);
        }
        for (x xVar2 : this.I) {
            xVar2.a(j10, 1, a11, 0, null);
        }
    }

    private void b(a.C0166a c0166a) throws com.applovin.exoplayer2.ai {
        int i10 = 0;
        com.applovin.exoplayer2.l.a.b(this.f14367e == null, "Unexpected moov box.");
        com.applovin.exoplayer2.d.e a10 = a(c0166a.f14327c);
        a.C0166a c0166a2 = (a.C0166a) com.applovin.exoplayer2.l.a.b(c0166a.e(1836475768));
        SparseArray<c> sparseArray = new SparseArray<>();
        int size = c0166a2.f14327c.size();
        long j10 = -9223372036854775807L;
        for (int i11 = 0; i11 < size; i11++) {
            a.b bVar = c0166a2.f14327c.get(i11);
            int i12 = bVar.f14325a;
            if (i12 == 1953654136) {
                Pair<Integer, c> b10 = b(bVar.f14329b);
                sparseArray.put(((Integer) b10.first).intValue(), (c) b10.second);
            } else if (i12 == 1835362404) {
                j10 = c(bVar.f14329b);
            }
        }
        List<n> a11 = com.applovin.exoplayer2.e.g.b.a(c0166a, new r(), j10, a10, (this.f14366d & 16) != 0, false, (Function<k, k>) new Function() { // from class: com.applovin.exoplayer2.e.g.o
            @Override // com.applovin.exoplayer2.common.base.Function
            public final Object apply(Object obj) {
                return e.this.a((k) obj);
            }
        });
        int size2 = a11.size();
        if (this.f14368g.size() == 0) {
            while (i10 < size2) {
                n nVar = a11.get(i10);
                k kVar = nVar.f14470a;
                this.f14368g.put(kVar.f14438a, new b(this.H.a(i10, kVar.f14439b), nVar, a(sparseArray, kVar.f14438a)));
                this.A = Math.max(this.A, kVar.f14442e);
                i10++;
            }
            this.H.a();
            return;
        }
        com.applovin.exoplayer2.l.a.b(this.f14368g.size() == size2);
        while (i10 < size2) {
            n nVar2 = a11.get(i10);
            k kVar2 = nVar2.f14470a;
            this.f14368g.get(kVar2.f14438a).a(nVar2, a(sparseArray, kVar2.f14438a));
            i10++;
        }
    }

    private void b() {
        int i10;
        x[] xVarArr = new x[2];
        this.I = xVarArr;
        x xVar = this.f14378r;
        int i11 = 0;
        if (xVar != null) {
            xVarArr[0] = xVar;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i12 = 100;
        if ((this.f14366d & 4) != 0) {
            xVarArr[i10] = this.H.a(100, 5);
            i12 = 101;
            i10++;
        }
        x[] xVarArr2 = (x[]) ai.a(this.I, i10);
        this.I = xVarArr2;
        for (x xVar2 : xVarArr2) {
            xVar2.a(f14365c);
        }
        this.J = new x[this.f.size()];
        while (i11 < this.J.length) {
            x a10 = this.H.a(i12, 3);
            a10.a(this.f.get(i11));
            this.J[i11] = a10;
            i11++;
            i12++;
        }
    }

    private static void a(a.C0166a c0166a, SparseArray<b> sparseArray, boolean z10, int i10, byte[] bArr) throws com.applovin.exoplayer2.ai {
        int size = c0166a.f14328d.size();
        for (int i11 = 0; i11 < size; i11++) {
            a.C0166a c0166a2 = c0166a.f14328d.get(i11);
            if (c0166a2.f14325a == 1953653094) {
                b(c0166a2, sparseArray, z10, i10, bArr);
            }
        }
    }

    private static void a(a.C0166a c0166a, b bVar, int i10) throws com.applovin.exoplayer2.ai {
        List<a.b> list = c0166a.f14327c;
        int size = list.size();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            a.b bVar2 = list.get(i13);
            if (bVar2.f14325a == 1953658222) {
                y yVar = bVar2.f14329b;
                yVar.d(12);
                int w10 = yVar.w();
                if (w10 > 0) {
                    i12 += w10;
                    i11++;
                }
            }
        }
        bVar.f14394h = 0;
        bVar.f14393g = 0;
        bVar.f = 0;
        bVar.f14389b.a(i11, i12);
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            a.b bVar3 = list.get(i16);
            if (bVar3.f14325a == 1953658222) {
                i15 = a(bVar, i14, i10, bVar3.f14329b, i15);
                i14++;
            }
        }
    }

    private static Pair<Integer, c> b(y yVar) {
        yVar.d(12);
        return Pair.create(Integer.valueOf(yVar.q()), new c(yVar.q() - 1, yVar.q(), yVar.q(), yVar.q()));
    }

    private static void a(l lVar, y yVar, m mVar) throws com.applovin.exoplayer2.ai {
        int i10;
        int i11 = lVar.f14451d;
        yVar.d(8);
        if ((com.applovin.exoplayer2.e.g.a.b(yVar.q()) & 1) == 1) {
            yVar.e(8);
        }
        int h10 = yVar.h();
        int w10 = yVar.w();
        if (w10 <= mVar.f) {
            if (h10 == 0) {
                boolean[] zArr = mVar.f14465n;
                i10 = 0;
                for (int i12 = 0; i12 < w10; i12++) {
                    int h11 = yVar.h();
                    i10 += h11;
                    zArr[i12] = h11 > i11;
                }
            } else {
                i10 = (h10 * w10) + 0;
                Arrays.fill(mVar.f14465n, 0, w10, h10 > i11);
            }
            Arrays.fill(mVar.f14465n, w10, mVar.f, false);
            if (i10 > 0) {
                mVar.a(i10);
                return;
            }
            return;
        }
        StringBuilder n10 = a3.k.n("Saiz sample count ", w10, " is greater than fragment sample count");
        n10.append(mVar.f);
        throw com.applovin.exoplayer2.ai.b(n10.toString(), null);
    }

    private static void b(a.C0166a c0166a, SparseArray<b> sparseArray, boolean z10, int i10, byte[] bArr) throws com.applovin.exoplayer2.ai {
        b a10 = a(((a.b) com.applovin.exoplayer2.l.a.b(c0166a.d(1952868452))).f14329b, sparseArray, z10);
        if (a10 == null) {
            return;
        }
        m mVar = a10.f14389b;
        long j10 = mVar.f14468r;
        boolean z11 = mVar.f14469s;
        a10.a();
        a10.f14398l = true;
        a.b d10 = c0166a.d(1952867444);
        if (d10 != null && (i10 & 2) == 0) {
            mVar.f14468r = d(d10.f14329b);
            mVar.f14469s = true;
        } else {
            mVar.f14468r = j10;
            mVar.f14469s = z11;
        }
        a(c0166a, a10, i10);
        l a11 = a10.f14391d.f14470a.a(((c) com.applovin.exoplayer2.l.a.b(mVar.f14453a)).f14354a);
        a.b d11 = c0166a.d(1935763834);
        if (d11 != null) {
            a((l) com.applovin.exoplayer2.l.a.b(a11), d11.f14329b, mVar);
        }
        a.b d12 = c0166a.d(1935763823);
        if (d12 != null) {
            a(d12.f14329b, mVar);
        }
        a.b d13 = c0166a.d(1936027235);
        if (d13 != null) {
            b(d13.f14329b, mVar);
        }
        a(c0166a, a11 != null ? a11.f14449b : null, mVar);
        int size = c0166a.f14327c.size();
        for (int i11 = 0; i11 < size; i11++) {
            a.b bVar = c0166a.f14327c.get(i11);
            if (bVar.f14325a == 1970628964) {
                a(bVar.f14329b, mVar, bArr);
            }
        }
    }

    private static void a(y yVar, m mVar) throws com.applovin.exoplayer2.ai {
        yVar.d(8);
        int q10 = yVar.q();
        if ((com.applovin.exoplayer2.e.g.a.b(q10) & 1) == 1) {
            yVar.e(8);
        }
        int w10 = yVar.w();
        if (w10 == 1) {
            mVar.f14456d += com.applovin.exoplayer2.e.g.a.a(q10) == 0 ? yVar.o() : yVar.y();
        } else {
            throw com.applovin.exoplayer2.ai.b("Unexpected saio entry count: " + w10, null);
        }
    }

    private static void b(y yVar, m mVar) throws com.applovin.exoplayer2.ai {
        a(yVar, 0, mVar);
    }

    private void b(long j10) {
        while (!this.f14377q.isEmpty()) {
            a removeFirst = this.f14377q.removeFirst();
            this.y -= removeFirst.f14387b;
            long j11 = removeFirst.f14386a + j10;
            ag agVar = this.f14374m;
            if (agVar != null) {
                j11 = agVar.c(j11);
            }
            for (x xVar : this.I) {
                xVar.a(j11, 1, removeFirst.f14387b, this.y, null);
            }
        }
    }

    private static b a(y yVar, SparseArray<b> sparseArray, boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        yVar.d(8);
        int b10 = com.applovin.exoplayer2.e.g.a.b(yVar.q());
        b valueAt = z10 ? sparseArray.valueAt(0) : sparseArray.get(yVar.q());
        if (valueAt == null) {
            return null;
        }
        if ((b10 & 1) != 0) {
            long y = yVar.y();
            m mVar = valueAt.f14389b;
            mVar.f14455c = y;
            mVar.f14456d = y;
        }
        c cVar = valueAt.f14392e;
        if ((b10 & 2) != 0) {
            i10 = yVar.q() - 1;
        } else {
            i10 = cVar.f14354a;
        }
        if ((b10 & 8) != 0) {
            i11 = yVar.q();
        } else {
            i11 = cVar.f14355b;
        }
        if ((b10 & 16) != 0) {
            i12 = yVar.q();
        } else {
            i12 = cVar.f14356c;
        }
        if ((b10 & 32) != 0) {
            i13 = yVar.q();
        } else {
            i13 = cVar.f14357d;
        }
        valueAt.f14389b.f14453a = new c(i10, i11, i12, i13);
        return valueAt;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int a(com.applovin.exoplayer2.e.g.e.b r36, int r37, int r38, com.applovin.exoplayer2.l.y r39, int r40) throws com.applovin.exoplayer2.ai {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.g.e.a(com.applovin.exoplayer2.e.g.e$b, int, int, com.applovin.exoplayer2.l.y, int):int");
    }

    private static int a(int i10) throws com.applovin.exoplayer2.ai {
        if (i10 >= 0) {
            return i10;
        }
        throw com.applovin.exoplayer2.ai.b("Unexpected negative value: " + i10, null);
    }

    private static void a(y yVar, m mVar, byte[] bArr) throws com.applovin.exoplayer2.ai {
        yVar.d(8);
        yVar.a(bArr, 0, 16);
        if (Arrays.equals(bArr, f14364b)) {
            a(yVar, 16, mVar);
        }
    }

    private static void a(y yVar, int i10, m mVar) throws com.applovin.exoplayer2.ai {
        yVar.d(i10 + 8);
        int b10 = com.applovin.exoplayer2.e.g.a.b(yVar.q());
        if ((b10 & 1) == 0) {
            boolean z10 = (b10 & 2) != 0;
            int w10 = yVar.w();
            if (w10 == 0) {
                Arrays.fill(mVar.f14465n, 0, mVar.f, false);
                return;
            }
            if (w10 == mVar.f) {
                Arrays.fill(mVar.f14465n, 0, w10, z10);
                mVar.a(yVar.a());
                mVar.a(yVar);
                return;
            } else {
                StringBuilder n10 = a3.k.n("Senc sample count ", w10, " is different from fragment sample count");
                n10.append(mVar.f);
                throw com.applovin.exoplayer2.ai.b(n10.toString(), null);
            }
        }
        throw com.applovin.exoplayer2.ai.a("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    private static void a(a.C0166a c0166a, String str, m mVar) throws com.applovin.exoplayer2.ai {
        byte[] bArr = null;
        y yVar = null;
        y yVar2 = null;
        for (int i10 = 0; i10 < c0166a.f14327c.size(); i10++) {
            a.b bVar = c0166a.f14327c.get(i10);
            y yVar3 = bVar.f14329b;
            int i11 = bVar.f14325a;
            if (i11 == 1935828848) {
                yVar3.d(12);
                if (yVar3.q() == 1936025959) {
                    yVar = yVar3;
                }
            } else if (i11 == 1936158820) {
                yVar3.d(12);
                if (yVar3.q() == 1936025959) {
                    yVar2 = yVar3;
                }
            }
        }
        if (yVar == null || yVar2 == null) {
            return;
        }
        yVar.d(8);
        int a10 = com.applovin.exoplayer2.e.g.a.a(yVar.q());
        yVar.e(4);
        if (a10 == 1) {
            yVar.e(4);
        }
        if (yVar.q() == 1) {
            yVar2.d(8);
            int a11 = com.applovin.exoplayer2.e.g.a.a(yVar2.q());
            yVar2.e(4);
            if (a11 == 1) {
                if (yVar2.o() == 0) {
                    throw com.applovin.exoplayer2.ai.a("Variable length description in sgpd found (unsupported)");
                }
            } else if (a11 >= 2) {
                yVar2.e(4);
            }
            if (yVar2.o() == 1) {
                yVar2.e(1);
                int h10 = yVar2.h();
                int i12 = (h10 & 240) >> 4;
                int i13 = h10 & 15;
                boolean z10 = yVar2.h() == 1;
                if (z10) {
                    int h11 = yVar2.h();
                    byte[] bArr2 = new byte[16];
                    yVar2.a(bArr2, 0, 16);
                    if (h11 == 0) {
                        int h12 = yVar2.h();
                        bArr = new byte[h12];
                        yVar2.a(bArr, 0, h12);
                    }
                    mVar.f14464m = true;
                    mVar.o = new l(z10, str, h11, bArr2, i12, i13, bArr);
                    return;
                }
                return;
            }
            throw com.applovin.exoplayer2.ai.a("Entry count in sgpd != 1 (unsupported).");
        }
        throw com.applovin.exoplayer2.ai.a("Entry count in sbgp != 1 (unsupported).");
    }

    private static Pair<Long, com.applovin.exoplayer2.e.c> a(y yVar, long j10) throws com.applovin.exoplayer2.ai {
        long y;
        long y10;
        yVar.d(8);
        int a10 = com.applovin.exoplayer2.e.g.a.a(yVar.q());
        yVar.e(4);
        long o = yVar.o();
        if (a10 == 0) {
            y = yVar.o();
            y10 = yVar.o();
        } else {
            y = yVar.y();
            y10 = yVar.y();
        }
        long j11 = y;
        long j12 = y10 + j10;
        long d10 = ai.d(j11, 1000000L, o);
        yVar.e(2);
        int i10 = yVar.i();
        int[] iArr = new int[i10];
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        long[] jArr3 = new long[i10];
        long j13 = d10;
        int i11 = 0;
        long j14 = j11;
        while (i11 < i10) {
            int q10 = yVar.q();
            if ((q10 & Integer.MIN_VALUE) == 0) {
                long o6 = yVar.o();
                iArr[i11] = q10 & Integer.MAX_VALUE;
                jArr[i11] = j12;
                jArr3[i11] = j13;
                long j15 = j14 + o6;
                long[] jArr4 = jArr2;
                long[] jArr5 = jArr3;
                int i12 = i10;
                long d11 = ai.d(j15, 1000000L, o);
                jArr4[i11] = d11 - jArr5[i11];
                yVar.e(4);
                j12 += r1[i11];
                i11++;
                iArr = iArr;
                jArr3 = jArr5;
                jArr2 = jArr4;
                jArr = jArr;
                i10 = i12;
                j14 = j15;
                j13 = d11;
            } else {
                throw com.applovin.exoplayer2.ai.b("Unhandled indirect reference", null);
            }
        }
        return Pair.create(Long.valueOf(d10), new com.applovin.exoplayer2.e.c(iArr, jArr, jArr2, jArr3));
    }

    private static b a(SparseArray<b> sparseArray) {
        int size = sparseArray.size();
        b bVar = null;
        long j10 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            b valueAt = sparseArray.valueAt(i10);
            if ((valueAt.f14398l || valueAt.f != valueAt.f14391d.f14471b) && (!valueAt.f14398l || valueAt.f14394h != valueAt.f14389b.f14457e)) {
                long c10 = valueAt.c();
                if (c10 < j10) {
                    bVar = valueAt;
                    j10 = c10;
                }
            }
        }
        return bVar;
    }

    private static com.applovin.exoplayer2.d.e a(List<a.b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            a.b bVar = list.get(i10);
            if (bVar.f14325a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] d10 = bVar.f14329b.d();
                UUID b10 = h.b(d10);
                if (b10 == null) {
                    q.c("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new e.a(b10, "video/mp4", d10));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new com.applovin.exoplayer2.d.e(arrayList);
    }
}
