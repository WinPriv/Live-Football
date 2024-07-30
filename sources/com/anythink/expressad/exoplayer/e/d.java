package com.anythink.expressad.exoplayer.e;

import com.anythink.expressad.exoplayer.e.m;
import com.anythink.expressad.exoplayer.k.s;
import java.io.EOFException;

/* loaded from: classes.dex */
public final class d implements m {
    @Override // com.anythink.expressad.exoplayer.e.m
    public final void a(long j10, int i10, int i11, int i12, m.a aVar) {
    }

    @Override // com.anythink.expressad.exoplayer.e.m
    public final void a(com.anythink.expressad.exoplayer.m mVar) {
    }

    @Override // com.anythink.expressad.exoplayer.e.m
    public final int a(f fVar, int i10, boolean z10) {
        int a10 = fVar.a(i10);
        if (a10 != -1) {
            return a10;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.anythink.expressad.exoplayer.e.m
    public final void a(s sVar, int i10) {
        sVar.d(i10);
    }
}
