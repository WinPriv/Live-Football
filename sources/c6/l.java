package c6;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: DataSourceInputStream.java */
/* loaded from: classes2.dex */
public final class l extends InputStream {

    /* renamed from: s, reason: collision with root package name */
    public final j f3371s;

    /* renamed from: t, reason: collision with root package name */
    public final m f3372t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3374v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3375w = false;

    /* renamed from: u, reason: collision with root package name */
    public final byte[] f3373u = new byte[1];

    public l(j jVar, m mVar) {
        this.f3371s = jVar;
        this.f3372t = mVar;
    }

    public final void b() throws IOException {
        if (!this.f3374v) {
            this.f3371s.f(this.f3372t);
            this.f3374v = true;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (!this.f3375w) {
            this.f3371s.close();
            this.f3375w = true;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] bArr = this.f3373u;
        if (read(bArr) == -1) {
            return -1;
        }
        return bArr[0] & DefaultClassResolver.NAME;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        d6.a.d(!this.f3375w);
        b();
        int read = this.f3371s.read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        return read;
    }
}
