package i2;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.ironsource.mediationsdk.logger.IronSourceError;
import g2.e0;

/* compiled from: GradientStrokeContent.java */
/* loaded from: classes.dex */
public final class h extends a {
    public final j2.g A;
    public j2.p B;

    /* renamed from: r, reason: collision with root package name */
    public final String f29101r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f29102s;

    /* renamed from: t, reason: collision with root package name */
    public final q.f<LinearGradient> f29103t;

    /* renamed from: u, reason: collision with root package name */
    public final q.f<RadialGradient> f29104u;

    /* renamed from: v, reason: collision with root package name */
    public final RectF f29105v;

    /* renamed from: w, reason: collision with root package name */
    public final int f29106w;

    /* renamed from: x, reason: collision with root package name */
    public final int f29107x;
    public final j2.e y;

    /* renamed from: z, reason: collision with root package name */
    public final j2.g f29108z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h(g2.a0 r14, o2.b r15, n2.e r16) {
        /*
            r13 = this;
            r10 = r13
            r11 = r15
            r12 = r16
            int r0 = r12.f33236h
            r1 = 0
            if (r0 == 0) goto La4
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
            int r0 = r12.f33237i
            if (r0 == 0) goto La3
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
            float r5 = r12.f33238j
            m2.d r6 = r12.f33233d
            m2.b r7 = r12.f33235g
            java.util.List<m2.b> r8 = r12.f33239k
            m2.b r9 = r12.f33240l
            r0 = r13
            r1 = r14
            r2 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            q.f r0 = new q.f
            r0.<init>()
            r10.f29103t = r0
            q.f r0 = new q.f
            r0.<init>()
            r10.f29104u = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r10.f29105v = r0
            java.lang.String r0 = r12.f33230a
            r10.f29101r = r0
            int r0 = r12.f33231b
            r10.f29106w = r0
            boolean r0 = r12.f33241m
            r10.f29102s = r0
            r0 = r14
            g2.h r0 = r0.f28357s
            float r0 = r0.b()
            r1 = 1107296256(0x42000000, float:32.0)
            float r0 = r0 / r1
            int r0 = (int) r0
            r10.f29107x = r0
            m2.c r0 = r12.f33232c
            j2.a r0 = r0.a()
            r1 = r0
            j2.e r1 = (j2.e) r1
            r10.y = r1
            r0.a(r13)
            r15.f(r0)
            m2.a r0 = r12.f33234e
            j2.a r0 = r0.a()
            r1 = r0
            j2.g r1 = (j2.g) r1
            r10.f29108z = r1
            r0.a(r13)
            r15.f(r0)
            m2.a r0 = r12.f
            j2.a r0 = r0.a()
            r1 = r0
            j2.g r1 = (j2.g) r1
            r10.A = r1
            r0.a(r13)
            r15.f(r0)
            return
        La3:
            throw r1
        La4:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.h.<init>(g2.a0, o2.b, n2.e):void");
    }

    public final int[] f(int[] iArr) {
        j2.p pVar = this.B;
        if (pVar != null) {
            Integer[] numArr = (Integer[]) pVar.f();
            int i10 = 0;
            if (iArr.length == numArr.length) {
                while (i10 < iArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i10 < numArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            }
        }
        return iArr;
    }

    @Override // i2.a, l2.f
    public final void g(t2.c cVar, Object obj) {
        super.g(cVar, obj);
        if (obj == e0.L) {
            j2.p pVar = this.B;
            o2.b bVar = this.f;
            if (pVar != null) {
                bVar.q(pVar);
            }
            if (cVar == null) {
                this.B = null;
                return;
            }
            j2.p pVar2 = new j2.p(cVar, null);
            this.B = pVar2;
            pVar2.a(this);
            bVar.f(this.B);
        }
    }

    @Override // i2.b
    public final String getName() {
        return this.f29101r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i2.a, i2.d
    public final void h(Canvas canvas, Matrix matrix, int i10) {
        Shader shader;
        if (this.f29102s) {
            return;
        }
        d(this.f29105v, matrix, false);
        int i11 = this.f29106w;
        j2.e eVar = this.y;
        j2.g gVar = this.A;
        j2.g gVar2 = this.f29108z;
        if (i11 == 1) {
            long j10 = j();
            q.f<LinearGradient> fVar = this.f29103t;
            shader = (LinearGradient) fVar.d(j10, null);
            if (shader == null) {
                PointF pointF = (PointF) gVar2.f();
                PointF pointF2 = (PointF) gVar.f();
                n2.c cVar = (n2.c) eVar.f();
                shader = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, f(cVar.f33222b), cVar.f33221a, Shader.TileMode.CLAMP);
                fVar.f(j10, shader);
            }
        } else {
            long j11 = j();
            q.f<RadialGradient> fVar2 = this.f29104u;
            shader = (RadialGradient) fVar2.d(j11, null);
            if (shader == null) {
                PointF pointF3 = (PointF) gVar2.f();
                PointF pointF4 = (PointF) gVar.f();
                n2.c cVar2 = (n2.c) eVar.f();
                int[] f = f(cVar2.f33222b);
                float[] fArr = cVar2.f33221a;
                shader = new RadialGradient(pointF3.x, pointF3.y, (float) Math.hypot(pointF4.x - r10, pointF4.y - r11), f, fArr, Shader.TileMode.CLAMP);
                fVar2.f(j11, shader);
            }
        }
        shader.setLocalMatrix(matrix);
        this.f29043i.setShader(shader);
        super.h(canvas, matrix, i10);
    }

    public final int j() {
        int i10;
        float f = this.f29108z.f29578d;
        float f10 = this.f29107x;
        int round = Math.round(f * f10);
        int round2 = Math.round(this.A.f29578d * f10);
        int round3 = Math.round(this.y.f29578d * f10);
        if (round != 0) {
            i10 = round * IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        } else {
            i10 = 17;
        }
        if (round2 != 0) {
            i10 = i10 * 31 * round2;
        }
        if (round3 != 0) {
            return i10 * 31 * round3;
        }
        return i10;
    }
}
