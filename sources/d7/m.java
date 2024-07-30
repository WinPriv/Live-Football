package d7;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import com.huawei.hms.ads.gl;
import java.util.ArrayList;

/* compiled from: ShapePath.java */
/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public float f27467a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public float f27468b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public float f27469c;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public float f27470d;

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public float f27471e;

    @Deprecated
    public float f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f27472g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f27473h = new ArrayList();

    /* compiled from: ShapePath.java */
    /* loaded from: classes2.dex */
    public static class a extends f {

        /* renamed from: c, reason: collision with root package name */
        public final c f27474c;

        public a(c cVar) {
            this.f27474c = cVar;
        }

        @Override // d7.m.f
        public final void a(Matrix matrix, c7.a aVar, int i10, Canvas canvas) {
            boolean z10;
            c cVar = this.f27474c;
            float f = cVar.f;
            float f10 = cVar.f27483g;
            RectF rectF = new RectF(cVar.f27479b, cVar.f27480c, cVar.f27481d, cVar.f27482e);
            aVar.getClass();
            if (f10 < gl.Code) {
                z10 = true;
            } else {
                z10 = false;
            }
            Path path = aVar.f3461g;
            int[] iArr = c7.a.f3454k;
            if (z10) {
                iArr[0] = 0;
                iArr[1] = aVar.f;
                iArr[2] = aVar.f3460e;
                iArr[3] = aVar.f3459d;
            } else {
                path.rewind();
                path.moveTo(rectF.centerX(), rectF.centerY());
                path.arcTo(rectF, f, f10);
                path.close();
                float f11 = -i10;
                rectF.inset(f11, f11);
                iArr[0] = 0;
                iArr[1] = aVar.f3459d;
                iArr[2] = aVar.f3460e;
                iArr[3] = aVar.f;
            }
            float width = rectF.width() / 2.0f;
            if (width > gl.Code) {
                float f12 = 1.0f - (i10 / width);
                float[] fArr = c7.a.f3455l;
                fArr[1] = f12;
                fArr[2] = ((1.0f - f12) / 2.0f) + f12;
                RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP);
                Paint paint = aVar.f3457b;
                paint.setShader(radialGradient);
                canvas.save();
                canvas.concat(matrix);
                canvas.scale(1.0f, rectF.height() / rectF.width());
                if (!z10) {
                    canvas.clipPath(path, Region.Op.DIFFERENCE);
                    canvas.drawPath(path, aVar.f3462h);
                }
                canvas.drawArc(rectF, f, f10, true, paint);
                canvas.restore();
            }
        }
    }

    /* compiled from: ShapePath.java */
    /* loaded from: classes2.dex */
    public static class b extends f {

        /* renamed from: c, reason: collision with root package name */
        public final d f27475c;

        /* renamed from: d, reason: collision with root package name */
        public final float f27476d;

        /* renamed from: e, reason: collision with root package name */
        public final float f27477e;

        public b(d dVar, float f, float f10) {
            this.f27475c = dVar;
            this.f27476d = f;
            this.f27477e = f10;
        }

        @Override // d7.m.f
        public final void a(Matrix matrix, c7.a aVar, int i10, Canvas canvas) {
            d dVar = this.f27475c;
            float f = dVar.f27485c;
            float f10 = this.f27477e;
            float f11 = dVar.f27484b;
            float f12 = this.f27476d;
            RectF rectF = new RectF(gl.Code, gl.Code, (float) Math.hypot(f - f10, f11 - f12), gl.Code);
            Matrix matrix2 = this.f27488a;
            matrix2.set(matrix);
            matrix2.preTranslate(f12, f10);
            matrix2.preRotate(b());
            aVar.getClass();
            rectF.bottom += i10;
            rectF.offset(gl.Code, -i10);
            int[] iArr = c7.a.f3452i;
            iArr[0] = aVar.f;
            iArr[1] = aVar.f3460e;
            iArr[2] = aVar.f3459d;
            Paint paint = aVar.f3458c;
            float f13 = rectF.left;
            paint.setShader(new LinearGradient(f13, rectF.top, f13, rectF.bottom, iArr, c7.a.f3453j, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix2);
            canvas.drawRect(rectF, paint);
            canvas.restore();
        }

        public final float b() {
            d dVar = this.f27475c;
            return (float) Math.toDegrees(Math.atan((dVar.f27485c - this.f27477e) / (dVar.f27484b - this.f27476d)));
        }
    }

    /* compiled from: ShapePath.java */
    /* loaded from: classes2.dex */
    public static class c extends e {

        /* renamed from: h, reason: collision with root package name */
        public static final RectF f27478h = new RectF();

        /* renamed from: b, reason: collision with root package name */
        @Deprecated
        public float f27479b;

        /* renamed from: c, reason: collision with root package name */
        @Deprecated
        public float f27480c;

        /* renamed from: d, reason: collision with root package name */
        @Deprecated
        public float f27481d;

        /* renamed from: e, reason: collision with root package name */
        @Deprecated
        public float f27482e;

        @Deprecated
        public float f;

        /* renamed from: g, reason: collision with root package name */
        @Deprecated
        public float f27483g;

        public c(float f, float f10, float f11, float f12) {
            this.f27479b = f;
            this.f27480c = f10;
            this.f27481d = f11;
            this.f27482e = f12;
        }

        @Override // d7.m.e
        public final void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f27486a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f27478h;
            rectF.set(this.f27479b, this.f27480c, this.f27481d, this.f27482e);
            path.arcTo(rectF, this.f, this.f27483g, false);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath.java */
    /* loaded from: classes2.dex */
    public static class d extends e {

        /* renamed from: b, reason: collision with root package name */
        public float f27484b;

        /* renamed from: c, reason: collision with root package name */
        public float f27485c;

        @Override // d7.m.e
        public final void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f27486a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f27484b, this.f27485c);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath.java */
    /* loaded from: classes2.dex */
    public static abstract class e {

        /* renamed from: a, reason: collision with root package name */
        public final Matrix f27486a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* compiled from: ShapePath.java */
    /* loaded from: classes2.dex */
    public static abstract class f {

        /* renamed from: b, reason: collision with root package name */
        public static final Matrix f27487b = new Matrix();

        /* renamed from: a, reason: collision with root package name */
        public final Matrix f27488a = new Matrix();

        public abstract void a(Matrix matrix, c7.a aVar, int i10, Canvas canvas);
    }

    public m() {
        e(gl.Code, gl.Code, 270.0f, gl.Code);
    }

    public final void a(float f10, float f11, float f12, float f13, float f14, float f15) {
        boolean z10;
        float f16;
        c cVar = new c(f10, f11, f12, f13);
        cVar.f = f14;
        cVar.f27483g = f15;
        this.f27472g.add(cVar);
        a aVar = new a(cVar);
        float f17 = f14 + f15;
        if (f15 < gl.Code) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f14 = (f14 + 180.0f) % 360.0f;
        }
        if (z10) {
            f16 = (180.0f + f17) % 360.0f;
        } else {
            f16 = f17;
        }
        b(f14);
        this.f27473h.add(aVar);
        this.f27471e = f16;
        double d10 = f17;
        this.f27469c = (((f12 - f10) / 2.0f) * ((float) Math.cos(Math.toRadians(d10)))) + ((f10 + f12) * 0.5f);
        this.f27470d = (((f13 - f11) / 2.0f) * ((float) Math.sin(Math.toRadians(d10)))) + ((f11 + f13) * 0.5f);
    }

    public final void b(float f10) {
        float f11 = this.f27471e;
        if (f11 == f10) {
            return;
        }
        float f12 = ((f10 - f11) + 360.0f) % 360.0f;
        if (f12 > 180.0f) {
            return;
        }
        float f13 = this.f27469c;
        float f14 = this.f27470d;
        c cVar = new c(f13, f14, f13, f14);
        cVar.f = this.f27471e;
        cVar.f27483g = f12;
        this.f27473h.add(new a(cVar));
        this.f27471e = f10;
    }

    public final void c(Matrix matrix, Path path) {
        ArrayList arrayList = this.f27472g;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((e) arrayList.get(i10)).a(matrix, path);
        }
    }

    public final void d(float f10, float f11) {
        d dVar = new d();
        dVar.f27484b = f10;
        dVar.f27485c = f11;
        this.f27472g.add(dVar);
        b bVar = new b(dVar, this.f27469c, this.f27470d);
        float b10 = bVar.b() + 270.0f;
        float b11 = bVar.b() + 270.0f;
        b(b10);
        this.f27473h.add(bVar);
        this.f27471e = b11;
        this.f27469c = f10;
        this.f27470d = f11;
    }

    public final void e(float f10, float f11, float f12, float f13) {
        this.f27467a = f10;
        this.f27468b = f11;
        this.f27469c = f10;
        this.f27470d = f11;
        this.f27471e = f12;
        this.f = (f12 + f13) % 360.0f;
        this.f27472g.clear();
        this.f27473h.clear();
    }
}
