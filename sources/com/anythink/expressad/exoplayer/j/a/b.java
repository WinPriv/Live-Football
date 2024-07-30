package com.anythink.expressad.exoplayer.j.a;

import com.anythink.expressad.exoplayer.j.a.a;
import com.anythink.expressad.exoplayer.k.af;
import com.anythink.expressad.exoplayer.k.x;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class b implements com.anythink.expressad.exoplayer.j.g {

    /* renamed from: a, reason: collision with root package name */
    public static final int f8708a = 20480;

    /* renamed from: b, reason: collision with root package name */
    private final com.anythink.expressad.exoplayer.j.a.a f8709b;

    /* renamed from: c, reason: collision with root package name */
    private final long f8710c;

    /* renamed from: d, reason: collision with root package name */
    private final int f8711d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f8712e;
    private com.anythink.expressad.exoplayer.j.k f;

    /* renamed from: g, reason: collision with root package name */
    private File f8713g;

    /* renamed from: h, reason: collision with root package name */
    private OutputStream f8714h;

    /* renamed from: i, reason: collision with root package name */
    private FileOutputStream f8715i;

    /* renamed from: j, reason: collision with root package name */
    private long f8716j;

    /* renamed from: k, reason: collision with root package name */
    private long f8717k;

    /* renamed from: l, reason: collision with root package name */
    private x f8718l;

    /* loaded from: classes.dex */
    public static class a extends a.C0114a {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    public b(com.anythink.expressad.exoplayer.j.a.a aVar) {
        this(aVar, c.f8719a, f8708a, true);
    }

    private void b() {
        long j10 = this.f.f8818g;
        if (j10 != -1) {
            Math.min(j10 - this.f8717k, this.f8710c);
        }
        com.anythink.expressad.exoplayer.j.a.a aVar = this.f8709b;
        com.anythink.expressad.exoplayer.j.k kVar = this.f;
        this.f8713g = aVar.c(kVar.f8819h, kVar.f8817e + this.f8717k);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f8713g);
        this.f8715i = fileOutputStream;
        if (this.f8711d > 0) {
            x xVar = this.f8718l;
            if (xVar == null) {
                this.f8718l = new x(this.f8715i, this.f8711d);
            } else {
                xVar.a(fileOutputStream);
            }
            this.f8714h = this.f8718l;
        } else {
            this.f8714h = fileOutputStream;
        }
        this.f8716j = 0L;
    }

    private void c() {
        OutputStream outputStream = this.f8714h;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            if (this.f8712e) {
                this.f8715i.getFD().sync();
            }
            af.a(this.f8714h);
            this.f8714h = null;
            File file = this.f8713g;
            this.f8713g = null;
            this.f8709b.a(file);
        } catch (Throwable th) {
            af.a(this.f8714h);
            this.f8714h = null;
            File file2 = this.f8713g;
            this.f8713g = null;
            file2.delete();
            throw th;
        }
    }

    @Override // com.anythink.expressad.exoplayer.j.g
    public final void a(com.anythink.expressad.exoplayer.j.k kVar) {
        if (kVar.f8818g == -1 && !kVar.a(2)) {
            this.f = null;
            return;
        }
        this.f = kVar;
        this.f8717k = 0L;
        try {
            b();
        } catch (IOException e10) {
            throw new a(e10);
        }
    }

    private b(com.anythink.expressad.exoplayer.j.a.a aVar, long j10, boolean z10) {
        this(aVar, j10, f8708a, z10);
    }

    private b(com.anythink.expressad.exoplayer.j.a.a aVar, long j10, int i10) {
        this(aVar, j10, i10, true);
    }

    private b(com.anythink.expressad.exoplayer.j.a.a aVar, long j10, int i10, boolean z10) {
        this.f8709b = (com.anythink.expressad.exoplayer.j.a.a) com.anythink.expressad.exoplayer.k.a.a(aVar);
        this.f8710c = j10;
        this.f8711d = i10;
        this.f8712e = z10;
    }

    @Override // com.anythink.expressad.exoplayer.j.g
    public final void a(byte[] bArr, int i10, int i11) {
        if (this.f == null) {
            return;
        }
        int i12 = 0;
        while (i12 < i11) {
            try {
                if (this.f8716j == this.f8710c) {
                    c();
                    b();
                }
                int min = (int) Math.min(i11 - i12, this.f8710c - this.f8716j);
                this.f8714h.write(bArr, i10 + i12, min);
                i12 += min;
                long j10 = min;
                this.f8716j += j10;
                this.f8717k += j10;
            } catch (IOException e10) {
                throw new a(e10);
            }
        }
    }

    @Override // com.anythink.expressad.exoplayer.j.g
    public final void a() {
        if (this.f == null) {
            return;
        }
        try {
            c();
        } catch (IOException e10) {
            throw new a(e10);
        }
    }
}
