package w2;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* compiled from: StrictLineReader.java */
/* loaded from: classes.dex */
public final class b implements Closeable {

    /* renamed from: s, reason: collision with root package name */
    public final InputStream f36061s;

    /* renamed from: t, reason: collision with root package name */
    public final Charset f36062t;

    /* renamed from: u, reason: collision with root package name */
    public byte[] f36063u;

    /* renamed from: v, reason: collision with root package name */
    public int f36064v;

    /* renamed from: w, reason: collision with root package name */
    public int f36065w;

    /* compiled from: StrictLineReader.java */
    /* loaded from: classes.dex */
    public class a extends ByteArrayOutputStream {
        public a(int i10) {
            super(i10);
        }

        @Override // java.io.ByteArrayOutputStream
        public final String toString() {
            int i10 = ((ByteArrayOutputStream) this).count;
            if (i10 > 0 && ((ByteArrayOutputStream) this).buf[i10 - 1] == 13) {
                i10--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i10, b.this.f36062t.name());
            } catch (UnsupportedEncodingException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public b(FileInputStream fileInputStream, Charset charset) {
        if (charset != null) {
            if (charset.equals(c.f36067a)) {
                this.f36061s = fileInputStream;
                this.f36062t = charset;
                this.f36063u = new byte[8192];
                return;
            }
            throw new IllegalArgumentException("Unsupported encoding");
        }
        throw null;
    }

    public final String b() throws IOException {
        int i10;
        synchronized (this.f36061s) {
            byte[] bArr = this.f36063u;
            if (bArr != null) {
                if (this.f36064v >= this.f36065w) {
                    int read = this.f36061s.read(bArr, 0, bArr.length);
                    if (read != -1) {
                        this.f36064v = 0;
                        this.f36065w = read;
                    } else {
                        throw new EOFException();
                    }
                }
                for (int i11 = this.f36064v; i11 != this.f36065w; i11++) {
                    byte[] bArr2 = this.f36063u;
                    if (bArr2[i11] == 10) {
                        int i12 = this.f36064v;
                        if (i11 != i12) {
                            i10 = i11 - 1;
                            if (bArr2[i10] == 13) {
                                String str = new String(bArr2, i12, i10 - i12, this.f36062t.name());
                                this.f36064v = i11 + 1;
                                return str;
                            }
                        }
                        i10 = i11;
                        String str2 = new String(bArr2, i12, i10 - i12, this.f36062t.name());
                        this.f36064v = i11 + 1;
                        return str2;
                    }
                }
                a aVar = new a((this.f36065w - this.f36064v) + 80);
                while (true) {
                    byte[] bArr3 = this.f36063u;
                    int i13 = this.f36064v;
                    aVar.write(bArr3, i13, this.f36065w - i13);
                    this.f36065w = -1;
                    byte[] bArr4 = this.f36063u;
                    int read2 = this.f36061s.read(bArr4, 0, bArr4.length);
                    if (read2 != -1) {
                        this.f36064v = 0;
                        this.f36065w = read2;
                        for (int i14 = 0; i14 != this.f36065w; i14++) {
                            byte[] bArr5 = this.f36063u;
                            if (bArr5[i14] == 10) {
                                int i15 = this.f36064v;
                                if (i14 != i15) {
                                    aVar.write(bArr5, i15, i14 - i15);
                                }
                                this.f36064v = i14 + 1;
                                return aVar.toString();
                            }
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            } else {
                throw new IOException("LineReader is closed");
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        synchronized (this.f36061s) {
            if (this.f36063u != null) {
                this.f36063u = null;
                this.f36061s.close();
            }
        }
    }
}
