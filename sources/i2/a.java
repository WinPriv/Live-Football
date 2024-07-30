package i2;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import com.huawei.hms.ads.gl;
import g2.a0;
import g2.e0;
import j2.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BaseStrokeContent.java */
/* loaded from: classes.dex */
public abstract class a implements a.InterfaceC0404a, j, d {

    /* renamed from: e, reason: collision with root package name */
    public final a0 f29040e;
    public final o2.b f;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f29042h;

    /* renamed from: i, reason: collision with root package name */
    public final h2.a f29043i;

    /* renamed from: j, reason: collision with root package name */
    public final j2.d f29044j;

    /* renamed from: k, reason: collision with root package name */
    public final j2.a<?, Integer> f29045k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f29046l;

    /* renamed from: m, reason: collision with root package name */
    public final j2.d f29047m;

    /* renamed from: n, reason: collision with root package name */
    public j2.p f29048n;
    public j2.a<Float, Float> o;

    /* renamed from: p, reason: collision with root package name */
    public float f29049p;

    /* renamed from: q, reason: collision with root package name */
    public final j2.c f29050q;

    /* renamed from: a, reason: collision with root package name */
    public final PathMeasure f29036a = new PathMeasure();

    /* renamed from: b, reason: collision with root package name */
    public final Path f29037b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final Path f29038c = new Path();

    /* renamed from: d, reason: collision with root package name */
    public final RectF f29039d = new RectF();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f29041g = new ArrayList();

