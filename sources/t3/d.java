package t3;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* compiled from: ExceptionPassthroughInputStream.java */
/* loaded from: classes.dex */
public final class d extends InputStream {

    /* renamed from: u, reason: collision with root package name */
    public static final ArrayDeque f35411u;

    /* renamed from: s, reason: collision with root package name */
    public InputStream f35412s;

    /* renamed from: t, reason: collision with root package name */
    public IOException f35413t;

    static {
        char[] cArr = l.f35429a;
        f35411u = new ArrayDeque(0);
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        return this.f35412s.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f35412s.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i10) {
        this.f35412s.mark(i10);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f35412s.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        try {
            return this.f35412s.read();
        } catch (IOException e10) {
            this.f35413t = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() throws IOException {
        this.f35412s.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j10) throws IOException {
        try {
            return this.f35412s.skip(j10);
        } catch (IOException e10) {
            this.f35413t = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        try {
            return this.f35412s.read(bArr);
        } catch (IOException e10) {
            this.f35413t = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        try {
            return this.f35412s.read(bArr, i10, i11);
        } catch (IOException e10) {
            this.f35413t = e10;
            throw e10;
        }
    }
}
