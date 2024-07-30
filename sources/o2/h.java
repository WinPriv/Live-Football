package o2;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.huawei.hms.ads.gl;
import g2.a0;
import g2.e0;
import j2.p;

/* compiled from: SolidLayer.java */
/* loaded from: classes.dex */
public final class h extends b {
    public final RectF C;
    public final h2.a D;
    public final float[] E;
    public final Path F;
    public final e G;
    public p H;

    public h(a0 a0Var, e eVar) {
        super(a0Var, eVar);
        this.C = new RectF();
        h2.a aVar = new h2.a();
        this.D = aVar;
        this.E = new float[8];
        this.F = new Path();
        this.G = eVar;
        aVar.setAlpha(0);
        aVar.setStyle(Paint.Style.FILL);
        aVar.setColor(eVar.f33583l);
    }

    @Override // o2.b, i2.d
    public final void d(RectF rectF, Matrix matrix, boolean z10) {
        super.d(rectF, matrix, z10);
        RectF rectF2 = this.C;
        e eVar = this.G;
        rectF2.set(gl.Code, gl.Code, eVar.f33581j, eVar.f33582k);
        this.f33562n.mapRect(rectF2);
        rectF.set(rectF2);
    }

    @Override // o2.b, l2.f
    public final void g(t2.c cVar, Object obj) {
        super.g(cVar, obj);
        if (obj == e0.K) {
            if (cVar == null) {
                this.H = null;
            } else {
                this.H = new p(cVar, null);
            }
        }
    }

    @Override // o2.b
    public final void l(Canvas canvas, Matrix matrix, int i10) {
        int intValue;
        e eVar = this.G;
        int alpha = Color.alpha(eVar.f33583l);
        if (alpha == 0) {
            return;
        }
        j2.a<Integer, Integer> aVar = this.f33570w.f29624j;
        if (aVar == null) {
            intValue = 100;
        } else {
            intValue = aVar.f().intValue();
        }
        int i11 = (int) ((((alpha / 255.0f) * intValue) / 100.0f) * (i10 / 255.0f) * 255.0f);
        h2.a aVar2 = this.D;
        aVar2.setAlpha(i11);
        p pVar = this.H;
        if (pVar != null) {
            aVar2.setColorFilter((ColorFilter) pVar.f());
        }
        if (i11 > 0) {
            float[] fArr = this.E;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f = eVar.f33581j;
            fArr[2] = f;
            fArr[3] = 0.0f;
            fArr[4] = f;
            float f10 = eVar.f33582k;
            fArr[5] = f10;
            fArr[6] = 0.0f;
            fArr[7] = f10;
            matrix.mapPoints(fArr);
            Path path = this.F;
            path.reset();
            path.moveTo(fArr[0], fArr[1]);
            path.lineTo(fArr[2], fArr[3]);
            path.lineTo(fArr[4], fArr[5]);
            path.lineTo(fArr[6], fArr[7]);
            path.lineTo(fArr[0], fArr[1]);
            path.close();
            canvas.drawPath(path, aVar2);
        }
    }
}
