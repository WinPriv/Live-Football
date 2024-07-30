package com.anythink.expressad.exoplayer.j;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class j extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    private final h f8808a;

    /* renamed from: b, reason: collision with root package name */
    private final k f8809b;
    private long f;

    /* renamed from: d, reason: collision with root package name */
    private boolean f8811d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f8812e = false;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f8810c = new byte[1];

    public j(h hVar, k kVar) {
        this.f8808a = hVar;
        this.f8809b = kVar;
    }

    private void c() {
        if (!this.f8811d) {
            this.f8808a.a(this.f8809b);
            this.f8811d = true;
        }
    }

    public final long a() {
        return this.f;
    }

    public final void b() {
        c();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.f8812e) {
            this.f8808a.b();
            this.f8812e = true;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        if (read(this.f8810c) == -1) {
            return -1;
        }
        return this.f8810c[0] & DefaultClassResolver.NAME;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        com.anythink.expressad.exoplayer.k.a.b(!this.f8812e);
        c();
        int a10 = this.f8808a.a(bArr, i10, i11);
        if (a10 == -1) {
            return -1;
        }
        this.f += a10;
        return a10;
    }
}
