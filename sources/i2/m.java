package i2;

import android.graphics.Path;
import android.graphics.PointF;
import com.huawei.hms.ads.gl;
import g2.a0;
import g2.e0;
import j2.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PolystarContent.java */
/* loaded from: classes.dex */
public final class m implements l, a.InterfaceC0404a, j {

    /* renamed from: b, reason: collision with root package name */
    public final String f29115b;

    /* renamed from: c, reason: collision with root package name */
    public final a0 f29116c;

    /* renamed from: d, reason: collision with root package name */
    public final int f29117d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f29118e;
    public final boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final j2.d f29119g;

    /* renamed from: h, reason: collision with root package name */
    public final j2.a<?, PointF> f29120h;

    /* renamed from: i, reason: collision with root package name */
    public final j2.d f29121i;

    /* renamed from: j, reason: collision with root package name */
    public final j2.d f29122j;

    /* renamed from: k, reason: collision with root package name */
    public final j2.d f29123k;

    /* renamed from: l, reason: collision with root package name */
    public final j2.d f29124l;

    /* renamed from: m, reason: collision with root package name */
    public final j2.d f29125m;
    public boolean o;

    /* renamed from: a, reason: collision with root package name */
    public final Path f29114a = new Path();

    /* renamed from: n, reason: collision with root package name */
    public final b1.c f29126n = new b1.c();

    public m(a0 a0Var, o2.b bVar, n2.h hVar) {
        this.f29116c = a0Var;
        this.f29115b = hVar.f33248a;
        int i10 = hVar.f33249b;
        this.f29117d = i10;
        this.f29118e = hVar.f33256j;
        this.f = hVar.f33257k;
        j2.a<?, ?> a10 = hVar.f33250c.a();
        this.f29119g = (j2.d) a10;
        j2.a<PointF, PointF> a11 = hVar.f33251d.a();
        this.f29120h = a11;
        j2.a<?, ?> a12 = hVar.f33252e.a();
        this.f29121i = (j2.d) a12;
        j2.a<?, ?> a13 = hVar.f33253g.a();
        this.f29123k = (j2.d) a13;
        j2.a<?, ?> a14 = hVar.f33255i.a();
        this.f29125m = (j2.d) a14;
        if (i10 == 1) {
            this.f29122j = (j2.d) hVar.f.a();
            this.f29124l = (j2.d) hVar.f33254h.a();
        } else {
            this.f29122j = null;
            this.f29124l = null;
        }
        bVar.f(a10);
        bVar.f(a11);
        bVar.f(a12);
        bVar.f(a13);
        bVar.f(a14);
        if (i10 == 1) {
            bVar.f(this.f29122j);
            bVar.f(this.f29124l);
        }
        a10.a(this);
        a11.a(this);
        a12.a(this);
        a13.a(this);
        a14.a(this);
        if (i10 == 1) {
            this.f29122j.a(this);
            this.f29124l.a(this);
        }
    }

    @Override // j2.a.InterfaceC0404a
    public final void a() {
        this.o = false;
        this.f29116c.invalidateSelf();
    }

