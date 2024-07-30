package o2;

import a3.l;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import androidx.activity.n;
import androidx.appcompat.app.r;
import com.huawei.hms.ads.gl;
import g2.a0;
import g2.i0;
import j2.a;
import j2.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import q.h;
import q2.j;

/* compiled from: BaseLayer.java */
/* loaded from: classes.dex */
public abstract class b implements i2.d, a.InterfaceC0404a, l2.f {
    public float A;
    public BlurMaskFilter B;

    /* renamed from: a, reason: collision with root package name */
    public final Path f33550a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final Matrix f33551b = new Matrix();

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f33552c = new Matrix();

    /* renamed from: d, reason: collision with root package name */
    public final h2.a f33553d = new h2.a(1);

    /* renamed from: e, reason: collision with root package name */
    public final h2.a f33554e = new h2.a(PorterDuff.Mode.DST_IN, 0);
    public final h2.a f = new h2.a(PorterDuff.Mode.DST_OUT, 0);

    /* renamed from: g, reason: collision with root package name */
    public final h2.a f33555g;

    /* renamed from: h, reason: collision with root package name */
    public final h2.a f33556h;

    /* renamed from: i, reason: collision with root package name */
    public final RectF f33557i;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f33558j;

    /* renamed from: k, reason: collision with root package name */
    public final RectF f33559k;

    /* renamed from: l, reason: collision with root package name */
    public final RectF f33560l;

    /* renamed from: m, reason: collision with root package name */
    public final RectF f33561m;

    /* renamed from: n, reason: collision with root package name */
    public final Matrix f33562n;
    public final a0 o;

    /* renamed from: p, reason: collision with root package name */
    public final e f33563p;

    /* renamed from: q, reason: collision with root package name */
    public final androidx.viewpager2.widget.d f33564q;

    /* renamed from: r, reason: collision with root package name */
    public j2.d f33565r;

    /* renamed from: s, reason: collision with root package name */
    public b f33566s;

    /* renamed from: t, reason: collision with root package name */
    public b f33567t;

    /* renamed from: u, reason: collision with root package name */
    public List<b> f33568u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f33569v;

    /* renamed from: w, reason: collision with root package name */
    public final o f33570w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f33571x;
    public boolean y;

    /* renamed from: z, reason: collision with root package name */
    public h2.a f33572z;

