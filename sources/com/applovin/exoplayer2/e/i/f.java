package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.b.a;
import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.v;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes.dex */
public final class f implements j {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f14635a = {73, 68, 51};

    /* renamed from: b, reason: collision with root package name */
    private final boolean f14636b;

    /* renamed from: c, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.x f14637c;

    /* renamed from: d, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.y f14638d;

    /* renamed from: e, reason: collision with root package name */
    private final String f14639e;
    private String f;

    /* renamed from: g, reason: collision with root package name */
    private com.applovin.exoplayer2.e.x f14640g;

    /* renamed from: h, reason: collision with root package name */
    private com.applovin.exoplayer2.e.x f14641h;

    /* renamed from: i, reason: collision with root package name */
    private int f14642i;

    /* renamed from: j, reason: collision with root package name */
    private int f14643j;

    /* renamed from: k, reason: collision with root package name */
    private int f14644k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f14645l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f14646m;

    /* renamed from: n, reason: collision with root package name */
    private int f14647n;
    private int o;

    /* renamed from: p, reason: collision with root package name */
    private int f14648p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f14649q;

    /* renamed from: r, reason: collision with root package name */
    private long f14650r;

    /* renamed from: s, reason: collision with root package name */
    private int f14651s;

    /* renamed from: t, reason: collision with root package name */
    private long f14652t;

    /* renamed from: u, reason: collision with root package name */
    private com.applovin.exoplayer2.e.x f14653u;

    /* renamed from: v, reason: collision with root package name */
    private long f14654v;

    public f(boolean z10) {
        this(z10, null);
    }

    public static boolean a(int i10) {
        return (i10 & 65526) == 65520;
    }

    private void d() {
        this.f14646m = false;
        e();
    }

    private void e() {
        this.f14642i = 0;
        this.f14643j = 0;
        this.f14644k = 256;
    }

    private void f() {
        this.f14642i = 2;
        this.f14643j = f14635a.length;
        this.f14651s = 0;
        this.f14638d.d(0);
    }

    private void g() {
        this.f14642i = 3;
        this.f14643j = 0;
    }

    private void h() {
        this.f14642i = 1;
        this.f14643j = 0;
    }

    private void i() {
        this.f14641h.a(this.f14638d, 10);
        this.f14638d.d(6);
        a(this.f14641h, 0L, 10, this.f14638d.v() + 10);
    }

    private void j() throws ai {
        this.f14637c.a(0);
        if (!this.f14649q) {
            int c10 = this.f14637c.c(2) + 1;
            if (c10 != 2) {
                com.applovin.exoplayer2.l.q.c("AdtsReader", "Detected audio object type: " + c10 + ", but assuming AAC LC.");
                c10 = 2;
            }
            this.f14637c.b(5);
            byte[] a10 = com.applovin.exoplayer2.b.a.a(c10, this.o, this.f14637c.c(3));
            a.C0152a a11 = com.applovin.exoplayer2.b.a.a(a10);
            com.applovin.exoplayer2.v a12 = new v.a().a(this.f).f(com.anythink.expressad.exoplayer.k.o.f9083r).d(a11.f13331c).k(a11.f13330b).l(a11.f13329a).a(Collections.singletonList(a10)).c(this.f14639e).a();
            this.f14650r = 1024000000 / a12.f16850z;
            this.f14640g.a(a12);
            this.f14649q = true;
        } else {
            this.f14637c.b(10);
        }
        this.f14637c.b(4);
        int c11 = (this.f14637c.c(13) - 2) - 5;
        if (this.f14645l) {
            c11 -= 2;
        }
        a(this.f14640g, this.f14650r, 0, c11);
    }

