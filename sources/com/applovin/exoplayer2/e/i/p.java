package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.b.a;
import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.v;
import java.util.Collections;

/* loaded from: classes.dex */
public final class p implements j {

    /* renamed from: a, reason: collision with root package name */
    private final String f14788a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.y f14789b;

    /* renamed from: c, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.x f14790c;

    /* renamed from: d, reason: collision with root package name */
    private com.applovin.exoplayer2.e.x f14791d;

    /* renamed from: e, reason: collision with root package name */
    private String f14792e;
    private com.applovin.exoplayer2.v f;

    /* renamed from: g, reason: collision with root package name */
    private int f14793g;

    /* renamed from: h, reason: collision with root package name */
    private int f14794h;

    /* renamed from: i, reason: collision with root package name */
    private int f14795i;

    /* renamed from: j, reason: collision with root package name */
    private int f14796j;

    /* renamed from: k, reason: collision with root package name */
    private long f14797k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f14798l;

    /* renamed from: m, reason: collision with root package name */
    private int f14799m;

    /* renamed from: n, reason: collision with root package name */
    private int f14800n;
    private int o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f14801p;

    /* renamed from: q, reason: collision with root package name */
    private long f14802q;

    /* renamed from: r, reason: collision with root package name */
    private int f14803r;

    /* renamed from: s, reason: collision with root package name */
    private long f14804s;

    /* renamed from: t, reason: collision with root package name */
    private int f14805t;

    /* renamed from: u, reason: collision with root package name */
    private String f14806u;

    public p(String str) {
        this.f14788a = str;
        com.applovin.exoplayer2.l.y yVar = new com.applovin.exoplayer2.l.y(1024);
        this.f14789b = yVar;
        this.f14790c = new com.applovin.exoplayer2.l.x(yVar.d());
        this.f14797k = com.anythink.expressad.exoplayer.b.f7291b;
    }

