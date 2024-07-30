package i2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.huawei.hms.ads.gl;
import g2.a0;
import j2.a;
import java.util.ArrayList;
import java.util.List;
import s2.g;

/* compiled from: ContentGroup.java */
/* loaded from: classes.dex */
public final class c implements d, l, a.InterfaceC0404a, l2.f {

    /* renamed from: a, reason: collision with root package name */
    public final h2.a f29053a;

    /* renamed from: b, reason: collision with root package name */
    public final RectF f29054b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f29055c;

    /* renamed from: d, reason: collision with root package name */
    public final Path f29056d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f29057e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f29058g;

    /* renamed from: h, reason: collision with root package name */
    public final List<b> f29059h;

    /* renamed from: i, reason: collision with root package name */
    public final a0 f29060i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f29061j;

    /* renamed from: k, reason: collision with root package name */
    public final j2.o f29062k;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(g2.a0 r8, o2.b r9, n2.n r10, g2.h r11) {
        /*
            r7 = this;
            java.lang.String r3 = r10.f33277a
            boolean r4 = r10.f33279c
            java.util.ArrayList r5 = new java.util.ArrayList
            java.util.List<n2.b> r10 = r10.f33278b
            int r0 = r10.size()
            r5.<init>(r0)
            r0 = 0
            r1 = r0
        L11:
            int r2 = r10.size()
            if (r1 >= r2) goto L29
            java.lang.Object r2 = r10.get(r1)
            n2.b r2 = (n2.b) r2
            i2.b r2 = r2.a(r8, r11, r9)
            if (r2 == 0) goto L26
            r5.add(r2)
        L26:
            int r1 = r1 + 1
            goto L11
        L29:
            int r11 = r10.size()
            if (r0 >= r11) goto L40
            java.lang.Object r11 = r10.get(r0)
            n2.b r11 = (n2.b) r11
            boolean r1 = r11 instanceof m2.h
            if (r1 == 0) goto L3d
            m2.h r11 = (m2.h) r11
            r6 = r11
            goto L42
        L3d:
            int r0 = r0 + 1
            goto L29
        L40:
            r10 = 0
            r6 = r10
        L42:
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.c.<init>(g2.a0, o2.b, n2.n, g2.h):void");
    }

    @Override // j2.a.InterfaceC0404a
    public final void a() {
        this.f29060i.invalidateSelf();
    }

    @Override // i2.b
    public final void b(List<b> list, List<b> list2) {
        int size = list.size();
        List<b> list3 = this.f29059h;
        ArrayList arrayList = new ArrayList(list3.size() + size);
        arrayList.addAll(list);
        for (int size2 = list3.size() - 1; size2 >= 0; size2--) {
            b bVar = list3.get(size2);
            bVar.b(arrayList, list3.subList(0, size2));
            arrayList.add(bVar);
        }
    }

    @Override // i2.d
    public final void d(RectF rectF, Matrix matrix, boolean z10) {
        Matrix matrix2 = this.f29055c;
        matrix2.set(matrix);
        j2.o oVar = this.f29062k;
        if (oVar != null) {
            matrix2.preConcat(oVar.d());
        }
        RectF rectF2 = this.f29057e;
        rectF2.set(gl.Code, gl.Code, gl.Code, gl.Code);
        List<b> list = this.f29059h;
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                b bVar = list.get(size);
                if (bVar instanceof d) {
                    ((d) bVar).d(rectF2, matrix2, z10);
                    rectF.union(rectF2);
                }
            } else {
                return;
            }
        }
    }

    @Override // l2.f
    public final void e(l2.e eVar, int i10, ArrayList arrayList, l2.e eVar2) {
        String str = this.f;
        if (!eVar.c(i10, str) && !"__container".equals(str)) {
            return;
        }
        if (!"__container".equals(str)) {
            eVar2.getClass();
            l2.e eVar3 = new l2.e(eVar2);
            eVar3.f32342a.add(str);
            if (eVar.a(i10, str)) {
                l2.e eVar4 = new l2.e(eVar3);
                eVar4.f32343b = this;
                arrayList.add(eVar4);
            }
            eVar2 = eVar3;
        }
        if (eVar.d(i10, str)) {
            int b10 = eVar.b(i10, str) + i10;
            int i11 = 0;
            while (true) {
                List<b> list = this.f29059h;
                if (i11 < list.size()) {
                    b bVar = list.get(i11);
                    if (bVar instanceof l2.f) {
                        ((l2.f) bVar).e(eVar, b10, arrayList, eVar2);
                    }
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    public final List<l> f() {
        if (this.f29061j == null) {
            this.f29061j = new ArrayList();
            int i10 = 0;
            while (true) {
                List<b> list = this.f29059h;
                if (i10 >= list.size()) {
                    break;
                }
                b bVar = list.get(i10);
                if (bVar instanceof l) {
                    this.f29061j.add((l) bVar);
                }
                i10++;
            }
        }
        return this.f29061j;
    }

    @Override // l2.f
    public final void g(t2.c cVar, Object obj) {
        j2.o oVar = this.f29062k;
        if (oVar != null) {
            oVar.c(cVar, obj);
        }
    }

    @Override // i2.b
    public final String getName() {
        return this.f;
    }

    @Override // i2.d
    public final void h(Canvas canvas, Matrix matrix, int i10) {
        boolean z10;
        int intValue;
        if (this.f29058g) {
            return;
        }
        Matrix matrix2 = this.f29055c;
        matrix2.set(matrix);
        j2.o oVar = this.f29062k;
        if (oVar != null) {
            matrix2.preConcat(oVar.d());
            j2.a<Integer, Integer> aVar = oVar.f29624j;
            if (aVar == null) {
                intValue = 100;
            } else {
                intValue = aVar.f().intValue();
            }
            i10 = (int) ((((intValue / 100.0f) * i10) / 255.0f) * 255.0f);
        }
        boolean z11 = this.f29060i.L;
        boolean z12 = false;
        List<b> list = this.f29059h;
        if (z11) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i11 < list.size()) {
                    if ((list.get(i11) instanceof d) && (i12 = i12 + 1) >= 2) {
                        z10 = true;
                        break;
                    }
                    i11++;
                } else {
                    z10 = false;
                    break;
                }
            }
            if (z10 && i10 != 255) {
                z12 = true;
            }
        }
        if (z12) {
            RectF rectF = this.f29054b;
            rectF.set(gl.Code, gl.Code, gl.Code, gl.Code);
            d(rectF, matrix2, true);
            h2.a aVar2 = this.f29053a;
            aVar2.setAlpha(i10);
            g.a aVar3 = s2.g.f35111a;
            canvas.saveLayer(rectF, aVar2);
            androidx.activity.n.s0();
        }
        if (z12) {
            i10 = 255;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            b bVar = list.get(size);
            if (bVar instanceof d) {
                ((d) bVar).h(canvas, matrix2, i10);
            }
        }
        if (z12) {
            canvas.restore();
        }
    }

    @Override // i2.l
    public final Path i() {
        Matrix matrix = this.f29055c;
        matrix.reset();
        j2.o oVar = this.f29062k;
        if (oVar != null) {
            matrix.set(oVar.d());
        }
        Path path = this.f29056d;
        path.reset();
        if (this.f29058g) {
            return path;
        }
        List<b> list = this.f29059h;
        for (int size = list.size() - 1; size >= 0; size--) {
            b bVar = list.get(size);
            if (bVar instanceof l) {
                path.addPath(((l) bVar).i(), matrix);
            }
        }
        return path;
    }

    public c(a0 a0Var, o2.b bVar, String str, boolean z10, ArrayList arrayList, m2.h hVar) {
        this.f29053a = new h2.a();
        this.f29054b = new RectF();
        this.f29055c = new Matrix();
        this.f29056d = new Path();
        this.f29057e = new RectF();
        this.f = str;
        this.f29060i = a0Var;
        this.f29058g = z10;
        this.f29059h = arrayList;
        if (hVar != null) {
            j2.o oVar = new j2.o(hVar);
            this.f29062k = oVar;
            oVar.a(bVar);
            oVar.b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            b bVar2 = (b) arrayList.get(size);
            if (bVar2 instanceof i) {
                arrayList2.add((i) bVar2);
            }
        }
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return;
            } else {
                ((i) arrayList2.get(size2)).f(arrayList.listIterator(arrayList.size()));
            }
        }
    }
}
