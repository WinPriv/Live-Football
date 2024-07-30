package org.jsoup.internal;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import org.jsoup.helper.Validate;

/* loaded from: classes2.dex */
public final class ConstrainableInputStream extends BufferedInputStream {

    /* renamed from: s, reason: collision with root package name */
    public final boolean f33941s;

    /* renamed from: t, reason: collision with root package name */
    public final int f33942t;

    /* renamed from: u, reason: collision with root package name */
    public long f33943u;

    /* renamed from: v, reason: collision with root package name */
    public long f33944v;

    /* renamed from: w, reason: collision with root package name */
    public int f33945w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f33946x;

    public ConstrainableInputStream(InputStream inputStream, int i10, int i11) {
        super(inputStream, i10);
        boolean z10;
        this.f33944v = 0L;
        if (i11 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Validate.isTrue(z10);
        this.f33942t = i11;
        this.f33945w = i11;
        this.f33941s = i11 != 0;
        this.f33943u = System.nanoTime();
    }

    public static ConstrainableInputStream wrap(InputStream inputStream, int i10, int i11) {
        if (inputStream instanceof ConstrainableInputStream) {
            return (ConstrainableInputStream) inputStream;
        }
        return new ConstrainableInputStream(inputStream, i10, i11);
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        boolean z10;
        int i12;
        if (this.f33946x || ((z10 = this.f33941s) && this.f33945w <= 0)) {
            return -1;
        }
        boolean z11 = true;
        if (Thread.interrupted()) {
            this.f33946x = true;
            return -1;
        }
        if (this.f33944v == 0 || System.nanoTime() - this.f33943u <= this.f33944v) {
            z11 = false;
        }
        if (!z11) {
            if (z10 && i11 > (i12 = this.f33945w)) {
                i11 = i12;
            }
            try {
                int read = super.read(bArr, i10, i11);
                this.f33945w -= read;
                return read;
            } catch (SocketTimeoutException unused) {
                return 0;
            }
        }
        throw new SocketTimeoutException("Read timeout");
    }

    public ByteBuffer readToByteBuffer(int i10) throws IOException {
        boolean z10;
        int i11;
        boolean z11 = true;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Validate.isTrue(z10, "maxSize must be 0 (unlimited) or larger");
        if (i10 <= 0) {
            z11 = false;
        }
        int i12 = 32768;
        if (z11 && i10 < 32768) {
            i12 = i10;
        }
        byte[] bArr = new byte[i12];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i12);
        while (true) {
            if (z11) {
                i11 = Math.min(i10, i12);
            } else {
                i11 = i12;
            }
            int read = read(bArr, 0, i11);
            if (read == -1) {
                break;
            }
            if (z11) {
                if (read >= i10) {
                    byteArrayOutputStream.write(bArr, 0, i10);
                    break;
                }
                i10 -= read;
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
        return ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        super.reset();
        this.f33945w = this.f33942t - ((BufferedInputStream) this).markpos;
    }

    public ConstrainableInputStream timeout(long j10, long j11) {
        this.f33943u = j10;
        this.f33944v = j11 * 1000000;
        return this;
    }
}
