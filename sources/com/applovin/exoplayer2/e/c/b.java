package com.applovin.exoplayer2.e.c;

import com.applovin.exoplayer2.e.h;
import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.l;
import com.applovin.exoplayer2.e.u;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.l.y;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.IOException;

/* loaded from: classes.dex */
public final class b implements h {

    /* renamed from: a */
    public static final l f14144a = new f(0);

    /* renamed from: g */
    private j f14149g;

    /* renamed from: i */
    private boolean f14151i;

    /* renamed from: j */
    private long f14152j;

    /* renamed from: k */
    private int f14153k;

    /* renamed from: l */
    private int f14154l;

    /* renamed from: m */
    private int f14155m;

    /* renamed from: n */
    private long f14156n;
    private boolean o;

    /* renamed from: p */
    private a f14157p;

    /* renamed from: q */
    private e f14158q;

    /* renamed from: b */
    private final y f14145b = new y(4);

    /* renamed from: c */
    private final y f14146c = new y(9);

    /* renamed from: d */
    private final y f14147d = new y(11);

    /* renamed from: e */
    private final y f14148e = new y();
    private final c f = new c();

    /* renamed from: h */
    private int f14150h = 1;

    private boolean b(i iVar) throws IOException {
        if (!iVar.a(this.f14146c.d(), 0, 9, true)) {
            return false;
        }
        this.f14146c.d(0);
        this.f14146c.e(4);
        int h10 = this.f14146c.h();
        boolean z10 = (h10 & 4) != 0;
        boolean z11 = (h10 & 1) != 0;
        if (z10 && this.f14157p == null) {
            this.f14157p = new a(this.f14149g.a(8, 1));
        }
        if (z11 && this.f14158q == null) {
            this.f14158q = new e(this.f14149g.a(9, 2));
        }
        this.f14149g.a();
        this.f14153k = (this.f14146c.q() - 9) + 4;
        this.f14150h = 2;
        return true;
    }

    public static /* synthetic */ h[] d() {
        return new h[]{new b()};
    }

    private y f(i iVar) throws IOException {
        if (this.f14155m > this.f14148e.e()) {
            y yVar = this.f14148e;
            yVar.a(new byte[Math.max(yVar.e() * 2, this.f14155m)], 0);
        } else {
            this.f14148e.d(0);
        }
        this.f14148e.c(this.f14155m);
        iVar.b(this.f14148e.d(), 0, this.f14155m);
        return this.f14148e;
    }

    @Override // com.applovin.exoplayer2.e.h
    public boolean a(i iVar) throws IOException {
        iVar.d(this.f14145b.d(), 0, 3);
        this.f14145b.d(0);
        if (this.f14145b.m() != 4607062) {
            return false;
        }
        iVar.d(this.f14145b.d(), 0, 2);
        this.f14145b.d(0);
        if ((this.f14145b.i() & IronSourceConstants.INTERSTITIAL_DAILY_CAPPED) != 0) {
            return false;
        }
        iVar.d(this.f14145b.d(), 0, 4);
        this.f14145b.d(0);
        int q10 = this.f14145b.q();
        iVar.a();
        iVar.c(q10);
        iVar.d(this.f14145b.d(), 0, 4);
        this.f14145b.d(0);
        return this.f14145b.q() == 0;
    }

    @Override // com.applovin.exoplayer2.e.h
    public void c() {
    }

    private void c(i iVar) throws IOException {
        iVar.b(this.f14153k);
        this.f14153k = 0;
        this.f14150h = 3;
    }

