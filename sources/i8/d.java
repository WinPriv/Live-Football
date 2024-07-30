package i8;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: ByteStreams.java */
/* loaded from: classes2.dex */
public final class d {
    public static byte[] a(ArrayDeque arrayDeque, int i10) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i10) {
            return bArr;
        }
        int length = i10 - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i10);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i10 - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static byte[] b(a aVar) throws IOException {
        int i10;
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i11 = 0;
        while (i11 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i11);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i12 = 0;
            while (i12 < min2) {
                int read = aVar.read(bArr, i12, min2 - i12);
                if (read == -1) {
                    return a(arrayDeque, i11);
                }
                i12 += read;
                i11 += read;
            }
            long j10 = min;
            if (min < 4096) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            long j11 = j10 * i10;
            if (j11 > 2147483647L) {
                min = Integer.MAX_VALUE;
            } else if (j11 < -2147483648L) {
                min = Integer.MIN_VALUE;
            } else {
                min = (int) j11;
            }
        }
        if (aVar.read() == -1) {
            return a(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    /* compiled from: ByteStreams.java */
    /* loaded from: classes2.dex */
    public static final class a extends FilterInputStream {

        /* renamed from: s, reason: collision with root package name */
        public long f29246s;

        /* renamed from: t, reason: collision with root package name */
        public long f29247t;

        public a(InputStream inputStream) {
            super(inputStream);
            this.f29247t = -1L;
            this.f29246s = 1048577L;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int available() throws IOException {
            return (int) Math.min(((FilterInputStream) this).in.available(), this.f29246s);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final synchronized void mark(int i10) {
            ((FilterInputStream) this).in.mark(i10);
            this.f29247t = this.f29246s;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read() throws IOException {
            if (this.f29246s == 0) {
                return -1;
            }
            int read = ((FilterInputStream) this).in.read();
            if (read != -1) {
                this.f29246s--;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final synchronized void reset() throws IOException {
            if (((FilterInputStream) this).in.markSupported()) {
                if (this.f29247t != -1) {
                    ((FilterInputStream) this).in.reset();
                    this.f29246s = this.f29247t;
                } else {
                    throw new IOException("Mark not set");
                }
            } else {
                throw new IOException("Mark not supported");
            }
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final long skip(long j10) throws IOException {
            long skip = ((FilterInputStream) this).in.skip(Math.min(j10, this.f29246s));
            this.f29246s -= skip;
            return skip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read(byte[] bArr, int i10, int i11) throws IOException {
            long j10 = this.f29246s;
            if (j10 == 0) {
                return -1;
            }
            int read = ((FilterInputStream) this).in.read(bArr, i10, (int) Math.min(i11, j10));
            if (read != -1) {
                this.f29246s -= read;
            }
            return read;
        }
    }
}
