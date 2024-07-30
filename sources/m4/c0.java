package m4;

import d6.g0;
import java.nio.ByteBuffer;
import m4.f;

/* compiled from: TrimmingAudioProcessor.java */
/* loaded from: classes2.dex */
public final class c0 extends p {

    /* renamed from: i, reason: collision with root package name */
    public int f32713i;

    /* renamed from: j, reason: collision with root package name */
    public int f32714j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f32715k;

    /* renamed from: l, reason: collision with root package name */
    public int f32716l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f32717m = g0.f;

    /* renamed from: n, reason: collision with root package name */
    public int f32718n;
    public long o;

    @Override // m4.f
    public final void a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        if (i10 == 0) {
            return;
        }
        int min = Math.min(i10, this.f32716l);
        this.o += min / this.f32791b.f32737d;
        this.f32716l -= min;
        byteBuffer.position(position + min);
        if (this.f32716l > 0) {
            return;
        }
        int i11 = i10 - min;
        int length = (this.f32718n + i11) - this.f32717m.length;
        ByteBuffer j10 = j(length);
        int h10 = g0.h(length, 0, this.f32718n);
        j10.put(this.f32717m, 0, h10);
        int h11 = g0.h(length - h10, 0, i11);
        byteBuffer.limit(byteBuffer.position() + h11);
        j10.put(byteBuffer);
        byteBuffer.limit(limit);
        int i12 = i11 - h11;
        int i13 = this.f32718n - h10;
        this.f32718n = i13;
        byte[] bArr = this.f32717m;
        System.arraycopy(bArr, h10, bArr, 0, i13);
        byteBuffer.get(this.f32717m, this.f32718n, i12);
        this.f32718n += i12;
        j10.flip();
    }

    @Override // m4.p, m4.f
    public final boolean b() {
        if (super.b() && this.f32718n == 0) {
            return true;
        }
        return false;
    }

    @Override // m4.p
    public final f.a f(f.a aVar) throws f.b {
        if (aVar.f32736c == 2) {
            this.f32715k = true;
            if (this.f32713i == 0 && this.f32714j == 0) {
                return f.a.f32733e;
            }
            return aVar;
        }
        throw new f.b(aVar);
    }

    @Override // m4.p
    public final void g() {
        if (this.f32715k) {
            this.f32715k = false;
            int i10 = this.f32714j;
            int i11 = this.f32791b.f32737d;
            this.f32717m = new byte[i10 * i11];
            this.f32716l = this.f32713i * i11;
        }
        this.f32718n = 0;
    }

    @Override // m4.p, m4.f
    public final ByteBuffer getOutput() {
        int i10;
        if (super.b() && (i10 = this.f32718n) > 0) {
            j(i10).put(this.f32717m, 0, this.f32718n).flip();
            this.f32718n = 0;
        }
        return super.getOutput();
    }

    @Override // m4.p
    public final void h() {
        if (this.f32715k) {
            if (this.f32718n > 0) {
                this.o += r0 / this.f32791b.f32737d;
            }
            this.f32718n = 0;
        }
    }

    @Override // m4.p
    public final void i() {
        this.f32717m = g0.f;
    }
}
