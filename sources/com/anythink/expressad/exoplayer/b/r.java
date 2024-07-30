package com.anythink.expressad.exoplayer.b;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.anythink.expressad.exoplayer.b.g;
import com.anythink.expressad.exoplayer.b.h;
import com.anythink.expressad.exoplayer.k.ad;
import com.anythink.expressad.exoplayer.k.af;
import com.anythink.expressad.exoplayer.v;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* loaded from: classes.dex */
public abstract class r extends com.anythink.expressad.exoplayer.a implements com.anythink.expressad.exoplayer.k.n {

    /* renamed from: n, reason: collision with root package name */
    private static final int f7508n = 0;
    private static final int o = 1;

    /* renamed from: p, reason: collision with root package name */
    private static final int f7509p = 2;
    private com.anythink.expressad.exoplayer.c.g<com.anythink.expressad.exoplayer.c.e, ? extends com.anythink.expressad.exoplayer.c.h, ? extends e> A;
    private com.anythink.expressad.exoplayer.c.e B;
    private com.anythink.expressad.exoplayer.c.h C;
    private com.anythink.expressad.exoplayer.d.f<com.anythink.expressad.exoplayer.d.i> D;
    private com.anythink.expressad.exoplayer.d.f<com.anythink.expressad.exoplayer.d.i> E;
    private int F;
    private boolean G;
    private boolean H;
    private long I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private boolean N;

    /* renamed from: q, reason: collision with root package name */
    private final com.anythink.expressad.exoplayer.d.g<com.anythink.expressad.exoplayer.d.i> f7510q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f7511r;

    /* renamed from: s, reason: collision with root package name */
    private final g.a f7512s;

    /* renamed from: t, reason: collision with root package name */
    private final h f7513t;

    /* renamed from: u, reason: collision with root package name */
    private final com.anythink.expressad.exoplayer.n f7514u;

    /* renamed from: v, reason: collision with root package name */
    private final com.anythink.expressad.exoplayer.c.e f7515v;

    /* renamed from: w, reason: collision with root package name */
    private com.anythink.expressad.exoplayer.c.d f7516w;

    /* renamed from: x, reason: collision with root package name */
    private com.anythink.expressad.exoplayer.m f7517x;
    private int y;

    /* renamed from: z, reason: collision with root package name */
    private int f7518z;

    /* loaded from: classes.dex */
    public final class a implements h.c {
        private a() {
        }

        @Override // com.anythink.expressad.exoplayer.b.h.c
        public final void a(int i10) {
            r.this.f7512s.a(i10);
        }

        public /* synthetic */ a(r rVar, byte b10) {
            this();
        }

        @Override // com.anythink.expressad.exoplayer.b.h.c
        public final void a() {
            r.b(r.this);
        }

