package m4;

import d6.g0;
import java.nio.ByteBuffer;
import m4.f;

/* compiled from: SilenceSkippingAudioProcessor.java */
/* loaded from: classes2.dex */
public final class z extends p {

    /* renamed from: i, reason: collision with root package name */
    public final long f32881i = 150000;

    /* renamed from: j, reason: collision with root package name */
    public final long f32882j = 20000;

    /* renamed from: k, reason: collision with root package name */
    public final short f32883k = 1024;

    /* renamed from: l, reason: collision with root package name */
    public int f32884l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f32885m;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f32886n;
    public byte[] o;

    /* renamed from: p, reason: collision with root package name */
    public int f32887p;

    /* renamed from: q, reason: collision with root package name */
    public int f32888q;

    /* renamed from: r, reason: collision with root package name */
    public int f32889r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f32890s;

    /* renamed from: t, reason: collision with root package name */
    public long f32891t;

    public z() {
        byte[] bArr = g0.f;
        this.f32886n = bArr;
        this.o = bArr;
    }

    @Override // m4.f
    public final void a(ByteBuffer byteBuffer) {
        int position;
        while (byteBuffer.hasRemaining() && !this.f32795g.hasRemaining()) {
            int i10 = this.f32887p;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int limit = byteBuffer.limit();
                        int k10 = k(byteBuffer);
                        byteBuffer.limit(k10);
                        this.f32891t += byteBuffer.remaining() / this.f32884l;
                        m(byteBuffer, this.o, this.f32889r);
                        if (k10 < limit) {
                            l(this.f32889r, this.o);
                            this.f32887p = 0;
                            byteBuffer.limit(limit);
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int limit2 = byteBuffer.limit();
                    int k11 = k(byteBuffer);
                    int position2 = k11 - byteBuffer.position();
                    byte[] bArr = this.f32886n;
                    int length = bArr.length;
                    int i11 = this.f32888q;
                    int i12 = length - i11;
                    if (k11 < limit2 && position2 < i12) {
                        l(i11, bArr);
                        this.f32888q = 0;
                        this.f32887p = 0;
                    } else {
                        int min = Math.min(position2, i12);
                        byteBuffer.limit(byteBuffer.position() + min);
                        byteBuffer.get(this.f32886n, this.f32888q, min);
                        int i13 = this.f32888q + min;
                        this.f32888q = i13;
                        byte[] bArr2 = this.f32886n;
                        if (i13 == bArr2.length) {
                            if (this.f32890s) {
                                l(this.f32889r, bArr2);
                                this.f32891t += (this.f32888q - (this.f32889r * 2)) / this.f32884l;
                            } else {
                                this.f32891t += (i13 - this.f32889r) / this.f32884l;
                            }
                            m(byteBuffer, this.f32886n, this.f32888q);
                            this.f32888q = 0;
                            this.f32887p = 2;
                        }
                        byteBuffer.limit(limit2);
                    }
                }
            } else {
                int limit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit3, byteBuffer.position() + this.f32886n.length));
                int limit4 = byteBuffer.limit();
                while (true) {
                    limit4 -= 2;
                    if (limit4 >= byteBuffer.position()) {
                        if (Math.abs((int) byteBuffer.getShort(limit4)) > this.f32883k) {
                            int i14 = this.f32884l;
                            position = ((limit4 / i14) * i14) + i14;
                            break;
                        }
                    } else {
                        position = byteBuffer.position();
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.f32887p = 1;
                } else {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    j(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.f32890s = true;
                    }
                }
                byteBuffer.limit(limit3);
            }
        }
    }

    @Override // m4.p, m4.f
    public final boolean e() {
        return this.f32885m;
    }

    @Override // m4.p
    public final f.a f(f.a aVar) throws f.b {
        if (aVar.f32736c == 2) {
            if (!this.f32885m) {
                return f.a.f32733e;
            }
            return aVar;
        }
        throw new f.b(aVar);
    }

    @Override // m4.p
    public final void g() {
        if (this.f32885m) {
            f.a aVar = this.f32791b;
            int i10 = aVar.f32737d;
            this.f32884l = i10;
            int i11 = aVar.f32734a;
            int i12 = ((int) ((this.f32881i * i11) / 1000000)) * i10;
            if (this.f32886n.length != i12) {
                this.f32886n = new byte[i12];
            }
            int i13 = ((int) ((this.f32882j * i11) / 1000000)) * i10;
            this.f32889r = i13;
            if (this.o.length != i13) {
                this.o = new byte[i13];
            }
        }
        this.f32887p = 0;
        this.f32891t = 0L;
        this.f32888q = 0;
        this.f32890s = false;
    }

    @Override // m4.p
    public final void h() {
        int i10 = this.f32888q;
        if (i10 > 0) {
            l(i10, this.f32886n);
        }
        if (!this.f32890s) {
            this.f32891t += this.f32889r / this.f32884l;
        }
    }

    @Override // m4.p
    public final void i() {
        this.f32885m = false;
        this.f32889r = 0;
        byte[] bArr = g0.f;
        this.f32886n = bArr;
        this.o = bArr;
    }

    public final int k(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > this.f32883k) {
                int i10 = this.f32884l;
                return (position / i10) * i10;
            }
        }
        return byteBuffer.limit();
    }

    public final void l(int i10, byte[] bArr) {
        j(i10).put(bArr, 0, i10).flip();
        if (i10 > 0) {
            this.f32890s = true;
        }
    }

    public final void m(ByteBuffer byteBuffer, byte[] bArr, int i10) {
        int min = Math.min(byteBuffer.remaining(), this.f32889r);
        int i11 = this.f32889r - min;
        System.arraycopy(bArr, i10 - i11, this.o, 0, i11);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.o, i11, min);
    }
}
