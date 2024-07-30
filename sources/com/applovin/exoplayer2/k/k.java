package com.applovin.exoplayer2.k;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class k extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    private final i f16090a;

    /* renamed from: b, reason: collision with root package name */
    private final l f16091b;
    private long f;

    /* renamed from: d, reason: collision with root package name */
    private boolean f16093d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f16094e = false;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f16092c = new byte[1];

    public k(i iVar, l lVar) {
        this.f16090a = iVar;
        this.f16091b = lVar;
    }

    private void a() throws IOException {
        if (!this.f16093d) {
            this.f16090a.a(this.f16091b);
            this.f16093d = true;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.f16094e) {
            this.f16090a.c();
            this.f16094e = true;
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.f16092c) == -1) {
            return -1;
        }
        return this.f16092c[0] & DefaultClassResolver.NAME;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        com.applovin.exoplayer2.l.a.b(!this.f16094e);
        a();
        int a10 = this.f16090a.a(bArr, i10, i11);
        if (a10 == -1) {
            return -1;
        }
        this.f += a10;
        return a10;
    }
}
