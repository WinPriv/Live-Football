package j2;

import android.graphics.Matrix;
import android.graphics.PointF;
import androidx.transition.r;
import com.huawei.hms.ads.gl;
import g2.e0;
import j2.a;
import java.util.Collections;

/* compiled from: TransformKeyframeAnimation.java */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f29616a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    public final Matrix f29617b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f29618c;

    /* renamed from: d, reason: collision with root package name */
    public final Matrix f29619d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f29620e;
    public a<PointF, PointF> f;

    /* renamed from: g, reason: collision with root package name */
    public a<?, PointF> f29621g;

    /* renamed from: h, reason: collision with root package name */
    public a<t2.d, t2.d> f29622h;

    /* renamed from: i, reason: collision with root package name */
    public a<Float, Float> f29623i;

    /* renamed from: j, reason: collision with root package name */
    public a<Integer, Integer> f29624j;

    /* renamed from: k, reason: collision with root package name */
    public d f29625k;

    /* renamed from: l, reason: collision with root package name */
    public d f29626l;

    /* renamed from: m, reason: collision with root package name */
    public a<?, Float> f29627m;

    /* renamed from: n, reason: collision with root package name */
    public a<?, Float> f29628n;

    public o(m2.h hVar) {
        a<PointF, PointF> a10;
        a<PointF, PointF> a11;
        a<t2.d, t2.d> a12;
        a<Float, Float> a13;
        d dVar;
        d dVar2;
        r rVar = hVar.f32649a;
        if (rVar == null) {
            a10 = null;
        } else {
            a10 = rVar.a();
        }
        this.f = a10;
        m2.i<PointF, PointF> iVar = hVar.f32650b;
        if (iVar == null) {
            a11 = null;
        } else {
            a11 = iVar.a();
        }
        this.f29621g = a11;
        m2.c cVar = hVar.f32651c;
        if (cVar == null) {
            a12 = null;
        } else {
            a12 = cVar.a();
        }
        this.f29622h = a12;
        m2.b bVar = hVar.f32652d;
        if (bVar == null) {
            a13 = null;
        } else {
            a13 = bVar.a();
        }
        this.f29623i = a13;
        m2.b bVar2 = hVar.f;
        if (bVar2 == null) {
            dVar = null;
        } else {
            dVar = (d) bVar2.a();
        }
        this.f29625k = dVar;
        if (dVar != null) {
            this.f29617b = new Matrix();
            this.f29618c = new Matrix();
            this.f29619d = new Matrix();
            this.f29620e = new float[9];
        } else {
            this.f29617b = null;
            this.f29618c = null;
            this.f29619d = null;
            this.f29620e = null;
        }
        m2.b bVar3 = hVar.f32654g;
        if (bVar3 == null) {
            dVar2 = null;
        } else {
            dVar2 = (d) bVar3.a();
        }
        this.f29626l = dVar2;
        m2.d dVar3 = hVar.f32653e;
        if (dVar3 != null) {
            this.f29624j = dVar3.a();
        }
        m2.b bVar4 = hVar.f32655h;
        if (bVar4 != null) {
            this.f29627m = bVar4.a();
        } else {
            this.f29627m = null;
        }
        m2.b bVar5 = hVar.f32656i;
        if (bVar5 != null) {
            this.f29628n = bVar5.a();
        } else {
            this.f29628n = null;
        }
    }

    public final void a(o2.b bVar) {
        bVar.f(this.f29624j);
        bVar.f(this.f29627m);
        bVar.f(this.f29628n);
        bVar.f(this.f);
        bVar.f(this.f29621g);
        bVar.f(this.f29622h);
        bVar.f(this.f29623i);
        bVar.f(this.f29625k);
        bVar.f(this.f29626l);
    }

    public final void b(a.InterfaceC0404a interfaceC0404a) {
        a<Integer, Integer> aVar = this.f29624j;
        if (aVar != null) {
            aVar.a(interfaceC0404a);
        }
        a<?, Float> aVar2 = this.f29627m;
        if (aVar2 != null) {
            aVar2.a(interfaceC0404a);
        }
        a<?, Float> aVar3 = this.f29628n;
        if (aVar3 != null) {
            aVar3.a(interfaceC0404a);
        }
        a<PointF, PointF> aVar4 = this.f;
        if (aVar4 != null) {
            aVar4.a(interfaceC0404a);
        }
        a<?, PointF> aVar5 = this.f29621g;
        if (aVar5 != null) {
            aVar5.a(interfaceC0404a);
        }
        a<t2.d, t2.d> aVar6 = this.f29622h;
        if (aVar6 != null) {
            aVar6.a(interfaceC0404a);
        }
        a<Float, Float> aVar7 = this.f29623i;
        if (aVar7 != null) {
            aVar7.a(interfaceC0404a);
        }
        d dVar = this.f29625k;
        if (dVar != null) {
            dVar.a(interfaceC0404a);
        }
        d dVar2 = this.f29626l;
        if (dVar2 != null) {
            dVar2.a(interfaceC0404a);
        }
    }

    public final boolean c(t2.c cVar, Object obj) {
        if (obj == e0.f) {
            a<PointF, PointF> aVar = this.f;
            if (aVar == null) {
                this.f = new p(cVar, new PointF());
                return true;
            }
            aVar.k(cVar);
            return true;
        }
        if (obj == e0.f28378g) {
            a<?, PointF> aVar2 = this.f29621g;
            if (aVar2 == null) {
                this.f29621g = new p(cVar, new PointF());
                return true;
            }
            aVar2.k(cVar);
            return true;
        }
        if (obj == e0.f28379h) {
            a<?, PointF> aVar3 = this.f29621g;
            if (aVar3 instanceof l) {
                l lVar = (l) aVar3;
                t2.c cVar2 = lVar.f29611m;
                if (cVar2 != null) {
                    cVar2.f35399t = null;
                }
                lVar.f29611m = cVar;
                if (cVar != null) {
                    cVar.f35399t = lVar;
                    return true;
                }
                return true;
            }
        }
        if (obj == e0.f28380i) {
            a<?, PointF> aVar4 = this.f29621g;
            if (aVar4 instanceof l) {
                l lVar2 = (l) aVar4;
                t2.c cVar3 = lVar2.f29612n;
                if (cVar3 != null) {
                    cVar3.f35399t = null;
                }
                lVar2.f29612n = cVar;
                if (cVar != null) {
                    cVar.f35399t = lVar2;
                    return true;
                }
                return true;
            }
        }
        if (obj == e0.o) {
            a<t2.d, t2.d> aVar5 = this.f29622h;
            if (aVar5 == null) {
                this.f29622h = new p(cVar, new t2.d());
                return true;
            }
            aVar5.k(cVar);
            return true;
        }
        if (obj == e0.f28386p) {
            a<Float, Float> aVar6 = this.f29623i;
            if (aVar6 == null) {
                this.f29623i = new p(cVar, Float.valueOf(gl.Code));
                return true;
            }
            aVar6.k(cVar);
            return true;
        }
        if (obj == e0.f28375c) {
            a<Integer, Integer> aVar7 = this.f29624j;
            if (aVar7 == null) {
                this.f29624j = new p(cVar, 100);
                return true;
            }
            aVar7.k(cVar);
            return true;
        }
        if (obj == e0.C) {
            a<?, Float> aVar8 = this.f29627m;
            if (aVar8 == null) {
                this.f29627m = new p(cVar, Float.valueOf(100.0f));
                return true;
            }
            aVar8.k(cVar);
            return true;
        }
        if (obj == e0.D) {
            a<?, Float> aVar9 = this.f29628n;
            if (aVar9 == null) {
                this.f29628n = new p(cVar, Float.valueOf(100.0f));
                return true;
            }
            aVar9.k(cVar);
            return true;
        }
        if (obj == e0.f28387q) {
            if (this.f29625k == null) {
                this.f29625k = new d(Collections.singletonList(new t2.a(Float.valueOf(gl.Code))));
            }
            this.f29625k.k(cVar);
            return true;
        }
        if (obj == e0.f28388r) {
            if (this.f29626l == null) {
                this.f29626l = new d(Collections.singletonList(new t2.a(Float.valueOf(gl.Code))));
            }
            this.f29626l.k(cVar);
            return true;
        }
        return false;
    }

    public final Matrix d() {
        PointF f;
        float cos;
        float sin;
        float[] fArr;
        float l10;
        PointF f10;
        Matrix matrix = this.f29616a;
        matrix.reset();
        a<?, PointF> aVar = this.f29621g;
        if (aVar != null && (f10 = aVar.f()) != null) {
            float f11 = f10.x;
            if (f11 != gl.Code || f10.y != gl.Code) {
                matrix.preTranslate(f11, f10.y);
            }
        }
        a<Float, Float> aVar2 = this.f29623i;
        if (aVar2 != null) {
            if (aVar2 instanceof p) {
                l10 = aVar2.f().floatValue();
            } else {
                l10 = ((d) aVar2).l();
            }
            if (l10 != gl.Code) {
                matrix.preRotate(l10);
            }
        }
        if (this.f29625k != null) {
            if (this.f29626l == null) {
                cos = 0.0f;
            } else {
                cos = (float) Math.cos(Math.toRadians((-r5.l()) + 90.0f));
            }
            if (this.f29626l == null) {
                sin = 1.0f;
            } else {
                sin = (float) Math.sin(Math.toRadians((-r7.l()) + 90.0f));
            }
            float tan = (float) Math.tan(Math.toRadians(r2.l()));
            int i10 = 0;
            while (true) {
                fArr = this.f29620e;
                if (i10 >= 9) {
                    break;
                }
                fArr[i10] = 0.0f;
                i10++;
            }
            fArr[0] = cos;
            fArr[1] = sin;
            float f12 = -sin;
            fArr[3] = f12;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            Matrix matrix2 = this.f29617b;
            matrix2.setValues(fArr);
            for (int i11 = 0; i11 < 9; i11++) {
                fArr[i11] = 0.0f;
            }
            fArr[0] = 1.0f;
            fArr[3] = tan;
            fArr[4] = 1.0f;
            fArr[8] = 1.0f;
            Matrix matrix3 = this.f29618c;
            matrix3.setValues(fArr);
            for (int i12 = 0; i12 < 9; i12++) {
                fArr[i12] = 0.0f;
            }
            fArr[0] = cos;
            fArr[1] = f12;
            fArr[3] = sin;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            Matrix matrix4 = this.f29619d;
            matrix4.setValues(fArr);
            matrix3.preConcat(matrix2);
            matrix4.preConcat(matrix3);
            matrix.preConcat(matrix4);
        }
        a<t2.d, t2.d> aVar3 = this.f29622h;
        if (aVar3 != null) {
            t2.d f13 = aVar3.f();
            float f14 = f13.f35401a;
            if (f14 != 1.0f || f13.f35402b != 1.0f) {
                matrix.preScale(f14, f13.f35402b);
            }
        }
        a<PointF, PointF> aVar4 = this.f;
        if (aVar4 != null && (((f = aVar4.f()) != null && f.x != gl.Code) || f.y != gl.Code)) {
            matrix.preTranslate(-f.x, -f.y);
        }
        return matrix;
    }

    public final Matrix e(float f) {
        PointF f10;
        t2.d f11;
        float f12;
        a<?, PointF> aVar = this.f29621g;
        PointF pointF = null;
        if (aVar == null) {
            f10 = null;
        } else {
            f10 = aVar.f();
        }
        a<t2.d, t2.d> aVar2 = this.f29622h;
        if (aVar2 == null) {
            f11 = null;
        } else {
            f11 = aVar2.f();
        }
        Matrix matrix = this.f29616a;
        matrix.reset();
        if (f10 != null) {
            matrix.preTranslate(f10.x * f, f10.y * f);
        }
        if (f11 != null) {
            double d10 = f;
            matrix.preScale((float) Math.pow(f11.f35401a, d10), (float) Math.pow(f11.f35402b, d10));
        }
        a<Float, Float> aVar3 = this.f29623i;
        if (aVar3 != null) {
            float floatValue = aVar3.f().floatValue();
            a<PointF, PointF> aVar4 = this.f;
            if (aVar4 != null) {
                pointF = aVar4.f();
            }
            float f13 = floatValue * f;
            float f14 = gl.Code;
            if (pointF == null) {
                f12 = 0.0f;
            } else {
                f12 = pointF.x;
            }
            if (pointF != null) {
                f14 = pointF.y;
            }
            matrix.preRotate(f13, f12, f14);
        }
        return matrix;
    }
}
