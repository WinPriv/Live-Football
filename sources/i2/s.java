package i2;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import g2.e0;

/* compiled from: StrokeContent.java */
/* loaded from: classes.dex */
public final class s extends a {

    /* renamed from: r, reason: collision with root package name */
    public final o2.b f29154r;

    /* renamed from: s, reason: collision with root package name */
    public final String f29155s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f29156t;

    /* renamed from: u, reason: collision with root package name */
    public final j2.g f29157u;

    /* renamed from: v, reason: collision with root package name */
    public j2.p f29158v;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public s(g2.a0 r14, o2.b r15, n2.p r16) {
        /*
            r13 = this;
            r10 = r13
            r11 = r15
            r12 = r16
            int r0 = r12.f33289g
            r1 = 0
            if (r0 == 0) goto L5e
            int r0 = r0 + (-1)
            r2 = 1
            if (r0 == 0) goto L16
            if (r0 == r2) goto L13
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.SQUARE
            goto L18
        L13:
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.ROUND
            goto L18
        L16:
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.BUTT
        L18:
            r3 = r0
            int r0 = r12.f33290h
            if (r0 == 0) goto L5d
            int r0 = r0 + (-1)
            if (r0 == 0) goto L2e
            if (r0 == r2) goto L2b
            r2 = 2
            if (r0 == r2) goto L28
            r4 = r1
            goto L31
        L28:
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.BEVEL
            goto L30
        L2b:
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.ROUND
            goto L30
        L2e:
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.MITER
        L30:
            r4 = r0
        L31:
            float r5 = r12.f33291i
            m2.d r6 = r12.f33288e
            m2.b r7 = r12.f
            java.util.List<m2.b> r8 = r12.f33286c
            m2.b r9 = r12.f33285b
            r0 = r13
            r1 = r14
            r2 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.f29154r = r11
            java.lang.String r0 = r12.f33284a
            r10.f29155s = r0
            boolean r0 = r12.f33292j
            r10.f29156t = r0
            m2.a r0 = r12.f33287d
            j2.a r0 = r0.a()
            r1 = r0
            j2.g r1 = (j2.g) r1
            r10.f29157u = r1
            r0.a(r13)
            r15.f(r0)
            return
        L5d:
            throw r1
        L5e:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.s.<init>(g2.a0, o2.b, n2.p):void");
    }

    @Override // i2.a, l2.f
    public final void g(t2.c cVar, Object obj) {
        super.g(cVar, obj);
        Integer num = e0.f28374b;
        j2.g gVar = this.f29157u;
        if (obj == num) {
            gVar.k(cVar);
            return;
        }
        if (obj == e0.K) {
            j2.p pVar = this.f29158v;
            o2.b bVar = this.f29154r;
            if (pVar != null) {
                bVar.q(pVar);
            }
            if (cVar == null) {
                this.f29158v = null;
                return;
            }
            j2.p pVar2 = new j2.p(cVar, null);
            this.f29158v = pVar2;
            pVar2.a(this);
            bVar.f(gVar);
        }
    }

    @Override // i2.b
    public final String getName() {
        return this.f29155s;
    }

    @Override // i2.a, i2.d
    public final void h(Canvas canvas, Matrix matrix, int i10) {
        if (this.f29156t) {
            return;
        }
        j2.b bVar = (j2.b) this.f29157u;
        int l10 = bVar.l(bVar.b(), bVar.d());
        h2.a aVar = this.f29043i;
        aVar.setColor(l10);
        j2.p pVar = this.f29158v;
        if (pVar != null) {
            aVar.setColorFilter((ColorFilter) pVar.f());
        }
        super.h(canvas, matrix, i10);
    }
}