    public b(a0 a0Var, e eVar) {
        h2.a aVar = new h2.a(1);
        this.f33555g = aVar;
        this.f33556h = new h2.a(PorterDuff.Mode.CLEAR);
        this.f33557i = new RectF();
        this.f33558j = new RectF();
        this.f33559k = new RectF();
        this.f33560l = new RectF();
        this.f33561m = new RectF();
        this.f33562n = new Matrix();
        this.f33569v = new ArrayList();
        this.f33571x = true;
        this.A = gl.Code;
        this.o = a0Var;
        this.f33563p = eVar;
        l.p(new StringBuilder(), eVar.f33575c, "#draw");
        if (eVar.f33591u == 3) {
            aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        m2.h hVar = eVar.f33580i;
        hVar.getClass();
        o oVar = new o(hVar);
        this.f33570w = oVar;
        oVar.b(this);
        List<n2.f> list = eVar.f33579h;
        if (list != null && !list.isEmpty()) {
            androidx.viewpager2.widget.d dVar = new androidx.viewpager2.widget.d(list);
            this.f33564q = dVar;
            Iterator it = ((List) dVar.f2569s).iterator();
            while (it.hasNext()) {
                ((j2.a) it.next()).a(this);
            }
            for (j2.a<?, ?> aVar2 : (List) this.f33564q.f2570t) {
                f(aVar2);
                aVar2.a(this);
            }
        }
        e eVar2 = this.f33563p;
        if (!eVar2.f33590t.isEmpty()) {
            j2.d dVar2 = new j2.d(eVar2.f33590t);
            this.f33565r = dVar2;
            dVar2.f29576b = true;
            dVar2.a(new a.InterfaceC0404a() { // from class: o2.a
                @Override // j2.a.InterfaceC0404a
                public final void a() {
                    boolean z10;
                    b bVar = b.this;
                    if (bVar.f33565r.l() == 1.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 != bVar.f33571x) {
                        bVar.f33571x = z10;
                        bVar.o.invalidateSelf();
                    }
                }
            });
            boolean z10 = this.f33565r.f().floatValue() == 1.0f;
            if (z10 != this.f33571x) {
                this.f33571x = z10;
                this.o.invalidateSelf();
            }
            f(this.f33565r);
            return;
        }
        if (true != this.f33571x) {
            this.f33571x = true;
            this.o.invalidateSelf();
        }
    }

    @Override // j2.a.InterfaceC0404a
    public final void a() {
        this.o.invalidateSelf();
    }

    @Override // i2.d
    public void d(RectF rectF, Matrix matrix, boolean z10) {
        this.f33557i.set(gl.Code, gl.Code, gl.Code, gl.Code);
        j();
        Matrix matrix2 = this.f33562n;
        matrix2.set(matrix);
        if (z10) {
            List<b> list = this.f33568u;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else {
                        matrix2.preConcat(this.f33568u.get(size).f33570w.d());
                    }
                }
            } else {
                b bVar = this.f33567t;
                if (bVar != null) {
                    matrix2.preConcat(bVar.f33570w.d());
                }
            }
        }
        matrix2.preConcat(this.f33570w.d());
    }

    @Override // l2.f
    public final void e(l2.e eVar, int i10, ArrayList arrayList, l2.e eVar2) {
        b bVar = this.f33566s;
        e eVar3 = this.f33563p;
        if (bVar != null) {
            String str = bVar.f33563p.f33575c;
            eVar2.getClass();
            l2.e eVar4 = new l2.e(eVar2);
            eVar4.f32342a.add(str);
            if (eVar.a(i10, this.f33566s.f33563p.f33575c)) {
                b bVar2 = this.f33566s;
                l2.e eVar5 = new l2.e(eVar4);
                eVar5.f32343b = bVar2;
                arrayList.add(eVar5);
            }
            if (eVar.d(i10, eVar3.f33575c)) {
                this.f33566s.r(eVar, eVar.b(i10, this.f33566s.f33563p.f33575c) + i10, arrayList, eVar4);
            }
        }
        if (!eVar.c(i10, eVar3.f33575c)) {
            return;
        }
        String str2 = eVar3.f33575c;
        if (!"__container".equals(str2)) {
            eVar2.getClass();
            l2.e eVar6 = new l2.e(eVar2);
            eVar6.f32342a.add(str2);
            if (eVar.a(i10, str2)) {
                l2.e eVar7 = new l2.e(eVar6);
                eVar7.f32343b = this;
                arrayList.add(eVar7);
            }
            eVar2 = eVar6;
        }
        if (eVar.d(i10, str2)) {
            r(eVar, eVar.b(i10, str2) + i10, arrayList, eVar2);
        }
    }

    public final void f(j2.a<?, ?> aVar) {
        if (aVar == null) {
            return;
        }
        this.f33569v.add(aVar);
    }

    @Override // l2.f
    public void g(t2.c cVar, Object obj) {
        this.f33570w.c(cVar, obj);
    }

    @Override // i2.b
    public final String getName() {
        return this.f33563p.f33575c;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x022e  */
    @Override // i2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(android.graphics.Canvas r20, android.graphics.Matrix r21, int r22) {
        /*
            Method dump skipped, instructions count: 967
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.b.h(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    public final void j() {
        if (this.f33568u != null) {
            return;
        }
        if (this.f33567t == null) {
            this.f33568u = Collections.emptyList();
            return;
        }
        this.f33568u = new ArrayList();
        for (b bVar = this.f33567t; bVar != null; bVar = bVar.f33567t) {
            this.f33568u.add(bVar);
        }
    }

    public final void k(Canvas canvas) {
        RectF rectF = this.f33557i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f33556h);
        n.s0();
    }

    public abstract void l(Canvas canvas, Matrix matrix, int i10);

    public r m() {
        return this.f33563p.f33593w;
    }

    public j n() {
        return this.f33563p.f33594x;
    }

    public final boolean o() {
        androidx.viewpager2.widget.d dVar = this.f33564q;
        if (dVar != null && !((List) dVar.f2569s).isEmpty()) {
            return true;
        }
        return false;
    }

    public final void p() {
        i0 i0Var = this.o.f28357s.f28406a;
        String str = this.f33563p.f33575c;
        if (i0Var.f28422a) {
            HashMap hashMap = i0Var.f28424c;
            s2.e eVar = (s2.e) hashMap.get(str);
            if (eVar == null) {
                eVar = new s2.e();
                hashMap.put(str, eVar);
            }
            int i10 = eVar.f35109a + 1;
            eVar.f35109a = i10;
            if (i10 == Integer.MAX_VALUE) {
                eVar.f35109a = i10 / 2;
            }
            if (str.equals("__container")) {
                Iterator it = i0Var.f28423b.iterator();
                while (true) {
                    h.a aVar = (h.a) it;
                    if (aVar.hasNext()) {
                        ((i0.a) aVar.next()).a();
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void q(j2.a<?, ?> aVar) {
        this.f33569v.remove(aVar);
    }

    public void s(boolean z10) {
        if (z10 && this.f33572z == null) {
            this.f33572z = new h2.a();
        }
        this.y = z10;
    }

    public void t(float f) {
        o oVar = this.f33570w;
        j2.a<Integer, Integer> aVar = oVar.f29624j;
        if (aVar != null) {
            aVar.j(f);
        }
        j2.a<?, Float> aVar2 = oVar.f29627m;
        if (aVar2 != null) {
            aVar2.j(f);
        }
        j2.a<?, Float> aVar3 = oVar.f29628n;
        if (aVar3 != null) {
            aVar3.j(f);
        }
        j2.a<PointF, PointF> aVar4 = oVar.f;
        if (aVar4 != null) {
            aVar4.j(f);
        }
        j2.a<?, PointF> aVar5 = oVar.f29621g;
        if (aVar5 != null) {
            aVar5.j(f);
        }
        j2.a<t2.d, t2.d> aVar6 = oVar.f29622h;
        if (aVar6 != null) {
            aVar6.j(f);
        }
        j2.a<Float, Float> aVar7 = oVar.f29623i;
        if (aVar7 != null) {
            aVar7.j(f);
        }
        j2.d dVar = oVar.f29625k;
        if (dVar != null) {
            dVar.j(f);
        }
        j2.d dVar2 = oVar.f29626l;
        if (dVar2 != null) {
            dVar2.j(f);
        }
        int i10 = 0;
        androidx.viewpager2.widget.d dVar3 = this.f33564q;
        if (dVar3 != null) {
            int i11 = 0;
            while (true) {
                Object obj = dVar3.f2569s;
                if (i11 >= ((List) obj).size()) {
                    break;
                }
                ((j2.a) ((List) obj).get(i11)).j(f);
                i11++;
            }
        }
        j2.d dVar4 = this.f33565r;
        if (dVar4 != null) {
            dVar4.j(f);
        }
        b bVar = this.f33566s;
        if (bVar != null) {
            bVar.t(f);
        }
        while (true) {
            ArrayList arrayList = this.f33569v;
            if (i10 < arrayList.size()) {
                ((j2.a) arrayList.get(i10)).j(f);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // i2.b
    public final void b(List<i2.b> list, List<i2.b> list2) {
    }

    public void r(l2.e eVar, int i10, ArrayList arrayList, l2.e eVar2) {
    }
}
