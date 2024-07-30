package com.applovin.exoplayer2.e.f;

import com.applovin.exoplayer2.b.r;
import com.applovin.exoplayer2.b0;
import com.applovin.exoplayer2.e.f.e;
import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.l;
import com.applovin.exoplayer2.e.s;
import com.applovin.exoplayer2.e.u;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.g.a;
import com.applovin.exoplayer2.g.e.g;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.v;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes.dex */
public final class d implements com.applovin.exoplayer2.e.h {

    /* renamed from: a */
    public static final l f14294a = new h(0);

    /* renamed from: b */
    private static final g.a f14295b = new b0(4);

    /* renamed from: c */
    private final int f14296c;

    /* renamed from: d */
    private final long f14297d;

    /* renamed from: e */
    private final y f14298e;
    private final r.a f;

    /* renamed from: g */
    private final com.applovin.exoplayer2.e.r f14299g;

    /* renamed from: h */
    private final s f14300h;

    /* renamed from: i */
    private final x f14301i;

    /* renamed from: j */
    private j f14302j;

    /* renamed from: k */
    private x f14303k;

    /* renamed from: l */
    private x f14304l;

    /* renamed from: m */
    private int f14305m;

    /* renamed from: n */
    private com.applovin.exoplayer2.g.a f14306n;
    private long o;

    /* renamed from: p */
    private long f14307p;

    /* renamed from: q */
    private long f14308q;

    /* renamed from: r */
    private int f14309r;

    /* renamed from: s */
    private e f14310s;

    /* renamed from: t */
    private boolean f14311t;

    /* renamed from: u */
    private boolean f14312u;

    /* renamed from: v */
    private long f14313v;

    public d() {
        this(0);
    }

    public static /* synthetic */ boolean a(int i10, int i11, int i12, int i13, int i14) {
        return (i11 == 67 && i12 == 79 && i13 == 77 && (i14 == 77 || i10 == 2)) || (i11 == 77 && i12 == 76 && i13 == 76 && (i14 == 84 || i10 == 2));
    }

