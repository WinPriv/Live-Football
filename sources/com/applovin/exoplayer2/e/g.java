package com.applovin.exoplayer2.e;

import com.applovin.exoplayer2.e.x;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes.dex */
public final class g implements x {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f14324a = new byte[4096];

    @Override // com.applovin.exoplayer2.e.x
    public void a(long j10, int i10, int i11, int i12, x.a aVar) {
    }

    @Override // com.applovin.exoplayer2.e.x
    public void a(com.applovin.exoplayer2.v vVar) {
    }

    @Override // com.applovin.exoplayer2.e.x
    public int a(com.applovin.exoplayer2.k.g gVar, int i10, boolean z10, int i11) throws IOException {
        int a10 = gVar.a(this.f14324a, 0, Math.min(this.f14324a.length, i10));
        if (a10 != -1) {
            return a10;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.applovin.exoplayer2.e.x
    public void a(com.applovin.exoplayer2.l.y yVar, int i10, int i11) {
        yVar.e(i10);
    }
}
