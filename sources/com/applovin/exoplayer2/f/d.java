package com.applovin.exoplayer2.f;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class d extends com.applovin.exoplayer2.c.g {
    private long f;

    /* renamed from: g, reason: collision with root package name */
    private int f15013g;

    /* renamed from: h, reason: collision with root package name */
    private int f15014h;

    public d() {
        super(2);
        this.f15014h = 32;
    }

    private boolean b(com.applovin.exoplayer2.c.g gVar) {
        ByteBuffer byteBuffer;
        if (!l()) {
            return true;
        }
        if (this.f15013g >= this.f15014h || gVar.b() != b()) {
            return false;
        }
        ByteBuffer byteBuffer2 = gVar.f13645b;
        if (byteBuffer2 != null && (byteBuffer = this.f13645b) != null) {
            if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                return false;
            }
        }
        return true;
    }

    @Override // com.applovin.exoplayer2.c.g, com.applovin.exoplayer2.c.a
    public void a() {
        super.a();
        this.f15013g = 0;
    }

    public void g(int i10) {
        boolean z10;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        com.applovin.exoplayer2.l.a.a(z10);
        this.f15014h = i10;
    }

    public long i() {
        return this.f13647d;
    }

    public long j() {
        return this.f;
    }

    public int k() {
        return this.f15013g;
    }

    public boolean l() {
        if (this.f15013g > 0) {
            return true;
        }
        return false;
    }

    public boolean a(com.applovin.exoplayer2.c.g gVar) {
        com.applovin.exoplayer2.l.a.a(!gVar.g());
        com.applovin.exoplayer2.l.a.a(!gVar.e());
        com.applovin.exoplayer2.l.a.a(!gVar.c());
        if (!b(gVar)) {
            return false;
        }
        int i10 = this.f15013g;
        this.f15013g = i10 + 1;
        if (i10 == 0) {
            this.f13647d = gVar.f13647d;
            if (gVar.d()) {
                a_(1);
            }
        }
        if (gVar.b()) {
            a_(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer = gVar.f13645b;
        if (byteBuffer != null) {
            f(byteBuffer.remaining());
            this.f13645b.put(byteBuffer);
        }
        this.f = gVar.f13647d;
        return true;
    }
}
