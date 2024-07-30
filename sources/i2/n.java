package i2;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.huawei.hms.ads.gl;
import g2.a0;
import g2.e0;
import j2.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: RectangleContent.java */
/* loaded from: classes.dex */
public final class n implements a.InterfaceC0404a, j, l {

    /* renamed from: c, reason: collision with root package name */
    public final String f29129c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f29130d;

    /* renamed from: e, reason: collision with root package name */
    public final a0 f29131e;
    public final j2.a<?, PointF> f;

    /* renamed from: g, reason: collision with root package name */
    public final j2.a<?, PointF> f29132g;

    /* renamed from: h, reason: collision with root package name */
    public final j2.d f29133h;

    /* renamed from: k, reason: collision with root package name */
    public boolean f29136k;

    /* renamed from: a, reason: collision with root package name */
    public final Path f29127a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final RectF f29128b = new RectF();

    /* renamed from: i, reason: collision with root package name */
    public final b1.c f29134i = new b1.c();

    /* renamed from: j, reason: collision with root package name */
    public j2.a<Float, Float> f29135j = null;

    public n(a0 a0Var, o2.b bVar, n2.i iVar) {
        this.f29129c = iVar.f33258a;
        this.f29130d = iVar.f33262e;
        this.f29131e = a0Var;
        j2.a<PointF, PointF> a10 = iVar.f33259b.a();
        this.f = a10;
        j2.a<PointF, PointF> a11 = iVar.f33260c.a();
        this.f29132g = a11;
        j2.a<?, ?> a12 = iVar.f33261d.a();
        this.f29133h = (j2.d) a12;
        bVar.f(a10);
        bVar.f(a11);
        bVar.f(a12);
        a10.a(this);
        a11.a(this);
        a12.a(this);
    }

    @Override // j2.a.InterfaceC0404a
    public final void a() {
        this.f29136k = false;
        this.f29131e.invalidateSelf();
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
                        this.f29134i.f2800a.add(tVar);
                        tVar.e(this);
                        i10++;
                    }
                }
                if (bVar instanceof p) {
                    this.f29135j = ((p) bVar).f29147b;
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
        if (obj == e0.f28383l) {
            this.f29132g.k(cVar);
        } else if (obj == e0.f28385n) {
            this.f.k(cVar);
        } else if (obj == e0.f28384m) {
            this.f29133h.k(cVar);
        }
    }

    @Override // i2.b
    public final String getName() {
        return this.f29129c;
    }

    @Override // i2.l
    public final Path i() {
        float l10;
        j2.a<Float, Float> aVar;
        boolean z10 = this.f29136k;
        Path path = this.f29127a;
        if (z10) {
            return path;
        }
        path.reset();
        if (this.f29130d) {
            this.f29136k = true;
            return path;
        }
        PointF f = this.f29132g.f();
        float f10 = f.x / 2.0f;
        float f11 = f.y / 2.0f;
        j2.d dVar = this.f29133h;
        if (dVar == null) {
            l10 = 0.0f;
        } else {
            l10 = dVar.l();
        }
        if (l10 == gl.Code && (aVar = this.f29135j) != null) {
            l10 = Math.min(aVar.f().floatValue(), Math.min(f10, f11));
        }
        float min = Math.min(f10, f11);
        if (l10 > min) {
            l10 = min;
        }
        PointF f12 = this.f.f();
        path.moveTo(f12.x + f10, (f12.y - f11) + l10);
        path.lineTo(f12.x + f10, (f12.y + f11) - l10);
        RectF rectF = this.f29128b;
        if (l10 > gl.Code) {
            float f13 = f12.x + f10;
            float f14 = l10 * 2.0f;
            float f15 = f12.y + f11;
            rectF.set(f13 - f14, f15 - f14, f13, f15);
            path.arcTo(rectF, gl.Code, 90.0f, false);
        }
        path.lineTo((f12.x - f10) + l10, f12.y + f11);
        if (l10 > gl.Code) {
            float f16 = f12.x - f10;
            float f17 = f12.y + f11;
            float f18 = l10 * 2.0f;
            rectF.set(f16, f17 - f18, f18 + f16, f17);
            path.arcTo(rectF, 90.0f, 90.0f, false);
        }
        path.lineTo(f12.x - f10, (f12.y - f11) + l10);
        if (l10 > gl.Code) {
            float f19 = f12.x - f10;
            float f20 = f12.y - f11;
            float f21 = l10 * 2.0f;
            rectF.set(f19, f20, f19 + f21, f21 + f20);
            path.arcTo(rectF, 180.0f, 90.0f, false);
        }
        path.lineTo((f12.x + f10) - l10, f12.y - f11);
        if (l10 > gl.Code) {
            float f22 = f12.x + f10;
            float f23 = l10 * 2.0f;
            float f24 = f12.y - f11;
            rectF.set(f22 - f23, f24, f22, f23 + f24);
            path.arcTo(rectF, 270.0f, 90.0f, false);
        }
        path.close();
        this.f29134i.a(path);
        this.f29136k = true;
        return path;
    }
}