    private boolean d(i iVar) throws IOException {
        if (!iVar.a(this.f14147d.d(), 0, 11, true)) {
            return false;
        }
        this.f14147d.d(0);
        this.f14154l = this.f14147d.h();
        this.f14155m = this.f14147d.m();
        this.f14156n = this.f14147d.m();
        this.f14156n = ((this.f14147d.h() << 24) | this.f14156n) * 1000;
        this.f14147d.e(3);
        this.f14150h = 4;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean e(com.applovin.exoplayer2.e.i r10) throws java.io.IOException {
        /*
            r9 = this;
            long r0 = r9.b()
            int r2 = r9.f14154l
            r3 = 8
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 1
            if (r2 != r3) goto L23
            com.applovin.exoplayer2.e.c.a r3 = r9.f14157p
            if (r3 == 0) goto L23
            r9.a()
            com.applovin.exoplayer2.e.c.a r2 = r9.f14157p
            com.applovin.exoplayer2.l.y r10 = r9.f(r10)
            boolean r10 = r2.b(r10, r0)
        L21:
            r0 = r6
            goto L75
        L23:
            r3 = 9
            if (r2 != r3) goto L39
            com.applovin.exoplayer2.e.c.e r3 = r9.f14158q
            if (r3 == 0) goto L39
            r9.a()
            com.applovin.exoplayer2.e.c.e r2 = r9.f14158q
            com.applovin.exoplayer2.l.y r10 = r9.f(r10)
            boolean r10 = r2.b(r10, r0)
            goto L21
        L39:
            r3 = 18
            if (r2 != r3) goto L6e
            boolean r2 = r9.o
            if (r2 != 0) goto L6e
            com.applovin.exoplayer2.e.c.c r2 = r9.f
            com.applovin.exoplayer2.l.y r10 = r9.f(r10)
            boolean r10 = r2.b(r10, r0)
            com.applovin.exoplayer2.e.c.c r0 = r9.f
            long r0 = r0.a()
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L21
            com.applovin.exoplayer2.e.j r2 = r9.f14149g
            com.applovin.exoplayer2.e.t r3 = new com.applovin.exoplayer2.e.t
            com.applovin.exoplayer2.e.c.c r7 = r9.f
            long[] r7 = r7.c()
            com.applovin.exoplayer2.e.c.c r8 = r9.f
            long[] r8 = r8.b()
            r3.<init>(r7, r8, r0)
            r2.a(r3)
            r9.o = r6
            goto L21
        L6e:
            int r0 = r9.f14155m
            r10.b(r0)
            r10 = 0
            r0 = r10
        L75:
            boolean r1 = r9.f14151i
            if (r1 != 0) goto L8f
            if (r10 == 0) goto L8f
            r9.f14151i = r6
            com.applovin.exoplayer2.e.c.c r10 = r9.f
            long r1 = r10.a()
            int r10 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r10 != 0) goto L8b
            long r1 = r9.f14156n
            long r1 = -r1
            goto L8d
        L8b:
            r1 = 0
        L8d:
            r9.f14152j = r1
        L8f:
            r10 = 4
            r9.f14153k = r10
            r10 = 2
            r9.f14150h = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.c.b.e(com.applovin.exoplayer2.e.i):boolean");
    }

    private long b() {
        if (this.f14151i) {
            return this.f14152j + this.f14156n;
        }
        if (this.f.a() == com.anythink.expressad.exoplayer.b.f7291b) {
            return 0L;
        }
        return this.f14156n;
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(j jVar) {
        this.f14149g = jVar;
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(long j10, long j11) {
        if (j10 == 0) {
            this.f14150h = 1;
            this.f14151i = false;
        } else {
            this.f14150h = 3;
        }
        this.f14153k = 0;
    }

    @Override // com.applovin.exoplayer2.e.h
    public int a(i iVar, u uVar) throws IOException {
        com.applovin.exoplayer2.l.a.a(this.f14149g);
        while (true) {
            int i10 = this.f14150h;
            if (i10 != 1) {
                if (i10 == 2) {
                    c(iVar);
                } else if (i10 != 3) {
                    if (i10 == 4) {
                        if (e(iVar)) {
                            return 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (!d(iVar)) {
                    return -1;
                }
            } else if (!b(iVar)) {
                return -1;
            }
        }
    }

    private void a() {
        if (this.o) {
            return;
        }
        this.f14149g.a(new v.b(com.anythink.expressad.exoplayer.b.f7291b));
        this.o = true;
    }
}
