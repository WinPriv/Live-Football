package com.applovin.exoplayer2.g;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class g implements b {
    @Override // com.applovin.exoplayer2.g.b
    public final a a(d dVar) {
        boolean z10;
        ByteBuffer byteBuffer = (ByteBuffer) com.applovin.exoplayer2.l.a.b(dVar.f13645b);
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        com.applovin.exoplayer2.l.a.a(z10);
        if (dVar.b()) {
            return null;
        }
        return a(dVar, byteBuffer);
    }

    public abstract a a(d dVar, ByteBuffer byteBuffer);
}
