package com.applovin.exoplayer2.e.i;

import java.util.Arrays;

/* loaded from: classes.dex */
final class r {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f14818a;

    /* renamed from: b, reason: collision with root package name */
    public int f14819b;

    /* renamed from: c, reason: collision with root package name */
    private final int f14820c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f14821d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f14822e;

    public r(int i10, int i11) {
        this.f14820c = i10;
        byte[] bArr = new byte[i11 + 3];
        this.f14818a = bArr;
        bArr[2] = 1;
    }

    public void a() {
        this.f14821d = false;
        this.f14822e = false;
    }

    public boolean b() {
        return this.f14822e;
    }

    public boolean b(int i10) {
        if (!this.f14821d) {
            return false;
        }
        this.f14819b -= i10;
        this.f14821d = false;
        this.f14822e = true;
        return true;
    }

    public void a(int i10) {
        com.applovin.exoplayer2.l.a.b(!this.f14821d);
        boolean z10 = i10 == this.f14820c;
        this.f14821d = z10;
        if (z10) {
            this.f14819b = 3;
            this.f14822e = false;
        }
    }

    public void a(byte[] bArr, int i10, int i11) {
        if (this.f14821d) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f14818a;
            int length = bArr2.length;
            int i13 = this.f14819b;
            if (length < i13 + i12) {
                this.f14818a = Arrays.copyOf(bArr2, (i13 + i12) * 2);
            }
            System.arraycopy(bArr, i10, this.f14818a, this.f14819b, i12);
            this.f14819b += i12;
        }
    }
}
