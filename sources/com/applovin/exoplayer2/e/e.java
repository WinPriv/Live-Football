package com.applovin.exoplayer2.e;

import com.applovin.exoplayer2.l.ai;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class e implements i {

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.exoplayer2.k.g f14199b;

    /* renamed from: c, reason: collision with root package name */
    private final long f14200c;

    /* renamed from: d, reason: collision with root package name */
    private long f14201d;
    private int f;

    /* renamed from: g, reason: collision with root package name */
    private int f14203g;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f14202e = new byte[com.anythink.expressad.exoplayer.b.aX];

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f14198a = new byte[4096];

    public e(com.applovin.exoplayer2.k.g gVar, long j10, long j11) {
        this.f14199b = gVar;
        this.f14201d = j10;
        this.f14200c = j11;
    }

    private int e(int i10) {
        int min = Math.min(this.f14203g, i10);
        f(min);
        return min;
    }

    private void f(int i10) {
        byte[] bArr;
        int i11 = this.f14203g - i10;
        this.f14203g = i11;
        this.f = 0;
        byte[] bArr2 = this.f14202e;
        if (i11 < bArr2.length - 524288) {
            bArr = new byte[com.anythink.expressad.exoplayer.b.aX + i11];
        } else {
            bArr = bArr2;
        }
        System.arraycopy(bArr2, i10, bArr, 0, i11);
        this.f14202e = bArr;
    }

    private void g(int i10) {
        if (i10 != -1) {
            this.f14201d += i10;
        }
    }

    @Override // com.applovin.exoplayer2.e.i, com.applovin.exoplayer2.k.g
    public int a(byte[] bArr, int i10, int i11) throws IOException {
        int e10 = e(bArr, i10, i11);
        if (e10 == 0) {
            e10 = a(bArr, i10, i11, 0, true);
        }
        g(e10);
        return e10;
    }

    @Override // com.applovin.exoplayer2.e.i
    public void b(byte[] bArr, int i10, int i11) throws IOException {
        a(bArr, i10, i11, false);
    }

    @Override // com.applovin.exoplayer2.e.i
    public int c(byte[] bArr, int i10, int i11) throws IOException {
        int min;
        d(i11);
        int i12 = this.f14203g;
        int i13 = this.f;
        int i14 = i12 - i13;
        if (i14 == 0) {
            min = a(this.f14202e, i13, i11, 0, true);
            if (min == -1) {
                return -1;
            }
            this.f14203g += min;
        } else {
            min = Math.min(i11, i14);
        }
        System.arraycopy(this.f14202e, this.f, bArr, i10, min);
        this.f += min;
        return min;
    }

    @Override // com.applovin.exoplayer2.e.i
    public void d(byte[] bArr, int i10, int i11) throws IOException {
        b(bArr, i10, i11, false);
    }

    @Override // com.applovin.exoplayer2.e.i
    public void b(int i10) throws IOException {
        a(i10, false);
    }

    @Override // com.applovin.exoplayer2.e.i
    public long d() {
        return this.f14200c;
    }

    private void d(int i10) {
        int i11 = this.f + i10;
        byte[] bArr = this.f14202e;
        if (i11 > bArr.length) {
            this.f14202e = Arrays.copyOf(this.f14202e, ai.a(bArr.length * 2, com.anythink.expressad.exoplayer.b.aX + i11, i11 + 524288));
        }
    }

    private int e(byte[] bArr, int i10, int i11) {
        int i12 = this.f14203g;
        if (i12 == 0) {
            return 0;
        }
        int min = Math.min(i12, i11);
        System.arraycopy(this.f14202e, 0, bArr, i10, min);
        f(min);
        return min;
    }

    @Override // com.applovin.exoplayer2.e.i
    public boolean b(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        if (!b(i11, z10)) {
            return false;
        }
        System.arraycopy(this.f14202e, this.f - i11, bArr, i10, i11);
        return true;
    }

    @Override // com.applovin.exoplayer2.e.i
    public boolean a(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        int e10 = e(bArr, i10, i11);
        while (e10 < i11 && e10 != -1) {
            e10 = a(bArr, i10, i11, e10, z10);
        }
        g(e10);
        return e10 != -1;
    }

    @Override // com.applovin.exoplayer2.e.i
    public boolean b(int i10, boolean z10) throws IOException {
        d(i10);
        int i11 = this.f14203g - this.f;
        while (i11 < i10) {
            i11 = a(this.f14202e, this.f, i10, i11, z10);
            if (i11 == -1) {
                return false;
            }
            this.f14203g = this.f + i11;
        }
        this.f += i10;
        return true;
    }

    @Override // com.applovin.exoplayer2.e.i
    public int a(int i10) throws IOException {
        int e10 = e(i10);
        if (e10 == 0) {
            byte[] bArr = this.f14198a;
            e10 = a(bArr, 0, Math.min(i10, bArr.length), 0, true);
        }
        g(e10);
        return e10;
    }

    @Override // com.applovin.exoplayer2.e.i
    public void c(int i10) throws IOException {
        b(i10, false);
    }

    public boolean a(int i10, boolean z10) throws IOException {
        int e10 = e(i10);
        while (e10 < i10 && e10 != -1) {
            e10 = a(this.f14198a, -e10, Math.min(i10, this.f14198a.length + e10), e10, z10);
        }
        g(e10);
        return e10 != -1;
    }

    @Override // com.applovin.exoplayer2.e.i
    public long c() {
        return this.f14201d;
    }

    @Override // com.applovin.exoplayer2.e.i
    public long b() {
        return this.f14201d + this.f;
    }

    @Override // com.applovin.exoplayer2.e.i
    public void a() {
        this.f = 0;
    }

    private int a(byte[] bArr, int i10, int i11, int i12, boolean z10) throws IOException {
        if (!Thread.interrupted()) {
            int a10 = this.f14199b.a(bArr, i10 + i12, i11 - i12);
            if (a10 != -1) {
                return i12 + a10;
            }
            if (i12 == 0 && z10) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedIOException();
    }
}
