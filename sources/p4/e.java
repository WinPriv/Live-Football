package p4;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import k4.g0;

/* compiled from: DefaultExtractorInput.java */
/* loaded from: classes2.dex */
public final class e implements i {

    /* renamed from: b, reason: collision with root package name */
    public final c6.h f34312b;

    /* renamed from: c, reason: collision with root package name */
    public final long f34313c;

    /* renamed from: d, reason: collision with root package name */
    public long f34314d;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f34316g;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f34315e = new byte[com.anythink.expressad.exoplayer.b.aX];

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f34311a = new byte[4096];

    static {
        g0.a("goog.exo.extractor");
    }

    public e(c6.h hVar, long j10, long j11) {
        this.f34312b = hVar;
        this.f34314d = j10;
        this.f34313c = j11;
    }

    @Override // p4.i
    public final boolean a(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        int min;
        int i12 = this.f34316g;
        if (i12 == 0) {
            min = 0;
        } else {
            min = Math.min(i12, i11);
            System.arraycopy(this.f34315e, 0, bArr, i10, min);
            p(min);
        }
        int i13 = min;
        while (i13 < i11 && i13 != -1) {
            i13 = n(bArr, i10, i11, i13, z10);
        }
        if (i13 != -1) {
            this.f34314d += i13;
        }
        if (i13 == -1) {
            return false;
        }
        return true;
    }

    @Override // p4.i
    public final boolean c(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        if (!k(i11, z10)) {
            return false;
        }
        System.arraycopy(this.f34315e, this.f - i11, bArr, i10, i11);
        return true;
    }

    @Override // p4.i
    public final long d() {
        return this.f34314d + this.f;
    }

    @Override // p4.i
    public final void e(int i10) throws IOException {
        k(i10, false);
    }

    @Override // p4.i
    public final long getLength() {
        return this.f34313c;
    }

    @Override // p4.i
    public final long getPosition() {
        return this.f34314d;
    }

    @Override // p4.i
    public final void h() {
        this.f = 0;
    }

    @Override // p4.i
    public final void i(int i10) throws IOException {
        int min = Math.min(this.f34316g, i10);
        p(min);
        int i11 = min;
        while (i11 < i10 && i11 != -1) {
            i11 = n(this.f34311a, -i11, Math.min(i10, this.f34311a.length + i11), i11, false);
        }
        if (i11 != -1) {
            this.f34314d += i11;
        }
    }

    @Override // p4.i
    public final void j(byte[] bArr, int i10, int i11) throws IOException {
        c(bArr, i10, i11, false);
    }

    public final boolean k(int i10, boolean z10) throws IOException {
        l(i10);
        int i11 = this.f34316g - this.f;
        while (i11 < i10) {
            i11 = n(this.f34315e, this.f, i10, i11, z10);
            if (i11 == -1) {
                return false;
            }
            this.f34316g = this.f + i11;
        }
        this.f += i10;
        return true;
    }

    public final void l(int i10) {
        int i11 = this.f + i10;
        byte[] bArr = this.f34315e;
        if (i11 > bArr.length) {
            this.f34315e = Arrays.copyOf(this.f34315e, d6.g0.h(bArr.length * 2, com.anythink.expressad.exoplayer.b.aX + i11, i11 + 524288));
        }
    }

    public final int m(byte[] bArr, int i10, int i11) throws IOException {
        int min;
        l(i11);
        int i12 = this.f34316g;
        int i13 = this.f;
        int i14 = i12 - i13;
        if (i14 == 0) {
            min = n(this.f34315e, i13, i11, 0, true);
            if (min == -1) {
                return -1;
            }
            this.f34316g += min;
        } else {
            min = Math.min(i11, i14);
        }
        System.arraycopy(this.f34315e, this.f, bArr, i10, min);
        this.f += min;
        return min;
    }

    public final int n(byte[] bArr, int i10, int i11, int i12, boolean z10) throws IOException {
        if (!Thread.interrupted()) {
            int read = this.f34312b.read(bArr, i10 + i12, i11 - i12);
            if (read == -1) {
                if (i12 == 0 && z10) {
                    return -1;
                }
                throw new EOFException();
            }
            return i12 + read;
        }
        throw new InterruptedIOException();
    }

    public final int o(int i10) throws IOException {
        int min = Math.min(this.f34316g, i10);
        p(min);
        if (min == 0) {
            byte[] bArr = this.f34311a;
            min = n(bArr, 0, Math.min(i10, bArr.length), 0, true);
        }
        if (min != -1) {
            this.f34314d += min;
        }
        return min;
    }

    public final void p(int i10) {
        byte[] bArr;
        int i11 = this.f34316g - i10;
        this.f34316g = i11;
        this.f = 0;
        byte[] bArr2 = this.f34315e;
        if (i11 < bArr2.length - 524288) {
            bArr = new byte[com.anythink.expressad.exoplayer.b.aX + i11];
        } else {
            bArr = bArr2;
        }
        System.arraycopy(bArr2, i10, bArr, 0, i11);
        this.f34315e = bArr;
    }

    @Override // p4.i, c6.h
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f34316g;
        int i13 = 0;
        if (i12 != 0) {
            int min = Math.min(i12, i11);
            System.arraycopy(this.f34315e, 0, bArr, i10, min);
            p(min);
            i13 = min;
        }
        if (i13 == 0) {
            i13 = n(bArr, i10, i11, 0, true);
        }
        if (i13 != -1) {
            this.f34314d += i13;
        }
        return i13;
    }

    @Override // p4.i
    public final void readFully(byte[] bArr, int i10, int i11) throws IOException {
        a(bArr, i10, i11, false);
    }
}
