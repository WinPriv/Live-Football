package com.applovin.exoplayer2.i;

import com.applovin.exoplayer2.a.x;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class d extends com.applovin.exoplayer2.c.j<j, k, h> implements g {

    /* renamed from: a, reason: collision with root package name */
    private final String f15692a;

    public d(String str) {
        super(new j[2], new k[2]);
        this.f15692a = str;
        a(1024);
    }

    public abstract f a(byte[] bArr, int i10, boolean z10) throws h;

    @Override // com.applovin.exoplayer2.i.g
    public void a(long j10) {
    }

    @Override // com.applovin.exoplayer2.c.j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final h a(Throwable th) {
        return new h("Unexpected decode error", th);
    }

    @Override // com.applovin.exoplayer2.c.j
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final j g() {
        return new j();
    }

    @Override // com.applovin.exoplayer2.c.j
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final k h() {
        return new e(new x(this, 2));
    }

    @Override // com.applovin.exoplayer2.c.j
    public final h a(j jVar, k kVar, boolean z10) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) com.applovin.exoplayer2.l.a.b(jVar.f13645b);
            kVar.a(jVar.f13647d, a(byteBuffer.array(), byteBuffer.limit(), z10), jVar.f);
            kVar.c(Integer.MIN_VALUE);
            return null;
        } catch (h e10) {
            return e10;
        }
    }
}
