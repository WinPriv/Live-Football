package z4;

import k4.i0;
import m4.c;
import z4.d0;

/* compiled from: Ac4Reader.java */
/* loaded from: classes2.dex */
public final class d implements j {

    /* renamed from: a, reason: collision with root package name */
    public final d6.v f37030a;

    /* renamed from: b, reason: collision with root package name */
    public final d6.w f37031b;

    /* renamed from: c, reason: collision with root package name */
    public final String f37032c;

    /* renamed from: d, reason: collision with root package name */
    public String f37033d;

    /* renamed from: e, reason: collision with root package name */
    public p4.w f37034e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f37035g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f37036h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f37037i;

    /* renamed from: j, reason: collision with root package name */
    public long f37038j;

    /* renamed from: k, reason: collision with root package name */
    public i0 f37039k;

    /* renamed from: l, reason: collision with root package name */
    public int f37040l;

    /* renamed from: m, reason: collision with root package name */
    public long f37041m;

    public d(String str) {
        d6.v vVar = new d6.v(new byte[16], 16);
        this.f37030a = vVar;
        this.f37031b = new d6.w(vVar.f27378a);
        this.f = 0;
        this.f37035g = 0;
        this.f37036h = false;
        this.f37037i = false;
        this.f37041m = com.anythink.expressad.exoplayer.b.f7291b;
        this.f37032c = str;
    }

    @Override // z4.j
    public final void a() {
        this.f = 0;
        this.f37035g = 0;
        this.f37036h = false;
        this.f37037i = false;
        this.f37041m = com.anythink.expressad.exoplayer.b.f7291b;
    }

    @Override // z4.j
    public final void c(d6.w wVar) {
        int i10;
        boolean z10;
        boolean z11;
        int t10;
        boolean z12;
        boolean z13;
        d6.a.e(this.f37034e);
        while (true) {
            int i11 = wVar.f27386c - wVar.f27385b;
            if (i11 > 0) {
                int i12 = this.f;
                d6.w wVar2 = this.f37031b;
                boolean z14 = true;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            int min = Math.min(i11, this.f37040l - this.f37035g);
                            this.f37034e.f(min, wVar);
                            int i13 = this.f37035g + min;
                            this.f37035g = i13;
                            int i14 = this.f37040l;
                            if (i13 == i14) {
                                long j10 = this.f37041m;
                                if (j10 != com.anythink.expressad.exoplayer.b.f7291b) {
                                    this.f37034e.c(j10, 1, i14, 0, null);
                                    this.f37041m += this.f37038j;
                                }
                                this.f = 0;
                            }
                        }
                    } else {
                        byte[] bArr = wVar2.f27384a;
                        int min2 = Math.min(i11, 16 - this.f37035g);
                        wVar.b(bArr, this.f37035g, min2);
                        int i15 = this.f37035g + min2;
                        this.f37035g = i15;
                        if (i15 != 16) {
                            z14 = false;
                        }
                        if (z14) {
                            d6.v vVar = this.f37030a;
                            vVar.k(0);
                            c.a b10 = m4.c.b(vVar);
                            i0 i0Var = this.f37039k;
                            int i16 = b10.f32710a;
                            if (i0Var == null || 2 != i0Var.Q || i16 != i0Var.R || !"audio/ac4".equals(i0Var.D)) {
                                i0.a aVar = new i0.a();
                                aVar.f30525a = this.f37033d;
                                aVar.f30534k = "audio/ac4";
                                aVar.f30546x = 2;
                                aVar.y = i16;
                                aVar.f30527c = this.f37032c;
                                i0 i0Var2 = new i0(aVar);
                                this.f37039k = i0Var2;
                                this.f37034e.b(i0Var2);
                            }
                            this.f37040l = b10.f32711b;
                            this.f37038j = (b10.f32712c * 1000000) / this.f37039k.R;
                            wVar2.E(0);
                            this.f37034e.f(16, wVar2);
                            this.f = 2;
                        }
                    }
                } else {
                    while (true) {
                        i10 = 65;
                        if (wVar.f27386c - wVar.f27385b > 0) {
                            if (!this.f37036h) {
                                if (wVar.t() == 172) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                this.f37036h = z11;
                            } else {
                                t10 = wVar.t();
                                if (t10 == 172) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                this.f37036h = z12;
                                if (t10 == 64 || t10 == 65) {
                                    break;
                                }
                            }
                        } else {
                            z10 = false;
                            break;
                        }
                    }
                    if (t10 == 65) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    this.f37037i = z13;
                    z10 = true;
                    if (z10) {
                        this.f = 1;
                        byte[] bArr2 = wVar2.f27384a;
                        bArr2[0] = -84;
                        if (!this.f37037i) {
                            i10 = 64;
                        }
                        bArr2[1] = (byte) i10;
                        this.f37035g = 2;
                    }
                }
            } else {
                return;
            }
        }
    }

    @Override // z4.j
    public final void e(int i10, long j10) {
        if (j10 != com.anythink.expressad.exoplayer.b.f7291b) {
            this.f37041m = j10;
        }
    }

    @Override // z4.j
    public final void f(p4.j jVar, d0.d dVar) {
        dVar.a();
        dVar.b();
        this.f37033d = dVar.f37051e;
        dVar.b();
        this.f37034e = jVar.s(dVar.f37050d, 1);
    }

    @Override // z4.j
    public final void d() {
    }
}
