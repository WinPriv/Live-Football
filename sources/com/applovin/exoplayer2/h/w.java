package com.applovin.exoplayer2.h;

import android.os.Looper;
import com.applovin.exoplayer2.d.f;
import com.applovin.exoplayer2.d.g;
import com.applovin.exoplayer2.d.h;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.l.ai;
import java.io.IOException;

/* loaded from: classes.dex */
public class w implements com.applovin.exoplayer2.e.x {
    private boolean A;
    private com.applovin.exoplayer2.v B;
    private com.applovin.exoplayer2.v C;
    private int D;
    private boolean E;
    private boolean F;
    private long G;
    private boolean H;

    /* renamed from: a */
    private final v f15472a;

    /* renamed from: d */
    private final com.applovin.exoplayer2.d.h f15475d;

    /* renamed from: e */
    private final g.a f15476e;
    private final Looper f;

    /* renamed from: g */
    private c f15477g;

    /* renamed from: h */
    private com.applovin.exoplayer2.v f15478h;

    /* renamed from: i */
    private com.applovin.exoplayer2.d.f f15479i;

    /* renamed from: q */
    private int f15486q;

    /* renamed from: r */
    private int f15487r;

    /* renamed from: s */
    private int f15488s;

    /* renamed from: t */
    private int f15489t;

    /* renamed from: x */
    private boolean f15493x;

    /* renamed from: b */
    private final a f15473b = new a();

    /* renamed from: j */
    private int f15480j = 1000;

    /* renamed from: k */
    private int[] f15481k = new int[1000];

    /* renamed from: l */
    private long[] f15482l = new long[1000];
    private long[] o = new long[1000];

    /* renamed from: n */
    private int[] f15484n = new int[1000];

    /* renamed from: m */
    private int[] f15483m = new int[1000];

    /* renamed from: p */
    private x.a[] f15485p = new x.a[1000];

    /* renamed from: c */
    private final ab<b> f15474c = new ab<>(new l0());

    /* renamed from: u */
    private long f15490u = Long.MIN_VALUE;

    /* renamed from: v */
    private long f15491v = Long.MIN_VALUE;

    /* renamed from: w */
    private long f15492w = Long.MIN_VALUE;

    /* renamed from: z */
    private boolean f15494z = true;
    private boolean y = true;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public int f15495a;

        /* renamed from: b */
        public long f15496b;

        /* renamed from: c */
        public x.a f15497c;
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final com.applovin.exoplayer2.v f15498a;

        /* renamed from: b */
        public final h.a f15499b;

        public /* synthetic */ b(com.applovin.exoplayer2.v vVar, h.a aVar, AnonymousClass1 anonymousClass1) {
            this(vVar, aVar);
        }

        private b(com.applovin.exoplayer2.v vVar, h.a aVar) {
            this.f15498a = vVar;
            this.f15499b = aVar;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(com.applovin.exoplayer2.v vVar);
    }

    public w(com.applovin.exoplayer2.k.b bVar, Looper looper, com.applovin.exoplayer2.d.h hVar, g.a aVar) {
        this.f = looper;
        this.f15475d = hVar;
        this.f15476e = aVar;
        this.f15472a = new v(bVar);
    }

    public static w a(com.applovin.exoplayer2.k.b bVar, Looper looper, com.applovin.exoplayer2.d.h hVar, g.a aVar) {
        return new w(bVar, (Looper) com.applovin.exoplayer2.l.a.b(looper), (com.applovin.exoplayer2.d.h) com.applovin.exoplayer2.l.a.b(hVar), (g.a) com.applovin.exoplayer2.l.a.b(aVar));
    }

    private synchronized void l() {
        this.f15489t = 0;
        this.f15472a.b();
    }

    private synchronized long m() {
        int i10 = this.f15486q;
        if (i10 == 0) {
            return -1L;
        }
        return d(i10);
    }

    private void n() {
        com.applovin.exoplayer2.d.f fVar = this.f15479i;
        if (fVar != null) {
            fVar.b(this.f15476e);
            this.f15479i = null;
            this.f15478h = null;
        }
    }

    private boolean o() {
        if (this.f15489t != this.f15486q) {
            return true;
        }
        return false;
    }

    public final int c() {
        return this.f15487r + this.f15486q;
    }

    public void d() {
        k();
        n();
    }

