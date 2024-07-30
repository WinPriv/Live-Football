package z4;

import k4.z0;
import z4.d0;

/* compiled from: PesReader.java */
/* loaded from: classes2.dex */
public final class t implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final j f37256a;

    /* renamed from: b, reason: collision with root package name */
    public final d6.v f37257b = new d6.v(new byte[10], 10);

    /* renamed from: c, reason: collision with root package name */
    public int f37258c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f37259d;

    /* renamed from: e, reason: collision with root package name */
    public d6.d0 f37260e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f37261g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f37262h;

    /* renamed from: i, reason: collision with root package name */
    public int f37263i;

    /* renamed from: j, reason: collision with root package name */
    public int f37264j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f37265k;

    /* renamed from: l, reason: collision with root package name */
    public long f37266l;

    public t(j jVar) {
        this.f37256a = jVar;
    }

    @Override // z4.d0
    public final void a() {
        this.f37258c = 0;
        this.f37259d = 0;
        this.f37262h = false;
        this.f37256a.a();
    }

    @Override // z4.d0
    public final void b(d6.d0 d0Var, p4.j jVar, d0.d dVar) {
        this.f37260e = d0Var;
        this.f37256a.f(jVar, dVar);
    }

    @Override // z4.d0
    public final void c(int i10, d6.w wVar) throws z0 {
        int i11;
        int i12;
        boolean z10;
        int i13;
        d6.a.e(this.f37260e);
        int i14 = i10 & 1;
        j jVar = this.f37256a;
        int i15 = -1;
        int i16 = 3;
        int i17 = 2;
        if (i14 != 0) {
            int i18 = this.f37258c;
            if (i18 != 0 && i18 != 1) {
                if (i18 != 2) {
                    if (i18 == 3) {
                        if (this.f37264j != -1) {
                            d6.p.f("PesReader", "Unexpected start indicator: expected " + this.f37264j + " more bytes");
                        }
                        jVar.d();
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    d6.p.f("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            this.f37258c = 1;
            this.f37259d = 0;
        }
        int i19 = i10;
        while (true) {
            int i20 = wVar.f27386c;
            int i21 = wVar.f27385b;
            int i22 = i20 - i21;
            if (i22 > 0) {
                int i23 = this.f37258c;
                if (i23 != 0) {
                    d6.v vVar = this.f37257b;
                    if (i23 != 1) {
                        if (i23 != i17) {
                            if (i23 == i16) {
                                int i24 = this.f37264j;
                                if (i24 == i15) {
                                    i11 = 0;
                                } else {
                                    i11 = i22 - i24;
                                }
                                if (i11 > 0) {
                                    i22 -= i11;
                                    wVar.D(i21 + i22);
                                }
                                jVar.c(wVar);
                                int i25 = this.f37264j;
                                if (i25 != i15) {
                                    int i26 = i25 - i22;
                                    this.f37264j = i26;
                                    if (i26 == 0) {
                                        jVar.d();
                                        this.f37258c = 1;
                                        this.f37259d = 0;
                                    }
                                }
                            } else {
                                throw new IllegalStateException();
                            }
                        } else {
                            if (d(Math.min(10, this.f37263i), wVar, vVar.f27378a) && d(this.f37263i, wVar, null)) {
                                vVar.k(0);
                                this.f37266l = com.anythink.expressad.exoplayer.b.f7291b;
                                if (this.f) {
                                    vVar.m(4);
                                    vVar.m(1);
                                    vVar.m(1);
                                    long g6 = (vVar.g(i16) << 30) | (vVar.g(15) << 15) | vVar.g(15);
                                    vVar.m(1);
                                    if (!this.f37262h && this.f37261g) {
                                        vVar.m(4);
                                        vVar.m(1);
                                        vVar.m(1);
                                        vVar.m(1);
                                        this.f37260e.b((vVar.g(15) << 15) | (vVar.g(3) << 30) | vVar.g(15));
                                        this.f37262h = true;
                                    }
                                    this.f37266l = this.f37260e.b(g6);
                                }
                                if (this.f37265k) {
                                    i12 = 4;
                                } else {
                                    i12 = 0;
                                }
                                i19 |= i12;
                                jVar.e(i19, this.f37266l);
                                i16 = 3;
                                this.f37258c = 3;
                                this.f37259d = 0;
                            }
                            i15 = -1;
                            i17 = 2;
                        }
                    } else if (!d(9, wVar, vVar.f27378a)) {
                        i15 = -1;
                        i17 = 2;
                    } else {
                        vVar.k(0);
                        int g10 = vVar.g(24);
                        if (g10 != 1) {
                            a3.k.s("Unexpected start code prefix: ", g10, "PesReader");
                            i15 = -1;
                            this.f37264j = -1;
                            i17 = 2;
                            z10 = false;
                        } else {
                            vVar.m(8);
                            int g11 = vVar.g(16);
                            vVar.m(5);
                            this.f37265k = vVar.f();
                            vVar.m(2);
                            this.f = vVar.f();
                            this.f37261g = vVar.f();
                            vVar.m(6);
                            int g12 = vVar.g(8);
                            this.f37263i = g12;
                            if (g11 == 0) {
                                i15 = -1;
                                this.f37264j = -1;
                            } else {
                                int i27 = ((g11 + 6) - 9) - g12;
                                this.f37264j = i27;
                                if (i27 < 0) {
                                    d6.p.f("PesReader", "Found negative packet payload size: " + this.f37264j);
                                    i15 = -1;
                                    this.f37264j = -1;
                                } else {
                                    i15 = -1;
                                }
                            }
                            i17 = 2;
                            z10 = true;
                        }
                        if (z10) {
                            i13 = i17;
                        } else {
                            i13 = 0;
                        }
                        this.f37258c = i13;
                        this.f37259d = 0;
                    }
                } else {
                    wVar.F(i22);
                }
            } else {
                return;
            }
        }
    }

    public final boolean d(int i10, d6.w wVar, byte[] bArr) {
        int min = Math.min(wVar.f27386c - wVar.f27385b, i10 - this.f37259d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            wVar.F(min);
        } else {
            wVar.b(bArr, this.f37259d, min);
        }
        int i11 = this.f37259d + min;
        this.f37259d = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }
}
