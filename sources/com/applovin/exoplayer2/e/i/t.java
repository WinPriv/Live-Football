package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.l.ag;

/* loaded from: classes.dex */
public final class t implements ad {

    /* renamed from: a, reason: collision with root package name */
    private final j f14826a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.x f14827b = new com.applovin.exoplayer2.l.x(new byte[10]);

    /* renamed from: c, reason: collision with root package name */
    private int f14828c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f14829d;

    /* renamed from: e, reason: collision with root package name */
    private ag f14830e;
    private boolean f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f14831g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f14832h;

    /* renamed from: i, reason: collision with root package name */
    private int f14833i;

    /* renamed from: j, reason: collision with root package name */
    private int f14834j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f14835k;

    /* renamed from: l, reason: collision with root package name */
    private long f14836l;

    public t(j jVar) {
        this.f14826a = jVar;
    }

    private boolean b() {
        this.f14827b.a(0);
        int c10 = this.f14827b.c(24);
        if (c10 != 1) {
            a3.k.y("Unexpected start code prefix: ", c10, "PesReader");
            this.f14834j = -1;
            return false;
        }
        this.f14827b.b(8);
        int c11 = this.f14827b.c(16);
        this.f14827b.b(5);
        this.f14835k = this.f14827b.e();
        this.f14827b.b(2);
        this.f = this.f14827b.e();
        this.f14831g = this.f14827b.e();
        this.f14827b.b(6);
        int c12 = this.f14827b.c(8);
        this.f14833i = c12;
        if (c11 == 0) {
            this.f14834j = -1;
        } else {
            int i10 = ((c11 + 6) - 9) - c12;
            this.f14834j = i10;
            if (i10 < 0) {
                com.applovin.exoplayer2.l.q.c("PesReader", "Found negative packet payload size: " + this.f14834j);
                this.f14834j = -1;
            }
        }
        return true;
    }

    private void c() {
        this.f14827b.a(0);
        this.f14836l = com.anythink.expressad.exoplayer.b.f7291b;
        if (this.f) {
            this.f14827b.b(4);
            this.f14827b.b(1);
            this.f14827b.b(1);
            long c10 = (this.f14827b.c(3) << 30) | (this.f14827b.c(15) << 15) | this.f14827b.c(15);
            this.f14827b.b(1);
            if (!this.f14832h && this.f14831g) {
                this.f14827b.b(4);
                this.f14827b.b(1);
                this.f14827b.b(1);
                this.f14827b.b(1);
                this.f14830e.b((this.f14827b.c(3) << 30) | (this.f14827b.c(15) << 15) | this.f14827b.c(15));
                this.f14832h = true;
            }
            this.f14836l = this.f14830e.b(c10);
        }
    }

    @Override // com.applovin.exoplayer2.e.i.ad
    public void a(ag agVar, com.applovin.exoplayer2.e.j jVar, ad.d dVar) {
        this.f14830e = agVar;
        this.f14826a.a(jVar, dVar);
    }

    @Override // com.applovin.exoplayer2.e.i.ad
    public final void a() {
        this.f14828c = 0;
        this.f14829d = 0;
        this.f14832h = false;
        this.f14826a.a();
    }

    @Override // com.applovin.exoplayer2.e.i.ad
    public final void a(com.applovin.exoplayer2.l.y yVar, int i10) throws ai {
        com.applovin.exoplayer2.l.a.a(this.f14830e);
        if ((i10 & 1) != 0) {
            int i11 = this.f14828c;
            if (i11 != 0 && i11 != 1) {
                if (i11 == 2) {
                    com.applovin.exoplayer2.l.q.c("PesReader", "Unexpected start indicator reading extended header");
                } else if (i11 == 3) {
                    if (this.f14834j != -1) {
                        com.applovin.exoplayer2.l.q.c("PesReader", "Unexpected start indicator: expected " + this.f14834j + " more bytes");
                    }
                    this.f14826a.b();
                } else {
                    throw new IllegalStateException();
                }
            }
            a(1);
        }
        while (yVar.a() > 0) {
            int i12 = this.f14828c;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        if (a(yVar, this.f14827b.f16363a, Math.min(10, this.f14833i)) && a(yVar, (byte[]) null, this.f14833i)) {
                            c();
                            i10 |= this.f14835k ? 4 : 0;
                            this.f14826a.a(this.f14836l, i10);
                            a(3);
                        }
                    } else if (i12 == 3) {
                        int a10 = yVar.a();
                        int i13 = this.f14834j;
                        int i14 = i13 != -1 ? a10 - i13 : 0;
                        if (i14 > 0) {
                            a10 -= i14;
                            yVar.c(yVar.c() + a10);
                        }
                        this.f14826a.a(yVar);
                        int i15 = this.f14834j;
                        if (i15 != -1) {
                            int i16 = i15 - a10;
                            this.f14834j = i16;
                            if (i16 == 0) {
                                this.f14826a.b();
                                a(1);
                            }
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (a(yVar, this.f14827b.f16363a, 9)) {
                    a(b() ? 2 : 0);
                }
            } else {
                yVar.e(yVar.a());
            }
        }
    }

    private void a(int i10) {
        this.f14828c = i10;
        this.f14829d = 0;
    }

    private boolean a(com.applovin.exoplayer2.l.y yVar, byte[] bArr, int i10) {
        int min = Math.min(yVar.a(), i10 - this.f14829d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            yVar.e(min);
        } else {
            yVar.a(bArr, this.f14829d, min);
        }
        int i11 = this.f14829d + min;
        this.f14829d = i11;
        return i11 == i10;
    }
}
