package com.applovin.exoplayer2.h;

import android.net.Uri;
import com.applovin.exoplayer2.ab;
import com.applovin.exoplayer2.ba;

/* loaded from: classes.dex */
public final class aa extends ba {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f15264c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static final com.applovin.exoplayer2.ab f15265d = new ab.b().a("SinglePeriodTimeline").a(Uri.EMPTY).a();

    /* renamed from: e, reason: collision with root package name */
    private final long f15266e;
    private final long f;

    /* renamed from: g, reason: collision with root package name */
    private final long f15267g;

    /* renamed from: h, reason: collision with root package name */
    private final long f15268h;

    /* renamed from: i, reason: collision with root package name */
    private final long f15269i;

    /* renamed from: j, reason: collision with root package name */
    private final long f15270j;

    /* renamed from: k, reason: collision with root package name */
    private final long f15271k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f15272l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f15273m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f15274n;
    private final Object o;

    /* renamed from: p, reason: collision with root package name */
    private final com.applovin.exoplayer2.ab f15275p;

    /* renamed from: q, reason: collision with root package name */
    private final ab.e f15276q;

    public aa(long j10, boolean z10, boolean z11, boolean z12, Object obj, com.applovin.exoplayer2.ab abVar) {
        this(j10, j10, 0L, 0L, z10, z11, z12, obj, abVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r1 > r3) goto L10;
     */
    @Override // com.applovin.exoplayer2.ba
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.applovin.exoplayer2.ba.c a(int r25, com.applovin.exoplayer2.ba.c r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 0
            r2 = 1
            r3 = r25
            com.applovin.exoplayer2.l.a.a(r3, r1, r2)
            long r1 = r0.f15271k
            boolean r14 = r0.f15273m
            if (r14 == 0) goto L2e
            boolean r3 = r0.f15274n
            if (r3 != 0) goto L2e
            r3 = 0
            int r3 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r3 == 0) goto L2e
            long r3 = r0.f15269i
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L27
        L24:
            r16 = r5
            goto L30
        L27:
            long r1 = r1 + r27
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2e
            goto L24
        L2e:
            r16 = r1
        L30:
            java.lang.Object r4 = com.applovin.exoplayer2.ba.c.f13585a
            com.applovin.exoplayer2.ab r5 = r0.f15275p
            java.lang.Object r6 = r0.o
            long r7 = r0.f15266e
            long r9 = r0.f
            long r11 = r0.f15267g
            boolean r13 = r0.f15272l
            com.applovin.exoplayer2.ab$e r15 = r0.f15276q
            long r1 = r0.f15269i
            r18 = r1
            r20 = 0
            r21 = 0
            long r1 = r0.f15270j
            r22 = r1
            r3 = r26
            com.applovin.exoplayer2.ba$c r1 = r3.a(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.h.aa.a(int, com.applovin.exoplayer2.ba$c, long):com.applovin.exoplayer2.ba$c");
    }

    @Override // com.applovin.exoplayer2.ba
    public int b() {
        return 1;
    }

    @Override // com.applovin.exoplayer2.ba
    public int c() {
        return 1;
    }

    public aa(long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, Object obj, com.applovin.exoplayer2.ab abVar) {
        this(com.anythink.expressad.exoplayer.b.f7291b, com.anythink.expressad.exoplayer.b.f7291b, com.anythink.expressad.exoplayer.b.f7291b, j10, j11, j12, j13, z10, z11, false, obj, abVar, z12 ? abVar.f13028d : null);
    }

    @Override // com.applovin.exoplayer2.ba
    public int c(Object obj) {
        return f15264c.equals(obj) ? 0 : -1;
    }

    public aa(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, boolean z11, boolean z12, Object obj, com.applovin.exoplayer2.ab abVar, ab.e eVar) {
        this.f15266e = j10;
        this.f = j11;
        this.f15267g = j12;
        this.f15268h = j13;
        this.f15269i = j14;
        this.f15270j = j15;
        this.f15271k = j16;
        this.f15272l = z10;
        this.f15273m = z11;
        this.f15274n = z12;
        this.o = obj;
        this.f15275p = (com.applovin.exoplayer2.ab) com.applovin.exoplayer2.l.a.b(abVar);
        this.f15276q = eVar;
    }

    @Override // com.applovin.exoplayer2.ba
    public ba.a a(int i10, ba.a aVar, boolean z10) {
        com.applovin.exoplayer2.l.a.a(i10, 0, 1);
        return aVar.a(null, z10 ? f15264c : null, 0, this.f15268h, -this.f15270j);
    }

    @Override // com.applovin.exoplayer2.ba
    public Object a(int i10) {
        com.applovin.exoplayer2.l.a.a(i10, 0, 1);
        return f15264c;
    }
}