    private void c(com.applovin.exoplayer2.l.x xVar) {
        int c10 = xVar.c(3);
        this.o = c10;
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 3 && c10 != 4 && c10 != 5) {
                    if (c10 != 6 && c10 != 7) {
                        throw new IllegalStateException();
                    }
                    xVar.b(1);
                    return;
                }
                xVar.b(6);
                return;
            }
            xVar.b(9);
            return;
        }
        xVar.b(8);
    }

    private int d(com.applovin.exoplayer2.l.x xVar) throws ai {
        int a10 = xVar.a();
        a.C0152a a11 = com.applovin.exoplayer2.b.a.a(xVar, true);
        this.f14806u = a11.f13331c;
        this.f14803r = a11.f13329a;
        this.f14805t = a11.f13330b;
        return a10 - xVar.a();
    }

    private int e(com.applovin.exoplayer2.l.x xVar) throws ai {
        int c10;
        if (this.o == 0) {
            int i10 = 0;
            do {
                c10 = xVar.c(8);
                i10 += c10;
            } while (c10 == 255);
            return i10;
        }
        throw ai.b(null, null);
    }

    private static long f(com.applovin.exoplayer2.l.x xVar) {
        return xVar.c((xVar.c(2) + 1) * 8);
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a() {
        this.f14793g = 0;
        this.f14797k = com.anythink.expressad.exoplayer.b.f7291b;
        this.f14798l = false;
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void b() {
    }

    private void b(com.applovin.exoplayer2.l.x xVar) throws ai {
        boolean e10;
        int c10 = xVar.c(1);
        int c11 = c10 == 1 ? xVar.c(1) : 0;
        this.f14799m = c11;
        if (c11 == 0) {
            if (c10 == 1) {
                f(xVar);
            }
            if (xVar.e()) {
                this.f14800n = xVar.c(6);
                int c12 = xVar.c(4);
                int c13 = xVar.c(3);
                if (c12 == 0 && c13 == 0) {
                    if (c10 == 0) {
                        int b10 = xVar.b();
                        int d10 = d(xVar);
                        xVar.a(b10);
                        byte[] bArr = new byte[(d10 + 7) / 8];
                        xVar.a(bArr, 0, d10);
                        com.applovin.exoplayer2.v a10 = new v.a().a(this.f14792e).f(com.anythink.expressad.exoplayer.k.o.f9083r).d(this.f14806u).k(this.f14805t).l(this.f14803r).a(Collections.singletonList(bArr)).c(this.f14788a).a();
                        if (!a10.equals(this.f)) {
                            this.f = a10;
                            this.f14804s = 1024000000 / a10.f16850z;
                            this.f14791d.a(a10);
                        }
                    } else {
                        xVar.b(((int) f(xVar)) - d(xVar));
                    }
                    c(xVar);
                    boolean e11 = xVar.e();
                    this.f14801p = e11;
                    this.f14802q = 0L;
                    if (e11) {
                        if (c10 == 1) {
                            this.f14802q = f(xVar);
                        }
                        do {
                            e10 = xVar.e();
                            this.f14802q = (this.f14802q << 8) + xVar.c(8);
                        } while (e10);
                    }
                    if (xVar.e()) {
                        xVar.b(8);
                        return;
                    }
                    return;
                }
                throw ai.b(null, null);
            }
            throw ai.b(null, null);
        }
        throw ai.b(null, null);
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.e.j jVar, ad.d dVar) {
        dVar.a();
        this.f14791d = jVar.a(dVar.b(), 1);
        this.f14792e = dVar.c();
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(long j10, int i10) {
        if (j10 != com.anythink.expressad.exoplayer.b.f7291b) {
            this.f14797k = j10;
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.l.y yVar) throws ai {
        com.applovin.exoplayer2.l.a.a(this.f14791d);
        while (yVar.a() > 0) {
            int i10 = this.f14793g;
            if (i10 != 0) {
                if (i10 == 1) {
                    int h10 = yVar.h();
                    if ((h10 & 224) == 224) {
                        this.f14796j = h10;
                        this.f14793g = 2;
                    } else if (h10 != 86) {
                        this.f14793g = 0;
                    }
                } else if (i10 == 2) {
                    int h11 = ((this.f14796j & (-225)) << 8) | yVar.h();
                    this.f14795i = h11;
                    if (h11 > this.f14789b.d().length) {
                        a(this.f14795i);
                    }
                    this.f14794h = 0;
                    this.f14793g = 3;
                } else if (i10 == 3) {
                    int min = Math.min(yVar.a(), this.f14795i - this.f14794h);
                    yVar.a(this.f14790c.f16363a, this.f14794h, min);
                    int i11 = this.f14794h + min;
                    this.f14794h = i11;
                    if (i11 == this.f14795i) {
                        this.f14790c.a(0);
                        a(this.f14790c);
                        this.f14793g = 0;
                    }
                } else {
                    throw new IllegalStateException();
                }
            } else if (yVar.h() == 86) {
                this.f14793g = 1;
            }
        }
    }

    private void a(com.applovin.exoplayer2.l.x xVar) throws ai {
        if (!xVar.e()) {
            this.f14798l = true;
            b(xVar);
        } else if (!this.f14798l) {
            return;
        }
        if (this.f14799m == 0) {
            if (this.f14800n == 0) {
                a(xVar, e(xVar));
                if (this.f14801p) {
                    xVar.b((int) this.f14802q);
                    return;
                }
                return;
            }
            throw ai.b(null, null);
        }
        throw ai.b(null, null);
    }

    private void a(com.applovin.exoplayer2.l.x xVar, int i10) {
        int b10 = xVar.b();
        if ((b10 & 7) == 0) {
            this.f14789b.d(b10 >> 3);
        } else {
            xVar.a(this.f14789b.d(), 0, i10 * 8);
            this.f14789b.d(0);
        }
        this.f14791d.a(this.f14789b, i10);
        long j10 = this.f14797k;
        if (j10 != com.anythink.expressad.exoplayer.b.f7291b) {
            this.f14791d.a(j10, 1, i10, 0, null);
            this.f14797k += this.f14804s;
        }
    }

    private void a(int i10) {
        this.f14789b.a(i10);
        this.f14790c.a(this.f14789b.d());
    }
}
