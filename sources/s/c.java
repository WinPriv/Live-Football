package s;

import com.huawei.hms.ads.gl;
import java.util.Arrays;

/* compiled from: LinearSystem.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: p, reason: collision with root package name */
    public static boolean f35008p = false;

    /* renamed from: q, reason: collision with root package name */
    public static int f35009q = 1000;

    /* renamed from: c, reason: collision with root package name */
    public final e f35012c;
    public b[] f;

    /* renamed from: l, reason: collision with root package name */
    public final m2.g f35020l;
    public b o;

    /* renamed from: a, reason: collision with root package name */
    public boolean f35010a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f35011b = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f35013d = 32;

    /* renamed from: e, reason: collision with root package name */
    public int f35014e = 32;

    /* renamed from: g, reason: collision with root package name */
    public boolean f35015g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean[] f35016h = new boolean[32];

    /* renamed from: i, reason: collision with root package name */
    public int f35017i = 1;

    /* renamed from: j, reason: collision with root package name */
    public int f35018j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f35019k = 32;

    /* renamed from: m, reason: collision with root package name */
    public g[] f35021m = new g[f35009q];

    /* renamed from: n, reason: collision with root package name */
    public int f35022n = 0;

    /* compiled from: LinearSystem.java */
    /* loaded from: classes.dex */
    public interface a {
        g a(boolean[] zArr);
    }

    public c() {
        this.f = null;
        this.f = new b[32];
        s();
        m2.g gVar = new m2.g(0);
        this.f35020l = gVar;
        this.f35012c = new e(gVar);
        this.o = new b(gVar);
    }

    public static int n(u.c cVar) {
        g gVar = cVar.f35621i;
        if (gVar != null) {
            return (int) (gVar.f35036w + 0.5f);
        }
        return 0;
    }

    public final g a(int i10) {
        g gVar = (g) ((d) this.f35020l.f32647u).b();
        if (gVar == null) {
            gVar = new g(i10);
            gVar.A = i10;
        } else {
            gVar.c();
            gVar.A = i10;
        }
        int i11 = this.f35022n;
        int i12 = f35009q;
        if (i11 >= i12) {
            int i13 = i12 * 2;
            f35009q = i13;
            this.f35021m = (g[]) Arrays.copyOf(this.f35021m, i13);
        }
        g[] gVarArr = this.f35021m;
        int i14 = this.f35022n;
        this.f35022n = i14 + 1;
        gVarArr[i14] = gVar;
        return gVar;
    }

    public final void b(g gVar, g gVar2, int i10, float f, g gVar3, g gVar4, int i11, int i12) {
        b l10 = l();
        if (gVar2 == gVar3) {
            l10.f35006d.a(gVar, 1.0f);
            l10.f35006d.a(gVar4, 1.0f);
            l10.f35006d.a(gVar2, -2.0f);
        } else if (f == 0.5f) {
            l10.f35006d.a(gVar, 1.0f);
            l10.f35006d.a(gVar2, -1.0f);
            l10.f35006d.a(gVar3, -1.0f);
            l10.f35006d.a(gVar4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                l10.f35004b = (-i10) + i11;
            }
        } else if (f <= gl.Code) {
            l10.f35006d.a(gVar, -1.0f);
            l10.f35006d.a(gVar2, 1.0f);
            l10.f35004b = i10;
        } else if (f >= 1.0f) {
            l10.f35006d.a(gVar4, -1.0f);
            l10.f35006d.a(gVar3, 1.0f);
            l10.f35004b = -i11;
        } else {
            float f10 = 1.0f - f;
            l10.f35006d.a(gVar, f10 * 1.0f);
            l10.f35006d.a(gVar2, f10 * (-1.0f));
            l10.f35006d.a(gVar3, (-1.0f) * f);
            l10.f35006d.a(gVar4, 1.0f * f);
            if (i10 > 0 || i11 > 0) {
                l10.f35004b = (i11 * f) + ((-i10) * f10);
            }
        }
        if (i12 != 8) {
            l10.b(this, i12);
        }
        c(l10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b9, code lost:
    
        if (r4.D <= 1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c5, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c2, code lost:
    
        if (r4.D <= 1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00e0, code lost:
    
        if (r4.D <= 1) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00ec, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00e9, code lost:
    
        if (r4.D <= 1) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(s.b r17) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s.c.c(s.b):void");
    }

    public final void d(g gVar, int i10) {
        int i11 = gVar.f35034u;
        if (i11 == -1) {
            gVar.d(this, i10);
            for (int i12 = 0; i12 < this.f35011b + 1; i12++) {
                g gVar2 = ((g[]) this.f35020l.f32648v)[i12];
            }
            return;
        }
        if (i11 != -1) {
            b bVar = this.f[i11];
            if (bVar.f35007e) {
                bVar.f35004b = i10;
                return;
            }
            if (bVar.f35006d.b() == 0) {
                bVar.f35007e = true;
                bVar.f35004b = i10;
                return;
            }
            b l10 = l();
            if (i10 < 0) {
                l10.f35004b = i10 * (-1);
                l10.f35006d.a(gVar, 1.0f);
            } else {
                l10.f35004b = i10;
                l10.f35006d.a(gVar, -1.0f);
            }
            c(l10);
            return;
        }
        b l11 = l();
        l11.f35003a = gVar;
        float f = i10;
        gVar.f35036w = f;
        l11.f35004b = f;
        l11.f35007e = true;
        c(l11);
    }

    public final void e(g gVar, g gVar2, int i10, int i11) {
        if (i11 == 8 && gVar2.f35037x && gVar.f35034u == -1) {
            gVar.d(this, gVar2.f35036w + i10);
            return;
        }
        b l10 = l();
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            l10.f35004b = i10;
        }
        if (!z10) {
            l10.f35006d.a(gVar, -1.0f);
            l10.f35006d.a(gVar2, 1.0f);
        } else {
            l10.f35006d.a(gVar, 1.0f);
            l10.f35006d.a(gVar2, -1.0f);
        }
        if (i11 != 8) {
            l10.b(this, i11);
        }
        c(l10);
    }

    public final void f(g gVar, g gVar2, int i10, int i11) {
        b l10 = l();
        g m10 = m();
        m10.f35035v = 0;
        l10.c(gVar, gVar2, m10, i10);
        if (i11 != 8) {
            l10.f35006d.a(j(i11), (int) (l10.f35006d.f(m10) * (-1.0f)));
        }
        c(l10);
    }

    public final void g(g gVar, g gVar2, int i10, int i11) {
        b l10 = l();
        g m10 = m();
        m10.f35035v = 0;
        l10.d(gVar, gVar2, m10, i10);
        if (i11 != 8) {
            l10.f35006d.a(j(i11), (int) (l10.f35006d.f(m10) * (-1.0f)));
        }
        c(l10);
    }

    public final void h(b bVar) {
        int i10;
        if (bVar.f35007e) {
            bVar.f35003a.d(this, bVar.f35004b);
        } else {
            b[] bVarArr = this.f;
            int i11 = this.f35018j;
            bVarArr[i11] = bVar;
            g gVar = bVar.f35003a;
            gVar.f35034u = i11;
            this.f35018j = i11 + 1;
            gVar.e(this, bVar);
        }
        if (this.f35010a) {
            int i12 = 0;
            while (i12 < this.f35018j) {
                if (this.f[i12] == null) {
                    System.out.println("WTF");
                }
                b bVar2 = this.f[i12];
                if (bVar2 != null && bVar2.f35007e) {
                    bVar2.f35003a.d(this, bVar2.f35004b);
                    ((d) this.f35020l.f32646t).a(bVar2);
                    this.f[i12] = null;
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        i10 = this.f35018j;
                        if (i13 >= i10) {
                            break;
                        }
                        b[] bVarArr2 = this.f;
                        int i15 = i13 - 1;
                        b bVar3 = bVarArr2[i13];
                        bVarArr2[i15] = bVar3;
                        g gVar2 = bVar3.f35003a;
                        if (gVar2.f35034u == i13) {
                            gVar2.f35034u = i15;
                        }
                        i14 = i13;
                        i13++;
                    }
                    if (i14 < i10) {
                        this.f[i14] = null;
                    }
                    this.f35018j = i10 - 1;
                    i12--;
                }
                i12++;
            }
            this.f35010a = false;
        }
    }

    public final void i() {
        for (int i10 = 0; i10 < this.f35018j; i10++) {
            b bVar = this.f[i10];
            bVar.f35003a.f35036w = bVar.f35004b;
        }
    }

    public final g j(int i10) {
        if (this.f35017i + 1 >= this.f35014e) {
            o();
        }
        g a10 = a(4);
        int i11 = this.f35011b + 1;
        this.f35011b = i11;
        this.f35017i++;
        a10.f35033t = i11;
        a10.f35035v = i10;
        ((g[]) this.f35020l.f32648v)[i11] = a10;
        e eVar = this.f35012c;
        eVar.f35028i.f35029a = a10;
        float[] fArr = a10.f35038z;
        Arrays.fill(fArr, gl.Code);
        fArr[a10.f35035v] = 1.0f;
        eVar.j(a10);
        return a10;
    }

    public final g k(Object obj) {
        g gVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f35017i + 1 >= this.f35014e) {
            o();
        }
        if (obj instanceof u.c) {
            u.c cVar = (u.c) obj;
            gVar = cVar.f35621i;
            if (gVar == null) {
                cVar.k();
                gVar = cVar.f35621i;
            }
            int i10 = gVar.f35033t;
            m2.g gVar2 = this.f35020l;
            if (i10 == -1 || i10 > this.f35011b || ((g[]) gVar2.f32648v)[i10] == null) {
                if (i10 != -1) {
                    gVar.c();
                }
                int i11 = this.f35011b + 1;
                this.f35011b = i11;
                this.f35017i++;
                gVar.f35033t = i11;
                gVar.A = 1;
                ((g[]) gVar2.f32648v)[i11] = gVar;
            }
        }
        return gVar;
    }

    public final b l() {
        m2.g gVar = this.f35020l;
        b bVar = (b) ((d) gVar.f32646t).b();
        if (bVar == null) {
            return new b(gVar);
        }
        bVar.f35003a = null;
        bVar.f35006d.clear();
        bVar.f35004b = gl.Code;
        bVar.f35007e = false;
        return bVar;
    }

    public final g m() {
        if (this.f35017i + 1 >= this.f35014e) {
            o();
        }
        g a10 = a(3);
        int i10 = this.f35011b + 1;
        this.f35011b = i10;
        this.f35017i++;
        a10.f35033t = i10;
        ((g[]) this.f35020l.f32648v)[i10] = a10;
        return a10;
    }

    public final void o() {
        int i10 = this.f35013d * 2;
        this.f35013d = i10;
        this.f = (b[]) Arrays.copyOf(this.f, i10);
        m2.g gVar = this.f35020l;
        gVar.f32648v = (g[]) Arrays.copyOf((g[]) gVar.f32648v, this.f35013d);
        int i11 = this.f35013d;
        this.f35016h = new boolean[i11];
        this.f35014e = i11;
        this.f35019k = i11;
    }

    public final void p() throws Exception {
        e eVar = this.f35012c;
        if (eVar.e()) {
            i();
            return;
        }
        if (this.f35015g) {
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 < this.f35018j) {
                    if (!this.f[i10].f35007e) {
                        break;
                    } else {
                        i10++;
                    }
                } else {
                    z10 = true;
                    break;
                }
            }
            if (!z10) {
                q(eVar);
                return;
            } else {
                i();
                return;
            }
        }
        q(eVar);
    }

    public final void q(e eVar) throws Exception {
        float f;
        int i10;
        boolean z10;
        int i11 = 0;
        while (true) {
            int i12 = this.f35018j;
            f = gl.Code;
            i10 = 1;
            if (i11 < i12) {
                b bVar = this.f[i11];
                if (bVar.f35003a.A != 1 && bVar.f35004b < gl.Code) {
                    z10 = true;
                    break;
                }
                i11++;
            } else {
                z10 = false;
                break;
            }
        }
        if (z10) {
            boolean z11 = false;
            int i13 = 0;
            while (!z11) {
                i13 += i10;
                float f10 = Float.MAX_VALUE;
                int i14 = -1;
                int i15 = -1;
                int i16 = 0;
                int i17 = 0;
                while (i16 < this.f35018j) {
                    b bVar2 = this.f[i16];
                    if (bVar2.f35003a.A != i10 && !bVar2.f35007e && bVar2.f35004b < f) {
                        int b10 = bVar2.f35006d.b();
                        int i18 = 0;
                        while (i18 < b10) {
                            g e10 = bVar2.f35006d.e(i18);
                            float f11 = bVar2.f35006d.f(e10);
                            if (f11 > f) {
                                for (int i19 = 0; i19 < 9; i19++) {
                                    float f12 = e10.y[i19] / f11;
                                    if ((f12 < f10 && i19 == i17) || i19 > i17) {
                                        i15 = e10.f35033t;
                                        i17 = i19;
                                        f10 = f12;
                                        i14 = i16;
                                    }
                                }
                            }
                            i18++;
                            f = gl.Code;
                        }
                    }
                    i16++;
                    f = gl.Code;
                    i10 = 1;
                }
                if (i14 != -1) {
                    b bVar3 = this.f[i14];
                    bVar3.f35003a.f35034u = -1;
                    bVar3.g(((g[]) this.f35020l.f32648v)[i15]);
                    g gVar = bVar3.f35003a;
                    gVar.f35034u = i14;
                    gVar.e(this, bVar3);
                } else {
                    z11 = true;
                }
                if (i13 > this.f35017i / 2) {
                    z11 = true;
                }
                f = gl.Code;
                i10 = 1;
            }
        }
        r(eVar);
        i();
    }

    public final void r(b bVar) {
        for (int i10 = 0; i10 < this.f35017i; i10++) {
            this.f35016h[i10] = false;
        }
        boolean z10 = false;
        int i11 = 0;
        while (!z10) {
            i11++;
            if (i11 >= this.f35017i * 2) {
                return;
            }
            g gVar = bVar.f35003a;
            if (gVar != null) {
                this.f35016h[gVar.f35033t] = true;
            }
            g a10 = bVar.a(this.f35016h);
            if (a10 != null) {
                boolean[] zArr = this.f35016h;
                int i12 = a10.f35033t;
                if (zArr[i12]) {
                    return;
                } else {
                    zArr[i12] = true;
                }
            }
            if (a10 != null) {
                float f = Float.MAX_VALUE;
                int i13 = -1;
                for (int i14 = 0; i14 < this.f35018j; i14++) {
                    b bVar2 = this.f[i14];
                    if (bVar2.f35003a.A != 1 && !bVar2.f35007e && bVar2.f35006d.i(a10)) {
                        float f10 = bVar2.f35006d.f(a10);
                        if (f10 < gl.Code) {
                            float f11 = (-bVar2.f35004b) / f10;
                            if (f11 < f) {
                                i13 = i14;
                                f = f11;
                            }
                        }
                    }
                }
                if (i13 > -1) {
                    b bVar3 = this.f[i13];
                    bVar3.f35003a.f35034u = -1;
                    bVar3.g(a10);
                    g gVar2 = bVar3.f35003a;
                    gVar2.f35034u = i13;
                    gVar2.e(this, bVar3);
                }
            } else {
                z10 = true;
            }
        }
    }

    public final void s() {
        for (int i10 = 0; i10 < this.f35018j; i10++) {
            b bVar = this.f[i10];
            if (bVar != null) {
                ((d) this.f35020l.f32646t).a(bVar);
            }
            this.f[i10] = null;
        }
    }

    public final void t() {
        m2.g gVar;
        int i10 = 0;
        while (true) {
            gVar = this.f35020l;
            g[] gVarArr = (g[]) gVar.f32648v;
            if (i10 >= gVarArr.length) {
                break;
            }
            g gVar2 = gVarArr[i10];
            if (gVar2 != null) {
                gVar2.c();
            }
            i10++;
        }
        d dVar = (d) gVar.f32647u;
        g[] gVarArr2 = this.f35021m;
        int i11 = this.f35022n;
        dVar.getClass();
        if (i11 > gVarArr2.length) {
            i11 = gVarArr2.length;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            g gVar3 = gVarArr2[i12];
            int i13 = dVar.f35025c;
            Object[] objArr = (Object[]) dVar.f35024b;
            if (i13 < objArr.length) {
                objArr[i13] = gVar3;
                dVar.f35025c = i13 + 1;
            }
        }
        this.f35022n = 0;
        Arrays.fill((g[]) gVar.f32648v, (Object) null);
        this.f35011b = 0;
        e eVar = this.f35012c;
        eVar.f35027h = 0;
        eVar.f35004b = gl.Code;
        this.f35017i = 1;
        for (int i14 = 0; i14 < this.f35018j; i14++) {
            b bVar = this.f[i14];
        }
        s();
        this.f35018j = 0;
        this.o = new b(gVar);
    }
}
