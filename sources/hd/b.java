package hd;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f28832a;

    /* renamed from: b, reason: collision with root package name */
    public int f28833b;

    public b() {
        this.f28832a = new byte[64];
    }

    public final void a(int i10) {
        byte[] bArr = this.f28832a;
        int length = bArr.length * 2;
        int i11 = this.f28833b;
        int i12 = i10 + i11;
        if (length <= i12) {
            length = i12;
        }
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, i11);
        this.f28832a = bArr2;
    }

    public final void b(int i10, int i11) {
        int i12 = this.f28833b;
        if (i12 + 2 > this.f28832a.length) {
            a(2);
        }
        byte[] bArr = this.f28832a;
        int i13 = i12 + 1;
        bArr[i12] = (byte) i10;
        bArr[i13] = (byte) i11;
        this.f28833b = i13 + 1;
    }

    public final void c(int i10, int i11) {
        int i12 = this.f28833b;
        if (i12 + 3 > this.f28832a.length) {
            a(3);
        }
        byte[] bArr = this.f28832a;
        int i13 = i12 + 1;
        bArr[i12] = (byte) i10;
        int i14 = i13 + 1;
        bArr[i13] = (byte) (i11 >>> 8);
        bArr[i14] = (byte) i11;
        this.f28833b = i14 + 1;
    }

    public final void d(int i10, int i11, String str) {
        int i12;
        int length = str.length();
        int i13 = i10;
        int i14 = i13;
        while (i13 < length) {
            char charAt = str.charAt(i13);
            if (charAt >= 1 && charAt <= 127) {
                i14++;
            } else if (charAt > 2047) {
                i14 += 3;
            } else {
                i14 += 2;
            }
            i13++;
        }
        if (i14 <= i11) {
            int i15 = this.f28833b;
            int i16 = (i15 - i10) - 2;
            if (i16 >= 0) {
                byte[] bArr = this.f28832a;
                bArr[i16] = (byte) (i14 >>> 8);
                bArr[i16 + 1] = (byte) i14;
            }
            if ((i15 + i14) - i10 > this.f28832a.length) {
                a(i14 - i10);
            }
            int i17 = this.f28833b;
            while (i10 < length) {
                char charAt2 = str.charAt(i10);
                if (charAt2 >= 1 && charAt2 <= 127) {
                    i12 = i17 + 1;
                    this.f28832a[i17] = (byte) charAt2;
                } else {
                    byte[] bArr2 = this.f28832a;
                    int i18 = i17 + 1;
                    if (charAt2 > 2047) {
                        bArr2[i17] = (byte) (((charAt2 >> '\f') & 15) | 224);
                        int i19 = i18 + 1;
                        bArr2[i18] = (byte) (((charAt2 >> 6) & 63) | 128);
                        i12 = i19 + 1;
                        bArr2[i19] = (byte) ((charAt2 & '?') | 128);
                    } else {
                        bArr2[i17] = (byte) (((charAt2 >> 6) & 31) | 192);
                        i17 = i18 + 1;
                        bArr2[i18] = (byte) ((charAt2 & '?') | 128);
                        i10++;
                    }
                }
                i17 = i12;
                i10++;
            }
            this.f28833b = i17;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final void e(int i10) {
        int i11 = this.f28833b;
        int i12 = i11 + 1;
        if (i12 > this.f28832a.length) {
            a(1);
        }
        this.f28832a[i11] = (byte) i10;
        this.f28833b = i12;
    }

    public final void f(byte[] bArr, int i10, int i11) {
        if (this.f28833b + i11 > this.f28832a.length) {
            a(i11);
        }
        if (bArr != null) {
            System.arraycopy(bArr, i10, this.f28832a, this.f28833b, i11);
        }
        this.f28833b += i11;
    }

    public final void g(int i10) {
        int i11 = this.f28833b;
        if (i11 + 4 > this.f28832a.length) {
            a(4);
        }
        byte[] bArr = this.f28832a;
        int i12 = i11 + 1;
        bArr[i11] = (byte) (i10 >>> 24);
        int i13 = i12 + 1;
        bArr[i12] = (byte) (i10 >>> 16);
        int i14 = i13 + 1;
        bArr[i13] = (byte) (i10 >>> 8);
        bArr[i14] = (byte) i10;
        this.f28833b = i14 + 1;
    }

    public final void h(long j10) {
        int i10 = this.f28833b;
        if (i10 + 8 > this.f28832a.length) {
            a(8);
        }
        byte[] bArr = this.f28832a;
        int i11 = (int) (j10 >>> 32);
        int i12 = i10 + 1;
        bArr[i10] = (byte) (i11 >>> 24);
        int i13 = i12 + 1;
        bArr[i12] = (byte) (i11 >>> 16);
        int i14 = i13 + 1;
        bArr[i13] = (byte) (i11 >>> 8);
        int i15 = i14 + 1;
        bArr[i14] = (byte) i11;
        int i16 = (int) j10;
        int i17 = i15 + 1;
        bArr[i15] = (byte) (i16 >>> 24);
        int i18 = i17 + 1;
        bArr[i17] = (byte) (i16 >>> 16);
        int i19 = i18 + 1;
        bArr[i18] = (byte) (i16 >>> 8);
        bArr[i19] = (byte) i16;
        this.f28833b = i19 + 1;
    }

    public final void i(int i10) {
        int i11 = this.f28833b;
        if (i11 + 2 > this.f28832a.length) {
            a(2);
        }
        byte[] bArr = this.f28832a;
        int i12 = i11 + 1;
        bArr[i11] = (byte) (i10 >>> 8);
        bArr[i12] = (byte) i10;
        this.f28833b = i12 + 1;
    }

    public b(int i10) {
        this.f28832a = new byte[i10];
    }
}
