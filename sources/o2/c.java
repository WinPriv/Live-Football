package o2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.activity.n;
import com.huawei.hms.ads.gl;
import g2.a0;
import g2.e0;
import j2.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import s2.g;

/* compiled from: CompositionLayer.java */
/* loaded from: classes.dex */
public final class c extends b {
    public j2.a<Float, Float> C;
    public final ArrayList D;
    public final RectF E;
    public final RectF F;
    public final Paint G;
    public boolean H;

    public c(a0 a0Var, e eVar, List<e> list, g2.h hVar) {
        super(a0Var, eVar);
        int i10;
        b bVar;
        b cVar;
        this.D = new ArrayList();
        this.E = new RectF();
        this.F = new RectF();
        this.G = new Paint();
        this.H = true;
        m2.b bVar2 = eVar.f33589s;
        if (bVar2 != null) {
            j2.a<Float, Float> a10 = bVar2.a();
            this.C = a10;
            f(a10);
            this.C.a(this);
        } else {
            this.C = null;
        }
        q.f fVar = new q.f(hVar.f28413i.size());
        int size = list.size() - 1;
        b bVar3 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            e eVar2 = list.get(size);
            int c10 = s.f.c(eVar2.f33577e);
            if (c10 != 0) {
                if (c10 != 1) {
                    if (c10 != 2) {
                        if (c10 != 3) {
                            if (c10 != 4) {
                                if (c10 != 5) {
                                    s2.c.b("Unknown layer type ".concat(com.ironsource.adapters.facebook.a.w(eVar2.f33577e)));
                                    cVar = null;
                                } else {
                                    cVar = new i(a0Var, eVar2);
                                }
                            } else {
                                cVar = new g(hVar, a0Var, this, eVar2);
                            }
                        } else {
                            cVar = new f(a0Var, eVar2);
                        }
                    } else {
                        cVar = new d(a0Var, eVar2);
                    }
                } else {
                    cVar = new h(a0Var, eVar2);
                }
            } else {
                cVar = new c(a0Var, eVar2, hVar.f28408c.get(eVar2.f33578g), hVar);
            }
            if (cVar != null) {
                fVar.f(cVar.f33563p.f33576d, cVar);
                if (bVar3 != null) {
                    bVar3.f33566s = cVar;
                    bVar3 = null;
                } else {
                    this.D.add(0, cVar);
                    int c11 = s.f.c(eVar2.f33591u);
                    if (c11 == 1 || c11 == 2) {
                        bVar3 = cVar;
                    }
                }
            }
            size--;
        }
        for (i10 = 0; i10 < fVar.h(); i10++) {
            b bVar4 = (b) fVar.d(fVar.e(i10), null);
            if (bVar4 != null && (bVar = (b) fVar.d(bVar4.f33563p.f, null)) != null) {
                bVar4.f33567t = bVar;
            }
        }
    }

    @Override // o2.b, i2.d
    public final void d(RectF rectF, Matrix matrix, boolean z10) {
        super.d(rectF, matrix, z10);
        ArrayList arrayList = this.D;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.E;
            rectF2.set(gl.Code, gl.Code, gl.Code, gl.Code);
            ((b) arrayList.get(size)).d(rectF2, this.f33562n, true);
            rectF.union(rectF2);
        }
    }

    @Override // o2.b, l2.f
    public final void g(t2.c cVar, Object obj) {
        super.g(cVar, obj);
        if (obj == e0.E) {
            if (cVar == null) {
                j2.a<Float, Float> aVar = this.C;
                if (aVar != null) {
                    aVar.k(null);
                    return;
                }
                return;
            }
            p pVar = new p(cVar, null);
            this.C = pVar;
            pVar.a(this);
            f(this.C);
        }
    }

    @Override // o2.b
    public final void l(Canvas canvas, Matrix matrix, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        RectF rectF = this.F;
        e eVar = this.f33563p;
        rectF.set(gl.Code, gl.Code, eVar.o, eVar.f33586p);
        matrix.mapRect(rectF);
        boolean z13 = this.o.L;
        ArrayList arrayList = this.D;
        if (z13 && arrayList.size() > 1 && i10 != 255) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Paint paint = this.G;
            paint.setAlpha(i10);
            g.a aVar = s2.g.f35111a;
            canvas.saveLayer(rectF, paint);
            n.s0();
        } else {
            canvas.save();
        }
        if (z10) {
            i10 = 255;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.H && "__container".equals(eVar.f33575c)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11 && !rectF.isEmpty()) {
                z12 = canvas.clipRect(rectF);
            } else {
                z12 = true;
            }
            if (z12) {
                ((b) arrayList.get(size)).h(canvas, matrix, i10);
            }
        }
        canvas.restore();
        n.s0();
    }

    @Override // o2.b
    public final void r(l2.e eVar, int i10, ArrayList arrayList, l2.e eVar2) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList2 = this.D;
            if (i11 < arrayList2.size()) {
                ((b) arrayList2.get(i11)).e(eVar, i10, arrayList, eVar2);
                i11++;
            } else {
                return;
            }
        }
    }

    @Override // o2.b
    public final void s(boolean z10) {
        super.s(z10);
        Iterator it = this.D.iterator();
        while (it.hasNext()) {
            ((b) it.next()).s(z10);
        }
    }

    @Override // o2.b
    public final void t(float f) {
        super.t(f);
        j2.a<Float, Float> aVar = this.C;
        e eVar = this.f33563p;
        if (aVar != null) {
            g2.h hVar = this.o.f28357s;
            f = ((aVar.f().floatValue() * eVar.f33574b.f28417m) - eVar.f33574b.f28415k) / ((hVar.f28416l - hVar.f28415k) + 0.01f);
        }
        if (this.C == null) {
            g2.h hVar2 = eVar.f33574b;
            f -= eVar.f33585n / (hVar2.f28416l - hVar2.f28415k);
        }
        if (eVar.f33584m != gl.Code && !"__container".equals(eVar.f33575c)) {
            f /= eVar.f33584m;
        }
        ArrayList arrayList = this.D;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((b) arrayList.get(size)).t(f);
            } else {
                return;
            }
        }
    }
}