    private void k() {
        com.applovin.exoplayer2.l.a.b(this.f14640g);
        com.applovin.exoplayer2.l.ai.a(this.f14653u);
        com.applovin.exoplayer2.l.ai.a(this.f14641h);
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void b() {
    }

    public long c() {
        return this.f14650r;
    }

    public f(boolean z10, String str) {
        this.f14637c = new com.applovin.exoplayer2.l.x(new byte[7]);
        this.f14638d = new com.applovin.exoplayer2.l.y(Arrays.copyOf(f14635a, 10));
        e();
        this.f14647n = -1;
        this.o = -1;
        this.f14650r = com.anythink.expressad.exoplayer.b.f7291b;
        this.f14652t = com.anythink.expressad.exoplayer.b.f7291b;
        this.f14636b = z10;
        this.f14639e = str;
    }

    private void b(com.applovin.exoplayer2.l.y yVar) {
        byte[] d10 = yVar.d();
        int c10 = yVar.c();
        int b10 = yVar.b();
        while (c10 < b10) {
            int i10 = c10 + 1;
            int i11 = d10[c10] & DefaultClassResolver.NAME;
            if (this.f14644k == 512 && a((byte) -1, (byte) i11) && (this.f14646m || a(yVar, i10 - 2))) {
                this.f14648p = (i11 & 8) >> 3;
                this.f14645l = (i11 & 1) == 0;
                if (!this.f14646m) {
                    h();
                } else {
                    g();
                }
                yVar.d(i10);
                return;
            }
            int i12 = this.f14644k;
            int i13 = i11 | i12;
            if (i13 == 329) {
                this.f14644k = 768;
            } else if (i13 == 511) {
                this.f14644k = 512;
            } else if (i13 == 836) {
                this.f14644k = 1024;
            } else if (i13 == 1075) {
                f();
                yVar.d(i10);
                return;
            } else if (i12 != 256) {
                this.f14644k = 256;
                i10--;
            }
            c10 = i10;
        }
        yVar.d(c10);
    }

    private void c(com.applovin.exoplayer2.l.y yVar) {
        if (yVar.a() == 0) {
            return;
        }
        this.f14637c.f16363a[0] = yVar.d()[yVar.c()];
        this.f14637c.a(2);
        int c10 = this.f14637c.c(4);
        int i10 = this.o;
        if (i10 != -1 && c10 != i10) {
            d();
            return;
        }
        if (!this.f14646m) {
            this.f14646m = true;
            this.f14647n = this.f14648p;
            this.o = c10;
        }
        g();
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a() {
        this.f14652t = com.anythink.expressad.exoplayer.b.f7291b;
        d();
    }

    private void d(com.applovin.exoplayer2.l.y yVar) {
        int min = Math.min(yVar.a(), this.f14651s - this.f14643j);
        this.f14653u.a(yVar, min);
        int i10 = this.f14643j + min;
        this.f14643j = i10;
        int i11 = this.f14651s;
        if (i10 == i11) {
            long j10 = this.f14652t;
            if (j10 != com.anythink.expressad.exoplayer.b.f7291b) {
                this.f14653u.a(j10, 1, i11, 0, null);
                this.f14652t += this.f14654v;
            }
            e();
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.e.j jVar, ad.d dVar) {
        dVar.a();
        this.f = dVar.c();
        com.applovin.exoplayer2.e.x a10 = jVar.a(dVar.b(), 1);
        this.f14640g = a10;
        this.f14653u = a10;
        if (this.f14636b) {
            dVar.a();
            com.applovin.exoplayer2.e.x a11 = jVar.a(dVar.b(), 5);
            this.f14641h = a11;
            a11.a(new v.a().a(dVar.c()).f(com.anythink.expressad.exoplayer.k.o.V).a());
            return;
        }
        this.f14641h = new com.applovin.exoplayer2.e.g();
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(long j10, int i10) {
        if (j10 != com.anythink.expressad.exoplayer.b.f7291b) {
            this.f14652t = j10;
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.l.y yVar) throws ai {
        k();
        while (yVar.a() > 0) {
            int i10 = this.f14642i;
            if (i10 == 0) {
                b(yVar);
            } else if (i10 == 1) {
                c(yVar);
            } else if (i10 != 2) {
                if (i10 == 3) {
                    if (a(yVar, this.f14637c.f16363a, this.f14645l ? 7 : 5)) {
                        j();
                    }
                } else if (i10 == 4) {
                    d(yVar);
                } else {
                    throw new IllegalStateException();
                }
            } else if (a(yVar, this.f14638d.d(), 10)) {
                i();
            }
        }
    }

    private boolean b(com.applovin.exoplayer2.l.y yVar, byte[] bArr, int i10) {
        if (yVar.a() < i10) {
            return false;
        }
        yVar.a(bArr, 0, i10);
        return true;
    }

    private boolean a(com.applovin.exoplayer2.l.y yVar, byte[] bArr, int i10) {
        int min = Math.min(yVar.a(), i10 - this.f14643j);
        yVar.a(bArr, this.f14643j, min);
        int i11 = this.f14643j + min;
        this.f14643j = i11;
        return i11 == i10;
    }

    private void a(com.applovin.exoplayer2.e.x xVar, long j10, int i10, int i11) {
        this.f14642i = 4;
        this.f14643j = i10;
        this.f14653u = xVar;
        this.f14654v = j10;
        this.f14651s = i11;
    }

    private boolean a(com.applovin.exoplayer2.l.y yVar, int i10) {
        yVar.d(i10 + 1);
        if (!b(yVar, this.f14637c.f16363a, 1)) {
            return false;
        }
        this.f14637c.a(4);
        int c10 = this.f14637c.c(1);
        int i11 = this.f14647n;
        if (i11 != -1 && c10 != i11) {
            return false;
        }
        if (this.o != -1) {
            if (!b(yVar, this.f14637c.f16363a, 1)) {
                return true;
            }
            this.f14637c.a(2);
            if (this.f14637c.c(4) != this.o) {
                return false;
            }
            yVar.d(i10 + 2);
        }
        if (!b(yVar, this.f14637c.f16363a, 4)) {
            return true;
        }
        this.f14637c.a(14);
        int c11 = this.f14637c.c(13);
        if (c11 < 7) {
            return false;
        }
        byte[] d10 = yVar.d();
        int b10 = yVar.b();
        int i12 = i10 + c11;
        if (i12 >= b10) {
            return true;
        }
        byte b11 = d10[i12];
        if (b11 == -1) {
            int i13 = i12 + 1;
            if (i13 == b10) {
                return true;
            }
            return a((byte) -1, d10[i13]) && ((d10[i13] & 8) >> 3) == c10;
        }
        if (b11 != 73) {
            return false;
        }
        int i14 = i12 + 1;
        if (i14 == b10) {
            return true;
        }
        if (d10[i14] != 68) {
            return false;
        }
        int i15 = i12 + 2;
        return i15 == b10 || d10[i15] == 51;
    }

    private boolean a(byte b10, byte b11) {
        return a(((b10 & DefaultClassResolver.NAME) << 8) | (b11 & DefaultClassResolver.NAME));
    }
}