    public void e() throws IOException {
        com.applovin.exoplayer2.d.f fVar = this.f15479i;
        if (fVar != null && fVar.c() == 1) {
            throw ((f.a) com.applovin.exoplayer2.l.a.b(this.f15479i.e()));
        }
    }

    public final int f() {
        return this.f15487r + this.f15489t;
    }

    public final synchronized com.applovin.exoplayer2.v g() {
        com.applovin.exoplayer2.v vVar;
        if (this.f15494z) {
            vVar = null;
        } else {
            vVar = this.C;
        }
        return vVar;
    }

    public final synchronized long h() {
        return this.f15492w;
    }

    public final synchronized long i() {
        return Math.max(this.f15491v, e(this.f15489t));
    }

    public final synchronized boolean j() {
        return this.f15493x;
    }

    public final void k() {
        this.f15472a.a(m());
    }

    private synchronized boolean c(com.applovin.exoplayer2.v vVar) {
        this.f15494z = false;
        if (ai.a(vVar, this.C)) {
            return false;
        }
        if (!this.f15474c.c() && this.f15474c.a().f15498a.equals(vVar)) {
            this.C = this.f15474c.a().f15498a;
        } else {
            this.C = vVar;
        }
        com.applovin.exoplayer2.v vVar2 = this.C;
        this.E = com.applovin.exoplayer2.l.u.a(vVar2.f16838l, vVar2.f16835i);
        this.F = false;
        return true;
    }

    private int f(int i10) {
        int i11 = this.f15488s + i10;
        int i12 = this.f15480j;
        return i11 < i12 ? i11 : i11 - i12;
    }

    public final void b() {
        a(false);
    }

    private long d(int i10) {
        this.f15491v = Math.max(this.f15491v, e(i10));
        this.f15486q -= i10;
        int i11 = this.f15487r + i10;
        this.f15487r = i11;
        int i12 = this.f15488s + i10;
        this.f15488s = i12;
        int i13 = this.f15480j;
        if (i12 >= i13) {
            this.f15488s = i12 - i13;
        }
        int i14 = this.f15489t - i10;
        this.f15489t = i14;
        if (i14 < 0) {
            this.f15489t = 0;
        }
        this.f15474c.b(i11);
        if (this.f15486q == 0) {
            int i15 = this.f15488s;
            if (i15 == 0) {
                i15 = this.f15480j;
            }
            return this.f15482l[i15 - 1] + this.f15483m[r6];
        }
        return this.f15482l[this.f15488s];
    }

    private long e(int i10) {
        long j10 = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int f = f(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = Math.max(j10, this.o[f]);
            if ((this.f15484n[f] & 1) != 0) {
                break;
            }
            f--;
            if (f == -1) {
                f = this.f15480j - 1;
            }
        }
        return j10;
    }

    public synchronized boolean b(boolean z10) {
        com.applovin.exoplayer2.v vVar;
        boolean z11 = true;
        if (!o()) {
            if (!z10 && !this.f15493x && ((vVar = this.C) == null || vVar == this.f15478h)) {
                z11 = false;
            }
            return z11;
        }
        if (this.f15474c.a(f()).f15498a != this.f15478h) {
            return true;
        }
        return c(f(this.f15489t));
    }

    public static /* synthetic */ void a(b bVar) {
        bVar.f15499b.release();
    }

    public void a() {
        a(true);
        n();
    }

    public void a(boolean z10) {
        this.f15472a.a();
        this.f15486q = 0;
        this.f15487r = 0;
        this.f15488s = 0;
        this.f15489t = 0;
        this.y = true;
        this.f15490u = Long.MIN_VALUE;
        this.f15491v = Long.MIN_VALUE;
        this.f15492w = Long.MIN_VALUE;
        this.f15493x = false;
        this.f15474c.b();
        if (z10) {
            this.B = null;
            this.C = null;
            this.f15494z = true;
        }
    }

    public final synchronized int b(long j10, boolean z10) {
        int f = f(this.f15489t);
        if (o() && j10 >= this.o[f]) {
            if (j10 > this.f15492w && z10) {
                return this.f15486q - this.f15489t;
            }
            int a10 = a(f, this.f15486q - this.f15489t, j10, true);
            if (a10 == -1) {
                return 0;
            }
            return a10;
        }
        return 0;
    }

