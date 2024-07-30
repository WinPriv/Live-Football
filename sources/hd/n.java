package hd;

import com.esotericsoftware.kryo.util.DefaultClassResolver;

/* loaded from: classes2.dex */
public final class n extends m {
    public int[] A;
    public int[] B;
    public int C;
    public j D;
    public j E;
    public int F;
    public b G;
    public int H;
    public b I;
    public int J;
    public b K;
    public int L;
    public b M;
    public int N;
    public a O;
    public a P;
    public boolean Q;
    public int R;
    public final int S;
    public final l T;
    public l U;
    public l V;
    public int W;
    public int X;

    /* renamed from: c, reason: collision with root package name */
    public final d f28931c;

    /* renamed from: d, reason: collision with root package name */
    public final int f28932d;

    /* renamed from: e, reason: collision with root package name */
    public final int f28933e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final String f28934g;

    /* renamed from: h, reason: collision with root package name */
    public final String f28935h;

    /* renamed from: i, reason: collision with root package name */
    public final int f28936i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f28937j;

    /* renamed from: k, reason: collision with root package name */
    public b f28938k;

    /* renamed from: l, reason: collision with root package name */
    public a f28939l;

    /* renamed from: m, reason: collision with root package name */
    public a f28940m;

    /* renamed from: n, reason: collision with root package name */
    public a f28941n;
    public a o;

    /* renamed from: p, reason: collision with root package name */
    public a[] f28942p;

    /* renamed from: q, reason: collision with root package name */
    public a[] f28943q;

    /* renamed from: r, reason: collision with root package name */
    public int f28944r;

    /* renamed from: s, reason: collision with root package name */
    public a4.j f28945s;

    /* renamed from: t, reason: collision with root package name */
    public b f28946t = new b();

    /* renamed from: u, reason: collision with root package name */
    public int f28947u;

    /* renamed from: v, reason: collision with root package name */
    public int f28948v;

    /* renamed from: w, reason: collision with root package name */
    public int f28949w;

    /* renamed from: x, reason: collision with root package name */
    public int f28950x;
    public b y;

    /* renamed from: z, reason: collision with root package name */
    public int f28951z;

    public n(d dVar, int i10, String str, String str2, String str3, String[] strArr, boolean z10, boolean z11) {
        if (dVar.H == null) {
            dVar.H = this;
        } else {
            dVar.I.f28930b = this;
        }
        dVar.I = this;
        this.f28931c = dVar;
        this.f28932d = i10;
        if ("<init>".equals(str)) {
            this.f28932d = 524288 | i10;
        }
        this.f28933e = dVar.x0(str);
        this.f = dVar.x0(str2);
        this.f28934g = str2;
        this.f28935h = str3;
        int i11 = 0;
        if (strArr != null && strArr.length > 0) {
            int length = strArr.length;
            this.f28936i = length;
            this.f28937j = new int[length];
            for (int i12 = 0; i12 < this.f28936i; i12++) {
                this.f28937j[i12] = dVar.v0(strArr[i12]);
            }
        }
        if (!z11) {
            if (z10) {
                i11 = 1;
            } else {
                i11 = 2;
            }
        }
        this.S = i11;
        if (z10 || z11) {
            int c10 = p.c(this.f28934g) >> 2;
            c10 = (i10 & 8) != 0 ? c10 - 1 : c10;
            this.f28948v = c10;
            this.f28949w = c10;
            l lVar = new l();
            this.T = lVar;
            lVar.f28919a |= 8;
            C(lVar);
        }
    }

    public static int h(int i10, int i11, int[] iArr, int[] iArr2) {
        int i12 = i11 - i10;
        for (int i13 = 0; i13 < iArr.length; i13++) {
            int i14 = iArr[i13];
            if (i10 < i14 && i14 <= i11) {
                i12 += iArr2[i13];
            } else if (i11 < i14 && i14 <= i10) {
                i12 -= iArr2[i13];
            }
        }
        return i12;
    }

