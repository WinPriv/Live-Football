package d7;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.huawei.hms.ads.gl;
import d7.g;
import java.util.ArrayList;
import java.util.BitSet;

/* compiled from: ShapeAppearancePathProvider.java */
/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final m[] f27453a = new m[4];

    /* renamed from: b, reason: collision with root package name */
    public final Matrix[] f27454b = new Matrix[4];

    /* renamed from: c, reason: collision with root package name */
    public final Matrix[] f27455c = new Matrix[4];

    /* renamed from: d, reason: collision with root package name */
    public final PointF f27456d = new PointF();

    /* renamed from: e, reason: collision with root package name */
    public final Path f27457e = new Path();
    public final Path f = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final m f27458g = new m();

    /* renamed from: h, reason: collision with root package name */
    public final float[] f27459h = new float[2];

    /* renamed from: i, reason: collision with root package name */
    public final float[] f27460i = new float[2];

    /* renamed from: j, reason: collision with root package name */
    public final Path f27461j = new Path();

    /* renamed from: k, reason: collision with root package name */
    public final Path f27462k = new Path();

    /* renamed from: l, reason: collision with root package name */
    public final boolean f27463l = true;

    /* compiled from: ShapeAppearancePathProvider.java */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final k f27464a = new k();
    }

    public k() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f27453a[i10] = new m();
            this.f27454b[i10] = new Matrix();
            this.f27455c[i10] = new Matrix();
        }
    }

    public final void a(j jVar, float f, RectF rectF, g.a aVar, Path path) {
        int i10;
        Matrix[] matrixArr;
        float[] fArr;
        Matrix[] matrixArr2;
        m[] mVarArr;
        float abs;
        e eVar;
        Path path2;
        g.a aVar2;
        char c10;
        c cVar;
        androidx.activity.n nVar;
        Path path3;
        k kVar = this;
        j jVar2 = jVar;
        g.a aVar3 = aVar;
        Path path4 = path;
        path.rewind();
        Path path5 = kVar.f27457e;
        path5.rewind();
        Path path6 = kVar.f;
        path6.rewind();
        path6.addRect(rectF, Path.Direction.CW);
        int i11 = 0;
        while (true) {
            i10 = 4;
            matrixArr = kVar.f27455c;
            fArr = kVar.f27459h;
            matrixArr2 = kVar.f27454b;
            mVarArr = kVar.f27453a;
            if (i11 >= 4) {
                break;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        cVar = jVar2.f;
                    } else {
                        cVar = jVar2.f27435e;
                    }
                } else {
                    cVar = jVar2.f27437h;
                }
            } else {
                cVar = jVar2.f27436g;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        nVar = jVar2.f27432b;
                    } else {
                        nVar = jVar2.f27431a;
                    }
                } else {
                    nVar = jVar2.f27434d;
                }
            } else {
                nVar = jVar2.f27433c;
            }
            m mVar = mVarArr[i11];
            nVar.getClass();
            nVar.y0(f, cVar.a(rectF), mVar);
            int i12 = i11 + 1;
            float f10 = (i12 % 4) * 90;
            matrixArr2[i11].reset();
            PointF pointF = kVar.f27456d;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        path3 = path5;
                        pointF.set(rectF.right, rectF.top);
                    } else {
                        path3 = path5;
                        pointF.set(rectF.left, rectF.top);
                    }
                } else {
                    path3 = path5;
                    pointF.set(rectF.left, rectF.bottom);
                }
            } else {
                path3 = path5;
                pointF.set(rectF.right, rectF.bottom);
            }
            matrixArr2[i11].setTranslate(pointF.x, pointF.y);
            matrixArr2[i11].preRotate(f10);
            m mVar2 = mVarArr[i11];
            fArr[0] = mVar2.f27469c;
            fArr[1] = mVar2.f27470d;
            matrixArr2[i11].mapPoints(fArr);
            matrixArr[i11].reset();
            matrixArr[i11].setTranslate(fArr[0], fArr[1]);
            matrixArr[i11].preRotate(f10);
            i11 = i12;
            path5 = path3;
        }
        Path path7 = path5;
        char c11 = 1;
        char c12 = 0;
        int i13 = 0;
        while (i13 < i10) {
            m mVar3 = mVarArr[i13];
            fArr[c12] = mVar3.f27467a;
            fArr[c11] = mVar3.f27468b;
            matrixArr2[i13].mapPoints(fArr);
            if (i13 == 0) {
                path4.moveTo(fArr[c12], fArr[c11]);
            } else {
                path4.lineTo(fArr[c12], fArr[c11]);
            }
            mVarArr[i13].c(matrixArr2[i13], path4);
            if (aVar3 != null) {
                m mVar4 = mVarArr[i13];
                Matrix matrix = matrixArr2[i13];
                g gVar = g.this;
                BitSet bitSet = gVar.f27406v;
                mVar4.getClass();
                bitSet.set(i13, false);
                mVar4.b(mVar4.f);
                gVar.f27404t[i13] = new l(new ArrayList(mVar4.f27473h), new Matrix(matrix));
            }
            int i14 = i13 + 1;
            int i15 = i14 % 4;
            m mVar5 = mVarArr[i13];
            fArr[0] = mVar5.f27469c;
            fArr[1] = mVar5.f27470d;
            matrixArr2[i13].mapPoints(fArr);
            m mVar6 = mVarArr[i15];
            float f11 = mVar6.f27467a;
            float[] fArr2 = kVar.f27460i;
            fArr2[0] = f11;
            fArr2[1] = mVar6.f27468b;
            matrixArr2[i15].mapPoints(fArr2);
            float max = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, gl.Code);
            m mVar7 = mVarArr[i13];
            fArr[0] = mVar7.f27469c;
            fArr[1] = mVar7.f27470d;
            matrixArr2[i13].mapPoints(fArr);
            if (i13 != 1 && i13 != 3) {
                abs = Math.abs(rectF.centerY() - fArr[1]);
            } else {
                abs = Math.abs(rectF.centerX() - fArr[0]);
            }
            m mVar8 = kVar.f27458g;
            mVar8.e(gl.Code, gl.Code, 270.0f, gl.Code);
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 3) {
                        eVar = jVar2.f27439j;
                    } else {
                        eVar = jVar2.f27438i;
                    }
                } else {
                    eVar = jVar2.f27441l;
                }
            } else {
                eVar = jVar2.f27440k;
            }
            eVar.b(max, abs, f, mVar8);
            Path path8 = kVar.f27461j;
            path8.reset();
            mVar8.c(matrixArr[i13], path8);
            if (kVar.f27463l && (eVar.a() || kVar.b(path8, i13) || kVar.b(path8, i15))) {
                path8.op(path8, path6, Path.Op.DIFFERENCE);
                fArr[0] = mVar8.f27467a;
                fArr[1] = mVar8.f27468b;
                matrixArr[i13].mapPoints(fArr);
                path2 = path7;
                path2.moveTo(fArr[0], fArr[1]);
                mVar8.c(matrixArr[i13], path2);
                aVar2 = aVar;
                path4 = path;
            } else {
                path2 = path7;
                path4 = path;
                mVar8.c(matrixArr[i13], path4);
                aVar2 = aVar;
            }
            if (aVar2 != null) {
                Matrix matrix2 = matrixArr[i13];
                g gVar2 = g.this;
                c10 = 0;
                gVar2.f27406v.set(i13 + 4, false);
                mVar8.b(mVar8.f);
                gVar2.f27405u[i13] = new l(new ArrayList(mVar8.f27473h), new Matrix(matrix2));
            } else {
                c10 = 0;
            }
            kVar = this;
            c12 = c10;
            aVar3 = aVar2;
            path7 = path2;
            i13 = i14;
            c11 = 1;
            i10 = 4;
            jVar2 = jVar;
        }
        Path path9 = path7;
        path.close();
        path9.close();
        if (!path9.isEmpty()) {
            path4.op(path9, Path.Op.UNION);
        }
    }

    public final boolean b(Path path, int i10) {
        Path path2 = this.f27462k;
        path2.reset();
        this.f27453a[i10].c(this.f27454b[i10], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty()) {
            return true;
        }
        if (rectF.width() > 1.0f && rectF.height() > 1.0f) {
            return true;
        }
        return false;
    }
}
