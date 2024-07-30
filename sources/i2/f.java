package i2;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.huawei.hms.ads.gl;
import g2.a0;
import g2.e0;
import j2.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FillContent.java */
/* loaded from: classes.dex */
public final class f implements d, a.InterfaceC0404a, j {

    /* renamed from: a, reason: collision with root package name */
    public final Path f29070a;

    /* renamed from: b, reason: collision with root package name */
    public final h2.a f29071b;

    /* renamed from: c, reason: collision with root package name */
    public final o2.b f29072c;

    /* renamed from: d, reason: collision with root package name */
    public final String f29073d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f29074e;
    public final ArrayList f;

    /* renamed from: g, reason: collision with root package name */
    public final j2.g f29075g;

    /* renamed from: h, reason: collision with root package name */
    public final j2.a<Integer, Integer> f29076h;

    /* renamed from: i, reason: collision with root package name */
    public j2.p f29077i;

    /* renamed from: j, reason: collision with root package name */
    public final a0 f29078j;

    /* renamed from: k, reason: collision with root package name */
    public j2.a<Float, Float> f29079k;

    /* renamed from: l, reason: collision with root package name */
    public float f29080l;

    /* renamed from: m, reason: collision with root package name */
    public final j2.c f29081m;

    public f(a0 a0Var, o2.b bVar, n2.m mVar) {
        m2.d dVar;
        Path path = new Path();
        this.f29070a = path;
        this.f29071b = new h2.a(1);
        this.f = new ArrayList();
        this.f29072c = bVar;
        this.f29073d = mVar.f33274c;
        this.f29074e = mVar.f;
        this.f29078j = a0Var;
        if (bVar.m() != null) {
            j2.a<Float, Float> a10 = ((m2.b) bVar.m().f683b).a();
            this.f29079k = a10;
            a10.a(this);
            bVar.f(this.f29079k);
        }
        if (bVar.n() != null) {
            this.f29081m = new j2.c(this, bVar, bVar.n());
        }
        m2.a aVar = mVar.f33275d;
        if (aVar != null && (dVar = mVar.f33276e) != null) {
            path.setFillType(mVar.f33273b);
            j2.a<?, ?> a11 = aVar.a();
            this.f29075g = (j2.g) a11;
            a11.a(this);
            bVar.f(a11);
            j2.a<Integer, Integer> a12 = dVar.a();
            this.f29076h = a12;
            a12.a(this);
            bVar.f(a12);
            return;
        }
        this.f29075g = null;
        this.f29076h = null;
    }

    @Override // j2.a.InterfaceC0404a
    public final void a() {
        this.f29078j.invalidateSelf();
    }

    @Override // i2.b
    public final void b(List<b> list, List<b> list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            b bVar = list2.get(i10);
            if (bVar instanceof l) {
                this.f.add((l) bVar);
            }
        }
    }

    @Override // i2.d
    public final void d(RectF rectF, Matrix matrix, boolean z10) {
        Path path = this.f29070a;
        path.reset();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f;
            if (i10 < arrayList.size()) {
                path.addPath(((l) arrayList.get(i10)).i(), matrix);
                i10++;
            } else {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
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
        if (obj == e0.f28373a) {
            this.f29075g.k(cVar);
            return;
        }
        if (obj == e0.f28376d) {
            this.f29076h.k(cVar);
            return;
        }
        ColorFilter colorFilter = e0.K;
        o2.b bVar = this.f29072c;
        if (obj == colorFilter) {
            j2.p pVar = this.f29077i;
            if (pVar != null) {
                bVar.q(pVar);
            }
            if (cVar == null) {
                this.f29077i = null;
                return;
            }
            j2.p pVar2 = new j2.p(cVar, null);
            this.f29077i = pVar2;
            pVar2.a(this);
            bVar.f(this.f29077i);
            return;
        }
        if (obj == e0.f28381j) {
            j2.a<Float, Float> aVar = this.f29079k;
            if (aVar != null) {
                aVar.k(cVar);
                return;
            }
            j2.p pVar3 = new j2.p(cVar, null);
            this.f29079k = pVar3;
            pVar3.a(this);
            bVar.f(this.f29079k);
            return;
        }
        Integer num = e0.f28377e;
        j2.c cVar2 = this.f29081m;
        if (obj == num && cVar2 != null) {
            cVar2.f29589b.k(cVar);
            return;
        }
        if (obj == e0.G && cVar2 != null) {
            cVar2.c(cVar);
            return;
        }
        if (obj == e0.H && cVar2 != null) {
            cVar2.f29591d.k(cVar);
            return;
        }
        if (obj == e0.I && cVar2 != null) {
            cVar2.f29592e.k(cVar);
        } else if (obj == e0.J && cVar2 != null) {
            cVar2.f.k(cVar);
        }
    }

    @Override // i2.b
    public final String getName() {
        return this.f29073d;
    }

    @Override // i2.d
    public final void h(Canvas canvas, Matrix matrix, int i10) {
        BlurMaskFilter blurMaskFilter;
        if (this.f29074e) {
            return;
        }
        j2.b bVar = (j2.b) this.f29075g;
        int l10 = bVar.l(bVar.b(), bVar.d());
        PointF pointF = s2.f.f35110a;
        int i11 = 0;
        int max = (Math.max(0, Math.min(com.anythink.expressad.exoplayer.k.p.f9095b, (int) ((((i10 / 255.0f) * this.f29076h.f().intValue()) / 100.0f) * 255.0f))) << 24) | (l10 & 16777215);
        h2.a aVar = this.f29071b;
        aVar.setColor(max);
        j2.p pVar = this.f29077i;
        if (pVar != null) {
            aVar.setColorFilter((ColorFilter) pVar.f());
        }
        j2.a<Float, Float> aVar2 = this.f29079k;
        if (aVar2 != null) {
            float floatValue = aVar2.f().floatValue();
            if (floatValue == gl.Code) {
                aVar.setMaskFilter(null);
            } else if (floatValue != this.f29080l) {
                o2.b bVar2 = this.f29072c;
                if (bVar2.A == floatValue) {
                    blurMaskFilter = bVar2.B;
                } else {
                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(floatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    bVar2.B = blurMaskFilter2;
                    bVar2.A = floatValue;
                    blurMaskFilter = blurMaskFilter2;
                }
                aVar.setMaskFilter(blurMaskFilter);
            }
            this.f29080l = floatValue;
        }
        j2.c cVar = this.f29081m;
        if (cVar != null) {
            cVar.b(aVar);
        }
        Path path = this.f29070a;
        path.reset();
        while (true) {
            ArrayList arrayList = this.f;
            if (i11 < arrayList.size()) {
                path.addPath(((l) arrayList.get(i11)).i(), matrix);
                i11++;
            } else {
                canvas.drawPath(path, aVar);
                androidx.activity.n.s0();
                return;
            }
        }
    }
}