    /* compiled from: BaseStrokeContent.java */
    /* renamed from: i2.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0396a {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f29051a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final t f29052b;

        public C0396a(t tVar) {
            this.f29052b = tVar;
        }
    }

    public a(a0 a0Var, o2.b bVar, Paint.Cap cap, Paint.Join join, float f, m2.d dVar, m2.b bVar2, List<m2.b> list, m2.b bVar3) {
        h2.a aVar = new h2.a(1);
        this.f29043i = aVar;
        this.f29049p = gl.Code;
        this.f29040e = a0Var;
        this.f = bVar;
        aVar.setStyle(Paint.Style.STROKE);
        aVar.setStrokeCap(cap);
        aVar.setStrokeJoin(join);
        aVar.setStrokeMiter(f);
        this.f29045k = dVar.a();
        this.f29044j = (j2.d) bVar2.a();
        if (bVar3 == null) {
            this.f29047m = null;
        } else {
            this.f29047m = (j2.d) bVar3.a();
        }
        this.f29046l = new ArrayList(list.size());
        this.f29042h = new float[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f29046l.add(list.get(i10).a());
        }
        bVar.f(this.f29045k);
        bVar.f(this.f29044j);
        for (int i11 = 0; i11 < this.f29046l.size(); i11++) {
            bVar.f((j2.a) this.f29046l.get(i11));
        }
        j2.d dVar2 = this.f29047m;
        if (dVar2 != null) {
            bVar.f(dVar2);
        }
        this.f29045k.a(this);
        this.f29044j.a(this);
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((j2.a) this.f29046l.get(i12)).a(this);
        }
        j2.d dVar3 = this.f29047m;
        if (dVar3 != null) {
            dVar3.a(this);
        }
        if (bVar.m() != null) {
            j2.a<Float, Float> a10 = ((m2.b) bVar.m().f683b).a();
            this.o = a10;
            a10.a(this);
            bVar.f(this.o);
        }
        if (bVar.n() != null) {
            this.f29050q = new j2.c(this, bVar, bVar.n());
        }
    }

    @Override // j2.a.InterfaceC0404a
    public final void a() {
        this.f29040e.invalidateSelf();
    }

    @Override // i2.b
    public final void b(List<b> list, List<b> list2) {
        ArrayList arrayList;
        ArrayList arrayList2 = (ArrayList) list;
        C0396a c0396a = null;
        t tVar = null;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            b bVar = (b) arrayList2.get(size);
            if (bVar instanceof t) {
                t tVar2 = (t) bVar;
                if (tVar2.f29161c == 2) {
                    tVar = tVar2;
                }
            }
        }
        if (tVar != null) {
            tVar.e(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            arrayList = this.f29041g;
            if (size2 < 0) {
                break;
            }
            b bVar2 = list2.get(size2);
            if (bVar2 instanceof t) {
                t tVar3 = (t) bVar2;
                if (tVar3.f29161c == 2) {
                    if (c0396a != null) {
                        arrayList.add(c0396a);
                    }
                    C0396a c0396a2 = new C0396a(tVar3);
                    tVar3.e(this);
                    c0396a = c0396a2;
                }
            }
            if (bVar2 instanceof l) {
                if (c0396a == null) {
                    c0396a = new C0396a(tVar);
                }
                c0396a.f29051a.add((l) bVar2);
            }
        }
        if (c0396a != null) {
            arrayList.add(c0396a);
        }
    }

    @Override // i2.d
    public final void d(RectF rectF, Matrix matrix, boolean z10) {
        Path path = this.f29037b;
        path.reset();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f29041g;
            if (i10 < arrayList.size()) {
                C0396a c0396a = (C0396a) arrayList.get(i10);
                for (int i11 = 0; i11 < c0396a.f29051a.size(); i11++) {
                    path.addPath(((l) c0396a.f29051a.get(i11)).i(), matrix);
                }
                i10++;
            } else {
                RectF rectF2 = this.f29039d;
                path.computeBounds(rectF2, false);
                float l10 = this.f29044j.l() / 2.0f;
                rectF2.set(rectF2.left - l10, rectF2.top - l10, rectF2.right + l10, rectF2.bottom + l10);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                androidx.activity.n.s0();
                return;
            }
        }
    }

    @Override // l2.f
    public final void e(l2.e eVar, int i10, ArrayList arrayList, l2.e eVar2) {
        s2.f.d(eVar, i10, arrayList, eVar2, this);
    }

    @Override // l2.f
    public void g(t2.c cVar, Object obj) {
        if (obj == e0.f28376d) {
            this.f29045k.k(cVar);
            return;
        }
        if (obj == e0.f28389s) {
            this.f29044j.k(cVar);
            return;
        }
        ColorFilter colorFilter = e0.K;
        o2.b bVar = this.f;
        if (obj == colorFilter) {
            j2.p pVar = this.f29048n;
            if (pVar != null) {
                bVar.q(pVar);
            }
            if (cVar == null) {
                this.f29048n = null;
                return;
            }
            j2.p pVar2 = new j2.p(cVar, null);
            this.f29048n = pVar2;
            pVar2.a(this);
            bVar.f(this.f29048n);
            return;
        }
        if (obj == e0.f28381j) {
            j2.a<Float, Float> aVar = this.o;
            if (aVar != null) {
                aVar.k(cVar);
                return;
            }
            j2.p pVar3 = new j2.p(cVar, null);
            this.o = pVar3;
            pVar3.a(this);
            bVar.f(this.o);
            return;
        }
        Integer num = e0.f28377e;
        j2.c cVar2 = this.f29050q;
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

    @Override // i2.d
    public void h(Canvas canvas, Matrix matrix, int i10) {
        boolean z10;
        float[] fArr;
        float floatValue;
        boolean z11;
        float f;
        float f10;
        float f11;
        BlurMaskFilter blurMaskFilter;
        a aVar = this;
        float[] fArr2 = s2.g.f35114d.get();
        boolean z12 = false;
        fArr2[0] = 0.0f;
        fArr2[1] = 0.0f;
        fArr2[2] = 37394.73f;
        fArr2[3] = 39575.234f;
        matrix.mapPoints(fArr2);
        if (fArr2[0] != fArr2[2] && fArr2[1] != fArr2[3]) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            androidx.activity.n.s0();
            return;
        }
        j2.f fVar = (j2.f) aVar.f29045k;
        float l10 = (i10 / 255.0f) * fVar.l(fVar.b(), fVar.d());
        float f12 = 100.0f;
        PointF pointF = s2.f.f35110a;
        int max = Math.max(0, Math.min(com.anythink.expressad.exoplayer.k.p.f9095b, (int) ((l10 / 100.0f) * 255.0f)));
        h2.a aVar2 = aVar.f29043i;
        aVar2.setAlpha(max);
        aVar2.setStrokeWidth(s2.g.d(matrix) * aVar.f29044j.l());
        if (aVar2.getStrokeWidth() <= gl.Code) {
            androidx.activity.n.s0();
            return;
        }
        ArrayList arrayList = aVar.f29046l;
        if (arrayList.isEmpty()) {
            androidx.activity.n.s0();
        } else {
            float d10 = s2.g.d(matrix);
            int i11 = 0;
            while (true) {
                int size = arrayList.size();
                fArr = aVar.f29042h;
                if (i11 >= size) {
                    break;
                }
                float floatValue2 = ((Float) ((j2.a) arrayList.get(i11)).f()).floatValue();
                fArr[i11] = floatValue2;
                if (i11 % 2 == 0) {
                    if (floatValue2 < 1.0f) {
                        fArr[i11] = 1.0f;
                    }
                } else if (floatValue2 < 0.1f) {
                    fArr[i11] = 0.1f;
                }
                fArr[i11] = fArr[i11] * d10;
                i11++;
            }
            j2.d dVar = aVar.f29047m;
            if (dVar == null) {
                floatValue = 0.0f;
            } else {
                floatValue = dVar.f().floatValue() * d10;
            }
            aVar2.setPathEffect(new DashPathEffect(fArr, floatValue));
            androidx.activity.n.s0();
        }
        j2.p pVar = aVar.f29048n;
        if (pVar != null) {
            aVar2.setColorFilter((ColorFilter) pVar.f());
        }
        j2.a<Float, Float> aVar3 = aVar.o;
        if (aVar3 != null) {
            float floatValue3 = aVar3.f().floatValue();
            if (floatValue3 == gl.Code) {
                aVar2.setMaskFilter(null);
            } else if (floatValue3 != aVar.f29049p) {
                o2.b bVar = aVar.f;
                if (bVar.A == floatValue3) {
                    blurMaskFilter = bVar.B;
                } else {
                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(floatValue3 / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    bVar.B = blurMaskFilter2;
                    bVar.A = floatValue3;
                    blurMaskFilter = blurMaskFilter2;
                }
                aVar2.setMaskFilter(blurMaskFilter);
            }
            aVar.f29049p = floatValue3;
        }
        j2.c cVar = aVar.f29050q;
        if (cVar != null) {
            cVar.b(aVar2);
        }
        int i12 = 0;
        while (true) {
            ArrayList arrayList2 = aVar.f29041g;
            if (i12 < arrayList2.size()) {
                C0396a c0396a = (C0396a) arrayList2.get(i12);
                t tVar = c0396a.f29052b;
                Path path = aVar.f29037b;
                ArrayList arrayList3 = c0396a.f29051a;
                if (tVar != null) {
                    path.reset();
                    int size2 = arrayList3.size();
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        } else {
                            path.addPath(((l) arrayList3.get(size2)).i(), matrix);
                        }
                    }
                    t tVar2 = c0396a.f29052b;
                    float floatValue4 = tVar2.f29162d.f().floatValue() / f12;
                    float floatValue5 = tVar2.f29163e.f().floatValue() / f12;
                    float floatValue6 = tVar2.f.f().floatValue() / 360.0f;
                    if (floatValue4 < 0.01f && floatValue5 > 0.99f) {
                        canvas.drawPath(path, aVar2);
                        androidx.activity.n.s0();
                    } else {
                        PathMeasure pathMeasure = aVar.f29036a;
                        pathMeasure.setPath(path, z12);
                        float length = pathMeasure.getLength();
                        while (pathMeasure.nextContour()) {
                            length = pathMeasure.getLength() + length;
                        }
                        float f13 = floatValue6 * length;
                        float f14 = (floatValue4 * length) + f13;
                        float min = Math.min((floatValue5 * length) + f13, (f14 + length) - 1.0f);
                        int size3 = arrayList3.size() - 1;
                        float f15 = 0.0f;
                        while (size3 >= 0) {
                            Path path2 = aVar.f29038c;
                            path2.set(((l) arrayList3.get(size3)).i());
                            path2.transform(matrix);
                            pathMeasure.setPath(path2, z12);
                            float length2 = pathMeasure.getLength();
                            if (min > length) {
                                float f16 = min - length;
                                if (f16 < f15 + length2 && f15 < f16) {
                                    if (f14 > length) {
                                        f11 = (f14 - length) / length2;
                                    } else {
                                        f11 = 0.0f;
                                    }
                                    s2.g.a(path2, f11, Math.min(f16 / length2, 1.0f), gl.Code);
                                    canvas.drawPath(path2, aVar2);
                                    f15 += length2;
                                    size3--;
                                    aVar = this;
                                    z12 = false;
                                }
                            }
                            float f17 = f15 + length2;
                            if (f17 >= f14 && f15 <= min) {
                                if (f17 <= min && f14 < f15) {
                                    canvas.drawPath(path2, aVar2);
                                } else {
                                    if (f14 < f15) {
                                        f = 0.0f;
                                    } else {
                                        f = (f14 - f15) / length2;
                                    }
                                    if (min > f17) {
                                        f10 = 1.0f;
                                    } else {
                                        f10 = (min - f15) / length2;
                                    }
                                    s2.g.a(path2, f, f10, gl.Code);
                                    canvas.drawPath(path2, aVar2);
                                }
                            }
                            f15 += length2;
                            size3--;
                            aVar = this;
                            z12 = false;
                        }
                        androidx.activity.n.s0();
                    }
                    z11 = true;
                } else {
                    path.reset();
                    z11 = true;
                    for (int size4 = arrayList3.size() - 1; size4 >= 0; size4--) {
                        path.addPath(((l) arrayList3.get(size4)).i(), matrix);
                    }
                    androidx.activity.n.s0();
                    canvas.drawPath(path, aVar2);
                    androidx.activity.n.s0();
                }
                i12++;
                aVar = this;
                z12 = false;
                f12 = 100.0f;
            } else {
                androidx.activity.n.s0();
                return;
            }
        }
    }
}
