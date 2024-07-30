package t3;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: ContentLengthInputStream.java */
/* loaded from: classes.dex */
public final class c extends FilterInputStream {

    /* renamed from: s, reason: collision with root package name */
    public final long f35409s;

    /* renamed from: t, reason: collision with root package name */
    public int f35410t;

    public c(InputStream inputStream, long j10) {
        super(inputStream);
        this.f35409s = j10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() throws IOException {
        return (int) Math.max(this.f35409s - this.f35410t, ((FilterInputStream) this).in.available());
    }

    public final void b(int i10) throws IOException {
        if (i10 >= 0) {
            this.f35410t += i10;
            return;
        }
        long j10 = this.f35410t;
        long j11 = this.f35409s;
        if (j11 - j10 <= 0) {
            return;
        }
        StringBuilder k10 = com.ironsource.adapters.facebook.a.k("Failed to read all expected data, expected: ", j11, ", but read: ");
        k10.append(this.f35410t);
        throw new IOException(k10.toString());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() throws IOException {
        int read;
        read = super.read();
        b(read >= 0 ? 1 : -1);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i10, int i11) throws IOException {
        int read;
        read = super.read(bArr, i10, i11);
        b(read);
        return read;
    }
}
