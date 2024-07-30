package i2;

import android.graphics.Path;
import android.graphics.PointF;
import com.huawei.hms.ads.gl;
import g2.a0;
import g2.e0;
import j2.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: EllipseContent.java */
/* loaded from: classes.dex */
public final class e implements l, a.InterfaceC0404a, j {

    /* renamed from: b, reason: collision with root package name */
    public final String f29064b;

    /* renamed from: c, reason: collision with root package name */
    public final a0 f29065c;

    /* renamed from: d, reason: collision with root package name */
    public final j2.g f29066d;

    /* renamed from: e, reason: collision with root package name */
    public final j2.a<?, PointF> f29067e;
    public final n2.a f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f29069h;

    /* renamed from: a, reason: collision with root package name */
    public final Path f29063a = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final b1.c f29068g = new b1.c();

    public e(a0 a0Var, o2.b bVar, n2.a aVar) {
        this.f29064b = aVar.f33216a;
        this.f29065c = a0Var;
        j2.a<?, ?> a10 = aVar.f33218c.a();
        this.f29066d = (j2.g) a10;
        j2.a<PointF, PointF> a11 = aVar.f33217b.a();
        this.f29067e = a11;
        this.f = aVar;
        bVar.f(a10);
        bVar.f(a11);
        a10.a(this);
        a11.a(this);
    }

    @Override // j2.a.InterfaceC0404a
    public final void a() {
        this.f29069h = false;
        this.f29065c.invalidateSelf();
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
                        this.f29068g.f2800a.add(tVar);
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
        if (obj == e0.f28382k) {
            this.f29066d.k(cVar);
        } else if (obj == e0.f28385n) {
            this.f29067e.k(cVar);
        }
    }

    @Override // i2.b
    public final String getName() {
        return this.f29064b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i2.l
    public final Path i() {
        boolean z10 = this.f29069h;
        Path path = this.f29063a;
        if (z10) {
            return path;
        }
        path.reset();
        n2.a aVar = this.f;
        if (aVar.f33220e) {
            this.f29069h = true;
            return path;
        }
        PointF pointF = (PointF) this.f29066d.f();
        float f = pointF.x / 2.0f;
        float f10 = pointF.y / 2.0f;
        float f11 = f * 0.55228f;
        float f12 = f10 * 0.55228f;
        path.reset();
        if (aVar.f33219d) {
            float f13 = -f10;
            path.moveTo(gl.Code, f13);
            float f14 = gl.Code - f11;
            float f15 = -f;
            float f16 = gl.Code - f12;
            path.cubicTo(f14, f13, f15, f16, f15, gl.Code);
            float f17 = f12 + gl.Code;
            path.cubicTo(f15, f17, f14, f10, gl.Code, f10);
            float f18 = f11 + gl.Code;
            path.cubicTo(f18, f10, f, f17, f, gl.Code);
            path.cubicTo(f, f16, f18, f13, gl.Code, f13);
        } else {
            float f19 = -f10;
            path.moveTo(gl.Code, f19);
            float f20 = f11 + gl.Code;
            float f21 = gl.Code - f12;
            path.cubicTo(f20, f19, f, f21, f, gl.Code);
            float f22 = f12 + gl.Code;
            path.cubicTo(f, f22, f20, f10, gl.Code, f10);
            float f23 = gl.Code - f11;
            float f24 = -f;
            path.cubicTo(f23, f10, f24, f22, f24, gl.Code);
            path.cubicTo(f24, f21, f23, f19, gl.Code, f19);
        }
        PointF f25 = this.f29067e.f();
        path.offset(f25.x, f25.y);
        path.close();
        this.f29068g.a(path);
        this.f29069h = true;
        return path;
    }
}