    private boolean c(int i10) {
        com.applovin.exoplayer2.d.f fVar = this.f15479i;
        return fVar == null || fVar.c() == 4 || ((this.f15484n[i10] & 1073741824) == 0 && this.f15479i.d());
    }

    private int c(long j10) {
        int i10 = this.f15486q;
        int f = f(i10 - 1);
        while (i10 > this.f15489t && this.o[f] >= j10) {
            i10--;
            f--;
            if (f == -1) {
                f = this.f15480j - 1;
            }
        }
        return i10;
    }

    public com.applovin.exoplayer2.v b(com.applovin.exoplayer2.v vVar) {
        return (this.G == 0 || vVar.f16841p == Long.MAX_VALUE) ? vVar : vVar.a().a(vVar.f16841p + this.G).a();
    }

    private synchronized long b(long j10, boolean z10, boolean z11) {
        int i10;
        int i11 = this.f15486q;
        if (i11 != 0) {
            long[] jArr = this.o;
            int i12 = this.f15488s;
            if (j10 >= jArr[i12]) {
                if (z11 && (i10 = this.f15489t) != i11) {
                    i11 = i10 + 1;
                }
                int a10 = a(i12, i11, j10, z10);
                if (a10 == -1) {
                    return -1L;
                }
                return d(a10);
            }
        }
        return -1L;
    }

    public final void a(long j10) {
        this.f15490u = j10;
    }

    public int a(com.applovin.exoplayer2.w wVar, com.applovin.exoplayer2.c.g gVar, int i10, boolean z10) {
        int a10 = a(wVar, gVar, (i10 & 2) != 0, z10, this.f15473b);
        if (a10 == -4 && !gVar.c()) {
            boolean z11 = (i10 & 1) != 0;
            if ((i10 & 4) == 0) {
                if (z11) {
                    this.f15472a.b(gVar, this.f15473b);
                } else {
                    this.f15472a.a(gVar, this.f15473b);
                }
            }
            if (!z11) {
                this.f15489t++;
            }
        }
        return a10;
    }

    private synchronized boolean b(long j10) {
        if (this.f15486q == 0) {
            return j10 > this.f15491v;
        }
        if (i() >= j10) {
            return false;
        }
        b(this.f15487r + c(j10));
        return true;
    }

    public final synchronized boolean a(long j10, boolean z10) {
        l();
        int f = f(this.f15489t);
        if (o() && j10 >= this.o[f] && (j10 <= this.f15492w || z10)) {
            int a10 = a(f, this.f15486q - this.f15489t, j10, true);
            if (a10 == -1) {
                return false;
            }
            this.f15490u = j10;
            this.f15489t += a10;
            return true;
        }
        return false;
    }

    private long b(int i10) {
        int c10 = c() - i10;
        boolean z10 = false;
        com.applovin.exoplayer2.l.a.a(c10 >= 0 && c10 <= this.f15486q - this.f15489t);
        int i11 = this.f15486q - c10;
        this.f15486q = i11;
        this.f15492w = Math.max(this.f15491v, e(i11));
        if (c10 == 0 && this.f15493x) {
            z10 = true;
        }
        this.f15493x = z10;
        this.f15474c.c(i10);
        int i12 = this.f15486q;
        if (i12 == 0) {
            return 0L;
        }
        return this.f15482l[f(i12 - 1)] + this.f15483m[r9];
    }

