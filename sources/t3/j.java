package t3;

import java.io.FilterInputStream;
import java.io.IOException;

/* compiled from: MarkEnforcingInputStream.java */
/* loaded from: classes.dex */
public final class j extends FilterInputStream {

    /* renamed from: s, reason: collision with root package name */
    public int f35425s;

    public j(d dVar) {
        super(dVar);
        this.f35425s = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        int i10 = this.f35425s;
        if (i10 == Integer.MIN_VALUE) {
            return super.available();
        }
        return Math.min(i10, super.available());
    }

    public final long b(long j10) {
        int i10 = this.f35425s;
        if (i10 == 0) {
            return -1L;
        }
        if (i10 != Integer.MIN_VALUE && j10 > i10) {
            return i10;
        }
        return j10;
    }

    public final void c(long j10) {
        int i10 = this.f35425s;
        if (i10 != Integer.MIN_VALUE && j10 != -1) {
            this.f35425s = (int) (i10 - j10);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i10) {
        super.mark(i10);
        this.f35425s = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (b(1L) == -1) {
            return -1;
        }
        int read = super.read();
        c(1L);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
        super.reset();
        this.f35425s = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) throws IOException {
        long b10 = b(j10);
        if (b10 == -1) {
            return 0L;
        }
        long skip = super.skip(b10);
        c(skip);
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int b10 = (int) b(i11);
        if (b10 == -1) {
            return -1;
        }
        int read = super.read(bArr, i10, b10);
        c(read);
        return read;
    }
}
