package com.anythink.expressad.exoplayer.k;

import com.esotericsoftware.kryo.util.DefaultClassResolver;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f9119a;

    /* renamed from: b, reason: collision with root package name */
    private int f9120b;

    /* renamed from: c, reason: collision with root package name */
    private int f9121c;

    /* renamed from: d, reason: collision with root package name */
    private int f9122d;

    public r() {
    }

    public r(byte[] bArr) {
        this(bArr, bArr.length);
    }

    private void a(byte[] bArr) {
        a(bArr, bArr.length);
    }

    private int f() {
        boolean z10;
        if (this.f9121c == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        a.b(z10);
        return this.f9120b;
    }

    private void g() {
        boolean z10;
        int i10;
        int i11 = this.f9120b;
        if (i11 >= 0 && (i11 < (i10 = this.f9122d) || (i11 == i10 && this.f9121c == 0))) {
            z10 = true;
        } else {
            z10 = false;
        }
        a.b(z10);
    }

    public final int b() {
        return (this.f9120b * 8) + this.f9121c;
    }

    public final void c() {
        int i10 = this.f9121c + 1;
        this.f9121c = i10;
        if (i10 == 8) {
            this.f9121c = 0;
            this.f9120b++;
        }
        g();
    }

    public final boolean d() {
        boolean z10 = (this.f9119a[this.f9120b] & (128 >> this.f9121c)) != 0;
        c();
        return z10;
    }

    public final void e() {
        if (this.f9121c == 0) {
            return;
        }
        this.f9121c = 0;
        this.f9120b++;
        g();
    }

    private r(byte[] bArr, int i10) {
        this.f9119a = bArr;
        this.f9122d = i10;
    }

    private void a(s sVar) {
        a(sVar.f9123a, sVar.b());
        a(sVar.c() * 8);
    }

    public final void b(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f9120b + i11;
        this.f9120b = i12;
        int i13 = (i10 - (i11 * 8)) + this.f9121c;
        this.f9121c = i13;
        if (i13 > 7) {
            this.f9120b = i12 + 1;
            this.f9121c = i13 - 8;
        }
        g();
    }

    public final void d(int i10) {
        int i11 = i10 & 16383;
        int min = Math.min(8 - this.f9121c, 14);
        int i12 = this.f9121c;
        int i13 = (8 - i12) - min;
        byte[] bArr = this.f9119a;
        int i14 = this.f9120b;
        byte b10 = (byte) (((65280 >> i12) | ((1 << i13) - 1)) & bArr[i14]);
        bArr[i14] = b10;
        int i15 = 14 - min;
        bArr[i14] = (byte) (b10 | ((i11 >>> i15) << i13));
        int i16 = i14 + 1;
        while (i15 > 8) {
            this.f9119a[i16] = (byte) (i11 >>> (i15 - 8));
            i15 -= 8;
            i16++;
        }
        int i17 = 8 - i15;
        byte[] bArr2 = this.f9119a;
        byte b11 = (byte) (bArr2[i16] & ((1 << i17) - 1));
        bArr2[i16] = b11;
        bArr2[i16] = (byte) (((i11 & ((1 << i15) - 1)) << i17) | b11);
        b(14);
        g();
    }

    public final void a(byte[] bArr, int i10) {
        this.f9119a = bArr;
        this.f9120b = 0;
        this.f9121c = 0;
        this.f9122d = i10;
    }

    private void e(int i10) {
        a.b(this.f9121c == 0);
        this.f9120b += i10;
        g();
    }

    public final int c(int i10) {
        int i11;
        if (i10 == 0) {
            return 0;
        }
        this.f9121c += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f9121c;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f9121c = i13;
            byte[] bArr = this.f9119a;
            int i14 = this.f9120b;
            this.f9120b = i14 + 1;
            i12 |= (bArr[i14] & DefaultClassResolver.NAME) << i13;
        }
        byte[] bArr2 = this.f9119a;
        int i15 = this.f9120b;
        int i16 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i15] & DefaultClassResolver.NAME) >> (8 - i11)));
        if (i11 == 8) {
            this.f9121c = 0;
            this.f9120b = i15 + 1;
        }
        g();
        return i16;
    }

    private void b(byte[] bArr, int i10, int i11) {
        a.b(this.f9121c == 0);
        System.arraycopy(this.f9119a, this.f9120b, bArr, i10, i11);
        this.f9120b += i11;
        g();
    }

    public final int a() {
        return ((this.f9122d - this.f9120b) * 8) - this.f9121c;
    }

    public final void a(int i10) {
        int i11 = i10 / 8;
        this.f9120b = i11;
        this.f9121c = i10 - (i11 * 8);
        g();
    }

    private void a(byte[] bArr, int i10, int i11) {
        int i12 = (i11 >> 3) + i10;
        while (i10 < i12) {
            byte[] bArr2 = this.f9119a;
            int i13 = this.f9120b;
            int i14 = i13 + 1;
            this.f9120b = i14;
            byte b10 = bArr2[i13];
            int i15 = this.f9121c;
            byte b11 = (byte) (b10 << i15);
            bArr[i10] = b11;
            bArr[i10] = (byte) (((255 & bArr2[i14]) >> (8 - i15)) | b11);
            i10++;
        }
        int i16 = i11 & 7;
        if (i16 == 0) {
            return;
        }
        byte b12 = (byte) (bArr[i12] & (p.f9095b >> i16));
        bArr[i12] = b12;
        int i17 = this.f9121c;
        if (i17 + i16 > 8) {
            byte[] bArr3 = this.f9119a;
            int i18 = this.f9120b;
            this.f9120b = i18 + 1;
            bArr[i12] = (byte) (b12 | ((bArr3[i18] & DefaultClassResolver.NAME) << i17));
            this.f9121c = i17 - 8;
        }
        int i19 = this.f9121c + i16;
        this.f9121c = i19;
        byte[] bArr4 = this.f9119a;
        int i20 = this.f9120b;
        bArr[i12] = (byte) (((byte) (((255 & bArr4[i20]) >> (8 - i19)) << (8 - i16))) | bArr[i12]);
        if (i19 == 8) {
            this.f9121c = 0;
            this.f9120b = i20 + 1;
        }
        g();
    }
}
