package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.b.b;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.v;

/* loaded from: classes.dex */
public final class b implements j {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.x f14596a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.y f14597b;

    /* renamed from: c, reason: collision with root package name */
    private final String f14598c;

    /* renamed from: d, reason: collision with root package name */
    private String f14599d;

    /* renamed from: e, reason: collision with root package name */
    private com.applovin.exoplayer2.e.x f14600e;
    private int f;

    /* renamed from: g, reason: collision with root package name */
    private int f14601g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f14602h;

    /* renamed from: i, reason: collision with root package name */
    private long f14603i;

    /* renamed from: j, reason: collision with root package name */
    private com.applovin.exoplayer2.v f14604j;

    /* renamed from: k, reason: collision with root package name */
    private int f14605k;

    /* renamed from: l, reason: collision with root package name */
    private long f14606l;

    public b() {
        this(null);
    }

    private void c() {
        this.f14596a.a(0);
        b.a a10 = com.applovin.exoplayer2.b.b.a(this.f14596a);
        com.applovin.exoplayer2.v vVar = this.f14604j;
        if (vVar == null || a10.f13344d != vVar.y || a10.f13343c != vVar.f16850z || !ai.a((Object) a10.f13341a, (Object) vVar.f16838l)) {
            com.applovin.exoplayer2.v a11 = new v.a().a(this.f14599d).f(a10.f13341a).k(a10.f13344d).l(a10.f13343c).c(this.f14598c).a();
            this.f14604j = a11;
            this.f14600e.a(a11);
        }
        this.f14605k = a10.f13345e;
        this.f14603i = (a10.f * 1000000) / this.f14604j.f16850z;
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a() {
        this.f = 0;
        this.f14601g = 0;
        this.f14602h = false;
        this.f14606l = com.anythink.expressad.exoplayer.b.f7291b;
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void b() {
    }

    public b(String str) {
        com.applovin.exoplayer2.l.x xVar = new com.applovin.exoplayer2.l.x(new byte[128]);
        this.f14596a = xVar;
        this.f14597b = new com.applovin.exoplayer2.l.y(xVar.f16363a);
        this.f = 0;
        this.f14606l = com.anythink.expressad.exoplayer.b.f7291b;
        this.f14598c = str;
    }

    private boolean b(com.applovin.exoplayer2.l.y yVar) {
        while (true) {
            if (yVar.a() <= 0) {
                return false;
            }
            if (!this.f14602h) {
                this.f14602h = yVar.h() == 11;
            } else {
                int h10 = yVar.h();
                if (h10 == 119) {
                    this.f14602h = false;
                    return true;
                }
                this.f14602h = h10 == 11;
            }
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.e.j jVar, ad.d dVar) {
        dVar.a();
        this.f14599d = dVar.c();
        this.f14600e = jVar.a(dVar.b(), 1);
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(long j10, int i10) {
        if (j10 != com.anythink.expressad.exoplayer.b.f7291b) {
            this.f14606l = j10;
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.l.y yVar) {
        com.applovin.exoplayer2.l.a.a(this.f14600e);
        while (yVar.a() > 0) {
            int i10 = this.f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(yVar.a(), this.f14605k - this.f14601g);
                        this.f14600e.a(yVar, min);
                        int i11 = this.f14601g + min;
                        this.f14601g = i11;
                        int i12 = this.f14605k;
                        if (i11 == i12) {
                            long j10 = this.f14606l;
                            if (j10 != com.anythink.expressad.exoplayer.b.f7291b) {
                                this.f14600e.a(j10, 1, i12, 0, null);
                                this.f14606l += this.f14603i;
                            }
                            this.f = 0;
                        }
                    }
                } else if (a(yVar, this.f14597b.d(), 128)) {
                    c();
                    this.f14597b.d(0);
                    this.f14600e.a(this.f14597b, 128);
                    this.f = 2;
                }
            } else if (b(yVar)) {
                this.f = 1;
                this.f14597b.d()[0] = Ascii.VT;
                this.f14597b.d()[1] = 119;
                this.f14601g = 2;
            }
        }
    }

    private boolean a(com.applovin.exoplayer2.l.y yVar, byte[] bArr, int i10) {
        int min = Math.min(yVar.a(), i10 - this.f14601g);
        yVar.a(bArr, this.f14601g, min);
        int i11 = this.f14601g + min;
        this.f14601g = i11;
        return i11 == i10;
    }
}
