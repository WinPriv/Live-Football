package d6;

import com.esotericsoftware.kryo.util.DefaultClassResolver;

/* compiled from: ParsableBitArray.java */
/* loaded from: classes2.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f27378a;

    /* renamed from: b, reason: collision with root package name */
    public int f27379b;

    /* renamed from: c, reason: collision with root package name */
    public int f27380c;

    /* renamed from: d, reason: collision with root package name */
    public int f27381d;

    public v() {
        this.f27378a = g0.f;
    }

    public final void a() {
        boolean z10;
        int i10;
        int i11 = this.f27379b;
        if (i11 >= 0 && (i11 < (i10 = this.f27381d) || (i11 == i10 && this.f27380c == 0))) {
            z10 = true;
        } else {
            z10 = false;
        }
        a.d(z10);
    }

    public final int b() {
        return ((this.f27381d - this.f27379b) * 8) - this.f27380c;
    }

    public final void c() {
        if (this.f27380c == 0) {
            return;
        }
        this.f27380c = 0;
        this.f27379b++;
        a();
    }

    public final int d() {
        boolean z10;
        if (this.f27380c == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        a.d(z10);
        return this.f27379b;
    }

    public final int e() {
        return (this.f27379b * 8) + this.f27380c;
    }

    public final boolean f() {
        boolean z10;
        if ((this.f27378a[this.f27379b] & (128 >> this.f27380c)) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        l();
        return z10;
    }

    public final int g(int i10) {
        int i11;
        if (i10 == 0) {
            return 0;
        }
        this.f27380c += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f27380c;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f27380c = i13;
            byte[] bArr = this.f27378a;
            int i14 = this.f27379b;
            this.f27379b = i14 + 1;
            i12 |= (bArr[i14] & DefaultClassResolver.NAME) << i13;
        }
        byte[] bArr2 = this.f27378a;
        int i15 = this.f27379b;
        int i16 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i15] & DefaultClassResolver.NAME) >> (8 - i11)));
        if (i11 == 8) {
            this.f27380c = 0;
            this.f27379b = i15 + 1;
        }
        a();
        return i16;
    }

    public final void h(byte[] bArr, int i10) {
        int i11 = (i10 >> 3) + 0;
        for (int i12 = 0; i12 < i11; i12++) {
            byte[] bArr2 = this.f27378a;
            int i13 = this.f27379b;
            int i14 = i13 + 1;
            this.f27379b = i14;
            byte b10 = bArr2[i13];
            int i15 = this.f27380c;
            byte b11 = (byte) (b10 << i15);
            bArr[i12] = b11;
            bArr[i12] = (byte) (((255 & bArr2[i14]) >> (8 - i15)) | b11);
        }
        int i16 = i10 & 7;
        if (i16 == 0) {
            return;
        }
        byte b12 = (byte) (bArr[i11] & (com.anythink.expressad.exoplayer.k.p.f9095b >> i16));
        bArr[i11] = b12;
        int i17 = this.f27380c;
        if (i17 + i16 > 8) {
            byte[] bArr3 = this.f27378a;
            int i18 = this.f27379b;
            this.f27379b = i18 + 1;
            bArr[i11] = (byte) (b12 | ((bArr3[i18] & DefaultClassResolver.NAME) << i17));
            this.f27380c = i17 - 8;
        }
        int i19 = this.f27380c + i16;
        this.f27380c = i19;
        byte[] bArr4 = this.f27378a;
        int i20 = this.f27379b;
        bArr[i11] = (byte) (((byte) (((255 & bArr4[i20]) >> (8 - i19)) << (8 - i16))) | bArr[i11]);
        if (i19 == 8) {
            this.f27380c = 0;
            this.f27379b = i20 + 1;
        }
        a();
    }

    public final void i(byte[] bArr, int i10) {
        boolean z10;
        if (this.f27380c == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        a.d(z10);
        System.arraycopy(this.f27378a, this.f27379b, bArr, 0, i10);
        this.f27379b += i10;
        a();
    }

    public final void j(int i10, byte[] bArr) {
        this.f27378a = bArr;
        this.f27379b = 0;
        this.f27380c = 0;
        this.f27381d = i10;
    }

    public final void k(int i10) {
        int i11 = i10 / 8;
        this.f27379b = i11;
        this.f27380c = i10 - (i11 * 8);
        a();
    }

    public final void l() {
        int i10 = this.f27380c + 1;
        this.f27380c = i10;
        if (i10 == 8) {
            this.f27380c = 0;
            this.f27379b++;
        }
        a();
    }

    public final void m(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f27379b + i11;
        this.f27379b = i12;
        int i13 = (i10 - (i11 * 8)) + this.f27380c;
        this.f27380c = i13;
        if (i13 > 7) {
            this.f27379b = i12 + 1;
            this.f27380c = i13 - 8;
        }
        a();
    }

    public final void n(int i10) {
        boolean z10;
        if (this.f27380c == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        a.d(z10);
        this.f27379b += i10;
        a();
    }

    public v(byte[] bArr, int i10) {
        this.f27378a = bArr;
        this.f27381d = i10;
    }
}
