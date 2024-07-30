package com.applovin.exoplayer2.b;

import com.applovin.exoplayer2.b.f;
import com.applovin.exoplayer2.l.ai;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class x extends l {

    /* renamed from: d, reason: collision with root package name */
    private int f13563d;

    /* renamed from: e, reason: collision with root package name */
    private int f13564e;
    private boolean f;

    /* renamed from: g, reason: collision with root package name */
    private int f13565g;

    /* renamed from: h, reason: collision with root package name */
    private byte[] f13566h = ai.f;

    /* renamed from: i, reason: collision with root package name */
    private int f13567i;

    /* renamed from: j, reason: collision with root package name */
    private long f13568j;

    public void a(int i10, int i11) {
        this.f13563d = i10;
        this.f13564e = i11;
    }

    @Override // com.applovin.exoplayer2.b.l
    public f.a b(f.a aVar) throws f.b {
        if (aVar.f13384d == 2) {
            this.f = true;
            if (this.f13563d == 0 && this.f13564e == 0) {
                return f.a.f13381a;
            }
            return aVar;
        }
        throw new f.b(aVar);
    }

    @Override // com.applovin.exoplayer2.b.l, com.applovin.exoplayer2.b.f
    public ByteBuffer c() {
        int i10;
        if (super.d() && (i10 = this.f13567i) > 0) {
            a(i10).put(this.f13566h, 0, this.f13567i).flip();
            this.f13567i = 0;
        }
        return super.c();
    }

    @Override // com.applovin.exoplayer2.b.l, com.applovin.exoplayer2.b.f
    public boolean d() {
        if (super.d() && this.f13567i == 0) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.exoplayer2.b.l
    public void h() {
        if (this.f) {
            if (this.f13567i > 0) {
                this.f13568j += r0 / this.f13434b.f13385e;
            }
            this.f13567i = 0;
        }
    }

    @Override // com.applovin.exoplayer2.b.l
    public void i() {
        if (this.f) {
            this.f = false;
            int i10 = this.f13564e;
            int i11 = this.f13434b.f13385e;
            this.f13566h = new byte[i10 * i11];
            this.f13565g = this.f13563d * i11;
        }
        this.f13567i = 0;
    }

    @Override // com.applovin.exoplayer2.b.l
    public void j() {
        this.f13566h = ai.f;
    }

    public void k() {
        this.f13568j = 0L;
    }

    public long l() {
        return this.f13568j;
    }

    @Override // com.applovin.exoplayer2.b.f
    public void a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        if (i10 == 0) {
            return;
        }
        int min = Math.min(i10, this.f13565g);
        this.f13568j += min / this.f13434b.f13385e;
        this.f13565g -= min;
        byteBuffer.position(position + min);
        if (this.f13565g > 0) {
            return;
        }
        int i11 = i10 - min;
        int length = (this.f13567i + i11) - this.f13566h.length;
        ByteBuffer a10 = a(length);
        int a11 = ai.a(length, 0, this.f13567i);
        a10.put(this.f13566h, 0, a11);
        int a12 = ai.a(length - a11, 0, i11);
        byteBuffer.limit(byteBuffer.position() + a12);
        a10.put(byteBuffer);
        byteBuffer.limit(limit);
        int i12 = i11 - a12;
        int i13 = this.f13567i - a11;
        this.f13567i = i13;
        byte[] bArr = this.f13566h;
        System.arraycopy(bArr, a11, bArr, 0, i13);
        byteBuffer.get(this.f13566h, this.f13567i, i12);
        this.f13567i += i12;
        a10.flip();
    }
}
