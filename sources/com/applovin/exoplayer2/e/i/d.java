package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.b.c;
import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.v;

/* loaded from: classes.dex */
public final class d implements j {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.x f14611a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.y f14612b;

    /* renamed from: c, reason: collision with root package name */
    private final String f14613c;

    /* renamed from: d, reason: collision with root package name */
    private String f14614d;

    /* renamed from: e, reason: collision with root package name */
    private com.applovin.exoplayer2.e.x f14615e;
    private int f;

    /* renamed from: g, reason: collision with root package name */
    private int f14616g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f14617h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f14618i;

    /* renamed from: j, reason: collision with root package name */
    private long f14619j;

    /* renamed from: k, reason: collision with root package name */
    private com.applovin.exoplayer2.v f14620k;

    /* renamed from: l, reason: collision with root package name */
    private int f14621l;

    /* renamed from: m, reason: collision with root package name */
    private long f14622m;

    public d() {
        this(null);
    }

    private void c() {
        this.f14611a.a(0);
        c.a a10 = com.applovin.exoplayer2.b.c.a(this.f14611a);
        com.applovin.exoplayer2.v vVar = this.f14620k;
        if (vVar == null || a10.f13351c != vVar.y || a10.f13350b != vVar.f16850z || !"audio/ac4".equals(vVar.f16838l)) {
            com.applovin.exoplayer2.v a11 = new v.a().a(this.f14614d).f("audio/ac4").k(a10.f13351c).l(a10.f13350b).c(this.f14613c).a();
            this.f14620k = a11;
            this.f14615e.a(a11);
        }
        this.f14621l = a10.f13352d;
        this.f14619j = (a10.f13353e * 1000000) / this.f14620k.f16850z;
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a() {
        this.f = 0;
        this.f14616g = 0;
        this.f14617h = false;
        this.f14618i = false;
        this.f14622m = com.anythink.expressad.exoplayer.b.f7291b;
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void b() {
    }

    public d(String str) {
        com.applovin.exoplayer2.l.x xVar = new com.applovin.exoplayer2.l.x(new byte[16]);
        this.f14611a = xVar;
        this.f14612b = new com.applovin.exoplayer2.l.y(xVar.f16363a);
        this.f = 0;
        this.f14616g = 0;
        this.f14617h = false;
        this.f14618i = false;
        this.f14622m = com.anythink.expressad.exoplayer.b.f7291b;
        this.f14613c = str;
    }

    private boolean b(com.applovin.exoplayer2.l.y yVar) {
        int h10;
        while (true) {
            if (yVar.a() <= 0) {
                return false;
            }
            if (!this.f14617h) {
                this.f14617h = yVar.h() == 172;
            } else {
                h10 = yVar.h();
                this.f14617h = h10 == 172;
                if (h10 == 64 || h10 == 65) {
                    break;
                }
            }
        }
        this.f14618i = h10 == 65;
        return true;
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.e.j jVar, ad.d dVar) {
        dVar.a();
        this.f14614d = dVar.c();
        this.f14615e = jVar.a(dVar.b(), 1);
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(long j10, int i10) {
        if (j10 != com.anythink.expressad.exoplayer.b.f7291b) {
            this.f14622m = j10;
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.l.y yVar) {
        com.applovin.exoplayer2.l.a.a(this.f14615e);
        while (yVar.a() > 0) {
            int i10 = this.f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(yVar.a(), this.f14621l - this.f14616g);
                        this.f14615e.a(yVar, min);
                        int i11 = this.f14616g + min;
                        this.f14616g = i11;
                        int i12 = this.f14621l;
                        if (i11 == i12) {
                            long j10 = this.f14622m;
                            if (j10 != com.anythink.expressad.exoplayer.b.f7291b) {
                                this.f14615e.a(j10, 1, i12, 0, null);
                                this.f14622m += this.f14619j;
                            }
                            this.f = 0;
                        }
                    }
                } else if (a(yVar, this.f14612b.d(), 16)) {
                    c();
                    this.f14612b.d(0);
                    this.f14615e.a(this.f14612b, 16);
                    this.f = 2;
                }
            } else if (b(yVar)) {
                this.f = 1;
                this.f14612b.d()[0] = -84;
                this.f14612b.d()[1] = (byte) (this.f14618i ? 65 : 64);
                this.f14616g = 2;
            }
        }
    }

    private boolean a(com.applovin.exoplayer2.l.y yVar, byte[] bArr, int i10) {
        int min = Math.min(yVar.a(), i10 - this.f14616g);
        yVar.a(bArr, this.f14616g, min);
        int i11 = this.f14616g + min;
        this.f14616g = i11;
        return i11 == i10;
    }
}
