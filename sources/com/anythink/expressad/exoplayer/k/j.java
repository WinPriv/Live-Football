package com.anythink.expressad.exoplayer.k;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f9051a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9052b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9053c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9054d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9055e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9056g;

    /* renamed from: h, reason: collision with root package name */
    public final long f9057h;

    private j(byte[] bArr, int i10) {
        r rVar = new r(bArr);
        rVar.a(i10 * 8);
        this.f9051a = rVar.c(16);
        this.f9052b = rVar.c(16);
        this.f9053c = rVar.c(24);
        this.f9054d = rVar.c(24);
        this.f9055e = rVar.c(20);
        this.f = rVar.c(3) + 1;
        this.f9056g = rVar.c(5) + 1;
        this.f9057h = ((rVar.c(4) & 15) << 32) | (rVar.c(32) & 4294967295L);
    }

    private int a() {
        return (this.f9056g / 8) * this.f9052b * this.f;
    }

    private int b() {
        return this.f9056g * this.f9055e;
    }

    private long c() {
        return (this.f9057h * 1000000) / this.f9055e;
    }

    private long d() {
        long j10;
        long j11;
        long j12;
        int i10 = this.f9054d;
        if (i10 > 0) {
            j11 = (i10 + this.f9053c) / 2;
            j12 = 1;
        } else {
            int i11 = this.f9051a;
            if (i11 == this.f9052b && i11 > 0) {
                j10 = i11;
            } else {
                j10 = 4096;
            }
            j11 = ((j10 * this.f) * this.f9056g) / 8;
            j12 = 64;
        }
        return j11 + j12;
    }

    private long a(long j10) {
        return af.a((j10 * this.f9055e) / 1000000, this.f9057h - 1);
    }

    private j(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10) {
        this.f9051a = i10;
        this.f9052b = i11;
        this.f9053c = i12;
        this.f9054d = i13;
        this.f9055e = i14;
        this.f = i15;
        this.f9056g = i16;
        this.f9057h = j10;
    }
}
