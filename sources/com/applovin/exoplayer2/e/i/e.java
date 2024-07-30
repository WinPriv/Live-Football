package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.e.v;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes.dex */
public final class e implements com.applovin.exoplayer2.e.h {

    /* renamed from: a */
    public static final com.applovin.exoplayer2.e.l f14623a = new com.applovin.exoplayer2.e.c.f(2);

    /* renamed from: b */
    private final int f14624b;

    /* renamed from: c */
    private final f f14625c;

    /* renamed from: d */
    private final com.applovin.exoplayer2.l.y f14626d;

    /* renamed from: e */
    private final com.applovin.exoplayer2.l.y f14627e;
    private final com.applovin.exoplayer2.l.x f;

    /* renamed from: g */
    private com.applovin.exoplayer2.e.j f14628g;

    /* renamed from: h */
    private long f14629h;

    /* renamed from: i */
    private long f14630i;

    /* renamed from: j */
    private int f14631j;

    /* renamed from: k */
    private boolean f14632k;

    /* renamed from: l */
    private boolean f14633l;

    /* renamed from: m */
    private boolean f14634m;

    public e() {
        this(0);
    }

    public static /* synthetic */ com.applovin.exoplayer2.e.h[] a() {
        return new com.applovin.exoplayer2.e.h[]{new e()};
    }

    @Override // com.applovin.exoplayer2.e.h
    public void c() {
    }

    public e(int i10) {
        this.f14624b = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f14625c = new f(true);
        this.f14626d = new com.applovin.exoplayer2.l.y(2048);
        this.f14631j = -1;
        this.f14630i = -1L;
        com.applovin.exoplayer2.l.y yVar = new com.applovin.exoplayer2.l.y(10);
        this.f14627e = yVar;
        this.f = new com.applovin.exoplayer2.l.x(yVar.d());
    }

    private int b(com.applovin.exoplayer2.e.i iVar) throws IOException {
        int i10 = 0;
        while (true) {
            iVar.d(this.f14627e.d(), 0, 10);
            this.f14627e.d(0);
            if (this.f14627e.m() != 4801587) {
                break;
            }
            this.f14627e.e(3);
            int v3 = this.f14627e.v();
            i10 += v3 + 10;
            iVar.c(v3);
        }
        iVar.a();
        iVar.c(i10);
        if (this.f14630i == -1) {
            this.f14630i = i10;
        }
        return i10;
    }

    private void c(com.applovin.exoplayer2.e.i iVar) throws IOException {
        if (this.f14632k) {
            return;
        }
        this.f14631j = -1;
        iVar.a();
        long j10 = 0;
        if (iVar.c() == 0) {
            b(iVar);
        }
        int i10 = 0;
        int i11 = 0;
        while (iVar.b(this.f14627e.d(), 0, 2, true)) {
            try {
                this.f14627e.d(0);
                if (!f.a(this.f14627e.i())) {
                    break;
                }
                if (!iVar.b(this.f14627e.d(), 0, 4, true)) {
                    break;
                }
                this.f.a(14);
                int c10 = this.f.c(13);
                if (c10 > 6) {
                    j10 += c10;
                    i11++;
                    if (i11 != 1000 && iVar.b(c10 - 6, true)) {
                    }
                    break;
                }
                this.f14632k = true;
                throw ai.b("Malformed ADTS stream", null);
            } catch (EOFException unused) {
            }
        }
        i10 = i11;
        iVar.a();
        if (i10 > 0) {
            this.f14631j = (int) (j10 / i10);
        } else {
            this.f14631j = -1;
        }
        this.f14632k = true;
    }

    @Override // com.applovin.exoplayer2.e.h
    public boolean a(com.applovin.exoplayer2.e.i iVar) throws IOException {
        int b10 = b(iVar);
        int i10 = b10;
        int i11 = 0;
        int i12 = 0;
        do {
            iVar.d(this.f14627e.d(), 0, 2);
            this.f14627e.d(0);
            if (f.a(this.f14627e.i())) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                iVar.d(this.f14627e.d(), 0, 4);
                this.f.a(14);
                int c10 = this.f.c(13);
                if (c10 <= 6) {
                    i10++;
                    iVar.a();
                    iVar.c(i10);
                } else {
                    iVar.c(c10 - 6);
                    i12 += c10;
                }
            } else {
                i10++;
                iVar.a();
                iVar.c(i10);
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - b10 < 8192);
        return false;
    }

    private com.applovin.exoplayer2.e.v b(long j10, boolean z10) {
        return new com.applovin.exoplayer2.e.d(j10, this.f14630i, a(this.f14631j, this.f14625c.c()), this.f14631j, z10);
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(com.applovin.exoplayer2.e.j jVar) {
        this.f14628g = jVar;
        this.f14625c.a(jVar, new ad.d(0, 1));
        jVar.a();
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(long j10, long j11) {
        this.f14633l = false;
        this.f14625c.a();
        this.f14629h = j11;
    }

    @Override // com.applovin.exoplayer2.e.h
    public int a(com.applovin.exoplayer2.e.i iVar, com.applovin.exoplayer2.e.u uVar) throws IOException {
        com.applovin.exoplayer2.l.a.a(this.f14628g);
        long d10 = iVar.d();
        int i10 = this.f14624b;
        if (((i10 & 2) == 0 && ((i10 & 1) == 0 || d10 == -1)) ? false : true) {
            c(iVar);
        }
        int a10 = iVar.a(this.f14626d.d(), 0, 2048);
        boolean z10 = a10 == -1;
        a(d10, z10);
        if (z10) {
            return -1;
        }
        this.f14626d.d(0);
        this.f14626d.c(a10);
        if (!this.f14633l) {
            this.f14625c.a(this.f14629h, 4);
            this.f14633l = true;
        }
        this.f14625c.a(this.f14626d);
        return 0;
    }

    private void a(long j10, boolean z10) {
        if (this.f14634m) {
            return;
        }
        boolean z11 = (this.f14624b & 1) != 0 && this.f14631j > 0;
        if (z11 && this.f14625c.c() == com.anythink.expressad.exoplayer.b.f7291b && !z10) {
            return;
        }
        if (z11 && this.f14625c.c() != com.anythink.expressad.exoplayer.b.f7291b) {
            this.f14628g.a(b(j10, (this.f14624b & 2) != 0));
        } else {
            this.f14628g.a(new v.b(com.anythink.expressad.exoplayer.b.f7291b));
        }
        this.f14634m = true;
    }

    private static int a(int i10, long j10) {
        return (int) (((i10 * 8) * 1000000) / j10);
    }
}