    @Override // i2.b
    public final void b(List<b> list, List<b> list2) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i10 < arrayList.size()) {
                b bVar = (b) arrayList.get(i10);
                if (bVar instanceof t) {
                    t tVar = (t) bVar;
                    if (tVar.f29161c == 1) {
                        this.f29126n.f2800a.add(tVar);
                        tVar.e(this);
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // l2.f
    public final void e(l2.e eVar, int i10, ArrayList arrayList, l2.e eVar2) {
        s2.f.d(eVar, i10, arrayList, eVar2, this);
    }

    @Override // l2.f
    public final void g(t2.c cVar, Object obj) {
        j2.d dVar;
        j2.d dVar2;
        if (obj == e0.f28393w) {
            this.f29119g.k(cVar);
            return;
        }
        if (obj == e0.f28394x) {
            this.f29121i.k(cVar);
            return;
        }
        if (obj == e0.f28385n) {
            this.f29120h.k(cVar);
            return;
        }
        if (obj == e0.y && (dVar2 = this.f29122j) != null) {
            dVar2.k(cVar);
            return;
        }
        if (obj == e0.f28395z) {
            this.f29123k.k(cVar);
            return;
        }
        if (obj == e0.A && (dVar = this.f29124l) != null) {
            dVar.k(cVar);
        } else if (obj == e0.B) {
            this.f29125m.k(cVar);
        }
    }

    @Override // i2.b
    public final String getName() {
        return this.f29115b;
    }

    @Override // i2.l
    public final Path i() {
        float f;
        float f10;
        double d10;
        float f11;
        float f12;
        float f13;
        Path path;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        Path path2;
        j2.a<?, PointF> aVar;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        int i10;
        j2.a<?, PointF> aVar2;
        double d11;
        double d12;
        float f28;
        double d13;
        boolean z10 = this.o;
        Path path3 = this.f29114a;
        if (z10) {
            return path3;
        }
        path3.reset();
        if (this.f29118e) {
            this.o = true;
            return path3;
        }
        int c10 = s.f.c(this.f29117d);
        j2.a<?, PointF> aVar3 = this.f29120h;
        j2.d dVar = this.f29125m;
        j2.d dVar2 = this.f29123k;
        double d14 = 0.0d;
        j2.d dVar3 = this.f29121i;
        j2.d dVar4 = this.f29119g;
        if (c10 != 0) {
            if (c10 == 1) {
                int floor = (int) Math.floor(dVar4.f().floatValue());
                if (dVar3 != null) {
                    d14 = dVar3.f().floatValue();
                }
                double radians = Math.toRadians(d14 - 90.0d);
                double d15 = floor;
                float floatValue = dVar.f().floatValue() / 100.0f;
                float floatValue2 = dVar2.f().floatValue();
                double d16 = floatValue2;
                float cos = (float) (Math.cos(radians) * d16);
                float sin = (float) (Math.sin(radians) * d16);
                path3.moveTo(cos, sin);
                double d17 = (float) (6.283185307179586d / d15);
                double d18 = radians + d17;
                double ceil = Math.ceil(d15);
                int i11 = 0;
                double d19 = d17;
                while (i11 < ceil) {
                    float cos2 = (float) (Math.cos(d18) * d16);
                    float sin2 = (float) (Math.sin(d18) * d16);
                    if (floatValue != gl.Code) {
                        double d20 = d16;
                        i10 = i11;
                        double atan2 = (float) (Math.atan2(sin, cos) - 1.5707963267948966d);
                        float cos3 = (float) Math.cos(atan2);
                        float sin3 = (float) Math.sin(atan2);
                        aVar2 = aVar3;
                        d11 = d18;
                        double atan22 = (float) (Math.atan2(sin2, cos2) - 1.5707963267948966d);
                        float f29 = floatValue2 * floatValue * 0.25f;
                        d12 = d19;
                        f28 = sin2;
                        d13 = d20;
                        path3.cubicTo(cos - (cos3 * f29), sin - (sin3 * f29), (((float) Math.cos(atan22)) * f29) + cos2, (f29 * ((float) Math.sin(atan22))) + sin2, cos2, f28);
                    } else {
                        i10 = i11;
                        aVar2 = aVar3;
                        d11 = d18;
                        d12 = d19;
                        f28 = sin2;
                        d13 = d16;
                        path3.lineTo(cos2, f28);
                    }
                    double d21 = d11 + d12;
                    sin = f28;
                    d16 = d13;
                    d19 = d12;
                    aVar3 = aVar2;
                    d18 = d21;
                    cos = cos2;
                    i11 = i10 + 1;
                }
                PointF f30 = aVar3.f();
                path3.offset(f30.x, f30.y);
                path3.close();
            }
            path = path3;
        } else {
            j2.a<?, PointF> aVar4 = aVar3;
            float floatValue3 = dVar4.f().floatValue();
            if (dVar3 != null) {
                d14 = dVar3.f().floatValue();
            }
            double radians2 = Math.toRadians(d14 - 90.0d);
            double d22 = floatValue3;
            float f31 = (float) (6.283185307179586d / d22);
            if (this.f) {
                f31 *= -1.0f;
            }
            float f32 = f31;
            float f33 = f32 / 2.0f;
            float f34 = floatValue3 - ((int) floatValue3);
            if (f34 != gl.Code) {
                radians2 += (1.0f - f34) * f33;
            }
            float floatValue4 = dVar2.f().floatValue();
            float floatValue5 = this.f29122j.f().floatValue();
            j2.d dVar5 = this.f29124l;
            if (dVar5 != null) {
                f = dVar5.f().floatValue() / 100.0f;
            } else {
                f = 0.0f;
            }
            if (dVar != null) {
                f10 = dVar.f().floatValue() / 100.0f;
            } else {
                f10 = 0.0f;
            }
            if (f34 != gl.Code) {
                float d23 = a3.k.d(floatValue4, floatValue5, f34, floatValue5);
                double d24 = d23;
                f13 = d23;
                f11 = (float) (Math.cos(radians2) * d24);
                f12 = (float) (Math.sin(radians2) * d24);
                path3.moveTo(f11, f12);
                d10 = radians2 + ((f32 * f34) / 2.0f);
            } else {
                double d25 = floatValue4;
                float cos4 = (float) (Math.cos(radians2) * d25);
                float sin4 = (float) (d25 * Math.sin(radians2));
                path3.moveTo(cos4, sin4);
                d10 = radians2 + f33;
                f11 = cos4;
                f12 = sin4;
                f13 = 0.0f;
            }
            double ceil2 = Math.ceil(d22);
            double d26 = 2.0d;
            double d27 = ceil2 * 2.0d;
            double d28 = d10;
            int i12 = 0;
            boolean z11 = false;
            while (true) {
                double d29 = i12;
                if (d29 >= d27) {
                    break;
                }
                if (z11) {
                    f14 = floatValue4;
                } else {
                    f14 = floatValue5;
                }
                if (f13 != gl.Code && d29 == d27 - d26) {
                    f15 = (f32 * f34) / 2.0f;
                } else {
                    f15 = f33;
                }
                if (f13 != gl.Code && d29 == d27 - 1.0d) {
                    f16 = floatValue5;
                    f18 = floatValue4;
                    f17 = f13;
                } else {
                    f16 = floatValue5;
                    f17 = f14;
                    f18 = floatValue4;
                }
                double d30 = f17;
                float cos5 = (float) (Math.cos(d28) * d30);
                float sin5 = (float) (d30 * Math.sin(d28));
                if (f == gl.Code && f10 == gl.Code) {
                    path3.lineTo(cos5, sin5);
                    path2 = path3;
                    f19 = sin5;
                    f20 = f32;
                    f26 = f18;
                    aVar = aVar4;
                    f27 = f33;
                    f25 = f16;
                } else {
                    float f35 = f33;
                    path2 = path3;
                    double atan23 = (float) (Math.atan2(f12, f11) - 1.5707963267948966d);
                    float cos6 = (float) Math.cos(atan23);
                    float sin6 = (float) Math.sin(atan23);
                    aVar = aVar4;
                    float f36 = f11;
                    f19 = sin5;
                    f20 = f32;
                    double atan24 = (float) (Math.atan2(sin5, cos5) - 1.5707963267948966d);
                    float cos7 = (float) Math.cos(atan24);
                    float sin7 = (float) Math.sin(atan24);
                    if (z11) {
                        f21 = f;
                    } else {
                        f21 = f10;
                    }
                    if (z11) {
                        f22 = f10;
                    } else {
                        f22 = f;
                    }
                    if (z11) {
                        f23 = f16;
                    } else {
                        f23 = f18;
                    }
                    if (z11) {
                        f24 = f18;
                    } else {
                        f24 = f16;
                    }
                    float f37 = f23 * f21 * 0.47829f;
                    float f38 = cos6 * f37;
                    float f39 = f37 * sin6;
                    float f40 = f24 * f22 * 0.47829f;
                    float f41 = cos7 * f40;
                    float f42 = f40 * sin7;
                    if (f34 != gl.Code) {
                        if (i12 == 0) {
                            f38 *= f34;
                            f39 *= f34;
                        } else if (d29 == d27 - 1.0d) {
                            f41 *= f34;
                            f42 *= f34;
                        }
                    }
                    f25 = f16;
                    f26 = f18;
                    f27 = f35;
                    path2.cubicTo(f36 - f38, f12 - f39, cos5 + f41, f19 + f42, cos5, f19);
                }
                d28 += f15;
                z11 = !z11;
                i12++;
                floatValue5 = f25;
                aVar4 = aVar;
                f11 = cos5;
                floatValue4 = f26;
                f33 = f27;
                path3 = path2;
                f32 = f20;
                f12 = f19;
                d26 = 2.0d;
            }
            PointF f43 = aVar4.f();
            path = path3;
            path.offset(f43.x, f43.y);
            path.close();
        }
        path.close();
        this.f29126n.a(path);
        this.o = true;
        return path;
    }
}
