package j5;

import android.net.Uri;
import k4.n0;
import k4.q1;

/* compiled from: SinglePeriodTimeline.java */
/* loaded from: classes2.dex */
public final class i0 extends q1 {
    public static final Object G = new Object();
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final Object D;
    public final k4.n0 E;
    public final n0.e F;

    /* renamed from: t, reason: collision with root package name */
    public final long f29759t;

    /* renamed from: u, reason: collision with root package name */
    public final long f29760u;

    /* renamed from: v, reason: collision with root package name */
    public final long f29761v;

    /* renamed from: w, reason: collision with root package name */
    public final long f29762w;

    /* renamed from: x, reason: collision with root package name */
    public final long f29763x;
    public final long y;

    /* renamed from: z, reason: collision with root package name */
    public final long f29764z;

    static {
        n0.a aVar = new n0.a();
        aVar.f30580a = "SinglePeriodTimeline";
        aVar.f30581b = Uri.EMPTY;
        aVar.a();
    }

    public i0(long j10, boolean z10, boolean z11, k4.n0 n0Var) {
        this(j10, j10, 0L, 0L, z10, false, z11, null, n0Var);
    }

    @Override // k4.q1
    public final int b(Object obj) {
        if (G.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override // k4.q1
    public final q1.b f(int i10, q1.b bVar, boolean z10) {
        Object obj;
        d6.a.c(i10, 1);
        if (z10) {
            obj = G;
        } else {
            obj = null;
        }
        long j10 = this.f29762w;
        long j11 = -this.y;
        bVar.getClass();
        bVar.h(null, obj, 0, j10, j11, k5.a.y, false);
        return bVar;
    }

    @Override // k4.q1
    public final int h() {
        return 1;
    }

    @Override // k4.q1
    public final Object l(int i10) {
        d6.a.c(i10, 1);
        return G;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r1 > r3) goto L13;
     */
    @Override // k4.q1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final k4.q1.c n(int r24, k4.q1.c r25, long r26) {
        /*
            r23 = this;
            r0 = r23
            r1 = 1
            r2 = r24
            d6.a.c(r2, r1)
            boolean r13 = r0.B
            long r1 = r0.f29764z
            if (r13 == 0) goto L2c
            boolean r3 = r0.C
            if (r3 != 0) goto L2c
            r3 = 0
            int r3 = (r26 > r3 ? 1 : (r26 == r3 ? 0 : -1))
            if (r3 == 0) goto L2c
            long r3 = r0.f29763x
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L24
            goto L2a
        L24:
            long r1 = r1 + r26
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2c
        L2a:
            r15 = r5
            goto L2d
        L2c:
            r15 = r1
        L2d:
            java.lang.Object r3 = k4.q1.c.J
            k4.n0 r4 = r0.E
            java.lang.Object r5 = r0.D
            long r6 = r0.f29759t
            long r8 = r0.f29760u
            long r10 = r0.f29761v
            boolean r12 = r0.A
            k4.n0$e r14 = r0.F
            long r1 = r0.f29763x
            r17 = r1
            r19 = 0
            r20 = 0
            long r1 = r0.y
            r21 = r1
            r2 = r25
            r2.b(r3, r4, r5, r6, r8, r10, r12, r13, r14, r15, r17, r19, r20, r21)
            return r25
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.i0.n(int, k4.q1$c, long):k4.q1$c");
    }

    @Override // k4.q1
    public final int o() {
        return 1;
    }

    public i0(long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, q5.a aVar, k4.n0 n0Var) {
        this(com.anythink.expressad.exoplayer.b.f7291b, com.anythink.expressad.exoplayer.b.f7291b, j10, j11, j12, j13, z10, z11, false, aVar, n0Var, z12 ? n0Var.f30576u : null);
    }

    public i0(long j10, long j11, long j12, long j13, long j14, long j15, boolean z10, boolean z11, boolean z12, Object obj, k4.n0 n0Var, n0.e eVar) {
        this.f29759t = j10;
        this.f29760u = j11;
        this.f29761v = com.anythink.expressad.exoplayer.b.f7291b;
        this.f29762w = j12;
        this.f29763x = j13;
        this.y = j14;
        this.f29764z = j15;
        this.A = z10;
        this.B = z11;
        this.C = z12;
        this.D = obj;
        n0Var.getClass();
        this.E = n0Var;
        this.F = eVar;
    }
}
