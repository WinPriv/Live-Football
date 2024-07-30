package o2;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import com.huawei.hms.ads.gl;
import g2.a0;
import g2.b0;
import g2.e0;
import j2.p;

/* compiled from: ImageLayer.java */
/* loaded from: classes.dex */
public final class d extends b {
    public final h2.a C;
    public final Rect D;
    public final Rect E;
    public final b0 F;
    public p G;
    public p H;

    public d(a0 a0Var, e eVar) {
        super(a0Var, eVar);
        b0 b0Var;
        this.C = new h2.a(3);
        this.D = new Rect();
        this.E = new Rect();
        g2.h hVar = a0Var.f28357s;
        if (hVar == null) {
            b0Var = null;
        } else {
            b0Var = hVar.f28409d.get(eVar.f33578g);
        }
        this.F = b0Var;
    }

    @Override // o2.b, i2.d
    public final void d(RectF rectF, Matrix matrix, boolean z10) {
        super.d(rectF, matrix, z10);
        if (this.F != null) {
            float c10 = s2.g.c();
            rectF.set(gl.Code, gl.Code, r3.f28365a * c10, r3.f28366b * c10);
            this.f33562n.mapRect(rectF);
        }
    }

    @Override // o2.b, l2.f
    public final void g(t2.c cVar, Object obj) {
        super.g(cVar, obj);
        if (obj == e0.K) {
            if (cVar == null) {
                this.G = null;
                return;
            } else {
                this.G = new p(cVar, null);
                return;
            }
        }
        if (obj == e0.N) {
            if (cVar == null) {
                this.H = null;
            } else {
                this.H = new p(cVar, null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0156  */
    @Override // o2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(android.graphics.Canvas r15, android.graphics.Matrix r16, int r17) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.d.l(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }
}
