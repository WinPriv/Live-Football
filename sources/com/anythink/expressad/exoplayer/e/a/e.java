package com.anythink.expressad.exoplayer.e.a;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import com.anythink.expressad.exoplayer.d.e;
import com.anythink.expressad.exoplayer.e.a.a;
import com.anythink.expressad.exoplayer.e.k;
import com.anythink.expressad.exoplayer.e.m;
import com.anythink.expressad.exoplayer.k.ac;
import com.anythink.expressad.exoplayer.k.af;
import com.anythink.expressad.exoplayer.k.o;
import com.anythink.expressad.exoplayer.k.p;
import com.anythink.expressad.exoplayer.k.s;
import com.anythink.expressad.exoplayer.t;
import com.applovin.exoplayer2.common.base.Ascii;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class e implements com.anythink.expressad.exoplayer.e.e {

    /* renamed from: e, reason: collision with root package name */
    public static final int f7806e = 1;
    public static final int f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static final int f7807g = 4;

    /* renamed from: h, reason: collision with root package name */
    public static final int f7808h = 16;

    /* renamed from: i, reason: collision with root package name */
    private static final int f7809i = 8;

    /* renamed from: j, reason: collision with root package name */
    private static final String f7810j = "FragmentedMp4Extractor";

    /* renamed from: n, reason: collision with root package name */
    private static final int f7814n = 0;
    private static final int o = 1;

    /* renamed from: p, reason: collision with root package name */
    private static final int f7815p = 2;

    /* renamed from: q, reason: collision with root package name */
    private static final int f7816q = 3;

    /* renamed from: r, reason: collision with root package name */
    private static final int f7817r = 4;
    private final ac A;
    private final s B;
    private final byte[] C;
    private final ArrayDeque<a.C0101a> D;
    private final ArrayDeque<b> E;
    private final com.anythink.expressad.exoplayer.e.m F;
    private int G;
    private int H;
    private long I;
    private int J;
    private s K;
    private long L;
    private int M;
    private long N;
    private long O;
    private long P;
    private c Q;
    private int R;
    private int S;
    private int T;
    private boolean U;
    private com.anythink.expressad.exoplayer.e.g V;
    private com.anythink.expressad.exoplayer.e.m[] W;
    private com.anythink.expressad.exoplayer.e.m[] X;
    private boolean Y;

    /* renamed from: s, reason: collision with root package name */
    private final int f7818s;

    /* renamed from: t, reason: collision with root package name */
    private final j f7819t;

    /* renamed from: u, reason: collision with root package name */
    private final List<com.anythink.expressad.exoplayer.m> f7820u;

    /* renamed from: v, reason: collision with root package name */
    private final com.anythink.expressad.exoplayer.d.e f7821v;

    /* renamed from: w, reason: collision with root package name */
    private final SparseArray<c> f7822w;

    /* renamed from: x, reason: collision with root package name */
    private final s f7823x;
    private final s y;

    /* renamed from: z, reason: collision with root package name */
    private final s f7824z;

    /* renamed from: d, reason: collision with root package name */
    public static final com.anythink.expressad.exoplayer.e.h f7805d = new com.anythink.expressad.exoplayer.e.h() { // from class: com.anythink.expressad.exoplayer.e.a.e.1
        @Override // com.anythink.expressad.exoplayer.e.h
        public final com.anythink.expressad.exoplayer.e.e[] a() {
            return new com.anythink.expressad.exoplayer.e.e[]{new e()};
        }
    };

    /* renamed from: k, reason: collision with root package name */
    private static final int f7811k = af.f("seig");

    /* renamed from: l, reason: collision with root package name */
    private static final byte[] f7812l = {-94, 57, 79, 82, 90, -101, 79, Ascii.DC4, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: m, reason: collision with root package name */
    private static final com.anythink.expressad.exoplayer.m f7813m = com.anythink.expressad.exoplayer.m.a((String) null, o.ai);

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface a {
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final long f7825a;

        /* renamed from: b, reason: collision with root package name */
        public final int f7826b;

        public b(long j10, int i10) {
            this.f7825a = j10;
            this.f7826b = i10;
        }
    }

    public e() {
        this(0);
    }

    private boolean b(com.anythink.expressad.exoplayer.e.f fVar) {
        if (this.J == 0) {
            if (!fVar.a(this.B.f9123a, 0, 8, true)) {
                return false;
            }
            this.J = 8;
            this.B.c(0);
            this.I = this.B.h();
            this.H = this.B.i();
        }
        long j10 = this.I;
        if (j10 == 1) {
            fVar.b(this.B.f9123a, 8, 8);
            this.J += 8;
            this.I = this.B.n();
        } else if (j10 == 0) {
            long d10 = fVar.d();
            if (d10 == -1 && !this.D.isEmpty()) {
                d10 = this.D.peek().aV;
            }
            if (d10 != -1) {
                this.I = (d10 - fVar.c()) + this.J;
            }
        }
        if (this.I >= this.J) {
            long c10 = fVar.c() - this.J;
            if (this.H == com.anythink.expressad.exoplayer.e.a.a.P) {
                int size = this.f7822w.size();
                for (int i10 = 0; i10 < size; i10++) {
                    l lVar = this.f7822w.valueAt(i10).f7828b;
                    lVar.f7907b = c10;
                    lVar.f7909d = c10;
                    lVar.f7908c = c10;
                }
            }
            int i11 = this.H;
            if (i11 == com.anythink.expressad.exoplayer.e.a.a.f7751m) {
                this.Q = null;
                this.L = this.I + c10;
                if (!this.Y) {
                    this.V.a(new k.b(this.O, c10));
                    this.Y = true;
                }
                this.G = 2;
                return true;
            }
            if (i11 == com.anythink.expressad.exoplayer.e.a.a.G || i11 == com.anythink.expressad.exoplayer.e.a.a.I || i11 == com.anythink.expressad.exoplayer.e.a.a.J || i11 == com.anythink.expressad.exoplayer.e.a.a.K || i11 == com.anythink.expressad.exoplayer.e.a.a.L || i11 == com.anythink.expressad.exoplayer.e.a.a.P || i11 == com.anythink.expressad.exoplayer.e.a.a.Q || i11 == com.anythink.expressad.exoplayer.e.a.a.R || i11 == com.anythink.expressad.exoplayer.e.a.a.U) {
                long c11 = (fVar.c() + this.I) - 8;
                this.D.push(new a.C0101a(this.H, c11));
                if (this.I == this.J) {
                    a(c11);
                } else {
                    a();
                }
            } else if (i11 == com.anythink.expressad.exoplayer.e.a.a.X || i11 == com.anythink.expressad.exoplayer.e.a.a.W || i11 == com.anythink.expressad.exoplayer.e.a.a.H || i11 == com.anythink.expressad.exoplayer.e.a.a.F || i11 == com.anythink.expressad.exoplayer.e.a.a.Y || i11 == com.anythink.expressad.exoplayer.e.a.a.B || i11 == com.anythink.expressad.exoplayer.e.a.a.C || i11 == com.anythink.expressad.exoplayer.e.a.a.T || i11 == com.anythink.expressad.exoplayer.e.a.a.D || i11 == com.anythink.expressad.exoplayer.e.a.a.E || i11 == com.anythink.expressad.exoplayer.e.a.a.Z || i11 == com.anythink.expressad.exoplayer.e.a.a.ah || i11 == com.anythink.expressad.exoplayer.e.a.a.ai || i11 == com.anythink.expressad.exoplayer.e.a.a.am || i11 == com.anythink.expressad.exoplayer.e.a.a.al || i11 == com.anythink.expressad.exoplayer.e.a.a.aj || i11 == com.anythink.expressad.exoplayer.e.a.a.ak || i11 == com.anythink.expressad.exoplayer.e.a.a.V || i11 == com.anythink.expressad.exoplayer.e.a.a.S || i11 == com.anythink.expressad.exoplayer.e.a.a.aL) {
                if (this.J == 8) {
                    long j11 = this.I;
                    if (j11 <= 2147483647L) {
                        s sVar = new s((int) j11);
                        this.K = sVar;
                        System.arraycopy(this.B.f9123a, 0, sVar.f9123a, 0, 8);
                        this.G = 1;
                    } else {
                        throw new t("Leaf atom with length > 2147483647 (unsupported).");
                    }
                } else {
                    throw new t("Leaf atom defines extended atom size (unsupported).");
                }
            } else if (this.I <= 2147483647L) {
                this.K = null;
                this.G = 1;
            } else {
                throw new t("Skipping atom with length > 2147483647 (unsupported).");
            }
            return true;
        }
        throw new t("Atom size less than header length (unsupported).");
    }

    private static long d(s sVar) {
        sVar.c(8);
        return com.anythink.expressad.exoplayer.e.a.a.a(sVar.i()) == 1 ? sVar.n() : sVar.h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean e(com.anythink.expressad.exoplayer.e.f fVar) {
        int i10;
        m.a aVar;
        boolean z10;
        int a10;
        int i11 = 1;
        if (this.G == 3) {
            if (this.Q == null) {
                SparseArray<c> sparseArray = this.f7822w;
                int size = sparseArray.size();
                long j10 = Long.MAX_VALUE;
                c cVar = null;
                for (int i12 = 0; i12 < size; i12++) {
                    c valueAt = sparseArray.valueAt(i12);
                    int i13 = valueAt.f7832g;
                    l lVar = valueAt.f7828b;
                    if (i13 != lVar.f7910e) {
                        long j11 = lVar.f7911g[i13];
                        if (j11 < j10) {
                            cVar = valueAt;
                            j10 = j11;
                        }
                    }
                }
                if (cVar == null) {
                    int c10 = (int) (this.L - fVar.c());
                    if (c10 >= 0) {
                        fVar.c(c10);
                        a();
                        return false;
                    }
                    throw new t("Offset to end of mdat was negative.");
                }
                int c11 = (int) (cVar.f7828b.f7911g[cVar.f7832g] - fVar.c());
                if (c11 < 0) {
                    Log.w(f7810j, "Ignoring negative offset to sample data.");
                    c11 = 0;
                }
                fVar.c(c11);
                this.Q = cVar;
            }
            c cVar2 = this.Q;
            int[] iArr = cVar2.f7828b.f7913i;
            int i14 = cVar2.f7831e;
            int i15 = iArr[i14];
            this.R = i15;
            if (i14 < cVar2.f7833h) {
                fVar.c(i15);
                c.a(this.Q);
                if (!this.Q.b()) {
                    this.Q = null;
                }
                this.G = 3;
                return true;
            }
            if (cVar2.f7829c.f7896i == 1) {
                this.R = i15 - 8;
                fVar.c(8);
            }
            int c12 = this.Q.c();
            this.S = c12;
            this.R += c12;
            this.G = 4;
            this.T = 0;
        }
        c cVar3 = this.Q;
        l lVar2 = cVar3.f7828b;
        j jVar = cVar3.f7829c;
        com.anythink.expressad.exoplayer.e.m mVar = cVar3.f7827a;
        int i16 = cVar3.f7831e;
        long b10 = lVar2.b(i16) * 1000;
        ac acVar = this.A;
        if (acVar != null) {
            b10 = acVar.b(b10);
        }
        long j12 = b10;
        int i17 = jVar.f7899l;
        if (i17 == 0) {
            while (true) {
                int i18 = this.S;
                int i19 = this.R;
                if (i18 >= i19) {
                    break;
                }
                this.S += mVar.a(fVar, i19 - i18, false);
            }
        } else {
            byte[] bArr = this.y.f9123a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i20 = i17 + 1;
            int i21 = 4 - i17;
            while (this.S < this.R) {
                int i22 = this.T;
                if (i22 == 0) {
                    fVar.b(bArr, i21, i20);
                    this.y.c(0);
                    this.T = this.y.m() - i11;
                    this.f7823x.c(0);
                    mVar.a(this.f7823x, 4);
                    mVar.a(this.y, i11);
                    if (this.X.length > 0 && p.a(jVar.f7895h.f9257h, bArr[4])) {
                        z10 = i11;
                    } else {
                        z10 = 0;
                    }
                    this.U = z10;
                    this.S += 5;
                    this.R += i21;
                } else {
                    if (this.U) {
                        this.f7824z.a(i22);
                        fVar.b(this.f7824z.f9123a, 0, this.T);
                        mVar.a(this.f7824z, this.T);
                        a10 = this.T;
                        s sVar = this.f7824z;
                        int a11 = p.a(sVar.f9123a, sVar.b());
                        this.f7824z.c(o.f9075i.equals(jVar.f7895h.f9257h) ? 1 : 0);
                        this.f7824z.b(a11);
                    } else {
                        a10 = mVar.a(fVar, i22, false);
                    }
                    this.S += a10;
                    this.T -= a10;
                    i11 = 1;
                }
            }
        }
        boolean z11 = lVar2.f7916l[i16];
        if (lVar2.f7917m) {
            int i23 = (z11 ? 1 : 0) | 1073741824;
            k kVar = lVar2.o;
            if (kVar == null) {
                kVar = jVar.a(lVar2.f7906a.f7795a);
            }
            i10 = i23;
            aVar = kVar.f7903c;
        } else {
            i10 = z11 ? 1 : 0;
            aVar = null;
        }
        mVar.a(j12, i10, this.R, 0, aVar);
        while (!this.E.isEmpty()) {
            b removeFirst = this.E.removeFirst();
            this.M -= removeFirst.f7826b;
            long j13 = j12 + removeFirst.f7825a;
            ac acVar2 = this.A;
            if (acVar2 != null) {
                j13 = acVar2.b(j13);
            }
            for (com.anythink.expressad.exoplayer.e.m mVar2 : this.W) {
                mVar2.a(j13, 1, removeFirst.f7826b, this.M, null);
            }
        }
        if (!this.Q.b()) {
            this.Q = null;
        }
        this.G = 3;
        return true;
    }

    @Override // com.anythink.expressad.exoplayer.e.e
    public final boolean a(com.anythink.expressad.exoplayer.e.f fVar) {
        return i.a(fVar);
    }

    @Override // com.anythink.expressad.exoplayer.e.e
    public final void c() {
    }

    public e(int i10) {
        this(i10, null);
    }

    private void c(com.anythink.expressad.exoplayer.e.f fVar) {
        long n10;
        long n11;
        int i10 = ((int) this.I) - this.J;
        s sVar = this.K;
        if (sVar != null) {
            fVar.b(sVar.f9123a, 8, i10);
            a.b bVar = new a.b(this.H, this.K);
            long c10 = fVar.c();
            if (!this.D.isEmpty()) {
                this.D.peek().a(bVar);
            } else {
                int i11 = bVar.aU;
                int i12 = 0;
                if (i11 == com.anythink.expressad.exoplayer.e.a.a.F) {
                    s sVar2 = bVar.aV;
                    sVar2.c(8);
                    int a10 = com.anythink.expressad.exoplayer.e.a.a.a(sVar2.i());
                    sVar2.d(4);
                    long h10 = sVar2.h();
                    if (a10 == 0) {
                        n10 = sVar2.h();
                        n11 = sVar2.h();
                    } else {
                        n10 = sVar2.n();
                        n11 = sVar2.n();
                    }
                    long j10 = n11 + c10;
                    long j11 = n10;
                    long j12 = j10;
                    long a11 = af.a(j11, 1000000L, h10);
                    sVar2.d(2);
                    int e10 = sVar2.e();
                    int[] iArr = new int[e10];
                    long[] jArr = new long[e10];
                    long[] jArr2 = new long[e10];
                    long[] jArr3 = new long[e10];
                    long j13 = a11;
                    while (i12 < e10) {
                        int i13 = sVar2.i();
                        if ((i13 & Integer.MIN_VALUE) == 0) {
                            long h11 = sVar2.h();
                            iArr[i12] = i13 & Integer.MAX_VALUE;
                            jArr[i12] = j12;
                            jArr3[i12] = j13;
                            long j14 = j11 + h11;
                            long[] jArr4 = jArr3;
                            long[] jArr5 = jArr2;
                            j13 = af.a(j14, 1000000L, h10);
                            jArr5[i12] = j13 - jArr4[i12];
                            sVar2.d(4);
                            j12 += iArr[i12];
                            i12++;
                            jArr = jArr;
                            jArr3 = jArr4;
                            jArr2 = jArr5;
                            e10 = e10;
                            j11 = j14;
                        } else {
                            throw new t("Unhandled indirect reference");
                        }
                    }
                    Pair create = Pair.create(Long.valueOf(a11), new com.anythink.expressad.exoplayer.e.a(iArr, jArr, jArr2, jArr3));
                    this.P = ((Long) create.first).longValue();
                    this.V.a((com.anythink.expressad.exoplayer.e.k) create.second);
                    this.Y = true;
                } else if (i11 == com.anythink.expressad.exoplayer.e.a.a.aL) {
                    s sVar3 = bVar.aV;
                    com.anythink.expressad.exoplayer.e.m[] mVarArr = this.W;
                    if (mVarArr != null && mVarArr.length != 0) {
                        sVar3.c(12);
                        int a12 = sVar3.a();
                        sVar3.p();
                        sVar3.p();
                        long a13 = af.a(sVar3.h(), 1000000L, sVar3.h());
                        for (com.anythink.expressad.exoplayer.e.m mVar : this.W) {
                            sVar3.c(12);
                            mVar.a(sVar3, a12);
                        }
                        long j15 = this.P;
                        if (j15 != com.anythink.expressad.exoplayer.b.f7291b) {
                            long j16 = j15 + a13;
                            ac acVar = this.A;
                            if (acVar != null) {
                                j16 = acVar.b(j16);
                            }
                            com.anythink.expressad.exoplayer.e.m[] mVarArr2 = this.W;
                            int length = mVarArr2.length;
                            while (i12 < length) {
                                mVarArr2[i12].a(j16, 1, a12, 0, null);
                                i12++;
                            }
                        } else {
                            this.E.addLast(new b(a13, a12));
                            this.M += a12;
                        }
                    }
                }
            }
        } else {
            fVar.c(i10);
        }
        a(fVar.c());
    }

    @Override // com.anythink.expressad.exoplayer.e.e
    public final void a(com.anythink.expressad.exoplayer.e.g gVar) {
        this.V = gVar;
        j jVar = this.f7819t;
        if (jVar != null) {
            c cVar = new c(gVar.a(0, jVar.f7892d));
            cVar.a(this.f7819t, new com.anythink.expressad.exoplayer.e.a.c(0, 0, 0, 0));
            this.f7822w.put(0, cVar);
            b();
            this.V.c_();
        }
    }

    private e(int i10, ac acVar) {
        this(i10, acVar, null, null);
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final com.anythink.expressad.exoplayer.e.m f7827a;

        /* renamed from: c, reason: collision with root package name */
        public j f7829c;

        /* renamed from: d, reason: collision with root package name */
        public com.anythink.expressad.exoplayer.e.a.c f7830d;

        /* renamed from: e, reason: collision with root package name */
        public int f7831e;
        public int f;

        /* renamed from: g, reason: collision with root package name */
        public int f7832g;

        /* renamed from: h, reason: collision with root package name */
        public int f7833h;

        /* renamed from: b, reason: collision with root package name */
        public final l f7828b = new l();

        /* renamed from: i, reason: collision with root package name */
        private final s f7834i = new s(1);

        /* renamed from: j, reason: collision with root package name */
        private final s f7835j = new s();

        public c(com.anythink.expressad.exoplayer.e.m mVar) {
            this.f7827a = mVar;
        }

        private void d() {
            l lVar = this.f7828b;
            if (!lVar.f7917m) {
                return;
            }
            s sVar = lVar.f7920q;
            int i10 = e().f7904d;
            if (i10 != 0) {
                sVar.d(i10);
            }
            if (this.f7828b.f7918n[this.f7831e]) {
                sVar.d(sVar.e() * 6);
            }
        }

        private k e() {
            l lVar = this.f7828b;
            int i10 = lVar.f7906a.f7795a;
            k kVar = lVar.o;
            if (kVar != null) {
                return kVar;
            }
            return this.f7829c.a(i10);
        }

        public final void a(j jVar, com.anythink.expressad.exoplayer.e.a.c cVar) {
            this.f7829c = (j) com.anythink.expressad.exoplayer.k.a.a(jVar);
            this.f7830d = (com.anythink.expressad.exoplayer.e.a.c) com.anythink.expressad.exoplayer.k.a.a(cVar);
            this.f7827a.a(jVar.f7895h);
            a();
        }

        public final boolean b() {
            this.f7831e++;
            int i10 = this.f + 1;
            this.f = i10;
            int[] iArr = this.f7828b.f7912h;
            int i11 = this.f7832g;
            if (i10 != iArr[i11]) {
                return true;
            }
            this.f7832g = i11 + 1;
            this.f = 0;
            return false;
        }

        public final int c() {
            s sVar;
            int i10;
            if (!this.f7828b.f7917m) {
                return 0;
            }
            k e10 = e();
            int i11 = e10.f7904d;
            if (i11 != 0) {
                sVar = this.f7828b.f7920q;
            } else {
                byte[] bArr = e10.f7905e;
                this.f7835j.a(bArr, bArr.length);
                s sVar2 = this.f7835j;
                i11 = bArr.length;
                sVar = sVar2;
            }
            boolean z10 = this.f7828b.f7918n[this.f7831e];
            s sVar3 = this.f7834i;
            byte[] bArr2 = sVar3.f9123a;
            if (z10) {
                i10 = 128;
            } else {
                i10 = 0;
            }
            bArr2[0] = (byte) (i10 | i11);
            sVar3.c(0);
            this.f7827a.a(this.f7834i, 1);
            this.f7827a.a(sVar, i11);
            if (!z10) {
                return i11 + 1;
            }
            s sVar4 = this.f7828b.f7920q;
            int e11 = sVar4.e();
            sVar4.d(-2);
            int i12 = (e11 * 6) + 2;
            this.f7827a.a(sVar4, i12);
            return i11 + 1 + i12;
        }

        public final void a(com.anythink.expressad.exoplayer.d.e eVar) {
            k a10 = this.f7829c.a(this.f7828b.f7906a.f7795a);
            this.f7827a.a(this.f7829c.f7895h.a(eVar.a(a10 != null ? a10.f7902b : null)));
        }

        public final void a() {
            this.f7828b.a();
            this.f7831e = 0;
            this.f7832g = 0;
            this.f = 0;
            this.f7833h = 0;
        }

        public final void a(long j10) {
            long a10 = com.anythink.expressad.exoplayer.b.a(j10);
            int i10 = this.f7831e;
            while (true) {
                l lVar = this.f7828b;
                if (i10 >= lVar.f || lVar.b(i10) >= a10) {
                    return;
                }
                if (this.f7828b.f7916l[i10]) {
                    this.f7833h = i10;
                }
                i10++;
            }
        }

        public static /* synthetic */ void a(c cVar) {
            l lVar = cVar.f7828b;
            if (lVar.f7917m) {
                s sVar = lVar.f7920q;
                int i10 = cVar.e().f7904d;
                if (i10 != 0) {
                    sVar.d(i10);
                }
                if (cVar.f7828b.f7918n[cVar.f7831e]) {
                    sVar.d(sVar.e() * 6);
                }
            }
        }
    }

    private e(int i10, ac acVar, j jVar, com.anythink.expressad.exoplayer.d.e eVar) {
        this(i10, acVar, jVar, eVar, Collections.emptyList());
    }

    private void d(com.anythink.expressad.exoplayer.e.f fVar) {
        int size = this.f7822w.size();
        c cVar = null;
        long j10 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            l lVar = this.f7822w.valueAt(i10).f7828b;
            if (lVar.f7921r) {
                long j11 = lVar.f7909d;
                if (j11 < j10) {
                    cVar = this.f7822w.valueAt(i10);
                    j10 = j11;
                }
            }
        }
        if (cVar == null) {
            this.G = 3;
            return;
        }
        int c10 = (int) (j10 - fVar.c());
        if (c10 >= 0) {
            fVar.c(c10);
            l lVar2 = cVar.f7828b;
            fVar.b(lVar2.f7920q.f9123a, 0, lVar2.f7919p);
            lVar2.f7920q.c(0);
            lVar2.f7921r = false;
            return;
        }
        throw new t("Offset to encryption data was negative.");
    }

    private e(int i10, ac acVar, j jVar, com.anythink.expressad.exoplayer.d.e eVar, List<com.anythink.expressad.exoplayer.m> list) {
        this(i10, acVar, jVar, eVar, list, null);
    }

    private e(int i10, ac acVar, j jVar, com.anythink.expressad.exoplayer.d.e eVar, List<com.anythink.expressad.exoplayer.m> list, com.anythink.expressad.exoplayer.e.m mVar) {
        this.f7818s = i10 | (jVar != null ? 8 : 0);
        this.A = acVar;
        this.f7819t = jVar;
        this.f7821v = eVar;
        this.f7820u = Collections.unmodifiableList(list);
        this.F = mVar;
        this.B = new s(16);
        this.f7823x = new s(p.f9094a);
        this.y = new s(5);
        this.f7824z = new s();
        this.C = new byte[16];
        this.D = new ArrayDeque<>();
        this.E = new ArrayDeque<>();
        this.f7822w = new SparseArray<>();
        this.O = com.anythink.expressad.exoplayer.b.f7291b;
        this.N = com.anythink.expressad.exoplayer.b.f7291b;
        this.P = com.anythink.expressad.exoplayer.b.f7291b;
        a();
    }

    @Override // com.anythink.expressad.exoplayer.e.e
    public final void a(long j10, long j11) {
        int size = this.f7822w.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f7822w.valueAt(i10).a();
        }
        this.E.clear();
        this.M = 0;
        this.N = j11;
        this.D.clear();
        a();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x05b6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0004 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0222 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0004 A[SYNTHETIC] */
    @Override // com.anythink.expressad.exoplayer.e.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(com.anythink.expressad.exoplayer.e.f r26, com.anythink.expressad.exoplayer.e.j r27) {
        /*
            Method dump skipped, instructions count: 1480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.e.a.e.a(com.anythink.expressad.exoplayer.e.f, com.anythink.expressad.exoplayer.e.j):int");
    }

    private void b(a.C0101a c0101a) {
        int i10;
        int i11;
        int i12 = 0;
        com.anythink.expressad.exoplayer.k.a.b(this.f7819t == null, "Unexpected moov box.");
        com.anythink.expressad.exoplayer.d.e eVar = this.f7821v;
        if (eVar == null) {
            eVar = a(c0101a.aW);
        }
        a.C0101a e10 = c0101a.e(com.anythink.expressad.exoplayer.e.a.a.R);
        SparseArray sparseArray = new SparseArray();
        int size = e10.aW.size();
        long j10 = -9223372036854775807L;
        for (int i13 = 0; i13 < size; i13++) {
            a.b bVar = e10.aW.get(i13);
            int i14 = bVar.aU;
            if (i14 == com.anythink.expressad.exoplayer.e.a.a.D) {
                Pair<Integer, com.anythink.expressad.exoplayer.e.a.c> b10 = b(bVar.aV);
                sparseArray.put(((Integer) b10.first).intValue(), (com.anythink.expressad.exoplayer.e.a.c) b10.second);
            } else if (i14 == com.anythink.expressad.exoplayer.e.a.a.S) {
                j10 = c(bVar.aV);
            }
        }
        SparseArray sparseArray2 = new SparseArray();
        int size2 = c0101a.aX.size();
        int i15 = 0;
        while (i15 < size2) {
            a.C0101a c0101a2 = c0101a.aX.get(i15);
            if (c0101a2.aU == com.anythink.expressad.exoplayer.e.a.a.I) {
                i10 = i15;
                i11 = size2;
                j a10 = com.anythink.expressad.exoplayer.e.a.b.a(c0101a2, c0101a.d(com.anythink.expressad.exoplayer.e.a.a.H), j10, eVar, (this.f7818s & 16) != 0, false);
                if (a10 != null) {
                    sparseArray2.put(a10.f7891c, a10);
                }
            } else {
                i10 = i15;
                i11 = size2;
            }
            i15 = i10 + 1;
            size2 = i11;
        }
        int size3 = sparseArray2.size();
        if (this.f7822w.size() == 0) {
            while (i12 < size3) {
                j jVar = (j) sparseArray2.valueAt(i12);
                c cVar = new c(this.V.a(i12, jVar.f7892d));
                cVar.a(jVar, a((SparseArray<com.anythink.expressad.exoplayer.e.a.c>) sparseArray, jVar.f7891c));
                this.f7822w.put(jVar.f7891c, cVar);
                this.O = Math.max(this.O, jVar.f7894g);
                i12++;
            }
            b();
            this.V.c_();
            return;
        }
        com.anythink.expressad.exoplayer.k.a.b(this.f7822w.size() == size3);
        while (i12 < size3) {
            j jVar2 = (j) sparseArray2.valueAt(i12);
            this.f7822w.get(jVar2.f7891c).a(jVar2, a((SparseArray<com.anythink.expressad.exoplayer.e.a.c>) sparseArray, jVar2.f7891c));
            i12++;
        }
    }

    private void c(a.C0101a c0101a) {
        a(c0101a, this.f7822w, this.f7818s, this.C);
        com.anythink.expressad.exoplayer.d.e a10 = this.f7821v != null ? null : a(c0101a.aW);
        if (a10 != null) {
            int size = this.f7822w.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f7822w.valueAt(i10).a(a10);
            }
        }
        if (this.N != com.anythink.expressad.exoplayer.b.f7291b) {
            int size2 = this.f7822w.size();
            for (int i11 = 0; i11 < size2; i11++) {
                this.f7822w.valueAt(i11).a(this.N);
            }
            this.N = com.anythink.expressad.exoplayer.b.f7291b;
        }
    }

    private static long c(s sVar) {
        sVar.c(8);
        return com.anythink.expressad.exoplayer.e.a.a.a(sVar.i()) == 0 ? sVar.h() : sVar.n();
    }

    private void b() {
        int i10;
        if (this.W == null) {
            com.anythink.expressad.exoplayer.e.m[] mVarArr = new com.anythink.expressad.exoplayer.e.m[2];
            this.W = mVarArr;
            com.anythink.expressad.exoplayer.e.m mVar = this.F;
            if (mVar != null) {
                mVarArr[0] = mVar;
                i10 = 1;
            } else {
                i10 = 0;
            }
            if ((this.f7818s & 4) != 0) {
                mVarArr[i10] = this.V.a(this.f7822w.size(), 4);
                i10++;
            }
            com.anythink.expressad.exoplayer.e.m[] mVarArr2 = (com.anythink.expressad.exoplayer.e.m[]) Arrays.copyOf(this.W, i10);
            this.W = mVarArr2;
            for (com.anythink.expressad.exoplayer.e.m mVar2 : mVarArr2) {
                mVar2.a(f7813m);
            }
        }
        if (this.X == null) {
            this.X = new com.anythink.expressad.exoplayer.e.m[this.f7820u.size()];
            for (int i11 = 0; i11 < this.X.length; i11++) {
                com.anythink.expressad.exoplayer.e.m a10 = this.V.a(this.f7822w.size() + 1 + i11, 3);
                a10.a(this.f7820u.get(i11));
                this.X[i11] = a10;
            }
        }
    }

    private static Pair<Integer, com.anythink.expressad.exoplayer.e.a.c> b(s sVar) {
        sVar.c(12);
        return Pair.create(Integer.valueOf(sVar.i()), new com.anythink.expressad.exoplayer.e.a.c(sVar.m() - 1, sVar.m(), sVar.m(), sVar.i()));
    }

    private static void b(a.C0101a c0101a, SparseArray<c> sparseArray, int i10, byte[] bArr) {
        c a10 = a(c0101a.d(com.anythink.expressad.exoplayer.e.a.a.C).aV, sparseArray);
        if (a10 == null) {
            return;
        }
        l lVar = a10.f7828b;
        long j10 = lVar.f7922s;
        a10.a();
        int i11 = com.anythink.expressad.exoplayer.e.a.a.B;
        if (c0101a.d(i11) != null && (i10 & 2) == 0) {
            j10 = d(c0101a.d(i11).aV);
        }
        a(c0101a, a10, j10, i10);
        k a11 = a10.f7829c.a(lVar.f7906a.f7795a);
        a.b d10 = c0101a.d(com.anythink.expressad.exoplayer.e.a.a.ah);
        if (d10 != null) {
            a(a11, d10.aV, lVar);
        }
        a.b d11 = c0101a.d(com.anythink.expressad.exoplayer.e.a.a.ai);
        if (d11 != null) {
            a(d11.aV, lVar);
        }
        a.b d12 = c0101a.d(com.anythink.expressad.exoplayer.e.a.a.am);
        if (d12 != null) {
            a(d12.aV, 0, lVar);
        }
        a.b d13 = c0101a.d(com.anythink.expressad.exoplayer.e.a.a.aj);
        a.b d14 = c0101a.d(com.anythink.expressad.exoplayer.e.a.a.ak);
        if (d13 != null && d14 != null) {
            a(d13.aV, d14.aV, a11 != null ? a11.f7902b : null, lVar);
        }
        int size = c0101a.aW.size();
        for (int i12 = 0; i12 < size; i12++) {
            a.b bVar = c0101a.aW.get(i12);
            if (bVar.aU == com.anythink.expressad.exoplayer.e.a.a.al) {
                a(bVar.aV, lVar, bArr);
            }
        }
    }

    private static c b(SparseArray<c> sparseArray, int i10) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return sparseArray.get(i10);
    }

    private static void b(s sVar, l lVar) {
        a(sVar, 0, lVar);
    }

    private void b(long j10) {
        while (!this.E.isEmpty()) {
            b removeFirst = this.E.removeFirst();
            this.M -= removeFirst.f7826b;
            long j11 = removeFirst.f7825a + j10;
            ac acVar = this.A;
            if (acVar != null) {
                j11 = acVar.b(j11);
            }
            for (com.anythink.expressad.exoplayer.e.m mVar : this.W) {
                mVar.a(j11, 1, removeFirst.f7826b, this.M, null);
            }
        }
    }

    private static boolean b(int i10) {
        return i10 == com.anythink.expressad.exoplayer.e.a.a.G || i10 == com.anythink.expressad.exoplayer.e.a.a.I || i10 == com.anythink.expressad.exoplayer.e.a.a.J || i10 == com.anythink.expressad.exoplayer.e.a.a.K || i10 == com.anythink.expressad.exoplayer.e.a.a.L || i10 == com.anythink.expressad.exoplayer.e.a.a.P || i10 == com.anythink.expressad.exoplayer.e.a.a.Q || i10 == com.anythink.expressad.exoplayer.e.a.a.R || i10 == com.anythink.expressad.exoplayer.e.a.a.U;
    }

    private void a() {
        this.G = 0;
        this.J = 0;
    }

    private void a(long j10) {
        while (!this.D.isEmpty() && this.D.peek().aV == j10) {
            a(this.D.pop());
        }
        a();
    }

    private void a(a.b bVar, long j10) {
        long n10;
        long n11;
        if (!this.D.isEmpty()) {
            this.D.peek().a(bVar);
            return;
        }
        int i10 = bVar.aU;
        int i11 = 0;
        if (i10 == com.anythink.expressad.exoplayer.e.a.a.F) {
            s sVar = bVar.aV;
            sVar.c(8);
            int a10 = com.anythink.expressad.exoplayer.e.a.a.a(sVar.i());
            sVar.d(4);
            long h10 = sVar.h();
            if (a10 == 0) {
                n10 = sVar.h();
                n11 = sVar.h();
            } else {
                n10 = sVar.n();
                n11 = sVar.n();
            }
            long j11 = n10;
            long j12 = n11 + j10;
            long a11 = af.a(j11, 1000000L, h10);
            sVar.d(2);
            int e10 = sVar.e();
            int[] iArr = new int[e10];
            long[] jArr = new long[e10];
            long[] jArr2 = new long[e10];
            long[] jArr3 = new long[e10];
            long j13 = a11;
            while (i11 < e10) {
                int i12 = sVar.i();
                if ((i12 & Integer.MIN_VALUE) == 0) {
                    long h11 = sVar.h();
                    iArr[i11] = i12 & Integer.MAX_VALUE;
                    jArr[i11] = j12;
                    jArr3[i11] = j13;
                    long j14 = j11 + h11;
                    int i13 = e10;
                    long[] jArr4 = jArr2;
                    long[] jArr5 = jArr3;
                    j13 = af.a(j14, 1000000L, h10);
                    jArr4[i11] = j13 - jArr5[i11];
                    sVar.d(4);
                    j12 += r13[i11];
                    i11++;
                    jArr3 = jArr5;
                    iArr = iArr;
                    jArr = jArr;
                    j11 = j14;
                    e10 = i13;
                    jArr2 = jArr4;
                } else {
                    throw new t("Unhandled indirect reference");
                }
            }
            Pair create = Pair.create(Long.valueOf(a11), new com.anythink.expressad.exoplayer.e.a(iArr, jArr, jArr2, jArr3));
            this.P = ((Long) create.first).longValue();
            this.V.a((com.anythink.expressad.exoplayer.e.k) create.second);
            this.Y = true;
            return;
        }
        if (i10 == com.anythink.expressad.exoplayer.e.a.a.aL) {
            s sVar2 = bVar.aV;
            com.anythink.expressad.exoplayer.e.m[] mVarArr = this.W;
            if (mVarArr == null || mVarArr.length == 0) {
                return;
            }
            sVar2.c(12);
            int a12 = sVar2.a();
            sVar2.p();
            sVar2.p();
            long a13 = af.a(sVar2.h(), 1000000L, sVar2.h());
            for (com.anythink.expressad.exoplayer.e.m mVar : this.W) {
                sVar2.c(12);
                mVar.a(sVar2, a12);
            }
            long j15 = this.P;
            if (j15 != com.anythink.expressad.exoplayer.b.f7291b) {
                long j16 = j15 + a13;
                ac acVar = this.A;
                if (acVar != null) {
                    j16 = acVar.b(j16);
                }
                com.anythink.expressad.exoplayer.e.m[] mVarArr2 = this.W;
                int length = mVarArr2.length;
                while (i11 < length) {
                    mVarArr2[i11].a(j16, 1, a12, 0, null);
                    i11++;
                }
                return;
            }
            this.E.addLast(new b(a13, a12));
            this.M += a12;
        }
    }

    private void a(a.C0101a c0101a) {
        int i10 = c0101a.aU;
        if (i10 == com.anythink.expressad.exoplayer.e.a.a.G) {
            b(c0101a);
        } else if (i10 == com.anythink.expressad.exoplayer.e.a.a.P) {
            c(c0101a);
        } else {
            if (this.D.isEmpty()) {
                return;
            }
            this.D.peek().a(c0101a);
        }
    }

    private static com.anythink.expressad.exoplayer.e.a.c a(SparseArray<com.anythink.expressad.exoplayer.e.a.c> sparseArray, int i10) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return (com.anythink.expressad.exoplayer.e.a.c) com.anythink.expressad.exoplayer.k.a.a(sparseArray.get(i10));
    }

    private void a(s sVar) {
        com.anythink.expressad.exoplayer.e.m[] mVarArr = this.W;
        if (mVarArr == null || mVarArr.length == 0) {
            return;
        }
        sVar.c(12);
        int a10 = sVar.a();
        sVar.p();
        sVar.p();
        long a11 = af.a(sVar.h(), 1000000L, sVar.h());
        for (com.anythink.expressad.exoplayer.e.m mVar : this.W) {
            sVar.c(12);
            mVar.a(sVar, a10);
        }
        long j10 = this.P;
        if (j10 != com.anythink.expressad.exoplayer.b.f7291b) {
            long j11 = j10 + a11;
            ac acVar = this.A;
            if (acVar != null) {
                j11 = acVar.b(j11);
            }
            long j12 = j11;
            for (com.anythink.expressad.exoplayer.e.m mVar2 : this.W) {
                mVar2.a(j12, 1, a10, 0, null);
            }
            return;
        }
        this.E.addLast(new b(a11, a10));
        this.M += a10;
    }

    private static void a(a.C0101a c0101a, SparseArray<c> sparseArray, int i10, byte[] bArr) {
        int size = c0101a.aX.size();
        for (int i11 = 0; i11 < size; i11++) {
            a.C0101a c0101a2 = c0101a.aX.get(i11);
            if (c0101a2.aU == com.anythink.expressad.exoplayer.e.a.a.Q) {
                b(c0101a2, sparseArray, i10, bArr);
            }
        }
    }

    private static void a(a.C0101a c0101a, c cVar, long j10, int i10) {
        List<a.b> list = c0101a.aW;
        int size = list.size();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            a.b bVar = list.get(i13);
            if (bVar.aU == com.anythink.expressad.exoplayer.e.a.a.E) {
                s sVar = bVar.aV;
                sVar.c(12);
                int m10 = sVar.m();
                if (m10 > 0) {
                    i12 += m10;
                    i11++;
                }
            }
        }
        cVar.f7832g = 0;
        cVar.f = 0;
        cVar.f7831e = 0;
        cVar.f7828b.a(i11, i12);
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            a.b bVar2 = list.get(i16);
            if (bVar2.aU == com.anythink.expressad.exoplayer.e.a.a.E) {
                i15 = a(cVar, i14, j10, i10, bVar2.aV, i15);
                i14++;
            }
        }
    }

    private static void a(k kVar, s sVar, l lVar) {
        int i10;
        int i11 = kVar.f7904d;
        sVar.c(8);
        if ((com.anythink.expressad.exoplayer.e.a.a.b(sVar.i()) & 1) == 1) {
            sVar.d(8);
        }
        int d10 = sVar.d();
        int m10 = sVar.m();
        if (m10 == lVar.f) {
            if (d10 == 0) {
                boolean[] zArr = lVar.f7918n;
                i10 = 0;
                for (int i12 = 0; i12 < m10; i12++) {
                    int d11 = sVar.d();
                    i10 += d11;
                    zArr[i12] = d11 > i11;
                }
            } else {
                i10 = (d10 * m10) + 0;
                Arrays.fill(lVar.f7918n, 0, m10, d10 > i11);
            }
            lVar.a(i10);
            return;
        }
        StringBuilder n10 = a3.k.n("Length mismatch: ", m10, ", ");
        n10.append(lVar.f);
        throw new t(n10.toString());
    }

    private static void a(s sVar, l lVar) {
        sVar.c(8);
        int i10 = sVar.i();
        if ((com.anythink.expressad.exoplayer.e.a.a.b(i10) & 1) == 1) {
            sVar.d(8);
        }
        int m10 = sVar.m();
        if (m10 == 1) {
            lVar.f7909d += com.anythink.expressad.exoplayer.e.a.a.a(i10) == 0 ? sVar.h() : sVar.n();
            return;
        }
        throw new t("Unexpected saio entry count: ".concat(String.valueOf(m10)));
    }

    private static c a(s sVar, SparseArray<c> sparseArray) {
        sVar.c(8);
        int b10 = com.anythink.expressad.exoplayer.e.a.a.b(sVar.i());
        c b11 = b(sparseArray, sVar.i());
        if (b11 == null) {
            return null;
        }
        if ((b10 & 1) != 0) {
            long n10 = sVar.n();
            l lVar = b11.f7828b;
            lVar.f7908c = n10;
            lVar.f7909d = n10;
        }
        com.anythink.expressad.exoplayer.e.a.c cVar = b11.f7830d;
        b11.f7828b.f7906a = new com.anythink.expressad.exoplayer.e.a.c((b10 & 2) != 0 ? sVar.m() - 1 : cVar.f7795a, (b10 & 8) != 0 ? sVar.m() : cVar.f7796b, (b10 & 16) != 0 ? sVar.m() : cVar.f7797c, (b10 & 32) != 0 ? sVar.m() : cVar.f7798d);
        return b11;
    }

    private static int a(c cVar, int i10, long j10, int i11, s sVar, int i12) {
        int i13;
        boolean z10;
        int i14;
        boolean z11;
        int i15;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        sVar.c(8);
        int b10 = com.anythink.expressad.exoplayer.e.a.a.b(sVar.i());
        j jVar = cVar.f7829c;
        l lVar = cVar.f7828b;
        com.anythink.expressad.exoplayer.e.a.c cVar2 = lVar.f7906a;
        lVar.f7912h[i10] = sVar.m();
        long[] jArr = lVar.f7911g;
        long j11 = lVar.f7908c;
        jArr[i10] = j11;
        if ((b10 & 1) != 0) {
            jArr[i10] = j11 + sVar.i();
        }
        boolean z16 = (b10 & 4) != 0;
        int i16 = cVar2.f7798d;
        if (z16) {
            i16 = sVar.m();
        }
        boolean z17 = (b10 & 256) != 0;
        boolean z18 = (b10 & 512) != 0;
        boolean z19 = (b10 & 1024) != 0;
        boolean z20 = (b10 & 2048) != 0;
        long[] jArr2 = jVar.f7897j;
        long j12 = 0;
        if (jArr2 != null && jArr2.length == 1 && jArr2[0] == 0) {
            j12 = af.a(jVar.f7898k[0], 1000L, jVar.f7893e);
        }
        int[] iArr = lVar.f7913i;
        int[] iArr2 = lVar.f7914j;
        long[] jArr3 = lVar.f7915k;
        boolean[] zArr = lVar.f7916l;
        int i17 = i16;
        boolean z21 = jVar.f7892d == 2 && (i11 & 1) != 0;
        int i18 = i12 + lVar.f7912h[i10];
        long j13 = jVar.f7893e;
        long j14 = j12;
        long j15 = i10 > 0 ? lVar.f7922s : j10;
        int i19 = i12;
        while (i19 < i18) {
            if (z17) {
                i13 = sVar.m();
            } else {
                i13 = cVar2.f7796b;
            }
            if (z18) {
                z10 = z17;
                i14 = sVar.m();
            } else {
                z10 = z17;
                i14 = cVar2.f7797c;
            }
            if (i19 == 0 && z16) {
                z11 = z16;
                i15 = i17;
            } else if (z19) {
                z11 = z16;
                i15 = sVar.i();
            } else {
                z11 = z16;
                i15 = cVar2.f7798d;
            }
            if (z20) {
                z12 = z20;
                z13 = z18;
                z14 = z19;
                iArr2[i19] = (int) ((sVar.i() * 1000) / j13);
                z15 = false;
            } else {
                z12 = z20;
                z13 = z18;
                z14 = z19;
                z15 = false;
                iArr2[i19] = 0;
            }
            jArr3[i19] = af.a(j15, 1000L, j13) - j14;
            iArr[i19] = i14;
            zArr[i19] = (((i15 >> 16) & 1) != 0 || (z21 && i19 != 0)) ? z15 : true;
            i19++;
            j15 += i13;
            j13 = j13;
            z17 = z10;
            z16 = z11;
            z20 = z12;
            z18 = z13;
            z19 = z14;
        }
        lVar.f7922s = j15;
        return i18;
    }

    private static void a(s sVar, l lVar, byte[] bArr) {
        sVar.c(8);
        sVar.a(bArr, 0, 16);
        if (Arrays.equals(bArr, f7812l)) {
            a(sVar, 16, lVar);
        }
    }

    private static void a(s sVar, int i10, l lVar) {
        sVar.c(i10 + 8);
        int b10 = com.anythink.expressad.exoplayer.e.a.a.b(sVar.i());
        if ((b10 & 1) == 0) {
            boolean z10 = (b10 & 2) != 0;
            int m10 = sVar.m();
            if (m10 == lVar.f) {
                Arrays.fill(lVar.f7918n, 0, m10, z10);
                lVar.a(sVar.a());
                lVar.a(sVar);
                return;
            } else {
                StringBuilder n10 = a3.k.n("Length mismatch: ", m10, ", ");
                n10.append(lVar.f);
                throw new t(n10.toString());
            }
        }
        throw new t("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    private static void a(s sVar, s sVar2, String str, l lVar) {
        byte[] bArr;
        sVar.c(8);
        int i10 = sVar.i();
        int i11 = sVar.i();
        int i12 = f7811k;
        if (i11 != i12) {
            return;
        }
        if (com.anythink.expressad.exoplayer.e.a.a.a(i10) == 1) {
            sVar.d(4);
        }
        if (sVar.i() == 1) {
            sVar2.c(8);
            int i13 = sVar2.i();
            if (sVar2.i() != i12) {
                return;
            }
            int a10 = com.anythink.expressad.exoplayer.e.a.a.a(i13);
            if (a10 == 1) {
                if (sVar2.h() == 0) {
                    throw new t("Variable length description in sgpd found (unsupported)");
                }
            } else if (a10 >= 2) {
                sVar2.d(4);
            }
            if (sVar2.h() == 1) {
                sVar2.d(1);
                int d10 = sVar2.d();
                int i14 = (d10 & 240) >> 4;
                int i15 = d10 & 15;
                if (sVar2.d() == 1) {
                    int d11 = sVar2.d();
                    byte[] bArr2 = new byte[16];
                    sVar2.a(bArr2, 0, 16);
                    if (d11 == 0) {
                        int d12 = sVar2.d();
                        byte[] bArr3 = new byte[d12];
                        sVar2.a(bArr3, 0, d12);
                        bArr = bArr3;
                    } else {
                        bArr = null;
                    }
                    lVar.f7917m = true;
                    lVar.o = new k(true, str, d11, bArr2, i14, i15, bArr);
                    return;
                }
                return;
            }
            throw new t("Entry count in sgpd != 1 (unsupported).");
        }
        throw new t("Entry count in sbgp != 1 (unsupported).");
    }

    private static Pair<Long, com.anythink.expressad.exoplayer.e.a> a(s sVar, long j10) {
        long n10;
        long n11;
        sVar.c(8);
        int a10 = com.anythink.expressad.exoplayer.e.a.a.a(sVar.i());
        sVar.d(4);
        long h10 = sVar.h();
        if (a10 == 0) {
            n10 = sVar.h();
            n11 = sVar.h();
        } else {
            n10 = sVar.n();
            n11 = sVar.n();
        }
        long j11 = n10;
        long j12 = n11 + j10;
        long a11 = af.a(j11, 1000000L, h10);
        sVar.d(2);
        int e10 = sVar.e();
        int[] iArr = new int[e10];
        long[] jArr = new long[e10];
        long[] jArr2 = new long[e10];
        long[] jArr3 = new long[e10];
        long j13 = a11;
        int i10 = 0;
        long j14 = j11;
        while (i10 < e10) {
            int i11 = sVar.i();
            if ((i11 & Integer.MIN_VALUE) == 0) {
                long h11 = sVar.h();
                iArr[i10] = i11 & Integer.MAX_VALUE;
                jArr[i10] = j12;
                jArr3[i10] = j13;
                long j15 = j14 + h11;
                long[] jArr4 = jArr2;
                long[] jArr5 = jArr3;
                int i12 = e10;
                long a12 = af.a(j15, 1000000L, h10);
                jArr4[i10] = a12 - jArr5[i10];
                sVar.d(4);
                j12 += r1[i10];
                i10++;
                iArr = iArr;
                jArr3 = jArr5;
                jArr2 = jArr4;
                jArr = jArr;
                e10 = i12;
                j14 = j15;
                j13 = a12;
            } else {
                throw new t("Unhandled indirect reference");
            }
        }
        return Pair.create(Long.valueOf(a11), new com.anythink.expressad.exoplayer.e.a(iArr, jArr, jArr2, jArr3));
    }

    private static c a(SparseArray<c> sparseArray) {
        int size = sparseArray.size();
        c cVar = null;
        long j10 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            c valueAt = sparseArray.valueAt(i10);
            int i11 = valueAt.f7832g;
            l lVar = valueAt.f7828b;
            if (i11 != lVar.f7910e) {
                long j11 = lVar.f7911g[i11];
                if (j11 < j10) {
                    cVar = valueAt;
                    j10 = j11;
                }
            }
        }
        return cVar;
    }

    private static com.anythink.expressad.exoplayer.d.e a(List<a.b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            a.b bVar = list.get(i10);
            if (bVar.aU == com.anythink.expressad.exoplayer.e.a.a.Z) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = bVar.aV.f9123a;
                UUID a10 = h.a(bArr);
                if (a10 == null) {
                    Log.w(f7810j, "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new e.a(a10, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new com.anythink.expressad.exoplayer.d.e(arrayList);
    }

    private static boolean a(int i10) {
        return i10 == com.anythink.expressad.exoplayer.e.a.a.X || i10 == com.anythink.expressad.exoplayer.e.a.a.W || i10 == com.anythink.expressad.exoplayer.e.a.a.H || i10 == com.anythink.expressad.exoplayer.e.a.a.F || i10 == com.anythink.expressad.exoplayer.e.a.a.Y || i10 == com.anythink.expressad.exoplayer.e.a.a.B || i10 == com.anythink.expressad.exoplayer.e.a.a.C || i10 == com.anythink.expressad.exoplayer.e.a.a.T || i10 == com.anythink.expressad.exoplayer.e.a.a.D || i10 == com.anythink.expressad.exoplayer.e.a.a.E || i10 == com.anythink.expressad.exoplayer.e.a.a.Z || i10 == com.anythink.expressad.exoplayer.e.a.a.ah || i10 == com.anythink.expressad.exoplayer.e.a.a.ai || i10 == com.anythink.expressad.exoplayer.e.a.a.am || i10 == com.anythink.expressad.exoplayer.e.a.a.al || i10 == com.anythink.expressad.exoplayer.e.a.a.aj || i10 == com.anythink.expressad.exoplayer.e.a.a.ak || i10 == com.anythink.expressad.exoplayer.e.a.a.V || i10 == com.anythink.expressad.exoplayer.e.a.a.S || i10 == com.anythink.expressad.exoplayer.e.a.a.aL;
    }
}
