package v;

import com.huawei.hms.ads.gl;
import java.util.HashSet;
import java.util.Iterator;
import u.c;
import v.b;

/* compiled from: Direct.java */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final b.a f35884a = new b.a();

    public static boolean a(u.d dVar) {
        u.e eVar;
        boolean z10;
        boolean z11;
        int[] iArr = dVar.V;
        int i10 = iArr[0];
        int i11 = iArr[1];
        u.d dVar2 = dVar.W;
        if (dVar2 != null) {
            eVar = (u.e) dVar2;
        } else {
            eVar = null;
        }
        if (eVar != null) {
            int i12 = eVar.V[0];
        }
        if (eVar != null) {
            int i13 = eVar.V[1];
        }
        if (i10 != 1 && !dVar.B() && i10 != 2 && ((i10 != 3 || dVar.f35663s != 0 || dVar.Z != gl.Code || !dVar.u(0)) && (i10 != 3 || dVar.f35663s != 1 || !dVar.v(0, dVar.r())))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (i11 != 1 && !dVar.C() && i11 != 2 && ((i11 != 3 || dVar.f35664t != 0 || dVar.Z != gl.Code || !dVar.u(1)) && (i11 != 3 || dVar.f35664t != 1 || !dVar.v(1, dVar.l())))) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (dVar.Z > gl.Code && (z10 || z11)) {
            return true;
        }
        if (!z10 || !z11) {
            return false;
        }
        return true;
    }

    public static void b(int i10, u.d dVar, b.InterfaceC0495b interfaceC0495b, boolean z10) {
        boolean z11;
        u.c cVar;
        u.c cVar2;
        Iterator<u.c> it;
        boolean z12;
        u.c cVar3;
        u.c cVar4;
        if (dVar.f35654n) {
            return;
        }
        if (!(dVar instanceof u.e) && dVar.A() && a(dVar)) {
            u.e.V(dVar, interfaceC0495b, new b.a());
        }
        u.c j10 = dVar.j(c.a.LEFT);
        u.c j11 = dVar.j(c.a.RIGHT);
        int d10 = j10.d();
        int d11 = j11.d();
        HashSet<u.c> hashSet = j10.f35614a;
        if (hashSet != null && j10.f35616c) {
            Iterator<u.c> it2 = hashSet.iterator();
            while (it2.hasNext()) {
                u.c next = it2.next();
                u.d dVar2 = next.f35617d;
                int i11 = i10 + 1;
                boolean a10 = a(dVar2);
                if (dVar2.A() && a10) {
                    u.e.V(dVar2, interfaceC0495b, new b.a());
                }
                u.c cVar5 = dVar2.K;
                u.c cVar6 = dVar2.M;
                if ((next == cVar5 && (cVar4 = cVar6.f) != null && cVar4.f35616c) || (next == cVar6 && (cVar3 = cVar5.f) != null && cVar3.f35616c)) {
                    it = it2;
                    z12 = true;
                } else {
                    it = it2;
                    z12 = false;
                }
                int i12 = dVar2.V[0];
                if (i12 == 3 && !a10) {
                    if (i12 == 3 && dVar2.f35667w >= 0 && dVar2.f35666v >= 0 && ((dVar2.f35647j0 == 8 || (dVar2.f35663s == 0 && dVar2.Z == gl.Code)) && !dVar2.y() && !dVar2.H && z12 && !dVar2.y())) {
                        d(i11, dVar, interfaceC0495b, dVar2, z10);
                    }
                } else if (!dVar2.A()) {
                    if (next == cVar5 && cVar6.f == null) {
                        int e10 = cVar5.e() + d10;
                        dVar2.J(e10, dVar2.r() + e10);
                        b(i11, dVar2, interfaceC0495b, z10);
                    } else if (next == cVar6 && cVar5.f == null) {
                        int e11 = d10 - cVar6.e();
                        dVar2.J(e11 - dVar2.r(), e11);
                        b(i11, dVar2, interfaceC0495b, z10);
                    } else if (z12 && !dVar2.y()) {
                        c(i11, dVar2, interfaceC0495b, z10);
                    }
                }
                it2 = it;
            }
        }
        if (dVar instanceof u.g) {
            return;
        }
        HashSet<u.c> hashSet2 = j11.f35614a;
        if (hashSet2 != null && j11.f35616c) {
            Iterator<u.c> it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                u.c next2 = it3.next();
                u.d dVar3 = next2.f35617d;
                int i13 = i10 + 1;
                boolean a11 = a(dVar3);
                if (dVar3.A() && a11) {
                    u.e.V(dVar3, interfaceC0495b, new b.a());
                }
                u.c cVar7 = dVar3.K;
                u.c cVar8 = dVar3.M;
                if ((next2 == cVar7 && (cVar2 = cVar8.f) != null && cVar2.f35616c) || (next2 == cVar8 && (cVar = cVar7.f) != null && cVar.f35616c)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                int i14 = dVar3.V[0];
                if (i14 == 3 && !a11) {
                    if (i14 == 3 && dVar3.f35667w >= 0 && dVar3.f35666v >= 0) {
                        if (dVar3.f35647j0 != 8) {
                            if (dVar3.f35663s == 0) {
                                if (dVar3.Z == gl.Code) {
                                }
                            }
                        }
                        if (!dVar3.y() && !dVar3.H && z11 && !dVar3.y()) {
                            d(i13, dVar, interfaceC0495b, dVar3, z10);
                        }
                    }
                } else if (!dVar3.A()) {
                    if (next2 == cVar7 && cVar8.f == null) {
                        int e12 = cVar7.e() + d11;
                        dVar3.J(e12, dVar3.r() + e12);
                        b(i13, dVar3, interfaceC0495b, z10);
                    } else if (next2 == cVar8 && cVar7.f == null) {
                        int e13 = d11 - cVar8.e();
                        dVar3.J(e13 - dVar3.r(), e13);
                        b(i13, dVar3, interfaceC0495b, z10);
                    } else if (z11 && !dVar3.y()) {
                        c(i13, dVar3, interfaceC0495b, z10);
                    }
                }
            }
        }
        dVar.f35654n = true;
    }

    public static void c(int i10, u.d dVar, b.InterfaceC0495b interfaceC0495b, boolean z10) {
        float f;
        float f10 = dVar.f35641g0;
        u.c cVar = dVar.K;
        int d10 = cVar.f.d();
        u.c cVar2 = dVar.M;
        int d11 = cVar2.f.d();
        int e10 = cVar.e() + d10;
        int e11 = d11 - cVar2.e();
        if (d10 == d11) {
            f10 = 0.5f;
        } else {
            d10 = e10;
            d11 = e11;
        }
        int r10 = dVar.r();
        int i11 = (d11 - d10) - r10;
        if (d10 > d11) {
            i11 = (d10 - d11) - r10;
        }
        if (i11 > 0) {
            f = (f10 * i11) + 0.5f;
        } else {
            f = f10 * i11;
        }
        int i12 = ((int) f) + d10;
        int i13 = i12 + r10;
        if (d10 > d11) {
            i13 = i12 - r10;
        }
        dVar.J(i12, i13);
        b(i10 + 1, dVar, interfaceC0495b, z10);
    }

    public static void d(int i10, u.d dVar, b.InterfaceC0495b interfaceC0495b, u.d dVar2, boolean z10) {
        int r10;
        float f = dVar2.f35641g0;
        u.c cVar = dVar2.K;
        int e10 = cVar.e() + cVar.f.d();
        u.c cVar2 = dVar2.M;
        int d10 = cVar2.f.d() - cVar2.e();
        if (d10 >= e10) {
            int r11 = dVar2.r();
            if (dVar2.f35647j0 != 8) {
                int i11 = dVar2.f35663s;
                if (i11 == 2) {
                    if (dVar instanceof u.e) {
                        r10 = dVar.r();
                    } else {
                        r10 = dVar.W.r();
                    }
                    r11 = (int) (dVar2.f35641g0 * 0.5f * r10);
                } else if (i11 == 0) {
                    r11 = d10 - e10;
                }
                r11 = Math.max(dVar2.f35666v, r11);
                int i12 = dVar2.f35667w;
                if (i12 > 0) {
                    r11 = Math.min(i12, r11);
                }
            }
            int i13 = e10 + ((int) ((f * ((d10 - e10) - r11)) + 0.5f));
            dVar2.J(i13, r11 + i13);
            b(i10 + 1, dVar2, interfaceC0495b, z10);
        }
    }

    public static void e(int i10, u.d dVar, b.InterfaceC0495b interfaceC0495b) {
        float f;
        float f10 = dVar.f35643h0;
        u.c cVar = dVar.L;
        int d10 = cVar.f.d();
        u.c cVar2 = dVar.N;
        int d11 = cVar2.f.d();
        int e10 = cVar.e() + d10;
        int e11 = d11 - cVar2.e();
        if (d10 == d11) {
            f10 = 0.5f;
        } else {
            d10 = e10;
            d11 = e11;
        }
        int l10 = dVar.l();
        int i11 = (d11 - d10) - l10;
        if (d10 > d11) {
            i11 = (d10 - d11) - l10;
        }
        if (i11 > 0) {
            f = (f10 * i11) + 0.5f;
        } else {
            f = f10 * i11;
        }
        int i12 = (int) f;
        int i13 = d10 + i12;
        int i14 = i13 + l10;
        if (d10 > d11) {
            i13 = d10 - i12;
            i14 = i13 - l10;
        }
        dVar.K(i13, i14);
        g(i10 + 1, dVar, interfaceC0495b);
    }

    public static void f(int i10, u.d dVar, b.InterfaceC0495b interfaceC0495b, u.d dVar2) {
        int l10;
        float f = dVar2.f35643h0;
        u.c cVar = dVar2.L;
        int e10 = cVar.e() + cVar.f.d();
        u.c cVar2 = dVar2.N;
        int d10 = cVar2.f.d() - cVar2.e();
        if (d10 >= e10) {
            int l11 = dVar2.l();
            if (dVar2.f35647j0 != 8) {
                int i11 = dVar2.f35664t;
                if (i11 == 2) {
                    if (dVar instanceof u.e) {
                        l10 = dVar.l();
                    } else {
                        l10 = dVar.W.l();
                    }
                    l11 = (int) (f * 0.5f * l10);
                } else if (i11 == 0) {
                    l11 = d10 - e10;
                }
                l11 = Math.max(dVar2.y, l11);
                int i12 = dVar2.f35669z;
                if (i12 > 0) {
                    l11 = Math.min(i12, l11);
                }
            }
            int i13 = e10 + ((int) ((f * ((d10 - e10) - l11)) + 0.5f));
            dVar2.K(i13, l11 + i13);
            g(i10 + 1, dVar2, interfaceC0495b);
        }
    }

    public static void g(int i10, u.d dVar, b.InterfaceC0495b interfaceC0495b) {
        u.c cVar;
        boolean z10;
        u.c cVar2;
        u.c cVar3;
        boolean z11;
        u.c cVar4;
        u.c cVar5;
        if (dVar.o) {
            return;
        }
        if (!(dVar instanceof u.e) && dVar.A() && a(dVar)) {
            u.e.V(dVar, interfaceC0495b, new b.a());
        }
        u.c j10 = dVar.j(c.a.TOP);
        u.c j11 = dVar.j(c.a.BOTTOM);
        int d10 = j10.d();
        int d11 = j11.d();
        HashSet<u.c> hashSet = j10.f35614a;
        if (hashSet != null && j10.f35616c) {
            Iterator<u.c> it = hashSet.iterator();
            while (it.hasNext()) {
                u.c next = it.next();
                u.d dVar2 = next.f35617d;
                int i11 = i10 + 1;
                boolean a10 = a(dVar2);
                if (dVar2.A() && a10) {
                    u.e.V(dVar2, interfaceC0495b, new b.a());
                }
                u.c cVar6 = dVar2.L;
                u.c cVar7 = dVar2.N;
                if ((next == cVar6 && (cVar5 = cVar7.f) != null && cVar5.f35616c) || (next == cVar7 && (cVar4 = cVar6.f) != null && cVar4.f35616c)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                int i12 = dVar2.V[1];
                if (i12 == 3 && !a10) {
                    if (i12 == 3 && dVar2.f35669z >= 0 && dVar2.y >= 0 && (dVar2.f35647j0 == 8 || (dVar2.f35664t == 0 && dVar2.Z == gl.Code))) {
                        if (!dVar2.z() && !dVar2.H && z11 && !dVar2.z()) {
                            f(i11, dVar, interfaceC0495b, dVar2);
                        }
                    }
                } else if (!dVar2.A()) {
                    if (next == cVar6 && cVar7.f == null) {
                        int e10 = cVar6.e() + d10;
                        dVar2.K(e10, dVar2.l() + e10);
                        g(i11, dVar2, interfaceC0495b);
                    } else if (next == cVar7 && cVar6.f == null) {
                        int e11 = d10 - cVar7.e();
                        dVar2.K(e11 - dVar2.l(), e11);
                        g(i11, dVar2, interfaceC0495b);
                    } else if (z11 && !dVar2.z()) {
                        e(i11, dVar2, interfaceC0495b);
                    }
                }
            }
        }
        if (dVar instanceof u.g) {
            return;
        }
        HashSet<u.c> hashSet2 = j11.f35614a;
        if (hashSet2 != null && j11.f35616c) {
            Iterator<u.c> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                u.c next2 = it2.next();
                u.d dVar3 = next2.f35617d;
                int i13 = i10 + 1;
                boolean a11 = a(dVar3);
                if (dVar3.A() && a11) {
                    u.e.V(dVar3, interfaceC0495b, new b.a());
                }
                u.c cVar8 = dVar3.L;
                u.c cVar9 = dVar3.N;
                if ((next2 == cVar8 && (cVar3 = cVar9.f) != null && cVar3.f35616c) || (next2 == cVar9 && (cVar2 = cVar8.f) != null && cVar2.f35616c)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int i14 = dVar3.V[1];
                if (i14 == 3 && !a11) {
                    if (i14 == 3 && dVar3.f35669z >= 0 && dVar3.y >= 0) {
                        if (dVar3.f35647j0 != 8) {
                            if (dVar3.f35664t == 0) {
                                if (dVar3.Z == gl.Code) {
                                }
                            }
                        }
                        if (!dVar3.z() && !dVar3.H && z10 && !dVar3.z()) {
                            f(i13, dVar, interfaceC0495b, dVar3);
                        }
                    }
                } else if (!dVar3.A()) {
                    if (next2 == cVar8 && cVar9.f == null) {
                        int e12 = cVar8.e() + d11;
                        dVar3.K(e12, dVar3.l() + e12);
                        g(i13, dVar3, interfaceC0495b);
                    } else if (next2 == cVar9 && cVar8.f == null) {
                        int e13 = d11 - cVar9.e();
                        dVar3.K(e13 - dVar3.l(), e13);
                        g(i13, dVar3, interfaceC0495b);
                    } else if (z10 && !dVar3.z()) {
                        e(i13, dVar3, interfaceC0495b);
                    }
                }
            }
        }
        u.c j12 = dVar.j(c.a.BASELINE);
        if (j12.f35614a != null && j12.f35616c) {
            int d12 = j12.d();
            Iterator<u.c> it3 = j12.f35614a.iterator();
            while (it3.hasNext()) {
                u.c next3 = it3.next();
                u.d dVar4 = next3.f35617d;
                int i15 = i10 + 1;
                boolean a12 = a(dVar4);
                if (dVar4.A() && a12) {
                    u.e.V(dVar4, interfaceC0495b, new b.a());
                }
                if (dVar4.V[1] != 3 || a12) {
                    if (!dVar4.A() && next3 == (cVar = dVar4.O)) {
                        int e14 = next3.e() + d12;
                        if (dVar4.F) {
                            int i16 = e14 - dVar4.f35636d0;
                            int i17 = dVar4.Y + i16;
                            dVar4.f35634c0 = i16;
                            dVar4.L.l(i16);
                            dVar4.N.l(i17);
                            cVar.l(e14);
                            dVar4.f35652m = true;
                        }
                        g(i15, dVar4, interfaceC0495b);
                    }
                }
            }
        }
        dVar.o = true;
    }
}
