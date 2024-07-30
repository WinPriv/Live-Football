package com.applovin.exoplayer2.k;

import java.io.IOException;

/* loaded from: classes.dex */
public class j extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final int f16089a;

    public j(int i10) {
        this.f16089a = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
    
        r2 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(java.io.IOException r2) {
        /*
        L0:
            if (r2 == 0) goto L16
            boolean r0 = r2 instanceof com.applovin.exoplayer2.k.j
            if (r0 == 0) goto L11
            r0 = r2
            com.applovin.exoplayer2.k.j r0 = (com.applovin.exoplayer2.k.j) r0
            int r0 = r0.f16089a
            r1 = 2008(0x7d8, float:2.814E-42)
            if (r0 != r1) goto L11
            r2 = 1
            return r2
        L11:
            java.lang.Throwable r2 = r2.getCause()
            goto L0
        L16:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.k.j.a(java.io.IOException):boolean");
    }

    public j(Throwable th, int i10) {
        super(th);
        this.f16089a = i10;
    }

    public j(String str, int i10) {
        super(str);
        this.f16089a = i10;
    }

    public j(String str, Throwable th, int i10) {
        super(str, th);
        this.f16089a = i10;
    }
}
