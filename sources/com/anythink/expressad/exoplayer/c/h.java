package com.anythink.expressad.exoplayer.c;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class h extends f {

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer f7611c;

    /* renamed from: d, reason: collision with root package name */
    private final g<?, h, ?> f7612d;

    private h(g<?, h, ?> gVar) {
        this.f7612d = gVar;
    }

    private ByteBuffer a(long j10, int i10) {
        ((f) this).f7596a = j10;
        ByteBuffer byteBuffer = this.f7611c;
        if (byteBuffer == null || byteBuffer.capacity() < i10) {
            this.f7611c = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        }
        this.f7611c.position(0);
        this.f7611c.limit(i10);
        return this.f7611c;
    }

    @Override // com.anythink.expressad.exoplayer.c.f
    public final void e() {
        this.f7612d.a((g<?, h, ?>) this);
    }

    @Override // com.anythink.expressad.exoplayer.c.a
    public final void a() {
        super.a();
        ByteBuffer byteBuffer = this.f7611c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }
}
