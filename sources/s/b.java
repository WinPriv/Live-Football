package s;

import com.huawei.hms.ads.gl;
import java.util.ArrayList;
import s.c;

/* compiled from: ArrayRow.java */
/* loaded from: classes.dex */
public class b implements c.a {

    /* renamed from: d, reason: collision with root package name */
    public a f35006d;

    /* renamed from: a, reason: collision with root package name */
    public g f35003a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f35004b = gl.Code;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList<g> f35005c = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    public boolean f35007e = false;

    /* compiled from: ArrayRow.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(g gVar, float f);

        int b();

        float c(b bVar, boolean z10);

        void clear();

        float d(g gVar, boolean z10);

        g e(int i10);

        float f(g gVar);

        void g();

        float h(int i10);

        boolean i(g gVar);

        void j(float f);

        void k(g gVar, float f, boolean z10);
    }

    public b() {
    }

    @Override // s.c.a
    public g a(boolean[] zArr) {
        return f(zArr, null);
    }

    public final void b(c cVar, int i10) {
        this.f35006d.a(cVar.j(i10), 1.0f);
        this.f35006d.a(cVar.j(i10), -1.0f);
    }

    public final void c(g gVar, g gVar2, g gVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f35004b = i10;
        }
        if (!z10) {
            this.f35006d.a(gVar, -1.0f);
            this.f35006d.a(gVar2, 1.0f);
            this.f35006d.a(gVar3, 1.0f);
        } else {
            this.f35006d.a(gVar, 1.0f);
            this.f35006d.a(gVar2, -1.0f);
            this.f35006d.a(gVar3, -1.0f);
        }
    }

    public final void d(g gVar, g gVar2, g gVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f35004b = i10;
        }
        if (!z10) {
            this.f35006d.a(gVar, -1.0f);
            this.f35006d.a(gVar2, 1.0f);
            this.f35006d.a(gVar3, -1.0f);
        } else {
            this.f35006d.a(gVar, 1.0f);
            this.f35006d.a(gVar2, -1.0f);
            this.f35006d.a(gVar3, 1.0f);
        }
    }

    public boolean e() {
        if (this.f35003a == null && this.f35004b == gl.Code && this.f35006d.b() == 0) {
            return true;
        }
        return false;
    }

    public final g f(boolean[] zArr, g gVar) {
        int i10;
        int b10 = this.f35006d.b();
        g gVar2 = null;
        float f = 0.0f;
        for (int i11 = 0; i11 < b10; i11++) {
            float h10 = this.f35006d.h(i11);
            if (h10 < gl.Code) {
                g e10 = this.f35006d.e(i11);
                if ((zArr == null || !zArr[e10.f35033t]) && e10 != gVar && (((i10 = e10.A) == 3 || i10 == 4) && h10 < f)) {
                    f = h10;
                    gVar2 = e10;
                }
            }
        }
        return gVar2;
    }

    public final void g(g gVar) {
        g gVar2 = this.f35003a;
        if (gVar2 != null) {
            this.f35006d.a(gVar2, -1.0f);
            this.f35003a.f35034u = -1;
            this.f35003a = null;
        }
        float d10 = this.f35006d.d(gVar, true) * (-1.0f);
        this.f35003a = gVar;
        if (d10 == 1.0f) {
            return;
        }
        this.f35004b /= d10;
        this.f35006d.j(d10);
    }

    public final void h(c cVar, g gVar, boolean z10) {
        if (gVar != null && gVar.f35037x) {
            float f = this.f35006d.f(gVar);
            this.f35004b = (gVar.f35036w * f) + this.f35004b;
            this.f35006d.d(gVar, z10);
            if (z10) {
                gVar.b(this);
            }
            if (this.f35006d.b() == 0) {
                this.f35007e = true;
                cVar.f35010a = true;
            }
        }
    }

    public void i(c cVar, b bVar, boolean z10) {
        float c10 = this.f35006d.c(bVar, z10);
        this.f35004b = (bVar.f35004b * c10) + this.f35004b;
        if (z10) {
            bVar.f35003a.b(this);
        }
        if (this.f35003a != null && this.f35006d.b() == 0) {
            this.f35007e = true;
            cVar.f35010a = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r9 = this;
            s.g r0 = r9.f35003a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            s.g r1 = r9.f35003a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = com.ironsource.adapters.facebook.a.h(r0, r1)
            float r1 = r9.f35004b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L35
            java.lang.StringBuilder r0 = com.ironsource.adapters.facebook.a.j(r0)
            float r1 = r9.f35004b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r3
            goto L36
        L35:
            r1 = r4
        L36:
            s.b$a r5 = r9.f35006d
            int r5 = r5.b()
        L3c:
            if (r4 >= r5) goto L9b
            s.b$a r6 = r9.f35006d
            s.g r6 = r6.e(r4)
            if (r6 != 0) goto L47
            goto L98
        L47:
            s.b$a r7 = r9.f35006d
            float r7 = r7.h(r4)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L52
            goto L98
        L52:
            java.lang.String r6 = r6.toString()
            if (r1 != 0) goto L63
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L75
            java.lang.String r1 = "- "
            java.lang.String r0 = com.ironsource.adapters.facebook.a.h(r0, r1)
            goto L72
        L63:
            if (r8 <= 0) goto L6c
            java.lang.String r1 = " + "
            java.lang.String r0 = com.ironsource.adapters.facebook.a.h(r0, r1)
            goto L75
        L6c:
            java.lang.String r1 = " - "
            java.lang.String r0 = com.ironsource.adapters.facebook.a.h(r0, r1)
        L72:
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r7 = r7 * r1
        L75:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L80
            java.lang.String r0 = com.ironsource.adapters.facebook.a.h(r0, r6)
            goto L97
        L80:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L97:
            r1 = r3
        L98:
            int r4 = r4 + 1
            goto L3c
        L9b:
            if (r1 != 0) goto La3
            java.lang.String r1 = "0.0"
            java.lang.String r0 = com.ironsource.adapters.facebook.a.h(r0, r1)
        La3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s.b.toString():java.lang.String");
    }

    public b(m2.g gVar) {
        this.f35006d = new s.a(this, gVar);
    }
}
