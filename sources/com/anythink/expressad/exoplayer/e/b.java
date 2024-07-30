package com.anythink.expressad.exoplayer.e;

import com.anythink.expressad.exoplayer.k.af;
import java.io.EOFException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements f {

    /* renamed from: a, reason: collision with root package name */
    private static final int f7930a = 65536;

    /* renamed from: b, reason: collision with root package name */
    private static final int f7931b = 524288;

    /* renamed from: c, reason: collision with root package name */
    private static final int f7932c = 4096;

    /* renamed from: e, reason: collision with root package name */
    private final com.anythink.expressad.exoplayer.j.h f7934e;
    private final long f;

    /* renamed from: g, reason: collision with root package name */
    private long f7935g;

    /* renamed from: i, reason: collision with root package name */
    private int f7937i;

    /* renamed from: j, reason: collision with root package name */
    private int f7938j;

    /* renamed from: h, reason: collision with root package name */
    private byte[] f7936h = new byte[65536];

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f7933d = new byte[f7932c];

    public b(com.anythink.expressad.exoplayer.j.h hVar, long j10, long j11) {
        this.f7934e = hVar;
        this.f7935g = j10;
        this.f = j11;
    }

    private void f(int i10) {
        int i11 = this.f7937i + i10;
        byte[] bArr = this.f7936h;
        if (i11 > bArr.length) {
            this.f7936h = Arrays.copyOf(this.f7936h, af.a(bArr.length * 2, 65536 + i11, i11 + f7931b));
        }
    }

    private int g(int i10) {
        int min = Math.min(this.f7938j, i10);
        h(min);
        return min;
    }

    private void h(int i10) {
        byte[] bArr;
        int i11 = this.f7938j - i10;
        this.f7938j = i11;
        this.f7937i = 0;
        byte[] bArr2 = this.f7936h;
        if (i11 < bArr2.length - f7931b) {
            bArr = new byte[65536 + i11];
        } else {
            bArr = bArr2;
        }
        System.arraycopy(bArr2, i10, bArr, 0, i11);
        this.f7936h = bArr;
    }

    private void i(int i10) {
        if (i10 != -1) {
            this.f7935g += i10;
        }
    }

    @Override // com.anythink.expressad.exoplayer.e.f
    public final int a(byte[] bArr, int i10, int i11) {
        int e10 = e(bArr, i10, i11);
        if (e10 == 0) {
            e10 = a(bArr, i10, i11, 0, true);
        }
        i(e10);
        return e10;
    }

    @Override // com.anythink.expressad.exoplayer.e.f
    public final void b(byte[] bArr, int i10, int i11) {
        a(bArr, i10, i11, false);
    }

    @Override // com.anythink.expressad.exoplayer.e.f
    public final boolean c(byte[] bArr, int i10, int i11) {
        if (!d(i11)) {
            return false;
        }
        System.arraycopy(this.f7936h, this.f7937i - i11, bArr, i10, i11);
        return true;
    }

    @Override // com.anythink.expressad.exoplayer.e.f
    public final boolean d(int i10) {
        f(i10);
        int min = Math.min(this.f7938j - this.f7937i, i10);
        while (min < i10) {
            min = a(this.f7936h, this.f7937i, i10, min, false);
            if (min == -1) {
                return false;
            }
        }
        int i11 = this.f7937i + i10;
        this.f7937i = i11;
        this.f7938j = Math.max(this.f7938j, i11);
        return true;
    }

    @Override // com.anythink.expressad.exoplayer.e.f
    public final void e(int i10) {
        d(i10);
    }

    private int e(byte[] bArr, int i10, int i11) {
        int i12 = this.f7938j;
        if (i12 == 0) {
            return 0;
        }
        int min = Math.min(i12, i11);
        System.arraycopy(this.f7936h, 0, bArr, i10, min);
        h(min);
        return min;
    }

    @Override // com.anythink.expressad.exoplayer.e.f
    public final boolean b(int i10) {
        int g6 = g(i10);
        while (g6 < i10 && g6 != -1) {
            g6 = a(this.f7933d, -g6, Math.min(i10, this.f7933d.length + g6), g6, false);
        }
        i(g6);
        return g6 != -1;
    }

    @Override // com.anythink.expressad.exoplayer.e.f
    public final long c() {
        return this.f7935g;
    }

    @Override // com.anythink.expressad.exoplayer.e.f
    public final boolean a(byte[] bArr, int i10, int i11, boolean z10) {
        int e10 = e(bArr, i10, i11);
        while (e10 < i11 && e10 != -1) {
            e10 = a(bArr, i10, i11, e10, z10);
        }
        i(e10);
        return e10 != -1;
    }

    @Override // com.anythink.expressad.exoplayer.e.f
    public final void c(int i10) {
        int g6 = g(i10);
        while (g6 < i10 && g6 != -1) {
            g6 = a(this.f7933d, -g6, Math.min(i10, this.f7933d.length + g6), g6, false);
        }
        i(g6);
    }

    @Override // com.anythink.expressad.exoplayer.e.f
    public final long d() {
        return this.f;
    }

    @Override // com.anythink.expressad.exoplayer.e.f
    public final int a(int i10) {
        int g6 = g(i10);
        if (g6 == 0) {
            byte[] bArr = this.f7933d;
            g6 = a(bArr, 0, Math.min(i10, bArr.length), 0, true);
        }
        i(g6);
        return g6;
    }

    @Override // com.anythink.expressad.exoplayer.e.f
    public final long b() {
        return this.f7935g + this.f7937i;
    }

    @Override // com.anythink.expressad.exoplayer.e.f
    public final void d(byte[] bArr, int i10, int i11) {
        if (d(i11)) {
            System.arraycopy(this.f7936h, this.f7937i - i11, bArr, i10, i11);
        }
    }

    @Override // com.anythink.expressad.exoplayer.e.f
    public final void a() {
        this.f7937i = 0;
    }

    @Override // com.anythink.expressad.exoplayer.e.f
    public final <E extends Throwable> void a(long j10, E e10) {
        com.anythink.expressad.exoplayer.k.a.a(j10 >= 0);
        this.f7935g = j10;
        throw e10;
    }

    private int a(byte[] bArr, int i10, int i11, int i12, boolean z10) {
        if (!Thread.interrupted()) {
            int a10 = this.f7934e.a(bArr, i10 + i12, i11 - i12);
            if (a10 != -1) {
                return i12 + a10;
            }
            if (i12 == 0 && z10) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedException();
    }
}
