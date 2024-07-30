package y7;

import java.io.OutputStream;

/* compiled from: LengthCountingOutputStream.java */
/* loaded from: classes2.dex */
public final class b extends OutputStream {

    /* renamed from: s, reason: collision with root package name */
    public long f36833s = 0;

    @Override // java.io.OutputStream
    public final void write(int i10) {
        this.f36833s++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f36833s += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        int i12;
        if (i10 >= 0 && i10 <= bArr.length && i11 >= 0 && (i12 = i10 + i11) <= bArr.length && i12 >= 0) {
            this.f36833s += i11;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