    public static int i(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & DefaultClassResolver.NAME) | ((bArr[i10] & DefaultClassResolver.NAME) << 24) | ((bArr[i10 + 1] & DefaultClassResolver.NAME) << 16) | ((bArr[i10 + 2] & DefaultClassResolver.NAME) << 8);
    }

    public static void p(int[] iArr, int[] iArr2, l lVar) {
        if ((lVar.f28919a & 4) == 0) {
            lVar.f28921c = h(0, lVar.f28921c, iArr, iArr2);
            lVar.f28919a |= 4;
        }
    }

    public static int s(byte[] bArr, int i10) {
        return (bArr[i10 + 1] & DefaultClassResolver.NAME) | ((bArr[i10] & DefaultClassResolver.NAME) << 8);
    }

    public final void A(int i10, int i11) {
        this.N = this.f28946t.f28833b;
        l lVar = this.V;
        if (lVar != null) {
            if (this.S == 0) {
                lVar.f28925h.e(i10, i11, null, null);
            } else if (i10 != 188) {
                int i12 = this.W + 1;
                if (i12 > this.X) {
                    this.X = i12;
                }
                this.W = i12;
            }
        }
        if (i10 == 17) {
            this.f28946t.c(i10, i11);
        } else {
            this.f28946t.b(i10, i11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(int r9, hd.l r10) {
        /*
            r8 = this;
            hd.b r0 = r8.f28946t
            int r0 = r0.f28833b
            r8.N = r0
            hd.l r0 = r8.V
            r1 = 168(0xa8, float:2.35E-43)
            r2 = 167(0xa7, float:2.34E-43)
            r3 = 0
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L5e
            int r6 = r8.S
            if (r6 != 0) goto L2f
            hd.h r0 = r0.f28925h
            r0.e(r9, r3, r5, r5)
            hd.l r0 = r10.a()
            int r6 = r0.f28919a
            r6 = r6 | 16
            r0.f28919a = r6
            r8.l(r3, r10)
            if (r9 == r2) goto L5e
            hd.l r5 = new hd.l
            r5.<init>()
            goto L5e
        L2f:
            if (r9 != r1) goto L52
            int r5 = r10.f28919a
            r6 = r5 & 512(0x200, float:7.17E-43)
            if (r6 != 0) goto L40
            r5 = r5 | 512(0x200, float:7.17E-43)
            r10.f28919a = r5
            int r5 = r8.R
            int r5 = r5 + r4
            r8.R = r5
        L40:
            int r5 = r0.f28919a
            r5 = r5 | 128(0x80, float:1.8E-43)
            r0.f28919a = r5
            int r0 = r8.W
            int r0 = r0 + r4
            r8.l(r0, r10)
            hd.l r5 = new hd.l
            r5.<init>()
            goto L5e
        L52:
            int r0 = r8.W
            int[] r6 = hd.h.f28894i
            r6 = r6[r9]
            int r0 = r0 + r6
            r8.W = r0
            r8.l(r0, r10)
        L5e:
            int r0 = r10.f28919a
            r0 = r0 & 2
            if (r0 == 0) goto La7
            int r0 = r10.f28921c
            hd.b r6 = r8.f28946t
            int r7 = r6.f28833b
            int r0 = r0 - r7
            r7 = -32768(0xffffffffffff8000, float:NaN)
            if (r0 >= r7) goto La7
            r0 = 200(0xc8, float:2.8E-43)
            if (r9 != r2) goto L74
            goto L78
        L74:
            if (r9 != r1) goto L7c
            r0 = 201(0xc9, float:2.82E-43)
        L78:
            r6.e(r0)
            goto L9e
        L7c:
            if (r5 == 0) goto L84
            int r1 = r5.f28919a
            r1 = r1 | 16
            r5.f28919a = r1
        L84:
            r1 = 166(0xa6, float:2.33E-43)
            if (r9 > r1) goto L8d
            int r1 = r9 + 1
            r1 = r1 ^ r4
            int r1 = r1 - r4
            goto L8f
        L8d:
            r1 = r9 ^ 1
        L8f:
            r6.e(r1)
            hd.b r1 = r8.f28946t
            r3 = 8
            r1.i(r3)
            hd.b r1 = r8.f28946t
            r1.e(r0)
        L9e:
            hd.b r0 = r8.f28946t
            int r1 = r0.f28833b
            int r1 = r1 - r4
            r10.c(r0, r1, r4)
            goto Lb4
        La7:
            hd.b r0 = r8.f28946t
            r0.e(r9)
            hd.b r0 = r8.f28946t
            int r1 = r0.f28833b
            int r1 = r1 - r4
            r10.c(r0, r1, r3)
        Lb4:
            hd.l r10 = r8.V
            if (r10 == 0) goto Lc2
            if (r5 == 0) goto Lbd
            r8.C(r5)
        Lbd:
            if (r9 != r2) goto Lc2
            r8.t()
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hd.n.B(int, hd.l):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
    
        if (r0 != null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(hd.l r6) {
        /*
            r5 = this;
            boolean r0 = r5.Q
            hd.b r1 = r5.f28946t
            int r2 = r1.f28833b
            byte[] r1 = r1.f28832a
            boolean r1 = r6.d(r2, r1)
            r0 = r0 | r1
            r5.Q = r0
            int r0 = r6.f28919a
            r1 = r0 & 1
            if (r1 == 0) goto L16
            return
        L16:
            r1 = 0
            int r2 = r5.S
            if (r2 != 0) goto L5d
            hd.l r2 = r5.V
            if (r2 == 0) goto L34
            int r3 = r6.f28921c
            int r4 = r2.f28921c
            if (r3 != r4) goto L31
            int r1 = r2.f28919a
            r0 = r0 & 16
            r0 = r0 | r1
            r2.f28919a = r0
            hd.h r0 = r2.f28925h
            r6.f28925h = r0
            return
        L31:
            r5.l(r1, r6)
        L34:
            r5.V = r6
            hd.h r0 = r6.f28925h
            if (r0 != 0) goto L43
            hd.h r0 = new hd.h
            r0.<init>()
            r6.f28925h = r0
            r0.f28895a = r6
        L43:
            hd.l r0 = r5.U
            if (r0 == 0) goto L79
            int r1 = r6.f28921c
            int r2 = r0.f28921c
            if (r1 != r2) goto L77
            int r1 = r0.f28919a
            int r2 = r6.f28919a
            r2 = r2 & 16
            r1 = r1 | r2
            r0.f28919a = r1
            hd.h r1 = r0.f28925h
            r6.f28925h = r1
            r5.V = r0
            return
        L5d:
            r0 = 1
            if (r2 != r0) goto L7b
            hd.l r0 = r5.V
            if (r0 == 0) goto L6d
            int r2 = r5.X
            r0.f28924g = r2
            int r0 = r5.W
            r5.l(r0, r6)
        L6d:
            r5.V = r6
            r5.W = r1
            r5.X = r1
            hd.l r0 = r5.U
            if (r0 == 0) goto L79
        L77:
            r0.f28926i = r6
        L79:
            r5.U = r6
        L7b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hd.n.C(hd.l):void");
    }

    public final void D(int i10, l lVar) {
        if (this.M == null) {
            this.M = new b();
        }
        this.L++;
        this.M.i(lVar.f28921c);
        this.M.i(i10);
    }

    public final a E(int i10, q qVar, l[] lVarArr, l[] lVarArr2, int[] iArr, String str, boolean z10) {
        b bVar = new b();
        bVar.e(i10 >>> 24);
        bVar.i(lVarArr.length);
        for (int i11 = 0; i11 < lVarArr.length; i11++) {
            bVar.i(lVarArr[i11].f28921c);
            bVar.i(lVarArr2[i11].f28921c - lVarArr[i11].f28921c);
            bVar.i(iArr[i11]);
        }
        if (qVar == null) {
            bVar.e(0);
        } else {
            byte[] bArr = qVar.f28970a;
            int i12 = qVar.f28971b;
            bVar.f(bArr, i12, (bArr[i12] * 2) + 1);
        }
        bVar.i(this.f28931c.x0(str));
        bVar.i(0);
        a aVar = new a(this.f28931c, true, bVar, bVar, bVar.f28833b - 2);
        if (z10) {
            aVar.f28830g = this.O;
            this.O = aVar;
        } else {
            aVar.f28830g = this.P;
            this.P = aVar;
        }
        return aVar;
    }

    public final a F(int i10, String str, boolean z10) {
        b bVar = new b();
        if ("Ljava/lang/Synthetic;".equals(str)) {
            this.f28944r = Math.max(this.f28944r, i10 + 1);
            return new a(this.f28931c, false, bVar, null, 0);
        }
        bVar.i(this.f28931c.x0(str));
        bVar.i(0);
        a aVar = new a(this.f28931c, true, bVar, bVar, 2);
        String str2 = this.f28934g;
        if (z10) {
            if (this.f28942p == null) {
                this.f28942p = new a[p.b(str2).length];
            }
            a[] aVarArr = this.f28942p;
            aVar.f28830g = aVarArr[i10];
            aVarArr[i10] = aVar;
        } else {
            if (this.f28943q == null) {
                this.f28943q = new a[p.b(str2).length];
            }
            a[] aVarArr2 = this.f28943q;
            aVar.f28830g = aVarArr2[i10];
            aVarArr2[i10] = aVar;
        }
        return aVar;
    }

    public final void G(int i10, int i11, l lVar, l... lVarArr) {
        b bVar = this.f28946t;
        int i12 = bVar.f28833b;
        this.N = i12;
        bVar.e(170);
        b bVar2 = this.f28946t;
        bVar2.f(null, 0, (4 - (bVar2.f28833b % 4)) % 4);
        lVar.c(this.f28946t, i12, true);
        b bVar3 = this.f28946t;
        bVar3.g(i10);
        bVar3.g(i11);
        for (l lVar2 : lVarArr) {
            lVar2.c(this.f28946t, i12, true);
        }
        n(lVar, lVarArr);
    }

    public final a H(int i10, q qVar, String str, boolean z10) {
        b bVar = new b();
        a.b(i10, qVar, bVar);
        bVar.i(this.f28931c.x0(str));
        bVar.i(0);
        a aVar = new a(this.f28931c, true, bVar, bVar, bVar.f28833b - 2);
        if (z10) {
            aVar.f28830g = this.f28941n;
            this.f28941n = aVar;
        } else {
            aVar.f28830g = this.o;
            this.o = aVar;
        }
        return aVar;
    }

    @Override // hd.m
    public final void a(int i10) {
        b bVar = this.f28946t;
        this.N = bVar.f28833b;
        bVar.e(i10);
        l lVar = this.V;
        if (lVar != null) {
            if (this.S == 0) {
                lVar.f28925h.e(i10, 0, null, null);
            } else {
                int i11 = this.W + h.f28894i[i10];
                if (i11 > this.X) {
                    this.X = i11;
                }
                this.W = i11;
            }
            if ((i10 >= 172 && i10 <= 177) || i10 == 191) {
                t();
            }
        }
    }

    @Override // hd.m
    public final void b(Object obj) {
        b bVar;
        int i10;
        int i11;
        this.N = this.f28946t.f28833b;
        d dVar = this.f28931c;
        k n02 = dVar.n0(obj);
        l lVar = this.V;
        if (lVar != null) {
            if (this.S == 0) {
                lVar.f28925h.e(18, 0, dVar, n02);
            } else {
                int i12 = n02.f28912b;
                if (i12 != 5 && i12 != 6) {
                    i11 = this.W + 1;
                } else {
                    i11 = this.W + 2;
                }
                if (i11 > this.X) {
                    this.X = i11;
                }
                this.W = i11;
            }
        }
        int i13 = n02.f28912b;
        int i14 = n02.f28911a;
        if (i13 != 5 && i13 != 6) {
            if (i14 >= 256) {
                bVar = this.f28946t;
                i10 = 19;
            } else {
                this.f28946t.b(18, i14);
                return;
            }
        } else {
            bVar = this.f28946t;
            i10 = 20;
        }
        bVar.c(i10, i14);
    }

    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0030. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:77:0x0132. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0579 A[SYNTHETIC] */
    @Override // hd.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(int r26, int r27) {
        /*
            Method dump skipped, instructions count: 1874
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hd.n.c(int, int):void");
    }

    @Override // hd.m
    public final void e(int i10, String str, String str2, String str3, boolean z10) {
        int i11;
        this.N = this.f28946t.f28833b;
        d dVar = this.f28931c;
        k q02 = dVar.q0(str, str2, str3, z10);
        int i12 = q02.f28913c;
        l lVar = this.V;
        if (lVar != null) {
            if (this.S == 0) {
                lVar.f28925h.e(i10, 0, dVar, q02);
            } else {
                if (i12 == 0) {
                    i12 = p.c(str3);
                    q02.f28913c = i12;
                }
                if (i10 == 184) {
                    i11 = (this.W - (i12 >> 2)) + (i12 & 3) + 1;
                } else {
                    i11 = (this.W - (i12 >> 2)) + (i12 & 3);
                }
                if (i11 > this.X) {
                    this.X = i11;
                }
                this.W = i11;
            }
        }
        int i13 = q02.f28911a;
        if (i10 == 185) {
            if (i12 == 0) {
                i12 = p.c(str3);
                q02.f28913c = i12;
            }
            b bVar = this.f28946t;
            bVar.c(185, i13);
            bVar.b(i12 >> 2, 0);
            return;
        }
        this.f28946t.c(i10, i13);
    }

    @Override // hd.m
    public final void f(int i10, String str) {
        this.N = this.f28946t.f28833b;
        d dVar = this.f28931c;
        k o02 = dVar.o0(str);
        l lVar = this.V;
        if (lVar != null) {
            if (this.S == 0) {
                lVar.f28925h.e(i10, this.f28946t.f28833b, dVar, o02);
            } else if (i10 == 187) {
                int i11 = this.W + 1;
                if (i11 > this.X) {
                    this.X = i11;
                }
                this.W = i11;
            }
        }
        this.f28946t.c(i10, o02.f28911a);
    }

    @Override // hd.m
    public final void g(int i10, int i11) {
        int i12;
        int i13;
        this.N = this.f28946t.f28833b;
        l lVar = this.V;
        int i14 = this.S;
        if (lVar != null) {
            if (i14 == 0) {
                lVar.f28925h.e(i10, i11, null, null);
            } else if (i10 == 169) {
                lVar.f28919a |= 256;
                lVar.f = this.W;
                t();
            } else {
                int i15 = this.W + h.f28894i[i10];
                if (i15 > this.X) {
                    this.X = i15;
                }
                this.W = i15;
            }
        }
        if (i14 != 2) {
            if (i10 != 22 && i10 != 24 && i10 != 55 && i10 != 57) {
                i13 = i11 + 1;
            } else {
                i13 = i11 + 2;
            }
            if (i13 > this.f28948v) {
                this.f28948v = i13;
            }
        }
        if (i11 < 4 && i10 != 169) {
            if (i10 < 54) {
                i12 = ((i10 - 21) << 2) + 26;
            } else {
                i12 = ((i10 - 54) << 2) + 59;
            }
            this.f28946t.e(i12 + i11);
        } else {
            b bVar = this.f28946t;
            if (i11 >= 256) {
                bVar.e(196);
                bVar.c(i10, i11);
            } else {
                bVar.b(i10, i11);
            }
        }
        if (i10 >= 54 && i14 == 0 && this.C > 0) {
            C(new l());
        }
    }

    public final void j(int i10, int i11) {
        char c10;
        b bVar;
        String stringBuffer;
        int v02;
        while (i10 < i11) {
            int i12 = this.B[i10];
            int i13 = (-268435456) & i12;
            d dVar = this.f28931c;
            if (i13 == 0) {
                int i14 = i12 & 1048575;
                int i15 = i12 & 267386880;
                if (i15 != 24117248) {
                    if (i15 != 25165824) {
                        this.y.e(i14);
                        i10++;
                    } else {
                        bVar = this.y;
                        bVar.e(8);
                        v02 = dVar.f28847j[i14].f28913c;
                        bVar.i(v02);
                        i10++;
                    }
                } else {
                    bVar = this.y;
                    bVar.e(7);
                    stringBuffer = dVar.f28847j[i14].f28915e;
                }
            } else {
                StringBuffer stringBuffer2 = new StringBuffer();
                int i16 = i13 >> 28;
                while (true) {
                    int i17 = i16 - 1;
                    if (i16 > 0) {
                        stringBuffer2.append('[');
                        i16 = i17;
                    } else {
                        if ((i12 & 267386880) == 24117248) {
                            stringBuffer2.append('L');
                            stringBuffer2.append(dVar.f28847j[i12 & 1048575].f28915e);
                            c10 = ';';
                        } else {
                            int i18 = i12 & 15;
                            if (i18 != 1) {
                                if (i18 != 2) {
                                    if (i18 != 3) {
                                        switch (i18) {
                                            case 9:
                                                c10 = 'Z';
                                                break;
                                            case 10:
                                                c10 = 'B';
                                                break;
                                            case 11:
                                                c10 = 'C';
                                                break;
                                            case 12:
                                                c10 = 'S';
                                                break;
                                            default:
                                                c10 = 'J';
                                                break;
                                        }
                                    } else {
                                        c10 = 'D';
                                    }
                                } else {
                                    c10 = 'F';
                                }
                            } else {
                                c10 = 'I';
                            }
                        }
                        stringBuffer2.append(c10);
                        bVar = this.y;
                        bVar.e(7);
                        stringBuffer = stringBuffer2.toString();
                    }
                }
            }
            v02 = dVar.v0(stringBuffer);
            bVar.i(v02);
            i10++;
        }
    }

    public final void k(int i10, int i11, int i12) {
        int i13 = i11 + 3 + i12;
        int[] iArr = this.B;
        if (iArr == null || iArr.length < i13) {
            this.B = new int[i13];
        }
        int[] iArr2 = this.B;
        iArr2[0] = i10;
        iArr2[1] = i11;
        iArr2[2] = i12;
    }

    public final void l(int i10, l lVar) {
        f fVar = new f();
        fVar.f28880a = i10;
        fVar.f28881b = lVar;
        l lVar2 = this.V;
        fVar.f28882c = lVar2.f28927j;
        lVar2.f28927j = fVar;
    }

    public final void m(b bVar) {
        int i10;
        int i11;
        boolean z10;
        String str;
        int i12 = this.f28932d;
        int i13 = 262144 & i12;
        bVar.i((~((i13 / 64) | 917504)) & i12);
        bVar.i(this.f28933e);
        bVar.i(this.f);
        if (this.f28946t.f28833b > 0) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i14 = this.f28936i;
        if (i14 > 0) {
            i10++;
        }
        int i15 = i12 & 4096;
        d dVar = this.f28931c;
        if (i15 != 0 && ((dVar.f28839a & 65535) < 49 || i13 != 0)) {
            i10++;
        }
        int i16 = i12 & 131072;
        if (i16 != 0) {
            i10++;
        }
        String str2 = this.f28935h;
        if (str2 != null) {
            i10++;
        }
        if (this.G != null) {
            i10++;
        }
        if (this.f28938k != null) {
            i10++;
        }
        if (this.f28939l != null) {
            i10++;
        }
        if (this.f28940m != null) {
            i10++;
        }
        if (this.f28941n != null) {
            i10++;
        }
        if (this.o != null) {
            i10++;
        }
        if (this.f28942p != null) {
            i10++;
        }
        if (this.f28943q != null) {
            i10++;
        }
        a4.j jVar = this.f28945s;
        if (jVar != null) {
            i10 += jVar.e();
        }
        bVar.i(i10);
        int i17 = this.f28946t.f28833b;
        if (i17 > 0) {
            int i18 = (this.C * 8) + i17 + 12;
            b bVar2 = this.I;
            if (bVar2 != null) {
                i18 += bVar2.f28833b + 8;
            }
            b bVar3 = this.K;
            if (bVar3 != null) {
                i18 += bVar3.f28833b + 8;
            }
            b bVar4 = this.M;
            if (bVar4 != null) {
                i18 += bVar4.f28833b + 8;
            }
            b bVar5 = this.y;
            if (bVar5 != null) {
                i18 += bVar5.f28833b + 8;
            }
            a aVar = this.O;
            if (aVar != null) {
                i18 += aVar.a() + 8;
            }
            a aVar2 = this.P;
            if (aVar2 != null) {
                i18 += aVar2.a() + 8;
            }
            bVar.i(dVar.x0("Code"));
            bVar.g(i18);
            bVar.i(this.f28947u);
            bVar.i(this.f28948v);
            bVar.g(this.f28946t.f28833b);
            b bVar6 = this.f28946t;
            bVar.f(bVar6.f28832a, 0, bVar6.f28833b);
            bVar.i(this.C);
            if (this.C > 0) {
                for (j jVar2 = this.D; jVar2 != null; jVar2 = jVar2.f) {
                    bVar.i(jVar2.f28906a.f28921c);
                    bVar.i(jVar2.f28907b.f28921c);
                    bVar.i(jVar2.f28908c.f28921c);
                    bVar.i(jVar2.f28910e);
                }
            }
            if (this.I != null) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            if (this.K != null) {
                i11++;
            }
            if (this.M != null) {
                i11++;
            }
            if (this.y != null) {
                i11++;
            }
            if (this.O != null) {
                i11++;
            }
            if (this.P != null) {
                i11++;
            }
            bVar.i(i11);
            if (this.I != null) {
                bVar.i(dVar.x0("LocalVariableTable"));
                bVar.g(this.I.f28833b + 2);
                bVar.i(this.H);
                b bVar7 = this.I;
                bVar.f(bVar7.f28832a, 0, bVar7.f28833b);
            }
            if (this.K != null) {
                bVar.i(dVar.x0("LocalVariableTypeTable"));
                bVar.g(this.K.f28833b + 2);
                bVar.i(this.J);
                b bVar8 = this.K;
                bVar.f(bVar8.f28832a, 0, bVar8.f28833b);
            }
            if (this.M != null) {
                bVar.i(dVar.x0("LineNumberTable"));
                bVar.g(this.M.f28833b + 2);
                bVar.i(this.L);
                b bVar9 = this.M;
                bVar.f(bVar9.f28832a, 0, bVar9.f28833b);
            }
            if (this.y != null) {
                if ((dVar.f28839a & 65535) >= 50) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    str = "StackMapTable";
                } else {
                    str = "StackMap";
                }
                bVar.i(dVar.x0(str));
                bVar.g(this.y.f28833b + 2);
                bVar.i(this.f28950x);
                b bVar10 = this.y;
                bVar.f(bVar10.f28832a, 0, bVar10.f28833b);
            }
            if (this.O != null) {
                bVar.i(dVar.x0("RuntimeVisibleTypeAnnotations"));
                this.O.c(bVar);
            }
            if (this.P != null) {
                bVar.i(dVar.x0("RuntimeInvisibleTypeAnnotations"));
                this.P.c(bVar);
            }
        }
        if (i14 > 0) {
            bVar.i(dVar.x0("Exceptions"));
            bVar.g((i14 * 2) + 2);
            bVar.i(i14);
            for (int i19 = 0; i19 < i14; i19++) {
                bVar.i(this.f28937j[i19]);
            }
        }
        if (i15 != 0 && ((dVar.f28839a & 65535) < 49 || i13 != 0)) {
            bVar.i(dVar.x0("Synthetic"));
            bVar.g(0);
        }
        if (i16 != 0) {
            bVar.i(dVar.x0("Deprecated"));
            bVar.g(0);
        }
        if (str2 != null) {
            bVar.i(dVar.x0("Signature"));
            bVar.g(2);
            bVar.i(dVar.x0(str2));
        }
        if (this.G != null) {
            bVar.i(dVar.x0("MethodParameters"));
            bVar.g(this.G.f28833b + 1);
            bVar.e(this.F);
            b bVar11 = this.G;
            bVar.f(bVar11.f28832a, 0, bVar11.f28833b);
        }
        if (this.f28938k != null) {
            bVar.i(dVar.x0("AnnotationDefault"));
            bVar.g(this.f28938k.f28833b);
            b bVar12 = this.f28938k;
            bVar.f(bVar12.f28832a, 0, bVar12.f28833b);
        }
        if (this.f28939l != null) {
            bVar.i(dVar.x0("RuntimeVisibleAnnotations"));
            this.f28939l.c(bVar);
        }
        if (this.f28940m != null) {
            bVar.i(dVar.x0("RuntimeInvisibleAnnotations"));
            this.f28940m.c(bVar);
        }
        if (this.f28941n != null) {
            bVar.i(dVar.x0("RuntimeVisibleTypeAnnotations"));
            this.f28941n.c(bVar);
        }
        if (this.o != null) {
            bVar.i(dVar.x0("RuntimeInvisibleTypeAnnotations"));
            this.o.c(bVar);
        }
        if (this.f28942p != null) {
            bVar.i(dVar.x0("RuntimeVisibleParameterAnnotations"));
            a.d(this.f28942p, this.f28944r, bVar);
        }
        if (this.f28943q != null) {
            bVar.i(dVar.x0("RuntimeInvisibleParameterAnnotations"));
            a.d(this.f28943q, this.f28944r, bVar);
        }
        a4.j jVar3 = this.f28945s;
        if (jVar3 != null) {
            jVar3.d(dVar, bVar);
        }
    }

    public final void n(l lVar, l[] lVarArr) {
        l lVar2 = this.V;
        if (lVar2 != null) {
            if (this.S == 0) {
                lVar2.f28925h.e(171, 0, null, null);
                l(0, lVar);
                lVar.a().f28919a |= 16;
                for (int i10 = 0; i10 < lVarArr.length; i10++) {
                    l(0, lVarArr[i10]);
                    lVarArr[i10].a().f28919a |= 16;
                }
            } else {
                int i11 = this.W - 1;
                this.W = i11;
                l(i11, lVar);
                for (l lVar3 : lVarArr) {
                    l(this.W, lVar3);
                }
            }
            t();
        }
    }

    public final void o(Object obj) {
        b bVar;
        int i10;
        if (obj instanceof String) {
            bVar = this.y;
            bVar.e(7);
            i10 = this.f28931c.v0((String) obj);
        } else if (obj instanceof Integer) {
            this.y.e(((Integer) obj).intValue());
            return;
        } else {
            bVar = this.y;
            bVar.e(8);
            i10 = ((l) obj).f28921c;
        }
        bVar.i(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q() {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hd.n.q():void");
    }

    public final void r(h hVar) {
        int[] iArr = hVar.f28896b;
        int[] iArr2 = hVar.f28897c;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < iArr.length) {
            int i14 = iArr[i11];
            i12++;
            if (i14 != 16777216) {
                i13 += i12;
                i12 = 0;
            }
            if (i14 == 16777220 || i14 == 16777219) {
                i11++;
            }
            i11++;
        }
        int i15 = 0;
        int i16 = 0;
        while (i15 < iArr2.length) {
            int i17 = iArr2[i15];
            i16++;
            if (i17 == 16777220 || i17 == 16777219) {
                i15++;
            }
            i15++;
        }
        k(hVar.f28895a.f28921c, i13, i16);
        int i18 = 3;
        int i19 = 0;
        while (i13 > 0) {
            int i20 = iArr[i19];
            int i21 = i18 + 1;
            this.B[i18] = i20;
            if (i20 == 16777220 || i20 == 16777219) {
                i19++;
            }
            i19++;
            i13--;
            i18 = i21;
        }
        while (i10 < iArr2.length) {
            int i22 = iArr2[i10];
            int i23 = i18 + 1;
            this.B[i18] = i22;
            if (i22 == 16777220 || i22 == 16777219) {
                i10++;
            }
            i10++;
            i18 = i23;
        }
        q();
    }

    public final void t() {
        if (this.S == 0) {
            l lVar = new l();
            h hVar = new h();
            lVar.f28925h = hVar;
            hVar.f28895a = lVar;
            b bVar = this.f28946t;
            lVar.d(bVar.f28833b, bVar.f28832a);
            this.U.f28926i = lVar;
            this.U = lVar;
        } else {
            this.V.f28924g = this.X;
        }
        this.V = null;
    }

    public final a u(String str, boolean z10) {
        b bVar = new b();
        bVar.i(this.f28931c.x0(str));
        bVar.i(0);
        a aVar = new a(this.f28931c, true, bVar, bVar, 2);
        if (z10) {
            aVar.f28830g = this.f28939l;
            this.f28939l = aVar;
        } else {
            aVar.f28830g = this.f28940m;
            this.f28940m = aVar;
        }
        return aVar;
    }

    public final void v(a4.j jVar) {
        jVar.f252u = this.f28945s;
        this.f28945s = jVar;
    }

    public final void w(int i10, String str, String str2, String str3) {
        int i11;
        this.N = this.f28946t.f28833b;
        d dVar = this.f28931c;
        k p02 = dVar.p0(str, str2, str3);
        l lVar = this.V;
        if (lVar != null) {
            int i12 = 0;
            if (this.S == 0) {
                lVar.f28925h.e(i10, 0, dVar, p02);
            } else {
                char charAt = str3.charAt(0);
                int i13 = 1;
                int i14 = -2;
                switch (i10) {
                    case 178:
                        i14 = this.W;
                        if (charAt == 'D' || charAt == 'J') {
                            i13 = 2;
                        }
                        i11 = i14 + i13;
                        break;
                    case 179:
                        i13 = this.W;
                        if (charAt != 'D' && charAt != 'J') {
                            i14 = -1;
                        }
                        i11 = i14 + i13;
                        break;
                    case 180:
                        int i15 = this.W;
                        if (charAt == 'D' || charAt == 'J') {
                            i12 = 1;
                        }
                        i11 = i15 + i12;
                        break;
                    default:
                        i13 = this.W;
                        if (charAt == 'D' || charAt == 'J') {
                            i14 = -3;
                        }
                        i11 = i14 + i13;
                        break;
                }
                if (i11 > this.X) {
                    this.X = i11;
                }
                this.W = i11;
            }
        }
        this.f28946t.c(i10, p02.f28911a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x008b, code lost:
    
        if (r1.charAt(r13) == 'L') goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008d, code lost:
    
        r13 = r13 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0092, code lost:
    
        if (r1.charAt(r13) == ';') goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0095, code lost:
    
        r5 = r11 + 1;
        r13 = r13 + 1;
        r16.B[r11] = r10.t0(r1.substring(r12, r13)) | 24117248;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x006a. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(java.lang.Object[] r17, int r18, java.lang.Object[] r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hd.n.x(java.lang.Object[], int, java.lang.Object[], int, int):void");
    }

    public final void y(int i10, int i11) {
        int i12;
        this.N = this.f28946t.f28833b;
        l lVar = this.V;
        int i13 = this.S;
        if (lVar != null && i13 == 0) {
            lVar.f28925h.e(132, i10, null, null);
        }
        if (i13 != 2 && (i12 = i10 + 1) > this.f28948v) {
            this.f28948v = i12;
        }
        if (i10 <= 255 && i11 <= 127 && i11 >= -128) {
            b bVar = this.f28946t;
            bVar.e(132);
            bVar.b(i10, i11);
        } else {
            b bVar2 = this.f28946t;
            bVar2.e(196);
            bVar2.c(132, i10);
            bVar2.i(i11);
        }
    }

    public final a z(int i10, q qVar, String str, boolean z10) {
        b bVar = new b();
        a.b((i10 & (-16776961)) | (this.N << 8), qVar, bVar);
        bVar.i(this.f28931c.x0(str));
        bVar.i(0);
        a aVar = new a(this.f28931c, true, bVar, bVar, bVar.f28833b - 2);
        if (z10) {
            aVar.f28830g = this.O;
            this.O = aVar;
        } else {
            aVar.f28830g = this.P;
            this.P = aVar;
        }
        return aVar;
    }
}
