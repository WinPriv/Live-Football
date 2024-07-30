package u;

import java.util.ArrayList;

/* compiled from: Flow.java */
/* loaded from: classes.dex */
public final class f extends k {

    /* renamed from: c1, reason: collision with root package name */
    public d[] f35678c1;
    public int F0 = -1;
    public int G0 = -1;
    public int H0 = -1;
    public int I0 = -1;
    public int J0 = -1;
    public int K0 = -1;
    public float L0 = 0.5f;
    public float M0 = 0.5f;
    public float N0 = 0.5f;
    public float O0 = 0.5f;
    public float P0 = 0.5f;
    public float Q0 = 0.5f;
    public int R0 = 0;
    public int S0 = 0;
    public int T0 = 2;
    public int U0 = 2;
    public int V0 = 0;
    public int W0 = -1;
    public int X0 = 0;
    public final ArrayList<a> Y0 = new ArrayList<>();
    public d[] Z0 = null;

    /* renamed from: a1, reason: collision with root package name */
    public d[] f35676a1 = null;

    /* renamed from: b1, reason: collision with root package name */
    public int[] f35677b1 = null;

    /* renamed from: d1, reason: collision with root package name */
    public int f35679d1 = 0;

    /* compiled from: Flow.java */
    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        public int f35680a;

        /* renamed from: d, reason: collision with root package name */
        public c f35683d;

        /* renamed from: e, reason: collision with root package name */
        public c f35684e;
        public c f;

        /* renamed from: g, reason: collision with root package name */
        public c f35685g;

        /* renamed from: h, reason: collision with root package name */
        public int f35686h;

        /* renamed from: i, reason: collision with root package name */
        public int f35687i;

        /* renamed from: j, reason: collision with root package name */
        public int f35688j;

        /* renamed from: k, reason: collision with root package name */
        public int f35689k;

        /* renamed from: q, reason: collision with root package name */
        public int f35694q;

        /* renamed from: b, reason: collision with root package name */
        public d f35681b = null;

        /* renamed from: c, reason: collision with root package name */
        public int f35682c = 0;

        /* renamed from: l, reason: collision with root package name */
        public int f35690l = 0;

        /* renamed from: m, reason: collision with root package name */
        public int f35691m = 0;

        /* renamed from: n, reason: collision with root package name */
        public int f35692n = 0;
        public int o = 0;

        /* renamed from: p, reason: collision with root package name */
        public int f35693p = 0;

        public a(int i10, c cVar, c cVar2, c cVar3, c cVar4, int i11) {
            this.f35686h = 0;
            this.f35687i = 0;
            this.f35688j = 0;
            this.f35689k = 0;
            this.f35694q = 0;
            this.f35680a = i10;
            this.f35683d = cVar;
            this.f35684e = cVar2;
            this.f = cVar3;
            this.f35685g = cVar4;
            this.f35686h = f.this.y0;
            this.f35687i = f.this.f35704u0;
            this.f35688j = f.this.f35708z0;
            this.f35689k = f.this.f35705v0;
            this.f35694q = i11;
        }

        public final void a(d dVar) {
            int i10 = this.f35680a;
            int i11 = 0;
            f fVar = f.this;
            if (i10 == 0) {
                int V = fVar.V(this.f35694q, dVar);
                if (dVar.V[0] == 3) {
                    this.f35693p++;
                    V = 0;
                }
                int i12 = fVar.R0;
                if (dVar.f35647j0 != 8) {
                    i11 = i12;
                }
                this.f35690l = V + i11 + this.f35690l;
                int U = fVar.U(this.f35694q, dVar);
                if (this.f35681b == null || this.f35682c < U) {
                    this.f35681b = dVar;
                    this.f35682c = U;
                    this.f35691m = U;
                }
            } else {
                int V2 = fVar.V(this.f35694q, dVar);
                int U2 = fVar.U(this.f35694q, dVar);
                if (dVar.V[1] == 3) {
                    this.f35693p++;
                    U2 = 0;
                }
                int i13 = fVar.S0;
                if (dVar.f35647j0 != 8) {
                    i11 = i13;
                }
                this.f35691m = U2 + i11 + this.f35691m;
                if (this.f35681b == null || this.f35682c < V2) {
                    this.f35681b = dVar;
                    this.f35682c = V2;
                    this.f35690l = V2;
                }
            }
            this.o++;
        }

