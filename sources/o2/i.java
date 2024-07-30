package o2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.huawei.hms.ads.gl;
import g2.a0;
import g2.e0;
import j2.m;
import j2.n;
import j2.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* compiled from: TextLayer.java */
/* loaded from: classes.dex */
public final class i extends o2.b {
    public final StringBuilder C;
    public final RectF D;
    public final Matrix E;
    public final a F;
    public final b G;
    public final HashMap H;
    public final q.f<String> I;
    public final ArrayList J;
    public final n K;
    public final a0 L;
    public final g2.h M;
    public final j2.g N;
    public p O;
    public final j2.g P;
    public p Q;
    public final j2.d R;
    public p S;
    public final j2.d T;
    public p U;
    public p V;
    public p W;

    /* compiled from: TextLayer.java */
    /* loaded from: classes.dex */
    public class a extends Paint {
        public a() {
            super(1);
            setStyle(Paint.Style.FILL);
        }
    }

    /* compiled from: TextLayer.java */
    /* loaded from: classes.dex */
    public class b extends Paint {
        public b() {
            super(1);
            setStyle(Paint.Style.STROKE);
        }
    }

    /* compiled from: TextLayer.java */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public String f33595a = "";

        /* renamed from: b, reason: collision with root package name */
        public float f33596b = gl.Code;
    }

    public i(a0 a0Var, e eVar) {
        super(a0Var, eVar);
        m2.b bVar;
        m2.b bVar2;
        m2.a aVar;
        m2.a aVar2;
        this.C = new StringBuilder(2);
        this.D = new RectF();
        this.E = new Matrix();
        this.F = new a();
        this.G = new b();
        this.H = new HashMap();
        this.I = new q.f<>();
        this.J = new ArrayList();
        this.L = a0Var;
        this.M = eVar.f33574b;
        n nVar = new n((List) eVar.f33587q.f35738t);
        this.K = nVar;
        nVar.a(this);
        f(nVar);
        m2.g gVar = eVar.f33588r;
        if (gVar != null && (aVar2 = (m2.a) gVar.f32645s) != null) {
            j2.a<?, ?> a10 = aVar2.a();
            this.N = (j2.g) a10;
            a10.a(this);
            f(a10);
        }
        if (gVar != null && (aVar = (m2.a) gVar.f32646t) != null) {
            j2.a<?, ?> a11 = aVar.a();
            this.P = (j2.g) a11;
            a11.a(this);
            f(a11);
        }
        if (gVar != null && (bVar2 = (m2.b) gVar.f32647u) != null) {
            j2.a<?, ?> a12 = bVar2.a();
            this.R = (j2.d) a12;
            a12.a(this);
            f(a12);
        }
        if (gVar != null && (bVar = (m2.b) gVar.f32648v) != null) {
            j2.a<?, ?> a13 = bVar.a();
            this.T = (j2.d) a13;
            a13.a(this);
            f(a13);
        }
    }

    public static void u(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == gl.Code) {
            return;
        }
        canvas.drawText(str, 0, str.length(), gl.Code, gl.Code, paint);
    }

    public static void v(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == gl.Code) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    public static List x(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    public static void y(Canvas canvas, l2.b bVar, int i10, float f) {
        float f10;
        float f11;
        PointF pointF = bVar.f32330l;
        PointF pointF2 = bVar.f32331m;
        float c10 = s2.g.c();
        float f12 = gl.Code;
        if (pointF == null) {
            f10 = 0.0f;
        } else {
            f10 = (bVar.f * c10) + pointF.y;
        }
        float f13 = (i10 * bVar.f * c10) + f10;
        if (pointF == null) {
            f11 = 0.0f;
        } else {
            f11 = pointF.x;
        }
        if (pointF2 != null) {
            f12 = pointF2.x;
        }
        int c11 = s.f.c(bVar.f32323d);
        if (c11 != 0) {
            if (c11 != 1) {
                if (c11 == 2) {
                    canvas.translate(((f12 / 2.0f) + f11) - (f / 2.0f), f13);
                    return;
                }
                return;
            }
            canvas.translate((f11 + f12) - f, f13);
            return;
        }
        canvas.translate(f11, f13);
    }

    @Override // o2.b, i2.d
    public final void d(RectF rectF, Matrix matrix, boolean z10) {
        super.d(rectF, matrix, z10);
        g2.h hVar = this.M;
        rectF.set(gl.Code, gl.Code, hVar.f28414j.width(), hVar.f28414j.height());
    }

    @Override // o2.b, l2.f
    public final void g(t2.c cVar, Object obj) {
        super.g(cVar, obj);
        if (obj == e0.f28373a) {
            p pVar = this.O;
            if (pVar != null) {
                q(pVar);
            }
            if (cVar == null) {
                this.O = null;
                return;
            }
            p pVar2 = new p(cVar, null);
            this.O = pVar2;
            pVar2.a(this);
            f(this.O);
            return;
        }
        if (obj == e0.f28374b) {
            p pVar3 = this.Q;
            if (pVar3 != null) {
                q(pVar3);
            }
            if (cVar == null) {
                this.Q = null;
                return;
            }
            p pVar4 = new p(cVar, null);
            this.Q = pVar4;
            pVar4.a(this);
            f(this.Q);
            return;
        }
        if (obj == e0.f28389s) {
            p pVar5 = this.S;
            if (pVar5 != null) {
                q(pVar5);
            }
            if (cVar == null) {
                this.S = null;
                return;
            }
            p pVar6 = new p(cVar, null);
            this.S = pVar6;
            pVar6.a(this);
            f(this.S);
            return;
        }
        if (obj == e0.f28390t) {
            p pVar7 = this.U;
            if (pVar7 != null) {
                q(pVar7);
            }
            if (cVar == null) {
                this.U = null;
                return;
            }
            p pVar8 = new p(cVar, null);
            this.U = pVar8;
            pVar8.a(this);
            f(this.U);
            return;
        }
        if (obj == e0.F) {
            p pVar9 = this.V;
            if (pVar9 != null) {
                q(pVar9);
            }
            if (cVar == null) {
                this.V = null;
                return;
            }
            p pVar10 = new p(cVar, null);
            this.V = pVar10;
            pVar10.a(this);
            f(this.V);
            return;
        }
        if (obj == e0.M) {
            p pVar11 = this.W;
            if (pVar11 != null) {
                q(pVar11);
            }
            if (cVar == null) {
                this.W = null;
                return;
            }
            p pVar12 = new p(cVar, null);
            this.W = pVar12;
            pVar12.a(this);
            f(this.W);
            return;
        }
        if (obj == e0.O) {
            n nVar = this.K;
            nVar.getClass();
            nVar.k(new m(new t2.b(), cVar, new l2.b()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03b2  */
    @Override // o2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(android.graphics.Canvas r27, android.graphics.Matrix r28, int r29) {
        /*
            Method dump skipped, instructions count: 1255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.i.l(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    public final c w(int i10) {
        ArrayList arrayList = this.J;
        for (int size = arrayList.size(); size < i10; size++) {
            arrayList.add(new c());
        }
        return (c) arrayList.get(i10 - 1);
    }

    public final List<c> z(String str, float f, l2.c cVar, float f10, float f11, boolean z10) {
        float measureText;
        int i10 = 0;
        int i11 = 0;
        boolean z11 = false;
        int i12 = 0;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        for (int i13 = 0; i13 < str.length(); i13++) {
            char charAt = str.charAt(i13);
            if (z10) {
                l2.d dVar = (l2.d) this.M.f28411g.c(cVar.f32334c.hashCode() + e0.i.b(cVar.f32332a, charAt * 31, 31), null);
                if (dVar != null) {
                    measureText = (s2.g.c() * ((float) dVar.f32338c) * f10) + f11;
                }
            } else {
                measureText = this.F.measureText(str.substring(i13, i13 + 1)) + f11;
            }
            if (charAt == ' ') {
                z11 = true;
                f14 = measureText;
            } else if (z11) {
                z11 = false;
                i12 = i13;
                f13 = measureText;
            } else {
                f13 += measureText;
            }
            f12 += measureText;
            if (f > gl.Code && f12 >= f && charAt != ' ') {
                i10++;
                c w10 = w(i10);
                if (i12 == i11) {
                    w10.f33595a = str.substring(i11, i13).trim();
                    w10.f33596b = (f12 - measureText) - ((r8.length() - r6.length()) * f14);
                    i11 = i13;
                    i12 = i11;
                    f12 = measureText;
                    f13 = f12;
                } else {
                    w10.f33595a = str.substring(i11, i12 - 1).trim();
                    w10.f33596b = ((f12 - f13) - ((r6.length() - r13.length()) * f14)) - f14;
                    i11 = i12;
                    f12 = f13;
                }
            }
        }
        if (f12 > gl.Code) {
            i10++;
            c w11 = w(i10);
            w11.f33595a = str.substring(i11);
            w11.f33596b = f12;
        }
        return this.J.subList(0, i10);
    }
}
