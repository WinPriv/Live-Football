package com.applovin.exoplayer2.h;

import java.io.IOException;

/* loaded from: classes.dex */
public final class c implements s {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.exoplayer2.e.l f15292a;

    /* renamed from: b, reason: collision with root package name */
    private com.applovin.exoplayer2.e.h f15293b;

    /* renamed from: c, reason: collision with root package name */
    private com.applovin.exoplayer2.e.i f15294c;

    public c(com.applovin.exoplayer2.e.l lVar) {
        this.f15292a = lVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x003f, code lost:
    
        if (r6.c() != r11) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0061, code lost:
    
        if (r6.c() != r11) goto L33;
     */
    @Override // com.applovin.exoplayer2.h.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.applovin.exoplayer2.k.g r8, android.net.Uri r9, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10, long r11, long r13, com.applovin.exoplayer2.e.j r15) throws java.io.IOException {
        /*
            r7 = this;
            com.applovin.exoplayer2.e.e r6 = new com.applovin.exoplayer2.e.e
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.f15294c = r6
            com.applovin.exoplayer2.e.h r8 = r7.f15293b
            if (r8 == 0) goto L10
            return
        L10:
            com.applovin.exoplayer2.e.l r8 = r7.f15292a
            com.applovin.exoplayer2.e.h[] r8 = r8.a(r9, r10)
            int r10 = r8.length
            r13 = 0
            r14 = 1
            if (r10 != r14) goto L20
            r8 = r8[r13]
            r7.f15293b = r8
            goto L74
        L20:
            int r10 = r8.length
            r0 = r13
        L22:
            if (r0 >= r10) goto L70
            r1 = r8[r0]
            boolean r2 = r1.a(r6)     // Catch: java.lang.Throwable -> L42 java.io.EOFException -> L57
            if (r2 == 0) goto L35
            r7.f15293b = r1     // Catch: java.lang.Throwable -> L42 java.io.EOFException -> L57
            com.applovin.exoplayer2.l.a.b(r14)
            r6.a()
            goto L70
        L35:
            com.applovin.exoplayer2.e.h r1 = r7.f15293b
            if (r1 != 0) goto L66
            long r1 = r6.c()
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L64
            goto L66
        L42:
            r8 = move-exception
            com.applovin.exoplayer2.e.h r9 = r7.f15293b
            if (r9 != 0) goto L4f
            long r9 = r6.c()
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L50
        L4f:
            r13 = r14
        L50:
            com.applovin.exoplayer2.l.a.b(r13)
            r6.a()
            throw r8
        L57:
            com.applovin.exoplayer2.e.h r1 = r7.f15293b
            if (r1 != 0) goto L66
            long r1 = r6.c()
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L64
            goto L66
        L64:
            r1 = r13
            goto L67
        L66:
            r1 = r14
        L67:
            com.applovin.exoplayer2.l.a.b(r1)
            r6.a()
            int r0 = r0 + 1
            goto L22
        L70:
            com.applovin.exoplayer2.e.h r10 = r7.f15293b
            if (r10 == 0) goto L7a
        L74:
            com.applovin.exoplayer2.e.h r8 = r7.f15293b
            r8.a(r15)
            return
        L7a:
            com.applovin.exoplayer2.h.ae r10 = new com.applovin.exoplayer2.h.ae
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "None of the available extractors ("
            r11.<init>(r12)
            java.lang.String r8 = com.applovin.exoplayer2.l.ai.b(r8)
            java.lang.String r12 = ") could read the stream."
            java.lang.String r8 = a3.l.p(r11, r8, r12)
            java.lang.Object r9 = com.applovin.exoplayer2.l.a.b(r9)
            android.net.Uri r9 = (android.net.Uri) r9
            r10.<init>(r8, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.h.c.a(com.applovin.exoplayer2.k.g, android.net.Uri, java.util.Map, long, long, com.applovin.exoplayer2.e.j):void");
    }

    @Override // com.applovin.exoplayer2.h.s
    public void b() {
        com.applovin.exoplayer2.e.h hVar = this.f15293b;
        if (hVar instanceof com.applovin.exoplayer2.e.f.d) {
            ((com.applovin.exoplayer2.e.f.d) hVar).a();
        }
    }

    @Override // com.applovin.exoplayer2.h.s
    public long c() {
        com.applovin.exoplayer2.e.i iVar = this.f15294c;
        if (iVar != null) {
            return iVar.c();
        }
        return -1L;
    }

    @Override // com.applovin.exoplayer2.h.s
    public void a() {
        com.applovin.exoplayer2.e.h hVar = this.f15293b;
        if (hVar != null) {
            hVar.c();
            this.f15293b = null;
        }
        this.f15294c = null;
    }

    @Override // com.applovin.exoplayer2.h.s
    public void a(long j10, long j11) {
        ((com.applovin.exoplayer2.e.h) com.applovin.exoplayer2.l.a.b(this.f15293b)).a(j10, j11);
    }

    @Override // com.applovin.exoplayer2.h.s
    public int a(com.applovin.exoplayer2.e.u uVar) throws IOException {
        return ((com.applovin.exoplayer2.e.h) com.applovin.exoplayer2.l.a.b(this.f15293b)).a((com.applovin.exoplayer2.e.i) com.applovin.exoplayer2.l.a.b(this.f15294c), uVar);
    }
}
