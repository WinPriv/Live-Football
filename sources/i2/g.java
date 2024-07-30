package i2;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.huawei.hms.ads.gl;
import com.ironsource.mediationsdk.logger.IronSourceError;
import g2.a0;
import g2.e0;
import j2.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: GradientFillContent.java */
/* loaded from: classes.dex */
public final class g implements d, a.InterfaceC0404a, j {

    /* renamed from: a, reason: collision with root package name */
    public final String f29082a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f29083b;

    /* renamed from: c, reason: collision with root package name */
    public final o2.b f29084c;

    /* renamed from: d, reason: collision with root package name */
    public final q.f<LinearGradient> f29085d = new q.f<>();

    /* renamed from: e, reason: collision with root package name */
    public final q.f<RadialGradient> f29086e = new q.f<>();
    public final Path f;

    /* renamed from: g, reason: collision with root package name */
    public final h2.a f29087g;

    /* renamed from: h, reason: collision with root package name */
    public final RectF f29088h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f29089i;

    /* renamed from: j, reason: collision with root package name */
    public final int f29090j;

    /* renamed from: k, reason: collision with root package name */
    public final j2.e f29091k;

    /* renamed from: l, reason: collision with root package name */
    public final j2.a<Integer, Integer> f29092l;

    /* renamed from: m, reason: collision with root package name */
    public final j2.g f29093m;

    /* renamed from: n, reason: collision with root package name */
    public final j2.g f29094n;
    public j2.p o;

    /* renamed from: p, reason: collision with root package name */
    public j2.p f29095p;

    /* renamed from: q, reason: collision with root package name */
    public final a0 f29096q;

    /* renamed from: r, reason: collision with root package name */
    public final int f29097r;

    /* renamed from: s, reason: collision with root package name */
    public j2.a<Float, Float> f29098s;

    /* renamed from: t, reason: collision with root package name */
    public float f29099t;

    /* renamed from: u, reason: collision with root package name */
    public final j2.c f29100u;

    public g(a0 a0Var, g2.h hVar, o2.b bVar, n2.d dVar) {
        Path path = new Path();
        this.f = path;
        this.f29087g = new h2.a(1);
        this.f29088h = new RectF();
        this.f29089i = new ArrayList();
        this.f29099t = gl.Code;
        this.f29084c = bVar;
        this.f29082a = dVar.f33228g;
        this.f29083b = dVar.f33229h;
        this.f29096q = a0Var;
        this.f29090j = dVar.f33223a;
        path.setFillType(dVar.f33224b);
        this.f29097r = (int) (hVar.b() / 32.0f);
        j2.a<?, ?> a10 = dVar.f33225c.a();
        this.f29091k = (j2.e) a10;
        a10.a(this);
        bVar.f(a10);
        j2.a<Integer, Integer> a11 = dVar.f33226d.a();
        this.f29092l = a11;
        a11.a(this);
        bVar.f(a11);
        j2.a<?, ?> a12 = dVar.f33227e.a();
        this.f29093m = (j2.g) a12;
        a12.a(this);
        bVar.f(a12);
        j2.a<?, ?> a13 = dVar.f.a();
        this.f29094n = (j2.g) a13;
        a13.a(this);
        bVar.f(a13);
        if (bVar.m() != null) {
            j2.a<Float, Float> a14 = ((m2.b) bVar.m().f683b).a();
            this.f29098s = a14;
            a14.a(this);
            bVar.f(this.f29098s);
        }
        if (bVar.n() != null) {
            this.f29100u = new j2.c(this, bVar, bVar.n());
        }
    }

    @Override // j2.a.InterfaceC0404a
    public final void a() {
        this.f29096q.invalidateSelf();
    }

