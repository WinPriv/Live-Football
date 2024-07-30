package com.anythink.expressad.exoplayer.h;

import com.anythink.expressad.exoplayer.ae;

/* loaded from: classes.dex */
public final class ab extends com.anythink.expressad.exoplayer.ae {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f8205b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final long f8206c;

    /* renamed from: d, reason: collision with root package name */
    private final long f8207d;

    /* renamed from: e, reason: collision with root package name */
    private final long f8208e;
    private final long f;

    /* renamed from: g, reason: collision with root package name */
    private final long f8209g;

    /* renamed from: h, reason: collision with root package name */
    private final long f8210h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f8211i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f8212j;

    /* renamed from: k, reason: collision with root package name */
    private final Object f8213k;

    private ab(long j10, boolean z10, boolean z11) {
        this(j10, z10, z11, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        if (r1 > r4) goto L12;
     */
    @Override // com.anythink.expressad.exoplayer.ae
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.anythink.expressad.exoplayer.ae.b a(int r17, com.anythink.expressad.exoplayer.ae.b r18, boolean r19, long r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = 1
            r2 = r17
            com.anythink.expressad.exoplayer.k.a.a(r2, r1)
            if (r19 == 0) goto Ld
            java.lang.Object r1 = r0.f8213k
            goto Le
        Ld:
            r1 = 0
        Le:
            r3 = r1
            long r1 = r0.f8210h
            boolean r9 = r0.f8212j
            if (r9 == 0) goto L2f
            r4 = 0
            int r4 = (r20 > r4 ? 1 : (r20 == r4 ? 0 : -1))
            if (r4 == 0) goto L2f
            long r4 = r0.f
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L28
        L26:
            r10 = r6
            goto L30
        L28:
            long r1 = r1 + r20
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 <= 0) goto L2f
            goto L26
        L2f:
            r10 = r1
        L30:
            long r4 = r0.f8206c
            long r6 = r0.f8207d
            boolean r8 = r0.f8211i
            long r12 = r0.f
            long r14 = r0.f8209g
            r2 = r18
            com.anythink.expressad.exoplayer.ae$b r1 = r2.a(r3, r4, r6, r8, r9, r10, r12, r14)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.h.ab.a(int, com.anythink.expressad.exoplayer.ae$b, boolean, long):com.anythink.expressad.exoplayer.ae$b");
    }

    @Override // com.anythink.expressad.exoplayer.ae
    public final int b() {
        return 1;
    }

    @Override // com.anythink.expressad.exoplayer.ae
    public final int c() {
        return 1;
    }

    public ab(long j10, boolean z10, boolean z11, Object obj) {
        this(j10, j10, z10, z11, obj, (byte) 0);
    }

    private ab(long j10, long j11, boolean z10, boolean z11, Object obj, byte b10) {
        this(j10, j11, z10, z11, obj);
    }

    private ab(long j10, long j11, boolean z10, boolean z11, Object obj) {
        this.f8206c = com.anythink.expressad.exoplayer.b.f7291b;
        this.f8207d = com.anythink.expressad.exoplayer.b.f7291b;
        this.f8208e = j10;
        this.f = j11;
        this.f8209g = 0L;
        this.f8210h = 0L;
        this.f8211i = z10;
        this.f8212j = z11;
        this.f8213k = obj;
    }

    @Override // com.anythink.expressad.exoplayer.ae
    public final ae.a a(int i10, ae.a aVar, boolean z10) {
        com.anythink.expressad.exoplayer.k.a.a(i10, 1);
        return aVar.a(null, z10 ? f8205b : null, this.f8208e, -this.f8209g);
    }

    @Override // com.anythink.expressad.exoplayer.ae
    public final int a(Object obj) {
        return f8205b.equals(obj) ? 0 : -1;
    }
}
