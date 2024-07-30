package h3;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: RecyclableBufferedInputStream.java */
/* loaded from: classes.dex */
public final class u extends FilterInputStream {

    /* renamed from: s, reason: collision with root package name */
    public volatile byte[] f28742s;

    /* renamed from: t, reason: collision with root package name */
    public int f28743t;

    /* renamed from: u, reason: collision with root package name */
    public int f28744u;

    /* renamed from: v, reason: collision with root package name */
    public int f28745v;

    /* renamed from: w, reason: collision with root package name */
    public int f28746w;

    /* renamed from: x, reason: collision with root package name */
    public final b3.b f28747x;

    /* compiled from: RecyclableBufferedInputStream.java */
    /* loaded from: classes.dex */
    public static class a extends IOException {
        public a(String str) {
            super(str);
        }
    }

    public u(InputStream inputStream, b3.b bVar) {
        super(inputStream);
        this.f28745v = -1;
        this.f28747x = bVar;
        this.f28742s = (byte[]) bVar.c(byte[].class, com.anythink.expressad.exoplayer.b.aX);
    }

    public static void c() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f28742s != null && inputStream != null) {
        } else {
            c();
            throw null;
        }
        return (this.f28743t - this.f28746w) + inputStream.available();
    }

    public final int b(InputStream inputStream, byte[] bArr) throws IOException {
        int i10 = this.f28745v;
        if (i10 != -1) {
            int i11 = this.f28746w - i10;
            int i12 = this.f28744u;
            if (i11 < i12) {
                if (i10 == 0 && i12 > bArr.length && this.f28743t == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i12) {
                        i12 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f28747x.c(byte[].class, i12);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f28742s = bArr2;
                    this.f28747x.put(bArr);
                    bArr = bArr2;
                } else if (i10 > 0) {
                    System.arraycopy(bArr, i10, bArr, 0, bArr.length - i10);
                }
                int i13 = this.f28746w - this.f28745v;
                this.f28746w = i13;
                this.f28745v = 0;
                this.f28743t = 0;
                int read = inputStream.read(bArr, i13, bArr.length - i13);
                int i14 = this.f28746w;
                if (read > 0) {
                    i14 += read;
                }
                this.f28743t = i14;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.f28745v = -1;
            this.f28746w = 0;
            this.f28743t = read2;
        }
        return read2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f28742s != null) {
            this.f28747x.put(this.f28742s);
            this.f28742s = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i10) {
        this.f28744u = Math.max(this.f28744u, i10);
        this.f28745v = this.f28746w;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() throws IOException {
        byte[] bArr = this.f28742s;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr != null && inputStream != null) {
            if (this.f28746w >= this.f28743t && b(inputStream, bArr) == -1) {
                return -1;
            }
            if (bArr != this.f28742s && (bArr = this.f28742s) == null) {
                c();
                throw null;
            }
            int i10 = this.f28743t;
            int i11 = this.f28746w;
            if (i10 - i11 <= 0) {
                return -1;
            }
            this.f28746w = i11 + 1;
            return bArr[i11] & DefaultClassResolver.NAME;
        }
        c();
        throw null;
    }

    public final synchronized void release() {
        if (this.f28742s != null) {
            this.f28747x.put(this.f28742s);
            this.f28742s = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
        if (this.f28742s != null) {
            int i10 = this.f28745v;
            if (-1 != i10) {
                this.f28746w = i10;
            } else {
                throw new a("Mark has been invalidated, pos: " + this.f28746w + " markLimit: " + this.f28744u);
            }
        } else {
            throw new IOException("Stream is closed");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j10) throws IOException {
        if (j10 < 1) {
            return 0L;
        }
        byte[] bArr = this.f28742s;
        if (bArr != null) {
            InputStream inputStream = ((FilterInputStream) this).in;
            if (inputStream != null) {
                int i10 = this.f28743t;
                int i11 = this.f28746w;
                if (i10 - i11 >= j10) {
                    this.f28746w = (int) (i11 + j10);
                    return j10;
                }
                long j11 = i10 - i11;
                this.f28746w = i10;
                if (this.f28745v != -1 && j10 <= this.f28744u) {
                    if (b(inputStream, bArr) == -1) {
                        return j11;
                    }
                    int i12 = this.f28743t;
                    int i13 = this.f28746w;
                    if (i12 - i13 >= j10 - j11) {
                        this.f28746w = (int) ((i13 + j10) - j11);
                        return j10;
                    }
                    long j12 = (j11 + i12) - i13;
                    this.f28746w = i12;
                    return j12;
                }
                long skip = inputStream.skip(j10 - j11);
                if (skip > 0) {
                    this.f28745v = -1;
                }
                return j11 + skip;
            }
            c();
            throw null;
        }
        c();
        throw null;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        int i13;
        byte[] bArr2 = this.f28742s;
        if (bArr2 == null) {
            c();
            throw null;
        }
        if (i11 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i14 = this.f28746w;
            int i15 = this.f28743t;
            if (i14 < i15) {
                int i16 = i15 - i14;
                if (i16 >= i11) {
                    i16 = i11;
                }
                System.arraycopy(bArr2, i14, bArr, i10, i16);
                this.f28746w += i16;
                if (i16 == i11 || inputStream.available() == 0) {
                    return i16;
                }
                i10 += i16;
                i12 = i11 - i16;
            } else {
                i12 = i11;
            }
            while (true) {
                if (this.f28745v == -1 && i12 >= bArr2.length) {
                    i13 = inputStream.read(bArr, i10, i12);
                    if (i13 == -1) {
                        return i12 != i11 ? i11 - i12 : -1;
                    }
                } else {
                    if (b(inputStream, bArr2) == -1) {
                        return i12 != i11 ? i11 - i12 : -1;
                    }
                    if (bArr2 != this.f28742s && (bArr2 = this.f28742s) == null) {
                        c();
                        throw null;
                    }
                    int i17 = this.f28743t;
                    int i18 = this.f28746w;
                    i13 = i17 - i18;
                    if (i13 >= i12) {
                        i13 = i12;
                    }
                    System.arraycopy(bArr2, i18, bArr, i10, i13);
                    this.f28746w += i13;
                }
                i12 -= i13;
                if (i12 == 0) {
                    return i11;
                }
                if (inputStream.available() == 0) {
                    return i11 - i12;
                }
                i10 += i13;
            }
        } else {
            c();
            throw null;
        }
    }
}