    @Override // i2.b
    public final void b(List<b> list, List<b> list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            b bVar = list2.get(i10);
            if (bVar instanceof l) {
                this.f29089i.add((l) bVar);
            }
        }
    }

    @Override // i2.d
    public final void d(RectF rectF, Matrix matrix, boolean z10) {
        Path path = this.f;
        path.reset();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f29089i;
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

    public final int[] f(int[] iArr) {
        j2.p pVar = this.f29095p;
        if (pVar != null) {
            Integer[] numArr = (Integer[]) pVar.f();
            int i10 = 0;
            if (iArr.length == numArr.length) {
                while (i10 < iArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i10 < numArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            }
        }
        return iArr;
    }

    @Override // l2.f
    public final void g(t2.c cVar, Object obj) {
        if (obj == e0.f28376d) {
            this.f29092l.k(cVar);
            return;
        }
        ColorFilter colorFilter = e0.K;
        o2.b bVar = this.f29084c;
        if (obj == colorFilter) {
            j2.p pVar = this.o;
            if (pVar != null) {
                bVar.q(pVar);
            }
            if (cVar == null) {
                this.o = null;
                return;
            }
            j2.p pVar2 = new j2.p(cVar, null);
            this.o = pVar2;
            pVar2.a(this);
            bVar.f(this.o);
            return;
        }
        if (obj == e0.L) {
            j2.p pVar3 = this.f29095p;
            if (pVar3 != null) {
                bVar.q(pVar3);
            }
            if (cVar == null) {
                this.f29095p = null;
                return;
            }
            this.f29085d.a();
            this.f29086e.a();
            j2.p pVar4 = new j2.p(cVar, null);
            this.f29095p = pVar4;
            pVar4.a(this);
            bVar.f(this.f29095p);
            return;
        }
        if (obj == e0.f28381j) {
            j2.a<Float, Float> aVar = this.f29098s;
            if (aVar != null) {
                aVar.k(cVar);
                return;
            }
            j2.p pVar5 = new j2.p(cVar, null);
            this.f29098s = pVar5;
            pVar5.a(this);
            bVar.f(this.f29098s);
            return;
        }
        Integer num = e0.f28377e;
        j2.c cVar2 = this.f29100u;
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
        return this.f29082a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i2.d
    public final void h(Canvas canvas, Matrix matrix, int i10) {
        Shader shader;
        if (this.f29083b) {
            return;
        }
        Path path = this.f;
        path.reset();
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f29089i;
            if (i11 >= arrayList.size()) {
                break;
            }
            path.addPath(((l) arrayList.get(i11)).i(), matrix);
            i11++;
        }
        path.computeBounds(this.f29088h, false);
        int i12 = this.f29090j;
        j2.e eVar = this.f29091k;
        j2.g gVar = this.f29094n;
        j2.g gVar2 = this.f29093m;
        if (i12 == 1) {
            long j10 = j();
            q.f<LinearGradient> fVar = this.f29085d;
            shader = (LinearGradient) fVar.d(j10, null);
            if (shader == null) {
                PointF pointF = (PointF) gVar2.f();
                PointF pointF2 = (PointF) gVar.f();
                n2.c cVar = (n2.c) eVar.f();
                shader = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, f(cVar.f33222b), cVar.f33221a, Shader.TileMode.CLAMP);
                fVar.f(j10, shader);
            }
        } else {
            long j11 = j();
            q.f<RadialGradient> fVar2 = this.f29086e;
            shader = (RadialGradient) fVar2.d(j11, null);
            if (shader == null) {
                PointF pointF3 = (PointF) gVar2.f();
                PointF pointF4 = (PointF) gVar.f();
                n2.c cVar2 = (n2.c) eVar.f();
                int[] f = f(cVar2.f33222b);
                float[] fArr = cVar2.f33221a;
                float f10 = pointF3.x;
                float f11 = pointF3.y;
                float hypot = (float) Math.hypot(pointF4.x - f10, pointF4.y - f11);
                if (hypot <= gl.Code) {
                    hypot = 0.001f;
                }
                shader = new RadialGradient(f10, f11, hypot, f, fArr, Shader.TileMode.CLAMP);
                fVar2.f(j11, shader);
            }
        }
        shader.setLocalMatrix(matrix);
        h2.a aVar = this.f29087g;
        aVar.setShader(shader);
        j2.p pVar = this.o;
        if (pVar != null) {
            aVar.setColorFilter((ColorFilter) pVar.f());
        }
        j2.a<Float, Float> aVar2 = this.f29098s;
        if (aVar2 != null) {
            float floatValue = aVar2.f().floatValue();
            if (floatValue == gl.Code) {
                aVar.setMaskFilter(null);
            } else if (floatValue != this.f29099t) {
                aVar.setMaskFilter(new BlurMaskFilter(floatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f29099t = floatValue;
        }
        j2.c cVar3 = this.f29100u;
        if (cVar3 != null) {
            cVar3.b(aVar);
        }
        PointF pointF5 = s2.f.f35110a;
        aVar.setAlpha(Math.max(0, Math.min(com.anythink.expressad.exoplayer.k.p.f9095b, (int) ((((i10 / 255.0f) * this.f29092l.f().intValue()) / 100.0f) * 255.0f))));
        canvas.drawPath(path, aVar);
        androidx.activity.n.s0();
    }

    public final int j() {
        int i10;
        float f = this.f29093m.f29578d;
        float f10 = this.f29097r;
        int round = Math.round(f * f10);
        int round2 = Math.round(this.f29094n.f29578d * f10);
        int round3 = Math.round(this.f29091k.f29578d * f10);
        if (round != 0) {
            i10 = round * IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        } else {
            i10 = 17;
        }
        if (round2 != 0) {
            i10 = i10 * 31 * round2;
        }
        if (round3 != 0) {
            return i10 * 31 * round3;
        }
        return i10;
    }
}
