package o2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.appcompat.app.r;
import g2.a0;
import java.util.ArrayList;
import java.util.Collections;
import n2.n;
import q2.j;

/* compiled from: ShapeLayer.java */
/* loaded from: classes.dex */
public final class g extends b {
    public final i2.c C;
    public final c D;

    public g(g2.h hVar, a0 a0Var, c cVar, e eVar) {
        super(a0Var, eVar);
        this.D = cVar;
        i2.c cVar2 = new i2.c(a0Var, this, new n("__container", eVar.f33573a, false), hVar);
        this.C = cVar2;
        cVar2.b(Collections.emptyList(), Collections.emptyList());
    }

    @Override // o2.b, i2.d
    public final void d(RectF rectF, Matrix matrix, boolean z10) {
        super.d(rectF, matrix, z10);
        this.C.d(rectF, this.f33562n, z10);
    }

    @Override // o2.b
    public final void l(Canvas canvas, Matrix matrix, int i10) {
        this.C.h(canvas, matrix, i10);
    }

    @Override // o2.b
    public final r m() {
        r rVar = this.f33563p.f33593w;
        if (rVar != null) {
            return rVar;
        }
        return this.D.f33563p.f33593w;
    }

    @Override // o2.b
    public final j n() {
        j jVar = this.f33563p.f33594x;
        if (jVar != null) {
            return jVar;
        }
        return this.D.f33563p.f33594x;
    }

    @Override // o2.b
    public final void r(l2.e eVar, int i10, ArrayList arrayList, l2.e eVar2) {
        this.C.e(eVar, i10, arrayList, eVar2);
    }
}