    public final synchronized void a(int i10) {
        boolean z10;
        if (i10 >= 0) {
            try {
                if (this.f15489t + i10 <= this.f15486q) {
                    z10 = true;
                    com.applovin.exoplayer2.l.a.a(z10);
                    this.f15489t += i10;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z10 = false;
        com.applovin.exoplayer2.l.a.a(z10);
        this.f15489t += i10;
    }

    public final void a(long j10, boolean z10, boolean z11) {
        this.f15472a.a(b(j10, z10, z11));
    }

    public final void a(c cVar) {
        this.f15477g = cVar;
    }

    @Override // com.applovin.exoplayer2.e.x
    public final void a(com.applovin.exoplayer2.v vVar) {
        com.applovin.exoplayer2.v b10 = b(vVar);
        this.A = false;
        this.B = vVar;
        boolean c10 = c(b10);
        c cVar = this.f15477g;
        if (cVar == null || !c10) {
            return;
        }
        cVar.a(b10);
    }

    @Override // com.applovin.exoplayer2.e.x
    public final int a(com.applovin.exoplayer2.k.g gVar, int i10, boolean z10, int i11) throws IOException {
        return this.f15472a.a(gVar, i10, z10);
    }

    @Override // com.applovin.exoplayer2.e.x
    public final void a(com.applovin.exoplayer2.l.y yVar, int i10, int i11) {
        this.f15472a.a(yVar, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    @Override // com.applovin.exoplayer2.e.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(long r12, int r14, int r15, int r16, com.applovin.exoplayer2.e.x.a r17) {
        /*
            r11 = this;
            r8 = r11
            boolean r0 = r8.A
            if (r0 == 0) goto L10
            com.applovin.exoplayer2.v r0 = r8.B
            java.lang.Object r0 = com.applovin.exoplayer2.l.a.a(r0)
            com.applovin.exoplayer2.v r0 = (com.applovin.exoplayer2.v) r0
            r11.a(r0)
        L10:
            r0 = r14 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L18
            r3 = r2
            goto L19
        L18:
            r3 = r1
        L19:
            boolean r4 = r8.y
            if (r4 == 0) goto L22
            if (r3 != 0) goto L20
            return
        L20:
            r8.y = r1
        L22:
            long r4 = r8.G
            long r4 = r4 + r12
            boolean r6 = r8.E
            if (r6 == 0) goto L51
            long r6 = r8.f15490u
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 >= 0) goto L30
            return
        L30:
            if (r0 != 0) goto L51
            boolean r0 = r8.F
            if (r0 != 0) goto L4d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r6 = "Overriding unexpected non-sync sample for format: "
            r0.<init>(r6)
            com.applovin.exoplayer2.v r6 = r8.C
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = "SampleQueue"
            com.applovin.exoplayer2.l.q.c(r6, r0)
            r8.F = r2
        L4d:
            r0 = r14 | 1
            r6 = r0
            goto L52
        L51:
            r6 = r14
        L52:
            boolean r0 = r8.H
            if (r0 == 0) goto L63
            if (r3 == 0) goto L62
            boolean r0 = r11.b(r4)
            if (r0 != 0) goto L5f
            goto L62
        L5f:
            r8.H = r1
            goto L63
        L62:
            return
        L63:
            com.applovin.exoplayer2.h.v r0 = r8.f15472a
            long r0 = r0.c()
            r7 = r15
            long r2 = (long) r7
            long r0 = r0 - r2
            r2 = r16
            long r2 = (long) r2
            long r9 = r0 - r2
            r0 = r11
            r1 = r4
            r3 = r6
            r4 = r9
            r6 = r15
            r7 = r17
            r0.a(r1, r3, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.h.w.a(long, int, int, int, com.applovin.exoplayer2.e.x$a):void");
    }

    private synchronized int a(com.applovin.exoplayer2.w wVar, com.applovin.exoplayer2.c.g gVar, boolean z10, boolean z11, a aVar) {
        gVar.f13646c = false;
        if (!o()) {
            if (!z11 && !this.f15493x) {
                com.applovin.exoplayer2.v vVar = this.C;
                if (vVar == null || (!z10 && vVar == this.f15478h)) {
                    return -3;
                }
                a((com.applovin.exoplayer2.v) com.applovin.exoplayer2.l.a.b(vVar), wVar);
                return -5;
            }
            gVar.a_(4);
            return -4;
        }
        com.applovin.exoplayer2.v vVar2 = this.f15474c.a(f()).f15498a;
        if (!z10 && vVar2 == this.f15478h) {
            int f = f(this.f15489t);
            if (!c(f)) {
                gVar.f13646c = true;
                return -3;
            }
            gVar.a_(this.f15484n[f]);
            long j10 = this.o[f];
            gVar.f13647d = j10;
            if (j10 < this.f15490u) {
                gVar.b(Integer.MIN_VALUE);
            }
            aVar.f15495a = this.f15483m[f];
            aVar.f15496b = this.f15482l[f];
            aVar.f15497c = this.f15485p[f];
            return -4;
        }
        a(vVar2, wVar);
        return -5;
    }

    private synchronized void a(long j10, int i10, long j11, int i11, x.a aVar) {
        h.a aVar2;
        int i12 = this.f15486q;
        if (i12 > 0) {
            int f = f(i12 - 1);
            com.applovin.exoplayer2.l.a.a(this.f15482l[f] + ((long) this.f15483m[f]) <= j11);
        }
        this.f15493x = (536870912 & i10) != 0;
        this.f15492w = Math.max(this.f15492w, j10);
        int f10 = f(this.f15486q);
        this.o[f10] = j10;
        this.f15482l[f10] = j11;
        this.f15483m[f10] = i11;
        this.f15484n[f10] = i10;
        this.f15485p[f10] = aVar;
        this.f15481k[f10] = this.D;
        if (this.f15474c.c() || !this.f15474c.a().f15498a.equals(this.C)) {
            com.applovin.exoplayer2.d.h hVar = this.f15475d;
            if (hVar != null) {
                aVar2 = hVar.a((Looper) com.applovin.exoplayer2.l.a.b(this.f), this.f15476e, this.C);
            } else {
                aVar2 = h.a.f14037b;
            }
            this.f15474c.a(c(), new b((com.applovin.exoplayer2.v) com.applovin.exoplayer2.l.a.b(this.C), aVar2));
        }
        int i13 = this.f15486q + 1;
        this.f15486q = i13;
        int i14 = this.f15480j;
        if (i13 == i14) {
            int i15 = i14 + 1000;
            int[] iArr = new int[i15];
            long[] jArr = new long[i15];
            long[] jArr2 = new long[i15];
            int[] iArr2 = new int[i15];
            int[] iArr3 = new int[i15];
            x.a[] aVarArr = new x.a[i15];
            int i16 = this.f15488s;
            int i17 = i14 - i16;
            System.arraycopy(this.f15482l, i16, jArr, 0, i17);
            System.arraycopy(this.o, this.f15488s, jArr2, 0, i17);
            System.arraycopy(this.f15484n, this.f15488s, iArr2, 0, i17);
            System.arraycopy(this.f15483m, this.f15488s, iArr3, 0, i17);
            System.arraycopy(this.f15485p, this.f15488s, aVarArr, 0, i17);
            System.arraycopy(this.f15481k, this.f15488s, iArr, 0, i17);
            int i18 = this.f15488s;
            System.arraycopy(this.f15482l, 0, jArr, i17, i18);
            System.arraycopy(this.o, 0, jArr2, i17, i18);
            System.arraycopy(this.f15484n, 0, iArr2, i17, i18);
            System.arraycopy(this.f15483m, 0, iArr3, i17, i18);
            System.arraycopy(this.f15485p, 0, aVarArr, i17, i18);
            System.arraycopy(this.f15481k, 0, iArr, i17, i18);
            this.f15482l = jArr;
            this.o = jArr2;
            this.f15484n = iArr2;
            this.f15483m = iArr3;
            this.f15485p = aVarArr;
            this.f15481k = iArr;
            this.f15488s = 0;
            this.f15480j = i15;
        }
    }

    private void a(com.applovin.exoplayer2.v vVar, com.applovin.exoplayer2.w wVar) {
        com.applovin.exoplayer2.v vVar2 = this.f15478h;
        boolean z10 = vVar2 == null;
        com.applovin.exoplayer2.d.e eVar = z10 ? null : vVar2.o;
        this.f15478h = vVar;
        com.applovin.exoplayer2.d.e eVar2 = vVar.o;
        com.applovin.exoplayer2.d.h hVar = this.f15475d;
        wVar.f16876b = hVar != null ? vVar.a(hVar.a(vVar)) : vVar;
        wVar.f16875a = this.f15479i;
        if (this.f15475d == null) {
            return;
        }
        if (z10 || !ai.a(eVar, eVar2)) {
            com.applovin.exoplayer2.d.f fVar = this.f15479i;
            com.applovin.exoplayer2.d.f b10 = this.f15475d.b((Looper) com.applovin.exoplayer2.l.a.b(this.f), this.f15476e, vVar);
            this.f15479i = b10;
            wVar.f16875a = b10;
            if (fVar != null) {
                fVar.b(this.f15476e);
            }
        }
    }

    private int a(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = this.o[i10];
            if (j11 > j10) {
                return i12;
            }
            if (!z10 || (this.f15484n[i10] & 1) != 0) {
                if (j11 == j10) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.f15480j) {
                i10 = 0;
            }
        }
        return i12;
    }
}
