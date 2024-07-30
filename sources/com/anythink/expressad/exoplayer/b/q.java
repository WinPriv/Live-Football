package com.anythink.expressad.exoplayer.b;

import com.anythink.expressad.exoplayer.b.f;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class q implements f {

    /* renamed from: b, reason: collision with root package name */
    private static final long f7489b = 150000;

    /* renamed from: c, reason: collision with root package name */
    private static final long f7490c = 20000;

    /* renamed from: d, reason: collision with root package name */
    private static final short f7491d = 1024;

    /* renamed from: e, reason: collision with root package name */
    private static final byte f7492e = 4;
    private static final int f = 0;

    /* renamed from: g, reason: collision with root package name */
    private static final int f7493g = 1;

    /* renamed from: h, reason: collision with root package name */
    private static final int f7494h = 2;

    /* renamed from: i, reason: collision with root package name */
    private int f7495i;

    /* renamed from: j, reason: collision with root package name */
    private int f7496j;

    /* renamed from: k, reason: collision with root package name */
    private int f7497k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f7498l;

    /* renamed from: m, reason: collision with root package name */
    private ByteBuffer f7499m;

    /* renamed from: n, reason: collision with root package name */
    private ByteBuffer f7500n;
    private boolean o;

    /* renamed from: p, reason: collision with root package name */
    private byte[] f7501p;

    /* renamed from: q, reason: collision with root package name */
    private byte[] f7502q;

    /* renamed from: r, reason: collision with root package name */
    private int f7503r;

    /* renamed from: s, reason: collision with root package name */
    private int f7504s;

    /* renamed from: t, reason: collision with root package name */
    private int f7505t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f7506u;

    /* renamed from: v, reason: collision with root package name */
    private long f7507v;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface a {
    }

    public q() {
        ByteBuffer byteBuffer = f.f7351a;
        this.f7499m = byteBuffer;
        this.f7500n = byteBuffer;
        this.f7495i = -1;
        this.f7496j = -1;
        this.f7501p = new byte[0];
        this.f7502q = new byte[0];
    }

    public final void a(boolean z10) {
        this.f7498l = z10;
        h();
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final int b() {
        return this.f7495i;
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final int c() {
        return 2;
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final int d() {
        return this.f7496j;
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final void e() {
        this.o = true;
        int i10 = this.f7504s;
        if (i10 > 0) {
            a(this.f7501p, i10);
        }
        if (this.f7506u) {
            return;
        }
        this.f7507v += this.f7505t / this.f7497k;
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final ByteBuffer f() {
        ByteBuffer byteBuffer = this.f7500n;
        this.f7500n = f.f7351a;
        return byteBuffer;
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final boolean g() {
        return this.o && this.f7500n == f.f7351a;
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final void h() {
        if (a()) {
            int a10 = a(f7489b) * this.f7497k;
            if (this.f7501p.length != a10) {
                this.f7501p = new byte[a10];
            }
            int a11 = a(f7490c) * this.f7497k;
            this.f7505t = a11;
            if (this.f7502q.length != a11) {
                this.f7502q = new byte[a11];
            }
        }
        this.f7503r = 0;
        this.f7500n = f.f7351a;
        this.o = false;
        this.f7507v = 0L;
        this.f7504s = 0;
        this.f7506u = false;
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final void i() {
        this.f7498l = false;
        h();
        this.f7499m = f.f7351a;
        this.f7495i = -1;
        this.f7496j = -1;
        this.f7505t = 0;
        this.f7501p = new byte[0];
        this.f7502q = new byte[0];
    }

    public final long j() {
        return this.f7507v;
    }

    private void b(ByteBuffer byteBuffer) {
        int position;
        int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f7501p.length));
        int limit2 = byteBuffer.limit() - 1;
        while (true) {
            if (limit2 >= byteBuffer.position()) {
                if (Math.abs((int) byteBuffer.get(limit2)) > 4) {
                    int i10 = this.f7497k;
                    position = ((limit2 / i10) * i10) + i10;
                    break;
                }
                limit2 -= 2;
            } else {
                position = byteBuffer.position();
                break;
            }
        }
        if (position == byteBuffer.position()) {
            this.f7503r = 1;
        } else {
            byteBuffer.limit(position);
            a(byteBuffer.remaining());
            this.f7499m.put(byteBuffer);
            this.f7499m.flip();
            this.f7500n = this.f7499m;
        }
        byteBuffer.limit(limit);
    }

    private void c(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int f10 = f(byteBuffer);
        int position = f10 - byteBuffer.position();
        byte[] bArr = this.f7501p;
        int length = bArr.length;
        int i10 = this.f7504s;
        int i11 = length - i10;
        if (f10 < limit && position < i11) {
            a(bArr, i10);
            this.f7504s = 0;
            this.f7503r = 0;
            return;
        }
        int min = Math.min(position, i11);
        byteBuffer.limit(byteBuffer.position() + min);
        byteBuffer.get(this.f7501p, this.f7504s, min);
        int i12 = this.f7504s + min;
        this.f7504s = i12;
        byte[] bArr2 = this.f7501p;
        if (i12 == bArr2.length) {
            if (this.f7506u) {
                a(bArr2, this.f7505t);
                this.f7507v += (this.f7504s - (this.f7505t * 2)) / this.f7497k;
            } else {
                this.f7507v += (i12 - this.f7505t) / this.f7497k;
            }
            a(byteBuffer, this.f7501p, this.f7504s);
            this.f7504s = 0;
            this.f7503r = 2;
        }
        byteBuffer.limit(limit);
    }

    private void d(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int f10 = f(byteBuffer);
        byteBuffer.limit(f10);
        this.f7507v += byteBuffer.remaining() / this.f7497k;
        a(byteBuffer, this.f7502q, this.f7505t);
        if (f10 < limit) {
            a(this.f7502q, this.f7505t);
            this.f7503r = 0;
            byteBuffer.limit(limit);
        }
    }

    private int g(ByteBuffer byteBuffer) {
        for (int limit = byteBuffer.limit() - 1; limit >= byteBuffer.position(); limit -= 2) {
            if (Math.abs((int) byteBuffer.get(limit)) > 4) {
                int i10 = this.f7497k;
                return ((limit / i10) * i10) + i10;
            }
        }
        return byteBuffer.position();
    }

    private int f(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position() + 1; position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.get(position)) > 4) {
                int i10 = this.f7497k;
                return (position / i10) * i10;
            }
        }
        return byteBuffer.limit();
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final boolean a(int i10, int i11, int i12) {
        if (i12 == 2) {
            if (this.f7496j == i10 && this.f7495i == i11) {
                return false;
            }
            this.f7496j = i10;
            this.f7495i = i11;
            this.f7497k = i11 * 2;
            return true;
        }
        throw new f.a(i10, i11, i12);
    }

    private void e(ByteBuffer byteBuffer) {
        a(byteBuffer.remaining());
        this.f7499m.put(byteBuffer);
        this.f7499m.flip();
        this.f7500n = this.f7499m;
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final boolean a() {
        return this.f7496j != -1 && this.f7498l;
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final void a(ByteBuffer byteBuffer) {
        int position;
        while (byteBuffer.hasRemaining() && !this.f7500n.hasRemaining()) {
            int i10 = this.f7503r;
            if (i10 == 0) {
                int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f7501p.length));
                int limit2 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit2 >= byteBuffer.position()) {
                        if (Math.abs((int) byteBuffer.get(limit2)) > 4) {
                            int i11 = this.f7497k;
                            position = ((limit2 / i11) * i11) + i11;
                            break;
                        }
                        limit2 -= 2;
                    } else {
                        position = byteBuffer.position();
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.f7503r = 1;
                } else {
                    byteBuffer.limit(position);
                    a(byteBuffer.remaining());
                    this.f7499m.put(byteBuffer);
                    this.f7499m.flip();
                    this.f7500n = this.f7499m;
                }
                byteBuffer.limit(limit);
            } else if (i10 == 1) {
                int limit3 = byteBuffer.limit();
                int f10 = f(byteBuffer);
                int position2 = f10 - byteBuffer.position();
                byte[] bArr = this.f7501p;
                int length = bArr.length;
                int i12 = this.f7504s;
                int i13 = length - i12;
                if (f10 < limit3 && position2 < i13) {
                    a(bArr, i12);
                    this.f7504s = 0;
                    this.f7503r = 0;
                } else {
                    int min = Math.min(position2, i13);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.f7501p, this.f7504s, min);
                    int i14 = this.f7504s + min;
                    this.f7504s = i14;
                    byte[] bArr2 = this.f7501p;
                    if (i14 == bArr2.length) {
                        if (this.f7506u) {
                            a(bArr2, this.f7505t);
                            this.f7507v += (this.f7504s - (this.f7505t * 2)) / this.f7497k;
                        } else {
                            this.f7507v += (i14 - this.f7505t) / this.f7497k;
                        }
                        a(byteBuffer, this.f7501p, this.f7504s);
                        this.f7504s = 0;
                        this.f7503r = 2;
                    }
                    byteBuffer.limit(limit3);
                }
            } else if (i10 == 2) {
                int limit4 = byteBuffer.limit();
                int f11 = f(byteBuffer);
                byteBuffer.limit(f11);
                this.f7507v += byteBuffer.remaining() / this.f7497k;
                a(byteBuffer, this.f7502q, this.f7505t);
                if (f11 < limit4) {
                    a(this.f7502q, this.f7505t);
                    this.f7503r = 0;
                    byteBuffer.limit(limit4);
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    private void a(byte[] bArr, int i10) {
        a(i10);
        this.f7499m.put(bArr, 0, i10);
        this.f7499m.flip();
        this.f7500n = this.f7499m;
    }

    private void a(int i10) {
        if (this.f7499m.capacity() < i10) {
            this.f7499m = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f7499m.clear();
        }
        if (i10 > 0) {
            this.f7506u = true;
        }
    }

    private void a(ByteBuffer byteBuffer, byte[] bArr, int i10) {
        int min = Math.min(byteBuffer.remaining(), this.f7505t);
        int i11 = this.f7505t - min;
        System.arraycopy(bArr, i10 - i11, this.f7502q, 0, i11);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f7502q, i11, min);
    }

    private int a(long j10) {
        return (int) ((j10 * this.f7496j) / 1000000);
    }
}