        public final void b(int i10, boolean z10, boolean z11) {
            f fVar;
            boolean z12;
            int i11;
            int i12;
            int i13;
            d dVar;
            int i14;
            int i15;
            char c10;
            int i16;
            float f;
            float f10;
            int i17;
            float f11;
            float f12;
            int i18;
            int i19;
            int i20;
            int i21 = this.o;
            int i22 = 0;
            while (true) {
                fVar = f.this;
                if (i22 >= i21 || (i20 = this.f35692n + i22) >= fVar.f35679d1) {
                    break;
                }
                d dVar2 = fVar.f35678c1[i20];
                if (dVar2 != null) {
                    dVar2.E();
                }
                i22++;
            }
            if (i21 != 0 && this.f35681b != null) {
                if (z11 && i10 == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                int i23 = -1;
                int i24 = -1;
                for (int i25 = 0; i25 < i21; i25++) {
                    if (z10) {
                        i19 = (i21 - 1) - i25;
                    } else {
                        i19 = i25;
                    }
                    int i26 = this.f35692n + i19;
                    if (i26 >= fVar.f35679d1) {
                        break;
                    }
                    d dVar3 = fVar.f35678c1[i26];
                    if (dVar3 != null && dVar3.f35647j0 == 0) {
                        if (i23 == -1) {
                            i23 = i25;
                        }
                        i24 = i25;
                    }
                }
                if (this.f35680a == 0) {
                    d dVar4 = this.f35681b;
                    dVar4.f35653m0 = fVar.G0;
                    int i27 = this.f35687i;
                    if (i10 > 0) {
                        i27 += fVar.S0;
                    }
                    c cVar = this.f35684e;
                    c cVar2 = dVar4.L;
                    cVar2.a(cVar, i27);
                    c cVar3 = dVar4.N;
                    if (z11) {
                        cVar3.a(this.f35685g, this.f35689k);
                    }
                    if (i10 > 0) {
                        this.f35684e.f35617d.N.a(cVar2, 0);
                    }
                    if (fVar.U0 == 3 && !dVar4.F) {
                        for (int i28 = 0; i28 < i21; i28++) {
                            if (z10) {
                                i18 = (i21 - 1) - i28;
                            } else {
                                i18 = i28;
                            }
                            int i29 = this.f35692n + i18;
                            if (i29 >= fVar.f35679d1) {
                                break;
                            }
                            dVar = fVar.f35678c1[i29];
                            if (dVar.F) {
                                break;
                            }
                        }
                    }
                    dVar = dVar4;
                    int i30 = 0;
                    d dVar5 = null;
                    while (i30 < i21) {
                        if (z10) {
                            i14 = (i21 - 1) - i30;
                        } else {
                            i14 = i30;
                        }
                        int i31 = this.f35692n + i14;
                        if (i31 < fVar.f35679d1) {
                            d dVar6 = fVar.f35678c1[i31];
                            if (dVar6 == null) {
                                i15 = i21;
                                c10 = 3;
                            } else {
                                c cVar4 = dVar6.K;
                                if (i30 == 0) {
                                    dVar6.g(cVar4, this.f35683d, this.f35686h);
                                }
                                if (i14 == 0) {
                                    int i32 = fVar.F0;
                                    if (z10) {
                                        i16 = i32;
                                        f = 1.0f - fVar.L0;
                                    } else {
                                        i16 = i32;
                                        f = fVar.L0;
                                    }
                                    if (this.f35692n == 0) {
                                        int i33 = fVar.H0;
                                        f10 = f;
                                        if (i33 != -1) {
                                            if (z10) {
                                                f12 = 1.0f - fVar.N0;
                                            } else {
                                                f12 = fVar.N0;
                                            }
                                            f11 = f12;
                                            i17 = i33;
                                            dVar6.f35651l0 = i17;
                                            dVar6.f35641g0 = f11;
                                        }
                                    } else {
                                        f10 = f;
                                    }
                                    if (z11 && (i17 = fVar.J0) != -1) {
                                        if (z10) {
                                            f11 = 1.0f - fVar.P0;
                                        } else {
                                            f11 = fVar.P0;
                                        }
                                    } else {
                                        i17 = i16;
                                        f11 = f10;
                                    }
                                    dVar6.f35651l0 = i17;
                                    dVar6.f35641g0 = f11;
                                }
                                if (i30 == i21 - 1) {
                                    i15 = i21;
                                    dVar6.g(dVar6.M, this.f, this.f35688j);
                                } else {
                                    i15 = i21;
                                }
                                if (dVar5 != null) {
                                    int i34 = fVar.R0;
                                    c cVar5 = dVar5.M;
                                    cVar4.a(cVar5, i34);
                                    if (i30 == i23) {
                                        int i35 = this.f35686h;
                                        if (cVar4.h()) {
                                            cVar4.f35620h = i35;
                                        }
                                    }
                                    cVar5.a(cVar4, 0);
                                    if (i30 == i24 + 1) {
                                        int i36 = this.f35688j;
                                        if (cVar5.h()) {
                                            cVar5.f35620h = i36;
                                        }
                                    }
                                }
                                if (dVar6 != dVar4) {
                                    int i37 = fVar.U0;
                                    c10 = 3;
                                    if (i37 == 3 && dVar.F && dVar6 != dVar && dVar6.F) {
                                        dVar6.O.a(dVar.O, 0);
                                    } else {
                                        c cVar6 = dVar6.L;
                                        if (i37 != 0) {
                                            c cVar7 = dVar6.N;
                                            if (i37 != 1) {
                                                if (z12) {
                                                    cVar6.a(this.f35684e, this.f35687i);
                                                    cVar7.a(this.f35685g, this.f35689k);
                                                } else {
                                                    cVar6.a(cVar2, 0);
                                                    cVar7.a(cVar3, 0);
                                                }
                                            } else {
                                                cVar7.a(cVar3, 0);
                                            }
                                        } else {
                                            cVar6.a(cVar2, 0);
                                        }
                                    }
                                } else {
                                    c10 = 3;
                                }
                                dVar5 = dVar6;
                            }
                            i30++;
                            i21 = i15;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                d dVar7 = this.f35681b;
                dVar7.f35651l0 = fVar.F0;
                int i38 = this.f35686h;
                if (i10 > 0) {
                    i38 += fVar.R0;
                }
                c cVar8 = dVar7.M;
                c cVar9 = dVar7.K;
                if (z10) {
                    cVar8.a(this.f, i38);
                    if (z11) {
                        cVar9.a(this.f35683d, this.f35688j);
                    }
                    if (i10 > 0) {
                        this.f.f35617d.K.a(cVar8, 0);
                    }
                } else {
                    cVar9.a(this.f35683d, i38);
                    if (z11) {
                        cVar8.a(this.f, this.f35688j);
                    }
                    if (i10 > 0) {
                        this.f35683d.f35617d.M.a(cVar9, 0);
                    }
                }
                int i39 = 0;
                d dVar8 = null;
                while (i39 < i21) {
                    int i40 = this.f35692n + i39;
                    if (i40 < fVar.f35679d1) {
                        d dVar9 = fVar.f35678c1[i40];
                        if (dVar9 == null) {
                            dVar9 = dVar8;
                        } else {
                            c cVar10 = dVar9.L;
                            if (i39 == 0) {
                                dVar9.g(cVar10, this.f35684e, this.f35687i);
                                int i41 = fVar.G0;
                                float f13 = fVar.M0;
                                if (this.f35692n == 0) {
                                    i13 = fVar.I0;
                                    i11 = i41;
                                    i12 = -1;
                                    if (i13 != -1) {
                                        f13 = fVar.O0;
                                        dVar9.f35653m0 = i13;
                                        dVar9.f35643h0 = f13;
                                    }
                                } else {
                                    i11 = i41;
                                    i12 = -1;
                                }
                                if (z11 && (i13 = fVar.K0) != i12) {
                                    f13 = fVar.Q0;
                                } else {
                                    i13 = i11;
                                }
                                dVar9.f35653m0 = i13;
                                dVar9.f35643h0 = f13;
                            }
                            if (i39 == i21 - 1) {
                                dVar9.g(dVar9.N, this.f35685g, this.f35689k);
                            }
                            if (dVar8 != null) {
                                int i42 = fVar.S0;
                                c cVar11 = dVar8.N;
                                cVar10.a(cVar11, i42);
                                if (i39 == i23) {
                                    int i43 = this.f35687i;
                                    if (cVar10.h()) {
                                        cVar10.f35620h = i43;
                                    }
                                }
                                cVar11.a(cVar10, 0);
                                if (i39 == i24 + 1) {
                                    int i44 = this.f35689k;
                                    if (cVar11.h()) {
                                        cVar11.f35620h = i44;
                                    }
                                }
                            }
                            if (dVar9 != dVar7) {
                                c cVar12 = dVar9.M;
                                c cVar13 = dVar9.K;
                                if (z10) {
                                    int i45 = fVar.T0;
                                    if (i45 != 0) {
                                        if (i45 != 1) {
                                            if (i45 == 2) {
                                                cVar13.a(cVar9, 0);
                                                cVar12.a(cVar8, 0);
                                            }
                                        } else {
                                            cVar13.a(cVar9, 0);
                                        }
                                    } else {
                                        cVar12.a(cVar8, 0);
                                    }
                                    i39++;
                                    dVar8 = dVar9;
                                } else {
                                    int i46 = fVar.T0;
                                    if (i46 != 0) {
                                        if (i46 != 1) {
                                            if (i46 == 2) {
                                                if (z12) {
                                                    cVar13.a(this.f35683d, this.f35686h);
                                                    cVar12.a(this.f, this.f35688j);
                                                } else {
                                                    cVar13.a(cVar9, 0);
                                                    cVar12.a(cVar8, 0);
                                                }
                                            }
                                        } else {
                                            cVar12.a(cVar8, 0);
                                        }
                                    } else {
                                        cVar13.a(cVar9, 0);
                                    }
                                    i39++;
                                    dVar8 = dVar9;
                                }
                            }
                        }
                        i39++;
                        dVar8 = dVar9;
                    } else {
                        return;
                    }
                }
            }
        }

        public final int c() {
            if (this.f35680a == 1) {
                return this.f35691m - f.this.S0;
            }
            return this.f35691m;
        }

        public final int d() {
            if (this.f35680a == 0) {
                return this.f35690l - f.this.R0;
            }
            return this.f35690l;
        }

        public final void e(int i10) {
            f fVar;
            int i11;
            int i12 = this.f35693p;
            if (i12 == 0) {
                return;
            }
            int i13 = this.o;
            int i14 = i10 / i12;
            int i15 = 0;
            while (true) {
                fVar = f.this;
                if (i15 >= i13 || (i11 = this.f35692n + i15) >= fVar.f35679d1) {
                    break;
                }
                d dVar = fVar.f35678c1[i11];
                if (this.f35680a == 0) {
                    if (dVar != null) {
                        int[] iArr = dVar.V;
                        if (iArr[0] == 3 && dVar.f35663s == 0) {
                            fVar.T(dVar, 1, i14, iArr[1], dVar.l());
                        }
                    }
                } else if (dVar != null) {
                    int[] iArr2 = dVar.V;
                    if (iArr2[1] == 3 && dVar.f35664t == 0) {
                        fVar.T(dVar, iArr2[0], dVar.r(), 1, i14);
                    }
                }
                i15++;
            }
            this.f35690l = 0;
            this.f35691m = 0;
            this.f35681b = null;
            this.f35682c = 0;
            int i16 = this.o;
            for (int i17 = 0; i17 < i16; i17++) {
                int i18 = this.f35692n + i17;
                if (i18 < fVar.f35679d1) {
                    d dVar2 = fVar.f35678c1[i18];
                    if (this.f35680a == 0) {
                        int r10 = dVar2.r();
                        int i19 = fVar.R0;
                        if (dVar2.f35647j0 == 8) {
                            i19 = 0;
                        }
                        this.f35690l = r10 + i19 + this.f35690l;
                        int U = fVar.U(this.f35694q, dVar2);
                        if (this.f35681b == null || this.f35682c < U) {
                            this.f35681b = dVar2;
                            this.f35682c = U;
                            this.f35691m = U;
                        }
                    } else {
                        int V = fVar.V(this.f35694q, dVar2);
                        int U2 = fVar.U(this.f35694q, dVar2);
                        int i20 = fVar.S0;
                        if (dVar2.f35647j0 == 8) {
                            i20 = 0;
                        }
                        this.f35691m = U2 + i20 + this.f35691m;
                        if (this.f35681b == null || this.f35682c < V) {
                            this.f35681b = dVar2;
                            this.f35682c = V;
                            this.f35690l = V;
                        }
                    }
                } else {
                    return;
                }
            }
        }

        public final void f(int i10, c cVar, c cVar2, c cVar3, c cVar4, int i11, int i12, int i13, int i14, int i15) {
            this.f35680a = i10;
            this.f35683d = cVar;
            this.f35684e = cVar2;
            this.f = cVar3;
            this.f35685g = cVar4;
            this.f35686h = i11;
            this.f35687i = i12;
            this.f35688j = i13;
            this.f35689k = i14;
            this.f35694q = i15;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:166:0x081d  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x082e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x084b  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x084d  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0830  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x081f  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0413  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:277:0x050a -> B:217:0x0519). Please report as a decompilation issue!!! */
    @Override // u.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S(int r38, int r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 2130
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u.f.S(int, int, int, int):void");
    }

    public final int U(int i10, d dVar) {
        if (dVar == null) {
            return 0;
        }
        int[] iArr = dVar.V;
        if (iArr[1] == 3) {
            int i11 = dVar.f35664t;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (dVar.A * i10);
                if (i12 != dVar.l()) {
                    dVar.f35640g = true;
                    T(dVar, iArr[0], dVar.r(), 1, i12);
                }
                return i12;
            }
            if (i11 == 1) {
                return dVar.l();
            }
            if (i11 == 3) {
                return (int) ((dVar.r() * dVar.Z) + 0.5f);
            }
        }
        return dVar.l();
    }

    public final int V(int i10, d dVar) {
        if (dVar == null) {
            return 0;
        }
        int[] iArr = dVar.V;
        if (iArr[0] == 3) {
            int i11 = dVar.f35663s;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (dVar.f35668x * i10);
                if (i12 != dVar.r()) {
                    dVar.f35640g = true;
                    T(dVar, 1, i12, iArr[1], dVar.l());
                }
                return i12;
            }
            if (i11 == 1) {
                return dVar.r();
            }
            if (i11 == 3) {
                return (int) ((dVar.l() * dVar.Z) + 0.5f);
            }
        }
        return dVar.r();
    }

    @Override // u.d
    public final void c(s.c cVar, boolean z10) {
        boolean z11;
        boolean z12;
        d dVar;
        float f;
        int i10;
        boolean z13;
        super.c(cVar, z10);
        d dVar2 = this.W;
        if (dVar2 != null && ((e) dVar2).f35674x0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i11 = this.V0;
        ArrayList<a> arrayList = this.Y0;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        int size = arrayList.size();
                        for (int i12 = 0; i12 < size; i12++) {
                            a aVar = arrayList.get(i12);
                            if (i12 == size - 1) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            aVar.b(i12, z11, z13);
                        }
                    }
                } else if (this.f35677b1 != null && this.f35676a1 != null && this.Z0 != null) {
                    for (int i13 = 0; i13 < this.f35679d1; i13++) {
                        this.f35678c1[i13].E();
                    }
                    int[] iArr = this.f35677b1;
                    int i14 = iArr[0];
                    int i15 = iArr[1];
                    float f10 = this.L0;
                    d dVar3 = null;
                    int i16 = 0;
                    while (i16 < i14) {
                        if (z11) {
                            i10 = (i14 - i16) - 1;
                            f = 1.0f - this.L0;
                        } else {
                            f = f10;
                            i10 = i16;
                        }
                        d dVar4 = this.f35676a1[i10];
                        if (dVar4 != null && dVar4.f35647j0 != 8) {
                            c cVar2 = dVar4.K;
                            if (i16 == 0) {
                                dVar4.g(cVar2, this.K, this.y0);
                                dVar4.f35651l0 = this.F0;
                                dVar4.f35641g0 = f;
                            }
                            if (i16 == i14 - 1) {
                                dVar4.g(dVar4.M, this.M, this.f35708z0);
                            }
                            if (i16 > 0 && dVar3 != null) {
                                int i17 = this.R0;
                                c cVar3 = dVar3.M;
                                dVar4.g(cVar2, cVar3, i17);
                                dVar3.g(cVar3, cVar2, 0);
                            }
                            dVar3 = dVar4;
                        }
                        i16++;
                        f10 = f;
                    }
                    for (int i18 = 0; i18 < i15; i18++) {
                        d dVar5 = this.Z0[i18];
                        if (dVar5 != null && dVar5.f35647j0 != 8) {
                            c cVar4 = dVar5.L;
                            if (i18 == 0) {
                                dVar5.g(cVar4, this.L, this.f35704u0);
                                dVar5.f35653m0 = this.G0;
                                dVar5.f35643h0 = this.M0;
                            }
                            if (i18 == i15 - 1) {
                                dVar5.g(dVar5.N, this.N, this.f35705v0);
                            }
                            if (i18 > 0 && dVar3 != null) {
                                int i19 = this.S0;
                                c cVar5 = dVar3.N;
                                dVar5.g(cVar4, cVar5, i19);
                                dVar3.g(cVar5, cVar4, 0);
                            }
                            dVar3 = dVar5;
                        }
                    }
                    for (int i20 = 0; i20 < i14; i20++) {
                        for (int i21 = 0; i21 < i15; i21++) {
                            int i22 = (i21 * i14) + i20;
                            if (this.X0 == 1) {
                                i22 = (i20 * i15) + i21;
                            }
                            d[] dVarArr = this.f35678c1;
                            if (i22 < dVarArr.length && (dVar = dVarArr[i22]) != null && dVar.f35647j0 != 8) {
                                d dVar6 = this.f35676a1[i20];
                                d dVar7 = this.Z0[i21];
                                if (dVar != dVar6) {
                                    dVar.g(dVar.K, dVar6.K, 0);
                                    dVar.g(dVar.M, dVar6.M, 0);
                                }
                                if (dVar != dVar7) {
                                    dVar.g(dVar.L, dVar7.L, 0);
                                    dVar.g(dVar.N, dVar7.N, 0);
                                }
                            }
                        }
                    }
                }
            } else {
                int size2 = arrayList.size();
                for (int i23 = 0; i23 < size2; i23++) {
                    a aVar2 = arrayList.get(i23);
                    if (i23 == size2 - 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    aVar2.b(i23, z11, z12);
                }
            }
        } else if (arrayList.size() > 0) {
            arrayList.get(0).b(0, z11, true);
        }
        this.A0 = false;
    }
}
