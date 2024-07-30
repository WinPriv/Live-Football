package com.anythink.expressad.exoplayer.g.a;

import com.anythink.expressad.exoplayer.g.e;
import com.anythink.expressad.exoplayer.k.af;
import com.anythink.expressad.exoplayer.k.s;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements com.anythink.expressad.exoplayer.g.b {
    @Override // com.anythink.expressad.exoplayer.g.b
    public final com.anythink.expressad.exoplayer.g.a a(e eVar) {
        ByteBuffer byteBuffer = eVar.f7594e;
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        s sVar = new s(array, limit);
        String p10 = sVar.p();
        String p11 = sVar.p();
        long h10 = sVar.h();
        return new com.anythink.expressad.exoplayer.g.a(new a(p10, p11, af.a(sVar.h(), 1000L, h10), sVar.h(), Arrays.copyOfRange(array, sVar.c(), limit), af.a(sVar.h(), 1000000L, h10)));
    }
}
