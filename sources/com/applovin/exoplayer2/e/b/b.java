package com.applovin.exoplayer2.e.b;

import com.applovin.exoplayer2.e.h;
import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.l;
import com.applovin.exoplayer2.e.m;
import com.applovin.exoplayer2.e.n;
import com.applovin.exoplayer2.e.o;
import com.applovin.exoplayer2.e.p;
import com.applovin.exoplayer2.e.u;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.y;
import java.io.IOException;

/* loaded from: classes.dex */
public final class b implements h {

    /* renamed from: a */
    public static final l f14121a = new c(0);

    /* renamed from: b */
    private final byte[] f14122b;

    /* renamed from: c */
    private final y f14123c;

    /* renamed from: d */
    private final boolean f14124d;

    /* renamed from: e */
    private final m.a f14125e;
    private j f;

    /* renamed from: g */
    private x f14126g;

    /* renamed from: h */
    private int f14127h;

    /* renamed from: i */
    private com.applovin.exoplayer2.g.a f14128i;

    /* renamed from: j */
    private p f14129j;

    /* renamed from: k */
    private int f14130k;

    /* renamed from: l */
    private int f14131l;

    /* renamed from: m */
    private a f14132m;

    /* renamed from: n */
    private int f14133n;
    private long o;

    public b() {
        this(0);
    }

    public static /* synthetic */ h[] b() {
        return new h[]{new b()};
    }

    private void e(i iVar) throws IOException {
        n.a aVar = new n.a(this.f14129j);
        boolean z10 = false;
        while (!z10) {
            z10 = n.a(iVar, aVar);
            this.f14129j = (p) ai.a(aVar.f14912a);
        }
        com.applovin.exoplayer2.l.a.b(this.f14129j);
        this.f14130k = Math.max(this.f14129j.f14917c, 6);
        ((x) ai.a(this.f14126g)).a(this.f14129j.a(this.f14122b, this.f14128i));
        this.f14127h = 4;
    }

    private void f(i iVar) throws IOException {
        this.f14131l = n.c(iVar);
        ((j) ai.a(this.f)).a(b(iVar.c(), iVar.d()));
        this.f14127h = 5;
    }

    @Override // com.applovin.exoplayer2.e.h
    public boolean a(i iVar) throws IOException {
        n.a(iVar, false);
        return n.a(iVar);
    }

    @Override // com.applovin.exoplayer2.e.h
    public void c() {
    }

    public b(int i10) {
        this.f14122b = new byte[42];
        this.f14123c = new y(new byte[32768], 0);
        this.f14124d = (i10 & 1) != 0;
        this.f14125e = new m.a();
        this.f14127h = 0;
    }

    private void b(i iVar) throws IOException {
        this.f14128i = n.b(iVar, !this.f14124d);
        this.f14127h = 1;
    }

    private void c(i iVar) throws IOException {
        byte[] bArr = this.f14122b;
        iVar.d(bArr, 0, bArr.length);
        iVar.a();
        this.f14127h = 2;
    }

    private void d(i iVar) throws IOException {
        n.b(iVar);
        this.f14127h = 3;
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(j jVar) {
        this.f = jVar;
        this.f14126g = jVar.a(0, 1);
        jVar.a();
    }

    private int b(i iVar, u uVar) throws IOException {
        boolean z10;
        com.applovin.exoplayer2.l.a.b(this.f14126g);
        com.applovin.exoplayer2.l.a.b(this.f14129j);
        a aVar = this.f14132m;
        if (aVar != null && aVar.b()) {
            return this.f14132m.a(iVar, uVar);
        }
        if (this.o == -1) {
            this.o = m.a(iVar, this.f14129j);
            return 0;
        }
        int b10 = this.f14123c.b();
        if (b10 < 32768) {
            int a10 = iVar.a(this.f14123c.d(), b10, 32768 - b10);
            z10 = a10 == -1;
            if (!z10) {
                this.f14123c.c(b10 + a10);
            } else if (this.f14123c.a() == 0) {
                a();
                return -1;
            }
        } else {
            z10 = false;
        }
        int c10 = this.f14123c.c();
        int i10 = this.f14133n;
        int i11 = this.f14130k;
        if (i10 < i11) {
            y yVar = this.f14123c;
            yVar.e(Math.min(i11 - i10, yVar.a()));
        }
        long a11 = a(this.f14123c, z10);
        int c11 = this.f14123c.c() - c10;
        this.f14123c.d(c10);
        this.f14126g.a(this.f14123c, c11);
        this.f14133n += c11;
        if (a11 != -1) {
            a();
            this.f14133n = 0;
            this.o = a11;
        }
        if (this.f14123c.a() < 16) {
            int a12 = this.f14123c.a();
            System.arraycopy(this.f14123c.d(), this.f14123c.c(), this.f14123c.d(), 0, a12);
            this.f14123c.d(0);
            this.f14123c.c(a12);
        }
        return 0;
    }

    @Override // com.applovin.exoplayer2.e.h
    public int a(i iVar, u uVar) throws IOException {
        int i10 = this.f14127h;
        if (i10 == 0) {
            b(iVar);
            return 0;
        }
        if (i10 == 1) {
            c(iVar);
            return 0;
        }
        if (i10 == 2) {
            d(iVar);
            return 0;
        }
        if (i10 == 3) {
            e(iVar);
            return 0;
        }
        if (i10 == 4) {
            f(iVar);
            return 0;
        }
        if (i10 == 5) {
            return b(iVar, uVar);
        }
        throw new IllegalStateException();
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(long j10, long j11) {
        if (j10 == 0) {
            this.f14127h = 0;
        } else {
            a aVar = this.f14132m;
            if (aVar != null) {
                aVar.a(j11);
            }
        }
        this.o = j11 != 0 ? -1L : 0L;
        this.f14133n = 0;
        this.f14123c.a(0);
    }

    private long a(y yVar, boolean z10) {
        boolean z11;
        com.applovin.exoplayer2.l.a.b(this.f14129j);
        int c10 = yVar.c();
        while (c10 <= yVar.b() - 16) {
            yVar.d(c10);
            if (m.a(yVar, this.f14129j, this.f14131l, this.f14125e)) {
                yVar.d(c10);
                return this.f14125e.f14911a;
            }
            c10++;
        }
        if (z10) {
            while (c10 <= yVar.b() - this.f14130k) {
                yVar.d(c10);
                try {
                    z11 = m.a(yVar, this.f14129j, this.f14131l, this.f14125e);
                } catch (IndexOutOfBoundsException unused) {
                    z11 = false;
                }
                if (yVar.c() <= yVar.b() ? z11 : false) {
                    yVar.d(c10);
                    return this.f14125e.f14911a;
                }
                c10++;
            }
            yVar.d(yVar.b());
            return -1L;
        }
        yVar.d(c10);
        return -1L;
    }

    private void a() {
        ((x) ai.a(this.f14126g)).a((this.o * 1000000) / ((p) ai.a(this.f14129j)).f14919e, 1, this.f14133n, 0, null);
    }

    private v b(long j10, long j11) {
        com.applovin.exoplayer2.l.a.b(this.f14129j);
        p pVar = this.f14129j;
        if (pVar.f14924k != null) {
            return new o(pVar, j10);
        }
        if (j11 != -1 && pVar.f14923j > 0) {
            a aVar = new a(pVar, this.f14131l, j10, j11);
            this.f14132m = aVar;
            return aVar.a();
        }
        return new v.b(pVar.a());
    }
}
