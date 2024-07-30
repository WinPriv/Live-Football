package com.applovin.exoplayer2.b;

import com.applovin.exoplayer2.b.f;
import com.applovin.exoplayer2.l.ai;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class u extends l {

    /* renamed from: d, reason: collision with root package name */
    private final long f13520d;

    /* renamed from: e, reason: collision with root package name */
    private final long f13521e;
    private final short f;

    /* renamed from: g, reason: collision with root package name */
    private int f13522g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f13523h;

    /* renamed from: i, reason: collision with root package name */
    private byte[] f13524i;

    /* renamed from: j, reason: collision with root package name */
    private byte[] f13525j;

    /* renamed from: k, reason: collision with root package name */
    private int f13526k;

    /* renamed from: l, reason: collision with root package name */
    private int f13527l;

    /* renamed from: m, reason: collision with root package name */
    private int f13528m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f13529n;
    private long o;

    public u() {
        this(150000L, 20000L, (short) 1024);
    }

    private void c(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int f = f(byteBuffer);
        int position = f - byteBuffer.position();
        byte[] bArr = this.f13524i;
        int length = bArr.length;
        int i10 = this.f13527l;
        int i11 = length - i10;
        if (f < limit && position < i11) {
            a(bArr, i10);
            this.f13527l = 0;
            this.f13526k = 0;
            return;
        }
        int min = Math.min(position, i11);
        byteBuffer.limit(byteBuffer.position() + min);
        byteBuffer.get(this.f13524i, this.f13527l, min);
        int i12 = this.f13527l + min;
        this.f13527l = i12;
        byte[] bArr2 = this.f13524i;
        if (i12 == bArr2.length) {
            if (this.f13529n) {
                a(bArr2, this.f13528m);
                this.o += (this.f13527l - (this.f13528m * 2)) / this.f13522g;
            } else {
                this.o += (i12 - this.f13528m) / this.f13522g;
            }
            a(byteBuffer, this.f13524i, this.f13527l);
            this.f13527l = 0;
            this.f13526k = 2;
        }
        byteBuffer.limit(limit);
    }

    private void d(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int f = f(byteBuffer);
        byteBuffer.limit(f);
        this.o += byteBuffer.remaining() / this.f13522g;
        a(byteBuffer, this.f13525j, this.f13528m);
        if (f < limit) {
            a(this.f13525j, this.f13528m);
            this.f13526k = 0;
            byteBuffer.limit(limit);
        }
    }

    private void e(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        a(remaining).put(byteBuffer).flip();
        if (remaining > 0) {
            this.f13529n = true;
        }
    }

    private int f(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > this.f) {
                int i10 = this.f13522g;
                return (position / i10) * i10;
            }
        }
        return byteBuffer.limit();
    }

    private int g(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        do {
            limit -= 2;
            if (limit < byteBuffer.position()) {
                return byteBuffer.position();
            }
        } while (Math.abs((int) byteBuffer.getShort(limit)) <= this.f);
        int i10 = this.f13522g;
        return ((limit / i10) * i10) + i10;
    }

    public void a(boolean z10) {
        this.f13523h = z10;
    }

    @Override // com.applovin.exoplayer2.b.l
    public f.a b(f.a aVar) throws f.b {
        if (aVar.f13384d == 2) {
            return this.f13523h ? aVar : f.a.f13381a;
        }
        throw new f.b(aVar);
    }

    @Override // com.applovin.exoplayer2.b.l
    public void h() {
        int i10 = this.f13527l;
        if (i10 > 0) {
            a(this.f13524i, i10);
        }
        if (!this.f13529n) {
            this.o += this.f13528m / this.f13522g;
        }
    }

    @Override // com.applovin.exoplayer2.b.l
    public void i() {
        if (this.f13523h) {
            this.f13522g = this.f13434b.f13385e;
            int a10 = a(this.f13520d) * this.f13522g;
            if (this.f13524i.length != a10) {
                this.f13524i = new byte[a10];
            }
            int a11 = a(this.f13521e) * this.f13522g;
            this.f13528m = a11;
            if (this.f13525j.length != a11) {
                this.f13525j = new byte[a11];
            }
        }
        this.f13526k = 0;
        this.o = 0L;
        this.f13527l = 0;
        this.f13529n = false;
    }

    @Override // com.applovin.exoplayer2.b.l
    public void j() {
        this.f13523h = false;
        this.f13528m = 0;
        byte[] bArr = ai.f;
        this.f13524i = bArr;
        this.f13525j = bArr;
    }

    public long k() {
        return this.o;
    }

    public u(long j10, long j11, short s10) {
        com.applovin.exoplayer2.l.a.a(j11 <= j10);
        this.f13520d = j10;
        this.f13521e = j11;
        this.f = s10;
        byte[] bArr = ai.f;
        this.f13524i = bArr;
        this.f13525j = bArr;
    }

    @Override // com.applovin.exoplayer2.b.l, com.applovin.exoplayer2.b.f
    public boolean a() {
        return this.f13523h;
    }

    @Override // com.applovin.exoplayer2.b.f
    public void a(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !g()) {
            int i10 = this.f13526k;
            if (i10 == 0) {
                b(byteBuffer);
            } else if (i10 == 1) {
                c(byteBuffer);
            } else if (i10 == 2) {
                d(byteBuffer);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    private void b(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f13524i.length));
        int g6 = g(byteBuffer);
        if (g6 == byteBuffer.position()) {
            this.f13526k = 1;
        } else {
            byteBuffer.limit(g6);
            e(byteBuffer);
        }
        byteBuffer.limit(limit);
    }

    private void a(byte[] bArr, int i10) {
        a(i10).put(bArr, 0, i10).flip();
        if (i10 > 0) {
            this.f13529n = true;
        }
    }

    private void a(ByteBuffer byteBuffer, byte[] bArr, int i10) {
        int min = Math.min(byteBuffer.remaining(), this.f13528m);
        int i11 = this.f13528m - min;
        System.arraycopy(bArr, i10 - i11, this.f13525j, 0, i11);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f13525j, i11, min);
    }

    private int a(long j10) {
        return (int) ((j10 * this.f13434b.f13382b) / 1000000);
    }
}