    private int b(i iVar) throws IOException {
        if (this.f14305m == 0) {
            try {
                a(iVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f14310s == null) {
            e e10 = e(iVar);
            this.f14310s = e10;
            this.f14302j.a(e10);
            this.f14304l.a(new v.a().f(this.f.f13515b).f(4096).k(this.f.f13518e).l(this.f.f13517d).n(this.f14299g.f14930a).o(this.f14299g.f14931b).a((this.f14296c & 8) != 0 ? null : this.f14306n).a());
            this.f14308q = iVar.c();
        } else if (this.f14308q != 0) {
            long c10 = iVar.c();
            long j10 = this.f14308q;
            if (c10 < j10) {
                iVar.b((int) (j10 - c10));
            }
        }
        return c(iVar);
    }

    public static /* synthetic */ com.applovin.exoplayer2.e.h[] d() {
        return new com.applovin.exoplayer2.e.h[]{new d()};
    }

    @Override // com.applovin.exoplayer2.e.h
    public void c() {
    }

    public d(int i10) {
        this(i10, com.anythink.expressad.exoplayer.b.f7291b);
    }

    private static boolean a(int i10, long j10) {
        return ((long) (i10 & (-128000))) == (j10 & (-128000));
    }

    private int c(i iVar) throws IOException {
        if (this.f14309r == 0) {
            iVar.a();
            if (d(iVar)) {
                return -1;
            }
            this.f14298e.d(0);
            int q10 = this.f14298e.q();
            if (a(q10, this.f14305m) && r.a(q10) != -1) {
                this.f.a(q10);
                if (this.o == com.anythink.expressad.exoplayer.b.f7291b) {
                    this.o = this.f14310s.c(iVar.c());
                    if (this.f14297d != com.anythink.expressad.exoplayer.b.f7291b) {
                        this.o = (this.f14297d - this.f14310s.c(0L)) + this.o;
                    }
                }
                this.f14309r = this.f.f13516c;
                e eVar = this.f14310s;
                if (eVar instanceof b) {
                    b bVar = (b) eVar;
                    bVar.a(a(this.f14307p + r0.f13519g), iVar.c() + this.f.f13516c);
                    if (this.f14312u && bVar.b(this.f14313v)) {
                        this.f14312u = false;
                        this.f14304l = this.f14303k;
                    }
                }
            } else {
                iVar.b(1);
                this.f14305m = 0;
                return 0;
            }
        }
        int a10 = this.f14304l.a((com.applovin.exoplayer2.k.g) iVar, this.f14309r, true);
        if (a10 == -1) {
            return -1;
        }
        int i10 = this.f14309r - a10;
        this.f14309r = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f14304l.a(a(this.f14307p), 1, this.f.f13516c, 0, null);
        this.f14307p += this.f.f13519g;
        this.f14309r = 0;
        return 0;
    }

    private boolean d(i iVar) throws IOException {
        e eVar = this.f14310s;
        if (eVar != null) {
            long c10 = eVar.c();
            if (c10 != -1 && iVar.b() > c10 - 4) {
                return true;
            }
        }
        try {
            return !iVar.b(this.f14298e.d(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private e e(i iVar) throws IOException {
        long a10;
        long j10;
        e f = f(iVar);
        c a11 = a(this.f14306n, iVar.c());
        if (this.f14311t) {
            return new e.a();
        }
        if ((this.f14296c & 4) != 0) {
            if (a11 != null) {
                a10 = a11.b();
                j10 = a11.c();
            } else if (f != null) {
                a10 = f.b();
                j10 = f.c();
            } else {
                a10 = a(this.f14306n);
                j10 = -1;
            }
            f = new b(a10, iVar.c(), j10);
        } else if (a11 != null) {
            f = a11;
        } else if (f == null) {
            f = null;
        }
        if (f == null || !(f.a() || (this.f14296c & 1) == 0)) {
            return b(iVar, (this.f14296c & 2) != 0);
        }
        return f;
    }

    private e f(i iVar) throws IOException {
        y yVar = new y(this.f.f13516c);
        iVar.d(yVar.d(), 0, this.f.f13516c);
        r.a aVar = this.f;
        int i10 = 21;
        if ((aVar.f13514a & 1) != 0) {
            if (aVar.f13518e != 1) {
                i10 = 36;
            }
        } else if (aVar.f13518e == 1) {
            i10 = 13;
        }
        int i11 = i10;
        int a10 = a(yVar, i11);
        if (a10 != 1483304551 && a10 != 1231971951) {
            if (a10 == 1447187017) {
                f a11 = f.a(iVar.d(), iVar.c(), this.f, yVar);
                iVar.b(this.f.f13516c);
                return a11;
            }
            iVar.a();
            return null;
        }
        g a12 = g.a(iVar.d(), iVar.c(), this.f, yVar);
        if (a12 != null && !this.f14299g.a()) {
            iVar.a();
            iVar.c(i11 + 141);
            iVar.d(this.f14298e.d(), 0, 3);
            this.f14298e.d(0);
            this.f14299g.a(this.f14298e.m());
        }
        iVar.b(this.f.f13516c);
        return (a12 == null || a12.a() || a10 != 1231971951) ? a12 : b(iVar, false);
    }

    public d(int i10, long j10) {
        this.f14296c = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f14297d = j10;
        this.f14298e = new y(10);
        this.f = new r.a();
        this.f14299g = new com.applovin.exoplayer2.e.r();
        this.o = com.anythink.expressad.exoplayer.b.f7291b;
        this.f14300h = new s();
        com.applovin.exoplayer2.e.g gVar = new com.applovin.exoplayer2.e.g();
        this.f14301i = gVar;
        this.f14304l = gVar;
    }

    @Override // com.applovin.exoplayer2.e.h
    public boolean a(i iVar) throws IOException {
        return a(iVar, true);
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(j jVar) {
        this.f14302j = jVar;
        x a10 = jVar.a(0, 1);
        this.f14303k = a10;
        this.f14304l = a10;
        this.f14302j.a();
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(long j10, long j11) {
        this.f14305m = 0;
        this.o = com.anythink.expressad.exoplayer.b.f7291b;
        this.f14307p = 0L;
        this.f14309r = 0;
        this.f14313v = j11;
        e eVar = this.f14310s;
        if (!(eVar instanceof b) || ((b) eVar).b(j11)) {
            return;
        }
        this.f14312u = true;
        this.f14304l = this.f14301i;
    }

    @Override // com.applovin.exoplayer2.e.h
    public int a(i iVar, u uVar) throws IOException {
        b();
        int b10 = b(iVar);
        if (b10 == -1 && (this.f14310s instanceof b)) {
            long a10 = a(this.f14307p);
            if (this.f14310s.b() != a10) {
                ((b) this.f14310s).d(a10);
                this.f14302j.a(this.f14310s);
            }
        }
        return b10;
    }

    private e b(i iVar, boolean z10) throws IOException {
        iVar.d(this.f14298e.d(), 0, 4);
        this.f14298e.d(0);
        this.f.a(this.f14298e.q());
        return new a(iVar.d(), iVar.c(), this.f, z10);
    }

    public void a() {
        this.f14311t = true;
    }

    private long a(long j10) {
        return ((j10 * 1000000) / this.f.f13517d) + this.o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x009e, code lost:
    
        if (r13 == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a0, code lost:
    
        r12.b(r1 + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a8, code lost:
    
        r11.f14305m = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00aa, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a5, code lost:
    
        r12.a();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(com.applovin.exoplayer2.e.i r12, boolean r13) throws java.io.IOException {
        /*
            r11 = this;
            if (r13 == 0) goto L6
            r0 = 32768(0x8000, float:4.5918E-41)
            goto L8
        L6:
            r0 = 131072(0x20000, float:1.83671E-40)
        L8:
            r12.a()
            long r1 = r12.c()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L42
            int r1 = r11.f14296c
            r1 = r1 & 8
            if (r1 != 0) goto L20
            r1 = r3
            goto L21
        L20:
            r1 = r4
        L21:
            if (r1 == 0) goto L25
            r1 = r2
            goto L27
        L25:
            com.applovin.exoplayer2.g.e.g$a r1 = com.applovin.exoplayer2.e.f.d.f14295b
        L27:
            com.applovin.exoplayer2.e.s r5 = r11.f14300h
            com.applovin.exoplayer2.g.a r1 = r5.a(r12, r1)
            r11.f14306n = r1
            if (r1 == 0) goto L36
            com.applovin.exoplayer2.e.r r5 = r11.f14299g
            r5.a(r1)
        L36:
            long r5 = r12.b()
            int r1 = (int) r5
            if (r13 != 0) goto L40
            r12.b(r1)
        L40:
            r5 = r4
            goto L44
        L42:
            r1 = r4
            r5 = r1
        L44:
            r6 = r5
            r7 = r6
        L46:
            boolean r8 = r11.d(r12)
            if (r8 == 0) goto L55
            if (r6 <= 0) goto L4f
            goto L9e
        L4f:
            java.io.EOFException r12 = new java.io.EOFException
            r12.<init>()
            throw r12
        L55:
            com.applovin.exoplayer2.l.y r8 = r11.f14298e
            r8.d(r4)
            com.applovin.exoplayer2.l.y r8 = r11.f14298e
            int r8 = r8.q()
            if (r5 == 0) goto L69
            long r9 = (long) r5
            boolean r9 = a(r8, r9)
            if (r9 == 0) goto L70
        L69:
            int r9 = com.applovin.exoplayer2.b.r.a(r8)
            r10 = -1
            if (r9 != r10) goto L90
        L70:
            int r5 = r7 + 1
            if (r7 != r0) goto L7e
            if (r13 == 0) goto L77
            return r4
        L77:
            java.lang.String r12 = "Searched too many bytes."
            com.applovin.exoplayer2.ai r12 = com.applovin.exoplayer2.ai.b(r12, r2)
            throw r12
        L7e:
            if (r13 == 0) goto L89
            r12.a()
            int r6 = r1 + r5
            r12.c(r6)
            goto L8c
        L89:
            r12.b(r3)
        L8c:
            r6 = r4
            r7 = r5
            r5 = r6
            goto L46
        L90:
            int r6 = r6 + 1
            if (r6 != r3) goto L9b
            com.applovin.exoplayer2.b.r$a r5 = r11.f
            r5.a(r8)
            r5 = r8
            goto Lab
        L9b:
            r8 = 4
            if (r6 != r8) goto Lab
        L9e:
            if (r13 == 0) goto La5
            int r1 = r1 + r7
            r12.b(r1)
            goto La8
        La5:
            r12.a()
        La8:
            r11.f14305m = r5
            return r3
        Lab:
            int r9 = r9 + (-4)
            r12.c(r9)
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.f.d.a(com.applovin.exoplayer2.e.i, boolean):boolean");
    }

    private void b() {
        com.applovin.exoplayer2.l.a.a(this.f14303k);
        ai.a(this.f14302j);
    }

    private static int a(y yVar, int i10) {
        if (yVar.b() >= i10 + 4) {
            yVar.d(i10);
            int q10 = yVar.q();
            if (q10 == 1483304551 || q10 == 1231971951) {
                return q10;
            }
        }
        if (yVar.b() < 40) {
            return 0;
        }
        yVar.d(36);
        return yVar.q() == 1447187017 ? 1447187017 : 0;
    }

    private static c a(com.applovin.exoplayer2.g.a aVar, long j10) {
        if (aVar == null) {
            return null;
        }
        int a10 = aVar.a();
        for (int i10 = 0; i10 < a10; i10++) {
            a.InterfaceC0172a a11 = aVar.a(i10);
            if (a11 instanceof com.applovin.exoplayer2.g.e.j) {
                return c.a(j10, (com.applovin.exoplayer2.g.e.j) a11, a(aVar));
            }
        }
        return null;
    }

    private static long a(com.applovin.exoplayer2.g.a aVar) {
        if (aVar == null) {
            return com.anythink.expressad.exoplayer.b.f7291b;
        }
        int a10 = aVar.a();
        for (int i10 = 0; i10 < a10; i10++) {
            a.InterfaceC0172a a11 = aVar.a(i10);
            if (a11 instanceof com.applovin.exoplayer2.g.e.l) {
                com.applovin.exoplayer2.g.e.l lVar = (com.applovin.exoplayer2.g.e.l) a11;
                if (lVar.f.equals("TLEN")) {
                    return com.applovin.exoplayer2.h.b(Long.parseLong(lVar.f15173b));
                }
            }
        }
        return com.anythink.expressad.exoplayer.b.f7291b;
    }
}