        @Override // com.anythink.expressad.exoplayer.b.h.c
        public final void a(int i10, long j10, long j11) {
            r.this.f7512s.a(i10, j10, j11);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface b {
    }

    public r() {
        this((Handler) null, (g) null, new f[0]);
    }

    private com.anythink.expressad.exoplayer.m B() {
        com.anythink.expressad.exoplayer.m mVar = this.f7517x;
        return com.anythink.expressad.exoplayer.m.a((String) null, com.anythink.expressad.exoplayer.k.o.f9088w, (String) null, -1, mVar.f9269u, mVar.f9270v, 2, (List<byte[]>) null, (com.anythink.expressad.exoplayer.d.e) null, (String) null);
    }

    private boolean C() {
        if (this.C == null) {
            com.anythink.expressad.exoplayer.c.h c10 = this.A.c();
            this.C = c10;
            if (c10 == null) {
                return false;
            }
            this.f7516w.f += c10.f7597b;
        }
        if (this.C.c()) {
            if (this.F == 2) {
                H();
                G();
                this.H = true;
            } else {
                this.C.e();
                this.C = null;
                E();
            }
            return false;
        }
        if (this.H) {
            com.anythink.expressad.exoplayer.m mVar = this.f7517x;
            com.anythink.expressad.exoplayer.m a10 = com.anythink.expressad.exoplayer.m.a((String) null, com.anythink.expressad.exoplayer.k.o.f9088w, (String) null, -1, mVar.f9269u, mVar.f9270v, 2, (List<byte[]>) null, (com.anythink.expressad.exoplayer.d.e) null, (String) null);
            this.f7513t.a(a10.f9271w, a10.f9269u, a10.f9270v, null, this.y, this.f7518z);
            this.H = false;
        }
        h hVar = this.f7513t;
        com.anythink.expressad.exoplayer.c.h hVar2 = this.C;
        if (!hVar.a(hVar2.f7611c, ((com.anythink.expressad.exoplayer.c.f) hVar2).f7596a)) {
            return false;
        }
        this.f7516w.f7586e++;
        this.C.e();
        this.C = null;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean D() {
        /*
            Method dump skipped, instructions count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.b.r.D():boolean");
    }

    private void E() {
        this.M = true;
        try {
            this.f7513t.c();
        } catch (h.d e10) {
            throw com.anythink.expressad.exoplayer.g.a(e10, s());
        }
    }

    private void F() {
        this.N = false;
        if (this.F != 0) {
            H();
            G();
            return;
        }
        this.B = null;
        com.anythink.expressad.exoplayer.c.h hVar = this.C;
        if (hVar != null) {
            hVar.e();
            this.C = null;
        }
        this.A.d();
        this.G = false;
    }

    private void G() {
        if (this.A != null) {
            return;
        }
        com.anythink.expressad.exoplayer.d.f<com.anythink.expressad.exoplayer.d.i> fVar = this.E;
        this.D = fVar;
        if (fVar != null && fVar.g() == null && this.D.f() == null) {
            return;
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ad.a("createAudioDecoder");
            this.A = x();
            ad.a();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            this.f7512s.a(this.A.a(), elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
            this.f7516w.f7582a++;
        } catch (e e10) {
            throw com.anythink.expressad.exoplayer.g.a(e10, s());
        }
    }

    private void H() {
        com.anythink.expressad.exoplayer.c.g<com.anythink.expressad.exoplayer.c.e, ? extends com.anythink.expressad.exoplayer.c.h, ? extends e> gVar = this.A;
        if (gVar == null) {
            return;
        }
        this.B = null;
        this.C = null;
        gVar.e();
        this.A = null;
        this.f7516w.f7583b++;
        this.F = 0;
        this.G = false;
    }

    private void I() {
        long a10 = this.f7513t.a(v());
        if (a10 != Long.MIN_VALUE) {
            if (!this.K) {
                a10 = Math.max(this.I, a10);
            }
            this.I = a10;
            this.K = false;
        }
    }

    public static /* synthetic */ boolean b(r rVar) {
        rVar.K = true;
        return true;
    }

    @Override // com.anythink.expressad.exoplayer.k.n
    public final long d() {
        if (a_() == 2) {
            I();
        }
        return this.I;
    }

    @Override // com.anythink.expressad.exoplayer.k.n
    public final v e() {
        return this.f7513t.f();
    }

    @Override // com.anythink.expressad.exoplayer.a
    public final void n() {
        this.f7513t.a();
    }

    @Override // com.anythink.expressad.exoplayer.a
    public final void o() {
        I();
        this.f7513t.h();
    }

    @Override // com.anythink.expressad.exoplayer.a
    public final void p() {
        this.f7517x = null;
        this.H = true;
        this.N = false;
        try {
            H();
            this.f7513t.j();
            try {
                com.anythink.expressad.exoplayer.d.f<com.anythink.expressad.exoplayer.d.i> fVar = this.D;
                if (fVar != null) {
                    this.f7510q.a(fVar);
                }
                try {
                    com.anythink.expressad.exoplayer.d.f<com.anythink.expressad.exoplayer.d.i> fVar2 = this.E;
                    if (fVar2 != null && fVar2 != this.D) {
                        this.f7510q.a(fVar2);
                    }
                } finally {
                }
            } catch (Throwable th) {
                try {
                    com.anythink.expressad.exoplayer.d.f<com.anythink.expressad.exoplayer.d.i> fVar3 = this.E;
                    if (fVar3 != null && fVar3 != this.D) {
                        this.f7510q.a(fVar3);
                    }
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th2) {
            try {
                com.anythink.expressad.exoplayer.d.f<com.anythink.expressad.exoplayer.d.i> fVar4 = this.D;
                if (fVar4 != null) {
                    this.f7510q.a(fVar4);
                }
                try {
                    com.anythink.expressad.exoplayer.d.f<com.anythink.expressad.exoplayer.d.i> fVar5 = this.E;
                    if (fVar5 != null && fVar5 != this.D) {
                        this.f7510q.a(fVar5);
                    }
                    throw th2;
                } finally {
                }
            } catch (Throwable th3) {
                try {
                    com.anythink.expressad.exoplayer.d.f<com.anythink.expressad.exoplayer.d.i> fVar6 = this.E;
                    if (fVar6 != null && fVar6 != this.D) {
                        this.f7510q.a(fVar6);
                    }
                    throw th3;
                } finally {
                }
            }
        }
    }

    @Override // com.anythink.expressad.exoplayer.y
    public final boolean u() {
        if (!this.f7513t.e()) {
            if (this.f7517x != null && !this.N) {
                if (!t() && this.C == null) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // com.anythink.expressad.exoplayer.y
    public final boolean v() {
        if (this.M && this.f7513t.d()) {
            return true;
        }
        return false;
    }

    public abstract int w();

    public abstract com.anythink.expressad.exoplayer.c.g<com.anythink.expressad.exoplayer.c.e, ? extends com.anythink.expressad.exoplayer.c.h, ? extends e> x();

    private r(Handler handler, g gVar, f... fVarArr) {
        this(handler, gVar, null, null, fVarArr);
    }

    private boolean b(int i10) {
        return this.f7513t.a(i10);
    }

    @Override // com.anythink.expressad.exoplayer.z
    public final int a(com.anythink.expressad.exoplayer.m mVar) {
        int w10 = w();
        if (w10 <= 2) {
            return w10;
        }
        return w10 | (af.f8993a >= 21 ? 32 : 0) | 8;
    }

    private r(Handler handler, g gVar, c cVar) {
        this(handler, gVar, cVar, null, new f[0]);
    }

    private boolean b(boolean z10) {
        com.anythink.expressad.exoplayer.d.f<com.anythink.expressad.exoplayer.d.i> fVar = this.D;
        if (fVar == null || (!z10 && this.f7511r)) {
            return false;
        }
        int e10 = fVar.e();
        if (e10 != 1) {
            return e10 != 4;
        }
        throw com.anythink.expressad.exoplayer.g.a(this.D.f(), s());
    }

    private r(Handler handler, g gVar, c cVar, com.anythink.expressad.exoplayer.d.g<com.anythink.expressad.exoplayer.d.i> gVar2, f... fVarArr) {
        this(handler, gVar, gVar2, new l(cVar, fVarArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0170 A[Catch: d -> 0x01b2, b -> 0x01b4, e | a | b | d -> 0x01b6, e -> 0x01b8, TryCatch #3 {e | a | b | d -> 0x01b6, blocks: (B:17:0x004c, B:18:0x0051, B:20:0x0058, B:22:0x0064, B:27:0x00d9, B:29:0x00dd, B:31:0x00e1, B:34:0x00e7, B:36:0x00eb, B:39:0x00f5, B:41:0x00fa, B:42:0x010c, B:49:0x0121, B:54:0x01ae, B:57:0x012b, B:59:0x0133, B:60:0x0140, B:63:0x014c, B:66:0x0151, B:70:0x016b, B:73:0x0170, B:75:0x017b, B:77:0x0181, B:79:0x0191, B:80:0x0195, B:81:0x0197, B:83:0x015b, B:84:0x0169, B:86:0x0112, B:90:0x006d, B:92:0x0075, B:94:0x0079, B:95:0x0082, B:96:0x008d, B:98:0x0091, B:99:0x00b8, B:101:0x00c6), top: B:16:0x004c }] */
    @Override // com.anythink.expressad.exoplayer.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r19, long r21) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.b.r.a(long, long):void");
    }

    private r(Handler handler, g gVar, com.anythink.expressad.exoplayer.d.g<com.anythink.expressad.exoplayer.d.i> gVar2, h hVar) {
        super(1);
        this.f7510q = gVar2;
        this.f7511r = false;
        this.f7512s = new g.a(handler, gVar);
        this.f7513t = hVar;
        hVar.a(new a(this, (byte) 0));
        this.f7514u = new com.anythink.expressad.exoplayer.n();
        this.f7515v = com.anythink.expressad.exoplayer.c.e.e();
        this.F = 0;
        this.H = true;
    }

    private void b(com.anythink.expressad.exoplayer.m mVar) {
        com.anythink.expressad.exoplayer.m mVar2 = this.f7517x;
        this.f7517x = mVar;
        if (!af.a(mVar.f9260k, mVar2 == null ? null : mVar2.f9260k)) {
            if (this.f7517x.f9260k != null) {
                com.anythink.expressad.exoplayer.d.g<com.anythink.expressad.exoplayer.d.i> gVar = this.f7510q;
                if (gVar != null) {
                    com.anythink.expressad.exoplayer.d.f<com.anythink.expressad.exoplayer.d.i> a10 = gVar.a(Looper.myLooper(), this.f7517x.f9260k);
                    this.E = a10;
                    if (a10 == this.D) {
                        this.f7510q.a(a10);
                    }
                } else {
                    throw com.anythink.expressad.exoplayer.g.a(new IllegalStateException("Media requires a DrmSessionManager"), s());
                }
            } else {
                this.E = null;
            }
        }
        if (this.G) {
            this.F = 1;
        } else {
            H();
            G();
            this.H = true;
        }
        this.y = mVar.f9272x;
        this.f7518z = mVar.y;
        this.f7512s.a(mVar);
    }

    private static void A() {
    }

    private static void y() {
    }

    private static void z() {
    }

    @Override // com.anythink.expressad.exoplayer.a, com.anythink.expressad.exoplayer.y
    public final com.anythink.expressad.exoplayer.k.n c() {
        return this;
    }

    @Override // com.anythink.expressad.exoplayer.k.n
    public final v a(v vVar) {
        return this.f7513t.a(vVar);
    }

    @Override // com.anythink.expressad.exoplayer.a
    public final void a(boolean z10) {
        com.anythink.expressad.exoplayer.c.d dVar = new com.anythink.expressad.exoplayer.c.d();
        this.f7516w = dVar;
        this.f7512s.a(dVar);
        int i10 = r().f7260b;
        if (i10 != 0) {
            this.f7513t.c(i10);
        } else {
            this.f7513t.g();
        }
    }

    @Override // com.anythink.expressad.exoplayer.a
    public final void a(long j10, boolean z10) {
        this.f7513t.i();
        this.I = j10;
        this.J = true;
        this.K = true;
        this.L = false;
        this.M = false;
        if (this.A != null) {
            this.N = false;
            if (this.F != 0) {
                H();
                G();
                return;
            }
            this.B = null;
            com.anythink.expressad.exoplayer.c.h hVar = this.C;
            if (hVar != null) {
                hVar.e();
                this.C = null;
            }
            this.A.d();
            this.G = false;
        }
    }

    @Override // com.anythink.expressad.exoplayer.a, com.anythink.expressad.exoplayer.x.b
    public final void a(int i10, Object obj) {
        if (i10 == 2) {
            this.f7513t.a(((Float) obj).floatValue());
        } else if (i10 != 3) {
            super.a(i10, obj);
        } else {
            this.f7513t.a((com.anythink.expressad.exoplayer.b.b) obj);
        }
    }

    private void a(com.anythink.expressad.exoplayer.c.e eVar) {
        if (!this.J || eVar.b()) {
            return;
        }
        if (Math.abs(eVar.f - this.I) > 500000) {
            this.I = eVar.f;
        }
        this.J = false;
    }
}
