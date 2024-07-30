package i2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import g2.a0;
import g2.e0;
import j2.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* compiled from: RepeaterContent.java */
/* loaded from: classes.dex */
public final class o implements d, l, i, a.InterfaceC0404a, j {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f29137a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    public final Path f29138b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final a0 f29139c;

    /* renamed from: d, reason: collision with root package name */
    public final o2.b f29140d;

    /* renamed from: e, reason: collision with root package name */
    public final String f29141e;
    public final boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final j2.d f29142g;

    /* renamed from: h, reason: collision with root package name */
    public final j2.d f29143h;

    /* renamed from: i, reason: collision with root package name */
    public final j2.o f29144i;

    /* renamed from: j, reason: collision with root package name */
    public c f29145j;

    public o(a0 a0Var, o2.b bVar, n2.j jVar) {
        this.f29139c = a0Var;
        this.f29140d = bVar;
        this.f29141e = jVar.f33263a;
        this.f = jVar.f33267e;
        j2.a<Float, Float> a10 = jVar.f33264b.a();
        this.f29142g = (j2.d) a10;
        bVar.f(a10);
        a10.a(this);
        j2.a<Float, Float> a11 = jVar.f33265c.a();
        this.f29143h = (j2.d) a11;
        bVar.f(a11);
        a11.a(this);
        m2.h hVar = jVar.f33266d;
        hVar.getClass();
        j2.o oVar = new j2.o(hVar);
        this.f29144i = oVar;
        oVar.a(bVar);
        oVar.b(this);
    }

    @Override // j2.a.InterfaceC0404a
    public final void a() {
        this.f29139c.invalidateSelf();
    }

    @Override // i2.b
    public final void b(List<b> list, List<b> list2) {
        this.f29145j.b(list, list2);
    }

    @Override // i2.d
    public final void d(RectF rectF, Matrix matrix, boolean z10) {
        this.f29145j.d(rectF, matrix, z10);
    }

    @Override // l2.f
    public final void e(l2.e eVar, int i10, ArrayList arrayList, l2.e eVar2) {
        s2.f.d(eVar, i10, arrayList, eVar2, this);
        for (int i11 = 0; i11 < this.f29145j.f29059h.size(); i11++) {
            b bVar = this.f29145j.f29059h.get(i11);
            if (bVar instanceof j) {
                s2.f.d(eVar, i10, arrayList, eVar2, (j) bVar);
            }
        }
    }

    @Override // i2.i
    public final void f(ListIterator<b> listIterator) {
        if (this.f29145j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f29145j = new c(this.f29139c, this.f29140d, "Repeater", this.f, arrayList, null);
    }

    @Override // l2.f
    public final void g(t2.c cVar, Object obj) {
        if (this.f29144i.c(cVar, obj)) {
            return;
        }
        if (obj == e0.f28391u) {
            this.f29142g.k(cVar);
        } else if (obj == e0.f28392v) {
            this.f29143h.k(cVar);
        }
    }

    @Override // i2.b
    public final String getName() {
        return this.f29141e;
    }

    @Override // i2.d
    public final void h(Canvas canvas, Matrix matrix, int i10) {
        float floatValue = this.f29142g.f().floatValue();
        float floatValue2 = this.f29143h.f().floatValue();
        j2.o oVar = this.f29144i;
        float floatValue3 = oVar.f29627m.f().floatValue() / 100.0f;
        float floatValue4 = oVar.f29628n.f().floatValue() / 100.0f;
        int i11 = (int) floatValue;
        while (true) {
            i11--;
            if (i11 >= 0) {
                Matrix matrix2 = this.f29137a;
                matrix2.set(matrix);
                float f = i11;
                matrix2.preConcat(oVar.e(f + floatValue2));
                PointF pointF = s2.f.f35110a;
                this.f29145j.h(canvas, matrix2, (int) ((((floatValue4 - floatValue3) * (f / floatValue)) + floatValue3) * i10));
            } else {
                return;
            }
        }
    }

    @Override // i2.l
    public final Path i() {
        Path i10 = this.f29145j.i();
        Path path = this.f29138b;
        path.reset();
        float floatValue = this.f29142g.f().floatValue();
        float floatValue2 = this.f29143h.f().floatValue();
        int i11 = (int) floatValue;
        while (true) {
            i11--;
            if (i11 >= 0) {
                Matrix matrix = this.f29137a;
                matrix.set(this.f29144i.e(i11 + floatValue2));
                path.addPath(i10, matrix);
            } else {
                return path;
            }
        }
    }
}
