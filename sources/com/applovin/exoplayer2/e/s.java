package com.applovin.exoplayer2.e;

import com.applovin.exoplayer2.g.e.g;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.y f14932a = new com.applovin.exoplayer2.l.y(10);

    public com.applovin.exoplayer2.g.a a(i iVar, g.a aVar) throws IOException {
        com.applovin.exoplayer2.g.a aVar2 = null;
        int i10 = 0;
        while (true) {
            try {
                iVar.d(this.f14932a.d(), 0, 10);
                this.f14932a.d(0);
                if (this.f14932a.m() != 4801587) {
                    break;
                }
                this.f14932a.e(3);
                int v3 = this.f14932a.v();
                int i11 = v3 + 10;
                if (aVar2 == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(this.f14932a.d(), 0, bArr, 0, 10);
                    iVar.d(bArr, 10, v3);
                    aVar2 = new com.applovin.exoplayer2.g.e.g(aVar).a(bArr, i11);
                } else {
                    iVar.c(v3);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        iVar.a();
        iVar.c(i10);
        return aVar2;
    }
}
